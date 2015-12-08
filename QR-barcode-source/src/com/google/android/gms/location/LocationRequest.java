// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.location:
//            b

public final class LocationRequest
    implements SafeParcelable
{

    public static final b CREATOR = new b();
    public static final int PRIORITY_BALANCED_POWER_ACCURACY = 102;
    public static final int PRIORITY_HIGH_ACCURACY = 100;
    public static final int PRIORITY_LOW_POWER = 104;
    public static final int PRIORITY_NO_POWER = 105;
    private final int BR;
    boolean UK;
    long aei;
    long aes;
    long aet;
    int aeu;
    float aev;
    long aew;
    int mPriority;

    public LocationRequest()
    {
        BR = 1;
        mPriority = 102;
        aes = 0x36ee80L;
        aet = 0x927c0L;
        UK = false;
        aei = 0x7fffffffffffffffL;
        aeu = 0x7fffffff;
        aev = 0.0F;
        aew = 0L;
    }

    LocationRequest(int i, int j, long l, long l1, boolean flag, 
            long l2, int k, float f, long l3)
    {
        BR = i;
        mPriority = j;
        aes = l;
        aet = l1;
        UK = flag;
        aei = l2;
        aeu = k;
        aev = f;
        aew = l3;
    }

    private static void a(float f)
    {
        if (f < 0.0F)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("invalid displacement: ").append(f).toString());
        } else
        {
            return;
        }
    }

    public static LocationRequest create()
    {
        return new LocationRequest();
    }

    private static void eb(int i)
    {
        switch (i)
        {
        case 101: // 'e'
        case 103: // 'g'
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("invalid quality: ").append(i).toString());

        case 100: // 'd'
        case 102: // 'f'
        case 104: // 'h'
        case 105: // 'i'
            return;
        }
    }

    public static String ec(int i)
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

    private static void v(long l)
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("invalid interval: ").append(l).toString());
        } else
        {
            return;
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof LocationRequest))
            {
                return false;
            }
            obj = (LocationRequest)obj;
            if (mPriority != ((LocationRequest) (obj)).mPriority || aes != ((LocationRequest) (obj)).aes || aet != ((LocationRequest) (obj)).aet || UK != ((LocationRequest) (obj)).UK || aei != ((LocationRequest) (obj)).aei || aeu != ((LocationRequest) (obj)).aeu || aev != ((LocationRequest) (obj)).aev)
            {
                return false;
            }
        }
        return true;
    }

    public long getExpirationTime()
    {
        return aei;
    }

    public long getFastestInterval()
    {
        return aet;
    }

    public long getInterval()
    {
        return aes;
    }

    public int getNumUpdates()
    {
        return aeu;
    }

    public int getPriority()
    {
        return mPriority;
    }

    public float getSmallestDisplacement()
    {
        return aev;
    }

    int getVersionCode()
    {
        return BR;
    }

    public int hashCode()
    {
        return n.hashCode(new Object[] {
            Integer.valueOf(mPriority), Long.valueOf(aes), Long.valueOf(aet), Boolean.valueOf(UK), Long.valueOf(aei), Integer.valueOf(aeu), Float.valueOf(aev)
        });
    }

    public LocationRequest setExpirationDuration(long l)
    {
        long l1 = SystemClock.elapsedRealtime();
        if (l > 0x7fffffffffffffffL - l1)
        {
            aei = 0x7fffffffffffffffL;
        } else
        {
            aei = l1 + l;
        }
        if (aei < 0L)
        {
            aei = 0L;
        }
        return this;
    }

    public LocationRequest setExpirationTime(long l)
    {
        aei = l;
        if (aei < 0L)
        {
            aei = 0L;
        }
        return this;
    }

    public LocationRequest setFastestInterval(long l)
    {
        v(l);
        UK = true;
        aet = l;
        return this;
    }

    public LocationRequest setInterval(long l)
    {
        v(l);
        aes = l;
        if (!UK)
        {
            aet = (long)((double)aes / 6D);
        }
        return this;
    }

    public LocationRequest setNumUpdates(int i)
    {
        if (i <= 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("invalid numUpdates: ").append(i).toString());
        } else
        {
            aeu = i;
            return this;
        }
    }

    public LocationRequest setPriority(int i)
    {
        eb(i);
        mPriority = i;
        return this;
    }

    public LocationRequest setSmallestDisplacement(float f)
    {
        a(f);
        aev = f;
        return this;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("Request[").append(ec(mPriority));
        if (mPriority != 105)
        {
            stringbuilder.append(" requested=");
            stringbuilder.append((new StringBuilder()).append(aes).append("ms").toString());
        }
        stringbuilder.append(" fastest=");
        stringbuilder.append((new StringBuilder()).append(aet).append("ms").toString());
        if (aei != 0x7fffffffffffffffL)
        {
            long l = aei;
            long l1 = SystemClock.elapsedRealtime();
            stringbuilder.append(" expireIn=");
            stringbuilder.append((new StringBuilder()).append(l - l1).append("ms").toString());
        }
        if (aeu != 0x7fffffff)
        {
            stringbuilder.append(" num=").append(aeu);
        }
        stringbuilder.append(']');
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        b.a(this, parcel, i);
    }

}
