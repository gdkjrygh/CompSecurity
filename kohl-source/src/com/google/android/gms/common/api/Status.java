// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.hl;

// Referenced classes of package com.google.android.gms.common.api:
//            Result, StatusCreator, CommonStatusCodes

public final class Status
    implements Result, SafeParcelable
{

    public static final StatusCreator CREATOR = new StatusCreator();
    public static final Status Ek = new Status(0);
    public static final Status El = new Status(14);
    public static final Status Em = new Status(8);
    public static final Status En = new Status(15);
    public static final Status Eo = new Status(16);
    private final int CQ;
    private final String Ep;
    private final PendingIntent mPendingIntent;
    private final int xJ;

    public Status(int i)
    {
        this(1, i, null, null);
    }

    Status(int i, int j, String s, PendingIntent pendingintent)
    {
        xJ = i;
        CQ = j;
        Ep = s;
        mPendingIntent = pendingintent;
    }

    public Status(int i, String s, PendingIntent pendingintent)
    {
        this(1, i, s, pendingintent);
    }

    private String es()
    {
        if (Ep != null)
        {
            return Ep;
        } else
        {
            return CommonStatusCodes.getStatusCodeString(CQ);
        }
    }

    public int describeContents()
    {
        return 0;
    }

    PendingIntent eL()
    {
        return mPendingIntent;
    }

    public ConnectionResult eM()
    {
        return new ConnectionResult(CQ, mPendingIntent);
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof Status)
        {
            if (xJ == ((Status) (obj = (Status)obj)).xJ && CQ == ((Status) (obj)).CQ && hl.equal(Ep, ((Status) (obj)).Ep) && hl.equal(mPendingIntent, ((Status) (obj)).mPendingIntent))
            {
                return true;
            }
        }
        return false;
    }

    public PendingIntent getResolution()
    {
        return mPendingIntent;
    }

    public Status getStatus()
    {
        return this;
    }

    public int getStatusCode()
    {
        return CQ;
    }

    public String getStatusMessage()
    {
        return Ep;
    }

    int getVersionCode()
    {
        return xJ;
    }

    public boolean hasResolution()
    {
        return mPendingIntent != null;
    }

    public int hashCode()
    {
        return hl.hashCode(new Object[] {
            Integer.valueOf(xJ), Integer.valueOf(CQ), Ep, mPendingIntent
        });
    }

    public boolean isCanceled()
    {
        return CQ == 16;
    }

    public boolean isInterrupted()
    {
        return CQ == 14;
    }

    public boolean isSuccess()
    {
        return CQ <= 0;
    }

    public void startResolutionForResult(Activity activity, int i)
        throws android.content.IntentSender.SendIntentException
    {
        if (!hasResolution())
        {
            return;
        } else
        {
            activity.startIntentSenderForResult(mPendingIntent.getIntentSender(), i, null, 0, 0, 0);
            return;
        }
    }

    public String toString()
    {
        return hl.e(this).a("statusCode", es()).a("resolution", mPendingIntent).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        StatusCreator.a(this, parcel, i);
    }

}
