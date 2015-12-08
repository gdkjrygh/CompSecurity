// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import android.content.Context;
import com.b.a.a;
import com.b.a.t;
import com.b.a.u;

// Referenced classes of package b.a:
//            gg, hd, hv, ea, 
//            fp, gf, fg, fs, 
//            et, fh, b, hz, 
//            hx

public final class hy
{

    private gg a;
    private hd b;
    private final int c = 1;
    private Context d;
    private b e;
    private hv f;
    private et g;
    private boolean h;
    private boolean i;

    public hy(Context context, b b1)
    {
        h = false;
        a = b.a.gg.a(context);
        b = b.a.hd.a(context);
        d = context;
        e = b1;
        f = new hv(context);
        f.a(e);
    }

    static int a(hy hy1, byte abyte0[])
    {
        return hy1.a(abyte0);
    }

    private int a(byte abyte0[])
    {
        ea ea1 = new ea();
        fp fp1 = new fp(new gf());
        try
        {
            fp1.a(ea1, abyte0);
            if (ea1.a == 1)
            {
                b.a(ea1.f());
                b.b();
            }
            b.a.fg.a("MobclickAgent", (new StringBuilder("send log:")).append(ea1.c()).toString());
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            abyte0.printStackTrace();
        }
        return ea1.a != 1 ? 3 : 2;
    }

    static hv a(hy hy1)
    {
        return hy1.f;
    }

    static b b(hy hy1)
    {
        return hy1.e;
    }

    private static byte[] b(et et1)
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
                fg.c("MobclickAgent", et1.toString());
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

    static boolean c(hy hy1)
    {
        return hy1.i;
    }

    public final void a()
    {
        i = true;
    }

    public final void a(et et1)
    {
        g = et1;
    }

    public final void a(hx hx)
    {
        b.a(hx);
    }

    public final void a(boolean flag)
    {
        h = flag;
    }

    public final void b()
    {
        if (g != null)
        {
            a.a();
            Object obj = g;
            ((et) (obj)).a(a.b());
            obj = b(((et) (obj)));
            if (obj == null)
            {
                fg.d("MobclickAgent", "message is null");
                return;
            }
            byte abyte0[];
            int j;
            if (!h)
            {
                obj = b.a.fh.a(d, com.b.a.a.a(d), ((byte []) (obj)));
            } else
            {
                obj = fh.b(d, com.b.a.a.a(d), ((byte []) (obj)));
            }
            obj = ((fh) (obj)).a();
            t.a(d);
            t.g();
            abyte0 = f.a(((byte []) (obj)));
            if (abyte0 == null)
            {
                j = 1;
            } else
            {
                j = a(abyte0);
            }
            switch (j)
            {
            default:
                return;

            case 1: // '\001'
                if (!i)
                {
                    t.a(d).b(((byte []) (obj)));
                }
                fg.b("MobclickAgent", "connection error");
                return;

            case 2: // '\002'
                if (e.d())
                {
                    e.c();
                }
                a.c();
                e.b();
                return;

            case 3: // '\003'
                e.b();
                return;
            }
        } else
        {
            t.a(d).i().a(new hz(this));
            return;
        }
    }
}
