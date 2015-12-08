// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import com.google.android.m4b.maps.ac.a;
import com.google.android.m4b.maps.ac.c;
import com.google.android.m4b.maps.ay.n;
import com.google.android.m4b.maps.cq.e;
import com.google.android.m4b.maps.cq.x;
import com.google.android.m4b.maps.model.MapsEngineLayerInfo;
import java.io.DataInput;
import java.io.DataOutput;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            z

final class i extends n
{

    private static final long a;
    private final MapsEngineLayerInfo b;
    private final z c;
    private int d;
    private a e;
    private long f;

    i(MapsEngineLayerInfo mapsenginelayerinfo, z z1)
    {
        b = mapsenginelayerinfo;
        c = z1;
    }

    private static void a(a a1, String s, String s1)
    {
        a a2 = new a(e.i);
        a2.b(1, s);
        a2.b(2, s1);
        a1.a(2, a2);
    }

    public final void a(DataOutput dataoutput)
    {
        a a1 = new a(x.a);
        if (b.b != null)
        {
            a a2 = new a(x.b);
            a2.b(1, b.b);
            a2.b(2, b.c);
            a2.b(3, b.f);
            a1.b(2, a2);
        } else
        {
            a a3 = new a(x.c);
            a3.b(1, b.d);
            a3.b(2, b.f);
            a1.b(4, a3);
        }
        com.google.android.m4b.maps.ac.c.a(dataoutput, a1);
    }

    public final boolean a(DataInput datainput)
    {
        a a1;
        a1 = com.google.android.m4b.maps.ac.c.a(x.d, datainput);
        d = a1.d(1);
        if (d != 1) goto _L2; else goto _L1
_L1:
        a a2 = new a(e.h);
        if (!a1.i(4)) goto _L4; else goto _L3
_L3:
        datainput = a1.f(4);
        if (datainput.i(1))
        {
            String s = String.valueOf("ft:cw:");
            long l = datainput.e(1);
            a2.b(1, (new StringBuilder(String.valueOf(s).length() + 20)).append(s).append(l).toString());
            a(a2, "y", String.valueOf(datainput.e(2)));
            a(a2, "tmplt", String.valueOf(datainput.e(3)));
            if (a1.i(2))
            {
                a(a2, "cw_token", a1.g(2));
            }
        } else
        {
            String s1 = String.valueOf("vdb:");
            datainput = String.valueOf(datainput.g(5));
            if (datainput.length() != 0)
            {
                datainput = s1.concat(datainput);
            } else
            {
                datainput = new String(s1);
            }
            a2.b(1, datainput);
        }
_L5:
        e = a2;
        f = com.google.android.m4b.maps.ac.c.a(a1, a);
        return true;
_L4:
        if (a1.i(5))
        {
            datainput = a1.f(5);
            a2.b(1, datainput.g(1));
            a(a2, "v", String.valueOf(datainput.d(2)));
            if (a1.i(2))
            {
                a(a2, "authToken", a1.g(2));
            }
        }
        if (true) goto _L5; else goto _L2
_L2:
        e = null;
        f = -1L;
        return true;
    }

    public final void b()
    {
        super.b();
        d;
        JVM INSTR tableswitch 1 3: default 36
    //                   1 45
    //                   2 36
    //                   3 121;
           goto _L1 _L2 _L1 _L3
_L1:
        c.g = 0;
_L5:
        return;
_L2:
        z z1;
        a a1;
        long l;
        z1 = c;
        a1 = e;
        l = f;
        z1.g = 0;
        z1;
        JVM INSTR monitorenter ;
        z1.d = a1;
        if (z1.e != null)
        {
            z1.e.a(a1);
        }
        z1;
        JVM INSTR monitorexit ;
        if (l > 0L)
        {
            z1.c = z1.b.schedule(z1, l, TimeUnit.MILLISECONDS);
            return;
        }
        continue; /* Loop/switch isn't completed */
        Exception exception;
        exception;
        z1;
        JVM INSTR monitorexit ;
        throw exception;
_L3:
        z z2 = c;
        z2.f = true;
        long l1 = (long)(200D * Math.pow(2D, z2.g));
        if (l1 < com.google.android.m4b.maps.cg.z.a)
        {
            z2.c = z2.b.schedule(z2, l1, TimeUnit.MILLISECONDS);
            z2.g = z2.g + 1;
            return;
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final int g()
    {
        return 148;
    }

    static 
    {
        a = TimeUnit.HOURS.toMillis(1L);
    }
}
