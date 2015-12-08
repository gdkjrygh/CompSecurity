// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import IC;
import IE;
import Jo;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Application;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.snapchat.android.SnapchatApplication;
import com.snapchat.android.ui.cash.ParticleSparkleView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import sh;

public class CashSwiperView extends LinearLayout
{
    public static final class SwipeActivationMethod extends Enum
    {

        private static final SwipeActivationMethod $VALUES[];
        public static final SwipeActivationMethod DOLLARS;
        public static final SwipeActivationMethod HOLD;

        public static SwipeActivationMethod valueOf(String s1)
        {
            return (SwipeActivationMethod)Enum.valueOf(com/snapchat/android/ui/CashSwiperView$SwipeActivationMethod, s1);
        }

        public static SwipeActivationMethod[] values()
        {
            return (SwipeActivationMethod[])$VALUES.clone();
        }

        static 
        {
            DOLLARS = new SwipeActivationMethod("DOLLARS", 0);
            HOLD = new SwipeActivationMethod("HOLD", 1);
            $VALUES = (new SwipeActivationMethod[] {
                DOLLARS, HOLD
            });
        }

        private SwipeActivationMethod(String s1, int i1)
        {
            super(s1, i1);
        }
    }

    public static abstract class a
        implements android.animation.Animator.AnimatorListener
    {

        public void onAnimationCancel(Animator animator)
        {
        }

        public void onAnimationRepeat(Animator animator)
        {
        }

        public void onAnimationStart(Animator animator)
        {
        }

        public a()
        {
        }
    }

    public static interface b
    {

        public abstract void w();

        public abstract void x();

        public abstract void z();
    }

    final class c extends android.view.GestureDetector.SimpleOnGestureListener
    {

        private CashSwiperView a;

        public final boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f1, float f2)
        {
            if (Jo.b(f2, a.getContext()) < -1500F)
            {
                CashSwiperView.a(a, f2);
            }
            return true;
        }

        private c()
        {
            a = CashSwiperView.this;
            super();
        }

