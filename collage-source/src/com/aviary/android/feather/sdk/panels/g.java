// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.panels;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.aviary.android.feather.common.b.b;
import com.aviary.android.feather.headless.filters.NativeToolFilter;
import com.aviary.android.feather.headless.moa.d;
import com.aviary.android.feather.library.d.a;
import com.aviary.android.feather.library.d.c;
import com.aviary.android.feather.library.services.ConfigService;
import com.aviary.android.feather.library.services.IAviaryController;
import com.aviary.android.feather.sdk.widget.AviaryHighlightImageButton;
import com.aviary.android.feather.sdk.widget.ImageViewSpotDraw;
import it.sephiroth.android.library.imagezoom.ImageViewTouch;
import java.util.Locale;

// Referenced classes of package com.aviary.android.feather.sdk.panels:
//            a, BackgroundDrawThread

public class g extends com.aviary.android.feather.sdk.panels.a
    implements android.view.View.OnClickListener, com.aviary.android.feather.sdk.widget.AviaryHighlightImageButton.a, com.aviary.android.feather.sdk.widget.ImageViewSpotDraw.a
{
    class a extends com.aviary.android.feather.common.utils.os.a
    {

        ProgressDialog a;
        final g b;

        protected transient d a(Void avoid[])
        {
            avoid = com.aviary.android.feather.headless.moa.c.a();
            if (com.aviary.android.feather.sdk.panels.g.a(b) != null)
            {
                while (com.aviary.android.feather.sdk.panels.g.a(b) != null && !com.aviary.android.feather.sdk.panels.g.a(b).d()) 
                {
                    b.q.a((new StringBuilder()).append("waiting.... ").append(com.aviary.android.feather.sdk.panels.g.a(b).e()).toString());
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
            avoid.a(com.aviary.android.feather.sdk.panels.g.b(b).a().a(0));
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
            com.aviary.android.feather.sdk.panels.g.a(b, b.f, d1);
        }

        protected volatile void a(Object obj)
        {
            a((d)obj);
        }

        protected Object doInBackground(Object aobj[])
        {
            return a((Void[])aobj);
        }

        a()
        {
            b = g.this;
            super();
            a = new ProgressDialog(b.B().a());
        }
    }


    static float s = 1.5F;
    private AviaryHighlightImageButton A;
    private View B;
    private com.aviary.android.feather.headless.filters.NativeToolFilter.a C;
    private final c D;
    Handler t;
    private AviaryHighlightImageButton u;
    private BackgroundDrawThread v;
    private NativeToolFilter w;
    private AviaryHighlightImageButton x;
    private AviaryHighlightImageButton y;
    private AviaryHighlightImageButton z;

    public g(IAviaryController iaviarycontroller, com.aviary.android.feather.library.a.a a1)
    {
        super(iaviarycontroller, a1);
        C = com.aviary.android.feather.headless.filters.NativeToolFilter.a.b;
        t = new Handler(new android.os.Handler.Callback() {

            final g a;

            public boolean handleMessage(Message message)
            {
                message.what;
                JVM INSTR lookupswitch 4: default 48
            //                           4: 50
            //                           5: 60
            //                           12: 70
            //                           1000: 103;
                   goto _L1 _L2 _L3 _L4 _L5
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
                continue; /* Loop/switch isn't completed */
_L5:
                if (a.n())
                {
                    a.c(true);
                }
                if (true) goto _L1; else goto _L6
_L6:
            }

            
            {
                a = g.this;
                super();
            }
        });
        D = new c(com.aviary.android.feather.headless.filters.NativeToolFilter.a.a.name());
    }

    static BackgroundDrawThread a(g g1)
    {
        return g1.v;
    }

    private void a(Bitmap bitmap, d d1)
    {
        e.a(d1);
        e.a(D);
        b(bitmap);
    }

    static void a(g g1, Bitmap bitmap, d d1)
    {
        g1.a(bitmap, d1);
    }

    private void a(com.aviary.android.feather.sdk.widget.ImageViewSpotDraw.b b1)
    {
        boolean flag1 = true;
        ((ImageViewSpotDraw)c).setDrawMode(b1);
        AviaryHighlightImageButton aviaryhighlightimagebutton = u;
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

    static NativeToolFilter b(g g1)
    {
        return g1.w;
    }

    public void A()
    {
        z.setOnCheckedChangeListener(this);
        x.setOnCheckedChangeListener(this);
        y.setOnCheckedChangeListener(this);
        u.setOnClickListener(null);
        ((ImageViewSpotDraw)c).setOnDrawStartListener(null);
        if (v != null)
        {
            v.f();
            if (v.isAlive())
            {
                v.b();
                for (; v.isAlive(); q.a("isAlive...")) { }
            }
        }
        j();
        super.A();
    }

    protected void F()
    {
        if (v.isAlive() && !v.d())
        {
            v.g();
            (new a()).execute(new Void[0]);
            return;
        } else
        {
            a(f, w.a());
            return;
        }
    }

    protected NativeToolFilter G()
    {
        return (NativeToolFilter)com.aviary.android.feather.library.filters.a.d(com.aviary.android.feather.library.filters.a.a.r);
    }

    public void a()
    {
        v.c();
    }

    public void a(Bitmap bitmap, Bundle bundle)
    {
        super.a(bitmap, bundle);
        int i = ((ConfigService)B().a(com/aviary/android/feather/library/services/ConfigService)).g(com.aviary.android.feather.sdk.R.dimen.aviary_color_splash_brush_size);
        u = (AviaryHighlightImageButton)b().findViewById(com.aviary.android.feather.sdk.R.id.aviary_lens_button);
        z = (AviaryHighlightImageButton)f().findViewById(com.aviary.android.feather.sdk.R.id.aviary_button1);
        x = (AviaryHighlightImageButton)f().findViewById(com.aviary.android.feather.sdk.R.id.aviary_button2);
        y = (AviaryHighlightImageButton)f().findViewById(com.aviary.android.feather.sdk.R.id.aviary_button3);
        c = (ImageViewSpotDraw)b().findViewById(com.aviary.android.feather.sdk.R.id.image);
        ((ImageViewSpotDraw)c).setBrushSize((int)((float)i * s));
        ((ImageViewSpotDraw)c).setDrawLimit(0.0D);
        ((ImageViewSpotDraw)c).setPaintEnabled(false);
        ((ImageViewSpotDraw)c).setDisplayType(it.sephiroth.android.library.imagezoom.ImageViewTouchBase.a.c);
        B = f().findViewById(com.aviary.android.feather.sdk.R.id.aviary_disable_status);
        w = G();
        v = new BackgroundDrawThread("draw-thread", 5, w, t, s);
    }

    public void a(AviaryHighlightImageButton aviaryhighlightimagebutton, boolean flag, boolean flag1)
    {
        if (A != null && !aviaryhighlightimagebutton.equals(A))
        {
            A.setChecked(false);
        }
        A = aviaryhighlightimagebutton;
        if (!flag1 || !flag) goto _L2; else goto _L1
_L1:
        int i = aviaryhighlightimagebutton.getId();
        if (i != z.getId()) goto _L4; else goto _L3
_L3:
        C = com.aviary.android.feather.headless.filters.NativeToolFilter.a.b;
        B().h().a((new StringBuilder()).append(com.aviary.android.feather.library.filters.a.a.r.name().toLowerCase(Locale.US)).append(": free_color_selected").toString());
_L6:
        if (((ImageViewSpotDraw)c).getDrawMode() != com.aviary.android.feather.sdk.widget.ImageViewSpotDraw.b.b)
        {
            a(com.aviary.android.feather.sdk.widget.ImageViewSpotDraw.b.b);
        }
_L2:
        return;
_L4:
        if (i == x.getId())
        {
            C = com.aviary.android.feather.headless.filters.NativeToolFilter.a.d;
            B().h().a((new StringBuilder()).append(com.aviary.android.feather.library.filters.a.a.r.name().toLowerCase(Locale.US)).append(": smart_color_selected").toString());
        } else
        if (i == y.getId())
        {
            C = com.aviary.android.feather.headless.filters.NativeToolFilter.a.c;
            B().h().a((new StringBuilder()).append(com.aviary.android.feather.library.filters.a.a.r.name().toLowerCase(Locale.US)).append(": eraser_selected").toString());
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public volatile void a(boolean flag)
    {
        super.a(flag);
    }

    public void a(float af[], float f)
    {
        f = Math.max(1.0F, f);
        v.a(f / s, af, C);
        D.a(C.name());
        c(true);
    }

    protected View b(LayoutInflater layoutinflater)
    {
        return layoutinflater.inflate(com.aviary.android.feather.sdk.R.layout.aviary_content_spot_draw, null);
    }

    protected ViewGroup b(LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
        return (ViewGroup)layoutinflater.inflate(com.aviary.android.feather.sdk.R.layout.aviary_panel_colorsplash, viewgroup, false);
    }

    public void b(float af[], float f)
    {
        v.a(af);
    }

    protected void c()
    {
        v = null;
        a = null;
        t = null;
        w.e();
        super.c();
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
            view = B;
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
        if (view.getId() == u.getId())
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
    }

    public void z()
    {
        super.z();
        z.setOnCheckedChangeListener(this);
        if (z.a())
        {
            A = z;
        }
        x.setOnCheckedChangeListener(this);
        if (x.a())
        {
            A = x;
        }
        y.setOnCheckedChangeListener(this);
        if (y.a())
        {
            A = y;
        }
        f = com.aviary.android.feather.library.c.b.a(g, android.graphics.Bitmap.Config.ARGB_8888);
        ((ImageViewSpotDraw)c).setOnDrawStartListener(this);
        c.setDisplayType(it.sephiroth.android.library.imagezoom.ImageViewTouchBase.a.c);
        c.a(f, null, -1F, 8F);
        v.a(g, f);
        u.setOnClickListener(this);
        b().setVisibility(0);
        d();
    }

}
