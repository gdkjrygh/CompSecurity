// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.richmedia;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;

// Referenced classes of package com.tremorvideo.sdk.android.richmedia:
//            ab, z, a, an, 
//            b, aa, l, k, 
//            e

public class ak extends ab
{
    protected class a extends k
    {

        final ak A;
        public int e;
        public int f;
        public int g;
        public float h;
        public int i;
        public float j;
        public int k;
        public float l;
        public int m;
        public float n;
        public int o;
        public float p;
        public int q;
        public float r;
        public int s;
        public float t;
        public int u;
        public float v;
        public int w;
        public float x;
        public int y;
        public boolean z;

        public void a(e e1)
        {
            super.a(e1);
            try
            {
                e = e1.b();
                f = e1.b();
                g = e1.b();
                h = e1.d();
                i = e1.b();
                j = e1.d();
                k = e1.b();
                l = e1.d();
                m = e1.b();
                n = e1.d();
                o = e1.b();
                p = e1.d();
                q = e1.b();
                r = e1.d();
                s = e1.b();
                t = e1.d();
                u = e1.b();
                v = e1.d();
                w = e1.b();
                x = e1.d();
                y = e1.b();
                z = e1.f();
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
            A = ak.this;
            super();
        }
    }

    protected static final class b extends Enum
    {

        public static final b a;
        public static final b b;
        public static final b c;
        public static final b d;
        public static final b e;
        public static final b f;
        public static final b g;
        public static final b h;
        public static final b i;
        private static final b j[];

        public static b valueOf(String s)
        {
            return (b)Enum.valueOf(com/tremorvideo/sdk/android/richmedia/ak$b, s);
        }

        public static b[] values()
        {
            return (b[])j.clone();
        }

        static 
        {
            a = new b("TopLeft", 0);
            b = new b("TopCenter", 1);
            c = new b("TopRight", 2);
            d = new b("CenterLeft", 3);
            e = new b("CenterCenter", 4);
            f = new b("CenterRight", 5);
            g = new b("BottomLeft", 6);
            h = new b("BottomCenter", 7);
            i = new b("BottomRight", 8);
            j = (new b[] {
                a, b, c, d, e, f, g, h, i
            });
        }

        private b(String s, int k)
        {
            super(s, k);
        }
    }


    private static int n[] = new int[20];
    private static int o = 0;
    protected final int l[] = {
        10, 20, 30
    };
    protected String m;

    public ak(z z1)
    {
        super(z1);
    }

