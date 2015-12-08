// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bf;

import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.ay.k;
import com.google.android.m4b.maps.bd.d;
import com.google.android.m4b.maps.bo.aa;
import com.google.android.m4b.maps.bo.ac;
import com.google.android.m4b.maps.bq.j;
import com.google.android.m4b.maps.cc.q;
import java.util.Map;

// Referenced classes of package com.google.android.m4b.maps.bf:
//            c, b, a

final class <init>
    implements d
{

    private c a;

    private q a(b b1)
    {
        q q1 = a.b(b1.a);
        if (q1 != null)
        {
            k.a();
            if (q1.c())
            {
                c.b(a, b1.a, q1);
                return q1;
            }
        }
        if (q1 == null)
        {
            Pair pair = (Pair)com.google.android.m4b.maps.bf.c.d(a).get(b1.a);
            if (pair != null)
            {
                if (b1.b)
                {
                    com.google.android.m4b.maps.bf.c.d(a).remove(b1.a);
                    c.f(a);
                } else
                {
                    com.google.android.m4b.maps.bf.c.d(a).put(b1.a, Pair.create(b1, pair.second));
                }
                return c.b();
            }
            synchronized (c.e(a))
            {
                if (c.e(a).a(b1))
                {
                    com.google.android.m4b.maps.bf.c.d(a).put(b1.a, Pair.create(b1, Long.valueOf(SystemClock.elapsedRealtime())));
                    c.g(a);
                    c.a(a, b1.a, b1.b, c.h(a));
                }
            }
            return q1;
        } else
        {
            return q1;
        }
        b1;
        a1;
        JVM INSTR monitorexit ;
        throw b1;
    }

    private void a(b b1, boolean flag)
    {
        do
        {
            b1 = c.e(a).a(b1, flag);
            if (b1 == null)
            {
                break;
            }
            q q1 = a(b1);
            if (q1 == null)
            {
                break;
            }
            if (q1 != c.b())
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } while (true);
    }

    public final void a(ac ac, int i, aa aa)
    {
        boolean flag;
        boolean flag1;
        flag1 = true;
        flag = true;
        if (ac != j.d) goto _L2; else goto _L1
_L1:
        synchronized (c.e(a))
        {
            aa = c.i(a);
            com.google.android.m4b.maps.bf.c.j(a);
        }
        a(((b) (aa)), true);
_L4:
        return;
        aa;
        ac;
        JVM INSTR monitorexit ;
        throw aa;
_L2:
        Pair pair;
        pair = (Pair)com.google.android.m4b.maps.bf.c.d(a).get(ac);
        if (pair != null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (ab.a("TileFetcher", 6))
        {
            ac = String.valueOf(ac);
            Log.e("TileFetcher", (new StringBuilder(String.valueOf(ac).length() + 25)).append("Received an unknown tile ").append(ac).toString());
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (c.e(a).a((b)pair.first)) goto _L6; else goto _L5
_L5:
        aa = null;
        i = 0;
_L8:
        flag1 = false;
_L10:
        if (flag)
        {
            com.google.android.m4b.maps.bf.c.d(a).remove(ac);
            c.f(a);
        }
        if (i != 0)
        {
            a((b)pair.first, flag1);
        }
        if (aa != null)
        {
            SystemClock.elapsedRealtime();
            ((Long)pair.second).longValue();
            c.a(a, ac, aa);
            return;
        }
          goto _L4
_L6:
label0:
        {
            if (i != 3)
            {
                break label0;
            }
            flag = ((b)pair.first).b;
            i = 1;
            aa = null;
        }
        if (true) goto _L8; else goto _L7
_L7:
label1:
        {
            aa = c.a(a, ac, i, aa);
            if (aa == null || aa == c.b())
            {
                break label1;
            }
            flag = true;
            i = 1;
        }
        if (true) goto _L10; else goto _L9
_L9:
        i = 1;
          goto _L8
    }

    private (c c1)
    {
        a = c1;
        super();
    }

    a(c c1, byte byte0)
    {
        this(c1);
    }
}
