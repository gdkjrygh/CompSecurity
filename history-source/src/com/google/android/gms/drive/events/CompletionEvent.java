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
import com.google.android.gms.drive.internal.ah;
import com.google.android.gms.drive.internal.w;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.internal.lh;
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
    public static final int STATUS_CANCELED = 3;
    public static final int STATUS_CONFLICT = 2;
    public static final int STATUS_FAILURE = 1;
    public static final int STATUS_SUCCESS = 0;
    final int CK;
    final String DZ;
    final int FP;
    final ParcelFileDescriptor OY;
    final ParcelFileDescriptor OZ;
    final DriveId Oj;
    final MetadataBundle Pa;
    final List Pb;
    final IBinder Pc;
    private boolean Pd;
    private boolean Pe;
    private boolean Pf;

    CompletionEvent(int i, DriveId driveid, String s, ParcelFileDescriptor parcelfiledescriptor, ParcelFileDescriptor parcelfiledescriptor1, MetadataBundle metadatabundle, List list, 
            int j, IBinder ibinder)
    {
        Pd = false;
        Pe = false;
        Pf = false;
        CK = i;
        Oj = driveid;
        DZ = s;
        OY = parcelfiledescriptor;
        OZ = parcelfiledescriptor1;
        Pa = metadatabundle;
        Pb = list;
        FP = j;
        Pc = ibinder;
    }

    private void M(boolean flag)
    {
        iC();
        Pf = true;
        lh.a(OY);
        lh.a(OZ);
        if (Pc == null)
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
            w.p("CompletionEvent", stringbuilder.append(s).toString());
            return;
        }
        try
        {
            com.google.android.gms.drive.internal.ah.a.aa(Pc).M(flag);
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
            w.p("CompletionEvent", stringbuilder1.append(s1).append(": ").append(remoteexception).toString());
            return;
        }
    }

    private void iC()
    {
        if (Pf)
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
        M(false);
    }

    public String getAccountName()
    {
        iC();
        return DZ;
    }

    public InputStream getBaseContentsInputStream()
    {
        iC();
        if (OY == null)
        {
            return null;
        }
        if (Pd)
        {
            throw new IllegalStateException("getBaseInputStream() can only be called once per CompletionEvent instance.");
        } else
        {
            Pd = true;
            return new FileInputStream(OY.getFileDescriptor());
        }
    }

    public DriveId getDriveId()
    {
        iC();
        return Oj;
    }

    public InputStream getModifiedContentsInputStream()
    {
        iC();
        if (OZ == null)
        {
            return null;
        }
        if (Pe)
        {
            throw new IllegalStateException("getModifiedInputStream() can only be called once per CompletionEvent instance.");
        } else
        {
            Pe = true;
            return new FileInputStream(OZ.getFileDescriptor());
        }
    }

    public MetadataChangeSet getModifiedMetadataChangeSet()
    {
        iC();
        if (Pa != null)
        {
            return new MetadataChangeSet(Pa);
        } else
        {
            return null;
        }
    }

    public int getStatus()
    {
        iC();
        return FP;
    }

    public List getTrackingTags()
    {
        iC();
        return new ArrayList(Pb);
    }

    public int getType()
    {
        return 2;
    }

    public void snooze()
    {
        M(true);
    }

    public String toString()
    {
        String s;
        if (Pb == null)
        {
            s = "<null>";
        } else
        {
            s = (new StringBuilder()).append("'").append(TextUtils.join("','", Pb)).append("'").toString();
        }
        return String.format(Locale.US, "CompletionEvent [id=%s, status=%s, trackingTag=%s]", new Object[] {
            Oj, Integer.valueOf(FP), s
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        b.a(this, parcel, i);
    }

}
