// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.Base;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import com.artfulbits.a.a;
import com.artfulbits.aiCharts.Enums.CoordinateSystem;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package com.artfulbits.aiCharts.Base:
//            x, i, u, ChartNamedCollection, 
//            ChartCollection, o, ChartLegend, a, 
//            n, ChartSeries, ac, s, 
//            ChartLayoutElement

public final class e extends x
{
    final class a
        implements ChartCollection.a
    {

        private e a;

        public final void a(Object obj, Object obj1, int i1)
        {
            obj = (com.artfulbits.aiCharts.Base.a)obj;
            obj1 = (com.artfulbits.aiCharts.Base.a)obj1;
            if (obj != null)
            {
                ((com.artfulbits.aiCharts.Base.a) (obj)).a(a);
            }
            if (obj1 != null)
            {
                ((com.artfulbits.aiCharts.Base.a) (obj1)).a(null);
            }
            a.b(65);
        }

        private a()
        {
            a = e.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }

    final class b
        implements ChartCollection.a
    {

        private e a;

        public final void a(Object obj, Object obj1, int i1)
        {
            obj = (ChartLegend)obj;
            obj1 = (ChartLegend)obj1;
            if (obj != null)
            {
                ((ChartLegend) (obj)).a(a);
            }
            if (obj1 != null)
            {
                ((ChartLegend) (obj1)).a(null);
            }
            a.b(257);
        }

        private b()
        {
            a = e.this;
            super();
        }

        b(byte byte0)
        {
            this();
        }
    }

    final class c
        implements ChartCollection.a
    {

        private e a;

        public final void a(Object obj, Object obj1, int i1)
        {
            obj = (ChartSeries)obj;
            obj1 = (ChartSeries)obj1;
            if (obj != null)
            {
                ((ChartSeries) (obj)).a(a);
                ((ChartSeries) (obj)).a(e.c(a));
            }
            if (obj1 != null)
            {
                ((ChartSeries) (obj1)).a(null);
                ((ChartSeries) (obj1)).a(null);
            }
            a.c(16);
        }

        private c()
        {
            a = e.this;
            super();
        }

        c(byte byte0)
        {
            this();
        }
    }


    public static final com.artfulbits.a.a a = com.artfulbits.a.a.a(com/artfulbits/aiCharts/Base/e, "/assets/aicharts.ablic", "/assets/license.lic", m, n);
    protected static final int b = 1;
    protected static final int c = 16;
    protected static final int d = 32;
    protected static final int e = 64;
    protected static final int f = 128;
    protected static final int g = 256;
    protected static final int h = 512;
    protected static final int i = 2;
    protected static final int j = 1;
    protected static final int k = 0;
    private static final byte m[] = {
        1, 0, 1
    };
    private static final byte n[] = {
        0, -53, 80, 25, 36, 64, 49, -6, -28, -109, 
        44, -61, -122, 82, -115, -102, -4, -84, -15, -17, 
        -123, -116, 19, -76, -109, -117, 117, -79, 48, 102, 
        -127, -103, 39, 20, -57, -77, 12, 35, 82, 47, 
        -35, 10, -38, 88, 60, 79, -44, -126, 16, -29, 
        -123, 85, 28, -114, 89, 76, 72, 112, -103, 18, 
        101, 122, 102, -1, 5, -53, -127, -44, -103, 21, 
        -23, -121, -62, 39, 43, 66, 126, -10, -8, -63, 
        -114, 72, -86, -70, -91, 9, -77, -52, -76, -67, 
        -111, 70, -13, -38, -60, 49, 85, 118, -34, -125, 
        -50, 98, -121, -127, -8, 64, 47, -68, -110, 54, 
        104, -35, -78, -87, -52, 34, -55, -51, -98, -111, 
        -128, -72, 75, -81, 34, 125, 79, -106, -59
    };
    private boolean A;
    private boolean B;
    private int C;
    private Paint D;
    private final u E[];
    protected final android.graphics.drawable.Drawable.Callback l;
    private final Rect o;
    private int p;
    private ChartNamedCollection q;
    private ChartNamedCollection r;
    private ChartNamedCollection s;
    private ChartCollection t;
    private ChartCollection u;
    private final ArrayList v;
    private final ArrayList w;
    private n x;
    private boolean y;
    private i z;

    public e()
    {
        o = new Rect();
        p = 10;
        q = null;
        r = null;
        s = null;
        t = null;
        v = new ArrayList();
        w = new ArrayList();
        y = true;
        z = com.artfulbits.aiCharts.Base.i.a;
        A = true;
        B = false;
        C = 0;
        D = null;
        l = new android.graphics.drawable.Drawable.Callback() {

            private final Handler a = new Handler();
            private e b;

            public final void invalidateDrawable(Drawable drawable)
            {
                b.b(0);
            }

            public final void scheduleDrawable(Drawable drawable, Runnable runnable, long l1)
            {
                a.postAtTime(runnable, drawable, l1);
            }

            public final void unscheduleDrawable(Drawable drawable, Runnable runnable)
            {
                a.removeCallbacks(runnable, drawable);
            }

            
            {
                b = e.this;
                super();
            }
        };
        E = new u[3];
        u au[] = E;
        u au1[] = E;
        u u1 = new u() {

            private e a;

            public final void a(List list, Rect rect)
            {
                Rect rect1;
                Point point;
                int i1;
                int j1;
                int k1;
                int l1;
                int i2;
                j1 = com.artfulbits.aiCharts.Base.e.a(a);
                k1 = rect.width();
                l1 = rect.height();
                rect1 = new Rect();
                point = new Point();
                i2 = list.size();
                i1 = 0;
_L8:
                ChartLayoutElement chartlayoutelement;
                if (i1 >= i2)
                {
                    break MISSING_BLOCK_LABEL_348;
                }
                chartlayoutelement = (ChartLayoutElement)list.get(i1);
                if (!chartlayoutelement.d() || !chartlayoutelement.b())
                {
                    break MISSING_BLOCK_LABEL_299;
                }
                rect1.set(rect);
                point.set(k1, l1);
                chartlayoutelement.a(point);
                static final class _cls6
                {

                    static final int a[];

                    static 
                    {
                        a = new int[ChartLayoutElement.Dock.values().length];
                        try
                        {
                            a[com.artfulbits.aiCharts.Base.ChartLayoutElement.Dock.a.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror3) { }
                        try
                        {
                            a[ChartLayoutElement.Dock.c.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror2) { }
                        try
                        {
                            a[ChartLayoutElement.Dock.b.ordinal()] = 3;
                        }
                        catch (NoSuchFieldError nosuchfielderror1) { }
                        try
                        {
                            a[ChartLayoutElement.Dock.d.ordinal()] = 4;
                        }
                        catch (NoSuchFieldError nosuchfielderror)
                        {
                            return;
                        }
                    }
                }

                com.artfulbits.aiCharts.Base._cls6.a[chartlayoutelement.c().ordinal()];
                JVM INSTR tableswitch 1 4: default 148
            //                           1 163
            //                           2 197
            //                           3 231
            //                           4 265;
                   goto _L1 _L2 _L3 _L4 _L5
_L1:
                chartlayoutelement.c(rect1);
_L6:
                i1++;
                continue; /* Loop/switch isn't completed */
_L2:
                rect1.right = rect.left + point.x;
                rect.left = rect.left + (point.x + j1);
                  goto _L1
_L3:
                rect1.bottom = rect.top + point.y;
                rect.top = rect.top + (point.y + j1);
                  goto _L1
_L4:
                rect1.left = rect.right - point.x;
                rect.right = rect.right - (point.x + j1);
                  goto _L1
_L5:
                rect1.top = rect.bottom - point.y;
                rect.bottom = rect.bottom - (point.y + j1);
                  goto _L1
                if (chartlayoutelement.d())
                {
                    point.set(chartlayoutelement.h().width(), chartlayoutelement.h().height());
                    chartlayoutelement.a(point);
                    chartlayoutelement.c(chartlayoutelement.h());
                }
                  goto _L6
                return;
                if (true) goto _L8; else goto _L7
_L7:
            }

            
            {
                a = e.this;
                super();
            }
        };
        au1[0] = u1;
        au[1] = u1;
        E[2] = new u() {

            private e a;

            public final void a(List list, Rect rect)
            {
                boolean flag = false;
                Rect rect1 = new Rect(rect);
                int i2 = list.size();
                if (i2 == 0)
                {
                    return;
                }
                int k1 = com.artfulbits.aiCharts.Base.e.a(a);
                int j2 = (rect.height() - (i2 - 1) * k1) / i2;
                for (int i1 = 0; i1 < i2; i1++)
                {
                    com.artfulbits.aiCharts.Base.a a1 = (com.artfulbits.aiCharts.Base.a)list.get(i1);
                    rect1.bottom = rect1.top + j2;
                    if (a1.j())
                    {
                        a1.c(rect1);
                    }
                    rect1.top = rect1.top + (j2 + k1);
                }

                if (e.b(a) && list.size() > 1)
                {
                    Rect rect2 = new Rect(0, 0, rect.width(), rect.height());
                    Rect rect3 = new Rect();
                    int j1 = 0;
                    int l1;
                    do
                    {
                        l1 = ((flag) ? 1 : 0);
                        if (j1 >= i2)
                        {
                            break;
                        }
                        com.artfulbits.aiCharts.Base.a a2 = (com.artfulbits.aiCharts.Base.a)list.get(j1);
                        a2.p();
                        if (a2.j() && a2.i() == CoordinateSystem.a)
                        {
                            rect3.set(a2.g());
                            rect3.offset(-a2.f().left, -a2.f().top);
                            rect2.left = Math.max(rect2.left, rect3.left);
                            rect2.right = Math.min(rect2.right, rect3.right);
                        }
                        j1++;
                    } while (true);
                    for (; l1 < i2; l1++)
                    {
                        com.artfulbits.aiCharts.Base.a a3 = (com.artfulbits.aiCharts.Base.a)list.get(l1);
                        if (a3.j() && a3.i() == CoordinateSystem.a)
                        {
                            rect3.set(a3.g());
                            rect3.left = a3.f().left + rect2.left;
                            rect3.right = a3.f().left + rect2.right;
                            a3.d(rect3);
                        }
                    }

                }
                rect.setEmpty();
            }

            
            {
                a = e.this;
                super();
            }
        };
        q = new ChartNamedCollection(new a((byte)0), "area_");
        r = new ChartNamedCollection(new c((byte)0), "series_");
        s = new ChartNamedCollection(new b((byte)0), "legend_");
        t = new ChartCollection(new ChartCollection.a() {

            private e a;

            public final void a(Object obj, Object obj1, int i1)
            {
                obj = (o)obj;
                obj1 = (o)obj1;
                if (obj != null)
                {
                    ((o) (obj)).a(a);
                }
                if (obj1 != null)
                {
                    ((o) (obj1)).a(null);
                }
                a.b(129);
            }

            
            {
                a = e.this;
                super();
            }
        });
        u = new ChartCollection(new ChartCollection.a() {

            private e a;

            public final void a(Object obj, Object obj1, int i1)
            {
                a.b(512);
            }

            
            {
                a = e.this;
                super();
            }
        });
    }

    public e(Resources resources, int i1)
    {
        this(resources, ((XmlPullParser) (resources.getXml(i1))));
    }

    public e(Resources resources, XmlPullParser xmlpullparser)
    {
        this();
        try
        {
            if ("chart".equalsIgnoreCase(com.artfulbits.aiCharts.Base.x.a(xmlpullparser, xmlpullparser.getDepth())))
            {
                a(this, resources, xmlpullparser);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Resources resources)
        {
            throw new RuntimeException(resources);
        }
        // Misplaced declaration of an exception variable
        catch (Resources resources)
        {
            throw new RuntimeException(resources);
        }
        throw new RuntimeException("unable to read 'chart' tag");
    }

    static int a(e e1)
    {
        return e1.p;
    }

    private void b(int i1, int j1, int k1, int l1)
    {
        Rect rect = new Rect(i1, j1, k1, l1);
        rect.inset(p, p);
        E[0].a(t, rect);
        E[1].a(s, rect);
        E[2].a(q, rect);
    }

    static boolean b(e e1)
    {
        return e1.y;
    }

    static n c(e e1)
    {
        return e1.x;
    }

    public final void a(int i1)
    {
        p = i1;
    }

    public final void a(int i1, int j1)
    {
        o.set(0, 0, i1, j1);
        C = C | 1;
    }

    public final void a(int i1, int j1, int k1, int l1)
    {
        o.set(i1, j1, k1, l1);
        C = C | 1;
    }

    public final void a(int i1, int j1, List list)
    {
        boolean flag = false;
        int j2 = t.size();
        for (int k1 = 0; k1 < j2; k1++)
        {
            o o1 = (o)t.get(k1);
            if (o1.h().contains(i1, j1))
            {
                list.add(o1);
            }
        }

        j2 = s.size();
        for (int l1 = 0; l1 < j2; l1++)
        {
            ChartLegend chartlegend = (ChartLegend)s.get(l1);
            if (!chartlegend.h().contains(i1, j1))
            {
                continue;
            }
            g g1 = chartlegend.b(i1, j1);
            if (g1 != null)
            {
                list.add(g1);
            }
            list.add(chartlegend);
        }

        j2 = q.size();
        for (int i2 = ((flag) ? 1 : 0); i2 < j2; i2++)
        {
            com.artfulbits.aiCharts.Base.a a1 = (com.artfulbits.aiCharts.Base.a)q.get(i2);
            if (a1.f().contains(i1, j1))
            {
                list.add(a1);
                a1.a(i1, j1, list);
            }
        }

    }

    protected final void a(Resources resources, String s1, int i1, AttributeSet attributeset)
    {
        if ("palette".equalsIgnoreCase(s1))
        {
            i1 = attributeset.getAttributeResourceValue(i1, -1);
            if (i1 != -1 && resources != null)
            {
                a(new i(resources.getIntArray(i1)));
            }
        } else
        if ("spacing".equalsIgnoreCase(s1))
        {
            p = attributeset.getAttributeIntValue(i1, p);
            return;
        }
    }

    public final void a(Bitmap bitmap, boolean flag)
    {
        Canvas canvas = new Canvas(bitmap);
        Rect rect = new Rect(o);
        if (flag)
        {
            a(bitmap.getWidth(), bitmap.getHeight());
        } else
        {
            canvas.translate(-o.left, -o.top);
        }
        a(canvas);
        if (flag)
        {
            a(rect);
        }
    }

    public final void a(Canvas canvas)
    {
        if ((C & 1) != 0)
        {
            b(o.left, o.top, o.right, o.bottom);
        }
        int i2 = q.size();
        for (int i1 = 0; i1 < i2; i1++)
        {
            ((com.artfulbits.aiCharts.Base.a)q.get(i1)).a(canvas);
        }

        i2 = s.size();
        for (int j1 = 0; j1 < i2; j1++)
        {
            if (((ChartLegend)s.get(j1)).d())
            {
                ((ChartLegend)s.get(j1)).a(canvas);
            }
        }

        i2 = t.size();
        for (int k1 = 0; k1 < i2; k1++)
        {
            if (((o)t.get(k1)).d())
            {
                ((o)t.get(k1)).a(canvas);
            }
        }

        i2 = u.size();
        for (int l1 = 0; l1 < i2; l1++)
        {
            ((com.artfulbits.aiCharts.a.a)u.get(l1)).a(canvas, this);
        }

        C = 0;
        if (a == null || !a.b() || !"Developer".equals(a.h()))
        {
            if (D == null)
            {
                D = new Paint();
            }
            D.reset();
            D.setAntiAlias(true);
            D.setTextAlign(android.graphics.Paint.Align.CENTER);
            D.setColor(Color.argb(140, 255, 255, 255));
            D.setTypeface(Typeface.DEFAULT_BOLD);
            D.setShadowLayer(0.1F, -1F, -1F, Color.argb(140, 0, 0, 0));
            D.setTextSize((float)o.width() * 0.035F);
            canvas.drawText("aiCharts is running with trial license", o.centerX(), (float)o.centerY() + D.ascent(), D);
            canvas.drawText("Contact sales@artfulbits.com for purchase.", o.centerX(), (float)o.centerY() - D.ascent(), D);
        }
    }

    public final void a(Rect rect)
    {
        o.set(rect);
        C = C | 1;
    }

    protected final void a(ac ac1)
    {
        w.add(ac1);
    }

    public final void a(i i1)
    {
        z = i1;
        b(0);
    }

    public final void a(n n1)
    {
        if (x != null)
        {
            x.a(null);
        }
        x = n1;
        if (x != null)
        {
            x.a(this);
            int j1 = r.size();
            for (int i1 = 0; i1 < j1; i1++)
            {
                ((ChartSeries)r.get(i1)).a(x);
            }

        }
    }

    public final void a(s s1)
    {
        v.add(s1);
    }

    public final void a(OutputStream outputstream)
    {
        Bitmap bitmap = Bitmap.createBitmap(o.width(), o.height(), android.graphics.Bitmap.Config.ARGB_8888);
        a(bitmap, false);
        bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, outputstream);
    }

    public final void a(boolean flag)
    {
        if (A != flag)
        {
            A = flag;
            b(1);
        }
    }

    public final boolean a()
    {
        return A;
    }

    public final ChartNamedCollection b()
    {
        return q;
    }

    protected final x b(String s1)
    {
        if ("area".equalsIgnoreCase(s1))
        {
            s1 = new com.artfulbits.aiCharts.Base.a();
            q.add(s1);
            return s1;
        }
        if ("legend".equalsIgnoreCase(s1))
        {
            s1 = new ChartLegend(new f.f());
            s.add(s1);
            return s1;
        }
        if ("series".equalsIgnoreCase(s1))
        {
            s1 = new ChartSeries();
            r.add(s1);
            return s1;
        }
        if ("title".equalsIgnoreCase(s1))
        {
            s1 = new o();
            t.add(s1);
            return s1;
        } else
        {
            return null;
        }
    }

    public final List b(int i1, int j1)
    {
        ArrayList arraylist = new ArrayList();
        a(i1, j1, arraylist);
        return arraylist;
    }

    protected final void b(int i1)
    {
        boolean flag = false;
        C = C | i1;
        int l1 = w.size();
        for (int j1 = 0; j1 < l1; j1++)
        {
            ((ac)w.get(j1)).a(i1);
        }

        int k1 = v.size();
        for (i1 = ((flag) ? 1 : 0); i1 < k1; i1++)
        {
            ((s)v.get(i1)).a();
        }

    }

    protected final void b(ac ac1)
    {
        w.remove(ac1);
    }

    public final void b(s s1)
    {
        v.remove(s1);
    }

    public final void b(boolean flag)
    {
        if (B != flag)
        {
            B = flag;
            b(0);
        }
    }

    public final ChartNamedCollection c()
    {
        return r;
    }

    protected final void c(int i1)
    {
        int k1 = w.size();
        for (int j1 = 0; j1 < k1; j1++)
        {
            ((ac)w.get(j1)).a(i1);
        }

    }

    public final void c(boolean flag)
    {
        if (y != flag)
        {
            y = flag;
            b(1);
        }
    }

    public final ChartNamedCollection d()
    {
        return s;
    }

    public final void d(boolean flag)
    {
        if (flag || (C & 1) != 0)
        {
            b(o.left, o.top, o.right, o.bottom);
        }
    }

    public final ChartCollection e()
    {
        return t;
    }

    public final ChartCollection f()
    {
        return u;
    }

    public final Rect g()
    {
        return o;
    }

    public final boolean h()
    {
        return B;
    }

    public final n i()
    {
        return x;
    }

    public final i j()
    {
        return z;
    }

    public final int k()
    {
        return p;
    }

    protected final e l()
    {
        return this;
    }

    public final boolean m()
    {
        return y;
    }

}
