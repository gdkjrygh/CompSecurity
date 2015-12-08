// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.o;

import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.m4b.maps.k.c;
import java.util.Arrays;

// Referenced classes of package com.google.android.m4b.maps.o:
//            s

public final class p
    implements c
{

    public static final s CREATOR = new s();
    final int a;
    int b;
    public long c;
    public long d;
    public boolean e;
    long f;
    int g;
    float h;
    long i;

    public p()
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

    p(int j, int k, long l, long l1, boolean flag, 
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

    public static p a()
    {
        return new p();
    }

    public static void a(long l)
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException((new StringBuilder(38)).append("invalid interval: ").append(l).toString());
        } else
        {
            return;
        }
    }

    public final p a(int j)
    {
        switch (j)
        {
        case 101: // 'e'
        case 103: // 'g'
        default:
            throw new IllegalArgumentException((new StringBuilder(28)).append("invalid quality: ").append(j).toString());

        case 100: // 'd'
        case 102: // 'f'
        case 104: // 'h'
        case 105: // 'i'
            b = j;
            break;
        }
        return this;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof p))
            {
                return false;
            }
            obj = (p)obj;
            if (b != ((p) (obj)).b || c != ((p) (obj)).c || d != ((p) (obj)).d || e != ((p) (obj)).e || f != ((p) (obj)).f || g != ((p) (obj)).g || h != ((p) (obj)).h)
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
    //                   100 300
    //                   101 56
    //                   102 306
    //                   103 56
    //                   104 312
    //                   105 318;
           goto _L1 _L2 _L1 _L3 _L1 _L4 _L5
_L1:
        String s1 = "???";
_L7:
        stringbuilder1.append(s1);
        if (b != 105)
        {
            stringbuilder.append(" requested=");
            long l = c;
            stringbuilder.append((new StringBuilder(22)).append(l).append("ms").toString());
        }
        stringbuilder.append(" fastest=");
        long l1 = d;
        stringbuilder.append((new StringBuilder(22)).append(l1).append("ms").toString());
        if (i > c)
        {
            stringbuilder.append(" maxWait=");
            long l2 = i;
            stringbuilder.append((new StringBuilder(22)).append(l2).append("ms").toString());
        }
        if (f != 0x7fffffffffffffffL)
        {
            long l3 = f;
            long l4 = SystemClock.elapsedRealtime();
            stringbuilder.append(" expireIn=");
            stringbuilder.append((new StringBuilder(22)).append(l3 - l4).append("ms").toString());
        }
        if (g != 0x7fffffff)
        {
            stringbuilder.append(" num=").append(g);
        }
        stringbuilder.append(']');
        return stringbuilder.toString();
_L2:
        s1 = "PRIORITY_HIGH_ACCURACY";
        continue; /* Loop/switch isn't completed */
_L3:
        s1 = "PRIORITY_BALANCED_POWER_ACCURACY";
        continue; /* Loop/switch isn't completed */
_L4:
        s1 = "PRIORITY_LOW_POWER";
        continue; /* Loop/switch isn't completed */
_L5:
        s1 = "PRIORITY_NO_POWER";
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final void writeToParcel(Parcel parcel, int j)
    {
        s.a(this, parcel);
    }

}
