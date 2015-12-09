// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.panels;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.Toast;
import com.aviary.android.feather.headless.filters.NativeToolFilter;
import com.aviary.android.feather.headless.moa.d;
import com.aviary.android.feather.library.c.b;
import com.aviary.android.feather.library.d.a;
import com.aviary.android.feather.library.d.c;
import com.aviary.android.feather.library.services.ConfigService;
import com.aviary.android.feather.library.services.IAviaryController;
import com.aviary.android.feather.sdk.a.f;
import com.aviary.android.feather.sdk.overlays.AviaryOverlay;
import com.aviary.android.feather.sdk.utils.e;
import com.aviary.android.feather.sdk.widget.AviaryAdapterView;
import com.aviary.android.feather.sdk.widget.AviaryGallery;
import com.aviary.android.feather.sdk.widget.AviaryHighlightImageButton;
import com.aviary.android.feather.sdk.widget.ImageViewSpotDraw;
import it.sephiroth.android.library.imagezoom.ImageViewTouch;

// Referenced classes of package com.aviary.android.feather.sdk.panels:
//            a, BackgroundDrawThread

public class i extends com.aviary.android.feather.sdk.panels.a
    implements android.view.View.OnClickListener, com.aviary.android.feather.sdk.widget.AviaryGallery.a, com.aviary.android.feather.sdk.widget.ImageViewSpotDraw.a
{
    class a extends BaseAdapter
    {

        LayoutInflater a;
        Resources b;
        final i c;
        private final int d = 0;
        private final int e = 1;
        private int f[];

        public int getCount()
        {
            return f.length;
        }

        public Object getItem(int j)
        {
            return Integer.valueOf(f[j]);
        }

        public long getItemId(int j)
        {
            return 0L;
        }

        public int getItemViewType(int j)
        {
            if (j >= 0 && j < getCount())
            {
                j = 1;
            } else
            {
                j = 0;
            }
            return j == 0 ? 1 : 0;
        }

        public View getView(int j, View view, ViewGroup viewgroup)
        {
            int k = getItemViewType(j);
            viewgroup = null;
            View view1;
            boolean flag;
            if (view == null)
            {
                view = a.inflate(com.aviary.android.feather.sdk.R.layout.aviary_gallery_item_view, c.w, false);
                view1 = view;
                if (k == 0)
                {
                    viewgroup = new f(c.B().a());
                    ((ImageView)view.findViewById(com.aviary.android.feather.sdk.R.id.image)).setImageDrawable(viewgroup);
                    view.setTag(viewgroup);
                    view1 = view;
                }
            } else
            {
                view1 = view;
                if (k == 0)
                {
                    viewgroup = (f)view.getTag();
                    view1 = view;
                }
            }
            if (viewgroup != null && k == 0)
            {
                k = f[j];
                float f1 = c.D;
                f1 = (((float)k - (float)com.aviary.android.feather.sdk.panels.i.a(c)) / (float)(com.aviary.android.feather.sdk.panels.i.b(c) - com.aviary.android.feather.sdk.panels.i.a(c))) * (c.E - c.D) * 0.55F + f1;
                viewgroup.a(f1);
                view1.setContentDescription((new StringBuilder()).append(c.A).append(" ").append(Float.toString(f1)).toString());
            }
            if (c.y == j)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            view1.setSelected(flag);
            view1.setId(j);
            return view1;
        }

        public int getViewTypeCount()
        {
            return 2;
        }

        public a(Context context, int ai[])
        {
            c = i.this;
            super();
            a = LayoutInflater.from(context);
            f = ai;
            b = context.getResources();
        }
    }

    class b extends com.aviary.android.feather.common.utils.os.a
    {

        ProgressDialog a;
        final i b;

        protected transient d a(Void avoid[])
        {
            avoid = com.aviary.android.feather.headless.moa.c.a();
            if (com.aviary.android.feather.sdk.panels.i.c(b) != null)
            {
                while (com.aviary.android.feather.sdk.panels.i.c(b) != null && !com.aviary.android.feather.sdk.panels.i.c(b).d()) 
                {
                    b.q.a((new StringBuilder()).append("waiting.... ").append(com.aviary.android.feather.sdk.panels.i.c(b).e()).toString());
                    try
                    {
                        Thread.sleep(50L);
                    }
                    catch (InterruptedException interruptedexception)
                    {
                        interruptedexception.printStackTrace();
                    }
                }
            }
            avoid.a(com.aviary.android.feather.sdk.panels.i.d(b).a().a(0));
            return avoid;
        }

        protected void a()
        {
            a.setTitle(b.B().a().getString(com.aviary.android.feather.sdk.R.string.feather_loading_title));
            a.setMessage(b.B().a().getString(com.aviary.android.feather.sdk.R.string.feather_effect_loading_message));
            a.setIndeterminate(true);
            a.setCancelable(false);
            a.show();
        }

        protected void a(d d1)
        {
            if (b.B().b().isFinishing())
            {
                return;
            }
            if (a.isShowing())
            {
                try
                {
                    a.dismiss();
                }
                catch (IllegalArgumentException illegalargumentexception) { }
            }
            b.e.a(d1);
            b.e.a(com.aviary.android.feather.sdk.panels.i.e(b));
            b.b(b.f);
        }

        protected volatile void a(Object obj)
        {
            a((d)obj);
        }

        protected Object doInBackground(Object aobj[])
        {
            return a((Void[])aobj);
        }

        b()
        {
            b = i.this;
            super();
            a = new ProgressDialog(b.B().a());
        }
    }


    static float s = 1.5F;
    String A;
    protected Toast B;
    protected f C;
    float D;
    float E;
    private com.aviary.android.feather.headless.filters.NativeToolFilter.a F;
    private BackgroundDrawThread G;
    private NativeToolFilter H;
    private final c I = new c();
    private View J;
    private int K;
    private int L;
    private int M;
    Handler t;
    protected int u;
    protected com.aviary.android.feather.library.filters.a.a v;
    protected AviaryGallery w;
    protected int x[];
    protected int y;
    protected AviaryHighlightImageButton z;

    public i(IAviaryController iaviarycontroller, com.aviary.android.feather.library.a.a a1, com.aviary.android.feather.library.filters.a.a a2)
    {
        super(iaviarycontroller, a1);
        F = com.aviary.android.feather.headless.filters.NativeToolFilter.a.b;
        t = new Handler(new android.os.Handler.Callback() {

            final i a;

            public boolean handleMessage(Message message)
            {
                message.what;
                JVM INSTR lookupswitch 3: default 40
            //                           4: 42
            //                           5: 52
            //                           12: 62;
                   goto _L1 _L2 _L3 _L4
_L1:
                return false;
_L2:
                a.i();
                continue; /* Loop/switch isn't completed */
_L3:
                a.j();
                continue; /* Loop/switch isn't completed */
_L4:
                if (a.n() && a.c != null)
                {
                    a.c.postInvalidate();
                }
                if (true) goto _L1; else goto _L5
_L5:
            }

            
            {
                a = i.this;
                super();
            }
        });
        y = -1;
        v = a2;
    }

    private Toast G()
    {
        C = new f(B().a());
        Toast toast = com.aviary.android.feather.sdk.utils.e.a(B().a());
        ((ImageView)toast.getView().findViewById(com.aviary.android.feather.sdk.R.id.image)).setImageDrawable(C);
        return toast;
    }

    static int a(i j)
    {
        return j.L;
    }

    private void a(int j)
    {
        if (!n())
        {
            return;
        } else
        {
            b(j);
            return;
        }
    }

    private void a(com.aviary.android.feather.sdk.widget.ImageViewSpotDraw.b b1)
    {
        boolean flag1 = true;
        ((ImageViewSpotDraw)c).setDrawMode(b1);
        AviaryHighlightImageButton aviaryhighlightimagebutton = z;
        boolean flag;
        if (b1 == com.aviary.android.feather.sdk.widget.ImageViewSpotDraw.b.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        aviaryhighlightimagebutton.setSelected(flag);
        if (b1 != com.aviary.android.feather.sdk.widget.ImageViewSpotDraw.b.a)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        d(flag);
    }

    static int b(i j)
    {
        return j.M;
    }

    private void b(int j)
    {
        while (!n() || B == null) 
        {
            return;
        }
        C.b(j);
        B.show();
    }

    static BackgroundDrawThread c(i j)
    {
        return j.G;
    }

    static NativeToolFilter d(i j)
    {
        return j.H;
    }

    static c e(i j)
    {
        return j.I;
    }

    public void A()
    {
        z.setOnClickListener(null);
        w.setOnItemsScrollListener(null);
        ((ImageViewSpotDraw)c).setOnDrawStartListener(null);
        if (G != null)
        {
            G.f();
            if (G.isAlive())
            {
                G.b();
                while (G.isAlive()) ;
            }
        }
        j();
        super.A();
    }

    protected void F()
    {
        if (G.isAlive() && !G.d())
        {
            G.g();
            (new b()).execute(new Void[0]);
            return;
        } else
        {
            e.a(H.a());
            e.a(I);
            b(f);
            return;
        }
    }

    protected NativeToolFilter a(com.aviary.android.feather.library.filters.a.a a1)
    {
        return (NativeToolFilter)com.aviary.android.feather.library.filters.a.d(a1);
    }

    public void a()
    {
        G.c();
    }

    public void a(Bitmap bitmap, Bundle bundle)
    {
        super.a(bitmap, bundle);
        bitmap = (ConfigService)B().a(com/aviary/android/feather/library/services/ConfigService);
        K = bitmap.a(com.aviary.android.feather.sdk.R.integer.aviary_spot_brush_index);
        x = bitmap.c(com.aviary.android.feather.sdk.R.array.aviary_spot_brush_sizes);
        u = x[K];
        L = x[0];
        M = x[x.length - 1];
        D = (float)bitmap.a(com.aviary.android.feather.sdk.R.integer.aviary_spot_gallery_item_min_size) / 100F;
        E = (float)bitmap.a(com.aviary.android.feather.sdk.R.integer.aviary_spot_gallery_item_max_size) / 100F;
        z = (AviaryHighlightImageButton)b().findViewById(com.aviary.android.feather.sdk.R.id.aviary_lens_button);
        A = bitmap.f(com.aviary.android.feather.sdk.R.string.feather_acc_size);
        w = (AviaryGallery)f().findViewById(com.aviary.android.feather.sdk.R.id.aviary_gallery);
        w.setDefaultPosition(K);
        w.setAutoSelectChild(true);
        w.setCallbackDuringFling(false);
        w.setAdapter(new a(B().a(), x));
        y = K;
        c = (ImageViewSpotDraw)b().findViewById(com.aviary.android.feather.sdk.R.id.image);
        ((ImageViewSpotDraw)c).setBrushSize((float)u * s);
        ((ImageViewSpotDraw)c).setDrawLimit(0.0D);
        ((ImageViewSpotDraw)c).setPaintEnabled(false);
        ((ImageViewSpotDraw)c).setDisplayType(it.sephiroth.android.library.imagezoom.ImageViewTouchBase.a.c);
        J = f().findViewById(com.aviary.android.feather.sdk.R.id.aviary_disable_status);
        H = a(v);
        G = new BackgroundDrawThread("draw-thread", 5, H, t, s);
    }

    protected void a(Bitmap bitmap, com.aviary.android.feather.library.d.a a1)
    {
        a1.a(I);
        a1.a(H.a());
        super.a(bitmap, a1);
    }

    public void a(AviaryAdapterView aviaryadapterview, View view, int j, long l)
    {
        a(x[j]);
        a(com.aviary.android.feather.sdk.widget.ImageViewSpotDraw.b.b);
    }

    public volatile void a(boolean flag)
    {
        super.a(flag);
    }

    public void a(float af[], float f1)
    {
        f1 = Math.max(1.0F, f1);
        G.a(f1 / 2.0F, af, F);
        I.a(Float.valueOf(f1));
        c(true);
    }

    protected View b(LayoutInflater layoutinflater)
    {
        return layoutinflater.inflate(com.aviary.android.feather.sdk.R.layout.aviary_content_spot_draw, null);
    }

    protected ViewGroup b(LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
        return (ViewGroup)layoutinflater.inflate(com.aviary.android.feather.sdk.R.layout.aviary_panel_spot, viewgroup, false);
    }

    public void b(AviaryAdapterView aviaryadapterview, View view, int j, long l)
    {
        b(x[j]);
    }

    public void b(float af[], float f1)
    {
        G.a(af);
    }

    protected void c()
    {
        G = null;
        t = null;
        a = null;
        H.e();
        super.c();
    }

    public void c(AviaryAdapterView aviaryadapterview, View view, int j, long l)
    {
        u = x[j];
        ((ImageViewSpotDraw)c).setBrushSize((float)u * s);
        a(com.aviary.android.feather.sdk.widget.ImageViewSpotDraw.b.b);
    }

    public void d(boolean flag)
    {
        if (d != null && flag != d.isEnabled())
        {
            d.setEnabled(flag);
            View view;
            byte byte0;
            if (flag)
            {
                B().f();
            } else
            {
                B().a(com.aviary.android.feather.sdk.R.string.feather_zoom_mode);
            }
            view = J;
            if (flag)
            {
                byte0 = 4;
            } else
            {
                byte0 = 0;
            }
            view.setVisibility(byte0);
        }
    }

    public volatile boolean e()
    {
        return super.e();
    }

    public void onClick(View view)
    {
        if (view.getId() == z.getId())
        {
            if (((ImageViewSpotDraw)c).getDrawMode() == com.aviary.android.feather.sdk.widget.ImageViewSpotDraw.b.b)
            {
                view = com.aviary.android.feather.sdk.widget.ImageViewSpotDraw.b.a;
            } else
            {
                view = com.aviary.android.feather.sdk.widget.ImageViewSpotDraw.b.b;
            }
            a(view);
        }
    }

    public void y()
    {
        c.d();
        super.y();
        if (B != null)
        {
            B.cancel();
        }
    }

    public void z()
    {
        super.z();
        B = G();
        a(new com.aviary.android.feather.sdk.widget.i[] {
            w
        });
        f = com.aviary.android.feather.library.c.b.a(g, android.graphics.Bitmap.Config.ARGB_8888);
        z.setOnClickListener(this);
        w.setOnItemsScrollListener(this);
        ((ImageViewSpotDraw)c).setOnDrawStartListener(this);
        c.setDisplayType(it.sephiroth.android.library.imagezoom.ImageViewTouchBase.a.c);
        c.a(f, null, -1F, 8F);
        G.a(g, f);
        b().setVisibility(0);
        d();
        if (v == com.aviary.android.feather.library.filters.a.a.t && AviaryOverlay.b(B(), 4))
        {
            AviaryOverlay.a(B(), 4);
        }
    }

}
