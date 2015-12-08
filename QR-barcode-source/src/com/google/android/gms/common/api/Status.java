// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.common.api:
//            Result, StatusCreator, CommonStatusCodes

public final class Status
    implements Result, SafeParcelable
{

    public static final StatusCreator CREATOR = new StatusCreator();
    public static final Status Jv = new Status(0);
    public static final Status Jw = new Status(14);
    public static final Status Jx = new Status(8);
    public static final Status Jy = new Status(15);
    public static final Status Jz = new Status(16);
    private final int BR;
    private final int HF;
    private final String JA;
    private final PendingIntent mPendingIntent;

    public Status(int i)
    {
        this(i, null);
    }

    Status(int i, int j, String s, PendingIntent pendingintent)
    {
        BR = i;
        HF = j;
        JA = s;
        mPendingIntent = pendingintent;
    }

    public Status(int i, String s)
    {
        this(1, i, s, null);
    }

    public Status(int i, String s, PendingIntent pendingintent)
    {
        this(1, i, s, pendingintent);
    }

    private String fX()
    {
        if (JA != null)
        {
            return JA;
        } else
        {
            return CommonStatusCodes.getStatusCodeString(HF);
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof Status)
        {
            if (BR == ((Status) (obj = (Status)obj)).BR && HF == ((Status) (obj)).HF && n.equal(JA, ((Status) (obj)).JA) && n.equal(mPendingIntent, ((Status) (obj)).mPendingIntent))
            {
                return true;
            }
        }
        return false;
    }

    PendingIntent getPendingIntent()
    {
        return mPendingIntent;
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
        return HF;
    }

    public String getStatusMessage()
    {
        return JA;
    }

    int getVersionCode()
    {
        return BR;
    }

    public ConnectionResult gt()
    {
        return new ConnectionResult(HF, mPendingIntent);
    }

    public boolean hasResolution()
    {
        return mPendingIntent != null;
    }

    public int hashCode()
    {
        return n.hashCode(new Object[] {
            Integer.valueOf(BR), Integer.valueOf(HF), JA, mPendingIntent
        });
    }

    public boolean isCanceled()
    {
        return HF == 16;
    }

    public boolean isInterrupted()
    {
        return HF == 14;
    }

    public boolean isSuccess()
    {
        return HF <= 0;
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
        return n.h(this).a("statusCode", fX()).a("resolution", mPendingIntent).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        StatusCreator.a(this, parcel, i);
    }

}
