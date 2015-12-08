// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;

// Referenced classes of package com.google.android.gms.common.api:
//            Result, StatusCreator, CommonStatusCodes

public final class Status
    implements Result, SafeParcelable
{

    public static final StatusCreator CREATOR = new StatusCreator();
    public static final Status zzNo = new Status(0);
    public static final Status zzNp = new Status(14);
    public static final Status zzNq = new Status(8);
    public static final Status zzNr = new Status(15);
    public static final Status zzNs = new Status(16);
    private final PendingIntent mPendingIntent;
    private final int zzFG;
    private final int zzLs;
    private final String zzNt;

    public Status(int i)
    {
        this(i, null);
    }

    Status(int i, int j, String s, PendingIntent pendingintent)
    {
        zzFG = i;
        zzLs = j;
        zzNt = s;
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

    private String zzhK()
    {
        if (zzNt != null)
        {
            return zzNt;
        } else
        {
            return CommonStatusCodes.getStatusCodeString(zzLs);
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
            if (zzFG == ((Status) (obj = (Status)obj)).zzFG && zzLs == ((Status) (obj)).zzLs && zzw.equal(zzNt, ((Status) (obj)).zzNt) && zzw.equal(mPendingIntent, ((Status) (obj)).mPendingIntent))
            {
                return true;
            }
        }
        return false;
    }

    public final Status getStatus()
    {
        return this;
    }

    public final int getStatusCode()
    {
        return zzLs;
    }

    public final String getStatusMessage()
    {
        return zzNt;
    }

    final int getVersionCode()
    {
        return zzFG;
    }

    public final int hashCode()
    {
        return zzw.hashCode(new Object[] {
            Integer.valueOf(zzFG), Integer.valueOf(zzLs), zzNt, mPendingIntent
        });
    }

    public final boolean isSuccess()
    {
        return zzLs <= 0;
    }

    public final String toString()
    {
        return zzw.zzk(this).zza("statusCode", zzhK()).zza("resolution", mPendingIntent).toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        StatusCreator.zza(this, parcel, i);
    }

    final PendingIntent zzip()
    {
        return mPendingIntent;
    }

}
