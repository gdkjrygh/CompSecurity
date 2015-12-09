// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.net.Socket;

abstract class gub
    implements hcw
{

    protected boolean a;
    private hcn b;
    private gua c;

    private gub(gua gua1)
    {
        c = gua1;
        super();
        b = new hcn(c.c.T_());
    }

    gub(gua gua1, byte byte0)
    {
        this(gua1);
    }

    public final hcx T_()
    {
        return b;
    }

    protected final void a(boolean flag)
    {
        if (c.e != 5)
        {
            throw new IllegalStateException((new StringBuilder("state: ")).append(c.e).toString());
        }
        gua.a(b);
        c.e = 0;
        if (flag && c.f == 1)
        {
            c.f = 0;
            gsf.b.a(c.a, c.b);
        } else
        if (c.f == 2)
        {
            c.e = 6;
            c.b.c.close();
            return;
        }
    }

    protected final void b()
    {
        gsp.a(c.b.c);
        c.e = 6;
    }
}
