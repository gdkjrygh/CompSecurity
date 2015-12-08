// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.events;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.MetadataChangeSet;
import com.google.android.gms.drive.internal.ae;
import com.google.android.gms.drive.internal.v;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.internal.jy;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.drive.events:
//            ResourceEvent, b

public final class CompletionEvent
    implements SafeParcelable, ResourceEvent
{

    public static final android.os.Parcelable.Creator CREATOR = new b();
    public static final int STATUS_CONFLICT = 2;
    public static final int STATUS_FAILURE = 1;
    public static final int STATUS_SUCCESS = 0;
    final int BR;
    final String Dd;
    final int Fa;
    final DriveId MW;
    final ParcelFileDescriptor NN;
    final ParcelFileDescriptor NO;
    final MetadataBundle NP;
    final ArrayList NQ;
    final IBinder NR;
    private boolean NS;
    private boolean NT;
    private boolean NU;

    CompletionEvent(int i, DriveId driveid, String s, ParcelFileDescriptor parcelfiledescriptor, ParcelFileDescriptor parcelfiledescriptor1, MetadataBundle metadatabundle, ArrayList arraylist, 
            int j, IBinder ibinder)
    {
        NS = false;
        NT = false;
        NU = false;
        BR = i;
        MW = driveid;
        Dd = s;
        NN = parcelfiledescriptor;
        NO = parcelfiledescriptor1;
        NP = metadatabundle;
        NQ = arraylist;
        Fa = j;
        NR = ibinder;
    }

    private void L(boolean flag)
    {
        hU();
        NU = true;
        jy.a(NN);
        jy.a(NO);
        if (NR == null)
        {
            StringBuilder stringbuilder = (new StringBuilder()).append("No callback on ");
            String s;
            if (flag)
            {
                s = "snooze";
            } else
            {
                s = "dismiss";
            }
            v.q("CompletionEvent", stringbuilder.append(s).toString());
            return;
        }
        try
        {
            com.google.android.gms.drive.internal.ae.a.X(NR).L(flag);
            return;
        }
        catch (RemoteException remoteexception)
        {
            StringBuilder stringbuilder1 = (new StringBuilder()).append("RemoteException on ");
            String s1;
            if (flag)
            {
                s1 = "snooze";
            } else
            {
                s1 = "dismiss";
            }
            v.q("CompletionEvent", stringbuilder1.append(s1).append(": ").append(remoteexception).toString());
            return;
        }
    }

    private void hU()
    {
        if (NU)
        {
            throw new IllegalStateException("Event has already been dismissed or snoozed.");
        } else
        {
            return;
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public void dismiss()
    {
        L(false);
    }

    public String getAccountName()
    {
        hU();
        return Dd;
    }

    public InputStream getBaseContentsInputStream()
    {
        hU();
        if (NN == null)
        {
            return null;
        }
        if (NS)
        {
            throw new IllegalStateException("getBaseInputStream() can only be called once per CompletionEvent instance.");
        } else
        {
            NS = true;
            return new FileInputStream(NN.getFileDescriptor());
        }
    }

    public DriveId getDriveId()
    {
        hU();
        return MW;
    }

    public InputStream getModifiedContentsInputStream()
    {
        hU();
        if (NO == null)
        {
            return null;
        }
        if (NT)
        {
            throw new IllegalStateException("getModifiedInputStream() can only be called once per CompletionEvent instance.");
        } else
        {
            NT = true;
            return new FileInputStream(NO.getFileDescriptor());
        }
    }

    public MetadataChangeSet getModifiedMetadataChangeSet()
    {
        hU();
        if (NP != null)
        {
            return new MetadataChangeSet(NP);
        } else
        {
            return null;
        }
    }

    public int getStatus()
    {
        hU();
        return Fa;
    }

    public List getTrackingTags()
    {
        hU();
        return new ArrayList(NQ);
    }

    public int getType()
    {
        return 2;
    }

    public void snooze()
    {
        L(true);
    }

    public String toString()
    {
        String s;
        if (NQ == null)
        {
            s = "<null>";
        } else
        {
            s = (new StringBuilder()).append("'").append(TextUtils.join("','", NQ)).append("'").toString();
        }
        return String.format(Locale.US, "CompletionEvent [id=%s, status=%s, trackingTag=%s]", new Object[] {
            MW, Integer.valueOf(Fa), s
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        b.a(this, parcel, i);
    }

}
