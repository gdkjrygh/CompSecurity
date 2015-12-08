// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import Fq;
import IK;
import LB;
import Pa;
import VM;
import WA;
import WK;
import WN;
import Wi;
import Ws;
import Wu;
import Wv;
import Ww;
import Wy;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.VideoView;
import com.snapchat.android.Timber;
import dv;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Lock;
import lR;
import lv;
import rB;
import ry;

public class VideoFilterView extends SurfaceView
{
    public static interface a
        extends Wv.b
    {

        public abstract void a(Wi wi);
    }

    final class b
        implements android.view.SurfaceHolder.Callback
    {

        private VideoFilterView a;

        public final void surfaceChanged(SurfaceHolder surfaceholder, int i1, int j1, int k1)
        {
        }

        public final void surfaceCreated(SurfaceHolder surfaceholder)
        {
            VideoFilterView.a(a, new VM(surfaceholder.getSurface(), false));
            VideoFilterView.a(a, WP.b.a, VideoFilterView.c(a));
_L2:
            return;
            surfaceholder;
            Timber.e("VideoFilterView", (new StringBuilder("SetupException in surfaceCreated: ")).append(surfaceholder.toString()).toString(), new Object[0]);
            a.a();
            VideoFilterView.d(a);
            if (VideoFilterView.e(a) == null || VideoFilterView.f(a)) goto _L2; else goto _L1
_L1:
            VideoFilterView.e(a).a(surfaceholder);
            return;
            surfaceholder;
            Timber.e("VideoFilterView", (new StringBuilder("InvalidMediaException in surfaceCreated: ")).append(surfaceholder.toString()).toString(), new Object[0]);
            a.a();
            VideoFilterView.d(a);
            if (VideoFilterView.e(a) != null && !VideoFilterView.f(a))
            {
                VideoFilterView.e(a).a(surfaceholder);
                return;
            }
              goto _L2
        }

        public final void surfaceDestroyed(SurfaceHolder surfaceholder)
        {
            Timber.c("VideoFilterView", "Surface destroyed!", new Object[0]);
            VideoFilterView.d(a);
        }

        private b()
        {
            a = VideoFilterView.this;
            super();
        }

        b(byte byte0)
        {
            this();
        }
    }

    public static interface c
    {

        public abstract void a(Throwable throwable);
    }


    public final Pa a;
    private Uri b;
    private final LB c;
    private final rB d;
    private int e;
    private Ww f;
    private Wi g;
    private boolean h;
    private boolean i;
    private Fq j;
    private VM k;
    private int l;
    private int m;
    private float n;
    private float o;
    private float p;
    private c q;
    private android.view.SurfaceHolder.Callback r;

    public VideoFilterView(Context context)
    {
        this(context, new LB(), rB.a(), lv.a(), new Pa());
    }

    private VideoFilterView(Context context, LB lb, rB rb, lv lv1, Pa pa)
    {
        super(context);
        e = 1;
        f = null;
        g = null;
        h = false;
        i = false;
        k = null;
        o = 0.0F;
        p = 0.0F;
        q = null;
        r = new b((byte)0);
        c = lb;
        d = rb;
        a = pa;
        b();
    }

