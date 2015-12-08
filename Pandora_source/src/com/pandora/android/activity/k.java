// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.ImageView;
import com.pandora.android.coachmark.b;
import com.pandora.android.coachmark.d;
import com.pandora.android.util.s;
import com.pandora.android.view.NowPlayingView;
import com.pandora.android.view.c;
import com.pandora.radio.data.aa;
import com.pandora.radio.data.y;
import java.lang.ref.WeakReference;
import p.al.f;
import p.l.g;
import p.l.j;

// Referenced classes of package com.pandora.android.activity:
//            BaseAdFragmentActivity, o

public class k
{

    private boolean A;
    private ViewPropertyAnimator a;
    private BaseAdFragmentActivity b;
    private View c;
    private y d;
    private ViewPager e;
    private View f;
    private View g;
    private View h;
    private View i;
    private ImageView j;
    private c k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private int s;
    private int t;
    private int u;
    private int v[];
    private float w;
    private float x;
    private float y[];
    private boolean z;

    public k(BaseAdFragmentActivity baseadfragmentactivity, Bundle bundle)
    {
        m = true;
        n = true;
        o = false;
        p = false;
        q = false;
        r = true;
        s = 1;
        b = baseadfragmentactivity;
        if (bundle != null)
        {
            s = bundle.getInt("originalOrientation", 1);
            q = bundle.getBoolean("videoAd", false);
            o = bundle.getBoolean("shouldAnimate", false);
            p = bundle.getBoolean("isNewStation", false);
            v = bundle.getIntArray("albumArtLocation");
            y = bundle.getFloatArray("albumArtDimensions");
            d = (y)bundle.getSerializable("intent_station_data");
        } else
        {
            m = false;
        }
        e = (ViewPager)b.findViewById(0x7f1001bf);
        f = b.findViewById(0x7f1001bd);
        baseadfragmentactivity = com.pandora.android.coachmark.d.a(b);
        g = baseadfragmentactivity.a();
        h = (new b(baseadfragmentactivity.b())).b();
        i = b.findViewById(0x7f1001be);
        j = (ImageView)b.findViewById(0x7f1001c0);
        k = new c();
        b.getWindow().setBackgroundDrawable(k);
    }

    static float a(k k1, float f1)
    {
        k1.w = f1;
        return f1;
    }

    static int a(k k1, int i1)
    {
        k1.t = i1;
        return i1;
    }

    static View a(k k1, View view)
    {
        k1.c = view;
        return view;
    }

    static ImageView a(k k1)
    {
        return k1.j;
    }

    protected static f a(WeakReference weakreference)
    {
        return new f(weakreference) {

            final WeakReference a;

            public volatile boolean a(Exception exception, Object obj, p.an.k k1, boolean flag)
            {
                return a(exception, (String)obj, k1, flag);
            }

            public boolean a(Exception exception, String s1, p.an.k k1, boolean flag)
            {
                exception = (k)a.get();
                if (exception != null)
                {
                    exception.b();
                }
                return false;
            }

            public volatile boolean a(Object obj, Object obj1, p.an.k k1, boolean flag, boolean flag1)
            {
                return a((p.ad.b)obj, (String)obj1, k1, flag, flag1);
            }

            public boolean a(p.ad.b b1, String s1, p.an.k k1, boolean flag, boolean flag1)
            {
                b1 = (k)a.get();
                if (b1 != null)
                {
                    b1.b();
                }
                return false;
            }

            
            {
                a = weakreference;
                super();
            }
        };
    }

    protected static f a(WeakReference weakreference, Runnable runnable)
    {
        return new f(weakreference, runnable) {

            final WeakReference a;
            final Runnable b;

            public volatile boolean a(Exception exception, Object obj, p.an.k k1, boolean flag)
            {
                return a(exception, (String)obj, k1, flag);
            }

            public boolean a(Exception exception, String s1, p.an.k k1, boolean flag)
            {
                exception = (k)a.get();
                if (exception != null)
                {
                    k.a(exception, b);
                }
                return false;
            }

            public volatile boolean a(Object obj, Object obj1, p.an.k k1, boolean flag, boolean flag1)
            {
                return a((p.ad.b)obj, (String)obj1, k1, flag, flag1);
            }

            public boolean a(p.ad.b b1, String s1, p.an.k k1, boolean flag, boolean flag1)
            {
                b1 = (k)a.get();
                if (b1 != null)
                {
                    k.a(b1, b);
                }
                return false;
            }

            
            {
                a = weakreference;
                b = runnable;
                super();
            }
        };
    }

