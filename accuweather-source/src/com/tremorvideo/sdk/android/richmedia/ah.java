// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.richmedia;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;

// Referenced classes of package com.tremorvideo.sdk.android.richmedia:
//            ab, z, a, an, 
//            aa, b, l, k, 
//            e

public class ah extends ab
{
    protected class a extends k
    {

        public int e;
        public float f;
        public int g;
        public float h;
        public int i;
        public int j;
        public float k;
        public int l;
        public float m;
        public int n;
        public float o;
        public int p;
        public float q;
        public int r;
        public boolean s;
        final ah t;

        public void a(e e1)
        {
            super.a(e1);
            try
            {
                e = e1.b();
                f = e1.d();
                g = e1.b();
                h = e1.d();
                i = e1.b();
                j = 0;
                k = e1.d();
                l = e1.b();
                m = e1.d();
                n = e1.b();
                o = e1.d();
                p = e1.b();
                q = e1.d();
                r = e1.b();
                s = e1.f();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (e e1)
            {
                return;
            }
        }

        protected void b(e e1)
        {
            super.a(e1);
        }

        protected a()
        {
            t = ah.this;
            super();
        }
    }


    z r;

    public ah(z z1)
    {
        super(z1);
    }

    protected z a(a a1, long l1)
    {
        if (r != null)
        {
            return r;
        } else
        {
            int i = a1.e;
            return g.f().b(i);
        }
    }

    public void a(aa aa1, long l1)
    {
        ab.a a1 = a(l1);
        if (a1 != null)
        {
            Object obj = (a)a1.a;
            Object obj1 = (a)a1.b;
            float f1 = a1.c;
            if (d(((a) (obj)).s) && ((a) (obj)).e != 255)
            {
                z z1 = a(((a) (obj)), l1);
                long l2 = b(((a) (obj)), l1);
                int i = an.a(((a) (obj)).f, ((a) (obj1)).f, ((a) (obj)).g, ((a) (obj1)).g, f1);
                int k = an.a(((a) (obj)).h, ((a) (obj1)).h, ((a) (obj)).i, ((a) (obj1)).i, f1);
                float f6 = an.b(((a) (obj)).m, ((a) (obj1)).m, ((a) (obj)).n, ((a) (obj1)).n, f1);
                float f7 = an.b(((a) (obj)).o, ((a) (obj1)).o, ((a) (obj)).p, ((a) (obj1)).p, f1);
                float f8 = an.b(((a) (obj)).q, ((a) (obj1)).q, ((a) (obj)).r, ((a) (obj1)).r, f1);
                obj = new aa();
                ((aa) (obj)).a(aa1.c());
                obj.f = aa1.f;
                obj.g = aa1.g;
                Object obj2 = z1.a(((aa) (obj)), l2);
                int i1 = ((Rect) (obj2)).width();
                int j1 = ((Rect) (obj2)).height();
                obj1 = com.tremorvideo.sdk.android.richmedia.b.a(i1, j1, c.c());
                f1 = i;
                f1 = k;
                float f9 = i1;
                float f10 = j1;
                float f3;
                float f4;
                float f5;
                float f11;
                if (c.c() == b.b.e)
                {
                    ((PointF) (obj1)).set(0.0F, 0.0F);
                } else
                {
                    obj1.x = ((PointF) (obj1)).x + (float)((Rect) (obj2)).left;
                    float f2 = ((PointF) (obj1)).y;
                    obj1.y = (float)((Rect) (obj2)).top + f2;
                }
                aa1.a(i, k, 0.0F, 0.0F, this.k, c.c());
                f5 = aa1.h();
                f4 = aa1.i();
                f11 = aa1.a(this.k);
                f3 = f4;
                f1 = f5;
                if (c.a() != null)
                {
                    aa1 = c.a().b(aa1, l1);
                    f1 = Math.round(((l) (aa1)).a);
                    f3 = Math.round(((l) (aa1)).b);
                    aa1 = com.tremorvideo.sdk.android.richmedia.b.a(((l) (aa1)).f, ((l) (aa1)).g, c.b());
                    f1 = f5 + f1 + ((PointF) (aa1)).x;
                    f3 = f4 + f3 + ((PointF) (aa1)).y;
                }
                aa1 = com.tremorvideo.sdk.android.richmedia.b.a(f9 * f6, f10 * f7, c.c());
                aa1.set(0.0F, 0.0F);
                obj2 = ((aa) (obj)).c();
                ((Canvas) (obj2)).save();
                ((Canvas) (obj2)).translate(Math.round(f1), Math.round(f3));
                ((Canvas) (obj2)).translate(Math.round(((PointF) (aa1)).x), Math.round(((PointF) (aa1)).y));
                ((Canvas) (obj2)).rotate(f8);
                ((Canvas) (obj2)).translate(-Math.round(((PointF) (aa1)).x), -Math.round(((PointF) (aa1)).y));
                ((Canvas) (obj2)).scale(f6, f7);
                ((Canvas) (obj2)).scale(f11, f11);
                ((Canvas) (obj2)).translate(-((PointF) (obj1)).x, -((PointF) (obj1)).y);
                z1.a(((aa) (obj)), l2, null);
                ((Canvas) (obj2)).restore();
            }
        }
    }

