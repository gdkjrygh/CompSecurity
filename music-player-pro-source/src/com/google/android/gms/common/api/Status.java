// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jv;

// Referenced classes of package com.google.android.gms.common.api:
//            Result, StatusCreator, CommonStatusCodes

public final class Status
    implements Result, SafeParcelable
{

    public static final StatusCreator CREATOR = new StatusCreator();
    public static final Status KA = new Status(16);
    public static final Status Kw = new Status(0);
    public static final Status Kx = new Status(14);
    public static final Status Ky = new Status(8);
    public static final Status Kz = new Status(15);
    private final int CK;
    private final int Iv;
    private final String KB;
    private final PendingIntent mPendingIntent;

    public Status(int i)
    {
        this(i, null);
    }

    Status(int i, int j, String s, PendingIntent pendingintent)
    {
        CK = i;
        Iv = j;
        KB = s;
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

    private String gt()
    {
        if (KB != null)
        {
            return KB;
        } else
        {
            return CommonStatusCodes.getStatusCodeString(Iv);
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
            if (CK == ((Status) (obj = (Status)obj)).CK && Iv == ((Status) (obj)).Iv && jv.equal(KB, ((Status) (obj)).KB) && jv.equal(mPendingIntent, ((Status) (obj)).mPendingIntent))
            {
                return true;
            }
        }
        return false;
    }

    PendingIntent gP()
    {
        return mPendingIntent;
    }

    public ConnectionResult gQ()
    {
        return new ConnectionResult(Iv, mPendingIntent);
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
        return Iv;
    }

    public String getStatusMessage()
    {
        return KB;
    }

    int getVersionCode()
    {
        return CK;
    }

    public boolean hasResolution()
    {
        return mPendingIntent != null;
    }

    public int hashCode()
    {
        return jv.hashCode(new Object[] {
            Integer.valueOf(CK), Integer.valueOf(Iv), KB, mPendingIntent
        });
    }

    public boolean isCanceled()
    {
        return Iv == 16;
    }

    public boolean isInterrupted()
    {
        return Iv == 14;
    }

    public boolean isSuccess()
    {
        return Iv <= 0;
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
        return jv.h(this).a("statusCode", gt()).a("resolution", mPendingIntent).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        StatusCreator.a(this, parcel, i);
    }

}
