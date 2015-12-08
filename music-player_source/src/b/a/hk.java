// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import android.content.Context;
import android.content.SharedPreferences;
import com.b.a.a;
import com.b.a.d;
import com.b.a.e;
import com.b.a.f;
import com.b.a.g;
import com.b.a.h;
import com.b.a.i;
import com.b.a.j;
import com.b.a.l;
import com.b.a.t;

// Referenced classes of package b.a:
//            hi, b

public final class hk
{

    final hi a;
    private final long b = 0x4d3f6400L;
    private final int c = 0x1b7740;
    private final int d = 10000;
    private i e;
    private int f;
    private int g;
    private int h;
    private int i;
    private boolean j;

    public hk(hi hi1)
    {
        a = hi1;
        super();
        j = false;
        b.a.hi.a(hi1);
        f = t.c();
        b.a.hi.a(hi1);
        int k = t.d();
        if (k > 0)
        {
            g = c(k);
        } else
        if (a.g > 0)
        {
            g = c(a.g);
        } else
        {
            g = 10000;
        }
        b.a.hi.a(hi1);
        hi1 = t.b();
        h = hi1[0];
        i = hi1[1];
    }

    private static int c(int k)
    {
        int i1 = k;
        if (k > 0x1b7740)
        {
            i1 = 0x1b7740;
        }
        return i1;
    }

    public final i a()
    {
        Object obj;
        boolean flag;
        int i1;
        obj = null;
        i1 = 1;
        flag = true;
        if (f <= 0) goto _L2; else goto _L1
_L1:
        if (!(e instanceof d) || !e.a())
        {
            flag = false;
        }
        if (flag)
        {
            obj = e;
        } else
        {
            obj = new d(hi.b(a), hi.c(a));
        }
        e = ((i) (obj));
_L10:
        j = false;
        return e;
_L2:
        int k;
        if ((e instanceof e) && e.a())
        {
            k = 1;
        } else
        {
            k = 0;
        }
        if (k != 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!b.a.hi.a(a).h() && !hi.b(a).a() && System.currentTimeMillis() - hi.b(a).f() > 0x4d3f6400L)
        {
            k = i1;
        } else
        {
            k = 0;
        }
        if (k != 0)
        {
            SharedPreferences sharedpreferences = b.a.hi.d(a).getSharedPreferences("umeng_general_config", 0);
            if (sharedpreferences != null)
            {
                obj = sharedpreferences.getString("signature", null);
            }
            k = l.a(g, ((String) (obj)));
            e = new e(k);
            b.a.hi.a(a, k);
            continue; /* Loop/switch isn't completed */
        }
        k = h;
        i1 = i;
        k;
        JVM INSTR tableswitch 0 6: default 296
    //                   0 362
    //                   1 312
    //                   2 296
    //                   3 296
    //                   4 344
    //                   5 373
    //                   6 323;
           goto _L3 _L4 _L5 _L3 _L3 _L6 _L7 _L8
_L7:
        break MISSING_BLOCK_LABEL_373;
_L5:
        break; /* Loop/switch isn't completed */
_L3:
        obj = new f();
_L11:
        e = ((i) (obj));
        if (true) goto _L10; else goto _L9
_L9:
        obj = new f();
          goto _L11
_L8:
        obj = new g(hi.b(a), i1);
          goto _L11
_L6:
        obj = new h(hi.b(a));
          goto _L11
_L4:
        obj = new i();
          goto _L11
        obj = new j(b.a.hi.d(a));
          goto _L11
    }

    public final void a(int k)
    {
        g = c(k);
        j = true;
    }

    public final void b(int k)
    {
        f = k;
        j = true;
    }
}