    static void a(k k1, Runnable runnable)
    {
        k1.b(runnable);
    }

    static boolean a(k k1, boolean flag)
    {
        k1.m = flag;
        return flag;
    }

    static float b(k k1, float f1)
    {
        k1.x = f1;
        return f1;
    }

    static int b(k k1, int i1)
    {
        k1.u = i1;
        return i1;
    }

    static ViewPager b(k k1)
    {
        return k1.e;
    }

    private void b(Runnable runnable)
    {
        if (A)
        {
            return;
        } else
        {
            A = true;
            j.setVisibility(0);
            j.setAlpha(1.0F);
            j.setTranslationX(0.0F);
            a = j.animate();
            a.setListener(new AnimatorListenerAdapter(runnable) {

                final Runnable a;
                final k b;

                public void onAnimationEnd(Animator animator)
                {
                    com.pandora.android.util.s.a(k.a(b), 0.0F);
                    k.a(b).setVisibility(4);
                    k.a(b).setImageBitmap(null);
                    a.run();
                }

            
            {
                b = k.this;
                a = runnable;
                super();
            }
            });
            a.setDuration(250L).scaleX(w).scaleY(x).translationX(t).translationY(u);
            g.animate().setDuration(250L).alpha(0.0F);
            h.animate().setDuration(250L).alpha(0.0F);
            e.animate().setDuration(250L).alpha(0.0F);
            i.animate().setDuration(250L).alpha(0.0F);
            k.b(250L);
            return;
        }
    }

    static boolean b(k k1, boolean flag)
    {
        k1.p = flag;
        return flag;
    }

    static int[] c(k k1)
    {
        return k1.v;
    }

    static float[] d(k k1)
    {
        return k1.y;
    }

    static void e(k k1)
    {
        k1.g();
    }

    static boolean f(k k1)
    {
        return k1.p;
    }

    static y g(k k1)
    {
        return k1.d;
    }

    private void g()
    {
        g.setAlpha(0.0F);
        h.setAlpha(0.0F);
        e.setAlpha(0.0F);
        i.setAlpha(0.0F);
        k.setAlpha(0);
        j.setPivotX(0.0F);
        j.setPivotY(0.0F);
        j.setScaleX(w);
        j.setScaleY(x);
        j.setTranslationX(t);
        j.setTranslationY(u);
    }

    static BaseAdFragmentActivity h(k k1)
    {
        return k1.b;
    }

    static ViewPropertyAnimator i(k k1)
    {
        return k1.a;
    }

    static boolean j(k k1)
    {
        return k1.l;
    }

    static View k(k k1)
    {
        return k1.f;
    }

    static View l(k k1)
    {
        return k1.c;
    }

    public void a()
    {
        if (o && n && !q)
        {
            n = false;
            ViewTreeObserver viewtreeobserver = j.getViewTreeObserver();
            if (viewtreeobserver != null)
            {
                viewtreeobserver.addOnPreDrawListener(new android.view.ViewTreeObserver.OnPreDrawListener() {

                    final k a;

                    public boolean onPreDraw()
                    {
                        k.a(a).getViewTreeObserver().removeOnPreDrawListener(this);
                        int ai[] = new int[2];
                        com.pandora.android.activity.k.b(a).getLocationOnScreen(ai);
                        k.a(a, com.pandora.android.activity.k.c(a)[0] - ai[0]);
                        com.pandora.android.activity.k.b(a, com.pandora.android.activity.k.c(a)[1] - ai[1]);
                        k.a(a, com.pandora.android.activity.k.d(a)[0] / (float)k.a(a).getWidth());
                        com.pandora.android.activity.k.b(a, com.pandora.android.activity.k.d(a)[1] / (float)k.a(a).getHeight());
                        k.e(a);
                        if (com.pandora.android.activity.k.f(a))
                        {
                            p.l.g.a(k.h(a)).a(com.pandora.android.activity.k.g(a).o()).a(0x7f0200e9).a(k.a(new WeakReference(a))).a(k.a(a));
                        } else
                        {
                            aa aa1 = com.pandora.android.provider.b.a.b().d().s();
                            if (aa1 != null && !aa1.M())
                            {
                                p.l.g.a(k.h(a)).a(aa1.v()).a(0x7f0200e9).a(k.a(new WeakReference(a))).a(k.a(a));
                            } else
                            {
                                a.b();
                                return true;
                            }
                        }
                        k.a(a).postDelayed(new Runnable(this) {

                            final _cls1 a;

                            public void run()
                            {
                                a.a.b();
                            }

            
            {
                a = _pcls1;
                super();
            }
                        }, 500L);
                        return true;
                    }

            
            {
                a = k.this;
                super();
            }
                });
            }
            return;
        } else
        {
            m = false;
            return;
        }
    }

