// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.kl;

// Referenced classes of package com.google.android.gms.location:
//            c

public final class LocationRequest
    implements SafeParcelable
{

    public static final c CREATOR = new c();
    public static final int PRIORITY_BALANCED_POWER_ACCURACY = 102;
    public static final int PRIORITY_HIGH_ACCURACY = 100;
    public static final int PRIORITY_LOW_POWER = 104;
    public static final int PRIORITY_NO_POWER = 105;
    boolean ain;
    long atA;
    int atB;
    float atC;
    long atD;
    long atn;
    long atz;
    int mPriority;
    private final int mVersionCode;

    public LocationRequest()
    {
        mVersionCode = 1;
        mPriority = 102;
        atz = 0x36ee80L;
        atA = 0x927c0L;
        ain = false;
        atn = 0x7fffffffffffffffL;
        atB = 0x7fffffff;
        atC = 0.0F;
        atD = 0L;
    }

    LocationRequest(int i, int j, long l, long l1, boolean flag, 
            long l2, int k, float f, long l3)
    {
        mVersionCode = i;
        mPriority = j;
        atz = l;
        atA = l1;
        ain = flag;
        atn = l2;
        atB = k;
        atC = f;
        atD = l3;
    }

    public static LocationRequest create()
    {
        return new LocationRequest();
    }

    private static void ht(int i)
    {
        switch (i)
        {
        case 101: // 'e'
        case 103: // 'g'
        default:
            throw new IllegalArgumentException((new StringBuilder("invalid quality: ")).append(i).toString());

        case 100: // 'd'
        case 102: // 'f'
        case 104: // 'h'
        case 105: // 'i'
            return;
        }
    }

    private static String hu(int i)
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

    private static void w(long l)
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException((new StringBuilder("invalid interval: ")).append(l).toString());
        } else
        {
            return;
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
            if (mPriority != ((LocationRequest) (obj)).mPriority || atz != ((LocationRequest) (obj)).atz || atA != ((LocationRequest) (obj)).atA || ain != ((LocationRequest) (obj)).ain || atn != ((LocationRequest) (obj)).atn || atB != ((LocationRequest) (obj)).atB || atC != ((LocationRequest) (obj)).atC)
            {
                return false;
            }
        }
        return true;
    }

    final int getVersionCode()
    {
        return mVersionCode;
    }

    public final int hashCode()
    {
        return kl.hashCode(new Object[] {
            Integer.valueOf(mPriority), Long.valueOf(atz), Long.valueOf(atA), Boolean.valueOf(ain), Long.valueOf(atn), Integer.valueOf(atB), Float.valueOf(atC)
        });
    }

    public final LocationRequest setExpirationDuration(long l)
    {
        long l1 = SystemClock.elapsedRealtime();
        if (l > 0x7fffffffffffffffL - l1)
        {
            atn = 0x7fffffffffffffffL;
        } else
        {
            atn = l1 + l;
        }
        if (atn < 0L)
        {
            atn = 0L;
        }
        return this;
    }

    public final LocationRequest setInterval(long l)
    {
        w(l);
        atz = l;
        if (!ain)
        {
            atA = (long)((double)atz / 6D);
        }
        return this;
    }

    public final LocationRequest setNumUpdates(int i)
    {
        if (i <= 0)
        {
            throw new IllegalArgumentException((new StringBuilder("invalid numUpdates: ")).append(i).toString());
        } else
        {
            atB = i;
            return this;
        }
    }

    public final LocationRequest setPriority(int i)
    {
        ht(i);
        mPriority = i;
        return this;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("Request[").append(hu(mPriority));
        if (mPriority != 105)
        {
            stringbuilder.append(" requested=");
            stringbuilder.append((new StringBuilder()).append(atz).append("ms").toString());
        }
        stringbuilder.append(" fastest=");
        stringbuilder.append((new StringBuilder()).append(atA).append("ms").toString());
        if (atn != 0x7fffffffffffffffL)
        {
            long l = atn;
            long l1 = SystemClock.elapsedRealtime();
            stringbuilder.append(" expireIn=");
            stringbuilder.append((new StringBuilder()).append(l - l1).append("ms").toString());
        }
        if (atB != 0x7fffffff)
        {
            stringbuilder.append(" num=").append(atB);
        }
        stringbuilder.append(']');
        return stringbuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        c.a(this, parcel, i);
    }

}
