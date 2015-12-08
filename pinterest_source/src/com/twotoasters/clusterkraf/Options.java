// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.twotoasters.clusterkraf;

import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;

// Referenced classes of package com.twotoasters.clusterkraf:
//            MarkerOptionsChooser, OnMarkerClickDownstreamListener, OnInfoWindowClickDownstreamListener, InfoWindowDownstreamAdapter

public class Options
{

    private int a;
    private Interpolator b;
    private int c;
    private double d;
    private MarkerOptionsChooser e;
    private OnMarkerClickDownstreamListener f;
    private OnInfoWindowClickDownstreamListener g;
    private InfoWindowDownstreamAdapter h;
    private int i;
    private final int j = 300;
    private int k;
    private final int l = 200;
    private int m;
    private ClusterClickBehavior n;
    private ClusterInfoWindowClickBehavior o;
    private SinglePointClickBehavior p;
    private SinglePointInfoWindowClickBehavior q;
    private long r;
    private Clusterkraf.ProcessingListener s;

    public Options()
    {
        a = 300;
        b = new AccelerateDecelerateInterpolator();
        c = 150;
        d = 0.0D;
        i = 75;
        k = 300;
        m = 200;
        n = ClusterClickBehavior.a;
        o = ClusterInfoWindowClickBehavior.b;
        p = SinglePointClickBehavior.a;
        q = SinglePointInfoWindowClickBehavior.a;
        r = 200L;
    }

    final int a()
    {
        return a;
    }

    public final void a(double d1)
    {
        d = d1;
    }

    public final void a(int i1)
    {
        a = i1;
    }

    public final void a(Clusterkraf.ProcessingListener processinglistener)
    {
        s = processinglistener;
    }

    public final void a(InfoWindowDownstreamAdapter infowindowdownstreamadapter)
    {
        h = infowindowdownstreamadapter;
    }

    public final void a(MarkerOptionsChooser markeroptionschooser)
    {
        e = markeroptionschooser;
    }

    public final void a(OnInfoWindowClickDownstreamListener oninfowindowclickdownstreamlistener)
    {
        g = oninfowindowclickdownstreamlistener;
    }

    public final void a(OnMarkerClickDownstreamListener onmarkerclickdownstreamlistener)
    {
        f = onmarkerclickdownstreamlistener;
    }

    public final void a(ClusterClickBehavior clusterclickbehavior)
    {
        n = clusterclickbehavior;
    }

    public final void a(ClusterInfoWindowClickBehavior clusterinfowindowclickbehavior)
    {
        o = clusterinfowindowclickbehavior;
    }

    public final void a(SinglePointClickBehavior singlepointclickbehavior)
    {
        p = singlepointclickbehavior;
    }

    final Interpolator b()
    {
        return b;
    }

    public final void b(int i1)
    {
        c = i1;
    }

    final int c()
    {
        return c;
    }

    public final void c(int i1)
    {
        i = i1;
    }

    final double d()
    {
        return d;
    }

    public final void d(int i1)
    {
        k = i1;
    }

    final MarkerOptionsChooser e()
    {
        return e;
    }

    public final void e(int i1)
    {
        m = i1;
    }

    final OnMarkerClickDownstreamListener f()
    {
        return f;
    }

    final OnInfoWindowClickDownstreamListener g()
    {
        return g;
    }

    public final InfoWindowDownstreamAdapter h()
    {
        return h;
    }

    final ClusterClickBehavior i()
    {
        return n;
    }

    final ClusterInfoWindowClickBehavior j()
    {
        return o;
    }

    final int k()
    {
        return i;
    }

    final int l()
    {
        return k;
    }

    final int m()
    {
        return m;
    }

    final SinglePointClickBehavior n()
    {
        return p;
    }

    final SinglePointInfoWindowClickBehavior o()
    {
        return q;
    }

    final long p()
    {
        return r;
    }

    final Clusterkraf.ProcessingListener q()
    {
        return s;
    }

    private class ClusterClickBehavior extends Enum
    {

