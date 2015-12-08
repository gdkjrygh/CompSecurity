// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.google.common.base.Optional;

public final class fjo extends FrameLayout
{

    public fjp a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public float i;
    public int j;
    public int k;
    public boolean l;
    public Optional m;
    public FrameLayout n;
    private final Paint o = new Paint();
    private final Path p = new Path();
    private final Path q = new Path();
    private float r;
    private float s;
    private float t;

    public fjo(Context context)
    {
        super(context);
        m = Optional.e();
        setId(0x7f11011a);
        setWillNotDraw(false);
        context = getResources();
        o.setStyle(android.graphics.Paint.Style.FILL);
        o.setAntiAlias(true);
        o.setColor(gcg.b(getContext(), 0x7f0f0086));
        h = context.getDimensionPixelSize(0x7f0c015c);
        n = (FrameLayout)LayoutInflater.from(getContext()).inflate(0x7f03013f, this, true).findViewById(0x7f1104d3);
    }

    static float a(fjo fjo1, float f1)
    {
        fjo1.r = f1;
        return f1;
    }

    static int a(fjo fjo1)
    {
        return fjo1.j;
    }

    static Optional a(fjo fjo1, Optional optional)
    {
        fjo1.m = optional;
        return optional;
    }

    static float b(fjo fjo1, float f1)
    {
        fjo1.s = f1;
        return f1;
    }

    static Optional b(fjo fjo1)
    {
        return fjo1.m;
    }

    static float c(fjo fjo1, float f1)
    {
        fjo1.t = f1;
        return f1;
    }

    static FrameLayout c(fjo fjo1)
    {
        return fjo1.n;
    }

    static fjp d(fjo fjo1)
    {
        return fjo1.a;
    }

    public final void a(boolean flag)
    {
        if (flag)
        {
            setVisibility(8);
            if (m.b())
            {
                ((fjs)m.c()).a(n);
                m = Optional.e();
            }
            return;
        } else
        {
            setVisibility(4);
            return;
        }
    }

    public final void b(boolean flag)
    {
        l = flag;
        invalidate();
    }

    protected final void onDraw(Canvas canvas)
    {
        float f1 = s;
        float f2 = r;
        float f3 = t;
        p.reset();
        p.moveTo(d, (float)e + f2);
        p.quadTo(b, (float)e + f1, f, (float)e + f2);
        p.lineTo(f, (float)g - f2);
        p.quadTo(b, (float)g - f1, d, (float)g - f2);
        canvas.drawPath(p, o);
        q.reset();
        if (l)
        {
            q.moveTo(b, (float)c + f3);
        } else
        {
            q.moveTo(b, (float)c - f3);
        }
        q.lineTo((float)b - f3, c);
        q.lineTo((float)b + f3, c);
        canvas.drawPath(q, o);
    }

    public final boolean onTouchEvent(MotionEvent motionevent)
    {
        return true;
    }

    // Unreferenced inner class fjo$1

/* anonymous class */
    public final class _cls1
        implements android.animation.ValueAnimator.AnimatorUpdateListener
    {

        private fjo a;

        public final void onAnimationUpdate(ValueAnimator valueanimator)
        {
            a.invalidate();
        }

            public 
            {
                a = fjo.this;
                super();
            }
    }


    // Unreferenced inner class fjo$10

/* anonymous class */
    public final class _cls10
        implements android.animation.ValueAnimator.AnimatorUpdateListener
    {

        private fjo a;

        public final void onAnimationUpdate(ValueAnimator valueanimator)
        {
            fjo.c(a, ((Float)valueanimator.getAnimatedValue()).floatValue());
        }

            public 
            {
                a = fjo.this;
                super();
            }
    }


