// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.List;

final class ang.Object
    implements anM
{
    final class a
        implements anQ
    {

        anZ a;
        private final aoq b;
        private final List c = new ArrayList();
        private anK.g d;

        public final void a()
        {
            anK.a(b);
        }

        public final void a(int i, Exception exception)
        {
            b.a(i, exception);
        }

        public final void a(Object obj)
        {
            obj = (aon)obj;
            c.addAll(((aon) (obj)).b);
            if (((aon) (obj)).c != null)
            {
                a = new anZ(a, ((aon) (obj)).c);
                anK.a(d.c, a, d.a);
                return;
            } else
            {
                b.a(new aon(((aon) (obj)).a, c, null));
                return;
            }
        }

        public a(aoq aoq1)
        {
            d = anK.g.this;
            super();
            b = aoq1;
        }
    }


    final Object a;
    final boolean b;
    final anK c;

    public final int a(aox aox1, String s, aok aok)
    {
        String s1 = aox1.a;
        aox1 = aox1.b;
        anR.a(s1);
        anR.a(aox1);
        return c.a(new aol(s1, aox1, s), a(((aoq) (aok))), a);
    }

    public final int a(String s, aoq aoq)
    {
        anR.a(s);
        aoq = new a(aoq);
        s = new anZ(s, anK.j(c));
        aoq.a = s;
        return c.a(s, a(aoq), a);
    }

    public final int a(String s, List list, aoq aoq)
    {
        anR.a(s);
        anR.a(list);
        return c.a(new aoa(s, list), a(aoq), a);
    }

    final aoq a(aoq aoq)
    {
        Object obj = aoq;
        if (b)
        {
            obj = new aoe(c.b, aoq);
        }
        return ((aoq) (obj));
    }

    public final int b(String s, aoq aoq)
    {
        anR.a(s);
        return c.a(new anV(s), a(aoq), a);
    }

    private (anK ank, Object obj, boolean flag)
    {
        c = ank;
        super();
        a = obj;
        b = flag;
    }

    (anK ank, Object obj, boolean flag, byte byte0)
    {
        this(ank, obj, flag);
    }
}