        public static final ClusterClickBehavior a;
        public static final ClusterClickBehavior b;
        public static final ClusterClickBehavior c;
        private static final ClusterClickBehavior d[];

        public static ClusterClickBehavior valueOf(String s1)
        {
            return (ClusterClickBehavior)Enum.valueOf(com/twotoasters/clusterkraf/Options$ClusterClickBehavior, s1);
        }

        public static ClusterClickBehavior[] values()
        {
            return (ClusterClickBehavior[])d.clone();
        }

        static 
        {
            a = new ClusterClickBehavior("ZOOM_TO_BOUNDS", 0);
            b = new ClusterClickBehavior("SHOW_INFO_WINDOW", 1);
            c = new ClusterClickBehavior("NO_OP", 2);
            d = (new ClusterClickBehavior[] {
                a, b, c
            });
        }

        private ClusterClickBehavior(String s1, int i1)
        {
            super(s1, i1);
        }
    }


    private class ClusterInfoWindowClickBehavior extends Enum
    {

        public static final ClusterInfoWindowClickBehavior a;
        public static final ClusterInfoWindowClickBehavior b;
        public static final ClusterInfoWindowClickBehavior c;
        private static final ClusterInfoWindowClickBehavior d[];

        public static ClusterInfoWindowClickBehavior valueOf(String s1)
        {
            return (ClusterInfoWindowClickBehavior)Enum.valueOf(com/twotoasters/clusterkraf/Options$ClusterInfoWindowClickBehavior, s1);
        }

        public static ClusterInfoWindowClickBehavior[] values()
        {
            return (ClusterInfoWindowClickBehavior[])d.clone();
        }

        static 
        {
            a = new ClusterInfoWindowClickBehavior("ZOOM_TO_BOUNDS", 0);
            b = new ClusterInfoWindowClickBehavior("HIDE_INFO_WINDOW", 1);
            c = new ClusterInfoWindowClickBehavior("NO_OP", 2);
            d = (new ClusterInfoWindowClickBehavior[] {
                a, b, c
            });
        }

        private ClusterInfoWindowClickBehavior(String s1, int i1)
        {
            super(s1, i1);
        }
    }


    private class SinglePointClickBehavior extends Enum
    {

        public static final SinglePointClickBehavior a;
        public static final SinglePointClickBehavior b;
        private static final SinglePointClickBehavior c[];

        public static SinglePointClickBehavior valueOf(String s1)
        {
            return (SinglePointClickBehavior)Enum.valueOf(com/twotoasters/clusterkraf/Options$SinglePointClickBehavior, s1);
        }

        public static SinglePointClickBehavior[] values()
        {
            return (SinglePointClickBehavior[])c.clone();
        }

        static 
        {
            a = new SinglePointClickBehavior("SHOW_INFO_WINDOW", 0);
            b = new SinglePointClickBehavior("NO_OP", 1);
            c = (new SinglePointClickBehavior[] {
                a, b
            });
        }

        private SinglePointClickBehavior(String s1, int i1)
        {
            super(s1, i1);
        }
    }


    private class SinglePointInfoWindowClickBehavior extends Enum
    {

        public static final SinglePointInfoWindowClickBehavior a;
        public static final SinglePointInfoWindowClickBehavior b;
        private static final SinglePointInfoWindowClickBehavior c[];

        public static SinglePointInfoWindowClickBehavior valueOf(String s1)
        {
            return (SinglePointInfoWindowClickBehavior)Enum.valueOf(com/twotoasters/clusterkraf/Options$SinglePointInfoWindowClickBehavior, s1);
        }

        public static SinglePointInfoWindowClickBehavior[] values()
        {
            return (SinglePointInfoWindowClickBehavior[])c.clone();
        }

        static 
        {
            a = new SinglePointInfoWindowClickBehavior("HIDE_INFO_WINDOW", 0);
            b = new SinglePointInfoWindowClickBehavior("NO_OP", 1);
            c = (new SinglePointInfoWindowClickBehavior[] {
                a, b
            });
        }

        private SinglePointInfoWindowClickBehavior(String s1, int i1)
        {
            super(s1, i1);
        }
    }

}
