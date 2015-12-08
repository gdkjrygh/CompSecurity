// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.richmedia;

import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;

// Referenced classes of package com.tremorvideo.sdk.android.richmedia:
//            ab, an, b, aa, 
//            l, z, k, e

public class al extends ab
{
    protected class a extends k
    {

        public float a;
        public int b;
        public float c;
        public int d;
        public float e;
        public int f;
        public float g;
        public int h;
        public int i;
        public boolean j;
        final al k;

        public void a(e e1)
        {
            super.a(e1);
            try
            {
                a = e1.d();
                b = e1.b();
                c = e1.d();
                d = e1.b();
                e = e1.d();
                f = e1.b();
                g = e1.d();
                h = e1.b();
                i = (int)e1.d();
                j = e1.f();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (e e1)
            {
                return;
            }
        }

        protected a()
        {
            k = al.this;
            super();
        }
    }


    public al(z z)
    {
        super(z);
    }

    public void a(aa aa1, long l1)
    {
    }

    public l c(aa aa1, long l1)
    {
        ab.a a1 = a(l1);
        if (a1 != null)
        {
            a a2 = (a)a1.a;
            a a3 = (a)a1.b;
            float f3 = a1.c;
            if (a2.j)
            {
                float f = an.b(a2.a, a3.a, a2.b, a3.b, f3);
                float f1 = an.b(a2.c, a3.c, a2.d, a3.d, f3);
                float f2 = an.b(a2.e, a3.e, a2.f, a3.f, f3);
                f3 = an.b(a2.g, a3.g, a2.h, a3.h, f3);
                PointF pointf = b.a(f2, f3, c.c());
                aa1.a(f - pointf.x, f1 - pointf.y, f2, f3, k, c.c());
                f3 = aa1.h();
                f2 = aa1.i();
                float f4 = aa1.j();
                float f5 = aa1.k();
                f1 = f2;
                f = f3;
                if (c.a() != null)
                {
                    Object obj = c.a().b(aa1, l1);
                    f = ((l) (obj)).a;
                    f1 = ((l) (obj)).b;
                    obj = b.a(Math.round(((l) (obj)).f), Math.round(((l) (obj)).g), c.b());
                    f = f3 + f + (float)((Point) (obj)).x;
                    f1 = f2 + f1 + (float)((Point) (obj)).y;
                }
                aa1 = a(aa1, l1, new RectF(f, f1, f4 + f, f5 + f1));
                return new l(((RectF) (aa1)).left, ((RectF) (aa1)).top, aa1.width(), aa1.height(), 1.0F, 1.0F, 0.0F);
            }
        }
        return l.h;
    }

    protected k h()
    {
        return j();
    }

    protected a j()
    {
        return new a();
    }
}