    public VideoFilterView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0, new LB(), rB.a(), lv.a(), new Pa());
    }

    public VideoFilterView(Context context, AttributeSet attributeset, int i1)
    {
        this(context, attributeset, i1, new LB(), rB.a(), lv.a(), new Pa());
    }

    private VideoFilterView(Context context, AttributeSet attributeset, int i1, LB lb, rB rb, lv lv1, Pa pa)
    {
        super(context, attributeset, i1);
        e = 1;
        f = null;
        g = null;
        h = false;
        i = false;
        k = null;
        o = 0.0F;
        p = 0.0F;
        q = null;
        r = new b((byte)0);
        c = lb;
        d = rb;
        a = pa;
        b();
    }

    static VM a(VideoFilterView videofilterview, VM vm)
    {
        videofilterview.k = vm;
        return vm;
    }

    private WA a(Uri uri, WP.b b1, boolean flag)
    {
        uri = uri.getPath();
        WK wk;
        try
        {
            wk = (new WK()).a(new WN(new File(uri))).a(o, p);
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            throw uri;
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            throw new Wu((new StringBuilder("Error reading rotation from video: ")).append(uri.toString()).toString(), uri);
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        wk.a();
        return new WA(uri, wk, null, b1, 1.0D, WA.b.a, WA.a.a);
    }

    static Wi a(VideoFilterView videofilterview)
    {
        return videofilterview.g;
    }

    private void a(WP.b b1, boolean flag)
    {
        if (b == null || k == null)
        {
            return;
        } else
        {
            g = new Wi(d.b, a(b, b1, flag), WP.b.a, WP.b.a, k);
            g.a(n);
            return;
        }
    }

    static void a(VideoFilterView videofilterview, WP.b b1, boolean flag)
    {
        videofilterview.a(b1, flag);
    }

    static Ww b(VideoFilterView videofilterview)
    {
        return videofilterview.f;
    }

    private void b()
    {
        l = 0;
        m = 0;
        getHolder().addCallback(r);
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        f = new Ww();
    }

    static boolean c(VideoFilterView videofilterview)
    {
        return videofilterview.h;
    }

    static void d(VideoFilterView videofilterview)
    {
        if (videofilterview.g != null)
        {
            videofilterview.g = null;
        }
        if (videofilterview.k != null)
        {
            videofilterview.k.a();
            videofilterview.k = null;
        }
    }

    static c e(VideoFilterView videofilterview)
    {
        return videofilterview.q;
    }

    static boolean f(VideoFilterView videofilterview)
    {
        return videofilterview.i;
    }

    public final void a()
    {
        i = true;
        if (g == null) goto _L2; else goto _L1
_L1:
        Timber.c("VideoFilterView", "Trying to stop playback", new Object[0]);
        if (j != null)
        {
            j.a = null;
        }
        Ww ww;
        Wi wi;
        ww = f;
        wi = g;
        dv.a(wi);
        ww.b.lock();
        Object obj = "Task ended successfully.";
        Object obj2 = wi.a();
        if (obj2 == Wv.c.c)
        {
            break MISSING_BLOCK_LABEL_172;
        }
        obj = ww.a.iterator();
        Ww.a a1;
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break MISSING_BLOCK_LABEL_153;
            }
            a1 = (Ww.a)((Iterator) (obj)).next();
        } while (a1.a != wi);
        ww.a.remove(a1);
        obj = a1.b;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_153;
        }
        ((Wv.a) (obj)).a(((Wv.c) (obj2)), "Task ended successfully.");
        if (ww.c.a == wi)
        {
            ww.c = null;
        }
        ww.b.unlock();
        ww.a();
