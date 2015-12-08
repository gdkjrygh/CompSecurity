// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jv;

// Referenced classes of package com.google.android.gms.location:
//            d

public final class LocationRequest
    implements SafeParcelable
{

    public static final d CREATOR = new d();
    public static final int PRIORITY_BALANCED_POWER_ACCURACY = 102;
    public static final int PRIORITY_HIGH_ACCURACY = 100;
    public static final int PRIORITY_LOW_POWER = 104;
    public static final int PRIORITY_NO_POWER = 105;
    private final int CK;
    boolean Wg;
    long age;
    long agr;
    long ags;
    int agt;
    float agu;
    long agv;
    int mPriority;

    public LocationRequest()
    {
        CK = 1;
        mPriority = 102;
        agr = 0x36ee80L;
        ags = 0x927c0L;
        Wg = false;
        age = 0x7fffffffffffffffL;
        agt = 0x7fffffff;
        agu = 0.0F;
        agv = 0L;
    }

    LocationRequest(int i, int j, long l, long l1, boolean flag, 
            long l2, int k, float f, long l3)
    {
        CK = i;
        mPriority = j;
        agr = l;
        ags = l1;
        Wg = flag;
        age = l2;
        agt = k;
        agu = f;
        agv = l3;
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

    private static void ey(int i)
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

    public static String ez(int i)
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
            if (mPriority != ((LocationRequest) (obj)).mPriority || agr != ((LocationRequest) (obj)).agr || ags != ((LocationRequest) (obj)).ags || Wg != ((LocationRequest) (obj)).Wg || age != ((LocationRequest) (obj)).age || agt != ((LocationRequest) (obj)).agt || agu != ((LocationRequest) (obj)).agu)
            {
                return false;
            }
        }
        return true;
    }

    public long getExpirationTime()
    {
        return age;
    }

    public long getFastestInterval()
    {
        return ags;
    }

    public long getInterval()
    {
        return agr;
    }

    public int getNumUpdates()
    {
        return agt;
    }

    public int getPriority()
    {
        return mPriority;
    }

    public float getSmallestDisplacement()
    {
        return agu;
    }

    int getVersionCode()
    {
        return CK;
    }

    public int hashCode()
    {
        return jv.hashCode(new Object[] {
            Integer.valueOf(mPriority), Long.valueOf(agr), Long.valueOf(ags), Boolean.valueOf(Wg), Long.valueOf(age), Integer.valueOf(agt), Float.valueOf(agu)
        });
    }

    public LocationRequest setExpirationDuration(long l)
    {
        long l1 = SystemClock.elapsedRealtime();
        if (l > 0x7fffffffffffffffL - l1)
        {
            age = 0x7fffffffffffffffL;
        } else
        {
            age = l1 + l;
        }
        if (age < 0L)
        {
            age = 0L;
        }
        return this;
    }

    public LocationRequest setExpirationTime(long l)
    {
        age = l;
        if (age < 0L)
        {
            age = 0L;
        }
        return this;
    }

    public LocationRequest setFastestInterval(long l)
    {
        v(l);
        Wg = true;
        ags = l;
        return this;
    }

    public LocationRequest setInterval(long l)
    {
        v(l);
        agr = l;
        if (!Wg)
        {
            ags = (long)((double)agr / 6D);
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
            agt = i;
            return this;
        }
    }

    public LocationRequest setPriority(int i)
    {
        ey(i);
        mPriority = i;
        return this;
    }

    public LocationRequest setSmallestDisplacement(float f)
    {
        a(f);
        agu = f;
        return this;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("Request[").append(ez(mPriority));
        if (mPriority != 105)
        {
            stringbuilder.append(" requested=");
            stringbuilder.append((new StringBuilder()).append(agr).append("ms").toString());
        }
        stringbuilder.append(" fastest=");
        stringbuilder.append((new StringBuilder()).append(ags).append("ms").toString());
        if (age != 0x7fffffffffffffffL)
        {
            long l = age;
            long l1 = SystemClock.elapsedRealtime();
            stringbuilder.append(" expireIn=");
            stringbuilder.append((new StringBuilder()).append(l - l1).append("ms").toString());
        }
        if (agt != 0x7fffffff)
        {
            stringbuilder.append(" num=").append(agt);
        }
        stringbuilder.append(']');
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        d.a(this, parcel, i);
    }

}
