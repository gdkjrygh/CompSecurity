// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;

final class jcs
    implements gfz
{

    private jcr a;

    jcs(jcr jcr1)
    {
        a = jcr1;
        super();
    }

    public final void a()
    {
        jcr jcr1 = a;
        int i = jcr1.e.d();
        Object obj = ((hpg)((ekp)jcr1.g.get(0)).a(hpg)).b();
        if (((hpk) (obj)).a())
        {
            obj = ((hpk) (obj)).c;
        } else
        {
            obj = null;
        }
        jcr1.m = jcr1.l.a((ekp)jcr1.g.get(0), ejm.c);
        obj = new ggf(i, ((String) (obj)), jcr1.m);
        jcr1.n.a(jcr1.m, jcr1);
        jcr1.d.a(((mtf) (obj)));
    }
}
