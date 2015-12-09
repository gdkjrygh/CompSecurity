// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.fo;

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
    long NV;
    long Oc;
    long Od;
    boolean Oe;
    int Of;
    float Og;
    int mPriority;
    private final int xH;

    public LocationRequest()
    {
        xH = 1;
        mPriority = 102;
        Oc = 0x36ee80L;
        Od = 0x927c0L;
        Oe = false;
        NV = 0x7fffffffffffffffL;
        Of = 0x7fffffff;
        Og = 0.0F;
    }

    LocationRequest(int i, int j, long l, long l1, boolean flag, 
            long l2, int k, float f)
    {
        xH = i;
        mPriority = j;
        Oc = l;
        Od = l1;
        Oe = flag;
        NV = l2;
        Of = k;
        Og = f;
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

    private static void bw(int i)
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

    public static String bx(int i)
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

    private static void s(long l)
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
            if (mPriority != ((LocationRequest) (obj)).mPriority || Oc != ((LocationRequest) (obj)).Oc || Od != ((LocationRequest) (obj)).Od || Oe != ((LocationRequest) (obj)).Oe || NV != ((LocationRequest) (obj)).NV || Of != ((LocationRequest) (obj)).Of || Og != ((LocationRequest) (obj)).Og)
            {
                return false;
            }
        }
        return true;
    }

    public long getExpirationTime()
    {
        return NV;
    }

    public long getFastestInterval()
    {
        return Od;
    }

    public long getInterval()
    {
        return Oc;
    }

    public int getNumUpdates()
    {
        return Of;
    }

    public int getPriority()
    {
        return mPriority;
    }

    public float getSmallestDisplacement()
    {
        return Og;
    }

    int getVersionCode()
    {
        return xH;
    }

    public int hashCode()
    {
        return fo.hashCode(new Object[] {
            Integer.valueOf(mPriority), Long.valueOf(Oc), Long.valueOf(Od), Boolean.valueOf(Oe), Long.valueOf(NV), Integer.valueOf(Of), Float.valueOf(Og)
        });
    }

    public LocationRequest setExpirationDuration(long l)
    {
        long l1 = SystemClock.elapsedRealtime();
        if (l > 0x7fffffffffffffffL - l1)
        {
            NV = 0x7fffffffffffffffL;
        } else
        {
            NV = l1 + l;
        }
        if (NV < 0L)
        {
            NV = 0L;
        }
        return this;
    }

    public LocationRequest setExpirationTime(long l)
    {
        NV = l;
        if (NV < 0L)
        {
            NV = 0L;
        }
        return this;
    }

    public LocationRequest setFastestInterval(long l)
    {
        s(l);
        Oe = true;
        Od = l;
        return this;
    }

    public LocationRequest setInterval(long l)
    {
        s(l);
        Oc = l;
        if (!Oe)
        {
            Od = (long)((double)Oc / 6D);
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
            Of = i;
            return this;
        }
    }

    public LocationRequest setPriority(int i)
    {
        bw(i);
        mPriority = i;
        return this;
    }

    public LocationRequest setSmallestDisplacement(float f)
    {
        a(f);
        Og = f;
        return this;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("Request[").append(bx(mPriority));
        if (mPriority != 105)
        {
            stringbuilder.append(" requested=");
            stringbuilder.append((new StringBuilder()).append(Oc).append("ms").toString());
        }
        stringbuilder.append(" fastest=");
        stringbuilder.append((new StringBuilder()).append(Od).append("ms").toString());
        if (NV != 0x7fffffffffffffffL)
        {
            long l = NV;
            long l1 = SystemClock.elapsedRealtime();
            stringbuilder.append(" expireIn=");
            stringbuilder.append((new StringBuilder()).append(l - l1).append("ms").toString());
        }
        if (Of != 0x7fffffff)
        {
            stringbuilder.append(" num=").append(Of);
        }
        stringbuilder.append(']');
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        LocationRequestCreator.a(this, parcel, i);
    }

}
