// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.ui;

import Jo;
import Jr;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.snapchat.android.discover.model.ChannelPage;
import com.snapchat.android.ui.ClipCircleViewGroup;

// Referenced classes of package com.snapchat.android.discover.ui:
//            ChannelView

public class OpenChannelAnimationView extends View
{
    public static interface a
    {

        public abstract void a(ChannelView channelview);
    }


    public ChannelView a;
    public boolean b;
    public boolean c;
    public int d;
    public int e;
    private FrameLayout f;
    private int g;
    private int h;
    private Paint i;
    private int j;

    public OpenChannelAnimationView(Context context)
    {
        this(context, null);
    }

    public OpenChannelAnimationView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = null;
        f = null;
        b = false;
        c = false;
        i = new Paint();
        i.setAntiAlias(true);
    }

    static int a(OpenChannelAnimationView openchannelanimationview, int k)
    {
        openchannelanimationview.j = k;
        return k;
    }

    static boolean a(OpenChannelAnimationView openchannelanimationview)
    {
        openchannelanimationview.b = false;
        return false;
    }

    static boolean b(OpenChannelAnimationView openchannelanimationview)
    {
        openchannelanimationview.c = false;
        return false;
    }

    static ChannelView c(OpenChannelAnimationView openchannelanimationview)
    {
        return openchannelanimationview.a;
    }

    public final void a()
    {
        setBackgroundColor(0);
        b = false;
        c = false;
        setVisibility(8);
    }

    public final void a(ChannelView channelview, a a1)
    {
        b = true;
        a = channelview;
        f = a.a;
        if (!Jo.f(f))
        {
            b = false;
            return;
        } else
        {
            g = Jo.GLOBAL_VISIBLE_RECT_RECT.centerX();
            h = Jo.GLOBAL_VISIBLE_RECT_RECT.centerY();
            i.setColor(a.b.g);
            Object obj = new Point(Jo.a(getContext()), Jo.b(getContext()));
            Object obj1 = Jo.GLOBAL_VISIBLE_RECT_RECT;
            int k = ((Rect) (obj1)).centerX();
            int l = ((Rect) (obj1)).centerY();
            float f1 = Math.max(((Point) (obj)).x - k, k);
            float f2 = Math.max(((Point) (obj)).y - l, l);
            f1 = ((float)Math.sqrt(Math.pow(f1, 2D) + Math.pow(f2, 2D)) * 1.1F) / (float)(((Rect) (obj1)).width() / 2);
            obj = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[] {
                Integer.valueOf(0), Integer.valueOf(0xff000000)
            });
            ((ValueAnimator) (obj)).addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

                private OpenChannelAnimationView a;

                public final void onAnimationUpdate(ValueAnimator valueanimator)
                {
                    a.setBackgroundColor(((Integer)valueanimator.getAnimatedValue()).intValue());
                }

            
            {
                a = OpenChannelAnimationView.this;
                super();
            }
            });
            d = Jo.GLOBAL_VISIBLE_RECT_RECT.width() / 2;
            k = d;
            e = (int)f1 * k;
            obj1 = ValueAnimator.ofInt(new int[] {
                d, e
            });
            ((ValueAnimator) (obj1)).addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

                private OpenChannelAnimationView a;

                public final void onAnimationUpdate(ValueAnimator valueanimator)
                {
                    OpenChannelAnimationView.a(a, ((Integer)valueanimator.getAnimatedValue()).intValue());
                    a.postInvalidateOnAnimation();
                }

            
            {
                a = OpenChannelAnimationView.this;
                super();
            }
            });
            AnimatorSet animatorset = new AnimatorSet();
            animatorset.play(((Animator) (obj1))).with(((Animator) (obj)));
            animatorset.setDuration(150L);
            animatorset.setInterpolator(new DecelerateInterpolator());
            animatorset.addListener(new Jr(a1, channelview) {

                private a a;
                private ChannelView b;
                private OpenChannelAnimationView c;

                public final void onAnimationEnd(Animator animator)
                {
                    OpenChannelAnimationView.a(c);
                    if (a != null)
                    {
                        a.a(b);
                    }
                    if (!ClipCircleViewGroup.h)
                    {
                        animator = b;
                        animator.c = true;
                        animator.invalidate();
                    }
                }

            
            {
                c = OpenChannelAnimationView.this;
                a = a1;
                b = channelview;
                super();
            }
            });
            animatorset.start();
            return;
        }
    }

    protected void onDraw(Canvas canvas)
    {
        canvas.drawCircle(g, h, j, i);
    }

    public void setIsClosing(boolean flag)
    {
        c = flag;
    }

    // Unreferenced inner class com/snapchat/android/discover/ui/OpenChannelAnimationView$4

/* anonymous class */
    public final class _cls4
        implements android.animation.ValueAnimator.AnimatorUpdateListener
    {

        private OpenChannelAnimationView a;

        public final void onAnimationUpdate(ValueAnimator valueanimator)
        {
            a.setBackgroundColor(((Integer)valueanimator.getAnimatedValue()).intValue());
        }

            public 
            {
                a = OpenChannelAnimationView.this;
                super();
            }
    }


    // Unreferenced inner class com/snapchat/android/discover/ui/OpenChannelAnimationView$5

/* anonymous class */
    public final class _cls5
        implements android.animation.ValueAnimator.AnimatorUpdateListener
    {

        private OpenChannelAnimationView a;

        public final void onAnimationUpdate(ValueAnimator valueanimator)
        {
            OpenChannelAnimationView.a(a, ((Integer)valueanimator.getAnimatedValue()).intValue());
            a.postInvalidateOnAnimation();
        }

            public 
            {
                a = OpenChannelAnimationView.this;
                super();
            }
    }


    // Unreferenced inner class com/snapchat/android/discover/ui/OpenChannelAnimationView$6

/* anonymous class */
    public final class _cls6 extends Jr
    {

        private a a;
        private OpenChannelAnimationView b;

        public final void onAnimationEnd(Animator animator)
        {
            OpenChannelAnimationView.b(b);
            if (a != null)
            {
                a.a(OpenChannelAnimationView.c(b));
            }
        }

            public 
            {
                b = OpenChannelAnimationView.this;
                a = a1;
                super();
            }
    }

}
