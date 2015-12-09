// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.aviary.android.feather.common.a.a;
import com.aviary.android.feather.common.utils.l;
import com.aviary.android.feather.headless.moa.d;
import com.aviary.android.feather.library.c.b;
import com.aviary.android.feather.library.c.e;
import com.aviary.android.feather.library.services.BadgeService;
import com.aviary.android.feather.library.services.ConfigService;
import com.aviary.android.feather.library.services.DragControllerService;
import com.aviary.android.feather.library.services.HiResBackgroundService;
import com.aviary.android.feather.library.services.IAPService;
import com.aviary.android.feather.library.services.IAviaryController;
import com.aviary.android.feather.library.services.LocalDataService;
import com.aviary.android.feather.library.services.PreferenceService;
import com.aviary.android.feather.library.services.ServiceLoader;
import com.aviary.android.feather.library.services.ThreadPoolService;
import com.aviary.android.feather.library.services.drag.DragLayer;
import com.aviary.android.feather.sdk.panels.AbstractPanelLoaderService;
import com.aviary.android.feather.sdk.panels.c;
import com.aviary.android.feather.sdk.widget.AviaryBottomBarViewFlipper;
import it.sephiroth.android.library.imagezoom.ImageViewTouchBase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public final class AviaryMainController
    implements com.aviary.android.feather.library.services.HiResBackgroundService.b, IAviaryController, com.aviary.android.feather.sdk.panels.c.b, com.aviary.android.feather.sdk.panels.c.c, com.aviary.android.feather.sdk.panels.c.d, com.aviary.android.feather.sdk.panels.c.e, com.aviary.android.feather.sdk.panels.c.f
{
    public static interface a
    {

        public abstract ImageViewTouchBase a();

        public abstract AviaryBottomBarViewFlipper b();

        public abstract ViewGroup c();

        public abstract ViewGroup d();

        public abstract ViewGroup e();

        public abstract void f();

        public abstract void g();

        public abstract void h();

        public abstract void i();

        public abstract void j();

        public abstract com.aviary.android.feather.common.b.b k();
    }

    public static interface b
    {

        public abstract void a(Bitmap bitmap, boolean flag);

        public abstract void a(Bitmap bitmap, boolean flag, Matrix matrix);

        public abstract void l();
    }

    public static interface c
    {

        public abstract void m();
    }

    static final class d extends Enum
    {

        public static final d a;
        public static final d b;
        public static final d c;
        public static final d d;
        public static final d e;
        public static final d f;
        private static final d g[];

        public static d valueOf(String s1)
        {
            return (d)Enum.valueOf(com/aviary/android/feather/sdk/AviaryMainController$d, s1);
        }

        public static d[] values()
        {
            return (d[])g.clone();
        }

        static 
        {
            a = new d("CLOSED_CANCEL", 0);
            b = new d("CLOSED_CONFIRMED", 1);
            c = new d("CLOSING", 2);
            d = new d("DISABLED", 3);
            e = new d("OPENED", 4);
            f = new d("OPENING", 5);
            g = (new d[] {
                a, b, c, d, e, f
            });
        }

        private d(String s1, int i1)
        {
            super(s1, i1);
        }
    }


    private Bitmap a;
    private Bitmap b;
    private a c;
    private com.aviary.android.feather.sdk.panels.c d;
    private com.aviary.android.feather.library.a.a e;
    private List f;
    private d g;
    private c h;
    private b i;
    private final Handler j;
    private final ServiceLoader k = new ServiceLoader(this);
    private AbstractPanelLoaderService l;
    private com.aviary.android.feather.common.a.a.c m;
    private boolean n;
    private Configuration o;
    private List p;
    private DragLayer q;
    private int r;

    public AviaryMainController(a a1, Handler handler)
    {
        m = com.aviary.android.feather.common.a.a.a("AviaryMainController", com.aviary.android.feather.common.a.a.d.a);
        c = a1;
        j = handler;
        r = 0;
        p = new ArrayList(0);
        o = new Configuration(((Context)a1).getResources().getConfiguration());
        a(a1);
        a(com.aviary.android.feather.sdk.d.d);
        n = false;
    }

    static com.aviary.android.feather.sdk.panels.c a(AviaryMainController aviarymaincontroller)
    {
        return aviarymaincontroller.d;
    }

    private void a(a a1)
    {
        this;
        JVM INSTR monitorenter ;
        m.b("initServices");
        k.b(com/aviary/android/feather/library/services/LocalDataService);
        k.b(com/aviary/android/feather/library/services/ThreadPoolService);
        k.b(com/aviary/android/feather/library/services/ConfigService);
        k.b(com/aviary/android/feather/library/services/IAPService);
        k.b(com/aviary/android/feather/library/services/BadgeService);
        k.b(com/aviary/android/feather/library/services/HiResBackgroundService);
        k.b(com/aviary/android/feather/library/services/DragControllerService);
        k.b(com/aviary/android/feather/library/services/PreferenceService);
        k.b(com/aviary/android/feather/sdk/panels/AbstractPanelLoaderService);
        this;
        JVM INSTR monitorexit ;
        return;
        a1;
        throw a1;
    }

    private void a(d d1)
    {
        if (d1 == g) goto _L2; else goto _L1
_L1:
        d d2;
        d2 = g;
        g = d1;
        static class _cls4
        {

            static final int a[];

            static 
            {
                a = new int[d.values().length];
                try
                {
                    a[d.f.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[com.aviary.android.feather.sdk.d.e.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[com.aviary.android.feather.sdk.d.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[com.aviary.android.feather.sdk.d.a.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.aviary.android.feather.sdk.d.b.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.aviary.android.feather.sdk.d.d.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        com.aviary.android.feather.sdk._cls4.a[d1.ordinal()];
        JVM INSTR tableswitch 1 6: default 64
    //                   1 65
    //                   2 130
    //                   3 167
    //                   4 223
    //                   5 223
    //                   6 334;
           goto _L3 _L4 _L5 _L6 _L7 _L7 _L8
_L7:
        break MISSING_BLOCK_LABEL_223;
_L3:
        break; /* Loop/switch isn't completed */
_L8:
        break MISSING_BLOCK_LABEL_334;
_L2:
        return;
_L4:
        d.a(this);
        d.a(this);
        d.a(this);
        d.a(this);
        if (d instanceof com.aviary.android.feather.sdk.panels.c.a)
        {
            ((com.aviary.android.feather.sdk.panels.c.a)d).a(this);
        }
        j.sendEmptyMessage(0);
        return;
_L5:
        d.z();
        j.sendEmptyMessage(1);
        if (!(d instanceof com.aviary.android.feather.sdk.panels.c.a))
        {
            j.sendEmptyMessage(6);
            return;
        }
        if (true) goto _L2; else goto _L6
_L6:
        j.sendEmptyMessage(2);
        d.A();
        if (d instanceof com.aviary.android.feather.sdk.panels.c.a)
        {
            ((com.aviary.android.feather.sdk.panels.c.a)d).a(null);
        }
        j.post(new Runnable() {

            final AviaryMainController a;

            public void run()
            {
                com.aviary.android.feather.sdk.AviaryMainController.b(a).d().removeAllViews();
                com.aviary.android.feather.sdk.AviaryMainController.b(a).f();
            }

            
            {
                a = AviaryMainController.this;
                super();
            }
        });
        return;
        c.c().removeAllViews();
        if (d2 != com.aviary.android.feather.sdk.d.d)
        {
            d.y();
            d.a(null);
            d.a(null);
            d.a(null);
            d.a(null);
            d = null;
            e = null;
        }
        j.sendEmptyMessage(3);
        if (d1 == com.aviary.android.feather.sdk.d.b && d2 != com.aviary.android.feather.sdk.d.d && h != null)
        {
            h.m();
        }
        System.gc();
        return;
        j.sendEmptyMessage(4);
        return;
    }

    static void a(AviaryMainController aviarymaincontroller, d d1)
    {
        aviarymaincontroller.a(d1);
    }

    private void a(com.aviary.android.feather.sdk.panels.c c1, com.aviary.android.feather.library.a.a a1, Bundle bundle)
    {
        if (c1 instanceof com.aviary.android.feather.sdk.panels.c.g)
        {
            a1 = ((com.aviary.android.feather.sdk.panels.c.g)c1).c(LayoutInflater.from((Context)c), c.c());
            c.c().addView(a1);
        }
        if (c1 instanceof com.aviary.android.feather.sdk.panels.c.a)
        {
            a1 = ((com.aviary.android.feather.sdk.panels.c.a)c1).a(LayoutInflater.from((Context)c));
            a1.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
            c.d().addView(a1);
        }
        c1.a(a, bundle);
    }

    static a b(AviaryMainController aviarymaincontroller)
    {
        return aviarymaincontroller.c;
    }

    private void b(Bitmap bitmap, e e1)
    {
        m.b("initHiResService");
        LocalDataService localdataservice = (LocalDataService)a(com/aviary/android/feather/library/services/LocalDataService);
        HiResBackgroundService hiresbackgroundservice = (HiResBackgroundService)a(com/aviary/android/feather/library/services/HiResBackgroundService);
        if (bitmap != null && e1 != null && e1.b() != null && e1.b().length == 2)
        {
            m.b("original size: %dx%d", new Object[] {
                Integer.valueOf(e1.b()[0]), Integer.valueOf(e1.b()[1])
            });
            m.b("bitmap size: %dx%d", new Object[] {
                Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight())
            });
        }
        if (!hiresbackgroundservice.c())
        {
            hiresbackgroundservice.a(this);
            hiresbackgroundservice.a();
            hiresbackgroundservice.a(localdataservice.h(), localdataservice.g(), e1);
        }
    }

    private void c(boolean flag)
    {
        m.b("onClose");
        a(com.aviary.android.feather.sdk.d.c);
        c.b().setOnViewChangingStatusListener(new com.aviary.android.feather.sdk.widget.AviaryBottomBarViewFlipper.b(flag) {

            final boolean a;
            final AviaryMainController b;

            public void a()
            {
            }

            public void b()
            {
            }

            public void c()
            {
                com.aviary.android.feather.sdk.AviaryMainController.a(b).s();
            }

            public void d()
            {
                AviaryMainController aviarymaincontroller = b;
                d d1;
                if (a)
                {
                    d1 = com.aviary.android.feather.sdk.d.b;
                } else
                {
                    d1 = com.aviary.android.feather.sdk.d.a;
                }
                com.aviary.android.feather.sdk.AviaryMainController.a(aviarymaincontroller, d1);
                com.aviary.android.feather.sdk.AviaryMainController.b(b).b().setOnViewChangingStatusListener(null);
            }

            
            {
                b = AviaryMainController.this;
                a = flag;
                super();
            }
        });
        c.b().b();
    }

    public void A()
    {
        c.g();
    }

    public void B()
    {
        c.h();
    }

    public void C()
    {
        c.i();
    }

    public void D()
    {
        c.j();
    }

    public Context a()
    {
        return (Activity)c;
    }

    public Object a(Class class1)
    {
        try
        {
            class1 = k.a(class1);
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            class1.printStackTrace();
            return null;
        }
        return class1;
    }

    public void a(int i1)
    {
        android.os.Message message = j.obtainMessage(101, i1, 0);
        j.sendMessage(message);
    }

    public void a(int i1, int j1)
    {
        m.c("onHiresProgress: %d of %d", new Object[] {
            Integer.valueOf(i1), Integer.valueOf(j1)
        });
        for (Iterator iterator = p.iterator(); iterator.hasNext(); ((com.aviary.android.feather.library.services.HiResBackgroundService.b)iterator.next()).a(i1, j1)) { }
    }

    public void a(Bitmap bitmap, e e1)
    {
        if (g != com.aviary.android.feather.sdk.d.d)
        {
            throw new IllegalStateException("Cannot activate. Already active!");
        }
        if (a != null && !a.isRecycled())
        {
            a = null;
        }
        a = bitmap;
        if (com.aviary.android.feather.common.utils.l.f() >= 256D && android.os.Build.VERSION.SDK_INT >= 14)
        {
            b = com.aviary.android.feather.library.c.b.a(a, a.getConfig());
        }
        ((LocalDataService)a(com/aviary/android/feather/library/services/LocalDataService)).a(e1);
        n = false;
        a(com.aviary.android.feather.sdk.d.b);
        b(bitmap, e1);
    }

    public void a(Bitmap bitmap, com.aviary.android.feather.library.d.a a1)
    {
        r = r + 1;
        if (bitmap != null)
        {
            a(bitmap, true);
        } else
        {
            m.d("Error: returned bitmap is null!");
            a(a, true);
        }
        c(true);
        if (a1 != null)
        {
            if (!a1.a())
            {
                m.d("editResult is not valid!");
            }
            bitmap = (LocalDataService)a(com/aviary/android/feather/library/services/LocalDataService);
            if (bitmap != null)
            {
                bitmap.a(a1.b());
            }
            if (a1.e() != null && a1.e().size() > 0)
            {
                bitmap = (HiResBackgroundService)a(com/aviary/android/feather/library/services/HiResBackgroundService);
                if (bitmap != null && bitmap.c())
                {
                    bitmap.a(a1.e());
                }
                return;
            } else
            {
                m.d("actionlist is missing!");
                return;
            }
        } else
        {
            m.d("Something was wrong, edit result is null!");
            return;
        }
    }

    void a(Bitmap bitmap, boolean flag)
    {
        a(bitmap, flag, ((Matrix) (null)));
    }

    void a(Bitmap bitmap, boolean flag, Matrix matrix)
    {
        m.b("setNextBitmap", new Object[] {
            bitmap, Boolean.valueOf(flag), matrix
        });
        if (i != null)
        {
            i.a(bitmap, flag, matrix);
        }
        if (!a.equals(bitmap) && !a.isRecycled())
        {
            m.c((new StringBuilder()).append("[recycle] original Bitmap: ").append(a).toString());
            a.recycle();
            a = null;
        }
        a = bitmap;
    }

    public void a(com.aviary.android.feather.headless.a a1)
    {
        m.b((new StringBuilder()).append("onHiresError: ").append(a1).toString());
        for (Iterator iterator = p.iterator(); iterator.hasNext(); ((com.aviary.android.feather.library.services.HiResBackgroundService.b)iterator.next()).a(a1)) { }
    }

    public void a(com.aviary.android.feather.library.a.a a1)
    {
        a(a1, ((Bundle) (null)));
    }

    public void a(com.aviary.android.feather.library.a.a a1, Bundle bundle)
    {
        if (r() && s() && a != null && (f == null || f.indexOf(a1.c.name()) >= 0))
        {
            if (d != null)
            {
                throw new IllegalStateException("There is already an active effect. Cannot activate new");
            }
            if (l == null)
            {
                l = (AbstractPanelLoaderService)a(com/aviary/android/feather/sdk/panels/AbstractPanelLoaderService);
            }
            com.aviary.android.feather.sdk.panels.c c1 = l.a(a1);
            if (c1 != null)
            {
                d = c1;
                e = a1;
                ((BadgeService)a(com/aviary/android/feather/library/services/BadgeService)).a(a1.c);
                a(d.f);
                a(c1, a1, bundle);
                h().a((new StringBuilder()).append(e.c.name().toLowerCase(Locale.US)).append(": opened").toString());
                c.b().setOnViewChangingStatusListener(new com.aviary.android.feather.sdk.widget.AviaryBottomBarViewFlipper.b() {

                    final AviaryMainController a;

                    public void a()
                    {
                        com.aviary.android.feather.sdk.AviaryMainController.a(a).r();
                    }

                    public void b()
                    {
                        com.aviary.android.feather.sdk.AviaryMainController.a(a, com.aviary.android.feather.sdk.d.e);
                        com.aviary.android.feather.sdk.AviaryMainController.b(a).b().setOnViewChangingStatusListener(null);
                    }

                    public void c()
                    {
                    }

                    public void d()
                    {
                    }

            
            {
                a = AviaryMainController.this;
                super();
            }
                });
                c.b().a();
                return;
            }
        }
    }

    public void a(com.aviary.android.feather.library.services.HiResBackgroundService.b b1)
    {
        p.add(b1);
    }

    public void a(DragLayer draglayer)
    {
        q = draglayer;
    }

    public void a(b b1)
    {
        i = b1;
    }

    public void a(c c1)
    {
        h = c1;
    }

    public void a(com.aviary.android.feather.sdk.panels.c c1)
    {
        j.sendEmptyMessage(5);
        j.sendEmptyMessage(6);
    }

    public void a(CharSequence charsequence)
    {
        charsequence = j.obtainMessage(100, charsequence);
        j.sendMessage(charsequence);
    }

    public void a(CharSequence charsequence, int i1, android.content.DialogInterface.OnClickListener onclicklistener)
    {
        (new android.app.AlertDialog.Builder((Activity)c)).setTitle(R.string.feather_generic_error_title).setMessage(charsequence).setPositiveButton(i1, onclicklistener).setIcon(0x1080027).show();
    }

    protected void a(List list)
    {
        f = list;
    }

    public void a(boolean flag)
    {
        Object obj = j;
        int i1;
        if (flag)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        obj = ((Handler) (obj)).obtainMessage(102, i1, 0);
        j.sendMessage(((android.os.Message) (obj)));
    }

    public boolean a(int i1, int j1, Intent intent)
    {
        IAPService iapservice;
        iapservice = (IAPService)a(com/aviary/android/feather/library/services/IAPService);
        if (iapservice == null || i1 != IAPService.e)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        boolean flag = iapservice.a(i1, j1, intent);
        return flag;
        intent;
        m.d("handled exception");
        intent.printStackTrace();
        return false;
    }

    public boolean a(Configuration configuration)
    {
        boolean flag = true;
        m.b((new StringBuilder()).append("onConfigurationChanged: ").append(configuration.orientation).append(", ").append(o.orientation).toString());
        if (d != null && d.o())
        {
            m.c("onConfigurationChanged, sending event to ", new Object[] {
                d
            });
            d.a(configuration, o);
        } else
        {
            flag = false;
        }
        o = new Configuration(configuration);
        return flag;
    }

    public Activity b()
    {
        return (Activity)c;
    }

    public void b(Bitmap bitmap, boolean flag)
    {
        while (!r() || !t() || i == null) 
        {
            return;
        }
        i.a(bitmap, flag);
    }

    public void b(boolean flag)
    {
label0:
        {
            if (!flag)
            {
                if (!s())
                {
                    break label0;
                }
                a(com.aviary.android.feather.sdk.d.d);
            }
            return;
        }
        m.c("FilterManager must be closed to change state");
    }

    public boolean b(com.aviary.android.feather.library.services.HiResBackgroundService.b b1)
    {
        return p.remove(b1);
    }

    public void c()
    {
        m.b("onHiresComplete");
        for (Iterator iterator = p.iterator(); iterator.hasNext(); ((com.aviary.android.feather.library.services.HiResBackgroundService.b)iterator.next()).c()) { }
    }

    public Matrix d()
    {
        return c.a().getDisplayMatrix();
    }

    public void e()
    {
        m.b("FilterManager::cancel");
        if (!r() || !t())
        {
            return;
        }
        if (d == null)
        {
            throw new IllegalStateException("there is no current effect active in the context");
        }
        c.k().a((new StringBuilder()).append(e.c.name().toLowerCase(Locale.US)).append(": cancelled").toString());
        d.w();
        if (d.x())
        {
            a(a, true);
        } else
        {
            a(a, true);
        }
        c(false);
    }

    public void f()
    {
        if (e != null)
        {
            android.os.Message message = j.obtainMessage(101, e.a, 0);
            j.sendMessage(message);
        }
    }

    public DragLayer g()
    {
        return q;
    }

    public com.aviary.android.feather.common.b.b h()
    {
        return c.k();
    }

    public final int i()
    {
        return r;
    }

    protected List j()
    {
        return f;
    }

    public void k()
    {
        if (d != null)
        {
            m.a("Deactivate and destroy current panel");
            d.A();
            d.y();
            d = null;
        }
        HiResBackgroundService hiresbackgroundservice = (HiResBackgroundService)a(com/aviary/android/feather/library/services/HiResBackgroundService);
        if (hiresbackgroundservice != null)
        {
            hiresbackgroundservice.a(null);
        }
        k.a();
        c = null;
        h = null;
        i = null;
        System.gc();
    }

    public Bitmap l()
    {
        return a;
    }

    public Bitmap m()
    {
        return b;
    }

    public boolean n()
    {
        return n;
    }

    public boolean o()
    {
        while (n || d != null && d.n() && d.x()) 
        {
            return true;
        }
        return false;
    }

    public boolean p()
    {
        if (d != null && d.n())
        {
            return d.e();
        } else
        {
            return false;
        }
    }

    public com.aviary.android.feather.library.a.a q()
    {
        return e;
    }

    public boolean r()
    {
        return g != com.aviary.android.feather.sdk.d.d;
    }

    public boolean s()
    {
        return g == com.aviary.android.feather.sdk.d.a || g == com.aviary.android.feather.sdk.d.b;
    }

    public boolean t()
    {
        return g == com.aviary.android.feather.sdk.d.e;
    }

    public void u()
    {
        m.b("FilterManager::onapply");
        if (r() && t())
        {
            if (d == null)
            {
                throw new IllegalStateException("there is no current effect active in the context");
            }
            if (d.m())
            {
                if (d.x())
                {
                    d.u();
                    n = true;
                    return;
                } else
                {
                    w();
                    return;
                }
            }
        }
    }

    public boolean v()
    {
        while (s() || g == com.aviary.android.feather.sdk.d.d) 
        {
            return false;
        }
        if (t() && !d.t())
        {
            w();
        }
        return true;
    }

    public void w()
    {
        if (r() && t())
        {
            if (d == null)
            {
                throw new IllegalStateException("there is no current effect active in the context");
            }
            if (!d.v())
            {
                e();
                return;
            }
        }
    }

    public void x()
    {
        while (!r() || !t() || i == null) 
        {
            return;
        }
        i.l();
    }

    public void y()
    {
        m.b("onRestoreOriginal");
        break MISSING_BLOCK_LABEL_12;
        if (r() && b != null)
        {
            a(com.aviary.android.feather.library.c.b.a(b, b.getConfig()), true, ((Matrix) (null)));
            n = false;
            LocalDataService localdataservice = (LocalDataService)a(com/aviary/android/feather/library/services/LocalDataService);
            HiResBackgroundService hiresbackgroundservice = (HiResBackgroundService)a(com/aviary/android/feather/library/services/HiResBackgroundService);
            if (localdataservice != null)
            {
                localdataservice.a();
            }
            if (hiresbackgroundservice != null && localdataservice != null && hiresbackgroundservice.c())
            {
                hiresbackgroundservice.a(localdataservice.h(), com.aviary.android.feather.headless.utils.a.p.ordinal(), localdataservice.c());
            }
            if (d != null)
            {
                d.a(a);
                return;
            }
        }
        return;
    }

    public void z()
    {
        if (r())
        {
            if (s());
        }
    }
}
