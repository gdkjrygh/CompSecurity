// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.net.Proxy;
import java.net.Socket;

public final class gul
    implements gus
{

    private final gui a;
    private final gua b;

    public gul(gui gui1, gua gua1)
    {
        a = gui1;
        b = gua1;
    }

    public final grv a(grt grt1)
    {
        Object obj;
        if (!gui.a(grt1))
        {
            obj = b.a(0L);
        } else
        if ("chunked".equalsIgnoreCase(grt1.a("Transfer-Encoding", null)))
        {
            obj = b;
            gui gui1 = a;
            if (((gua) (obj)).e != 4)
            {
                throw new IllegalStateException((new StringBuilder("state: ")).append(((gua) (obj)).e).toString());
            }
            obj.e = 5;
            obj = new gud(((gua) (obj)), gui1);
        } else
        {
            long l = gum.a(grt1);
            if (l != -1L)
            {
                obj = b.a(l);
            } else
            {
                obj = b;
                if (((gua) (obj)).e != 4)
                {
                    throw new IllegalStateException((new StringBuilder("state: ")).append(((gua) (obj)).e).toString());
                }
                obj.e = 5;
                obj = new gug(((gua) (obj)), (byte)0);
            }
        }
        return new gun(grt1.f, hcq.a(((hcw) (obj))));
    }

    public final hcv a(grq grq1, long l)
    {
        if ("chunked".equalsIgnoreCase(grq1.a("Transfer-Encoding")))
        {
            grq1 = b;
            if (((gua) (grq1)).e != 1)
            {
                throw new IllegalStateException((new StringBuilder("state: ")).append(((gua) (grq1)).e).toString());
            } else
            {
                grq1.e = 2;
                return new guc(grq1, (byte)0);
            }
        }
        if (l != -1L)
        {
            grq1 = b;
            if (((gua) (grq1)).e != 1)
            {
                throw new IllegalStateException((new StringBuilder("state: ")).append(((gua) (grq1)).e).toString());
            } else
            {
                grq1.e = 2;
                return new gue(grq1, l, (byte)0);
            }
        } else
        {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
    }

    public final void a()
    {
        b.a();
    }

    public final void a(grq grq1)
    {
        a.b();
        Object obj = a.b.b.b.type();
        com.squareup.okhttp.Protocol protocol = a.b.g;
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(grq1.b);
        stringbuilder.append(' ');
        boolean flag;
        if (!grq1.e() && obj == java.net.Proxy.Type.HTTP)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            stringbuilder.append(grq1.a);
        } else
        {
            stringbuilder.append(guo.a(grq1.a));
        }
        stringbuilder.append(' ');
        stringbuilder.append(guo.a(protocol));
        obj = stringbuilder.toString();
        b.a(grq1.c, ((String) (obj)));
    }

    public final void a(gui gui1)
    {
        gua gua1 = b;
        gsf.b.a(gua1.b, gui1);
    }

    public final void a(gup gup1)
    {
        gua gua1 = b;
        if (gua1.e != 1)
        {
            throw new IllegalStateException((new StringBuilder("state: ")).append(gua1.e).toString());
        } else
        {
            gua1.e = 3;
            gup1.a(gua1.d);
            return;
        }
    }

    public final gru b()
    {
        return b.c();
    }

    public final void c()
    {
        if (d())
        {
            gua gua1 = b;
            gua1.f = 1;
            if (gua1.e == 0)
            {
                gua1.f = 0;
                gsf.b.a(gua1.a, gua1.b);
            }
        } else
        {
            gua gua2 = b;
            gua2.f = 2;
            if (gua2.e == 0)
            {
                gua2.e = 6;
                gua2.b.c.close();
                return;
            }
        }
    }

    public final boolean d()
    {
        if (!"close".equalsIgnoreCase(a.d.a("Connection")) && !"close".equalsIgnoreCase(a.f().a("Connection", null)))
        {
            boolean flag;
            if (b.e == 6)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag)
            {
                return true;
            }
        }
        return false;
    }
}
