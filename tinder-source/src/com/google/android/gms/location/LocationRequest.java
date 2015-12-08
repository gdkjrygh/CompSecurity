// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.location:
//            h

public final class LocationRequest
    implements SafeParcelable
{

    public static final h CREATOR = new h();
    final int a;
    public int b;
    public long c;
    public long d;
    public boolean e;
    long f;
    int g;
    public float h;
    long i;

    public LocationRequest()
    {
        a = 1;
        b = 102;
        c = 0x36ee80L;
        d = 0x927c0L;
        e = false;
        f = 0x7fffffffffffffffL;
        g = 0x7fffffff;
        h = 0.0F;
        i = 0L;
    }

    LocationRequest(int j, int k, long l, long l1, boolean flag, 
            long l2, int i1, float f1, long l3)
    {
        a = j;
        b = k;
        c = l;
        d = l1;
        e = flag;
        f = l2;
        g = i1;
        h = f1;
        i = l3;
    }

    public static LocationRequest a()
    {
        return new LocationRequest();
    }

    public static void a(long l)
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
            if (b != ((LocationRequest) (obj)).b || c != ((LocationRequest) (obj)).c || d != ((LocationRequest) (obj)).d || e != ((LocationRequest) (obj)).e || f != ((LocationRequest) (obj)).f || g != ((LocationRequest) (obj)).g || h != ((LocationRequest) (obj)).h)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(b), Long.valueOf(c), Long.valueOf(d), Boolean.valueOf(e), Long.valueOf(f), Integer.valueOf(g), Float.valueOf(h)
        });
    }

    public final String toString()
    {
        StringBuilder stringbuilder;
        StringBuilder stringbuilder1;
        stringbuilder = new StringBuilder();
        stringbuilder1 = stringbuilder.append("Request[");
        b;
        JVM INSTR tableswitch 100 105: default 56
    //                   100 228
    //                   101 56
    //                   102 234
    //                   103 56
    //                   104 240
    //                   105 246;
           goto _L1 _L2 _L1 _L3 _L1 _L4 _L5
_L1:
        String s = "???";
_L7:
        stringbuilder1.append(s);
        if (b != 105)
        {
            stringbuilder.append(" requested=");
            stringbuilder.append(c).append("ms");
        }
        stringbuilder.append(" fastest=");
        stringbuilder.append(d).append("ms");
        if (i > c)
        {
            stringbuilder.append(" maxWait=");
            stringbuilder.append(i).append("ms");
        }
        if (f != 0x7fffffffffffffffL)
        {
            long l = f;
            long l1 = SystemClock.elapsedRealtime();
            stringbuilder.append(" expireIn=");
            stringbuilder.append(l - l1).append("ms");
        }
        if (g != 0x7fffffff)
        {
            stringbuilder.append(" num=").append(g);
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
        com.google.android.gms.location.h.a(this, parcel);
    }

}
