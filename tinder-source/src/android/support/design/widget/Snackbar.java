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
import android.support.v4.widget.u;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.lang.ref.WeakReference;

// Referenced classes of package android.support.design.widget:
//            a, e, f, CoordinatorLayout

public final class Snackbar
{
    public static class SnackbarLayout extends LinearLayout
    {

        TextView a;
        TextView b;
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

        TextView getActionView()
        {
            return b;
        }

        TextView getMessageView()
        {
            return a;
        }

        protected void onFinishInflate()
        {
            super.onFinishInflate();
            a = (TextView)findViewById(android.support.design.a.d.snackbar_text);
            b = (TextView)findViewById(android.support.design.a.d.snackbar_action);
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
            l = getResources().getDimensionPixelSize(android.support.design.a.c.snackbar_padding_vertical_2lines);
            i1 = getResources().getDimensionPixelSize(android.support.design.a.c.snackbar_padding_vertical);
            if (a.getLayout().getLineCount() > 1)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (i == 0 || d <= 0 || b.getMeasuredWidth() <= d) goto _L2; else goto _L1
_L1:
            if (!a(1, l, l - i1)) goto _L4; else goto _L3
_L3:
            i = 1;
_L6:
            if (i != 0)
            {
                super.onMeasure(k, j);
            }
            return;
_L2:
            if (i != 0)
            {
                i = l;
            } else
            {
                i = i1;
            }
            if (a(0, i, i))
            {
                i = 1;
                continue; /* Loop/switch isn't completed */
            }
_L4:
            i = 0;
            if (true) goto _L6; else goto _L5
_L5:
        }

        void setOnLayoutChangeListener(a a1)
        {
            e = a1;
        }

        public SnackbarLayout(Context context)
        {
            this(context, null);
        }

        public SnackbarLayout(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            attributeset = context.obtainStyledAttributes(attributeset, android.support.design.a.g.SnackbarLayout);
            c = attributeset.getDimensionPixelSize(android.support.design.a.g.SnackbarLayout_android_maxWidth, -1);
            d = attributeset.getDimensionPixelSize(android.support.design.a.g.SnackbarLayout_maxActionInlineWidth, -1);
            if (attributeset.hasValue(android.support.design.a.g.SnackbarLayout_elevation))
            {
                x.f(this, attributeset.getDimensionPixelSize(android.support.design.a.g.SnackbarLayout_elevation, 0));
            }
            attributeset.recycle();
            setClickable(true);
            LayoutInflater.from(context).inflate(android.support.design.a.e.layout_snackbar_include, this);
        }
    }

    static interface SnackbarLayout.a
    {

        public abstract void a();
    }

    final class a extends f
    {

        final Snackbar a;

        private boolean a(CoordinatorLayout coordinatorlayout, SnackbarLayout snackbarlayout, MotionEvent motionevent)
        {
            if (!coordinatorlayout.isPointInChildBounds(snackbarlayout, (int)motionevent.getX(), (int)motionevent.getY())) goto _L2; else goto _L1
_L1:
            motionevent.getActionMasked();
            JVM INSTR tableswitch 0 3: default 52
        //                       0 60
        //                       1 76
        //                       2 52
        //                       3 76;
               goto _L2 _L3 _L4 _L2 _L4
_L2:
            return super.a(coordinatorlayout, snackbarlayout, motionevent);
_L3:
            e.a().b(Snackbar.a(a));
            continue; /* Loop/switch isn't completed */
_L4:
            e.a().c(Snackbar.a(a));
            if (true) goto _L2; else goto _L5
_L5:
        }

        public final volatile boolean a(CoordinatorLayout coordinatorlayout, View view, MotionEvent motionevent)
        {
            return a(coordinatorlayout, (SnackbarLayout)view, motionevent);
        }

        a()
        {
            a = Snackbar.this;
            super();
        }
    }


