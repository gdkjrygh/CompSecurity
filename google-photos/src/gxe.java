// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

final class gxe
    implements gxr
{

    private gwu a;

    gxe(gwu gwu1)
    {
        a = gwu1;
        super();
    }

    public final void a(gxs gxs1)
    {
        gwu.l(a).add(gxs1);
        if (a())
        {
            gxs1.a();
            return;
        } else
        {
            gxs1.b();
            return;
        }
    }

    public final boolean a()
    {
        return gwu.m(a).a;
    }

    public final void b(gxs gxs1)
    {
        gxs1.b();
        gwu.l(a).remove(gxs1);
    }

    public final boolean b()
    {
        boolean flag;
        if (!gwu.n(a).a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return !flag;
    }
}
