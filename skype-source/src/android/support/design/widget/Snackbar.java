// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.view.af;
import android.support.v4.view.ak;
import android.support.v4.view.x;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.lang.annotation.Annotation;

// Referenced classes of package android.support.design.widget:
//            n, a, SwipeDismissBehavior, CoordinatorLayout

public final class Snackbar
{
    public static abstract class Callback
    {
    }

    public static interface Callback.DismissEvent
        extends Annotation
    {
    }

    public static interface Duration
        extends Annotation
    {
    }

    public static class SnackbarLayout extends LinearLayout
    {

        private TextView a;
        private Button b;
        private int c;
        private int d;
        private a e;

        private boolean a(int i, int j, int k)
        {
            boolean flag = false;
            if (i != getOrientation())
            {
                setOrientation(i);
                flag = true;
            }
            if (a.getPaddingTop() != j || a.getPaddingBottom() != k)
            {
                TextView textview = a;
                if (x.B(textview))
                {
                    x.b(textview, x.m(textview), j, x.n(textview), k);
                } else
                {
                    textview.setPadding(textview.getPaddingLeft(), j, textview.getPaddingRight(), k);
                }
                flag = true;
            }
            return flag;
        }

        final void a()
        {
            x.c(a, 0.0F);
            x.s(a).a(1.0F).a(180L).b(70L).e();
            if (b.getVisibility() == 0)
            {
                x.c(b, 0.0F);
                x.s(b).a(1.0F).a(180L).b(70L).e();
            }
        }

        final void a(a a1)
        {
            e = a1;
        }

        final void b()
        {
            x.c(a, 1.0F);
            x.s(a).a(0.0F).a(180L).b(0L).e();
            if (b.getVisibility() == 0)
            {
                x.c(b, 1.0F);
                x.s(b).a(0.0F).a(180L).b(0L).e();
            }
        }

        protected void onFinishInflate()
        {
            super.onFinishInflate();
            a = (TextView)findViewById(android.support.design.a.f.snackbar_text);
            b = (Button)findViewById(android.support.design.a.f.snackbar_action);
        }

        protected void onLayout(boolean flag, int i, int j, int k, int l)
        {
            super.onLayout(flag, i, j, k, l);
            if (flag && e != null)
            {
                e.a();
            }
        }