    public void a(View view)
    {
        if (!o || !r || view == null || m) goto _L2; else goto _L1
_L1:
        if (!p) goto _L4; else goto _L3
_L3:
        if (view.getVisibility() == 0)
        {
            view.setAlpha(0.0F);
            view.setTranslationX(f.getWidth());
        }
        a = j.animate();
        a.setListener(new AnimatorListenerAdapter() {

            final k a;

            public void onAnimationEnd(Animator animator)
            {
                k.i(a).setListener(null);
                k.a(a, false);
                com.pandora.android.activity.k.b(a, false);
                if (k.h(a).t() && !com.pandora.android.activity.k.j(a))
                {
                    k.h(a).a("station_change", true);
                }
            }

            public void onAnimationStart(Animator animator)
            {
                k.a(a, true);
            }

            
            {
                a = k.this;
                super();
            }
        });
        a.setDuration(250L).translationX(-j.getWidth()).alpha(0.0F);
        if (view.getVisibility() == 0)
        {
            view.animate().setDuration(250L).alpha(1.0F).translationX(0.0F);
        }
_L6:
        r = false;
_L2:
        return;
_L4:
        j.animate().setDuration(250L).alpha(0.0F);
        if (b.t())
        {
            b.a("station", true);
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void a(Runnable runnable)
    {
        Object obj;
        boolean flag;
        if (s == b.getResources().getConfiguration().orientation)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj = (NowPlayingView)((o)e.getAdapter()).e();
        if (o && flag && !l && obj != null)
        {
            ((NowPlayingView) (obj)).getTrackKey();
            obj = com.pandora.android.provider.b.a.b().d().s();
            if (obj != null && !((aa) (obj)).M())
            {
                p.l.g.a(b).a(((aa) (obj)).v()).a(a(new WeakReference(this), runnable)).a(j);
            }
            j.postDelayed(new Runnable(runnable) {

                final Runnable a;
                final k b;

                public void run()
                {
                    k.a(b, a);
                }

            
            {
                b = k.this;
                a = runnable;
                super();
            }
            }, 500L);
            return;
        } else
        {
            runnable.run();
            return;
        }
    }

    public void a(boolean flag)
    {
        l = flag;
    }

    protected void b()
    {
        if (z)
        {
            return;
        } else
        {
            z = true;
            j.setVisibility(0);
            a = j.animate();
            a.setListener(new AnimatorListenerAdapter() {

                final k a;

                public void onAnimationEnd(Animator animator)
                {
                    k.i(a).setListener(null);
                    k.a(a).setVisibility(4);
                    k.a(a).setImageBitmap(null);
                    k.a(a, false);
                    com.pandora.android.util.s.a(com.pandora.android.activity.k.b(a), 1.0F);
                    if (com.pandora.android.activity.k.j(a))
                    {
                        k.a(a, k.k(a).findViewWithTag("viewExcludedFromHistory"));
                    } else
                    {
                        k.a(a, ((o)com.pandora.android.activity.k.b(a).getAdapter()).e());
                    }
                    a.a(k.l(a));
                }

                public void onAnimationStart(Animator animator)
                {
                    k.a(a, true);
                }

            
            {
                a = k.this;
                super();
            }
            });
            a.setDuration(250L).scaleX(1.0F).scaleY(1.0F).translationX(0.0F).translationY(0.0F);
            g.animate().setDuration(250L).alpha(1.0F);
            h.animate().setDuration(250L).alpha(1.0F);
            i.animate().setDuration(250L).alpha(1.0F);
            k.a(250L);
            return;
        }
    }

    public boolean c()
    {
        return m;
    }

    public boolean d()
    {
        return p;
    }

    public void e()
    {
        Rect rect = k.getBounds();
        int i1 = i.getTop();
        rect = new Rect(rect.left, rect.top, rect.right, i1);
        k.a(rect, 76);
    }

    public void f()
    {
        k.a();
    }
}
