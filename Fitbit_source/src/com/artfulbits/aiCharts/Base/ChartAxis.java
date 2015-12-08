// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.Base;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.FloatMath;
import com.artfulbits.aiCharts.Enums.Alignment;
import java.text.DateFormat;
import java.text.Format;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

// Referenced classes of package com.artfulbits.aiCharts.Base:
//            x, aa, y, ChartAxisScale, 
//            w, b, ChartCollection, a, 
//            ChartSeries, j, c, v, 
//            e

public final class ChartAxis extends x
{
    public static final class LabelLayoutMode extends Enum
    {

        public static final LabelLayoutMode a;
        public static final LabelLayoutMode b;
        public static final LabelLayoutMode c;
        private static final LabelLayoutMode d[];

        public static LabelLayoutMode valueOf(String s1)
        {
            return (LabelLayoutMode)Enum.valueOf(com/artfulbits/aiCharts/Base/ChartAxis$LabelLayoutMode, s1);
        }

        public static LabelLayoutMode[] values()
        {
            return (LabelLayoutMode[])d.clone();
        }

        static 
        {
            a = new LabelLayoutMode("Default", 0);
            b = new LabelLayoutMode("MultiRows", 1);
            c = new LabelLayoutMode("Hide", 2);
            d = (new LabelLayoutMode[] {
                a, b, c
            });
        }

        private LabelLayoutMode(String s1, int i1)
        {
            super(s1, i1);
        }
    }

    public static final class LabelPosition extends Enum
    {

        public static final LabelPosition a;
        public static final LabelPosition b;
        public static final LabelPosition c;
        private static final LabelPosition d[];

        public static LabelPosition valueOf(String s1)
        {
            return (LabelPosition)Enum.valueOf(com/artfulbits/aiCharts/Base/ChartAxis$LabelPosition, s1);
        }

        public static LabelPosition[] values()
        {
            return (LabelPosition[])d.clone();
        }

        static 
        {
            a = new LabelPosition("Outside", 0);
            b = new LabelPosition("Center", 1);
            c = new LabelPosition("Inside", 2);
            d = (new LabelPosition[] {
                a, b, c
            });
        }

        private LabelPosition(String s1, int i1)
        {
            super(s1, i1);
        }
    }

    public static final class Position extends Enum
    {

        public static final Position a;
        public static final Position b;
        public static final Position c;
        public static final Position d;
        public static final Position e;
        public static final Position f;
        private static final Position g[];
        protected final boolean IsOpposed;
        protected final boolean IsVertical;

        public static Position valueOf(String s1)
        {
            return (Position)Enum.valueOf(com/artfulbits/aiCharts/Base/ChartAxis$Position, s1);
        }

        public static Position[] values()
        {
            return (Position[])g.clone();
        }

        static 
        {
            a = new Position("Left", 0, false, true);
            b = new Position("Top", 1, false, false);
            c = new Position("HorizontalCenter", 2, true, false);
            d = new Position("VerticalCenter", 3, false, true);
            e = new Position("Right", 4, true, true);
            f = new Position("Bottom", 5, true, false);
            g = (new Position[] {
                a, b, c, d, e, f
            });
        }

        private Position(String s1, int i1, boolean flag, boolean flag1)
        {
            super(s1, i1);
            IsOpposed = flag;
            IsVertical = flag1;
        }
    }

    public static final class TickMarkMode extends Enum
    {

        public static final TickMarkMode a;
        public static final TickMarkMode b;
        public static final TickMarkMode c;
        public static final TickMarkMode d;
        private static final TickMarkMode e[];

        public static TickMarkMode valueOf(String s1)
        {
            return (TickMarkMode)Enum.valueOf(com/artfulbits/aiCharts/Base/ChartAxis$TickMarkMode, s1);
        }

        public static TickMarkMode[] values()
        {
            return (TickMarkMode[])e.clone();
        }

        static 
        {
            a = new TickMarkMode("None", 0);
            b = new TickMarkMode("Inner", 1);
            c = new TickMarkMode("Outer", 2);
            d = new TickMarkMode("Cross", 3);
            e = (new TickMarkMode[] {
                a, b, c, d
            });
        }

        private TickMarkMode(String s1, int i1)
        {
            super(s1, i1);
        }
    }

    public static final class ValueType extends Enum
    {

        public static final ValueType a;
        public static final ValueType b;
        private static final ValueType c[];

        public static ValueType valueOf(String s1)
        {
            return (ValueType)Enum.valueOf(com/artfulbits/aiCharts/Base/ChartAxis$ValueType, s1);
        }

        public static ValueType[] values()
        {
            return (ValueType[])c.clone();
        }

        static 
        {
            a = new ValueType("Double", 0);
            b = new ValueType("Date", 1);
            c = (new ValueType[] {
                a, b
            });
        }

        private ValueType(String s1, int i1)
        {
            super(s1, i1);
        }
    }

    public static final class a
    {

        public static final int a = 0;
        public static final int b = 1;
        public static final int c = 2;
        public static final int d = 3;
        public static final int e = 16;
        public static final int f = 1;
        public static final int g = 18;
        public static final int h = 33;
        public static final int i = 17;
        double j;
        aa k;
        protected boolean l;
        int m;

        public final String a()
        {
            return k.a;
        }

        public final void a(double d1)
        {
            j = d1;
        }

        final void a(double d1, String s1, int i1)
        {
            j = d1;
            m = 3;
            k.a = s1;
        }

        final void a(float f1, float f2, int i1, ChartAxis chartaxis)
        {
            k.e = i1;
            k.a(f1, f2, chartaxis.r());
        }

        public final void a(int i1)
        {
            k.f = i1;
        }

        final void a(Canvas canvas, ChartAxis chartaxis)
        {
            k.d = ChartAxis.a(chartaxis);
            k.a(canvas, ChartAxis.b(chartaxis));
        }

        public final void a(Paint paint)
        {
            k.c = paint;
        }

        public final void a(Drawable drawable)
        {
            k.b = drawable;
        }

        final void a(ChartAxis chartaxis)
        {
            k.d = ChartAxis.a(chartaxis);
            k.a(ChartAxis.b(chartaxis));
        }

        public final void a(String s1)
        {
            k.a = s1;
        }

