// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.tinkerbell;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import com.google.common.base.Optional;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import ctz;
import dmz;
import fjo;
import fjp;
import fjs;
import fjt;
import fka;
import fop;
import gjg;

// Referenced classes of package com.spotify.mobile.android.spotlets.tinkerbell:
//            Onboarding

public class TooltipContainer extends FrameLayout
{

    public final fjo a;
    public boolean b;
    public View c;
    public Onboarding.Type d;
    public AbsListView e;
    public ViewGroup f;
    public Optional g;
    public AnimatorSet h;
    public gjg i = new gjg() {

        private TooltipContainer b;

        public final void a(int j1)
        {
            TooltipContainer tooltipcontainer = b;
            if (tooltipcontainer.c == null || tooltipcontainer.b)
            {
                return;
            }
            if (!tooltipcontainer.a(tooltipcontainer.c))
            {
                tooltipcontainer.a();
                return;
            } else
            {
                tooltipcontainer.a.offsetTopAndBottom(j1);
                return;
            }
        }

        public final void onScrollStateChanged(AbsListView abslistview, int j1)
        {
            if (j1 == 0)
            {
                TooltipContainer.e(b);
            }
        }

            
            {
                b = TooltipContainer.this;
                super();
            }
    };
    public android.view.View.OnAttachStateChangeListener j = new android.view.View.OnAttachStateChangeListener() {

        private TooltipContainer a;

        public final void onViewAttachedToWindow(View view)
        {
        }

        public final void onViewDetachedFromWindow(View view)
        {
            a.a(com.spotify.mobile.android.util.ClientEvent.Event.S, com.spotify.mobile.android.util.ClientEvent.SubEvent.ba);
            a.dismiss();
        }

            
            {
                a = TooltipContainer.this;
                super();
            }
    };
    private final int k;
    private final int l;
    private MotionEvent m;
    private boolean n;
    private boolean o;
    private Context p;

    public TooltipContainer(Context context)
    {
        this(context, null, 0);
    }

