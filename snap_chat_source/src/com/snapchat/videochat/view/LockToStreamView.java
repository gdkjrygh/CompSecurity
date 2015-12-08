// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.videochat.view;

import VC;
import Vt;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;

public class LockToStreamView extends View
{

    Paint a;
    Paint b;
    boolean c;
    boolean d;
    boolean e;
    View f;
    float g;
    float h;
    Vt i;
    private RectF j;
    private int k[];

    public LockToStreamView(Context context, View view, Vt vt)
    {
        super(context);
        c = false;
        d = false;
        e = false;
        k = new int[2];
        f = view;
        i = vt;
        a = new Paint(1);
        a.setStyle(android.graphics.Paint.Style.STROKE);
        int l = getResources().getDimensionPixelSize(Vl.b.here_lock_to_stream_ring_width);
        a.setStrokeWidth(l);
        a.setColor(context.getResources().getColor(Vl.a.here_l2s_stroke));
        j = new RectF(0.0F, 0.0F, 0.0F, 0.0F);
        setBackgroundColor(0);
        a();
    }

    static boolean a(LockToStreamView locktostreamview)
    {
        locktostreamview.d = false;
        return false;
    }

    private float b(MotionEvent motionevent)
    {
        getLocationOnScreen(k);
        return Math.abs(((float)k[1] + (float)(getWidth() / 2) * getScaleX()) - motionevent.getRawY());
    }

    static Paint b(LockToStreamView locktostreamview)
    {
        return locktostreamview.a;
    }

    static Paint c(LockToStreamView locktostreamview)
    {
        return locktostreamview.b;
    }

    final float a(float f1, float f2)
    {
        if (f1 < f2)
        {
            return getResources().getDimension(Vl.b.here_lock_to_stream_y_location_top) - (float)(getWidth() / 2);
        } else
        {
            return (float)c() - getResources().getDimension(Vl.b.here_lock_to_stream_y_location) - (float)(getWidth() / 2);
        }
    }

    public final void a()
    {
        setVisibility(4);
        setY(-getResources().getDimension(Vl.b.here_lock_to_stream_y_location_off_screen));
        c = false;
        d = false;
        e = false;
    }

    public final void a(int l)
    {
        ValueAnimator valueanimator = ValueAnimator.ofInt(new int[] {
            a.getAlpha(), l
        });
        valueanimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

            private LockToStreamView a;

            public final void onAnimationUpdate(ValueAnimator valueanimator1)
            {
                int i1 = ((Integer)valueanimator1.getAnimatedValue()).intValue();
                LockToStreamView.b(a).setAlpha(i1);
                a.invalidate();
            }

            
            {
                a = LockToStreamView.this;
                super();
            }
        });
        valueanimator.setDuration(250L);
        valueanimator.start();
    }

    final void a(int l, int i1)
    {
        ValueAnimator valueanimator = ValueAnimator.ofInt(new int[] {
            l, i1
        });
        valueanimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

            private LockToStreamView a;

            public final void onAnimationUpdate(ValueAnimator valueanimator1)
            {
                int j1 = ((Integer)valueanimator1.getAnimatedValue()).intValue();
                LockToStreamView.c(a).setAlpha(j1);
                a.invalidate();
            }

            
            {
                a = LockToStreamView.this;
                super();
            }
        });
        valueanimator.setDuration(300L);
        valueanimator.start();
    }

    final void a(MotionEvent motionevent, boolean flag)
    {
        if (c)
        {
            return;
        }
        float f1 = b(motionevent);
        int l = getResources().getDimensionPixelOffset(Vl.b.here_lock_icon_scaling_border);
        if (f1 > (float)l)
        {
            f1 = g;
        } else
        {
            f1 = Math.min(Math.max(VC.a(g, h, ((float)l - f1) / (float)l), g), h);
        }
        if (flag)
        {
            float f2 = a(motionevent.getRawY(), c() / 2);
            animate().scaleX(f1).scaleY(f1).translationY(f2).setDuration(300L);
            return;
        } else
        {
            setScaleX(f1);
            setScaleY(f1);
            return;
        }
    }

    public final boolean a(MotionEvent motionevent)
    {
        return b(motionevent) < (float)(getWidth() / 2) * getScaleX();
    }

    public final void b()
    {
        if (!c)
        {
            return;
        }
        float f1 = f.getMeasuredWidth();
        float f2 = f.getScaleX();
        float f3 = (float)(getResources().getDimensionPixelSize(Vl.b.here_lock_to_stream_ring_width) * 2) + f1 * f2;
        int l = getResources().getDimensionPixelOffset(Vl.b.here_lock_icon_locked_y_offset);
        float f4 = c();
        float f5 = f4 / 2.0F;
        f2 = (float)l + f3 / 2.0F;
        f1 = f2;
        if (getY() > f5)
        {
            f1 = f4 - f2;
        }
        f2 = f3 / (float)getMeasuredHeight();
        setScaleX(f3 / (float)getMeasuredWidth());
        setScaleY(f2);
        setY(f1 - (float)getHeight() / 2.0F);
        f2 = (float)f.getMeasuredHeight() / 2.0F;
        f.setY(f1 - f2);
    }

    final int c()
    {
        View view = (View)getParent();
        if (view == null)
        {
            return 0;
        } else
        {
            return view.getMeasuredHeight();
        }
    }

    protected void onDraw(Canvas canvas)
    {
        if (c || d)
        {
            canvas.translate(a.getStrokeWidth(), a.getStrokeWidth());
            canvas.drawArc(j, 0.0F, 360F, true, a);
        }
        if (b != null)
        {
            float f1 = getWidth() - (int)(2.0F * a.getStrokeWidth());
            canvas.drawRect(0.0F, 0.0F, f1, f1, b);
        }
    }

    protected void onMeasure(int l, int i1)
    {
        i1 = android.view.View.MeasureSpec.getMode(l);
        l = android.view.View.MeasureSpec.getSize(l);
        break MISSING_BLOCK_LABEL_10;
        if (i1 != 0x80000000 && i1 != 0x40000000)
        {
            l = 0;
        }
        i1 = l - (int)(2.0F * a.getStrokeWidth());
        j.set(0.0F, 0.0F, i1, i1);
        setMeasuredDimension(l, l);
        return;
    }

    public void setAnalytics(Vt vt)
    {
        i = vt;
    }

    static 
    {
        com/snapchat/videochat/view/LockToStreamView.getSimpleName();
    }

    // Unreferenced inner class com/snapchat/videochat/view/LockToStreamView$1

/* anonymous class */
    final class _cls1 extends AnimatorListenerAdapter
    {

        private boolean a;
        private LockToStreamView b;

        public final void onAnimationEnd(Animator animator)
        {
            if (a)
            {
                b.setVisibility(4);
            }
            LockToStreamView.a(b);
        }

            
            {
                b = LockToStreamView.this;
                a = flag;
                super();
            }
    }


    // Unreferenced inner class com/snapchat/videochat/view/LockToStreamView$2

/* anonymous class */
    final class _cls2 extends AnimatorListenerAdapter
    {

        private LockToStreamView a;

        public final void onAnimationEnd(Animator animator)
        {
            LockToStreamView.a(a);
            a.b();
        }

            
            {
                a = LockToStreamView.this;
                super();
            }
    }

}