        public final double b()
        {
            return j;
        }

        public final void b(int i1)
        {
            m = i1;
        }

        public final Paint c()
        {
            return k.c;
        }

        public final Drawable d()
        {
            return k.b;
        }

        public final int e()
        {
            return k.f;
        }

        public final int f()
        {
            return m;
        }

        a()
        {
            k = new aa();
            l = true;
            m = 1;
        }

        public a(String s1, double d1)
        {
            k = new aa();
            l = true;
            m = 1;
            k.a = s1;
            j = d1;
        }

        public a(String s1, double d1, int i1)
        {
            k = new aa();
            l = true;
            m = 1;
            k.a = s1;
            j = d1;
            m = i1;
        }

        public a(String s1, Calendar calendar)
        {
            this(s1, calendar.getTimeInMillis());
        }

        public a(String s1, Date date)
        {
            this(s1, date.getTime());
        }
    }

    public static interface b
    {

        public abstract void a(ChartAxis chartaxis, List list);
    }

    public static interface c
    {

        public abstract void a(e e1, ChartAxis chartaxis);

        public abstract void b(e e1, ChartAxis chartaxis);
    }


    static final int a;
    public static final b b = new b() {

        public final void a(ChartAxis chartaxis, List list)
        {
            ChartAxis.a(chartaxis, list);
        }

    };
    public static final b c = new b() {

        public final void a(ChartAxis chartaxis, List list)
        {
            if (chartaxis.L())
            {
                ChartAxis.b(chartaxis, list);
                return;
            } else
            {
                ChartAxis.a(chartaxis, list);
                return;
            }
        }

    };
    public static final b d = new b() {

        public final void a(ChartAxis chartaxis, List list)
        {
            if (chartaxis.L())
            {
                ChartAxis.c(chartaxis, list);
                return;
            } else
            {
                ChartAxis.a(chartaxis, list);
                return;
            }
        }

    };
    private static int g;
    private ChartAxisScale A;
    private final aa B = new aa(new Paint());
    private int C;
    private b D;
    private boolean E;
    private boolean F;
    private c G;
    private int H;
    private int I;
    private Drawable J;
    private LabelLayoutMode K;
    private final com.artfulbits.aiCharts.Base.b L = new com.artfulbits.aiCharts.Base.b(this);
    private final y M = new y(0.0F);
    protected float e;
    protected float f;
    private LabelPosition h;
    private final ArrayList i = new ArrayList();
    private final ArrayList j = new ArrayList();
    private ChartCollection k;
    private ChartCollection l;
    private final RectF m = new RectF();
    private final Paint n = new Paint();
    private final Paint o = new Paint();
    private final TextPaint p = new TextPaint();
    private Alignment q;
    private Alignment r;
    private double s;
    private int t;
    private int u;
    private TickMarkMode v;
    private Position w;
    private boolean x;
    private com.artfulbits.aiCharts.Base.a y;
    private final w z = new w(this);

    public ChartAxis(Position position)
    {
        h = LabelPosition.a;
        k = null;
        l = null;
        q = Alignment.b;
        r = Alignment.b;
        s = 0.0D;
        t = 4;
        u = 0;
        v = TickMarkMode.b;
        w = Position.f;
        x = true;
        y = null;
        A = null;
        C = g;
        D = b;
        E = true;
        F = true;
        H = 2;
        I = 1;
        J = null;
        K = LabelLayoutMode.a;
        A = new ChartAxisScale(this);
        a(position);
        p.setColor(-1);
        p.setAntiAlias(true);
        B.c.setColor(-1);
        B.c.setAntiAlias(true);
        n.setAntiAlias(true);
        n.setColor(-1);
        n.setStyle(android.graphics.Paint.Style.STROKE);
        o.setAntiAlias(true);
        o.setColor(0xff888888);
        o.setStyle(android.graphics.Paint.Style.STROKE);
        l = new ChartCollection(new ChartCollection.a() {

            private ChartAxis a;

            public final void a(Object obj, Object obj1, int i1)
            {
                a.e(0);
            }

            
            {
                a = ChartAxis.this;
                super();
            }
        });
        k = new ChartCollection(new ChartCollection.a() {

            private ChartAxis a;

            public final void a(Object obj, Object obj1, int i1)
            {
                ChartAxis.a(a, 1);
                a.e(1);
            }

            
            {
                a = ChartAxis.this;
                super();
            }
        });
    }

