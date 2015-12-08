// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.location:
//            g

public final class LocationRequest
    implements SafeParcelable
{

    public static final g CREATOR = new g();
    int a;
    long b;
    long c;
    boolean d;
    long e;
    int f;
    float g;
    long h;
    private final int i;

    public LocationRequest()
    {
        i = 1;
        a = 102;
        b = 0x36ee80L;
        c = 0x927c0L;
        d = false;
        e = 0x7fffffffffffffffL;
        f = 0x7fffffff;
        g = 0.0F;
        h = 0L;
    }

    LocationRequest(int j, int k, long l, long l1, boolean flag, 
            long l2, int i1, float f1, long l3)
    {
        i = j;
        a = k;
        b = l;
        c = l1;
        d = flag;
        e = l2;
        f = i1;
        g = f1;
        h = l3;
    }

    private static void a(long l)
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException((new StringBuilder("invalid interval: ")).append(l).toString());
        } else
        {
            return;
        }
    }

    public final LocationRequest a()
    {
        a = 100;
        return this;
    }

    public final LocationRequest b()
    {
        a(10000L);
        b = 10000L;
        if (!d)
        {
            c = (long)((double)b / 6D);
        }
        return this;
    }

    public final LocationRequest c()
    {
        a(5000L);
        d = true;
        c = 5000L;
        return this;
    }

    final int d()
    {
        return i;
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
            if (a != ((LocationRequest) (obj)).a || b != ((LocationRequest) (obj)).b || c != ((LocationRequest) (obj)).c || d != ((LocationRequest) (obj)).d || e != ((LocationRequest) (obj)).e || f != ((LocationRequest) (obj)).f || g != ((LocationRequest) (obj)).g)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(a), Long.valueOf(b), Long.valueOf(c), Boolean.valueOf(d), Long.valueOf(e), Integer.valueOf(f), Float.valueOf(g)
        });
    }

    public final String toString()
    {
        StringBuilder stringbuilder;
        StringBuilder stringbuilder1;
        stringbuilder = new StringBuilder();
        stringbuilder1 = stringbuilder.append("Request[");
        a;
        JVM INSTR tableswitch 100 105: default 56
    //                   100 280
    //                   101 56
    //                   102 286
    //                   103 56
    //                   104 292
    //                   105 298;
           goto _L1 _L2 _L1 _L3 _L1 _L4 _L5
_L1:
        String s = "???";
_L7:
        stringbuilder1.append(s);
        if (a != 105)
        {
            stringbuilder.append(" requested=");
            stringbuilder.append((new StringBuilder()).append(b).append("ms").toString());
        }
        stringbuilder.append(" fastest=");
        stringbuilder.append((new StringBuilder()).append(c).append("ms").toString());
        if (h > b)
        {
            stringbuilder.append(" maxWait=");
            stringbuilder.append((new StringBuilder()).append(h).append("ms").toString());
        }
        if (e != 0x7fffffffffffffffL)
        {
            long l = e;
            long l1 = SystemClock.elapsedRealtime();
            stringbuilder.append(" expireIn=");
            stringbuilder.append((new StringBuilder()).append(l - l1).append("ms").toString());
        }
        if (f != 0x7fffffff)
        {
            stringbuilder.append(" num=").append(f);
        }
        stringbuilder.append(']');
        return stringbuilder.toString();
_L2:
        s = "PRIORITY_HIGH_ACCURACY";
        continue; /* Loop/switch isn't completed */
_L3:
        s = "PRIORITY_BALANCED_POWER_ACCURACY";
        continue; /* Loop/switch isn't completed */
_L4:
        s = "PRIORITY_LOW_POWER";
        continue; /* Loop/switch isn't completed */
_L5:
        s = "PRIORITY_NO_POWER";
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final void writeToParcel(Parcel parcel, int j)
    {
        com.google.android.gms.location.g.a(this, parcel);
    }

}