        protected void onMeasure(int i, int j)
        {
            int l;
            int i1;
            boolean flag;
            super.onMeasure(i, j);
            int k = i;
            if (c > 0)
            {
                k = i;
                if (getMeasuredWidth() > c)
                {
                    k = android.view.View.MeasureSpec.makeMeasureSpec(c, 0x40000000);
                    super.onMeasure(k, j);
                }
            }
            l = getResources().getDimensionPixelSize(android.support.design.a.d.design_snackbar_padding_vertical_2lines);
            i1 = getResources().getDimensionPixelSize(android.support.design.a.d.design_snackbar_padding_vertical);
            if (a.getLayout().getLineCount() > 1)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            flag = false;
            if (i == 0 || d <= 0 || b.getMeasuredWidth() <= d) goto _L2; else goto _L1
_L1:
            i = ((flag) ? 1 : 0);
            if (a(1, l, l - i1))
            {
                i = 1;
            }
_L4:
            if (i != 0)
            {
                super.onMeasure(k, j);
            }
            return;
_L2:
            if (i == 0)
            {
                l = i1;
            }
            i = ((flag) ? 1 : 0);
            if (a(0, l, l))
            {
                i = 1;
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        public SnackbarLayout(Context context)
        {
            this(context, null);
        }

        public SnackbarLayout(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            attributeset = context.obtainStyledAttributes(attributeset, android.support.design.a.i.SnackbarLayout);
            c = attributeset.getDimensionPixelSize(android.support.design.a.i.SnackbarLayout_android_maxWidth, -1);
            d = attributeset.getDimensionPixelSize(android.support.design.a.i.SnackbarLayout_maxActionInlineWidth, -1);
            if (attributeset.hasValue(android.support.design.a.i.SnackbarLayout_elevation))
            {
                x.f(this, attributeset.getDimensionPixelSize(android.support.design.a.i.SnackbarLayout_elevation, 0));
            }
            attributeset.recycle();
            setClickable(true);
            LayoutInflater.from(context).inflate(android.support.design.a.g.design_layout_snackbar_include, this);
        }
    }

    static interface SnackbarLayout.a
    {

        public abstract void a();
    }

    final class a extends SwipeDismissBehavior
    {

        final Snackbar a;

        public final boolean b(CoordinatorLayout coordinatorlayout, View view, MotionEvent motionevent)
        {
            view = (SnackbarLayout)view;
            if (!coordinatorlayout.a(view, (int)motionevent.getX(), (int)motionevent.getY())) goto _L2; else goto _L1
_L1:
            motionevent.getActionMasked();
            JVM INSTR tableswitch 0 3: default 56
        //                       0 64
        //                       1 80
        //                       2 56
        //                       3 80;
               goto _L2 _L3 _L4 _L2 _L4
_L2:
            return super.b(coordinatorlayout, view, motionevent);
_L3:
            n.a().d(Snackbar.b(a));
            continue; /* Loop/switch isn't completed */
_L4:
            n.a().e(Snackbar.b(a));
            if (true) goto _L2; else goto _L5
_L5:
        }

        a()
        {
            a = Snackbar.this;
            super();
        }
    }


    private static final Handler a = new Handler(Looper.getMainLooper(), new android.os.Handler.Callback() {

        public final boolean handleMessage(Message message)
        {
            switch (message.what)
            {
            default:
                return false;

            case 0: // '\0'
                ((Snackbar)message.obj).a();
                return true;

            case 1: // '\001'
                ((Snackbar)message.obj).a(message.arg1);
                break;
            }
            return true;
        }

    });
    private final ViewGroup b;
    private final SnackbarLayout c;
    private Callback d;
    private final n.a e;

    static void a(Snackbar snackbar)
    {
        n.a().a(snackbar.e);
    }

    static n.a b(Snackbar snackbar)
    {
        return snackbar.e;
    }

    private void b()
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            x.b(c, c.getHeight());
            x.s(c).c(0.0F).a(android.support.design.widget.a.b).a(250L).a(new ak() {

                final Snackbar a;

                public final void a(View view)
                {
                    Snackbar.d(a).a();
                }

                public final void b(View view)
                {
                    if (Snackbar.e(a) != null)
                    {
                        Snackbar.e(a);
                    }
                    n.a().c(Snackbar.b(a));
                }

            
            {
                a = Snackbar.this;
                super();
            }
            }).e();
            return;
        } else
        {
            Animation animation = AnimationUtils.loadAnimation(c.getContext(), android.support.design.a.a.design_snackbar_in);
            animation.setInterpolator(android.support.design.widget.a.b);
            animation.setDuration(250L);
            animation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

                final Snackbar a;

                public final void onAnimationEnd(Animation animation1)
                {
                    if (Snackbar.e(a) != null)
                    {
                        Snackbar.e(a);
                    }
                    n.a().c(Snackbar.b(a));
                }

                public final void onAnimationRepeat(Animation animation1)
                {
                }

                public final void onAnimationStart(Animation animation1)
                {
                }

            
            {
                a = Snackbar.this;
                super();
            }
            });
            c.startAnimation(animation);
            return;
        }
    }

    private void c()
    {
        b.removeView(c);
        n.a().b(e);
    }

    static void c(Snackbar snackbar)
    {
        snackbar.b();
    }

    static SnackbarLayout d(Snackbar snackbar)
    {
        return snackbar.c;
    }

    static Callback e(Snackbar snackbar)
    {
        return snackbar.d;
    }

    static void f(Snackbar snackbar)
    {
        snackbar.c();
    }

    final void a()
    {
        if (c.getParent() == null)
        {
            android.view.ViewGroup.LayoutParams layoutparams = c.getLayoutParams();
            if (layoutparams instanceof CoordinatorLayout.d)
            {
                a a1 = new a();
                a1.b();
                a1.c();
                a1.a();
                a1.a(new SwipeDismissBehavior.a() {

                    final Snackbar a;

                    public final void a()
                    {
                        Snackbar.a(a);
                    }

                    public final void a(int i)
                    {
                        switch (i)
                        {
                        default:
                            return;

                        case 1: // '\001'
                        case 2: // '\002'
                            n.a().d(Snackbar.b(a));
                            return;

                        case 0: // '\0'
                            n.a().e(Snackbar.b(a));
                            return;
                        }
                    }

            
            {
                a = Snackbar.this;
                super();
            }
                });
                ((CoordinatorLayout.d)layoutparams).a(a1);
            }
            b.addView(c);
        }
        if (x.E(c))
        {
            b();
            return;
        } else
        {
            c.a(new SnackbarLayout.a() {

                final Snackbar a;

                public final void a()
                {
                    Snackbar.c(a);
                    Snackbar.d(a).a(null);
                }

            
            {
                a = Snackbar.this;
                super();
            }
            });
            return;
        }
    }

    final void a(int i)
    {
        if (c.getVisibility() != 0) goto _L2; else goto _L1
_L1:
        Object obj = c.getLayoutParams();
        if (!(obj instanceof CoordinatorLayout.d)) goto _L4; else goto _L3
_L3:
        obj = ((CoordinatorLayout.d)obj).a;
        if (!(obj instanceof SwipeDismissBehavior)) goto _L4; else goto _L5
_L5:
        boolean flag;
        if (((SwipeDismissBehavior)obj).d() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
_L7:
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
_L2:
        c();
        return;
_L4:
        flag = false;
        if (true) goto _L7; else goto _L6
_L6:
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            x.s(c).c(c.getHeight()).a(android.support.design.widget.a.b).a(250L).a(new ak(i) {

                final int a;
                final Snackbar b;

                public final void a(View view)
                {
                    Snackbar.d(b).b();
                }

                public final void b(View view)
                {
                    Snackbar.f(b);
                }

            
            {
                b = Snackbar.this;
                a = i;
                super();
            }
            }).e();
            return;
        } else
        {
            Animation animation = AnimationUtils.loadAnimation(c.getContext(), android.support.design.a.a.design_snackbar_out);
            animation.setInterpolator(android.support.design.widget.a.b);
            animation.setDuration(250L);
            animation.setAnimationListener(new android.view.animation.Animation.AnimationListener(i) {

                final int a;
                final Snackbar b;

                public final void onAnimationEnd(Animation animation1)
                {
                    Snackbar.f(b);
                }

                public final void onAnimationRepeat(Animation animation1)
                {
                }

                public final void onAnimationStart(Animation animation1)
                {
                }

            
            {
                b = Snackbar.this;
                a = i;
                super();
            }
            });
            c.startAnimation(animation);
            return;
        }
    }

}
