// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.l;

import android.content.Context;
import p.ad.b;
import p.ag.a;
import p.ai.m;
import p.ak.e;
import p.x.f;
import p.x.g;
import p.x.j;

// Referenced classes of package p.l:
//            c, g, b

public class d extends c
{

    private final j g;
    private final j h;
    private final j.c i;

    d(Class class1, j j, j j1, Context context, p.l.g g1, m m, p.ai.g g2, 
            j.c c1)
    {
        super(context, class1, a(g1, j, j1, p/ag/a, p/ad/b, null), g1, m, g2);
        g = j;
        h = j1;
        i = c1;
    }

    private static e a(p.l.g g1, j j, j j1, Class class1, Class class2, p.ah.d d1)
    {
        if (j == null && j1 == null)
        {
            return null;
        }
        p.ah.d d2 = d1;
        if (d1 == null)
        {
            d2 = g1.a(class1, class2);
        }
        g1 = g1.b(p/x/g, class1);
        return new e(new f(j, j1), d2, g1);
    }

    public p.l.b h()
    {
        return (p.l.b)i.a(new p.l.b(this, g, h, i));
    }
}
