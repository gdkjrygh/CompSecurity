// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.panels;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.aviary.android.feather.common.b.b;
import com.aviary.android.feather.headless.filters.NativeToolFilter;
import com.aviary.android.feather.headless.moa.c;
import com.aviary.android.feather.headless.moa.d;
import com.aviary.android.feather.library.filters.a;
import com.aviary.android.feather.library.services.IAviaryController;
import com.aviary.android.feather.sdk.widget.AviaryHighlightImageButton;
import com.aviary.android.feather.sdk.widget.ImageViewTiltiShiftTouch;
import it.sephiroth.android.library.imagezoom.ImageViewTouch;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

// Referenced classes of package com.aviary.android.feather.sdk.panels:
//            a

public class TiltShiftPanel extends com.aviary.android.feather.sdk.panels.a
    implements com.aviary.android.feather.sdk.widget.AviaryHighlightImageButton.a, com.aviary.android.feather.sdk.widget.ImageViewTiltiShiftTouch.a, it.sephiroth.android.library.imagezoom.ImageViewTouchBase.b
{
    class BackgroundDrawThread extends Thread
    {

        boolean a;
        volatile boolean b;
        final Queue c = new LinkedBlockingQueue();
        a d;
        final TiltShiftPanel e;

        void a()
        {
        }

        public void a(float af[], float f1, float f2, float f3, float f4, float f5, float f6)
        {
            this;
            JVM INSTR monitorenter ;
            if (!b) goto _L2; else goto _L1
_L1:
            a a1 = d;
            if (a1 != null) goto _L3; else goto _L2
_L2:
            this;
            JVM INSTR monitorexit ;
            return;
_L3:
            d.clear();
            d.add(new float[] {
                af[0], af[1], f1, f2, f3, f4, f5, f6
            });
            if (true) goto _L2; else goto _L4
_L4:
            af;
            throw af;
        }

        public void a(float af[], com.aviary.android.feather.sdk.widget.ImageViewTiltiShiftTouch.b b1, float f1, float f2, float f3, float f4, float f5, 
                float f6)
        {
            this;
            JVM INSTR monitorenter ;
            boolean flag = b;
            if (flag) goto _L2; else goto _L1
_L1:
            this;
            JVM INSTR monitorexit ;
            return;
_L2:
            Object obj;
            if (d != null)
            {
                d.a();
                d = null;
            }
            if (b1 != com.aviary.android.feather.sdk.widget.ImageViewTiltiShiftTouch.b.a)
            {
                break MISSING_BLOCK_LABEL_162;
            }
            obj = com.aviary.android.feather.headless.filters.NativeToolFilter.c.a;
_L3:
            com.aviary.android.feather.library.d.c c1;
            obj = new a(((com.aviary.android.feather.headless.filters.NativeToolFilter.c) (obj)));
            ((a) (obj)).add(new float[] {
                af[0], af[1], f1, f2, f3, f4, f5, f6
            });
            c1 = e.v;
            if (b1 == com.aviary.android.feather.sdk.widget.ImageViewTiltiShiftTouch.b.a)
            {
                af = "circle";
            } else
            {
                af = "rectangle";
            }
            c1.a(af);
            c.add(obj);
            d = ((a) (obj));
              goto _L1
            af;
            throw af;
            obj = com.aviary.android.feather.headless.filters.NativeToolFilter.c.b;
              goto _L3
        }

        public void b()
        {
            this;
            JVM INSTR monitorenter ;
            a = true;
            b = false;
            interrupt();
            this;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            throw exception;
        }

        public void c()
        {
            this;
            JVM INSTR monitorenter ;
            if (!b) goto _L2; else goto _L1
_L1:
            a a1 = d;
            if (a1 != null) goto _L3; else goto _L2
_L2:
            this;
            JVM INSTR monitorexit ;
            return;
_L3:
            d.a();
            d = null;
            if (true) goto _L2; else goto _L4
_L4:
            Exception exception;
            exception;
            throw exception;
        }

        public boolean d()
        {
            return c.size() == 0;
        }

        public int e()
        {
            return c.size();
        }

        public void f()
        {
            if (!b || c == null) goto _L2; else goto _L1
_L1:
            Queue queue = c;
            queue;
            JVM INSTR monitorenter ;
_L3:
            a a1;
            do
            {
                if (c.size() <= 0)
                {
                    break MISSING_BLOCK_LABEL_76;
                }
                a1 = (a)c.poll();
            } while (a1 == null);
            e.q.a("end element...");
            a1.a();
              goto _L3
            Exception exception;
            exception;
            queue;
            JVM INSTR monitorexit ;
            throw exception;
            queue;
            JVM INSTR monitorexit ;
_L2:
        }

        public void g()
        {
            if (!b || c == null) goto _L2; else goto _L1
_L1:
            Queue queue = c;
            queue;
            JVM INSTR monitorenter ;
            Iterator iterator = c.iterator();
_L4:
            a a1;
            do
            {
                if (!iterator.hasNext())
                {
                    break MISSING_BLOCK_LABEL_80;
                }
                a1 = (a)iterator.next();
            } while (a1 == null);
            e.q.a("end element...");
            a1.a();
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            queue;
            JVM INSTR monitorexit ;
            throw exception;
            queue;
            JVM INSTR monitorexit ;
_L2:
        }

        public void run()
        {
            while (!a) ;
            boolean flag = false;
            e.q.a("thread.start!");
            e.q.a("filter.init");
            com.aviary.android.feather.sdk.panels.TiltShiftPanel.c(e).a(e.g, e.f);
            RectF rectf = new RectF(0.0F, 0.0F, e.f.getWidth(), e.f.getHeight());
            RectF rectf1 = new RectF();
label0:
            do
            {
                if (!b)
                {
                    break;
                }
                if (c.size() > 0 && !isInterrupted())
                {
                    e.q.a((new StringBuilder()).append("queue.size: ").append(c.size()).toString());
                    if (!flag)
                    {
                        flag = true;
                        e.i();
                    }
                    a a1 = (a)c.element();
                    if (a1 == null)
                    {
                        c.poll();
                        continue;
                    }
                    com.aviary.android.feather.headless.filters.NativeToolFilter.c c1 = com.aviary.android.feather.sdk.panels.a.a(a1);
                    com.aviary.android.feather.sdk.panels.TiltShiftPanel.c(e).a(c1);
                    do
                    {
                        if (a1.size() <= 0 && a1.b() || !b || isInterrupted())
                        {
                            c.poll();
                            continue label0;
                        }
                        float af[] = (float[])a1.poll();
                        if (af != null)
                        {
                            float f1 = af[0];
                            float f2 = af[1];
                            float f3 = af[2];
                            float f4 = af[3];
                            float f5 = af[4];
                            float f6 = af[5];
                            float f7 = af[6];
                            float f8 = af[7];
                            com.aviary.android.feather.sdk.panels.TiltShiftPanel.c(e).a(f3, f4, 0, false, new float[] {
                                f1, f2
                            });
                            rectf1.set(f5, f6, f7, f8);
                            rectf.union(rectf1);
                            com.aviary.android.feather.sdk.panels.TiltShiftPanel.c(e).a(rectf);
                            rectf.set(rectf1);
                            com.aviary.android.feather.sdk.panels.TiltShiftPanel.d(e);
                        }
                    } while (true);
                }
                if (flag)
                {
                    e.j();
                    flag = false;
                }
            } while (true);
            e.j();
            e.q.a("thread.end");
        }

        public void start()
        {
            this;
            JVM INSTR monitorenter ;
            a = true;
            b = true;
            super.start();
            this;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            throw exception;
        }

        public BackgroundDrawThread(String s1, int i)
        {
            e = TiltShiftPanel.this;
            super(s1);
            setPriority(i);
            a();
        }
    }

    static class a extends LinkedBlockingQueue
    {

        private com.aviary.android.feather.headless.filters.NativeToolFilter.c a;
        private volatile boolean b;

        static com.aviary.android.feather.headless.filters.NativeToolFilter.c a(a a1)
        {
            return a1.a;
        }

        public void a()
        {
            b = true;
        }

        public boolean b()
        {
            return b;
        }

        public a(com.aviary.android.feather.headless.filters.NativeToolFilter.c c1)
        {
            a = c1;
            b = false;
        }
    }

    class b extends com.aviary.android.feather.common.utils.os.a
    {

        ProgressDialog a;
        final TiltShiftPanel b;

        protected transient Void a(Void avoid[])
        {
            if (TiltShiftPanel.e(b) != null)
            {
                while (TiltShiftPanel.e(b) != null && !TiltShiftPanel.e(b).d()) 
                {
                    b.q.a((new StringBuilder()).append("waiting.... ").append(TiltShiftPanel.e(b).e()).toString());
                    try
                    {
                        Thread.sleep(50L);
                    }
                    // Misplaced declaration of an exception variable
                    catch (Void avoid[])
                    {
                        avoid.printStackTrace();
                    }
                }
            }
            b.t.a(com.aviary.android.feather.sdk.panels.TiltShiftPanel.c(b).a().a(0));
            return null;
        }

        protected void a()
        {
            a.setTitle(b.B().a().getString(com.aviary.android.feather.sdk.R.string.feather_loading_title));
            a.setMessage(b.B().a().getString(com.aviary.android.feather.sdk.R.string.feather_effect_loading_message));
            a.setIndeterminate(true);
            a.setCancelable(false);
            a.show();
        }

        protected volatile void a(Object obj)
        {
            a((Void)obj);
        }

        protected void a(Void void1)
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
                // Misplaced declaration of an exception variable
                catch (Void void1) { }
            }
            b.a(b.f, b.t);
        }

        protected Object doInBackground(Object aobj[])
        {
            return a((Void[])aobj);
        }

        b()
        {
            b = TiltShiftPanel.this;
            super();
            a = new ProgressDialog(b.B().a());
        }
    }


    static float s = 2.0F;
    private Paint A;
    private Canvas B;
    d t;
    com.aviary.android.feather.headless.filters.NativeToolFilter.c u;
    final com.aviary.android.feather.library.d.c v = new com.aviary.android.feather.library.d.c();
    private BackgroundDrawThread w;
    private NativeToolFilter x;
    private AviaryHighlightImageButton y;
    private AviaryHighlightImageButton z;

    public TiltShiftPanel(IAviaryController iaviarycontroller, com.aviary.android.feather.library.a.a a1)
    {
        super(iaviarycontroller, a1);
        t = com.aviary.android.feather.headless.moa.c.a();
    }

    private void H()
    {
        if (n() && f != null && !f.isRecycled() && B != null && A != null)
        {
            q.b("postInvalidate");
            A.setColor(f.getPixel(0, 0));
            B.drawPoint(0.0F, 0.0F, A);
            c.postInvalidate();
        }
    }

    static AviaryHighlightImageButton a(TiltShiftPanel tiltshiftpanel)
    {
        return tiltshiftpanel.y;
    }

    static AviaryHighlightImageButton b(TiltShiftPanel tiltshiftpanel)
    {
        return tiltshiftpanel.z;
    }

    static NativeToolFilter c(TiltShiftPanel tiltshiftpanel)
    {
        return tiltshiftpanel.x;
    }

    static void d(TiltShiftPanel tiltshiftpanel)
    {
        tiltshiftpanel.H();
    }

    static BackgroundDrawThread e(TiltShiftPanel tiltshiftpanel)
    {
        return tiltshiftpanel.w;
    }

    public void A()
    {
        c.setOnDrawableChangedListener(null);
        y.setOnCheckedChangeListener(this);
        z.setOnCheckedChangeListener(this);
        ((ImageViewTiltiShiftTouch)c).setOnDrawStartListener(null);
        if (w != null)
        {
            w.f();
            if (w.isAlive())
            {
                w.b();
                for (; w.isAlive(); q.a("isAlive...")) { }
            }
        }
        j();
        super.A();
    }

    protected void F()
    {
        if (w.isAlive() && !w.d())
        {
            w.g();
            (new b()).execute(new Void[0]);
            return;
        } else
        {
            a(f, x.a());
            return;
        }
    }

    protected NativeToolFilter G()
    {
        return (NativeToolFilter)com.aviary.android.feather.library.filters.a.d(com.aviary.android.feather.library.filters.a.a.s);
    }

    public void a()
    {
        w.c();
    }

    public void a(Bitmap bitmap, Bundle bundle)
    {
        super.a(bitmap, bundle);
        z = (AviaryHighlightImageButton)f().findViewById(com.aviary.android.feather.sdk.R.id.aviary_button_rectangle);
        y = (AviaryHighlightImageButton)f().findViewById(com.aviary.android.feather.sdk.R.id.aviary_button_circle);
        c = (ImageViewTiltiShiftTouch)b().findViewById(com.aviary.android.feather.sdk.R.id.aviary_image);
        bitmap = (ImageViewTiltiShiftTouch)c;
        bitmap.setOnDrawableChangedListener(this);
        bitmap.setDisplayType(it.sephiroth.android.library.imagezoom.ImageViewTouchBase.a.c);
        y.setOnCheckedChangeListener(this);
        z.setOnCheckedChangeListener(this);
        w = new BackgroundDrawThread("filter-thread", 5);
        x = G();
    }

    protected void a(Bitmap bitmap, d d1)
    {
        if (u == com.aviary.android.feather.headless.filters.NativeToolFilter.c.a)
        {
            l.put("style", "circle");
        } else
        {
            l.put("style", "rectangle");
        }
        e.a(d1);
        e.a(v);
        super.b(bitmap);
    }

    public void a(Drawable drawable)
    {
        q.b((new StringBuilder()).append("onDrawableChanged: ").append(drawable).toString());
        if (!y.a()) goto _L2; else goto _L1
_L1:
        u = com.aviary.android.feather.headless.filters.NativeToolFilter.c.a;
_L4:
        g().postDelayed(new Runnable() {

            final TiltShiftPanel a;

            public void run()
            {
                ImageViewTiltiShiftTouch imageviewtiltishifttouch = (ImageViewTiltiShiftTouch)a.c;
                if (a.u == com.aviary.android.feather.headless.filters.NativeToolFilter.c.a)
                {
                    com.aviary.android.feather.sdk.panels.TiltShiftPanel.a(a).setChecked(true);
                    imageviewtiltishifttouch.setTiltShiftDrawMode(com.aviary.android.feather.sdk.widget.ImageViewTiltiShiftTouch.b.a);
                    return;
                } else
                {
                    com.aviary.android.feather.sdk.panels.TiltShiftPanel.b(a).setChecked(true);
                    imageviewtiltishifttouch.setTiltShiftDrawMode(com.aviary.android.feather.sdk.widget.ImageViewTiltiShiftTouch.b.b);
                    return;
                }
            }

            
            {
                a = TiltShiftPanel.this;
                super();
            }
        }, 500L);
        return;
_L2:
        if (z.a())
        {
            u = com.aviary.android.feather.headless.filters.NativeToolFilter.c.b;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void a(AviaryHighlightImageButton aviaryhighlightimagebutton, boolean flag, boolean flag1)
    {
        int i;
        q.b((new StringBuilder()).append("onCheckedChanged: ").append(flag).append(", fromUser: ").append(flag1).toString());
        i = aviaryhighlightimagebutton.getId();
        if (!flag)
        {
            return;
        }
        if (i != z.getId()) goto _L2; else goto _L1
_L1:
        q.a("rect");
        u = com.aviary.android.feather.headless.filters.NativeToolFilter.c.b;
        y.setChecked(false);
_L4:
        if (!flag1)
        {
            q.a("return");
            return;
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (i == y.getId())
        {
            q.a("circle");
            u = com.aviary.android.feather.headless.filters.NativeToolFilter.c.a;
            z.setChecked(false);
        }
        if (true) goto _L4; else goto _L3
_L3:
        aviaryhighlightimagebutton = new HashMap();
        if (u != com.aviary.android.feather.headless.filters.NativeToolFilter.c.a) goto _L6; else goto _L5
_L5:
        ((ImageViewTiltiShiftTouch)c).setTiltShiftDrawMode(com.aviary.android.feather.sdk.widget.ImageViewTiltiShiftTouch.b.a);
        aviaryhighlightimagebutton.put("style", "circle");
_L8:
        B().h().a((new StringBuilder()).append(com.aviary.android.feather.library.filters.a.a.s.name().toLowerCase(Locale.US)).append(": style_selected").toString(), aviaryhighlightimagebutton);
        return;
_L6:
        if (u == com.aviary.android.feather.headless.filters.NativeToolFilter.c.b)
        {
            ((ImageViewTiltiShiftTouch)c).setTiltShiftDrawMode(com.aviary.android.feather.sdk.widget.ImageViewTiltiShiftTouch.b.b);
            aviaryhighlightimagebutton.put("style", "rectangle");
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    public volatile void a(boolean flag)
    {
        super.a(flag);
    }

    public void a(float af[], float f, float f1, float f2, float f3, float f4, float f5)
    {
        w.a(af, f, f1, f2, f3, f4, f5);
    }

    public void a(float af[], com.aviary.android.feather.sdk.widget.ImageViewTiltiShiftTouch.b b1, float f, float f1, float f2, float f3, float f4, 
            float f5)
    {
        w.a(af, b1, f, f1, f2, f3, f4, f5);
        c(true);
    }

    protected View b(LayoutInflater layoutinflater)
    {
        return layoutinflater.inflate(com.aviary.android.feather.sdk.R.layout.aviary_content_focus, null);
    }

    protected ViewGroup b(LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
        return (ViewGroup)layoutinflater.inflate(com.aviary.android.feather.sdk.R.layout.aviary_panel_focus, viewgroup, false);
    }

    protected void c()
    {
        a = null;
        B = null;
        A = null;
        x.e();
        super.c();
    }

    public volatile boolean e()
    {
        return super.e();
    }

    public void w()
    {
        super.w();
    }

    public void y()
    {
        super.y();
        w = null;
        c.d();
    }

    public void z()
    {
        super.z();
        f = com.aviary.android.feather.library.c.b.a(g, android.graphics.Bitmap.Config.ARGB_8888);
        B = new Canvas(f);
        A = new Paint();
        w.start();
        ((ImageViewTiltiShiftTouch)c).setOnDrawStartListener(this);
        c.setDisplayType(it.sephiroth.android.library.imagezoom.ImageViewTouchBase.a.c);
        c.a(f, null, -1F, 8F);
        d();
    }

}