    private float a(b b1, float f1, RectF rectf)
    {
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[b.values().length];
                try
                {
                    a[b.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    a[b.d.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    a[b.g.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[b.b.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[b.e.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[b.h.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[b.c.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[b.f.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[b.i.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[b1.ordinal()])
        {
        default:
            return rectf.left;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            return rectf.left;

        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
            return rectf.left + (rectf.width() - f1) / 2.0F;

        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
            return rectf.right - f1;
        }
    }

    private void a(String s, TextPaint textpaint, RectF rectf)
    {
        int k;
        k = 0;
        o = 0;
_L2:
        int i;
        int i1;
        if (k >= s.length())
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = textpaint.breakText(s, k, s.length(), true, rectf.width(), null);
        if (k + i1 >= s.length() || Character.isWhitespace(s.charAt(k + i1)))
        {
            break MISSING_BLOCK_LABEL_128;
        }
        for (i = i1; i > 0 && !Character.isWhitespace(s.charAt(k + i)); i--) { }
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_128;
        }
_L3:
        n[o] = i;
        o++;
        k += i;
        if (true) goto _L2; else goto _L1
_L1:
        return;
        i = i1;
          goto _L3
    }

    private void a(String s, b b1, RectF rectf, TextPaint textpaint, Canvas canvas)
    {
        int i = 0;
        a(s, textpaint, rectf);
        int k = Math.max(1, (int)Math.floor(rectf.height() / textpaint.getTextSize()));
        float f2 = Math.min(o, k);
        float f3 = textpaint.getTextSize();
        float f1 = 0.0F;
        if (!g.f().c())
        {
            f1 = -textpaint.descent();
        }
        int i1 = Math.round(b(b1, f2 * f3, rectf));
        k = 0;
        for (; (float)i < f2; i++)
        {
            String s1 = s.substring(k, n[i] + k).trim();
            canvas.drawText(s1, a(b1, textpaint.measureText(s1), rectf), (float)i1 + f1 + textpaint.getTextSize(), textpaint);
            i1 = (int)((float)i1 + textpaint.getTextSize());
            k += n[i];
        }

    }

    private float b(b b1, float f1, RectF rectf)
    {
        switch (_cls1.a[b1.ordinal()])
        {
        default:
            return rectf.top;

        case 1: // '\001'
        case 4: // '\004'
        case 7: // '\007'
            return rectf.top;

        case 2: // '\002'
        case 5: // '\005'
        case 8: // '\b'
            return rectf.top + (rectf.height() - f1) / 2.0F;

        case 3: // '\003'
        case 6: // '\006'
        case 9: // '\t'
            return rectf.bottom - f1;
        }
    }

    protected String a(aa aa1, a a1, long l1)
    {
        if (m != null)
        {
            return m;
        } else
        {
            return g.f().a(a1.e);
        }
    }

    public void a(aa aa1, long l1)
    {
        Object obj;
        Object obj1;
        int i;
        int k;
        int i1;
        int j1;
        int k1;
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
label0:
        {
            obj1 = a(l1);
            if (obj1 != null)
            {
                obj = (a)((ab.a) (obj1)).a;
                a a1 = (a)((ab.a) (obj1)).b;
                float f1 = ((ab.a) (obj1)).c;
                if (((a) (obj)).e != -1 && d(((a) (obj)).z))
                {
                    i = an.a(((a) (obj)).j, a1.j, ((a) (obj)).k, a1.k, f1);
                    k = an.a(((a) (obj)).l, a1.l, ((a) (obj)).m, a1.m, f1);
                    i1 = an.a(((a) (obj)).n, a1.n, ((a) (obj)).o, a1.o, f1);
                    j1 = an.a(((a) (obj)).p, a1.p, ((a) (obj)).q, a1.q, f1);
                    k1 = an.a(((a) (obj)).r, a1.r, ((a) (obj)).s, a1.s, f1);
                    i2 = an.a(((a) (obj)).t, a1.t, ((a) (obj)).u, a1.u, f1);
                    j2 = an.a(((a) (obj)).v, a1.v, ((a) (obj)).w, a1.w, f1);
                    k2 = an.a(((a) (obj)).x, a1.x, ((a) (obj)).y, a1.y, f1);
                    f1 = an.b(((a) (obj)).h, a1.h, ((a) (obj)).i, a1.i, f1);
                    obj1 = b.values()[((a) (obj)).g];
                    l2 = l[((a) (obj)).f];
                    obj = a(aa1, ((a) (obj)), l1);
                    i3 = Math.round(f1 * (float)((String) (obj)).length());
                    if (i3 != 0)
                    {
                        break label0;
                    }
                }
            }
            return;
        }
        if (i3 != ((String) (obj)).length())
        {
            obj = ((String) (obj)).substring(0, i3);
        }
        Object obj2 = com.tremorvideo.sdk.android.richmedia.b.a(i1, j1, c.c());
        i3 = ((Point) (obj2)).x;
        int j3 = ((Point) (obj2)).y;
        aa1.a(i - i3, k - j3, i1, j1, this.k, c.c());
        float f5 = aa1.h();
        float f4 = aa1.i();
        float f6 = aa1.j();
        float f7 = aa1.k();
        float f3 = f4;
        float f2 = f5;
        if (c.a() != null)
        {
            obj2 = c.a().b(aa1, l1);
            f2 = Math.round(((l) (obj2)).a);
            f3 = Math.round(((l) (obj2)).b);
            obj2 = com.tremorvideo.sdk.android.richmedia.b.a(Math.round(((l) (obj2)).f), Math.round(((l) (obj2)).g), c.b());
            f2 = f5 + f2 + (float)((Point) (obj2)).x;
            f3 = f4 + f3 + (float)((Point) (obj2)).y;
        }
        obj2 = a(aa1, l1, new RectF(f2, f3, f6 + f2, f7 + f3));
        f2 = Math.round(((RectF) (obj2)).left);
        f3 = Math.round(((RectF) (obj2)).top);
        f4 = Math.round(((RectF) (obj2)).width());
        f5 = Math.round(((RectF) (obj2)).height());
        obj2 = aa1.c();
        ((Canvas) (obj2)).save();
        TextPaint textpaint = new TextPaint();
        textpaint.setColor(Color.argb(k2, k1, i2, j2));
        textpaint.setTextSize((float)l2 * aa1.a(this.k));
        textpaint.setAntiAlias(true);
        textpaint.setTypeface(Typeface.create("helvetica", 1));
        a(((String) (obj)), ((b) (obj1)), new RectF(f2, f3, f4 + f2, f5 + f3), textpaint, ((Canvas) (obj2)));
        ((Canvas) (obj2)).restore();
    }

    void a(String s)
    {
        m = s;
    }

    public l c(aa aa1, long l1)
    {
        ab.a a1 = a(l1);
        if (a1 != null)
        {
            a a2 = (a)a1.a;
            a a3 = (a)a1.b;
            float f4 = a1.c;
            if (a2.e != -1 && a2.z)
            {
                float f1 = an.b(a2.j, a3.j, a2.k, a3.k, f4);
                float f2 = an.b(a2.l, a3.l, a2.m, a3.m, f4);
                float f3 = an.b(a2.n, a3.n, a2.o, a3.o, f4);
                f4 = an.b(a2.p, a3.p, a2.q, a3.q, f4);
                PointF pointf = com.tremorvideo.sdk.android.richmedia.b.a(f3, f4, c.c());
                aa1.a(f1 - pointf.x, f2 - pointf.y, f3, f4, k, c.c());
                f4 = aa1.h();
                f3 = aa1.i();
                float f5 = aa1.j();
                float f6 = aa1.k();
                f2 = f3;
                f1 = f4;
                if (c.a() != null)
                {
                    Object obj = c.a().b(aa1, l1);
                    f1 = ((l) (obj)).a;
                    f2 = ((l) (obj)).b;
                    obj = com.tremorvideo.sdk.android.richmedia.b.a(Math.round(((l) (obj)).f), Math.round(((l) (obj)).g), c.b());
                    f1 = f4 + f1 + (float)((Point) (obj)).x;
                    f2 = f3 + f2 + (float)((Point) (obj)).y;
                }
                aa1 = a(aa1, l1, new RectF(f1, f2, f5 + f1, f6 + f2));
                return new l(((RectF) (aa1)).left, ((RectF) (aa1)).top, aa1.width(), aa1.height(), 1.0F, 1.0F, 0.0F);
            }
        }
        return l.h;
    }

    public void f()
    {
        m = null;
        super.f();
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