    // Unreferenced inner class fjo$2

/* anonymous class */
    public final class _cls2
        implements android.animation.Animator.AnimatorListener
    {

        private fjo a;

        public final void onAnimationCancel(Animator animator)
        {
        }

        public final void onAnimationEnd(Animator animator)
        {
            if (fjo.d(a) != null)
            {
                fjo.d(a).a();
            }
            if (fjo.b(a).b())
            {
                ((fjs)fjo.b(a).c()).a(fjo.c(a));
                fjo.a(a, Optional.e());
            }
        }

        public final void onAnimationRepeat(Animator animator)
        {
        }

        public final void onAnimationStart(Animator animator)
        {
        }

            public 
            {
                a = fjo.this;
                super();
            }
    }


    // Unreferenced inner class fjo$3

/* anonymous class */
    public final class _cls3
        implements android.animation.ValueAnimator.AnimatorUpdateListener
    {

        private fjo a;

        public final void onAnimationUpdate(ValueAnimator valueanimator)
        {
            fjo.a(a, ((Float)valueanimator.getAnimatedValue()).floatValue());
        }

            public 
            {
                a = fjo.this;
                super();
            }
    }


    // Unreferenced inner class fjo$4

/* anonymous class */
    public final class _cls4
        implements android.animation.ValueAnimator.AnimatorUpdateListener
    {

        private fjo a;

        public final void onAnimationUpdate(ValueAnimator valueanimator)
        {
            fjo.b(a, ((Float)valueanimator.getAnimatedValue()).floatValue());
        }

            public 
            {
                a = fjo.this;
                super();
            }
    }


    // Unreferenced inner class fjo$5

/* anonymous class */
    public final class _cls5
        implements android.animation.ValueAnimator.AnimatorUpdateListener
    {

        private fjo a;

        public final void onAnimationUpdate(ValueAnimator valueanimator)
        {
            fjo.c(a, ((Float)valueanimator.getAnimatedValue()).floatValue());
        }

            public 
            {
                a = fjo.this;
                super();
            }
    }


    // Unreferenced inner class fjo$6

/* anonymous class */
    public final class _cls6
        implements android.animation.Animator.AnimatorListener
    {

        private fjo a;

        public final void onAnimationCancel(Animator animator)
        {
        }

        public final void onAnimationEnd(Animator animator)
        {
        }

        public final void onAnimationRepeat(Animator animator)
        {
        }

        public final void onAnimationStart(Animator animator)
        {
label0:
            {
                fjo.b(a, fjo.a(a));
                fjo.a(a, fjo.a(a));
                fjo.c(a, 0.0F);
                if (fjo.b(a).b())
                {
                    if (((fjs)fjo.b(a).c()).a().b())
                    {
                        break label0;
                    }
                    fjo.c(a).setScaleX(0.5F);
                    fjo.c(a).setScaleY(0.25F);
                    fjo.c(a).setAlpha(0.0F);
                }
                return;
            }
            fjo.c(a).setScaleX(1.0F);
            fjo.c(a).setScaleY(1.0F);
            fjo.c(a).setAlpha(1.0F);
        }

            public 
            {
                a = fjo.this;
                super();
            }
    }


    // Unreferenced inner class fjo$7

/* anonymous class */
    public final class _cls7
        implements android.animation.ValueAnimator.AnimatorUpdateListener
    {

        private fjo a;

        public final void onAnimationUpdate(ValueAnimator valueanimator)
        {
            a.invalidate();
        }

            public 
            {
                a = fjo.this;
                super();
            }
    }


    // Unreferenced inner class fjo$8

/* anonymous class */
    public final class _cls8
        implements android.animation.ValueAnimator.AnimatorUpdateListener
    {

        private fjo a;

        public final void onAnimationUpdate(ValueAnimator valueanimator)
        {
            fjo.a(a, ((Float)valueanimator.getAnimatedValue()).floatValue());
        }

            public 
            {
                a = fjo.this;
                super();
            }
    }


    // Unreferenced inner class fjo$9

/* anonymous class */
    public final class _cls9
        implements android.animation.ValueAnimator.AnimatorUpdateListener
    {

        private fjo a;

        public final void onAnimationUpdate(ValueAnimator valueanimator)
        {
            fjo.b(a, ((Float)valueanimator.getAnimatedValue()).floatValue());
        }

            public 
            {
                a = fjo.this;
                super();
            }
    }

}
