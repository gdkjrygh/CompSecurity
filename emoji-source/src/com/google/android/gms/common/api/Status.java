// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.hk;

// Referenced classes of package com.google.android.gms.common.api:
//            Result, StatusCreator, CommonStatusCodes

public final class Status
    implements Result, SafeParcelable
{

    public static final StatusCreator CREATOR = new StatusCreator();
    public static final Status En = new Status(0);
    public static final Status Eo = new Status(14);
    public static final Status Ep = new Status(8);
    public static final Status Eq = new Status(15);
    public static final Status Er = new Status(16);
    private final int CT;
    private final String Es;
    private final PendingIntent mPendingIntent;
    private final int xM;

    public Status(int i)
    {
        this(1, i, null, null);
    }

    Status(int i, int j, String s, PendingIntent pendingintent)
    {
        xM = i;
        CT = j;
        Es = s;
        mPendingIntent = pendingintent;
    }

    public Status(int i, String s, PendingIntent pendingintent)
    {
        this(1, i, s, pendingintent);
    }

    private String ex()
    {
        if (Es != null)
        {
            return Es;
        } else
        {
            return CommonStatusCodes.getStatusCodeString(CT);
        }
    }

    public int describeContents()
    {
        return 0;
    }

    PendingIntent eQ()
    {
        return mPendingIntent;
    }

    public ConnectionResult eR()
    {
        return new ConnectionResult(CT, mPendingIntent);
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof Status)
        {
            if (xM == ((Status) (obj = (Status)obj)).xM && CT == ((Status) (obj)).CT && hk.equal(Es, ((Status) (obj)).Es) && hk.equal(mPendingIntent, ((Status) (obj)).mPendingIntent))
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
        return CT;
    }

    public String getStatusMessage()
    {
        return Es;
    }

    int getVersionCode()
    {
        return xM;
    }

    public boolean hasResolution()
    {
        return mPendingIntent != null;
    }

    public int hashCode()
    {
        return hk.hashCode(new Object[] {
            Integer.valueOf(xM), Integer.valueOf(CT), Es, mPendingIntent
        });
    }

    public boolean isCanceled()
    {
        return CT == 16;
    }

    public boolean isInterrupted()
    {
        return CT == 14;
    }

    public boolean isSuccess()
    {
        return CT <= 0;
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
        return hk.e(this).a("statusCode", ex()).a("resolution", mPendingIntent).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        StatusCreator.a(this, parcel, i);
    }

}
