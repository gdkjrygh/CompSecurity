// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import com.microsoft.advertising.android.a.e;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

// Referenced classes of package com.microsoft.advertising.android:
//            r, av, b, af, 
//            g, ai, ag, f, 
//            AdViewFactory, ao, AdControl, d, 
//            ab, bx, ae, e

final class j extends FrameLayout
    implements b.a
{

    Runnable a;
    private Handler b;
    private Timer c;
    private b d;
    private b e;
    private Animation f;
    private Animation g;
    private AdControl h;
    private AlertDialog i;
    private final ViewGroup j = this;
    private g k;
    private final r l;

    public j(Context context, AdControl adcontrol, g g1)
    {
        super(context);
        b = new Handler();
        c = new Timer();
        d = null;
        e = null;
        a = new Runnable() {

            final j a;

            public final void run()
            {
                if (j.a(a) != null)
                {
                    j.a(a).j();
                }
                j.b(a).postDelayed(this, ab.a().a("DEFAULT_VIEWABLE_CHANGE_TIMER_MS"));
            }

            
            {
                a = j.this;
                super();
            }
        };
        h = adcontrol;
        k = g1;
        l = new r(context, adcontrol, g1);
        setBackgroundColor(0);
        f = new TranslateAnimation(1, 0.0F, 1, 0.0F, 1, -1F, 1, 0.0F);
        f.setDuration(900L);
        f.setFillAfter(true);
        g = new TranslateAnimation(1, 0.0F, 1, 0.0F, 1, 0.0F, 1, 1.0F);
        g.setDuration(900L);
        g.setFillAfter(true);
        f.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

            final j a;

            static j a(_cls2 _pcls2)
            {
                return _pcls2.a;
            }

            public final void onAnimationEnd(Animation animation)
            {
                av.a("AdLayoutVector", "new ad animation end");
                j.b(a).post(new Runnable(this) {

                    final _cls2 a;

                    public final void run()
                    {
                        if (j.c(_cls2.a(a)) == null)
                        {
                            return;
                        }
                        if (j.a(_cls2.a(a)) != null)
                        {
                            j.a(_cls2.a(a)).t();
                            j.d(_cls2.a(a)).removeView(j.a(_cls2.a(a)));
                        }
                        j.a(_cls2.a(a), j.c(_cls2.a(a)));
                        com.microsoft.advertising.android.j.e(_cls2.a(a));
                        j.f(_cls2.a(a)).c().a(j.f(_cls2.a(a)), ae.c);
                        j.f(_cls2.a(a)).b(new Runnable(this) {

                            final _cls1 a;

                            public final void run()
                            {
                                j.a(_cls2.a(a.a)).u();
                            }

            
            {
                a = _pcls1;
                super();
            }
                        });
                    }

            
            {
                a = _pcls2;
                super();
            }
                });
            }

            public final void onAnimationRepeat(Animation animation)
            {
            }

            public final void onAnimationStart(Animation animation)
            {
                av.a("AdLayoutVector", "new ad animation start");
            }

            
            {
                a = j.this;
                super();
            }
        });
        c.scheduleAtFixedRate(new TimerTask() {

            final j a;

            static j a(_cls3 _pcls3)
            {
                return _pcls3.a;
            }

            public final void run()
            {
                j.b(a).post(new Runnable(this) {

                    final _cls3 a;

                    public final void run()
                    {
                        if (j.a(_cls3.a(a)) != null)
                        {
                            j.a(_cls3.a(a)).b();
                        }
                    }

            
            {
                a = _pcls3;
                super();
            }
                });
            }

            
            {
                a = j.this;
                super();
            }
        }, 1000L, 1000L);
    }

    static b a(j j1)
    {
        return j1.d;
    }

    static void a(j j1, AlertDialog alertdialog)
    {
        j1.i = alertdialog;
    }

    static void a(j j1, b b1)
    {
        j1.d = b1;
    }

    static Handler b(j j1)
    {
        return j1.b;
    }

    static b c(j j1)
    {
        return j1.e;
    }

    static ViewGroup d(j j1)
    {
        return j1.j;
    }

    static void e(j j1)
    {
        j1.e = null;
    }

    static g f(j j1)
    {
        return j1.k;
    }

    static Animation g(j j1)
    {
        return j1.g;
    }

    static Animation h(j j1)
    {
        return j1.f;
    }

    static AlertDialog i(j j1)
    {
        return j1.i;
    }

    private void k()
    {
        av.a("AdLayoutVector", "startAnimation()");
        b.post(new Runnable() {

            final j a;

            public final void run()
            {
                if (j.c(a) == null)
                {
                    return;
                }
                j.c(a).setVisibility(0);
                if (j.a(a) != null)
                {
                    j.a(a).c();
                    j.a(a).f_();
                    j.a(a).startAnimation(j.g(a));
                }
                j.c(a).startAnimation(j.h(a));
                av.a("AdLayoutVector", "slide animation(s) started");
            }

            
            {
                a = j.this;
                super();
            }
        });
    }

    public final void a(b b1)
    {
        av.a("AdLayoutVector", "addBanner(AbstractAdView)");
        if (e != null)
        {
            j.removeView(e);
            e = null;
        }
        e = b1;
        b1.setVisibility(4);
        boolean flag;
        if (a())
        {
            flag = false;
        } else
        {
            flag = true;
        }
        af.a(flag, "");
        j.addView(b1);
        k.b(b1.p());
        requestLayout();
        if (b1.n())
        {
            av.a("AdLayoutVector", "ad view is finished loading");
            k();
        } else
        {
            av.a("AdLayoutVector", "ad view is not finished loading");
            b1.setAdLoadedListener(this);
        }
        e.k();
    }

    public final void a(b b1, String s, int i1)
    {
        e = null;
        k.c().a((new StringBuilder("unable to display ad (")).append(i1).append(")").toString(), e.g);
    }

    public final void a(d d1)
    {
        av.a("AdLayoutVector", "onAdLoaded()");
        k();
    }

    public final void a(String s)
    {
        k.c().a(s, e.g);
    }

    public final boolean a()
    {
        return e == null && d == null;
    }

    public final boolean a(boolean flag)
    {
        if (e != null)
        {
            return true;
        }
        if (d == null)
        {
            return false;
        } else
        {
            return d.a(flag);
        }
    }

    public final Long b()
    {
        if (e != null || d == null)
        {
            return null;
        } else
        {
            return Long.valueOf(d.l());
        }
    }

    public final void b(d d1)
    {
        av.a("AdLayoutVector", "addBanner(Ad)");
        b b1 = ag.a().c().getAdLayout(d1, getContext(), h, k, k.b().d());
        if (b1.a(d1, this))
        {
            a(b1);
            return;
        } else
        {
            af.a(false);
            return;
        }
    }

    public final void b(boolean flag)
    {
        if (flag)
        {
            b.removeCallbacks(a);
            b.post(a);
            return;
        } else
        {
            b.removeCallbacks(a);
            return;
        }
    }

    public final void c()
    {
        if (d != null || e != null)
        {
            b(false);
        }
        if (d != null)
        {
            d.f_();
        }
        if (e != null)
        {
            e.f_();
        }
    }

    public final boolean c(d d1)
    {
        if (!k.q())
        {
            if (d1 == null || !(d1 instanceof ao))
            {
                return false;
            }
            d1 = ((ao)d1).g();
            if (d1 != null && d1.size() > 0)
            {
                k.a(com.microsoft.advertising.android.a.b.a.c);
                b.post(new Runnable(d1) {

                    final j a;
                    private final List b;

                    static j a(_cls5 _pcls5)
                    {
                        return _pcls5.a;
                    }

                    public final void run()
                    {
                        if (b.size() == 1)
                        {
                            ((com.microsoft.advertising.android.e)b.get(0)).a(a.getContext());
                            j.f(a).l();
                        } else
                        if (b.size() > 1)
                        {
                            CharSequence acharsequence[] = new CharSequence[b.size()];
                            int i1 = 0;
                            do
                            {
                                if (i1 >= b.size())
                                {
                                    android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(a.getContext());
                                    builder.setTitle("Advertisement");
                                    builder.setCancelable(true);
                                    builder.setItems(acharsequence, new android.content.DialogInterface.OnClickListener(this, b) {

                                        final _cls5 a;
                                        private final List b;

                                        public final void onClick(DialogInterface dialoginterface, int i1)
                                        {
                                            ((com.microsoft.advertising.android.e)b.get(i1)).a(_cls5.a(a).getContext());
                                        }

            
            {
                a = _pcls5;
                b = list;
                super();
            }
                                    });
                                    builder.setOnCancelListener(new android.content.DialogInterface.OnCancelListener(this) {

                                        final _cls5 a;

                                        public final void onCancel(DialogInterface dialoginterface)
                                        {
                                        }

            
            {
                a = _pcls5;
                super();
            }
                                    });
                                    j.a(a, builder.show());
                                    j.i(a).setCanceledOnTouchOutside(false);
                                    return;
                                }
                                acharsequence[i1] = ((com.microsoft.advertising.android.e)b.get(i1)).toString();
                                i1++;
                            } while (true);
                        }
                    }

            
            {
                a = j.this;
                b = list;
                super();
            }
                });
                return true;
            }
        }
        return true;
    }

    public final void d()
    {
        if (d != null || e != null)
        {
            b(true);
        }
        if (d != null)
        {
            d.f();
        }
        if (e != null)
        {
            e.f();
        }
    }

    public final boolean e()
    {
        if (i != null && i.isShowing())
        {
            return true;
        }
        if (d != null)
        {
            return d.i();
        } else
        {
            return false;
        }
    }

    protected final void f()
    {
        b.removeCallbacksAndMessages(null);
        l.b();
        if (d != null)
        {
            d.t();
        }
        if (e != null)
        {
            e.t();
        }
        e = null;
        d = null;
        c = null;
        g = null;
        f = null;
    }

    public final boolean g()
    {
        return d != null && d.a();
    }

    public final void h()
    {
        if (g())
        {
            d.c();
        }
    }

    protected final r i()
    {
        return l;
    }

    final b j()
    {
        return d;
    }

    protected final void onAttachedToWindow()
    {
        b(true);
    }

    protected final void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        h();
        b.removeCallbacksAndMessages(null);
        if (c != null)
        {
            c.cancel();
        }
        if (e != null)
        {
            if (d != null)
            {
                d.t();
                j.removeView(d);
            }
            d = e;
        }
        e = null;
    }
}