    public TooltipContainer(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public TooltipContainer(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        dmz.a(fop);
        b = true;
        g = Optional.e();
        p = context;
        k = context.getResources().getDimensionPixelOffset(0x7f0c015e);
        l = ViewConfiguration.get(context).getScaledTouchSlop();
        a = new fjo(context);
        context = a;
        addView(context, -1, -2);
        context.a(true);
    }

    static View a(TooltipContainer tooltipcontainer)
    {
        return tooltipcontainer.c;
    }

    public static TooltipContainer a(Activity activity)
    {
        ctz.a(activity);
        activity = activity.findViewById(0x7f110409);
        ctz.a(activity);
        return (TooltipContainer)activity;
    }

    static void a(TooltipContainer tooltipcontainer, View view)
    {
        tooltipcontainer.b(view);
    }

    static void b(TooltipContainer tooltipcontainer)
    {
        if (tooltipcontainer.d != null)
        {
            Onboarding.a(tooltipcontainer.d).a(tooltipcontainer.p);
        }
        tooltipcontainer.a(com.spotify.mobile.android.util.ClientEvent.Event.O, com.spotify.mobile.android.util.ClientEvent.SubEvent.bb);
        tooltipcontainer.dismiss();
    }

    public static int c(View view)
    {
        int ai[] = new int[2];
        view.getLocationOnScreen(ai);
        return ai[1];
    }

    static AnimatorSet c(TooltipContainer tooltipcontainer)
    {
        tooltipcontainer.h = null;
        return null;
    }

    private int d(View view)
    {
        return e(view).x + view.getWidth() / 2 + e(this).x;
    }

    static fjo d(TooltipContainer tooltipcontainer)
    {
        return tooltipcontainer.a;
    }

    private static Point e(View view)
    {
        int ai[] = new int[2];
        view.getLocationOnScreen(ai);
        return new Point(ai[0], ai[1]);
    }

    static void e(TooltipContainer tooltipcontainer)
    {
        if (tooltipcontainer.c == null || tooltipcontainer.b)
        {
            return;
        }
        View view = tooltipcontainer.c;
        int i1 = c(view);
        int j1 = c(tooltipcontainer);
        if (tooltipcontainer.a.l)
        {
            tooltipcontainer.a.setY(i1 - j1 - tooltipcontainer.a.getHeight() - tooltipcontainer.k);
        } else
        {
            tooltipcontainer.a.setY((i1 - j1) + view.getHeight() + tooltipcontainer.k);
        }
        tooltipcontainer.a.k = tooltipcontainer.d(view);
    }

    public final void a()
    {
        b();
        b = true;
        a.a(true);
    }

    public final void a(com.spotify.mobile.android.util.ClientEvent.Event event, com.spotify.mobile.android.util.ClientEvent.SubEvent subevent)
    {
        event = new ClientEvent(event, subevent);
        if (d != null)
        {
            event.a("name", Onboarding.a(d).a());
        }
        fop.a(getContext(), ViewUri.aY, event);
        event.toString();
    }

    public final boolean a(View view)
    {
        int j1 = c(this);
        int k1 = getMeasuredHeight();
        int i1 = c(view);
        int l1 = view.getMeasuredHeight();
        int i2 = a.getMeasuredHeight() / 2;
        if (a.l)
        {
            i1 -= i2;
        } else
        {
            i1 = i1 + l1 + i2;
        }
        return i1 >= j1 && i1 <= j1 + k1;
    }

    public final void b()
    {
        if (e != null)
        {
            e.setOnScrollListener(null);
            e = null;
        }
        if (c != null)
        {
            c.removeOnAttachStateChangeListener(j);
            c = null;
        }
        if (m != null)
        {
            m.recycle();
            m = null;
        }
        f = null;
        i.a = false;
    }

    public final void b(View view)
    {
        int i1 = c(view);
        int j1 = c(this);
        int k1 = i1 - j1;
        if (k1 < getMeasuredHeight() - k1 - view.getHeight())
        {
            a.b(false);
            int l1 = view.getHeight();
            int i2 = k;
            a.setY(Math.max((i1 - j1) + l1 + i2, 0));
        } else
        {
            a.b(true);
            a.setY(i1 - j1 - a.getHeight() - k);
        }
        a.k = d(view);
    }

    public final boolean c()
    {
        return !b;
    }

    public void dismiss()
    {
        b();
        if (b)
        {
            return;
        }
        b = true;
        a.a = new fjp() {

            private TooltipContainer a;

            public final void a()
            {
                TooltipContainer.c(a);
                TooltipContainer.d(a).a(true);
                TooltipContainer.d(a).a = null;
            }

            
            {
                a = TooltipContainer.this;
                super();
            }
        };
        fjo fjo1 = a;
        ValueAnimator valueanimator = ValueAnimator.ofFloat(new float[] {
            1.0F, 0.0F
        });
        valueanimator.setDuration(300L);
        valueanimator.addUpdateListener(new fjo._cls7(fjo1));
        ValueAnimator valueanimator1 = ValueAnimator.ofFloat(new float[] {
            (float)fjo1.j * (1.0F - fjo1.i), (float)fjo1.j
        });
        valueanimator1.setInterpolator(new DecelerateInterpolator());
        valueanimator1.setDuration(200L);
        valueanimator1.setStartDelay(100L);
        valueanimator1.addUpdateListener(new fjo._cls8(fjo1));
        ValueAnimator valueanimator2 = ValueAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[] {
            PropertyValuesHolder.ofKeyframe("", new Keyframe[] {
                Keyframe.ofFloat(0.0F, (float)fjo1.j * (1.0F - fjo1.i)), Keyframe.ofFloat(0.1666667F, 0.0F), Keyframe.ofFloat(1.0F, fjo1.j)
            })
        });
        valueanimator2.setDuration(300L);
        valueanimator2.addUpdateListener(new fjo._cls9(fjo1));
        ValueAnimator valueanimator3 = ValueAnimator.ofFloat(new float[] {
            (float)fjo1.j, 0.0F
        });
        valueanimator3.setDuration(100L);
        valueanimator3.setStartDelay(50L);
        valueanimator3.addUpdateListener(new fjo._cls10(fjo1));
        Object obj = PropertyValuesHolder.ofFloat(View.ALPHA, new float[] {
            1.0F, 0.0F
        });
        Object obj1 = PropertyValuesHolder.ofFloat(View.SCALE_X, new float[] {
            1.0F, 0.5F
        });
        Object obj2 = PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[] {
            1.0F, 0.25F
        });
        obj2 = ObjectAnimator.ofPropertyValuesHolder(fjo1.n, new PropertyValuesHolder[] {
            obj, obj1, obj2
        });
        ((ValueAnimator) (obj2)).setDuration(100L);
        ((ValueAnimator) (obj2)).setStartDelay(100L);
        obj1 = new AnimatorSet();
        obj = Optional.e();
        if (fjo1.m.b())
        {
            obj = ((fjs)fjo1.m.c()).b();
        }
        if (((Optional) (obj)).b())
        {
            obj = (Animator)((Optional) (obj)).c();
            long l2 = ((Animator) (obj)).getDuration();
            long l1 = ((Animator) (obj)).getStartDelay();
            l2 += l1;
            if (l2 > 200L)
            {
                double d1 = (double)l1 / (double)l2;
                ((Animator) (obj)).setStartDelay(Math.min(100L, (long)(d1 * 200D)));
                ((Animator) (obj)).setDuration((long)(200D * (1.0D - d1)));
            }
            ((AnimatorSet) (obj1)).playTogether(new Animator[] {
                valueanimator, valueanimator1, valueanimator2, valueanimator3, obj
            });
        } else
        {
            ((AnimatorSet) (obj1)).playTogether(new Animator[] {
                valueanimator, valueanimator1, valueanimator2, valueanimator3, obj2
            });
        }
        ((AnimatorSet) (obj1)).addListener(new fjo._cls2(fjo1));
        ((AnimatorSet) (obj1)).start();
        h = ((AnimatorSet) (obj1));
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        if (b)
        {
            return super.onInterceptTouchEvent(motionevent);
        }
        motionevent.getAction();
        JVM INSTR tableswitch 0 2: default 44
    //                   0 50
    //                   1 44
    //                   2 61;
           goto _L1 _L2 _L1 _L3
_L1:
        return super.onInterceptTouchEvent(motionevent);
_L2:
        m = MotionEvent.obtain(motionevent);
        continue; /* Loop/switch isn't completed */
_L3:
        boolean flag;
        if (m != null && Math.abs(m.getY() - motionevent.getY()) > (float)l)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            n = true;
            o = true;
            return true;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        j1 = a.getTop();
        k1 = a.getMeasuredHeight();
        l1 = a.getMeasuredWidth();
        a.layout(i1, j1, l1 + i1, k1 + j1);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        int i1 = motionevent.getAction();
        if (i1 == 1 || i1 == 3)
        {
            n = false;
            o = false;
            if (m != null)
            {
                m.recycle();
                m = null;
            }
        }
        if (o && f != null && m != null)
        {
            o = false;
            f.dispatchTouchEvent(m);
            m.recycle();
            m = null;
        }
        if (n && f != null)
        {
            return f.dispatchTouchEvent(motionevent);
        } else
        {
            return super.onTouchEvent(motionevent);
        }
    }

    // Unreferenced inner class com/spotify/mobile/android/spotlets/tinkerbell/TooltipContainer$1

