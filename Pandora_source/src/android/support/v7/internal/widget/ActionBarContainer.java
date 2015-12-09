// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

// Referenced classes of package android.support.v7.internal.widget:
//            ActionBarView, ScrollingTabContainerView

public class ActionBarContainer extends FrameLayout
{

    private boolean a;
    private View b;
    private ActionBarView c;
    private Drawable d;
    private Drawable e;
    private Drawable f;
    private boolean g;
    private boolean h;

    public ActionBarContainer(Context context)
    {
        this(context, null);
    }

    public ActionBarContainer(Context context, AttributeSet attributeset)
    {
        boolean flag;
        flag = true;
        super(context, attributeset);
        setBackgroundDrawable(null);
        context = context.obtainStyledAttributes(attributeset, android.support.v7.appcompat.R.styleable.ActionBar);
        d = context.getDrawable(10);
        e = context.getDrawable(11);
        if (getId() == android.support.v7.appcompat.R.id.split_action_bar)
        {
            g = true;
            f = context.getDrawable(12);
        }
        context.recycle();
        if (!g) goto _L2; else goto _L1
_L1:
        if (f != null)
        {
            flag = false;
        }
_L4:
        setWillNotDraw(flag);
        return;
_L2:
        if (d != null || e != null)
        {
            flag = false;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void a(Drawable drawable, Canvas canvas)
    {
        Rect rect = drawable.getBounds();
        if ((drawable instanceof ColorDrawable) && !rect.isEmpty() && android.os.Build.VERSION.SDK_INT < 11)
        {
            canvas.save();
            canvas.clipRect(rect);
            drawable.draw(canvas);
            canvas.restore();
            return;
        } else
        {
            drawable.draw(canvas);
            return;
        }
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        if (d != null && d.isStateful())
        {
            d.setState(getDrawableState());
        }
        if (e != null && e.isStateful())
        {
            e.setState(getDrawableState());
        }
        if (f != null && f.isStateful())
        {
            f.setState(getDrawableState());
        }
    }

    public View getTabContainer()
    {
        return b;
    }

    public void onDraw(Canvas canvas)
    {
        if (getWidth() != 0 && getHeight() != 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!g)
        {
            break; /* Loop/switch isn't completed */
        }
        if (f != null)
        {
            a(f, canvas);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (d != null)
        {
            a(d, canvas);
        }
        if (e != null && h)
        {
            a(e, canvas);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void onFinishInflate()
    {
        super.onFinishInflate();
        c = (ActionBarView)findViewById(android.support.v7.appcompat.R.id.action_bar);
    }

    public boolean onHoverEvent(MotionEvent motionevent)
    {
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        return a || super.onInterceptTouchEvent(motionevent);
    }

    public void onLayout(boolean flag, int i, int j, int k, int l)
    {
        View view;
        boolean flag1;
        int i1;
        boolean flag2;
        flag1 = true;
        flag2 = false;
        super.onLayout(flag, i, j, k, l);
        int j1;
        if (b != null && b.getVisibility() != 8)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (b == null || b.getVisibility() == 8)
        {
            break MISSING_BLOCK_LABEL_164;
        }
        l = getMeasuredHeight();
        i1 = b.getMeasuredHeight();
        if ((c.getDisplayOptions() & 2) != 0)
        {
            break MISSING_BLOCK_LABEL_207;
        }
        j1 = getChildCount();
        l = 0;
        if (l >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        view = getChildAt(l);
        if (view != b && !c.l())
        {
            view.offsetTopAndBottom(i1);
        }
        l++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_93;
_L1:
        b.layout(i, 0, k, i1);
_L3:
        if (g)
        {
            if (f != null)
            {
                f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                i = ((flag1) ? 1 : 0);
            } else
            {
                i = 0;
            }
        } else
        {
            if (d != null)
            {
                d.setBounds(c.getLeft(), c.getTop(), c.getRight(), c.getBottom());
                i = 1;
            } else
            {
                i = 0;
            }
            flag = flag2;
            if (j != 0)
            {
                flag = flag2;
                if (e != null)
                {
                    flag = true;
                }
            }
            h = flag;
            if (flag)
            {
                e.setBounds(b.getLeft(), b.getTop(), b.getRight(), b.getBottom());
                i = ((flag1) ? 1 : 0);
            }
        }
        if (i != 0)
        {
            invalidate();
        }
        return;
        b.layout(i, l - i1, k, l);
          goto _L3
    }

    public void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        if (c != null)
        {
            android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)c.getLayoutParams();
            if (c.l())
            {
                i = 0;
            } else
            {
                i = c.getMeasuredHeight();
                int k = layoutparams.topMargin;
                i = layoutparams.bottomMargin + (i + k);
            }
            if (b != null && b.getVisibility() != 8 && android.view.View.MeasureSpec.getMode(j) == 0x80000000)
            {
                j = android.view.View.MeasureSpec.getSize(j);
                setMeasuredDimension(getMeasuredWidth(), Math.min(i + b.getMeasuredHeight(), j));
                return;
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        super.onTouchEvent(motionevent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable)
    {
        boolean flag;
        flag = true;
        if (d != null)
        {
            d.setCallback(null);
            unscheduleDrawable(d);
        }
        d = drawable;
        if (drawable != null)
        {
            drawable.setCallback(this);
            if (c != null)
            {
                d.setBounds(c.getLeft(), c.getTop(), c.getRight(), c.getBottom());
            }
        }
        if (!g) goto _L2; else goto _L1
_L1:
        if (f != null)
        {
            flag = false;
        }
_L4:
        setWillNotDraw(flag);
        invalidate();
        return;
_L2:
        if (d != null || e != null)
        {
            flag = false;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void setSplitBackground(Drawable drawable)
    {
        boolean flag;
        flag = true;
        if (f != null)
        {
            f.setCallback(null);
            unscheduleDrawable(f);
        }
        f = drawable;
        if (drawable != null)
        {
            drawable.setCallback(this);
            if (g && f != null)
            {
                f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!g) goto _L2; else goto _L1
_L1:
        if (f != null)
        {
            flag = false;
        }
_L4:
        setWillNotDraw(flag);
        invalidate();
        return;
_L2:
        if (d != null || e != null)
        {
            flag = false;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void setStackedBackground(Drawable drawable)
    {
        boolean flag;
        flag = true;
        if (e != null)
        {
            e.setCallback(null);
            unscheduleDrawable(e);
        }
        e = drawable;
        if (drawable != null)
        {
            drawable.setCallback(this);
            if (h && e != null)
            {
                e.setBounds(b.getLeft(), b.getTop(), b.getRight(), b.getBottom());
            }
        }
        if (!g) goto _L2; else goto _L1
_L1:
        if (f != null)
        {
            flag = false;
        }
_L4:
        setWillNotDraw(flag);
        invalidate();
        return;
_L2:
        if (d != null || e != null)
        {
            flag = false;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void setTabContainer(ScrollingTabContainerView scrollingtabcontainerview)
    {
        if (b != null)
        {
            removeView(b);
        }
        b = scrollingtabcontainerview;
        if (scrollingtabcontainerview != null)
        {
            addView(scrollingtabcontainerview);
            android.view.ViewGroup.LayoutParams layoutparams = scrollingtabcontainerview.getLayoutParams();
            layoutparams.width = -1;
            layoutparams.height = -2;
            scrollingtabcontainerview.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean flag)
    {
        a = flag;
        int i;
        if (flag)
        {
            i = 0x60000;
        } else
        {
            i = 0x40000;
        }
        setDescendantFocusability(i);
    }

    public void setVisibility(int i)
    {
        super.setVisibility(i);
        boolean flag;
        if (i == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (d != null)
        {
            d.setVisible(flag, false);
        }
        if (e != null)
        {
            e.setVisible(flag, false);
        }
        if (f != null)
        {
            f.setVisible(flag, false);
        }
    }

    protected boolean verifyDrawable(Drawable drawable)
    {
        return drawable == d && !g || drawable == e && h || drawable == f && g || super.verifyDrawable(drawable);
    }
}
