// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;

// Referenced classes of package com.google.android.gms.location:
//            zzg

public final class LocationRequest
    implements SafeParcelable
{

    public static final zzg CREATOR = new zzg();
    int mPriority;
    private final int zzFG;
    boolean zzabz;
    long zzalO;
    long zzamf;
    long zzamg;
    int zzamh;
    float zzami;
    long zzamj;

    public LocationRequest()
    {
        zzFG = 1;
        mPriority = 102;
        zzamf = 0x36ee80L;
        zzamg = 0x927c0L;
        zzabz = false;
        zzalO = 0x7fffffffffffffffL;
        zzamh = 0x7fffffff;
        zzami = 0.0F;
        zzamj = 0L;
    }

    LocationRequest(int i, int j, long l, long l1, boolean flag, 
            long l2, int k, float f, long l3)
    {
        zzFG = i;
        mPriority = j;
        zzamf = l;
        zzamg = l1;
        zzabz = flag;
        zzalO = l2;
        zzamh = k;
        zzami = f;
        zzamj = l3;
    }

    public static String zzfk(int i)
    {
        switch (i)
        {
        case 101: // 'e'
        case 103: // 'g'
        default:
            return "???";

        case 100: // 'd'
            return "PRIORITY_HIGH_ACCURACY";

        case 102: // 'f'
            return "PRIORITY_BALANCED_POWER_ACCURACY";

        case 104: // 'h'
            return "PRIORITY_LOW_POWER";

        case 105: // 'i'
            return "PRIORITY_NO_POWER";
        }
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof LocationRequest))
            {
                return false;
            }
            obj = (LocationRequest)obj;
            if (mPriority != ((LocationRequest) (obj)).mPriority || zzamf != ((LocationRequest) (obj)).zzamf || zzamg != ((LocationRequest) (obj)).zzamg || zzabz != ((LocationRequest) (obj)).zzabz || zzalO != ((LocationRequest) (obj)).zzalO || zzamh != ((LocationRequest) (obj)).zzamh || zzami != ((LocationRequest) (obj)).zzami)
            {
                return false;
            }
        }
        return true;
    }

    final int getVersionCode()
    {
        return zzFG;
    }

    public final int hashCode()
    {
        return zzw.hashCode(new Object[] {
            Integer.valueOf(mPriority), Long.valueOf(zzamf), Long.valueOf(zzamg), Boolean.valueOf(zzabz), Long.valueOf(zzalO), Integer.valueOf(zzamh), Float.valueOf(zzami)
        });
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("Request[").append(zzfk(mPriority));
        if (mPriority != 105)
        {
            stringbuilder.append(" requested=");
            stringbuilder.append((new StringBuilder()).append(zzamf).append("ms").toString());
        }
        stringbuilder.append(" fastest=");
        stringbuilder.append((new StringBuilder()).append(zzamg).append("ms").toString());
        if (zzamj > zzamf)
        {
            stringbuilder.append(" maxWait=");
            stringbuilder.append((new StringBuilder()).append(zzamj).append("ms").toString());
        }
        if (zzalO != 0x7fffffffffffffffL)
        {
            long l = zzalO;
            long l1 = SystemClock.elapsedRealtime();
            stringbuilder.append(" expireIn=");
            stringbuilder.append((new StringBuilder()).append(l - l1).append("ms").toString());
        }
        if (zzamh != 0x7fffffff)
        {
            stringbuilder.append(" num=").append(zzamh);
        }
        stringbuilder.append(']');
        return stringbuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        zzg.zza(this, parcel, i);
    }

}
