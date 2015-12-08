// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.hl;

// Referenced classes of package com.google.android.gms.location:
//            LocationRequestCreator

public final class LocationRequest
    implements SafeParcelable
{

    public static final LocationRequestCreator CREATOR = new LocationRequestCreator();
    public static final int PRIORITY_BALANCED_POWER_ACCURACY = 102;
    public static final int PRIORITY_HIGH_ACCURACY = 100;
    public static final int PRIORITY_LOW_POWER = 104;
    public static final int PRIORITY_NO_POWER = 105;
    long UY;
    long Vi;
    long Vj;
    boolean Vk;
    int Vl;
    float Vm;
    int mPriority;
    private final int xJ;

    public LocationRequest()
    {
        xJ = 1;
        mPriority = 102;
        Vi = 0x36ee80L;
        Vj = 0x927c0L;
        Vk = false;
        UY = 0x7fffffffffffffffL;
        Vl = 0x7fffffff;
        Vm = 0.0F;
    }

    LocationRequest(int i, int j, long l, long l1, boolean flag, 
            long l2, int k, float f)
    {
        xJ = i;
        mPriority = j;
        Vi = l;
        Vj = l1;
        Vk = flag;
        UY = l2;
        Vl = k;
        Vm = f;
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

    private static void cG(int i)
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

    public static String cH(int i)
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

    public static LocationRequest create()
    {
        return new LocationRequest();
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
            if (mPriority != ((LocationRequest) (obj)).mPriority || Vi != ((LocationRequest) (obj)).Vi || Vj != ((LocationRequest) (obj)).Vj || Vk != ((LocationRequest) (obj)).Vk || UY != ((LocationRequest) (obj)).UY || Vl != ((LocationRequest) (obj)).Vl || Vm != ((LocationRequest) (obj)).Vm)
            {
                return false;
            }
        }
        return true;
    }

    public long getExpirationTime()
    {
        return UY;
    }

    public long getFastestInterval()
    {
        return Vj;
    }

    public long getInterval()
    {
        return Vi;
    }

    public int getNumUpdates()
    {
        return Vl;
    }

    public int getPriority()
    {
        return mPriority;
    }

    public float getSmallestDisplacement()
    {
        return Vm;
    }

    int getVersionCode()
    {
        return xJ;
    }

    public int hashCode()
    {
        return hl.hashCode(new Object[] {
            Integer.valueOf(mPriority), Long.valueOf(Vi), Long.valueOf(Vj), Boolean.valueOf(Vk), Long.valueOf(UY), Integer.valueOf(Vl), Float.valueOf(Vm)
        });
    }

    public LocationRequest setExpirationDuration(long l)
    {
        long l1 = SystemClock.elapsedRealtime();
        if (l > 0x7fffffffffffffffL - l1)
        {
            UY = 0x7fffffffffffffffL;
        } else
        {
            UY = l1 + l;
        }
        if (UY < 0L)
        {
            UY = 0L;
        }
        return this;
    }

    public LocationRequest setExpirationTime(long l)
    {
        UY = l;
        if (UY < 0L)
        {
            UY = 0L;
        }
        return this;
    }

    public LocationRequest setFastestInterval(long l)
    {
        v(l);
        Vk = true;
        Vj = l;
        return this;
    }

    public LocationRequest setInterval(long l)
    {
        v(l);
        Vi = l;
        if (!Vk)
        {
            Vj = (long)((double)Vi / 6D);
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
            Vl = i;
            return this;
        }
    }

    public LocationRequest setPriority(int i)
    {
        cG(i);
        mPriority = i;
        return this;
    }

    public LocationRequest setSmallestDisplacement(float f)
    {
        a(f);
        Vm = f;
        return this;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("Request[").append(cH(mPriority));
        if (mPriority != 105)
        {
            stringbuilder.append(" requested=");
            stringbuilder.append((new StringBuilder()).append(Vi).append("ms").toString());
        }
        stringbuilder.append(" fastest=");
        stringbuilder.append((new StringBuilder()).append(Vj).append("ms").toString());
        if (UY != 0x7fffffffffffffffL)
        {
            long l = UY;
            long l1 = SystemClock.elapsedRealtime();
            stringbuilder.append(" expireIn=");
            stringbuilder.append((new StringBuilder()).append(l - l1).append("ms").toString());
        }
        if (Vl != 0x7fffffff)
        {
            stringbuilder.append(" num=").append(Vl);
        }
        stringbuilder.append(']');
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        LocationRequestCreator.a(this, parcel, i);
    }

}
