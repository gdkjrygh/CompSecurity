// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.panels;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.Toast;
import com.aviary.android.feather.common.b.b;
import com.aviary.android.feather.headless.moa.c;
import com.aviary.android.feather.headless.moa.d;
import com.aviary.android.feather.headless.moa.g;
import com.aviary.android.feather.headless.moa.h;
import com.aviary.android.feather.headless.moa.k;
import com.aviary.android.feather.library.d.a;
import com.aviary.android.feather.library.services.ConfigService;
import com.aviary.android.feather.library.services.IAviaryController;
import com.aviary.android.feather.sdk.a.e;
import com.aviary.android.feather.sdk.a.f;
import com.aviary.android.feather.sdk.widget.AviaryAdapterView;
import com.aviary.android.feather.sdk.widget.AviaryGallery;
import com.aviary.android.feather.sdk.widget.AviaryHighlightImageButton;
import com.aviary.android.feather.sdk.widget.ImageViewTouchAndDraw;
import com.aviary.android.feather.sdk.widget.i;
import it.sephiroth.android.library.imagezoom.ImageViewTouch;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;

// Referenced classes of package com.aviary.android.feather.sdk.panels:
//            a

public class j extends com.aviary.android.feather.sdk.panels.a
    implements android.view.View.OnClickListener, com.aviary.android.feather.sdk.widget.ImageViewTouchAndDraw.a, com.aviary.android.feather.sdk.widget.ImageViewTouchAndDraw.b
{
    private static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        private static final a d[];

        public static a valueOf(String s1)
        {
            return (a)Enum.valueOf(com/aviary/android/feather/sdk/panels/j$a, s1);
        }

        public static a[] values()
        {
            return (a[])d.clone();
        }

        static 
        {
            a = new a("Draw", 0);
            b = new a("Erase", 1);
            c = new a("Zoom", 2);
            d = (new a[] {
                a, b, c
            });
        }

        private a(String s1, int l)
        {
            super(s1, l);
        }
    }

    class b extends BaseAdapter
    {

        LayoutInflater a;
        Resources b;
        final j c;
        private final int d = 0;
        private final int e = 1;
        private final int f = 2;
        private int g[];

        public int getCount()
        {
            return g.length;
        }

        public Object getItem(int l)
        {
            return Integer.valueOf(g[l]);
        }

        public long getItemId(int l)
        {
            return 0L;
        }

        public int getItemViewType(int l)
        {
            boolean flag;
            if (l >= 0 && l < getCount())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag)
            {
                return 1;
            }
            return ((Integer)getItem(l)).intValue() != 0 ? 0 : 2;
        }

        public View getView(int l, View view, ViewGroup viewgroup)
        {
            int i1 = getItemViewType(l);
            View view1 = null;
            if (view == null)
            {
                if (i1 == 2)
                {
                    view = a.inflate(com.aviary.android.feather.sdk.R.layout.aviary_gallery_item_highlight_view, viewgroup, false);
                    view.setContentDescription(c.J);
                } else
                {
                    view = a.inflate(com.aviary.android.feather.sdk.R.layout.aviary_gallery_item_view, viewgroup, false);
                }
                viewgroup = view1;
                view1 = view;
                if (i1 == 0)
                {
                    viewgroup = new e(c.B().a());
                    ((ImageView)view.findViewById(com.aviary.android.feather.sdk.R.id.image)).setImageDrawable(viewgroup);
                    view.setTag(viewgroup);
                    view1 = view;
                }
            } else
            {
                viewgroup = view1;
                view1 = view;
                if (i1 == 0)
                {
                    viewgroup = (e)view.getTag();
                    view1 = view;
                }
            }
            if (viewgroup != null && i1 == 0)
            {
                i1 = g[l];
                viewgroup.a(i1);
                try
                {
                    view1.setContentDescription((new StringBuilder()).append(c.L).append(" ").append(Integer.toHexString(i1)).toString());
                }
                // Misplaced declaration of an exception variable
                catch (View view) { }
            }
            view1.setId(l);
            return view1;
        }

        public int getViewTypeCount()
        {
            return 3;
        }

        public b(Context context, int ai[])
        {
            c = j.this;
            super();
            a = LayoutInflater.from(context);
            g = ai;
            b = context.getResources();
        }
    }

    class c extends BaseAdapter
    {

        LayoutInflater a;
        Resources b;
        final j c;
        private final int d = 0;
        private final int e = 1;
        private int f[];

        public int getCount()
        {
            return f.length;
        }

        public Object getItem(int l)
        {
            return Integer.valueOf(f[l]);
        }

        public long getItemId(int l)
        {
            return 0L;
        }

        public int getItemViewType(int l)
        {
            if (l >= 0 && l < getCount())
            {
                l = 1;
            } else
            {
                l = 0;
            }
            return l == 0 ? 1 : 0;
        }

        public View getView(int l, View view, ViewGroup viewgroup)
        {
            int i1 = getItemViewType(l);
            View view1 = null;
            if (view == null)
            {
                view = a.inflate(com.aviary.android.feather.sdk.R.layout.aviary_gallery_item_view, viewgroup, false);
                viewgroup = view1;
                view1 = view;
                if (i1 == 0)
                {
                    viewgroup = new f(c.B().a());
                    ((ImageView)view.findViewById(com.aviary.android.feather.sdk.R.id.image)).setImageDrawable(viewgroup);
                    view.setTag(viewgroup);
                    view1 = view;
                }
            } else
            {
                viewgroup = view1;
                view1 = view;
                if (i1 == 0)
                {
                    viewgroup = (f)view.getTag();
                    view1 = view;
                }
            }
            if (viewgroup != null && i1 == 0)
            {
                i1 = f[l];
                float f1 = com.aviary.android.feather.sdk.panels.j.f(c);
                f1 = (((float)i1 - (float)com.aviary.android.feather.sdk.panels.j.g(c)) / (float)(com.aviary.android.feather.sdk.panels.j.h(c) - com.aviary.android.feather.sdk.panels.j.g(c))) * (com.aviary.android.feather.sdk.panels.j.i(c) - com.aviary.android.feather.sdk.panels.j.f(c)) * 0.55F + f1;
                try
                {
                    view1.setContentDescription((new StringBuilder()).append(c.K).append(" ").append(Float.toString(f1)).toString());
                }
                // Misplaced declaration of an exception variable
                catch (View view) { }
                viewgroup.a(f1);
            }
            view1.setId(l);
            return view1;
        }

        public int getViewTypeCount()
        {
            return 2;
        }

        public c(Context context, int ai[])
        {
            c = j.this;
            super();
            a = LayoutInflater.from(context);
            f = ai;
            b = context.getResources();
        }
    }


    int A;
    com.aviary.android.feather.headless.moa.b B;
    d C;
    com.aviary.android.feather.library.d.c D;
    Collection E;
    h F;
    e G;
    f H;
    Toast I;
    String J;
    String K;
    String L;
    private int M;
    private int N;
    private int O;
    private Paint P;
    private ConfigService Q;
    private a R;
    private float S;
    private float T;
    private int U;
    private int V;
    private int W;
    private int X;
    protected AviaryHighlightImageButton s;
    protected AviaryGallery t;
    protected AviaryGallery u;
    protected int v;
    protected int w;
    int x[];
    int y[];
    int z;

    public j(IAviaryController iaviarycontroller, com.aviary.android.feather.library.a.a a1)
    {
        super(iaviarycontroller, a1);
        w = 0;
        M = 0;
        N = 10;
        O = 1;
    }

    private void I()
    {
        t.setDefaultPosition(U);
        t.setCallbackDuringFling(true);
        t.setAutoSelectChild(true);
        t.setAdapter(new c(B().a(), x));
    }

    private void J()
    {
        u.setDefaultPosition(V);
        u.setCallbackDuringFling(true);
        u.setAutoSelectChild(true);
        u.setAdapter(new b(B().a(), y));
    }

    private void K()
    {
        B().d();
        c.a(g, null, -1F, 8F);
        ((ImageViewTouchAndDraw)c).setDrawMode(com.aviary.android.feather.sdk.widget.ImageViewTouchAndDraw.c.b);
    }

    private Toast L()
    {
        G = new e(B().a());
        H = new f(B().a());
        Toast toast = com.aviary.android.feather.sdk.utils.e.a(B().a());
        ((ImageView)toast.getView().findViewById(com.aviary.android.feather.sdk.R.id.image)).setImageDrawable(G);
        return toast;
    }

    private void M()
    {
        int i1 = u.getSelectedItemPosition();
        int l = t.getSelectedItemPosition();
        if (I != null && i1 > -1 && l > -1)
        {
            i1 = y[i1];
            l = x[l];
            ImageView imageview = (ImageView)I.getView().findViewById(com.aviary.android.feather.sdk.R.id.image);
            if (i1 != 0)
            {
                G.a(l);
                G.a(i1);
                imageview.setImageDrawable(G);
            } else
            {
                H.b(l);
                imageview.setImageDrawable(H);
            }
            I.show();
        }
    }

    private a N()
    {
        return R;
    }

    static int a(j j1)
    {
        return j1.N;
    }

    static int a(j j1, int l)
    {
        j1.N = l;
        return l;
    }

    private Paint a(Paint paint)
    {
        paint.setDither(true);
        paint.setAntiAlias(true);
        paint.setFilterBitmap(false);
        paint.setColor(M);
        paint.setStrokeWidth(N * 2);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeJoin(android.graphics.Paint.Join.ROUND);
        paint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        paint.setMaskFilter(new BlurMaskFilter(O, android.graphics.BlurMaskFilter.Blur.NORMAL));
        return paint;
    }

    private void a(a a1)
    {
        boolean flag1 = true;
        static class _cls3
        {

            static final int a[];

            static 
            {
                a = new int[a.values().length];
                try
                {
                    a[com.aviary.android.feather.sdk.panels.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.aviary.android.feather.sdk.panels.a.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.aviary.android.feather.sdk.panels.a.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        com.aviary.android.feather.sdk.panels._cls3.a[a1.ordinal()];
        JVM INSTR tableswitch 1 3: default 36
    //                   1 76
    //                   2 111
    //                   3 196;
           goto _L1 _L2 _L3 _L4
_L1:
        break; /* Loop/switch isn't completed */
_L4:
        break MISSING_BLOCK_LABEL_196;
_L5:
        AviaryHighlightImageButton aviaryhighlightimagebutton = s;
        boolean flag;
        if (a1 == com.aviary.android.feather.sdk.panels.a.c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        aviaryhighlightimagebutton.setSelected(flag);
        if (a1 != com.aviary.android.feather.sdk.panels.a.c)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        d(flag);
        R = a1;
        return;
_L2:
        ((ImageViewTouchAndDraw)c).setDrawMode(com.aviary.android.feather.sdk.widget.ImageViewTouchAndDraw.c.b);
        P.setAlpha(255);
        P.setXfermode(null);
          goto _L5
_L3:
        ((ImageViewTouchAndDraw)c).setDrawMode(com.aviary.android.feather.sdk.widget.ImageViewTouchAndDraw.c.b);
        P.setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR));
        P.setAlpha(0);
        B().h().a((new StringBuilder()).append(com.aviary.android.feather.library.filters.a.a.i.name().toLowerCase(Locale.US)).append(": eraser_selected").toString());
          goto _L5
        ((ImageViewTouchAndDraw)c).setDrawMode(com.aviary.android.feather.sdk.widget.ImageViewTouchAndDraw.c.a);
          goto _L5
    }

    static void a(j j1, a a1)
    {
        j1.a(a1);
    }

    static int b(j j1, int l)
    {
        j1.M = l;
        return l;
    }

    static Paint b(j j1)
    {
        return j1.P;
    }

    static a c(j j1)
    {
        return j1.N();
    }

    static void d(j j1)
    {
        j1.M();
    }

    static int e(j j1)
    {
        return j1.M;
    }

    static float f(j j1)
    {
        return j1.S;
    }

    static int g(j j1)
    {
        return j1.W;
    }

    static int h(j j1)
    {
        return j1.X;
    }

    static float i(j j1)
    {
        return j1.T;
    }

    public void A()
    {
        ((ImageViewTouchAndDraw)c).setOnDrawStartListener(null);
        ((ImageViewTouchAndDraw)c).setOnDrawPathListener(null);
        s.setOnClickListener(null);
        u.setOnItemsScrollListener(null);
        t.setOnItemsScrollListener(null);
        if (I != null)
        {
            I.cancel();
        }
        super.A();
    }

    protected void F()
    {
        Bitmap bitmap;
        Canvas canvas;
        if (!g.isMutable())
        {
            bitmap = com.aviary.android.feather.library.c.b.a(g, g.getConfig());
        } else
        {
            bitmap = g;
        }
        canvas = new Canvas(bitmap);
        ((ImageViewTouchAndDraw)c).a(canvas);
        ((ImageViewTouchAndDraw)c).a(bitmap, c.getDisplayMatrix(), -1F, -1F);
        e.a(D);
        e.a(C);
        b(bitmap);
    }

    public void G()
    {
        q.b("onStart");
        float f1 = ((ImageViewTouchAndDraw)c).getDrawingScale();
        int i1 = O;
        float f2 = N * 2;
        int j1 = M;
        int l;
        if (N() == com.aviary.android.feather.sdk.panels.a.b)
        {
            l = 1;
        } else
        {
            l = 0;
        }
        F = new h(i1, f2 * f1, j1, l);
    }

    public void H()
    {
        q.b("onEnd");
        if (F != null)
        {
            E.add(F);
        }
    }

    public void a()
    {
        c(true);
    }

    public void a(float f1, float f2)
    {
        if (F != null)
        {
            F.a(new g(0, f1, f2));
        }
    }

    public void a(float f1, float f2, float f3, float f4)
    {
        if (F != null)
        {
            F.a(new g(2, f1, f2, f3, f4));
        }
    }

    public void a(Bitmap bitmap, Bundle bundle)
    {
        super.a(bitmap, bundle);
        Q = (ConfigService)B().a(com/aviary/android/feather/library/services/ConfigService);
        S = (float)Q.a(com.aviary.android.feather.sdk.R.integer.aviary_spot_gallery_item_min_size) / 100F;
        T = (float)Q.a(com.aviary.android.feather.sdk.R.integer.aviary_spot_gallery_item_max_size) / 100F;
        J = Q.f(com.aviary.android.feather.sdk.R.string.feather_colorsplash_eraser);
        L = Q.f(com.aviary.android.feather.sdk.R.string.feather_acc_color);
        K = Q.f(com.aviary.android.feather.sdk.R.string.feather_acc_size);
        x = Q.b(com.aviary.android.feather.sdk.R.array.aviary_draw_brush_sizes);
        U = Q.a(com.aviary.android.feather.sdk.R.integer.aviary_draw_brush_index);
        y = Q.b(com.aviary.android.feather.sdk.R.array.aviary_draw_fill_colors);
        V = Q.a(com.aviary.android.feather.sdk.R.integer.aviary_draw_fill_color_index);
        W = x[0];
        X = x[x.length - 1];
        O = Q.a(com.aviary.android.feather.sdk.R.integer.aviary_draw_brush_softValue);
        M = y[V];
        N = x[U];
        s = (AviaryHighlightImageButton)b().findViewById(com.aviary.android.feather.sdk.R.id.aviary_lens_button);
        t = (AviaryGallery)f().findViewById(com.aviary.android.feather.sdk.R.id.aviary_gallery);
        u = (AviaryGallery)f().findViewById(com.aviary.android.feather.sdk.R.id.aviary_gallery2);
        c = (ImageViewTouchAndDraw)b().findViewById(com.aviary.android.feather.sdk.R.id.image);
        c.setDisplayType(it.sephiroth.android.library.imagezoom.ImageViewTouchBase.a.c);
        I = L();
        z = g.getWidth();
        A = g.getHeight();
        K();
        v = 1;
        w = 0;
        E = new ArrayList();
        F = null;
        C = com.aviary.android.feather.headless.moa.c.a(new String[] {
            "draw"
        });
        D = new com.aviary.android.feather.library.d.c(Integer.valueOf(0));
        B = C.a(0);
        B.a("previewSize", new k(z, A));
        B.a("commands", E);
        J();
        I();
        P = a(((ImageViewTouchAndDraw)c).getPaint());
        ((ImageViewTouchAndDraw)c).setPaint(P);
    }

    public volatile void a(boolean flag)
    {
        super.a(flag);
    }

    protected View b(LayoutInflater layoutinflater)
    {
        return layoutinflater.inflate(com.aviary.android.feather.sdk.R.layout.aviary_content_draw, null);
    }

    protected ViewGroup b(LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
        return (ViewGroup)layoutinflater.inflate(com.aviary.android.feather.sdk.R.layout.aviary_panel_draw, viewgroup, false);
    }

    public void d(boolean flag)
    {
        if (!n())
        {
            return;
        }
        View view;
        byte byte0;
        if (flag)
        {
            B().f();
        } else
        {
            B().a(com.aviary.android.feather.sdk.R.string.feather_zoom_mode);
        }
        view = d.findViewById(com.aviary.android.feather.sdk.R.id.aviary_disable_status);
        if (flag)
        {
            byte0 = 4;
        } else
        {
            byte0 = 0;
        }
        view.setVisibility(byte0);
    }

    public volatile boolean e()
    {
        return super.e();
    }

    public void onClick(View view)
    {
label0:
        {
            if (view.getId() == s.getId())
            {
                boolean flag;
                if (!view.isSelected())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                view.setSelected(flag);
                q.b((new StringBuilder()).append("isSelected: ").append(view.isSelected()).toString());
                q.b((new StringBuilder()).append("selectedToolPos: ").append(u.getSelectedItemPosition()).toString());
                if (!view.isSelected())
                {
                    break label0;
                }
                a(com.aviary.android.feather.sdk.panels.a.c);
            }
            return;
        }
        if (u.getSelectedItemPosition() == 0)
        {
            a(com.aviary.android.feather.sdk.panels.a.b);
            return;
        } else
        {
            a(com.aviary.android.feather.sdk.panels.a.a);
            return;
        }
    }

    public void y()
    {
        super.y();
        c.d();
    }

    public void z()
    {
        super.z();
        a(new i[] {
            u, t
        });
        t.setOnItemsScrollListener(new com.aviary.android.feather.sdk.widget.AviaryGallery.a() {

            final j a;

            public void a(AviaryAdapterView aviaryadapterview, View view, int l, long l1)
            {
                if (com.aviary.android.feather.sdk.panels.j.c(a) == com.aviary.android.feather.sdk.panels.a.c)
                {
                    com.aviary.android.feather.sdk.panels.j.a(a, com.aviary.android.feather.sdk.panels.a.a);
                }
            }

            public void b(AviaryAdapterView aviaryadapterview, View view, int l, long l1)
            {
                a.q.a((new StringBuilder()).append("onScroll: ").append(l).toString());
                com.aviary.android.feather.sdk.panels.j.d(a);
            }

            public void c(AviaryAdapterView aviaryadapterview, View view, int l, long l1)
            {
                com.aviary.android.feather.sdk.panels.j.a(a, Math.max(4, a.x[l]));
                com.aviary.android.feather.sdk.panels.j.b(a).setStrokeWidth(com.aviary.android.feather.sdk.panels.j.a(a) * 2);
                if (a.u.getSelectedItemPosition() == 0)
                {
                    com.aviary.android.feather.sdk.panels.j.a(a, com.aviary.android.feather.sdk.panels.a.b);
                    return;
                } else
                {
                    com.aviary.android.feather.sdk.panels.j.a(a, com.aviary.android.feather.sdk.panels.a.a);
                    return;
                }
            }

            
            {
                a = j.this;
                super();
            }
        });
        u.setOnItemsScrollListener(new com.aviary.android.feather.sdk.widget.AviaryGallery.a() {

            final j a;

            public void a(AviaryAdapterView aviaryadapterview, View view, int l, long l1)
            {
                if (com.aviary.android.feather.sdk.panels.j.c(a) == com.aviary.android.feather.sdk.panels.a.c)
                {
                    com.aviary.android.feather.sdk.panels.j.a(a, com.aviary.android.feather.sdk.panels.a.a);
                }
            }

            public void b(AviaryAdapterView aviaryadapterview, View view, int l, long l1)
            {
                a.q.a((new StringBuilder()).append("onScroll: ").append(l).toString());
                com.aviary.android.feather.sdk.panels.j.d(a);
            }

            public void c(AviaryAdapterView aviaryadapterview, View view, int l, long l1)
            {
                com.aviary.android.feather.sdk.panels.j.b(a, a.y[l]);
                com.aviary.android.feather.sdk.panels.j.b(a).setColor(com.aviary.android.feather.sdk.panels.j.e(a));
                if (com.aviary.android.feather.sdk.panels.j.e(a) == 0)
                {
                    l = 1;
                } else
                {
                    l = 0;
                }
                if (com.aviary.android.feather.sdk.panels.j.c(a) != com.aviary.android.feather.sdk.panels.a.c) goto _L2; else goto _L1
_L1:
                if (l == 0) goto _L4; else goto _L3
_L3:
                com.aviary.android.feather.sdk.panels.j.a(a, com.aviary.android.feather.sdk.panels.a.b);
_L6:
                return;
_L4:
                com.aviary.android.feather.sdk.panels.j.a(a, com.aviary.android.feather.sdk.panels.a.a);
                return;
_L2:
                if (l != 0 && com.aviary.android.feather.sdk.panels.j.c(a) != com.aviary.android.feather.sdk.panels.a.b)
                {
                    com.aviary.android.feather.sdk.panels.j.a(a, com.aviary.android.feather.sdk.panels.a.b);
                    return;
                }
                if (l == 0 && com.aviary.android.feather.sdk.panels.j.c(a) != com.aviary.android.feather.sdk.panels.a.a)
                {
                    com.aviary.android.feather.sdk.panels.j.a(a, com.aviary.android.feather.sdk.panels.a.a);
                    return;
                }
                if (true) goto _L6; else goto _L5
_L5:
            }

            
            {
                a = j.this;
                super();
            }
        });
        s.setOnClickListener(this);
        a(com.aviary.android.feather.sdk.panels.a.a);
        ((ImageViewTouchAndDraw)c).setOnDrawStartListener(this);
        ((ImageViewTouchAndDraw)c).setOnDrawPathListener(this);
        b().setVisibility(0);
        d();
    }
}
