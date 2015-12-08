// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.Base;

import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;

// Referenced classes of package com.artfulbits.aiCharts.Base:
//            x, e

public abstract class ChartLayoutElement extends x
    implements u.a
{
    public static final class Alignment extends Enum
    {

        public static final Alignment a;
        public static final Alignment b;
        public static final Alignment c;
        public static final Alignment d;
        private static final Alignment e[];

        public static Alignment valueOf(String s)
        {
            return (Alignment)Enum.valueOf(com/artfulbits/aiCharts/Base/ChartLayoutElement$Alignment, s);
        }

        public static Alignment[] values()
        {
            return (Alignment[])e.clone();
        }

        static 
        {
            a = new Alignment("Near", 0);
            b = new Alignment("Center", 1);
            c = new Alignment("Far", 2);
            d = new Alignment("Stretch", 3);
            e = (new Alignment[] {
                a, b, c, d
            });
        }

        private Alignment(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class Dock extends Enum
    {

        public static final Dock a;
        public static final Dock b;
        public static final Dock c;
        public static final Dock d;
        private static final Dock e[];
        protected final boolean vertical;

        public static Dock valueOf(String s)
        {
            return (Dock)Enum.valueOf(com/artfulbits/aiCharts/Base/ChartLayoutElement$Dock, s);
        }

        public static Dock[] values()
        {
            return (Dock[])e.clone();
        }

        static 
        {
            a = new Dock("Left", 0, true);
            b = new Dock("Right", 1, true);
            c = new Dock("Top", 2, false);
            d = new Dock("Bottom", 3, false);
            e = (new Dock[] {
                a, b, c, d
            });
        }

        private Dock(String s, int i, boolean flag)
        {
            super(s, i);
            vertical = flag;
        }
    }


    protected final Rect a = new Rect();
    protected Dock b;
    protected Alignment c;
    protected int d;
    protected int e;
    protected e f;
    protected boolean g;
    protected boolean h;

    public ChartLayoutElement()
    {
        b = Dock.d;
        c = Alignment.b;
        d = 0;
        e = 0;
        f = null;
        g = true;
        h = true;
    }

    public void a(int i, int j, int k, int i1)
    {
        h = false;
        a.set(i, j, k, i1);
        b(true);
    }

    protected void a(Resources resources, String s, int i, AttributeSet attributeset)
    {
        if (!"visible".equalsIgnoreCase(s)) goto _L2; else goto _L1
_L1:
        a(Boolean.parseBoolean(attributeset.getAttributeValue(i)));
_L4:
        super.a(resources, s, i, attributeset);
        return;
_L2:
        if ("dock".equalsIgnoreCase(s))
        {
            a(Dock.valueOf(attributeset.getAttributeValue(i)));
        } else
        if ("align".equalsIgnoreCase(s))
        {
            a(Alignment.valueOf(attributeset.getAttributeValue(i)));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void a(Point point)
    {
        point.set(0, 0);
    }

    public void a(Rect rect)
    {
        if (rect == null)
        {
            h = true;
        } else
        {
            a.set(rect);
            h = false;
        }
        b(true);
    }

    public void a(Alignment alignment)
    {
        if (c != alignment)
        {
            c = alignment;
            b(true);
        }
    }

    public void a(Dock dock)
    {
        if (b != dock)
        {
            b = dock;
            b(true);
        }
    }

    protected void a(e e1)
    {
        f = e1;
    }

    public void a(boolean flag)
    {
        if (g != flag)
        {
            g = flag;
            b(true);
        }
    }

    protected void b(boolean flag)
    {
        if (g && f != null)
        {
            e e1 = f;
            int i;
            if (flag)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            e1.b(i);
        }
    }

    protected boolean b()
    {
        return h;
    }

    public Dock c()
    {
        return b;
    }

    public void c(Rect rect)
    {
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[Alignment.values().length];
                try
                {
                    a[Alignment.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[Alignment.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[Alignment.a.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[Alignment.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[c.ordinal()];
        JVM INSTR tableswitch 1 4: default 40
    //                   1 49
    //                   2 126
    //                   3 189
    //                   4 252;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        rect.set(a);
        return;
_L2:
        a.left = rect.centerX() - d / 2;
        a.top = rect.centerY() - e / 2;
        a.right = a.left + d;
        a.bottom = a.top + e;
        continue; /* Loop/switch isn't completed */
_L3:
        a.right = rect.right;
        a.bottom = rect.bottom;
        a.left = a.right - d;
        a.top = a.bottom - e;
        continue; /* Loop/switch isn't completed */
_L4:
        a.left = rect.left;
        a.top = rect.top;
        a.right = a.left + d;
        a.bottom = a.top + e;
        continue; /* Loop/switch isn't completed */
_L5:
        a.set(rect);
        if (true) goto _L1; else goto _L6
_L6:
    }

    public boolean d()
    {
        return g;
    }

    public Alignment e()
    {
        return c;
    }

    public int f()
    {
        return d;
    }

    public int g()
    {
        return e;
    }

    public Rect h()
    {
        return a;
    }

    protected e l()
    {
        return f;
    }
}