_L3:
        Object obj1;
        Wv.c c1;
        Object obj3;
        Object obj4;
        Ww.a a2;
        try
        {
            Timber.c("VideoFilterView", "Waiting for abort with status", new Object[0]);
            obj = g;
            if (((Wi) (obj)).c != null)
            {
                ((Wi) (obj)).c.await();
            }
            Timber.c("VideoFilterView", "Abort finished", new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            c.b(new lR(((InterruptedException) (obj1)).getMessage()));
            throw new RuntimeException((new StringBuilder("Could not release all components for video rendering! Error ")).append(((InterruptedException) (obj1)).getMessage()).toString());
        }
        g = null;
_L2:
        e = 1;
        Timber.c("VideoFilterView", "Playback has been stopped", new Object[0]);
        return;
        obj3;
        wi.d = Wv.c.e;
        c1 = Wv.c.e;
        obj2 = ((Throwable) (obj3)).toString();
        obj = obj2;
        throw new Wy(((Throwable) (obj3)).toString(), ((Throwable) (obj3)));
        obj3;
        obj2 = obj;
        obj1 = obj3;
_L4:
        if (c1 == Wv.c.c)
        {
            break MISSING_BLOCK_LABEL_401;
        }
        obj4 = ww.a.iterator();
        do
        {
            if (!((Iterator) (obj4)).hasNext())
            {
                break MISSING_BLOCK_LABEL_382;
            }
            a2 = (Ww.a)((Iterator) (obj4)).next();
        } while (a2.a != wi);
        ww.a.remove(a2);
        obj4 = a2.b;
        if (obj4 == null)
        {
            break MISSING_BLOCK_LABEL_382;
        }
        ((Wv.a) (obj4)).a(c1, ((String) (obj2)));
        if (ww.c.a == wi)
        {
            ww.c = null;
        }
        ww.b.unlock();
        ww.a();
        throw obj1;
        obj1;
        Timber.e("VideoFilterView", ((Wy) (obj1)).toString(), new Object[] {
            obj1
        });
        c.b(new lR(((Wy) (obj1)).getMessage()));
          goto _L3
        obj1;
        obj2 = "Task ended successfully.";
        c1 = null;
          goto _L4
    }

    public final void a(a a1, Wv.a a2)
    {
        if (e == 2 || b == null)
        {
            return;
        }
        a1.a(g);
        boolean flag;
        if (g != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            postDelayed(new Runnable(a1, a2) {

                private a a;
                private Wv.a b;
                private VideoFilterView c;

                public final void run()
                {
                    c.a(a, b);
                }

            
            {
                c = VideoFilterView.this;
                a = a1;
                b = a2;
                super();
            }
            }, 25L);
            return;
        } else
        {
            (new Thread(new Runnable(a2, a1) {

                private Wv.a a;
                private a b;
                private VideoFilterView c;

                public final void run()
                {
                    if (VideoFilterView.a(c) != null)
                    {
                        VideoFilterView.b(c).a(VideoFilterView.a(c), a, b);
                    }
                }

            
            {
                c = VideoFilterView.this;
                a = a1;
                b = a2;
                super();
            }
            })).start();
            e = 2;
            return;
        }
    }

    public final boolean a(Uri uri, IK ik, android.widget.ImageView.ScaleType scaletype, WP.b b1, boolean flag)
    {
        if (scaletype != android.widget.ImageView.ScaleType.CENTER_CROP && scaletype != android.widget.ImageView.ScaleType.FIT_CENTER)
        {
            throw new IllegalArgumentException("openVideoUri must use the CENTER_CROP or FIT_CENTER ScaleTypes");
        }
        float f1;
        int i1;
        int j1;
        b = uri;
        h = flag;
        i1 = ik.a();
        j1 = ik.b();
        f1 = (float)i1 / (float)j1;
        uri = getResources().getDisplayMetrics();
        Timber.c("VideoFilterView", (new StringBuilder("Size: display  ")).append(((DisplayMetrics) (uri)).widthPixels).append("x").append(((DisplayMetrics) (uri)).heightPixels).append(", video  ").append(i1).append("x").append(j1).toString(), new Object[0]);
        if (((DisplayMetrics) (uri)).widthPixels * i1 != ((DisplayMetrics) (uri)).heightPixels * j1 && scaletype != android.widget.ImageView.ScaleType.FIT_CENTER)
        {
            break MISSING_BLOCK_LABEL_256;
        }
        i1 = ((DisplayMetrics) (uri)).widthPixels;
        j1 = (int)((float)i1 * f1);
        Timber.c("VideoFilterView", (new StringBuilder("Setting resolution = ")).append(i1).append(" x ").append(j1).toString(), new Object[0]);
        l = Math.min(i1, j1);
        m = Math.max(i1, j1);
        p = 1.0F;
        o = 1.0F;
_L1:
        a(b1, flag);
        requestLayout();
        invalidate();
        return true;
        try
        {
            l = ((DisplayMetrics) (uri)).widthPixels;
            m = ((DisplayMetrics) (uri)).heightPixels;
            uri = new ry(((DisplayMetrics) (uri)).widthPixels, ((DisplayMetrics) (uri)).heightPixels, j1, i1);
            o = 1.0F / (1.0F - ((ry) (uri)).c);
            p = 1.0F / (1.0F - ((ry) (uri)).d);
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            Timber.e("VideoFilterView", uri.getMessage(), new Object[0]);
            return false;
        }
          goto _L1
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        super.onInitializeAccessibilityEvent(accessibilityevent);
        accessibilityevent.setClassName(android/widget/VideoView.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
    {
        super.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
        accessibilitynodeinfo.setClassName(android/widget/VideoView.getName());
    }

    protected void onMeasure(int i1, int j1)
    {
        i1 = getDefaultSize(l, i1);
        j1 = getDefaultSize(m, j1);
        if (l > 0 && m > 0)
        {
            setMeasuredDimension(l, m);
            return;
        } else
        {
            setMeasuredDimension(i1, j1);
            return;
        }
    }

    public void setSwipeVideoViewController(Fq fq)
    {
        j = fq;
    }

    public void setUnrecoverableErrorListener(c c1)
    {
        q = c1;
    }

    public void setVideoAspect(int i1, int j1)
    {
        l = Math.min(i1, j1);
        m = Math.max(i1, j1);
    }

    public void setVolume(float f1)
    {
        n = f1;
        if (g != null)
        {
            g.a(n);
        }
    }
}
