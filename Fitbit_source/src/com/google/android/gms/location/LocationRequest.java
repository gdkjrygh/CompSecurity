// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ak;

// Referenced classes of package com.google.android.gms.location:
//            q

public final class LocationRequest
    implements SafeParcelable
{

    public static final q CREATOR = new q();
    public static final int a = 100;
    public static final int b = 102;
    public static final int c = 104;
    public static final int d = 105;
    int e;
    long f;
    long g;
    boolean h;
    long i;
    int j;
    float k;
    long l;
    private final int m;

    public LocationRequest()
    {
        m = 1;
        e = 102;
        f = 0x36ee80L;
        g = 0x927c0L;
        h = false;
        i = 0x7fffffffffffffffL;
        j = 0x7fffffff;
        k = 0.0F;
        l = 0L;
    }

    LocationRequest(int i1, int j1, long l1, long l2, boolean flag, 
            long l3, int k1, float f1, long l4)
    {
        m = i1;
        e = j1;
        f = l1;
        g = l2;
        h = flag;
        i = l3;
        j = k1;
        k = f1;
        l = l4;
    }

    public static LocationRequest a()
    {
        return new LocationRequest();
    }

    private static void b(float f1)
    {
        if (f1 < 0.0F)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("invalid displacement: ").append(f1).toString());
        } else
        {
            return;
        }
    }

    public static String c(int i1)
    {
        switch (i1)
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

    private static void d(int i1)
    {
        switch (i1)
        {
        case 101: // 'e'
        case 103: // 'g'
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("invalid quality: ").append(i1).toString());

        case 100: // 'd'
        case 102: // 'f'
        case 104: // 'h'
        case 105: // 'i'
            return;
        }
    }

    private static void e(long l1)
    {
        if (l1 < 0L)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("invalid interval: ").append(l1).toString());
        } else
        {
            return;
        }
    }

    public LocationRequest a(float f1)
    {
        b(f1);
        k = f1;
        return this;
    }

    public LocationRequest a(int i1)
    {
        d(i1);
        e = i1;
        return this;
    }

    public LocationRequest a(long l1)
    {
        e(l1);
        f = l1;
        if (!h)
        {
            g = (long)((double)f / 6D);
        }
        return this;
    }

    public int b()
    {
        return e;
    }

    public LocationRequest b(int i1)
    {
        if (i1 <= 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("invalid numUpdates: ").append(i1).toString());
        } else
        {
            j = i1;
            return this;
        }
    }

    public LocationRequest b(long l1)
    {
        e(l1);
        h = true;
        g = l1;
        return this;
    }

    public long c()
    {
        return f;
    }

    public LocationRequest c(long l1)
    {
        long l2 = SystemClock.elapsedRealtime();
        if (l1 > 0x7fffffffffffffffL - l2)
        {
            i = 0x7fffffffffffffffL;
        } else
        {
            i = l2 + l1;
        }
        if (i < 0L)
        {
            i = 0L;
        }
        return this;
    }

    public long d()
    {
        return g;
    }

    public LocationRequest d(long l1)
    {
        i = l1;
        if (i < 0L)
        {
            i = 0L;
        }
        return this;
    }

    public int describeContents()
    {
        return 0;
    }

    public long e()
    {
        return i;
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
            if (e != ((LocationRequest) (obj)).e || f != ((LocationRequest) (obj)).f || g != ((LocationRequest) (obj)).g || h != ((LocationRequest) (obj)).h || i != ((LocationRequest) (obj)).i || j != ((LocationRequest) (obj)).j || k != ((LocationRequest) (obj)).k)
            {
                return false;
            }
        }
        return true;
    }

    public int f()
    {
        return j;
    }

    public float g()
    {
        return k;
    }

    int h()
    {
        return m;
    }

    public int hashCode()
    {
        return ak.a(new Object[] {
            Integer.valueOf(e), Long.valueOf(f), Long.valueOf(g), Boolean.valueOf(h), Long.valueOf(i), Integer.valueOf(j), Float.valueOf(k)
        });
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("Request[").append(c(e));
        if (e != 105)
        {
            stringbuilder.append(" requested=");
            stringbuilder.append((new StringBuilder()).append(f).append("ms").toString());
        }
        stringbuilder.append(" fastest=");
        stringbuilder.append((new StringBuilder()).append(g).append("ms").toString());
        if (i != 0x7fffffffffffffffL)
        {
            long l1 = i;
            long l2 = SystemClock.elapsedRealtime();
            stringbuilder.append(" expireIn=");
            stringbuilder.append((new StringBuilder()).append(l1 - l2).append("ms").toString());
        }
        if (j != 0x7fffffff)
        {
            stringbuilder.append(" num=").append(j);
        }
        stringbuilder.append(']');
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        q.a(this, parcel, i1);
    }

}
