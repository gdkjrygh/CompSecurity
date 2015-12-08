// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.kl;

// Referenced classes of package com.google.android.gms.common.api:
//            Result, StatusCreator, CommonStatusCodes

public final class Status
    implements Result, SafeParcelable
{

    public static final StatusCreator CREATOR = new StatusCreator();
    public static final Status Th = new Status(0);
    public static final Status Ti = new Status(14);
    public static final Status Tj = new Status(8);
    public static final Status Tk = new Status(15);
    public static final Status Tl = new Status(16);
    private final int Rk;
    private final String Tm;
    private final PendingIntent mPendingIntent;
    private final int mVersionCode;

    public Status(int i)
    {
        this(i, null);
    }

    Status(int i, int j, String s, PendingIntent pendingintent)
    {
        mVersionCode = i;
        Rk = j;
        Tm = s;
        mPendingIntent = pendingintent;
    }

    private Status(int i, String s)
    {
        this(1, i, s, null);
    }

    public Status(int i, String s, PendingIntent pendingintent)
    {
        this(1, i, s, pendingintent);
    }

    private String hP()
    {
        if (Tm != null)
        {
            return Tm;
        } else
        {
            return CommonStatusCodes.getStatusCodeString(Rk);
        }
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof Status)
        {
            if (mVersionCode == ((Status) (obj = (Status)obj)).mVersionCode && Rk == ((Status) (obj)).Rk && kl.equal(Tm, ((Status) (obj)).Tm) && kl.equal(mPendingIntent, ((Status) (obj)).mPendingIntent))
            {
                return true;
            }
        }
        return false;
    }

    final PendingIntent getPendingIntent()
    {
        return mPendingIntent;
    }

    public final Status getStatus()
    {
        return this;
    }

    public final int getStatusCode()
    {
        return Rk;
    }

    public final String getStatusMessage()
    {
        return Tm;
    }

    final int getVersionCode()
    {
        return mVersionCode;
    }

    public final int hashCode()
    {
        return kl.hashCode(new Object[] {
            Integer.valueOf(mVersionCode), Integer.valueOf(Rk), Tm, mPendingIntent
        });
    }

    public final boolean isSuccess()
    {
        return Rk <= 0;
    }

    public final String toString()
    {
        return kl.j(this).a("statusCode", hP()).a("resolution", mPendingIntent).toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        StatusCreator.a(this, parcel, i);
    }

}
