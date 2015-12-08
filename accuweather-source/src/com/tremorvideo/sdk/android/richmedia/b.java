// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.richmedia;

import android.graphics.Point;
import android.graphics.PointF;

// Referenced classes of package com.tremorvideo.sdk.android.richmedia:
//            l, ab, z, e, 
//            a

public class com.tremorvideo.sdk.android.richmedia.b
{
    public class a
    {

        int a;
        b b;
        final com.tremorvideo.sdk.android.richmedia.b c;

        public ab a(z z1)
        {
            return z1.a(a);
        }

        public b a()
        {
            return b;
        }

        public void a(e e1)
            throws Exception
        {
            a = e1.b();
            b = b.values()[e1.b()];
        }

        public a()
        {
            c = com.tremorvideo.sdk.android.richmedia.b.this;
            super();
        }
    }

    public static final class b extends Enum
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
            return (b)Enum.valueOf(com/tremorvideo/sdk/android/richmedia/b$b, s);
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


    b a;
    b b;
    ab c;
    int d;
    a e[];

    public com.tremorvideo.sdk.android.richmedia.b(ab ab1)
    {
        c = ab1;
    }

    public static Point a(int i, int j, b b1)
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
                    a[b.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    a[b.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[b.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[b.e.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[b.f.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[b.g.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[b.h.ordinal()] = 8;
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
            return new Point(0, 0);

        case 1: // '\001'
            return new Point(0, 0);

        case 2: // '\002'
            return new Point(i / 2, 0);

        case 3: // '\003'
            return new Point(i, 0);

        case 4: // '\004'
            return new Point(0, j / 2);

        case 5: // '\005'
            return new Point(i / 2, j / 2);

        case 6: // '\006'
            return new Point(i, j / 2);

        case 7: // '\007'
            return new Point(0, j);

        case 8: // '\b'
            return new Point(i / 2, j);

        case 9: // '\t'
            return new Point(i, j);
        }
    }

    public static PointF a(float f, float f1, b b1)
    {
        switch (_cls1.a[b1.ordinal()])
        {
        default:
            return new PointF(0.0F, 0.0F);

        case 1: // '\001'
            return new PointF(0.0F, 0.0F);

        case 2: // '\002'
            return new PointF(f / 2.0F, 0.0F);

        case 3: // '\003'
            return new PointF(f, 0.0F);

        case 4: // '\004'
            return new PointF(0.0F, f1 / 2.0F);

        case 5: // '\005'
            return new PointF(f / 2.0F, f1 / 2.0F);

        case 6: // '\006'
            return new PointF(f, f1 / 2.0F);

        case 7: // '\007'
            return new PointF(0.0F, f1);

        case 8: // '\b'
            return new PointF(f / 2.0F, f1);

        case 9: // '\t'
            return new PointF(f, f1);
        }
    }

    public static PointF a(l l1, b b1)
    {
        switch (_cls1.a[b1.ordinal()])
        {
        default:
            return new PointF(0.0F, 0.0F);

        case 1: // '\001'
            return new PointF(l1.a, l1.b);

        case 2: // '\002'
            return new PointF(l1.a + l1.f / 2.0F, l1.b);

        case 3: // '\003'
            return new PointF(l1.a + l1.f, l1.b);

        case 4: // '\004'
            return new PointF(l1.a, l1.b + l1.g / 2.0F);

        case 5: // '\005'
            return new PointF(l1.a + l1.f / 2.0F, l1.b + l1.g / 2.0F);

        case 6: // '\006'
            return new PointF(l1.a + l1.f, l1.b + l1.g / 2.0F);

        case 7: // '\007'
            return new PointF(l1.a, l1.b + l1.g);

        case 8: // '\b'
            return new PointF(l1.a + l1.f / 2.0F, l1.b + l1.g);

        case 9: // '\t'
            return new PointF(l1.a + l1.f, l1.b + l1.g);
        }
    }

    public ab a()
    {
        if (d == 255)
        {
            return null;
        } else
        {
            return c.c().a(d);
        }
    }

    public a a(int i)
    {
        return e[i];
    }

    public void a(e e1)
    {
        d = e1.b();
        a = b.values()[e1.b()];
        b = b.values()[e1.b()];
        e = new a[4];
        if (c.c().f().e() > 1)
        {
            int i = 0;
            do
            {
                if (i >= 4)
                {
                    break;
                }
                try
                {
                    if (e1.b() == 1)
                    {
                        e[i] = new a();
                        e[i].a(e1);
                    }
                }
                // Misplaced declaration of an exception variable
                catch (e e1)
                {
                    break;
                }
                i++;
            } while (true);
        }
        return;
    }

    public b b()
    {
        return b;
    }

    public b c()
    {
        return a;
    }
}
