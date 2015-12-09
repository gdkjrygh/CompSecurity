// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.l;

import android.graphics.Bitmap;
import p.ah.a;
import p.ah.d;
import p.ak.e;
import p.x.f;
import p.x.g;
import p.x.j;

// Referenced classes of package p.l:
//            a, e, g

public class b extends p.l.a
{

    private final j g;
    private final j h;
    private final p.l.g i;
    private final j.c j;

    b(p.l.e e1, j j1, j j2, j.c c)
    {
        super(a(e1.c, j1, j2, android/graphics/Bitmap, null), android/graphics/Bitmap, e1);
        g = j1;
        h = j2;
        i = e1.c;
        j = c;
    }

    private static e a(p.l.g g1, j j1, j j2, Class class1, d d)
    {
        if (j1 == null && j2 == null)
        {
            return null;
        }
        d d1 = d;
        if (d == null)
        {
            d1 = g1.a(android/graphics/Bitmap, class1);
        }
        g1 = g1.b(p/x/g, android/graphics/Bitmap);
        return new e(new f(j1, j2), d1, g1);
    }

    public p.l.a a(d d, Class class1)
    {
        return (p.l.a)j.a(new p.l.a(a(i, g, h, class1, d), class1, this));
    }

    public p.l.a g()
    {
        return a(new a(), [B);
    }
}
