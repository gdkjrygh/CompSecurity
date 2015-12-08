// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.fo;

// Referenced classes of package com.google.android.gms.common.api:
//            Result, StatusCreator, CommonStatusCodes

public final class Status
    implements Result, SafeParcelable
{

    public static final Status Bv = new Status(0);
    public static final Status Bw = new Status(14);
    public static final Status Bx = new Status(8);
    public static final Status By = new Status(15);
    public static final Status Bz = new Status(16);
    public static final StatusCreator CREATOR = new StatusCreator();
    private final int Ah;
    private final String BA;
    private final PendingIntent mPendingIntent;
    private final int xH;

    public Status(int i)
    {
        this(1, i, null, null);
    }

    Status(int i, int j, String s, PendingIntent pendingintent)
    {
        xH = i;
        Ah = j;
        BA = s;
        mPendingIntent = pendingintent;
    }

    public Status(int i, String s, PendingIntent pendingintent)
    {
        this(1, i, s, pendingintent);
    }

    private String dW()
    {
        if (BA != null)
        {
            return BA;
        } else
        {
            return CommonStatusCodes.getStatusCodeString(Ah);
        }
    }

    public int describeContents()
    {
        return 0;
    }

    PendingIntent eo()
    {
        return mPendingIntent;
    }

    String ep()
    {
        return BA;
    }

    public ConnectionResult eq()
    {
        return new ConnectionResult(Ah, mPendingIntent);
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof Status)
        {
            if (xH == ((Status) (obj = (Status)obj)).xH && Ah == ((Status) (obj)).Ah && fo.equal(BA, ((Status) (obj)).BA) && fo.equal(mPendingIntent, ((Status) (obj)).mPendingIntent))
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
        return Ah;
    }

    int getVersionCode()
    {
        return xH;
    }

    public boolean hasResolution()
    {
        return mPendingIntent != null;
    }

    public int hashCode()
    {
        return fo.hashCode(new Object[] {
            Integer.valueOf(xH), Integer.valueOf(Ah), BA, mPendingIntent
        });
    }

    public boolean isCanceled()
    {
        return Ah == 16;
    }

    public boolean isInterrupted()
    {
        return Ah == 14;
    }

    public boolean isSuccess()
    {
        return Ah <= 0;
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
        return fo.e(this).a("statusCode", dW()).a("resolution", mPendingIntent).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        StatusCreator.a(this, parcel, i);
    }

}
