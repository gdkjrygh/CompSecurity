// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.richmedia;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;

// Referenced classes of package com.tremorvideo.sdk.android.richmedia:
//            ab, z, a, c, 
//            an, aa, b, l, 
//            k, e

public class ag extends ab
{
    private class a extends k
    {

        public float a;
        public int b;
        public float c;
        public int d;
        public float e;
        public int f;
        public float g;
        public int h;
        public float i;
        public int j;
        public float k;
        public int l;
        public boolean m;
        public int n;
        final ag o;

        public void a(e e1)
        {
            super.a(e1);
            try
            {
                n = e1.b();
                i = e1.d();
                j = e1.b();
                k = e1.d();
                l = e1.b();
                e1.d();
                e1.b();
                a = e1.d();
                b = e1.b();
                c = e1.d();
                d = e1.b();
                e = e1.d();
                f = e1.b();
                g = e1.d();
                h = e1.b();
                m = e1.f();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (e e1)
            {
                return;
            }
        }

        private a()
        {
            o = ag.this;
            super();
        }

    }


    Bitmap l;

    public ag(z z1)
    {
        super(z1);
    }

    private Bitmap a(a a1)
    {
        if (l != null)
        {
            return l;
        } else
        {
            return g.f().p().a(a1.n);
        }
    }

    public void a(Bitmap bitmap)
    {
        l = bitmap;
    }

    public void a(aa aa1, long l1)
    {
        ab.a a1 = a(l1);
        if (a1 != null)
        {
            Object obj = (a)a1.a;
            Object obj1 = (a)a1.b;
            float f3 = a1.c;
            if (((a) (obj)).n != -1 && d(((a) (obj)).m))
            {
                int k = an.a(((a) (obj)).i, ((a) (obj1)).i, ((a) (obj)).j, ((a) (obj1)).j, f3);
                int i = an.a(((a) (obj)).k, ((a) (obj1)).k, ((a) (obj)).l, ((a) (obj1)).l, f3);
                float f2 = an.b(((a) (obj)).a, ((a) (obj1)).a, ((a) (obj)).b, ((a) (obj1)).b, f3);
                float f1 = an.b(((a) (obj)).c, ((a) (obj1)).c, ((a) (obj)).d, ((a) (obj1)).d, f3);
                float f5 = an.b(((a) (obj)).e, ((a) (obj1)).e, ((a) (obj)).f, ((a) (obj1)).f, f3);
                float f6 = an.b(((a) (obj)).g, ((a) (obj1)).g, ((a) (obj)).h, ((a) (obj1)).h, f3);
                Bitmap bitmap = a(((a) (obj)));
                f2 *= (float)bitmap.getWidth() * aa1.a();
                f1 *= (float)bitmap.getHeight() * aa1.a();
                obj = b.a(f2, f1, c.c());
                k = (int)((float)k - ((PointF) (obj)).x);
                i = (int)((float)i - ((PointF) (obj)).y);
                aa1.a(k, i, f2, f1, this.k, c.c());
                float f4 = aa1.h();
                f3 = aa1.i();
                float f7 = aa1.j();
                float f8 = aa1.k();
                f2 = f3;
                f1 = f4;
                if (c.a() != null)
                {
                    obj = c.a().b(aa1, l1);
                    f1 = ((l) (obj)).a;
                    f2 = ((l) (obj)).b;
                    obj = b.a(((l) (obj)).f, ((l) (obj)).g, c.b());
                    f1 = f4 + f1 + ((PointF) (obj)).x;
                    f2 = f3 + f2 + ((PointF) (obj)).y;
                }
                obj = a(aa1, l1, new RectF(f1, f2, f7 + f1, f8 + f2));
                f1 = ((RectF) (obj)).left;
                f2 = ((RectF) (obj)).top;
                f3 = ((RectF) (obj)).width();
                f4 = ((RectF) (obj)).height();
                f7 = f3 / (float)bitmap.getWidth();
                f8 = f4 / (float)bitmap.getHeight();
                obj = b.a(f3, f4, c.c());
                obj1 = new Paint();
                ((Paint) (obj1)).setAlpha(Math.round(255F * f6));
                ((Paint) (obj1)).setFilterBitmap(true);
                aa1 = aa1.c();
                aa1.save();
                aa1.translate(Math.round(f1), Math.round(f2));
                aa1.translate(Math.round(((PointF) (obj)).x), Math.round(((PointF) (obj)).y));
                aa1.rotate(f5);
                aa1.translate(-Math.round(((PointF) (obj)).x), -Math.round(((PointF) (obj)).y));
                aa1.scale(f7, f8);
                aa1.drawBitmap(bitmap, 0.0F, 0.0F, ((Paint) (obj1)));
                aa1.restore();
            }
        }
    }

    public l c(aa aa1, long l1)
    {
        ab.a a2 = a(l1);
        if (a2 != null)
        {
            Object obj = (a)a2.a;
            a a1 = (a)a2.b;
            float f3 = a2.c;
            if (((a) (obj)).n != -1 && ((a) (obj)).m)
            {
                Bitmap bitmap = a(((a) (obj)));
                float f1 = an.b(((a) (obj)).i, a1.i, ((a) (obj)).j, a1.j, f3);
                float f2 = an.b(((a) (obj)).k, a1.k, ((a) (obj)).l, a1.l, f3);
                float f5 = an.b(((a) (obj)).a, a1.a, ((a) (obj)).b, a1.b, f3);
                float f6 = an.b(((a) (obj)).c, a1.c, ((a) (obj)).d, a1.d, f3);
                float f7 = an.b(((a) (obj)).e, a1.e, ((a) (obj)).f, a1.f, f3);
                f3 = (float)bitmap.getWidth() * f5 * aa1.a();
                float f4 = (float)bitmap.getHeight() * f6 * aa1.a();
                obj = b.a(f3, f4, c.c());
                aa1.a(f1 - ((PointF) (obj)).x, f2 - ((PointF) (obj)).y, f3, f4, k, c.c());
                f4 = aa1.h();
                f3 = aa1.i();
                float f8 = aa1.j();
                float f9 = aa1.k();
                f2 = f3;
                f1 = f4;
                if (c.a() != null)
                {
                    Object obj1 = c.a().b(aa1, l1);
                    f1 = Math.round(((l) (obj1)).a);
                    f2 = Math.round(((l) (obj1)).b);
                    obj1 = b.a(Math.round(((l) (obj1)).f), Math.round(((l) (obj1)).g), c.b());
                    f1 = f4 + f1 + (float)((Point) (obj1)).x;
                    f2 = f3 + f2 + (float)((Point) (obj1)).y;
                }
                aa1 = a(aa1, l1, new RectF(f1, f2, f8 + f1, f9 + f2));
                return new l(((RectF) (aa1)).left, ((RectF) (aa1)).top, aa1.width(), aa1.height(), f5, f6, f7);
            }
        }
        return l.h;
    }

    public void f()
    {
        super.f();
        l = null;
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