/* anonymous class */
    public final class _cls1
        implements Runnable
    {

        private TooltipContainer a;

        public final void run()
        {
            TooltipContainer.a(a, TooltipContainer.a(a));
            fjo fjo1 = a.a;
            Object obj = new Rect();
            fjo1.getDrawingRect(((Rect) (obj)));
            int i1 = ((Rect) (obj)).bottom - ((Rect) (obj)).top;
            fjo1.j = i1 / 2;
            fjo1.b = (((Rect) (obj)).left + ((Rect) (obj)).right) / 2;
            if (fjo1.k > 0)
            {
                fjo1.b = fjo1.k;
            }
            fjo1.c = (((Rect) (obj)).top + ((Rect) (obj)).bottom) / 2;
            fjo1.d = ((Rect) (obj)).left;
            fjo1.e = ((Rect) (obj)).top;
            fjo1.f = ((Rect) (obj)).right;
            fjo1.g = ((Rect) (obj)).bottom;
            fjo1.i = (float)(i1 - fjo1.h * 2) / (float)i1;
            fjo1.setVisibility(0);
            ValueAnimator valueanimator = ValueAnimator.ofFloat(new float[] {
                0.0F, 1.0F
            });
            valueanimator.setDuration(300L);
            valueanimator.addUpdateListener(new fjo._cls1(fjo1));
            ValueAnimator valueanimator1 = ValueAnimator.ofFloat(new float[] {
                (float)fjo1.j, (float)fjo1.j * (1.0F - fjo1.i)
            });
            valueanimator1.setInterpolator(new DecelerateInterpolator());
            valueanimator1.setDuration(150L);
            valueanimator1.addUpdateListener(new fjo._cls3(fjo1));
            ValueAnimator valueanimator2 = ValueAnimator.ofFloat(new float[] {
                (float)fjo1.j, 0.0F, (float)fjo1.j * (1.0F - fjo1.i)
            });
            valueanimator2.setDuration(250L);
            valueanimator2.setStartDelay(50L);
            valueanimator2.setInterpolator(new AccelerateInterpolator());
            valueanimator2.addUpdateListener(new fjo._cls4(fjo1));
            ValueAnimator valueanimator3 = ValueAnimator.ofFloat(new float[] {
                0.0F, (float)fjo1.j
            });
            valueanimator3.setDuration(200L);
            valueanimator3.setStartDelay(100L);
            valueanimator3.addUpdateListener(new fjo._cls5(fjo1));
            obj = PropertyValuesHolder.ofFloat(View.ALPHA, new float[] {
                0.0F, 1.0F
            });
            Object obj1 = PropertyValuesHolder.ofFloat(View.SCALE_X, new float[] {
                0.5F, 1.0F
            });
            Object obj2 = PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[] {
                0.25F, 1.0F
            });
            obj2 = ObjectAnimator.ofPropertyValuesHolder(fjo1.n, new PropertyValuesHolder[] {
                obj, obj1, obj2
            });
            ((ValueAnimator) (obj2)).setDuration(200L);
            ((ValueAnimator) (obj2)).setStartDelay(50L);
            obj1 = new AnimatorSet();
            ((AnimatorSet) (obj1)).addListener(new fjo._cls6(fjo1));
            obj = Optional.e();
            if (fjo1.m.b())
            {
                obj = ((fjs)fjo1.m.c()).a();
            }
            if (((Optional) (obj)).b())
            {
                obj = (Animator)((Optional) (obj)).c();
                if (((Animator) (obj)).getStartDelay() < 50L)
                {
                    ((Animator) (obj)).setStartDelay(50L);
                }
                ((AnimatorSet) (obj1)).playTogether(new Animator[] {
                    valueanimator, valueanimator1, valueanimator2, valueanimator3, obj
                });
            } else
            {
                ((AnimatorSet) (obj1)).playTogether(new Animator[] {
                    valueanimator, valueanimator1, valueanimator2, valueanimator3, obj2
                });
            }
            ((AnimatorSet) (obj1)).start();
        }

            public 
            {
                a = TooltipContainer.this;
                super();
            }
    }


    // Unreferenced inner class com/spotify/mobile/android/spotlets/tinkerbell/TooltipContainer$2

/* anonymous class */
    public final class _cls2
        implements fjt
    {

        private TooltipContainer a;

        public final void a()
        {
            TooltipContainer.b(a);
        }

            public 
            {
                a = TooltipContainer.this;
                super();
            }
    }

}