    private static final Handler d = new Handler(Looper.getMainLooper(), new android.os.Handler.Callback() {

        public final boolean handleMessage(Message message)
        {
            boolean flag1;
            flag1 = false;
            switch (message.what)
            {
            default:
                return false;

            case 0: // '\0'
                message = (Snackbar)message.obj;
                if (((Snackbar) (message)).b.getParent() == null)
                {
                    android.view.ViewGroup.LayoutParams layoutparams = ((Snackbar) (message)).b.getLayoutParams();
                    if (layoutparams instanceof CoordinatorLayout.e)
                    {
                        a a1 = message. new a();
                        a1.f = f.a(0.1F);
                        a1.g = f.a(0.6F);
                        a1.d = 0;
                        a1.c = message. new f.a() {

                            final Snackbar a;

                            public final void a()
                            {
                                e e1;
                                e.a a1;
                                Snackbar snackbar = a;
                                e1 = e.a();
                                a1 = snackbar.c;
                                Object obj = e1.a;
                                obj;
                                JVM INSTR monitorenter ;
                                if (e1.d(a1))
                                {
                                    e.a(e1.b);
                                }
                                Exception exception;
                                boolean flag;
                                if (e1.c != null && e1.c.a(a1))
                                {
                                    flag = true;
                                } else
                                {
                                    flag = false;
                                }
                                if (!flag)
                                {
                                    break MISSING_BLOCK_LABEL_71;
                                }
                                e.a(e1.c);
                                obj;
                                JVM INSTR monitorexit ;
                                return;
                                exception;
                                obj;
                                JVM INSTR monitorexit ;
                                throw exception;
                            }

                            public final void a(int i)
                            {
                                switch (i)
                                {
                                default:
                                    return;

                                case 1: // '\001'
                                case 2: // '\002'
                                    e.a().b(Snackbar.a(a));
                                    return;

                                case 0: // '\0'
                                    e.a().c(Snackbar.a(a));
                                    return;
                                }
                            }

            
            {
                a = Snackbar.this;
                super();
            }
                        };
                        ((CoordinatorLayout.e)layoutparams).a(a1);
                    }
                    ((Snackbar) (message)).a.addView(((Snackbar) (message)).b);
                }
                if (x.E(((Snackbar) (message)).b))
                {
                    message.a();
                } else
                {
                    ((Snackbar) (message)).b.setOnLayoutChangeListener(message. new SnackbarLayout.a() {

                        final Snackbar a;

                        public final void a()
                        {
                            Snackbar.b(a);
                            Snackbar.c(a).setOnLayoutChangeListener(null);
                        }

            
            {
                a = Snackbar.this;
                super();
            }
                    });
                }
                return true;

            case 1: // '\001'
                message = (Snackbar)message.obj;
                break;
            }
            if (((Snackbar) (message)).b.getVisibility() != 0) goto _L2; else goto _L1
_L1:
            Object obj = ((Snackbar) (message)).b.getLayoutParams();
            boolean flag = flag1;
            if (obj instanceof CoordinatorLayout.e)
            {
                obj = ((CoordinatorLayout.e)obj).a;
                flag = flag1;
                if (obj instanceof f)
                {
                    obj = (f)obj;
                    int i;
                    if (((f) (obj)).b != null)
                    {
                        i = ((f) (obj)).b.a;
                    } else
                    {
                        i = 0;
                    }
                    flag = flag1;
                    if (i != 0)
                    {
                        flag = true;
                    }
                }
            }
            if (!flag) goto _L3; else goto _L2
_L2:
            message.b();
_L5:
            return true;
_L3:
            if (android.os.Build.VERSION.SDK_INT >= 14)
            {
                x.s(((Snackbar) (message)).b).c(((Snackbar) (message)).b.getHeight()).a(android.support.design.widget.a.b).a(250L).a(message. new ak() {

                    final Snackbar a;

                    public final void onAnimationEnd(View view)
                    {
                        Snackbar.d(a);
                    }

                    public final void onAnimationStart(View view)
                    {
                        view = Snackbar.c(a);
                        x.c(((SnackbarLayout) (view)).a, 1.0F);
                        x.s(((SnackbarLayout) (view)).a).a(0.0F).a(180L).b(0L).b();
                        if (((SnackbarLayout) (view)).b.getVisibility() == 0)
                        {
                            x.c(((SnackbarLayout) (view)).b, 1.0F);
                            x.s(((SnackbarLayout) (view)).b).a(0.0F).a(180L).b(0L).b();
                        }
                    }

            
            {
                a = Snackbar.this;
                super();
            }
                }).b();
            } else
            {
                Animation animation = AnimationUtils.loadAnimation(((Snackbar) (message)).b.getContext(), android.support.design.a.a.snackbar_out);
                animation.setInterpolator(android.support.design.widget.a.b);
                animation.setDuration(250L);
                animation.setAnimationListener(message. new android.view.animation.Animation.AnimationListener() {

                    final Snackbar a;

                    public final void onAnimationEnd(Animation animation)
                    {
                        Snackbar.d(a);
                    }

                    public final void onAnimationRepeat(Animation animation)
                    {
                    }

                    public final void onAnimationStart(Animation animation)
                    {
                    }

            
            {
                a = Snackbar.this;
                super();
            }
                });
                ((Snackbar) (message)).b.startAnimation(animation);
            }
            if (true) goto _L5; else goto _L4
_L4:
        }

    });
    final ViewGroup a;
    final SnackbarLayout b;
    final e.a c;

    static e.a a(Snackbar snackbar)
    {
        return snackbar.c;
    }

    static void b(Snackbar snackbar)
    {
        snackbar.a();
    }

    static SnackbarLayout c(Snackbar snackbar)
    {
        return snackbar.b;
    }

    static void d(Snackbar snackbar)
    {
        snackbar.b();
    }

    final void a()
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            x.b(b, b.getHeight());
            x.s(b).c(0.0F).a(android.support.design.widget.a.b).a(250L).a(new ak() {

                final Snackbar a;

                public final void onAnimationEnd(View view)
                {
                    e.a().a(Snackbar.a(a));
                }

                public final void onAnimationStart(View view)
                {
                    view = Snackbar.c(a);
                    x.c(((SnackbarLayout) (view)).a, 0.0F);
                    x.s(((SnackbarLayout) (view)).a).a(1.0F).a(180L).b(70L).b();
                    if (((SnackbarLayout) (view)).b.getVisibility() == 0)
                    {
                        x.c(((SnackbarLayout) (view)).b, 0.0F);
                        x.s(((SnackbarLayout) (view)).b).a(1.0F).a(180L).b(70L).b();
                    }
                }

            
            {
                a = Snackbar.this;
                super();
            }
            }).b();
            return;
        } else
        {
            Animation animation = AnimationUtils.loadAnimation(b.getContext(), android.support.design.a.a.snackbar_in);
            animation.setInterpolator(android.support.design.widget.a.b);
            animation.setDuration(250L);
            animation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

                final Snackbar a;

                public final void onAnimationEnd(Animation animation1)
                {
                    e.a().a(Snackbar.a(a));
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
            b.startAnimation(animation);
            return;
        }
    }

    final void b()
    {
        a.removeView(b);
        e e1 = e.a();
        e.a a1 = c;
        synchronized (e1.a)
        {
            if (e1.d(a1))
            {
                e1.b = null;
                if (e1.c != null && e1.c != null)
                {
                    e1.b = e1.c;
                    e1.c = null;
                    if ((e.a)e1.b.a.get() == null)
                    {
                        e1.b = null;
                    }
                }
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

}
