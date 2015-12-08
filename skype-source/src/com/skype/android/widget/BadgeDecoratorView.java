// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

public class BadgeDecoratorView extends FrameLayout
{
    public static final class BadgeLocation extends Enum
    {

        public static final BadgeLocation a;
        public static final BadgeLocation b;
        public static final BadgeLocation c;
        public static final BadgeLocation d;
        private static final BadgeLocation e[];

        public static BadgeLocation valueOf(String s)
        {
            return (BadgeLocation)Enum.valueOf(com/skype/android/widget/BadgeDecoratorView$BadgeLocation, s);
        }

        public static BadgeLocation[] values()
        {
            return (BadgeLocation[])e.clone();
        }

        static 
        {
            a = new BadgeLocation("TOP_LEFT", 0);
            b = new BadgeLocation("TOP_RIGHT", 1);
            c = new BadgeLocation("BOTTOM_LEFT", 2);
            d = new BadgeLocation("BOTTOM_RIGHT", 3);
            e = (new BadgeLocation[] {
                a, b, c, d
            });
        }

        private BadgeLocation(String s, int l)
        {
            super(s, l);
        }
    }


    private Drawable a;
    private boolean b;
    private View c;
    private int d;
    private Paint e;
    private int f;
    private int g;
    private int h;
    private ValueAnimator i;
    private BadgeLocation j;
    private boolean k;

    public BadgeDecoratorView(Context context)
    {
        super(context);
        j = BadgeLocation.a;
        k = true;
        a(null);
    }

    public BadgeDecoratorView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        j = BadgeLocation.a;
        k = true;
        a(attributeset);
    }

    public BadgeDecoratorView(Context context, AttributeSet attributeset, int l)
    {
        super(context, attributeset, l);
        j = BadgeLocation.a;
        k = true;
        a(attributeset);
    }

    public BadgeDecoratorView(Context context, View view)
    {
        super(context);
        j = BadgeLocation.a;
        k = true;
        a(null);
        c = view;
        addView(view);
    }

    private void a(AttributeSet attributeset)
    {
        e = new Paint();
        e.setAntiAlias(true);
        e.setStrokeWidth(getResources().getDimensionPixelSize(R.dimen.skype_badge_stroke_size));
        g = getResources().getColor(R.color.skype_badge_color);
        h = getResources().getColor(R.color.skype_badge_stroke_color);
        f = getResources().getDimensionPixelSize(R.dimen.skype_badge_size);
        d = 0;
        if (attributeset != null)
        {
            attributeset = getContext().obtainStyledAttributes(attributeset, R.styleable.BadgeDecoratorView);
            setBadgeVisible(attributeset.getBoolean(0, false));
            setBadgeDistanceFromEdgeToCenter(attributeset.getDimensionPixelSize(1, d));
            setBadgeSize(attributeset.getDimensionPixelSize(2, f));
            setBadgeStrokeWidth(attributeset.getDimensionPixelSize(3, (int)e.getStrokeWidth()));
            setBadgeColor(attributeset.getColor(4, g));
            setBadgeStrokeColor(attributeset.getColor(5, h));
            attributeset.recycle();
        }
    }

    private boolean b()
    {
        return i != null && i.isRunning();
    }

    private void c()
    {
        if (b && !b() && k)
        {
            ValueAnimator valueanimator = ValueAnimator.ofFloat(new float[] {
                1.0F, 1.25F, 1.0F
            });
            valueanimator.setRepeatCount(-1);
            valueanimator.setDuration(1000L);
            i = valueanimator;
            i.start();
        }
    }

    private void d()
    {
        if (b())
        {
            i.cancel();
            i = null;
        }
    }

    public final View a()
    {
        return c;
    }

    protected void dispatchDraw(Canvas canvas)
    {
        float f1;
        super.dispatchDraw(canvas);
        float f2 = f;
        f1 = f2;
        if (b())
        {
            f1 = f2 * ((Float)i.getAnimatedValue()).floatValue();
        }
        if (!b) goto _L2; else goto _L1
_L1:
        if (a == null) goto _L4; else goto _L3
_L3:
        a.setBounds(0, 0, (int)f1, (int)f1);
        a.getBounds().offsetTo((int)((float)canvas.getWidth() - f1 - (float)d), d);
        a.draw(canvas);
_L2:
        if (b())
        {
            invalidate();
        }
        return;
_L4:
        int l;
        canvas.save();
        l = (int)e.getStrokeWidth();
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[BadgeLocation.values().length];
                try
                {
                    a[BadgeLocation.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[BadgeLocation.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[BadgeLocation.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[BadgeLocation.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[j.ordinal()];
        JVM INSTR tableswitch 1 4: default 168
    //                   1 249
    //                   2 272
    //                   3 300
    //                   4 328;
           goto _L5 _L6 _L7 _L8 _L9
_L9:
        break MISSING_BLOCK_LABEL_328;
_L5:
        break; /* Loop/switch isn't completed */
_L6:
        break; /* Loop/switch isn't completed */
_L11:
        e.setColor(g);
        e.setStyle(android.graphics.Paint.Style.FILL);
        canvas.drawCircle(0.0F, 0.0F, f1 / 2.0F - 1.0F, e);
        e.setColor(h);
        e.setStyle(android.graphics.Paint.Style.STROKE);
        canvas.drawCircle(0.0F, 0.0F, (f1 - (float)l) / 2.0F, e);
        canvas.restore();
        if (true) goto _L2; else goto _L10
_L10:
        canvas.translate(d - l, d - l);
          goto _L11
_L7:
        canvas.translate((canvas.getWidth() - d) + l, d - l);
          goto _L11
_L8:
        canvas.translate(d - l, (canvas.getHeight() - d) + l);
          goto _L11
        canvas.translate((canvas.getWidth() - d) + l, (canvas.getWidth() - d) + l);
          goto _L11
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        if (getChildCount() != 1)
        {
            throw new IllegalArgumentException((new StringBuilder()).append(getClass().getName()).append(" can have only 1 child").toString());
        }
        try
        {
            c = getChildAt(0);
            return;
        }
        catch (ClassCastException classcastexception)
        {
            throw new IllegalArgumentException((new StringBuilder()).append(getClass().getName()).append(": wrong content view type").toString());
        }
    }

    protected void onLayout(boolean flag, int l, int i1, int j1, int k1)
    {
        c.layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    protected void onVisibilityChanged(View view, int l)
    {
        super.onVisibilityChanged(view, l);
        if (l == 0)
        {
            c();
            return;
        } else
        {
            d();
            return;
        }
    }

    public void setBadgeColor(int l)
    {
        g = l;
        invalidate();
    }

    public void setBadgeDistanceFromEdgeToCenter(int l)
    {
        d = l;
        invalidate();
    }

    public void setBadgeLocation(BadgeLocation badgelocation)
    {
        j = badgelocation;
    }

    public void setBadgeSize(int l)
    {
        f = l;
        invalidate();
    }

    public void setBadgeStrokeColor(int l)
    {
        h = l;
        invalidate();
    }

    public void setBadgeStrokeWidth(int l)
    {
        e.setStrokeWidth(l);
        invalidate();
    }

    public void setBadgeVisible(boolean flag)
    {
        b = flag;
        if (!flag)
        {
            d();
        } else
        {
            c();
        }
        invalidate();
    }

    public void setCustomBadge(Drawable drawable)
    {
        a = drawable;
        invalidate();
    }
}
