// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.view.am;
import android.support.v4.view.r;
import android.support.v4.view.x;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

public class ScrimInsetsFrameLayout extends FrameLayout
{

    private Drawable a;
    private Rect b;
    private Rect c;

    public ScrimInsetsFrameLayout(Context context)
    {
        this(context, null);
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        c = new Rect();
        context = context.obtainStyledAttributes(attributeset, android.support.design.a.i.ScrimInsetsFrameLayout, i, android.support.design.a.h.Widget_Design_ScrimInsetsFrameLayout);
        a = context.getDrawable(android.support.design.a.i.ScrimInsetsFrameLayout_insetForeground);
        context.recycle();
        setWillNotDraw(true);
        x.a(this, new r() {

            final ScrimInsetsFrameLayout a;

            public final am a(View view, am am1)
            {
                if (ScrimInsetsFrameLayout.a(a) == null)
                {
                    ScrimInsetsFrameLayout.a(a, new Rect());
                }
                ScrimInsetsFrameLayout.a(a).set(am1.a(), am1.b(), am1.c(), am1.d());
                view = a;
                boolean flag;
                if (ScrimInsetsFrameLayout.a(a).isEmpty() || ScrimInsetsFrameLayout.b(a) == null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                view.setWillNotDraw(flag);
                x.d(a);
                return am1.f();
            }

            
            {
                a = ScrimInsetsFrameLayout.this;
                super();
            }
        });
    }

    static Rect a(ScrimInsetsFrameLayout scriminsetsframelayout)
    {
        return scriminsetsframelayout.b;
    }

    static Rect a(ScrimInsetsFrameLayout scriminsetsframelayout, Rect rect)
    {
        scriminsetsframelayout.b = rect;
        return rect;
    }

    static Drawable b(ScrimInsetsFrameLayout scriminsetsframelayout)
    {
        return scriminsetsframelayout.a;
    }

    public void draw(Canvas canvas)
    {
        super.draw(canvas);
        int i = getWidth();
        int j = getHeight();
        if (b != null && a != null)
        {
            int k = canvas.save();
            canvas.translate(getScrollX(), getScrollY());
            c.set(0, 0, i, b.top);
            a.setBounds(c);
            a.draw(canvas);
            c.set(0, j - b.bottom, i, j);
            a.setBounds(c);
            a.draw(canvas);
            c.set(0, b.top, b.left, j - b.bottom);
            a.setBounds(c);
            a.draw(canvas);
            c.set(i - b.right, b.top, i, j - b.bottom);
            a.setBounds(c);
            a.draw(canvas);
            canvas.restoreToCount(k);
        }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (a != null)
        {
            a.setCallback(this);
        }
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (a != null)
        {
            a.setCallback(null);
        }
    }
}
