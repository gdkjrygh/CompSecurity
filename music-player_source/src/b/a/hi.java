// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import android.content.Context;
import android.text.TextUtils;
import com.b.a.a;
import com.b.a.a.c;
import com.b.a.i;
import com.b.a.r;
import com.b.a.t;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package b.a:
//            hr, hx, j, hu, 
//            b, hk, et, fp, 
//            fg, eh, aj, ct, 
//            gg, fh, hj, fs, 
//            hy, ff, l, hs

public final class hi
    implements hr, hx, c
{

    private hu a;
    private t b;
    private b c;
    private j d;
    private hk e;
    private int f;
    private int g;
    private Context h;

    public hi(Context context)
    {
        a = null;
        b = null;
        c = null;
        d = new j();
        e = null;
        f = 10;
        h = context;
        a = new hu(context);
        c = new b(context);
        b = t.a(context);
        context = d;
        t t1 = b;
        context.a(t.c());
        e = new hk(this);
        context = b;
        g = t.e();
    }

    private static et a(byte abyte0[])
    {
        if (abyte0 == null)
        {
            return null;
        }
        et et1;
        try
        {
            et1 = new et();
            (new fp()).a(et1, abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            abyte0.printStackTrace();
            return null;
        }
        return et1;
    }

    private transient et a(int ai[])
    {
        boolean flag = false;
        if (!TextUtils.isEmpty(com.b.a.a.a(h)))
        {
            break MISSING_BLOCK_LABEL_25;
        }
        fg.b("MobclickAgent", "Appkey is missing ,Please check AndroidManifest.xml");
        return null;
        Object obj;
        try
        {
            t.a(h);
            obj = t.f();
        }
        // Misplaced declaration of an exception variable
        catch (int ai[])
        {
            fg.b("MobclickAgent", "Fail to construct message ...", ai);
            t.a(h);
            t.g();
            return null;
        }
        if (obj != null) goto _L2; else goto _L1
_L1:
        obj = null;
_L4:
        if (obj != null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (a.a() == 0)
        {
            return null;
        }
        break; /* Loop/switch isn't completed */
_L2:
        obj = a(((byte []) (obj)));
        if (true) goto _L4; else goto _L3
_L3:
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        obj = new et();
        a.a(((et) (obj)));
        if (!b.a.fg.a || !((et) (obj)).m())
        {
            break MISSING_BLOCK_LABEL_152;
        }
        for (Iterator iterator = ((et) (obj)).l().iterator(); iterator.hasNext();)
        {
            if (((eh)iterator.next()).h() > 0)
            {
                flag = true;
            }
        }

        if (flag)
        {
            break MISSING_BLOCK_LABEL_152;
        }
        fg.d("MobclickAgent", "missing Activities or PageViews");
        obj = d.a(h, ((et) (obj)));
        if (ai == null)
        {
            break MISSING_BLOCK_LABEL_242;
        }
        if (ai.length != 2)
        {
            break MISSING_BLOCK_LABEL_242;
        }
        aj aj1 = new aj();
        aj1.a(new ct(ai[0] / 1000, ai[1]));
        ((et) (obj)).a(aj1);
        return ((et) (obj));
        return ((et) (obj));
    }

    static t a(hi hi1)
    {
        return hi1.b;
    }

    static void a(hi hi1, int k)
    {
        Object obj = hi1.a(new int[] {
            k, (int)(System.currentTimeMillis() - hi1.c.f())
        });
        if (obj != null)
        {
            gg gg1 = b.a.gg.a(hi1.h);
            gg1.a();
            ((et) (obj)).a(gg1.b());
            obj = a(((et) (obj)));
            if (obj != null)
            {
                t t1;
                if (hi1.d())
                {
                    obj = fh.b(hi1.h, com.b.a.a.a(hi1.h), ((byte []) (obj)));
                } else
                {
                    obj = b.a.fh.a(hi1.h, com.b.a.a.a(hi1.h), ((byte []) (obj)));
                }
                obj = ((fh) (obj)).a();
                t1 = t.a(hi1.h);
                t.g();
                t1.b(((byte []) (obj)));
                gg1.c();
            }
        }
        r.a(new hj(hi1), k);
    }

    private static byte[] a(et et1)
    {
        if (et1 == null)
        {
            return null;
        }
        byte abyte0[];
        try
        {
            abyte0 = (new fs()).a(et1);
            if (b.a.fg.a)
            {
                b.a.fg.c("MobclickAgent", et1.toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (et et1)
        {
            fg.b("MobclickAgent", "Fail to serialize log ...", et1);
            return null;
        }
        return abyte0;
    }

    static b b(hi hi1)
    {
        return hi1.c;
    }

    static j c(hi hi1)
    {
        return hi1.d;
    }

    private void c()
    {
        if (b.h())
        {
            hy hy1 = new hy(h, c);
            hy1.a(this);
            if (d.b())
            {
                hy1.a();
            }
            hy1.b();
            return;
        }
        Object obj = a(new int[0]);
        if (obj == null)
        {
            try
            {
                b.a.fg.a("MobclickAgent", "No data to report");
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((Throwable) (obj)).printStackTrace();
            }
            return;
        }
        hy hy2 = new hy(h, c);
        hy2.a(this);
        if (d.b())
        {
            hy2.a();
        }
        hy2.a(((et) (obj)));
        hy2.a(d());
        hy2.b();
        return;
    }

    static Context d(hi hi1)
    {
        return hi1.h;
    }

    private boolean d()
    {
        switch (g)
        {
        case 0: // '\0'
        default:
            return false;

        case 1: // '\001'
            return true;

        case -1: 
            return a.f;
        }
    }

    public final void a()
    {
        if (ff.g(h))
        {
            c();
        } else
        if (b.a.fg.a)
        {
            b.a.fg.c("MobclickAgent", "network is unavailable");
            return;
        }
    }

    public final void a(int k)
    {
        if (k >= 0 && k <= 3)
        {
            d.a(k);
            e.b(k);
        }
    }

    public final void a(hs hs)
    {
        boolean flag;
        boolean flag2;
        flag = true;
        if (hs != null)
        {
            a.a(hs);
        }
        boolean flag1 = hs instanceof eh;
        flag2 = c.a();
        if (flag2)
        {
            a.a(new l(c.e()));
        }
        if (!ff.g(h))
        {
            if (b.a.fg.a)
            {
                b.a.fg.c("MobclickAgent", "network is unavailable");
            }
            flag1 = false;
        } else
        if (c.a())
        {
            flag1 = true;
        } else
        if (b.a.fg.a && ff.q(h))
        {
            flag1 = true;
        } else
        {
            flag1 = e.a().a(flag1);
        }
        if (!flag1) goto _L2; else goto _L1
_L1:
        c();
_L4:
        return;
_L2:
        if (flag2)
        {
            break; /* Loop/switch isn't completed */
        }
        if (a.a() <= f)
        {
            flag = false;
        }
        if (!flag) goto _L4; else goto _L3
_L3:
        b();
        return;
    }

    public final void b()
    {
        if (a.a() <= 0)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        byte abyte0[];
        t t1;
        try
        {
            abyte0 = a(a(new int[0]));
        }
        catch (Throwable throwable)
        {
            if (throwable instanceof OutOfMemoryError)
            {
                t t2 = b;
                t.g();
            }
            throwable.printStackTrace();
            return;
        }
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        t1 = b;
        t.a(abyte0);
    }

    public final void b(int k)
    {
        if (k > 0)
        {
            e.a(k);
        }
    }

    public final void b(hs hs)
    {
        a.a(hs);
    }

    public final void c(int k)
    {
        g = k;
    }
}