        c(byte byte0)
        {
            this();
        }
    }


    public static String a = (new StringBuilder("android.resource://")).append(SnapchatApplication.get().getPackageName()).append('/').append(0x7f070000).toString();
    private Handler A;
    private ParticleSparkleView B;
    private sh C;
    public b b;
    public int c;
    public MediaPlayer d;
    public ValueAnimator e;
    public boolean f;
    public long g;
    private GestureDetector h;
    private View i;
    private View j;
    private float k;
    private TextView l;
    private VelocityTracker m;
    private List n;
    private ViewPropertyAnimator o;
    private ViewPropertyAnimator p;
    private Handler q;
    private boolean r;
    private List s;
    private List t;
    private ViewGroup u;
    private List v;
    private List w;
    private android.animation.ValueAnimator.AnimatorUpdateListener x;
    private Handler y;
    private boolean z;

    public CashSwiperView(Context context)
    {
        super(context);
        C = null;
        a(context);
    }

    public CashSwiperView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        C = null;
        a(context);
    }

    public CashSwiperView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        C = null;
        a(context);
    }

    static View a(CashSwiperView cashswiperview)
    {
        return cashswiperview.i;
    }

    private void a(float f1)
    {
        if (v.contains(i))
        {
            return;
        }
        a(5000);
        q.removeCallbacksAndMessages(null);
        q.postDelayed(new Runnable() {

            private CashSwiperView a;

            public final void run()
            {
                CashSwiperView.f(a);
            }

            
            {
                a = CashSwiperView.this;
                super();
            }
        }, 1000L);
        if (c < 9999)
        {
            c = c + 1;
            f();
            if (c == 1)
            {
                g = SystemClock.elapsedRealtime();
            }
            if (!r)
            {
                n.add(Long.valueOf(SystemClock.elapsedRealtime()));
            }
            if (C == null)
            {
                int i1 = (int)Jo.a(48F, getContext());
                sh.a a1 = new sh.a();
                a1.b = B.getHeight() - i1;
                a1.a = B.getWidth();
                a1.c = (int)Jo.a(125F, getContext()) / 2;
                C = new sh(a1, (byte)0);
                B.b = C;
            }
            if (h() == 1.0F)
            {
                ParticleSparkleView particlesparkleview = B;
                if (!particlesparkleview.c)
                {
                    particlesparkleview.c = true;
                    for (int j1 = 0; j1 < particlesparkleview.a; j1++)
                    {
                        particlesparkleview.a();
                    }

                }
            }
            i.setEnabled(false);
            ObjectAnimator objectanimator = ObjectAnimator.ofFloat(i, "alpha", new float[] {
                0.0F
            });
            float f2 = i.getTranslationY();
            f1 = (300F * Math.min(1.5F * f1, -3000F)) / 1000F;
            ObjectAnimator objectanimator1 = ObjectAnimator.ofFloat(i, "translationY", new float[] {
                f2 + f1
            });
            ObjectAnimator objectanimator2 = ObjectAnimator.ofFloat(j, "scaleX", new float[] {
                1.0F
            });
            ObjectAnimator objectanimator3 = ObjectAnimator.ofFloat(j, "scaleY", new float[] {
                1.0F
            });
            View view = i;
            v.add(view);
            i = j;
            j = j();
            a(j);
            b.w();
            AnimatorSet animatorset = new AnimatorSet();
            animatorset.setDuration(200L);
            animatorset.addListener(new a(view) {

                private View a;
                private CashSwiperView b;

                public final void onAnimationEnd(Animator animator)
                {
                    CashSwiperView.g(b).remove(a);
                    CashSwiperView.a(b, a);
                }

            
            {
                b = CashSwiperView.this;
                a = view;
                super();
            }
            });
            animatorset.playTogether(new Animator[] {
                objectanimator, objectanimator1, objectanimator3, objectanimator2
            });
            animatorset.start();
            return;
        } else
        {
            i.animate().translationY(0.0F).setInterpolator(new DecelerateInterpolator());
            e();
            return;
        }
    }

    private void a(float f1, View view)
    {
        int ai[] = new int[3];
        float f2 = Math.max(f1 - 0.5F, 0.0F);
        for (int i1 = 0; i1 < 3; i1++)
        {
            ai[i1] = (int)((float)(new int[] {
                255, 255, 255
            })[i1] * (1.0F - f2) + (float)(new int[] {
                255, 240, 128
            })[i1] * f2);
        }

        setBackgroundColor(0xf2000000 | ai[0] << 16 | ai[1] << 8 | ai[2]);
        ((ImageView)view.findViewById(0x7f0d028b)).getDrawable().setColorFilter(Jo.a((double)f1 * 1.5203D, 1.0D + 0.51032D * (double)f1));
    }

    private void a(Context context)
    {
        ((LayoutInflater)context.getSystemService("layout_inflater")).inflate(0x7f040027, this, true);
        setOnTouchListener(new android.view.View.OnTouchListener() {

            public final boolean onTouch(View view, MotionEvent motionevent)
            {
                return true;
            }

        });
        B = (ParticleSparkleView)findViewById(0x7f0d011c);
        u = (ViewGroup)findViewById(0x7f0d011a);
        u.setOnTouchListener(new android.view.View.OnTouchListener() {

            private CashSwiperView a;

            public final boolean onTouch(View view, MotionEvent motionevent)
            {
                return CashSwiperView.a(a, motionevent, CashSwiperView.a(a));
            }

            
            {
                a = CashSwiperView.this;
                super();
            }
        });
        w = new ArrayList();
        v = new ArrayList();
        s = new ArrayList();
        t = new ArrayList();
        i = j();
        j = j();
        l = (TextView)findViewById(0x7f0d011b);
        h = new GestureDetector(context, new c((byte)0));
        q = new Handler(Looper.getMainLooper());
        n = new ArrayList();
        m = VelocityTracker.obtain();
        y = new Handler();
        x = new android.animation.ValueAnimator.AnimatorUpdateListener() {

            private CashSwiperView a;

            public final void onAnimationUpdate(ValueAnimator valueanimator)
            {
                float f1 = IE.a((float)Math.log(((Float)valueanimator.getAnimatedValue()).floatValue()));
                if (CashSwiperView.b(a) != null)
                {
                    CashSwiperView.b(a).setVolume(f1, f1);
                }
            }

            
            {
                a = CashSwiperView.this;
                super();
            }
        };
        setEnabled(false);
        A = new Handler(Looper.getMainLooper());
        a(j);
        b(i);
    }

    private void a(View view)
    {
        Jo.c(view);
        view.setTranslationY(0.0F);
        view.setAlpha(1.0F);
        view.setScaleX(0.88F);
        view.setScaleY(0.88F);
        view.setEnabled(true);
        if (!r)
        {
            float f1 = h();
            w.add(Float.valueOf(f1));
            a(f1, view);
        }
    }

    static void a(CashSwiperView cashswiperview, float f1)
    {
        cashswiperview.a(f1);
    }

    static void a(CashSwiperView cashswiperview, View view)
    {
        view.setVisibility(8);
        cashswiperview.s.add(view);
        cashswiperview.t.remove(view);
    }

    private void a(String s1)
    {
        if (!z)
        {
            l.setText(s1);
            return;
        } else
        {
            AnimatorSet animatorset = new AnimatorSet();
            ObjectAnimator objectanimator = ObjectAnimator.ofFloat(l, ALPHA, new float[] {
                0.0F
            });
            objectanimator.setDuration(100L);
            objectanimator.addListener(new a(s1) {

                private String a;
                private CashSwiperView b;

                public final void onAnimationEnd(Animator animator)
                {
                    CashSwiperView.e(b).setText(a);
                }

            
            {
                b = CashSwiperView.this;
                a = s1;
                super();
            }
            });
            s1 = ObjectAnimator.ofFloat(l, ALPHA, new float[] {
                1.0F
            });
            s1.setDuration(100L);
            animatorset.playSequentially(new Animator[] {
                objectanimator, s1
            });
            animatorset.start();
            return;
        }
    }

    static boolean a(CashSwiperView cashswiperview, MotionEvent motionevent, View view)
    {
        Rect rect;
        if (!cashswiperview.z)
        {
            return false;
        }
        rect = new Rect();
        view.getGlobalVisibleRect(rect);
        if (motionevent.getActionMasked() == 0 && !rect.contains((int)motionevent.getX(), (int)motionevent.getY())) goto _L2; else goto _L1
_L1:
        float f1;
        boolean flag;
        if (cashswiperview.o != null)
        {
            cashswiperview.o.cancel();
            cashswiperview.p.cancel();
        }
        if (motionevent.getActionMasked() == 0)
        {
            cashswiperview.k = motionevent.getY(0) - view.getTranslationY();
        }
        f1 = motionevent.getY(0) - cashswiperview.k;
        if (motionevent.getActionMasked() == 2)
        {
            if (f1 >= 0.0F)
            {
                cashswiperview.j.setTranslationY(f1);
                cashswiperview.setAlpha(Math.max(0.0F, 1.0F - f1 / (float)(cashswiperview.getHeight() / 2)));
            } else
            {
                cashswiperview.setAlpha(1.0F);
            }
            view.setTranslationY(f1);
        }
        if (motionevent.getActionMasked() == 6)
        {
            if (motionevent.getActionIndex() == 0)
            {
                cashswiperview.k = motionevent.getY(1) - view.getTranslationY();
            }
            return true;
        }
        cashswiperview.m.addMovement(motionevent);
        cashswiperview.h.onTouchEvent(motionevent);
        flag = cashswiperview.v.contains(view);
        if (motionevent.getActionMasked() != 1) goto _L2; else goto _L3
_L3:
        f1 = Jo.b(f1, cashswiperview.getContext());
        if (f1 >= -150F) goto _L5; else goto _L4
_L4:
        if (!flag)
        {
            cashswiperview.m.computeCurrentVelocity(1000);
            cashswiperview.a(cashswiperview.m.getYVelocity());
        }
_L7:
        if (!flag)
        {
            cashswiperview.a(0);
        }
        cashswiperview.m.clear();
_L2:
        return true;
_L5:
        if (f1 > 150F)
        {
            if (!flag)
            {
                cashswiperview.m.computeCurrentVelocity(1000);
                cashswiperview.b();
            }
        } else
        {
            if (!cashswiperview.v.contains(view))
            {
                cashswiperview.o = cashswiperview.i.animate().translationY(0.0F).setInterpolator(new DecelerateInterpolator());
                cashswiperview.p = cashswiperview.j.animate().translationY(0.0F).setInterpolator(new DecelerateInterpolator());
            }
            cashswiperview.e();
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    static MediaPlayer b(CashSwiperView cashswiperview)
    {
        return cashswiperview.d;
    }

    private void b(View view)
    {
        u.bringChildToFront(view);
        view.setEnabled(true);
        view.setTranslationY(0.0F);
        view.setAlpha(1.0F);
        view.setScaleX(1.0F);
        view.setScaleY(1.0F);
    }

    static List c(CashSwiperView cashswiperview)
    {
        return cashswiperview.w;
    }

    static float d()
    {
        return 0.0F;
    }

    static boolean d(CashSwiperView cashswiperview)
    {
        cashswiperview.r = false;
        return false;
    }

    static TextView e(CashSwiperView cashswiperview)
    {
        return cashswiperview.l;
    }

    private void e()
    {
        float f1 = getAlpha();
        if (f1 != 1.0F)
        {
            animate().alpha(1.0F).setListener(null).setDuration((int)(f1 * 500F)).start();
        }
    }

    private void f()
    {
        if (c == 0)
        {
            g();
            return;
        } else
        {
            a(IC.a(null, 0x7f0802c3, new Object[] {
                String.valueOf(c)
            }));
            return;
        }
    }

    static void f(CashSwiperView cashswiperview)
    {
        if (!cashswiperview.r)
        {
            cashswiperview.r = true;
            cashswiperview.n.clear();
            ObjectAnimator objectanimator = ObjectAnimator.ofFloat(cashswiperview, "coolness", new float[] {
                1.0F
            });
            objectanimator.setInterpolator(new DecelerateInterpolator());
            objectanimator.setDuration(1000L);
            objectanimator.addListener(cashswiperview. new a() {

                private CashSwiperView a;

                public final void onAnimationEnd(Animator animator)
                {
                    CashSwiperView.c(a).clear();
                    CashSwiperView.d(a);
                    CashSwiperView.d();
                }

            
            {
                a = CashSwiperView.this;
                super();
            }
            });
            cashswiperview.B.c = false;
            objectanimator.start();
        }
    }

    static List g(CashSwiperView cashswiperview)
    {
        return cashswiperview.v;
    }

    private void g()
    {
        a(IC.a(null, 0x7f0802c5, new Object[0]));
    }

    private float h()
    {
        long l1 = SystemClock.elapsedRealtime();
        Iterator iterator = n.iterator();
        int i1 = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (((Long)iterator.next()).longValue() > l1 - 5000L)
            {
                i1++;
            }
        } while (true);
        return Math.min((float)i1 / 15F, 1.0F);
    }

    static void h(CashSwiperView cashswiperview)
    {
        cashswiperview.a(IC.a(null, 0x7f0802c4, new Object[0]));
    }

    private void i()
    {
        float f1 = 2.718282F;
        if (e != null)
        {
            f1 = ((Float)e.getAnimatedValue()).floatValue();
            e.cancel();
        }
        e = ValueAnimator.ofFloat(new float[] {
            f1, 1.0F
        });
        e.addUpdateListener(x);
        e.setDuration(500L);
    }

    static void i(CashSwiperView cashswiperview)
    {
        cashswiperview.f();
    }

    static Handler j(CashSwiperView cashswiperview)
    {
        return cashswiperview.A;
    }

    private View j()
    {
        if (s.isEmpty())
        {
            ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f040067, u);
            s.add(u.getChildAt(u.getChildCount() - 1));
        }
        View view = (View)s.get(0);
        view.setVisibility(0);
        t.add(view);
        s.remove(view);
        return view;
    }

    static b k(CashSwiperView cashswiperview)
    {
        return cashswiperview.b;
    }

    static void l(CashSwiperView cashswiperview)
    {
        cashswiperview.setUpFadeInAudio();
    }

    static ValueAnimator m(CashSwiperView cashswiperview)
    {
        return cashswiperview.e;
    }

    static void n(CashSwiperView cashswiperview)
    {
        int i1;
        if (cashswiperview.d.getCurrentPosition() > cashswiperview.d.getDuration() / 2)
        {
            i1 = cashswiperview.d.getCurrentPosition() - cashswiperview.d.getDuration();
        } else
        {
            i1 = cashswiperview.d.getCurrentPosition();
        }
        cashswiperview.y.postDelayed(cashswiperview. new Runnable() {

            final CashSwiperView a;

            public final void run()
            {
                if (!CashSwiperView.o(a))
                {
                    CashSwiperView.p(a);
                    CashSwiperView.m(a).start();
                    CashSwiperView.m(a).addListener(new a(this) {

                        private _cls3 a;

                        public final void onAnimationEnd(Animator animator)
                        {
                            if (!CashSwiperView.o(a.a))
                            {
                                CashSwiperView.n(a.a);
                                CashSwiperView.l(a.a);
                                CashSwiperView.m(a.a).start();
                            }
                        }

            
            {
                a = _pcls3;
                super();
            }
                    });
                }
            }

            
            {
                a = CashSwiperView.this;
                super();
            }
        }, cashswiperview.d.getDuration() - 500 - i1);
    }

    static boolean o(CashSwiperView cashswiperview)
    {
        return cashswiperview.f;
    }

    static void p(CashSwiperView cashswiperview)
    {
        cashswiperview.i();
    }

    static MediaPlayer q(CashSwiperView cashswiperview)
    {
        cashswiperview.d = null;
        return null;
    }

    static boolean r(CashSwiperView cashswiperview)
    {
        cashswiperview.f = false;
        return false;
    }

    public final void a()
    {
        v.clear();
        n.clear();
        w.clear();
        b(i);
        a(j);
        c = 0;
        g();
    }

    public final void a(int i1)
    {
        A.removeCallbacksAndMessages(null);
        Runnable runnable = new Runnable() {

            final CashSwiperView a;

            public final void run()
            {
                CashSwiperView.h(a);
                CashSwiperView.j(a).postDelayed(new Runnable(this) {

                    private _cls11 a;

                    public final void run()
                    {
                        CashSwiperView.i(a.a);
                    }

            
            {
                a = _pcls11;
                super();
            }
                }, 3000L);
            }

            
            {
                a = CashSwiperView.this;
                super();
            }
        };
        if (i1 == 0)
        {
            A.post(runnable);
            return;
        } else
        {
            A.postDelayed(runnable, i1);
            return;
        }
    }

    public final void b()
    {
        setEnabled(false);
        b.z();
        AnimatorSet animatorset = new AnimatorSet();
        float f1 = i.getTranslationY() + (750F * m.getYVelocity()) / 1000F;
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(this, ALPHA, new float[] {
            0.0F
        });
        ObjectAnimator objectanimator1 = ObjectAnimator.ofFloat(i, TRANSLATION_Y, new float[] {
            f1
        });
        ObjectAnimator objectanimator2 = ObjectAnimator.ofFloat(j, TRANSLATION_Y, new float[] {
            f1
        });
        animatorset.setDuration((int)(500F * getAlpha()));
        animatorset.addListener(new a() {

            private CashSwiperView a;

            public final void onAnimationEnd(Animator animator)
            {
                a.setVisibility(8);
                a.a();
                CashSwiperView.k(a).x();
            }

            
            {
                a = CashSwiperView.this;
                super();
            }
        });
        animatorset.playTogether(new Animator[] {
            objectanimator, objectanimator1, objectanimator2
        });
        animatorset.start();
        c();
    }

    public final void c()
    {
        f = true;
        y.removeCallbacksAndMessages(null);
        i();
        e.addListener(new a() {

            private CashSwiperView a;

            public final void onAnimationEnd(Animator animator)
            {
                if (CashSwiperView.b(a) != null && CashSwiperView.o(a))
                {
                    CashSwiperView.b(a).stop();
                    CashSwiperView.b(a).release();
                    CashSwiperView.q(a);
                }
                CashSwiperView.r(a);
            }

            
            {
                a = CashSwiperView.this;
                super();
            }
        });
        e.start();
    }

    public void setCoolness(float f1)
    {
        Iterator iterator;
        if (w.size() < 2)
        {
            f1 = 0.0F;
        } else
        {
            f1 = ((Float)w.get(w.size() - 2)).floatValue() * (1.0F - f1);
        }
        for (iterator = t.iterator(); iterator.hasNext(); a(f1, (View)iterator.next())) { }
    }

    public void setEnabled(boolean flag)
    {
        super.setEnabled(flag);
        z = flag;
    }

    public void setListener(b b1)
    {
        b = b1;
    }

    public void setSwipeTimes(List list)
    {
        n = new ArrayList(list);
    }

    public void setUpFadeInAudio()
    {
        float f1 = 1.0F;
        if (e != null)
        {
            f1 = ((Float)e.getAnimatedValue()).floatValue();
            e.cancel();
        }
        e = ValueAnimator.ofFloat(new float[] {
            f1, 2.718282F
        });
        e.addUpdateListener(x);
        e.setDuration(500L);
    }


    // Unreferenced inner class com/snapchat/android/ui/CashSwiperView$2

/* anonymous class */
    public final class _cls2
        implements android.media.MediaPlayer.OnPreparedListener
    {

        private CashSwiperView a;

        public final void onPrepared(MediaPlayer mediaplayer)
        {
            CashSwiperView.l(a);
            CashSwiperView.m(a).start();
            if (CashSwiperView.b(a) != null)
            {
                CashSwiperView.b(a).start();
                if (CashSwiperView.b(a).getDuration() > 5000)
                {
                    CashSwiperView.n(a);
                }
            }
        }

            public 
            {
                a = CashSwiperView.this;
                super();
            }
    }

}
