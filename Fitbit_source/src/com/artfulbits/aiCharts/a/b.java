// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.a;

import android.graphics.PointF;
import android.graphics.Rect;
import android.text.TextUtils;
import com.artfulbits.aiCharts.Base.ChartLegend;
import com.artfulbits.aiCharts.Base.ChartNamedCollection;
import com.artfulbits.aiCharts.Base.ChartPointDeclaration;
import com.artfulbits.aiCharts.Base.ChartSeries;
import com.artfulbits.aiCharts.Base.e;
import com.artfulbits.aiCharts.Base.j;
import com.artfulbits.aiCharts.Base.l;
import com.artfulbits.aiCharts.Base.p;

public abstract class com.artfulbits.aiCharts.a.b
{
    static final class a extends com.artfulbits.aiCharts.a.b
    {

        private PointF a;
        private String b;
        private int c;

        protected final void a(e e1, PointF pointf)
        {
            c;
            JVM INSTR tableswitch 0 2: default 32
        //                       0 33
        //                       1 42
        //                       2 97;
               goto _L1 _L2 _L3 _L4
_L1:
            return;
_L2:
            pointf.set(a);
            return;
_L3:
            e1 = (com.artfulbits.aiCharts.Base.a)e1.b().a(b);
            if (e1 != null)
            {
                e1 = e1.f();
                pointf.set((float)((Rect) (e1)).left + a.x, (float)((Rect) (e1)).top + a.y);
                return;
            }
            continue; /* Loop/switch isn't completed */
_L4:
            e1 = (ChartLegend)e1.d().a(b);
            if (e1 != null)
            {
                e1 = e1.h();
                pointf.set((float)((Rect) (e1)).left + a.x, (float)((Rect) (e1)).top + a.y);
                return;
            }
            if (true) goto _L1; else goto _L5
_L5:
        }

        public a(PointF pointf)
        {
            this(pointf, null, 0);
        }

        public a(PointF pointf, String s, int i)
        {
            a = pointf;
            b = s;
            c = i;
        }
    }

    static final class b extends com.artfulbits.aiCharts.a.b
    {

        private final String a;
        private final double b;
        private final double c;

        protected final void a(e e1, PointF pointf)
        {
            com.artfulbits.aiCharts.Base.a a1 = null;
            if (e1.b().size() > 0)
            {
                if (TextUtils.isEmpty(a))
                {
                    a1 = (com.artfulbits.aiCharts.Base.a)e1.b().get(0);
                } else
                {
                    a1 = (com.artfulbits.aiCharts.Base.a)e1.b().a(a);
                }
            }
            if (a1 == null)
            {
                pointf.set(0.0F, 0.0F);
                return;
            } else
            {
                p.a(a1).a(b, c, pointf);
                return;
            }
        }

        public b(String s, double d, double d1)
        {
            a = s;
            b = d;
            c = d1;
        }
    }

    static final class c extends com.artfulbits.aiCharts.a.b
    {

        private String a;
        private int b;

        protected final void a(e e1, PointF pointf)
        {
            e1 = (ChartSeries)e1.c().a(a);
            if (b >= 0 && e1 != null && e1.F().size() > b)
            {
                j j1 = e1.F().a(b);
                int i = e1.G().b;
                p.a(e1).a(j1.a(), j1.a(i), pointf);
            }
        }

        public c(String s, int i)
        {
            a = s;
            b = i;
        }
    }


    public com.artfulbits.aiCharts.a.b()
    {
    }

    public static com.artfulbits.aiCharts.a.b a(PointF pointf)
    {
        return new a(pointf);
    }

    public static com.artfulbits.aiCharts.a.b a(PointF pointf, String s)
    {
        return new a(pointf, s, 1);
    }

    public static com.artfulbits.aiCharts.a.b a(String s, double d, double d1)
    {
        return new b(s, d, d1);
    }

    public static com.artfulbits.aiCharts.a.b a(String s, int i)
    {
        return new c(s, i);
    }

    public static com.artfulbits.aiCharts.a.b b(PointF pointf, String s)
    {
        return new a(pointf, s, 2);
    }

    protected abstract void a(e e, PointF pointf);
}
