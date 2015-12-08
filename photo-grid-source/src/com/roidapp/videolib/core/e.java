// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.videolib.core;

import com.roidapp.videolib.b.u;
import com.roidapp.videolib.c;
import com.roidapp.videolib.d;
import java.nio.ByteBuffer;
import jp.co.cyberagent.android.a.a;

// Referenced classes of package com.roidapp.videolib.core:
//            f, g

public class e
{

    public static final String a[] = {
        "effect_onelove.mp4", "mask_onelove.mp4", "effect_christmas.mp4", "mask_christmas.mp4"
    };
    public static int b = 6;
    private static final String e = com/roidapp/videolib/core/e.getSimpleName();
    private static byte f[] = null;
    private static final int i[] = {
        640, 640
    };
    long c;
    public Object d;
    private g g[];
    private String h[];

    public e()
    {
        c = 0L;
        g = null;
        h = null;
        d = new Object();
    }

    public static int a(int j)
    {
        if (j == a.K - 1)
        {
            return c.a;
        }
        if (j == a.J - 1)
        {
            return c.j;
        }
        if (j == a.w - 1)
        {
            return d.u;
        } else
        {
            return 0;
        }
    }

    public static boolean a(u u1)
    {
        return u1 == u.b || u1 == u.c;
    }

    public static int[] a()
    {
        return i;
    }

    public static String[] b(u u1)
    {
        switch (com.roidapp.videolib.core.f.a[u1.ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            return (new String[] {
                "effect_onelove.mp4", "mask_onelove.mp4"
            });

        case 2: // '\002'
            return (new String[] {
                "effect_christmas.mp4", "mask_christmas.mp4"
            });
        }
    }

    public static int c(u u1)
    {
        switch (com.roidapp.videolib.core.f.a[u1.ordinal()])
        {
        default:
            return 0;

        case 1: // '\001'
            return 6;

        case 2: // '\002'
            return 3;
        }
    }

    private boolean f()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (g != null)
        {
            g ag[] = g;
            int k = ag.length;
            int j = 0;
            for (flag = false; j < k; flag = true)
            {
                g g1 = ag[j];
                if (g1 != null)
                {
                    flag = flag1;
                    if (!g1.b().d())
                    {
                        break;
                    }
                }
                j++;
            }

        }
        return flag;
    }

    public final int a(ByteBuffer abytebuffer[], long l)
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        if (g == null || abytebuffer == null)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        if (g.length == abytebuffer.length)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        obj;
        JVM INSTR monitorexit ;
        return -1;
_L8:
        long l1 = g[0].b().c() / 1000L;
        if (l1 > l) goto _L2; else goto _L1
_L1:
        if (f()) goto _L2; else goto _L3
_L3:
        int j = 0;
_L6:
        if (j >= g.length)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (g[j].b().d() || abytebuffer[j] == null)
        {
            break MISSING_BLOCK_LABEL_192;
        }
        try
        {
            if (f == null)
            {
                f = new byte[0x190000];
            }
            if (g[j].a(f) == 0)
            {
                abytebuffer[j].position(0);
                abytebuffer[j].put(f);
                abytebuffer[j].position(0);
            }
            break MISSING_BLOCK_LABEL_192;
        }
        // Misplaced declaration of an exception variable
        catch (ByteBuffer abytebuffer[]) { }
        finally { }
          goto _L4
_L2:
        c = l1;
        obj;
        JVM INSTR monitorexit ;
        return 0;
        obj;
        JVM INSTR monitorexit ;
        throw abytebuffer;
_L4:
        abytebuffer.getMessage();
        obj;
        JVM INSTR monitorexit ;
        return -1;
        j++;
        if (true) goto _L6; else goto _L5
_L5:
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final void a(String as[])
    {
        h = as;
    }

    public final int b()
    {
        int k = 0;
        g = new g[h.length];
        int j = 0;
        do
        {
label0:
            {
                if (k < h.length)
                {
                    g[k] = new g(h[k]);
                    j = g[k].a();
                    if (j == 0)
                    {
                        break label0;
                    }
                }
                return j;
            }
            k++;
        } while (true);
    }

    public final long c()
    {
        return c;
    }

    public final boolean d()
    {
        boolean flag;
        synchronized (d)
        {
            flag = f();
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void e()
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        if (g == null)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        int j = 0;
_L2:
        if (j >= g.length)
        {
            break; /* Loop/switch isn't completed */
        }
        if (g[j] != null)
        {
            g[j].c();
        }
        g[j] = null;
        j++;
        if (true) goto _L2; else goto _L1
_L1:
        g = null;
        h = null;
        c = 0L;
        System.gc();
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

}
