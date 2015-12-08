// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;

// Referenced classes of package com.google.android.gms.common.api:
//            Result, zzk, CommonStatusCodes

public final class Status
    implements Result, SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzk();
    public static final Status zzXP = new Status(0);
    public static final Status zzXQ = new Status(14);
    public static final Status zzXR = new Status(8);
    public static final Status zzXS = new Status(15);
    public static final Status zzXT = new Status(16);
    private final PendingIntent mPendingIntent;
    private final int zzCY;
    private final int zzTS;
    private final String zzXU;

    public Status(int i)
    {
        this(i, null);
    }

    Status(int i, int j, String s, PendingIntent pendingintent)
    {
        zzCY = i;
        zzTS = j;
        zzXU = s;
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

    private String zzmU()
    {
        if (zzXU != null)
        {
            return zzXU;
        } else
        {
            return CommonStatusCodes.getStatusCodeString(zzTS);
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
            if (zzCY == ((Status) (obj = (Status)obj)).zzCY && zzTS == ((Status) (obj)).zzTS && zzt.equal(zzXU, ((Status) (obj)).zzXU) && zzt.equal(mPendingIntent, ((Status) (obj)).mPendingIntent))
            {
                return true;
            }
        }
        return false;
    }

    public Status getStatus()
    {
        return this;
    }

    public int getStatusCode()
    {
        return zzTS;
    }

    public String getStatusMessage()
    {
        return zzXU;
    }

    int getVersionCode()
    {
        return zzCY;
    }

    public int hashCode()
    {
        return zzt.hashCode(new Object[] {
            Integer.valueOf(zzCY), Integer.valueOf(zzTS), zzXU, mPendingIntent
        });
    }

    public boolean isSuccess()
    {
        return zzTS <= 0;
    }

    public String toString()
    {
        return zzt.zzt(this).zzg("statusCode", zzmU()).zzg("resolution", mPendingIntent).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzk.zza(this, parcel, i);
    }

    PendingIntent zzmT()
    {
        return mPendingIntent;
    }

}
