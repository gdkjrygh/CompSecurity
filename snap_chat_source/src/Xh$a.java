// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

final class c
    implements lang.Object
{

    private final int a;
    private final Xy b;
    private final boolean c;
    private Xh d;

    public final XA a(Xy xy)
    {
        if (a < d.a.h.size())
        {
            xy = new <init>(d, a + 1, xy, c);
            return ((Xt)d.a.h.get(a)).a(xy);
        } else
        {
            return d.a(xy, c);
        }
    }

    public final Xy a()
    {
        return b;
    }

    >(Xh xh, int i, Xy xy, boolean flag)
    {
        d = xh;
        super();
        a = i;
        b = xy;
        c = flag;
    }
}
