// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.l;

import android.content.Context;
import p.ah.d;
import p.ai.g;
import p.ai.m;
import p.ak.e;
import p.x.j;

// Referenced classes of package p.l:
//            e, g

public class f extends p.l.e
{

    private final j g;
    private final Class h;
    private final Class i;
    private final j.c j;

    f(Context context, p.l.g g1, Class class1, j j1, Class class2, Class class3, m m, 
            g g2, j.c c)
    {
        super(context, class1, a(g1, j1, class2, class3, p.ah.f.b()), class3, g1, m, g2);
        g = j1;
        h = class2;
        i = class3;
        j = c;
    }

    private static p.ak.f a(p.l.g g1, j j1, Class class1, Class class2, d d)
    {
        return new e(j1, d, g1.b(class1, class2));
    }
}