    void a(z z1)
    {
        r = z1;
    }

    protected long b(a a1, long l1)
    {
        if (r != null)
        {
            return l1 % r.c();
        } else
        {
            int i = a1.e;
            return l1 % g.f().b(i).c();
        }
    }

    public l c(aa aa1, long l1)
    {
        ab.a a1 = a(l1);
        if (a1 != null)
        {
            Object obj = (a)a1.a;
            Object obj1 = (a)a1.b;
            float f3 = a1.c;
            if (((a) (obj)).e != 255)
            {
                Object obj2 = a(((a) (obj)), l1);
                long l2 = b(((a) (obj)), l1);
                float f1 = an.b(((a) (obj)).f, ((a) (obj1)).f, ((a) (obj)).g, ((a) (obj1)).g, f3);
                float f2 = an.b(((a) (obj)).h, ((a) (obj1)).h, ((a) (obj)).i, ((a) (obj1)).i, f3);
                float f5 = an.b(((a) (obj)).m, ((a) (obj1)).m, ((a) (obj)).n, ((a) (obj1)).n, f3);
                float f6 = an.b(((a) (obj)).o, ((a) (obj1)).o, ((a) (obj)).p, ((a) (obj1)).p, f3);
                float f7 = an.b(((a) (obj)).q, ((a) (obj1)).q, ((a) (obj)).r, ((a) (obj1)).r, f3);
                obj = new aa();
                ((aa) (obj)).a(aa1.c());
                obj.f = aa1.f;
                obj.g = aa1.g;
                obj = ((z) (obj2)).b(((aa) (obj)), l2);
                float f8 = ((RectF) (obj)).width();
                float f9 = ((RectF) (obj)).height();
                obj1 = com.tremorvideo.sdk.android.richmedia.b.a(f8, f9, c.c());
                float f4;
                Matrix matrix;
                if (c.c() == b.b.e)
                {
                    ((PointF) (obj1)).set(0.0F, 0.0F);
                } else
                {
                    obj1.x = ((PointF) (obj1)).x + ((RectF) (obj)).left;
                    obj1.y = ((PointF) (obj1)).y + ((RectF) (obj)).top;
                }
                aa1.a(f1, f2, 0.0F, 0.0F, k, c.c());
                f4 = aa1.h();
                f3 = aa1.i();
                f2 = f3;
                f1 = f4;
                if (c.a() != null)
                {
                    obj2 = c.a().b(aa1, l1);
                    f1 = Math.round(((l) (obj2)).a);
                    f2 = Math.round(((l) (obj2)).b);
                    obj2 = com.tremorvideo.sdk.android.richmedia.b.a(((l) (obj2)).f, ((l) (obj2)).g, c.b());
                    f1 = f4 + f1 + ((PointF) (obj2)).x;
                    f2 = f3 + f2 + ((PointF) (obj2)).y;
                }
                obj2 = com.tremorvideo.sdk.android.richmedia.b.a(f8, f9, c.c());
                if (c.c() == b.b.e)
                {
                    ((PointF) (obj2)).set(0.0F, 0.0F);
                }
                matrix = new Matrix();
                matrix.preTranslate(f1, f2);
                matrix.preTranslate(((PointF) (obj2)).x, ((PointF) (obj2)).y);
                matrix.preScale(f5, f6);
                matrix.preTranslate(-((PointF) (obj2)).x, -((PointF) (obj2)).y);
                matrix.preScale(aa1.a(k), aa1.a(k));
                matrix.preTranslate(-((PointF) (obj1)).x, -((PointF) (obj1)).y);
                matrix.mapRect(((RectF) (obj)));
                return new l(((RectF) (obj)).left, ((RectF) (obj)).top, ((RectF) (obj)).width(), ((RectF) (obj)).height(), f5, f6, f7);
            }
        }
        return l.h;
    }

    public void f()
    {
        super.f();
        r = null;
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