    private boolean M()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (L.a())
        {
            double d1 = A.p();
            flag = flag1;
            if (!Double.isNaN(d1))
            {
                flag = flag1;
                if (d1 < A.e())
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    private List N()
    {
        if ((I & 1) != 0)
        {
            I = I ^ 1;
            i.clear();
            if (D != null)
            {
                D.a(this, j);
            }
            i.addAll(j);
            i.addAll(k);
        }
        return i;
    }

    private float a(List list, boolean flag, float f1, float f2, float f3, Alignment alignment)
    {
        float f4;
        int ai[];
        float af[];
        int i1;
        int j1;
        int l1;
        float af1[] = new float[4];
        af1;
        af1[0] = -3.402823E+38F;
        af1[1] = -3.402823E+38F;
        af1[2] = -3.402823E+38F;
        af1[3] = -3.402823E+38F;
        af = new float[5];
        af;
        af[0] = 0.0F;
        af[1] = 0.0F;
        af[2] = 0.0F;
        af[3] = 0.0F;
        af[4] = 0.0F;
        double d1;
        double d3;
        int k1;
        int i2;
        int j2;
        if (flag)
        {
            ai = null;
        } else
        {
            ai = new int[list.size()];
        }
        i1 = 0;
        l1 = com.artfulbits.aiCharts.Base.a._cls1.a(alignment, Alignment.a);
        i2 = alignment.ordinal();
        j2 = list.size();
        k1 = 0;
        if (k1 >= j2) goto _L2; else goto _L1
_L1:
        alignment = (a)list.get(k1);
        alignment.l = true;
        if (flag)
        {
            alignment.a(this);
        }
        d1 = A.h(((a) (alignment)).j);
        d3 = f1;
        f4 = (float)(d1 * (double)f2 + d3);
        i2;
        JVM INSTR tableswitch 0 1: default 188
    //                   0 300
    //                   1 282;
           goto _L3 _L4 _L5
_L3:
        j1 = 0;
_L8:
        if (j1 >= 4)
        {
            break MISSING_BLOCK_LABEL_463;
        }
        if (af1[j1] >= f4) goto _L7; else goto _L6
_L6:
        af1[j1] = f4 + ((a) (alignment)).k.i;
        af[j1] = Math.max(af[j1], ((a) (alignment)).k.j);
        if (!flag)
        {
            ai[k1] = j1;
        }
        k1++;
        i1 = j1;
        break MISSING_BLOCK_LABEL_98;
_L5:
        f4 -= ((a) (alignment)).k.i / 2.0F;
          goto _L3
_L4:
        f4 -= ((a) (alignment)).k.i;
          goto _L3
_L7:
        j1++;
          goto _L8
_L2:
        for (i1 = 1; i1 < af.length; i1++)
        {
            af[i1] = af[i1] + af[i1 - 1];
        }

        if (!flag)
        {
            j1 = list.size();
            for (i1 = 0; i1 < j1; i1++)
            {
                alignment = (a)list.get(i1);
                double d2 = A.h(((a) (alignment)).j);
                double d4 = f1;
                alignment.a((float)(d2 * (double)f2 + d4), af[ai[i1]] + f3, l1, this);
            }

        }
        return af[af.length - 1];
        j1 = i1;
          goto _L6
    }

    static int a(ChartAxis chartaxis, int i1)
    {
        i1 = chartaxis.I | 1;
        chartaxis.I = i1;
        return i1;
    }

    static y a(ChartAxis chartaxis)
    {
        return chartaxis.M;
    }

    static void a(ChartAxis chartaxis, List list)
    {
        ChartAxisScale.c c1 = chartaxis.A.t();
        chartaxis.z.b();
        int k1 = list.size();
        int i1 = 0;
        do
        {
            double d1 = c1.a();
            int j1;
            if (i1 < k1)
            {
                ((a)list.get(i1)).a(d1, chartaxis.z.a(d1), 3);
            } else
            {
                list.add(new a(chartaxis.z.a(d1), d1, 3));
            }
            j1 = i1 + 1;
            if (!c1.b())
            {
                for (i1 = k1 - 1; i1 > j1; i1--)
                {
                    list.remove(i1);
                }

                return;
            }
            i1 = j1;
        } while (true);
    }

    protected static boolean a(a a1, a a2)
    {
        float f1 = a1.k.g;
        float f2 = a2.k.g;
        float f3 = a1.k.h;
        float f4 = a2.k.h;
        float f5 = a1.k.i;
        float f6 = a2.k.i;
        float f7 = a1.k.j;
        float f8 = a2.k.j;
        return Math.abs(f1 - f2) < (f5 + f6) / 2.0F && Math.abs(f3 - f4) < (f7 + f8) / 2.0F;
    }

    static TextPaint b(ChartAxis chartaxis)
    {
        return chartaxis.p;
    }

    static void b(ChartAxis chartaxis, List list)
    {
        TreeMap treemap = new TreeMap();
        int k1 = list.size();
        int i1 = 0;
        chartaxis.z.b();
        for (Iterator iterator = chartaxis.y.f.iterator(); iterator.hasNext();)
        {
            Iterator iterator2 = ((ChartSeries)iterator.next()).I().iterator();
            while (iterator2.hasNext()) 
            {
                j j1 = (j)iterator2.next();
                if (!treemap.containsKey(Double.valueOf(j1.a())))
                {
                    treemap.put(Double.valueOf(j1.a()), j1);
                }
            }
        }

        Iterator iterator1 = treemap.values().iterator();
        while (iterator1.hasNext()) 
        {
            Object obj = (j)iterator1.next();
            double d1 = ((j) (obj)).a();
            obj = ((j) (obj)).d();
            if (obj == null)
            {
                obj = chartaxis.z.a(d1);
            }
            if (i1 < k1)
            {
                ((a)list.get(i1)).a(d1, ((String) (obj)), 3);
            } else
            {
                list.add(new a(((String) (obj)), d1, 3));
            }
            i1++;
        }
        for (k1--; k1 > i1; k1--)
        {
            list.remove(k1);
        }

    }

    static void c(ChartAxis chartaxis, List list)
    {
        ArrayList arraylist = new ArrayList();
        double d3 = chartaxis.A.j();
        int j1 = list.size();
        int i1 = 0;
        chartaxis.z.b();
        for (Iterator iterator = chartaxis.y.f.iterator(); iterator.hasNext();)
        {
            Iterator iterator2 = ((ChartSeries)iterator.next()).I().iterator();
            while (iterator2.hasNext()) 
            {
                arraylist.add((j)iterator2.next());
            }
        }

        double d1 = -1.7976931348623157E+308D;
        Collections.sort(arraylist, j.a);
        Iterator iterator1 = arraylist.iterator();
        do
        {
            if (!iterator1.hasNext())
            {
                break;
            }
            Object obj = (j)iterator1.next();
            double d2 = ((j) (obj)).a();
            if (d2 - d1 >= d3)
            {
                obj = ((j) (obj)).d();
                if (obj == null)
                {
                    obj = chartaxis.z.a(d2);
                }
                if (i1 < j1)
                {
                    ((a)list.get(i1)).a(d2, ((String) (obj)), 3);
                } else
                {
                    list.add(new a(((String) (obj)), d2, 3));
                }
                i1++;
                d1 = d2;
            }
        } while (true);
        for (j1--; j1 > i1; j1--)
        {
            list.remove(j1);
        }

    }

    public final TickMarkMode A()
    {
        return v;
    }

    public final RectF B()
    {
        return new RectF(m);
    }

    public final boolean C()
    {
        return F;
    }

    public final ValueType D()
    {
        return ValueType.values()[C];
    }

    protected final int E()
    {
        return C;
    }

    public final b F()
    {
        return D;
    }

    public final boolean G()
    {
        return E;
    }

    public final LabelLayoutMode H()
    {
        return K;
    }

    protected final com.artfulbits.aiCharts.Base.a I()
    {
        return y;
    }

    protected final void J()
    {
        I = I | 1;
        if (y != null)
        {
            y.b(3);
        }
        if (G != null)
        {
            G.a(l(), this);
        }
    }

    protected final void K()
    {
        if (G != null)
        {
            G.b(l(), this);
        }
    }

    protected final boolean L()
    {
        while (y == null || y.e == null || y.e.D() != this) 
        {
            return false;
        }
        return true;
    }

    protected final float a(float f1, float f2)
    {
        float f3 = 0.5F * f1;
        float f4 = 0.5F * f2;
        f2 = Math.min(f3, f4);
        f1 = f2;
        if (E)
        {
            List list = N();
            int j1 = list.size();
            int i1 = 0;
            f1 = f2;
            for (; i1 < j1; i1++)
            {
                a a1 = (a)list.get(i1);
                double d1 = b(a1.j);
                f2 = (float)Math.abs(Math.cos(6.2831853071795862D * d1));
                float f5 = (float)Math.abs(Math.sin(d1 * 6.2831853071795862D));
                a1.a(this);
                f1 = Math.min(Math.min(f1, (f3 - a1.k.i) / f2), (f4 - a1.k.j) / f5);
            }

            if (v != TickMarkMode.c || v != TickMarkMode.a)
            {
                f1 -= t;
            }
        }
        return f1 + (float)H;
    }

    protected final float a(int i1, int j1)
    {
        boolean flag = w.IsVertical;
        if (!E) goto _L2; else goto _L1
_L1:
        List list = N();
        if (!flag && K == LabelLayoutMode.b) goto _L4; else goto _L3
_L3:
        float f1;
        j1 = list.size();
        f1 = 0.0F;
        i1 = 0;
_L7:
        float f2 = f1;
        if (i1 >= j1) goto _L6; else goto _L5
_L5:
        a a1 = (a)list.get(i1);
        a1.a(this);
        if (flag)
        {
            f2 = a1.k.i;
        } else
        {
            f2 = a1.k.j;
        }
        static final class _cls6
        {

            static final int a[];
            static final int b[];
            static final int c[];

            static 
            {
                c = new int[LabelPosition.values().length];
                try
                {
                    c[LabelPosition.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror12) { }
                try
                {
                    c[LabelPosition.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    c[LabelPosition.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                b = new int[TickMarkMode.values().length];
                try
                {
                    b[TickMarkMode.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    b[TickMarkMode.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    b[TickMarkMode.d.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    b[TickMarkMode.a.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                a = new int[Position.values().length];
                try
                {
                    a[Position.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[Position.e.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[Position.d.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[Position.b.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[Position.c.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[Position.f.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        float f3;
        if (f1 >= f2)
        {
            f2 = f1;
        }
        i1++;
        f1 = f2;
        if (true) goto _L7; else goto _L6
_L4:
        f2 = a(list, true, 0.0F, i1, 0.0F, Alignment.b);
_L6:
        if (v != TickMarkMode.c || v != TickMarkMode.a)
        {
            f1 = (float)t + 0.0F;
        } else
        {
            f1 = 0.0F;
        }
_L13:
        f1 += H;
        _cls6.c[h.ordinal()];
        JVM INSTR tableswitch 1 3: default 212
    //                   1 303
    //                   2 311
    //                   3 319;
           goto _L8 _L9 _L10 _L11
_L8:
        B.a(null);
        f3 = f1;
        if (B.k != 0.0F)
        {
            f3 = f1 + (B.k + (float)H);
        }
        f3 += u + H;
        f1 = f3;
        if (M())
        {
            f1 = f3 + L.b(flag);
        }
        e = f1;
        f = f2;
        return f1;
_L9:
        f1 += f2;
        continue; /* Loop/switch isn't completed */
_L10:
        f1 = f2 / 2.0F;
        continue; /* Loop/switch isn't completed */
_L11:
        f1 = 0.0F;
        if (true) goto _L8; else goto _L2
_L2:
        f2 = 0.0F;
        f1 = 0.0F;
        if (true) goto _L13; else goto _L12
_L12:
    }

    protected final Path a(Rect rect, boolean flag)
    {
        Path path = new Path();
        float f1 = rect.centerX();
        float f2 = rect.centerY();
        float f3 = (float)Math.min(rect.width(), rect.height()) * 0.5F;
        if (flag)
        {
            rect = A.t();
            boolean flag1 = true;
            do
            {
                float f5 = com.artfulbits.aiCharts.Base.p.b.a(A, rect.a());
                float f4 = FloatMath.cos(f5) * f3 + f1;
                f5 = FloatMath.sin(f5) * f3 + f2;
                if (flag1)
                {
                    path.moveTo(f4, f5);
                    flag1 = false;
                } else
                {
                    path.lineTo(f4, f5);
                }
            } while (rect.b());
        } else
        {
            path.addCircle(f1, f2, f3, android.graphics.Path.Direction.CW);
        }
        path.close();
        return path;
    }

    public final ChartAxisScale a()
    {
        return A;
    }

    public final void a(double d1)
    {
        if (s != d1)
        {
            s = d1;
            e(0);
        }
    }

    public final void a(float f1)
    {
        if (M.d != f1)
        {
            M.a(f1);
            e(1);
        }
    }

    protected final void a(float f1, float f2, float f3, float f4)
    {
        float f5;
        float f6;
        float f9;
        Object obj1;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        m.set(f1, f2, f3, f4);
        flag1 = w.IsOpposed;
        flag2 = w.IsVertical;
        flag3 = M();
        obj1 = Alignment.b;
        f5 = 0.0F;
        f6 = H;
        f9 = 0.0F;
        _cls6.c[h.ordinal()];
        JVM INSTR tableswitch 1 3: default 92
    //                   1 503
    //                   2 481
    //                   3 444;
           goto _L1 _L2 _L3 _L4
_L1:
        Object obj;
        obj = obj1;
        float f7 = f5;
        f5 = f6;
        f6 = f7;
_L9:
        float f8;
        float f10;
        int j1;
        int k1;
        if (flag1)
        {
            f8 = u;
        } else
        {
            f8 = -u;
        }
        if (flag3)
        {
            f9 = L.b(flag2);
        }
        f6 = f6 + f8 + f9;
        _cls6.a[w.ordinal()];
        JVM INSTR tableswitch 1 4: default 188
    //                   1 613
    //                   2 748
    //                   3 613
    //                   4 679;
           goto _L5 _L6 _L7 _L6 _L8
_L5:
        if (flag3)
        {
            L.a(f1, f2, f3, f2 + f9, flag2);
        }
        f2 = f6 + f2;
        B.e = com.artfulbits.aiCharts.Base.a._cls1.a(r, Alignment.a);
        B.a(f1, f2 + f5, f3, f2 + f5, null);
        f1 = f2;
        break; /* Loop/switch isn't completed */
_L4:
        if (flag1)
        {
            obj = Alignment.a;
        } else
        {
            obj = Alignment.c;
        }
        f8 = -H;
        f5 = f6;
        f6 = f8;
          goto _L9
_L3:
        obj = Alignment.b;
        f5 = f / 2.0F + f6;
        f6 = 0.0F;
          goto _L9
_L2:
        f8 = f6 + f;
        if (flag1)
        {
            obj = Alignment.c;
        } else
        {
            obj = Alignment.a;
        }
        f10 = H;
        obj1 = obj;
        f6 = f8;
        f5 = f10;
        if (v == TickMarkMode.c) goto _L1; else goto _L10
_L10:
        obj1 = obj;
        f6 = f8;
        f5 = f10;
        if (v == TickMarkMode.a) goto _L1; else goto _L11
_L11:
        f6 = t;
        f5 = f8;
        f6 = f10 + f6;
          goto _L9
_L6:
        if (flag3)
        {
            L.a(f3 - f9, f2, f3, f4, flag2);
        }
        f1 = f3 - f6;
        B.e = com.artfulbits.aiCharts.Base.a._cls1.a(Alignment.c, r);
        B.a(f1 - f5, f2, f1 - f5, f4, null);
          goto _L12
_L8:
        if (flag3)
        {
            L.a(f1, f4 - f9, f3, f4, flag2);
        }
        f2 = f4 - f6;
        B.e = com.artfulbits.aiCharts.Base.a._cls1.a(r, Alignment.c);
        B.a(f1, f2 - f5, f3, f2 - f5, null);
        f1 = f2;
          goto _L12
_L7:
        if (flag3)
        {
            L.a(f1, f2, f1 + f9, f4, flag2);
        }
        f1 = f6 + f1;
        B.e = com.artfulbits.aiCharts.Base.a._cls1.a(Alignment.a, r);
        B.a(f1 + f5, f2, f1 + f5, f4, null);
_L12:
        if (E)
        {
            List list = N();
            if (w.IsVertical || K != LabelLayoutMode.b)
            {
                boolean flag;
                int i1;
                if (K == LabelLayoutMode.c)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                obj1 = null;
                if (w.IsVertical)
                {
                    i1 = com.artfulbits.aiCharts.Base.a._cls1.a(((Alignment) (obj)), q);
                } else
                {
                    i1 = com.artfulbits.aiCharts.Base.a._cls1.a(q, ((Alignment) (obj)));
                }
                k1 = list.size();
                j1 = 0;
                obj = obj1;
                while (j1 < k1) 
                {
                    obj1 = (a)list.get(j1);
                    double d1 = b(((a) (obj1)).j);
                    if (w.IsVertical)
                    {
                        ((a) (obj1)).a(f1, (float)((double)m.bottom - d1 * (double)m.height()), i1, this);
                    } else
                    {
                        double d2 = m.left;
                        ((a) (obj1)).a((float)(d1 * (double)m.width() + d2), f1, i1, this);
                    }
                    if (flag)
                    {
                        if (obj != null && a(((a) (obj)), ((a) (obj1))))
                        {
                            obj1.l = false;
                        } else
                        {
                            obj1.l = true;
                            obj = obj1;
                        }
                    } else
                    {
                        obj1.l = true;
                    }
                    j1++;
                }
            } else
            {
                a(list, false, m.left, m.width(), f1, q);
            }
        }
        return;
    }

    public final void a(float f1, int i1)
    {
        n.setColor(i1);
        n.setStrokeWidth(f1);
        e(0);
    }

    public final void a(int i1)
    {
        if (u != i1)
        {
            u = i1;
            e(1);
        }
    }

    protected final void a(Resources resources, String s1, int i1, AttributeSet attributeset)
    {
        if (!"format".equalsIgnoreCase(s1)) goto _L2; else goto _L1
_L1:
        z.a(new MessageFormat(attributeset.getAttributeValue(i1)));
_L4:
        return;
_L2:
        if ("position".equalsIgnoreCase(s1))
        {
            w = Position.valueOf(attributeset.getAttributeValue(i1));
            return;
        }
        if ("inverted".equalsIgnoreCase(s1))
        {
            A.a(attributeset.getAttributeBooleanValue(i1, A.b()));
            return;
        }
        if ("visible".equalsIgnoreCase(s1))
        {
            F = attributeset.getAttributeBooleanValue(i1, F);
            return;
        }
        if ("title".equalsIgnoreCase(s1))
        {
            B.a = attributeset.getAttributeValue(i1);
            return;
        }
        if ("padding".equalsIgnoreCase(s1))
        {
            u = attributeset.getAttributeIntValue(i1, u);
            return;
        }
        if ("spacing".equalsIgnoreCase(s1))
        {
            H = attributeset.getAttributeIntValue(i1, H);
            return;
        }
        if ("valuetype".equalsIgnoreCase(s1))
        {
            C = ValueType.valueOf(attributeset.getAttributeValue(i1)).ordinal();
            return;
        }
        if ("scale_min".equalsIgnoreCase(s1))
        {
            resources = attributeset.getAttributeValue(i1);
            try
            {
                A.a(Double.valueOf(SimpleDateFormat.getInstance().parse(resources).getTime()));
                C = ValueType.b.ordinal();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                A.a(Double.valueOf(Double.parseDouble(resources)));
            }
            return;
        }
        if ("scale_max".equalsIgnoreCase(s1))
        {
            resources = attributeset.getAttributeValue(i1);
            try
            {
                A.b(Double.valueOf(SimpleDateFormat.getInstance().parse(resources).getTime()));
                C = ValueType.b.ordinal();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                A.b(Double.valueOf(Double.parseDouble(resources)));
            }
            return;
        }
        if ("scale_interval".equalsIgnoreCase(s1))
        {
            resources = attributeset.getAttributeValue(i1);
            A.c(Double.valueOf(Double.parseDouble(resources)));
            return;
        }
        if ("scale_intervalType".equalsIgnoreCase(s1))
        {
            resources = attributeset.getAttributeValue(i1);
            A.a(ChartAxisScale.IntervalType.valueOf(resources));
            return;
        }
        if ("scrollbar_enabled".equalsIgnoreCase(s1))
        {
            L.a(attributeset.getAttributeBooleanValue(i1, x));
            return;
        }
        if ("grid_visible".equalsIgnoreCase(s1))
        {
            x = attributeset.getAttributeBooleanValue(i1, x);
            return;
        }
        if ("grid_linescolor".equalsIgnoreCase(s1))
        {
            c(Color.parseColor(attributeset.getAttributeValue(i1)));
            return;
        }
        if (!"labels_mode".equalsIgnoreCase(s1))
        {
            break; /* Loop/switch isn't completed */
        }
        resources = attributeset.getAttributeValue(i1);
        if ("NoLabels".equalsIgnoreCase(resources))
        {
            D = null;
            return;
        }
        if ("RangeLabels".equalsIgnoreCase(resources))
        {
            D = b;
            return;
        }
        if ("SeriesLabels".equalsIgnoreCase(resources))
        {
            D = c;
            return;
        }
        if ("HybridLabels".equalsIgnoreCase(resources))
        {
            D = d;
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if ("labels_visible".equalsIgnoreCase(s1))
        {
            E = attributeset.getAttributeBooleanValue(i1, E);
            return;
        }
        if ("ticks_mode".equalsIgnoreCase(s1))
        {
            v = TickMarkMode.valueOf(attributeset.getAttributeValue(i1));
            return;
        }
        if ("ticks_size".equalsIgnoreCase(s1))
        {
            t = attributeset.getAttributeIntValue(i1, t);
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    protected final void a(Canvas canvas)
    {
        float f1;
        float f2;
        float f3;
        float f4;
        float f5;
        List list;
        a a1;
        boolean flag;
        int i1;
        int j1;
        boolean flag1;
        if (w.IsOpposed)
        {
            f2 = 1.0F;
        } else
        {
            f2 = -1F;
        }
        flag1 = w.IsVertical;
        if (h == LabelPosition.a && v != TickMarkMode.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (J != null)
        {
            J.setBounds((int)m.left, (int)m.top, (int)m.right, (int)m.bottom);
            J.draw(canvas);
        }
        if (flag1)
        {
            f3 = m.bottom;
            f4 = m.top;
        } else
        {
            f3 = m.left;
            f4 = m.right;
        }
        if (M())
        {
            f1 = L.b(flag1);
        } else
        {
            f1 = 0.0F;
        }
        _cls6.a[w.ordinal()];
        JVM INSTR tableswitch 1 6: default 188
    //                   1 450
    //                   2 488
    //                   3 450
    //                   4 469
    //                   5 507
    //                   6 507;
           goto _L1 _L2 _L3 _L2 _L4 _L5 _L5
_L1:
        f1 = 0.0F;
_L11:
        if (flag1)
        {
            canvas.drawLine(f1, f3, f1, f4, n);
        } else
        {
            canvas.drawLine(f3, f1, f4, f1, n);
        }
        if (!flag) goto _L7; else goto _L6
_L6:
        _cls6.b[v.ordinal()];
        JVM INSTR tableswitch 1 3: default 252
    //                   1 543
    //                   2 556
    //                   3 569;
           goto _L7 _L8 _L9 _L10
_L10:
        break MISSING_BLOCK_LABEL_569;
_L7:
        f2 = 0.0F;
        f1 = 0.0F;
_L12:
        if (M())
        {
            L.a(canvas);
        }
        if (E)
        {
            list = N();
            j1 = list.size();
            i1 = 0;
            while (i1 < j1) 
            {
                a1 = (a)list.get(i1);
                if (a1.l && A.j(a1.j))
                {
                    if (flag && (a1.m & 1) != 0)
                    {
                        f5 = (float)((double)f3 + (double)(f4 - f3) * A.h(a1.j));
                        if (flag1)
                        {
                            canvas.drawLine(f1, f5, f2, f5, n);
                        } else
                        {
                            canvas.drawLine(f5, f1, f5, f2, n);
                        }
                    }
                    a1.a(canvas, this);
                }
                i1++;
            }
        }
        break MISSING_BLOCK_LABEL_605;
_L2:
        f1 = m.right - (float)u - f1;
          goto _L11
_L4:
        f1 = m.bottom - (float)u - f1;
          goto _L11
_L3:
        f1 = m.left + (float)u + f1;
          goto _L11
_L5:
        f1 = m.top + (float)u + f1;
          goto _L11
_L8:
        f2 = f1 + (float)t * f2;
          goto _L12
_L9:
        f2 = f1 - (float)t * f2;
          goto _L12
        f2 = f1 + (float)t;
        f1 -= t;
          goto _L12
        B.a(canvas, null);
        return;
    }

    protected final void a(Canvas canvas, Rect rect)
    {
        ChartCollection chartcollection = l;
        int j1 = chartcollection.size();
        if (j1 > 0)
        {
            canvas.save(2);
            canvas.clipRect(rect);
            for (int i1 = 0; i1 < j1; i1++)
            {
                ((com.artfulbits.aiCharts.Base.c)chartcollection.get(i1)).a(canvas, rect, this);
            }

            canvas.restore();
        }
    }

    protected final void a(Canvas canvas, Rect rect, ChartAxis chartaxis)
    {
        ChartAxisScale.c c1 = chartaxis.a().t();
        ChartAxisScale.c c2 = A.t();
        float f1 = rect.centerX();
        float f2 = rect.centerY();
        float f3 = rect.width();
        float f4 = rect.height();
        rect = new Path();
        boolean flag = true;
        do
        {
            float f5 = com.artfulbits.aiCharts.Base.p.b.a(chartaxis.a(), c1.a());
            if (flag)
            {
                rect.moveTo(FloatMath.cos(f5), FloatMath.sin(f5));
                flag = false;
            } else
            {
                rect.lineTo(FloatMath.cos(f5), FloatMath.sin(f5));
            }
        } while (c1.b());
        rect.close();
        do
        {
            f5 = (float)b(c2.a());
            canvas.save(1);
            canvas.translate(f1, f2);
            canvas.scale(f5 * (0.5F * f3), f5 * (0.5F * f4));
            canvas.drawPath(rect, o);
            canvas.restore();
        } while (c2.b());
    }

    public final void a(Drawable drawable)
    {
        if (J != drawable)
        {
            J = drawable;
            e(0);
        }
    }

    public final void a(LabelLayoutMode labellayoutmode)
    {
        if (K != labellayoutmode)
        {
            K = labellayoutmode;
            e(1);
        }
    }

    public final void a(LabelPosition labelposition)
    {
        if (h != labelposition)
        {
            h = labelposition;
            e(1);
        }
    }

    public final void a(Position position)
    {
        if (w == position) goto _L2; else goto _L1
_L1:
        w = position;
        _cls6.a[w.ordinal()];
        JVM INSTR tableswitch 1 2: default 48
    //                   1 64
    //                   2 77;
           goto _L3 _L4 _L5
_L3:
        B.d = y.a;
_L7:
        e(1);
_L2:
        return;
_L4:
        B.d = y.b;
        continue; /* Loop/switch isn't completed */
_L5:
        B.d = y.c;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final void a(TickMarkMode tickmarkmode)
    {
        if (v != tickmarkmode)
        {
            v = tickmarkmode;
            e(1);
        }
    }

    public final void a(ValueType valuetype)
    {
        int i1 = valuetype.ordinal();
        if (i1 != C)
        {
            C = i1;
            A.s();
            e(1);
            I = I | 1;
        }
    }

    public final void a(b b1)
    {
        if (D != b1)
        {
            I = I | 1;
            D = b1;
            e(1);
        }
    }

    public final void a(c c1)
    {
        G = c1;
    }

    protected final void a(com.artfulbits.aiCharts.Base.a a1)
    {
        y = a1;
    }

    public final void a(Alignment alignment)
    {
        if (q != alignment)
        {
            q = alignment;
            e(0);
        }
    }

    public final void a(String s1)
    {
        if (!com.artfulbits.aiCharts.Base.v.a(B.a, s1))
        {
            B.a = s1;
            e(1);
        }
    }

    public final void a(Format format)
    {
        z.a(format);
        I = I | 1;
        e(1);
    }

    public final void a(boolean flag)
    {
        if (x != flag)
        {
            x = flag;
            e(0);
        }
    }

    public final double b(double d1)
    {
        return A.h(d1);
    }

    public final ChartCollection b()
    {
        return k;
    }

    protected final void b(float f1, float f2, float f3, float f4)
    {
        m.set(f1, f2, f3, f4);
        if (E)
        {
            float f5 = (float)(t + H) + 0.5F * Math.min(f3 - f1, f4 - f2);
            f3 = (f1 + f3) / 2.0F;
            f4 = (f2 + f4) / 2.0F;
            List list = N();
            int j1 = list.size();
            int i1 = 0;
            while (i1 < j1) 
            {
                a a1 = (a)list.get(i1);
                f1 = com.artfulbits.aiCharts.Base.p.b.a(A, a1.j);
                float f6 = FloatMath.cos(f1) * f5 + f3;
                float f7 = FloatMath.sin(f1) * f5 + f4;
                f2 = f1 * 0.1591549F;
                f1 = f2;
                if (f2 < 0.0F)
                {
                    f1 = f2 + 1.0F;
                }
                if (f1 < 0.001F)
                {
                    a1.a(f6, f7, com.artfulbits.aiCharts.Base.a._cls1.a(Alignment.c, Alignment.b), this);
                } else
                if (f1 < 0.249F)
                {
                    a1.a(f6, f7, com.artfulbits.aiCharts.Base.a._cls1.a(Alignment.c, Alignment.c), this);
                } else
                if (Math.abs(f1 - 0.25F) < 0.001F)
                {
                    a1.a(f6, f7, com.artfulbits.aiCharts.Base.a._cls1.a(Alignment.b, Alignment.c), this);
                } else
                if (f1 < 0.499F)
                {
                    a1.a(f6, f7, com.artfulbits.aiCharts.Base.a._cls1.a(Alignment.a, Alignment.c), this);
                } else
                if (Math.abs(f1 - 0.5F) < 0.001F)
                {
                    a1.a(f6, f7, com.artfulbits.aiCharts.Base.a._cls1.a(Alignment.a, Alignment.b), this);
                } else
                if (f1 < 0.749F)
                {
                    a1.a(f6, f7, com.artfulbits.aiCharts.Base.a._cls1.a(Alignment.a, Alignment.a), this);
                } else
                if (Math.abs(f1 - 0.75F) < 0.001F)
                {
                    a1.a(f6, f7, com.artfulbits.aiCharts.Base.a._cls1.a(Alignment.b, Alignment.a), this);
                } else
                {
                    a1.a(f6, f7, com.artfulbits.aiCharts.Base.a._cls1.a(Alignment.c, Alignment.a), this);
                }
                i1++;
            }
        }
    }

    public final void b(int i1)
    {
        if (H != i1)
        {
            H = i1;
            e(1);
        }
    }

    protected final void b(Canvas canvas)
    {
        if (!E) goto _L2; else goto _L1
_L1:
        float f1;
        float f9;
        float f10;
        f1 = Math.min(m.width(), m.height()) / 2.0F;
        f9 = m.centerX();
        f10 = m.centerY();
        _cls6.b[v.ordinal()];
        JVM INSTR tableswitch 1 4: default 88
    //                   1 257
    //                   2 237
    //                   3 277
    //                   4 221;
           goto _L3 _L4 _L5 _L6 _L7
_L3:
        float f2;
        boolean flag;
        float f3 = f1;
        flag = true;
        f2 = f1;
        f1 = f3;
_L8:
        a a1;
        for (Iterator iterator = N().iterator(); iterator.hasNext(); a1.a(canvas, this))
        {
            a1 = (a)iterator.next();
            if (flag && (a1.m & 1) != 0)
            {
                float f11 = com.artfulbits.aiCharts.Base.p.b.a(A, a1.j);
                float f4 = FloatMath.sin(f11);
                f11 = FloatMath.cos(f11);
                canvas.drawLine(f2 * f11 + f9, f2 * f4 + f10, f9 + f11 * f1, f10 + f1 * f4, n);
            }
        }

        break; /* Loop/switch isn't completed */
_L7:
        f2 = f1;
        float f5 = f1;
        flag = false;
        f1 = f2;
        f2 = f5;
        continue; /* Loop/switch isn't completed */
_L5:
        float f6 = f1 - (float)t;
        f2 = f1;
        flag = true;
        f1 = f6;
        continue; /* Loop/switch isn't completed */
_L4:
        float f7 = (float)t + f1;
        f2 = f1;
        flag = true;
        f1 = f7;
        continue; /* Loop/switch isn't completed */
_L6:
        float f8 = t;
        f2 = f1 + (float)t;
        f8 = f1 - f8;
        flag = true;
        f1 = f2;
        f2 = f8;
        if (true) goto _L8; else goto _L2
_L2:
    }

    protected final void b(Canvas canvas, Rect rect)
    {
        boolean flag = w.IsVertical;
        float f1;
        float f2;
        float f3;
        float f4;
        if (flag)
        {
            f4 = rect.bottom;
            f3 = -rect.height();
            f1 = rect.left;
            f2 = rect.right;
        } else
        {
            f4 = rect.left;
            f3 = rect.width();
            f1 = rect.top;
            f2 = rect.bottom;
        }
        rect = N().iterator();
        do
        {
            if (!rect.hasNext())
            {
                break;
            }
            a a1 = (a)rect.next();
            if ((a1.m & 2) != 0 && A.j(a1.j))
            {
                float f5 = (float)((double)f4 + (double)f3 * A.h(a1.j));
                if (flag)
                {
                    canvas.drawLine(f1, f5, f2, f5, o);
                } else
                {
                    canvas.drawLine(f5, f1, f5, f2, o);
                }
            }
        } while (true);
    }

    public final void b(Alignment alignment)
    {
        if (r != alignment)
        {
            r = alignment;
            e(0);
        }
    }

    public final void b(Format format)
    {
        z.a(format);
        I = I | 1;
        e(1);
    }

    public final void b(boolean flag)
    {
        L.a(flag);
    }

    public final double c(double d1)
    {
        return A.i(d1);
    }

    public final ChartCollection c()
    {
        return l;
    }

    public final void c(int i1)
    {
        o.setColor(i1);
    }

    protected final void c(Canvas canvas, Rect rect)
    {
        float f1 = rect.centerX();
        float f2 = rect.centerY();
        float f3 = rect.width();
        float f4 = rect.height();
        rect = N().iterator();
        do
        {
            if (!rect.hasNext())
            {
                break;
            }
            a a1 = (a)rect.next();
            if ((a1.m & 2) != 0)
            {
                double d1 = com.artfulbits.aiCharts.Base.p.b.a(A, a1.j);
                float f5 = (float)((double)(0.5F * f3) * Math.cos(d1));
                double d2 = 0.5F * f4;
                canvas.drawLine(f1, f2, f1 + f5, f2 + (float)(Math.sin(d1) * d2), o);
            }
        } while (true);
    }

    public final void c(String s1)
    {
        z.a(new MessageFormat(s1));
    }

    public final void c(boolean flag)
    {
        A.a(flag);
    }

    public final Position d()
    {
        return w;
    }

    public final void d(int i1)
    {
        if (t != i1)
        {
            t = i1;
            e(1);
        }
    }

    protected final void d(Canvas canvas, Rect rect)
    {
        float f1 = rect.centerX();
        float f2 = rect.centerY();
        float f3 = 0.5F * (float)rect.width();
        float f4 = 0.5F * (float)rect.height();
        rect = new RectF();
        Iterator iterator = N().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            a a1 = (a)iterator.next();
            if ((a1.m & 2) != 0)
            {
                float f5 = (float)A.h(a1.j);
                rect.set(f1 - f5 * f3, f2 - f5 * f4, f5 * f3 + f1, f5 * f4 + f2);
                canvas.drawArc(rect, 0.0F, 360F, false, o);
            }
        } while (true);
    }

    public final void d(boolean flag)
    {
        if (F != flag)
        {
            F = flag;
            e(1);
        }
    }

    protected final void e(int i1)
    {
        if (y != null)
        {
            y.b(i1);
        }
    }

    public final void e(boolean flag)
    {
        if (E != flag)
        {
            E = flag;
            e(1);
        }
    }

    public final boolean e()
    {
        return x;
    }

    public final int f()
    {
        return u;
    }

    public final int g()
    {
        return H;
    }

    public final boolean h()
    {
        return L.a();
    }

    public final c i()
    {
        return G;
    }

    public final com.artfulbits.aiCharts.Base.b j()
    {
        return L;
    }

    public final TextPaint k()
    {
        return p;
    }

    protected final e l()
    {
        if (y == null)
        {
            return null;
        } else
        {
            return y.l();
        }
    }

    public final Paint m()
    {
        return B.c;
    }

    public final LabelPosition n()
    {
        return h;
    }

    public final float o()
    {
        return M.d;
    }

    public final Alignment p()
    {
        return q;
    }

    public final Alignment q()
    {
        return r;
    }

    public final Paint r()
    {
        return n;
    }

    public final Paint s()
    {
        return o;
    }

    public final double t()
    {
        if (s == (1.0D / 0.0D))
        {
            return A.d();
        }
        if (s == (-1.0D / 0.0D))
        {
            return A.c();
        } else
        {
            return s;
        }
    }

    public final String u()
    {
        return B.a;
    }

    public final Drawable v()
    {
        return J;
    }

    public final Format w()
    {
        return z.a();
    }

    public final Format x()
    {
        return z.a();
    }

    public final boolean y()
    {
        return A.b();
    }

    public final int z()
    {
        return t;
    }

    static 
    {
        g = ValueType.a.ordinal();
        a = ValueType.b.ordinal();
    }
}
