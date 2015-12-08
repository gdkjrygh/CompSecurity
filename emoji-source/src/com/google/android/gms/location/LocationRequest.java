// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.hk;

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
    long Vb;
    long Vl;
    long Vm;
    boolean Vn;
    int Vo;
    float Vp;
    int mPriority;
    private final int xM;

    public LocationRequest()
    {
        xM = 1;
        mPriority = 102;
        Vl = 0x36ee80L;
        Vm = 0x927c0L;
        Vn = false;
        Vb = 0x7fffffffffffffffL;
        Vo = 0x7fffffff;
        Vp = 0.0F;
    }

    LocationRequest(int i, int j, long l, long l1, boolean flag, 
            long l2, int k, float f)
    {
        xM = i;
        mPriority = j;
        Vl = l;
        Vm = l1;
        Vn = flag;
        Vb = l2;
        Vo = k;
        Vp = f;
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
            if (mPriority != ((LocationRequest) (obj)).mPriority || Vl != ((LocationRequest) (obj)).Vl || Vm != ((LocationRequest) (obj)).Vm || Vn != ((LocationRequest) (obj)).Vn || Vb != ((LocationRequest) (obj)).Vb || Vo != ((LocationRequest) (obj)).Vo || Vp != ((LocationRequest) (obj)).Vp)
            {
                return false;
            }
        }
        return true;
    }

    public long getExpirationTime()
    {
        return Vb;
    }

    public long getFastestInterval()
    {
        return Vm;
    }

    public long getInterval()
    {
        return Vl;
    }

    public int getNumUpdates()
    {
        return Vo;
    }

    public int getPriority()
    {
        return mPriority;
    }

    public float getSmallestDisplacement()
    {
        return Vp;
    }

    int getVersionCode()
    {
        return xM;
    }

    public int hashCode()
    {
        return hk.hashCode(new Object[] {
            Integer.valueOf(mPriority), Long.valueOf(Vl), Long.valueOf(Vm), Boolean.valueOf(Vn), Long.valueOf(Vb), Integer.valueOf(Vo), Float.valueOf(Vp)
        });
    }

    public LocationRequest setExpirationDuration(long l)
    {
        long l1 = SystemClock.elapsedRealtime();
        if (l > 0x7fffffffffffffffL - l1)
        {
            Vb = 0x7fffffffffffffffL;
        } else
        {
            Vb = l1 + l;
        }
        if (Vb < 0L)
        {
            Vb = 0L;
        }
        return this;
    }

    public LocationRequest setExpirationTime(long l)
    {
        Vb = l;
        if (Vb < 0L)
        {
            Vb = 0L;
        }
        return this;
    }

    public LocationRequest setFastestInterval(long l)
    {
        v(l);
        Vn = true;
        Vm = l;
        return this;
    }

    public LocationRequest setInterval(long l)
    {
        v(l);
        Vl = l;
        if (!Vn)
        {
            Vm = (long)((double)Vl / 6D);
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
            Vo = i;
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
        Vp = f;
        return this;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("Request[").append(cH(mPriority));
        if (mPriority != 105)
        {
            stringbuilder.append(" requested=");
            stringbuilder.append((new StringBuilder()).append(Vl).append("ms").toString());
        }
        stringbuilder.append(" fastest=");
        stringbuilder.append((new StringBuilder()).append(Vm).append("ms").toString());
        if (Vb != 0x7fffffffffffffffL)
        {
            long l = Vb;
            long l1 = SystemClock.elapsedRealtime();
            stringbuilder.append(" expireIn=");
            stringbuilder.append((new StringBuilder()).append(l - l1).append("ms").toString());
        }
        if (Vo != 0x7fffffff)
        {
            stringbuilder.append(" num=").append(Vo);
        }
        stringbuilder.append(']');
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        LocationRequestCreator.a(this, parcel, i);
    }

}
