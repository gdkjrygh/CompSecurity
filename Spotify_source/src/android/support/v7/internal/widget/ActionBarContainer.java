// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import sr;
import ve;
import vf;

public class ActionBarContainer extends FrameLayout
{

    public View a;
    public Drawable b;
    public Drawable c;
    public Drawable d;
    public boolean e;
    private boolean f;
    private View g;
    private int h;

    public ActionBarContainer(Context context)
    {
        this(context, null);
    }

    public ActionBarContainer(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        Object obj;
        boolean flag;
        boolean flag1;
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            obj = new vf(this);
        } else
        {
            obj = new ve(this);
        }
        setBackgroundDrawable(((Drawable) (obj)));
        context = context.obtainStyledAttributes(attributeset, sr.a);
        b = context.getDrawable(sr.d);
        c = context.getDrawable(sr.f);
        h = context.getDimensionPixelSize(sr.l, -1);
        if (getId() == 0x7f110119)
        {
            e = true;
            d = context.getDrawable(sr.e);
        }
        context.recycle();
        if (e)
        {
            if (d == null)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
        } else
        if (b == null && c == null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        setWillNotDraw(flag1);
    }

    public final void a(boolean flag)
    {
        f = flag;
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

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        if (b != null && b.isStateful())
        {
            b.setState(getDrawableState());
        }
        if (c != null && c.isStateful())
        {
            c.setState(getDrawableState());
        }
        if (d != null && d.isStateful())
        {
            d.setState(getDrawableState());
        }
    }

    public void jumpDrawablesToCurrentState()
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            super.jumpDrawablesToCurrentState();
            if (b != null)
            {
                b.jumpToCurrentState();
            }
            if (c != null)
            {
                c.jumpToCurrentState();
            }
            if (d != null)
            {
                d.jumpToCurrentState();
            }
        }
    }

    public void onFinishInflate()
    {
        super.onFinishInflate();
        a = findViewById(0x7f110285);
        g = findViewById(0x7f110286);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        return f || super.onInterceptTouchEvent(motionevent);
    }

    public void onLayout(boolean flag, int i, int j, int k, int l)
    {
        boolean flag1;
        flag1 = false;
        super.onLayout(flag, i, j, k, l);
        if (!e) goto _L2; else goto _L1
_L1:
        i = ((flag1) ? 1 : 0);
        if (d == null) goto _L4; else goto _L3
_L3:
        d.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
_L7:
        i = 1;
_L4:
        if (i != 0)
        {
            invalidate();
        }
        return;
_L2:
        i = ((flag1) ? 1 : 0);
        if (b == null) goto _L4; else goto _L5
_L5:
        if (a.getVisibility() == 0)
        {
            b.setBounds(a.getLeft(), a.getTop(), a.getRight(), a.getBottom());
        } else
        if (g != null && g.getVisibility() == 0)
        {
            b.setBounds(g.getLeft(), g.getTop(), g.getRight(), g.getBottom());
        } else
        {
            b.setBounds(0, 0, 0, 0);
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void onMeasure(int i, int j)
    {
        int k = j;
        if (a == null)
        {
            k = j;
            if (android.view.View.MeasureSpec.getMode(j) == 0x80000000)
            {
                k = j;
                if (h >= 0)
                {
                    k = android.view.View.MeasureSpec.makeMeasureSpec(Math.min(h, android.view.View.MeasureSpec.getSize(j)), 0x80000000);
                }
            }
        }
        super.onMeasure(i, k);
        if (a == null)
        {
            return;
        } else
        {
            android.view.View.MeasureSpec.getMode(k);
            return;
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        super.onTouchEvent(motionevent);
        return true;
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
        if (b != null)
        {
            b.setVisible(flag, false);
        }
        if (c != null)
        {
            c.setVisible(flag, false);
        }
        if (d != null)
        {
            d.setVisible(flag, false);
        }
    }

    public ActionMode startActionModeForChild(View view, android.view.ActionMode.Callback callback)
    {
        return null;
    }

    protected boolean verifyDrawable(Drawable drawable)
    {
        return drawable == b && !e || drawable == d && e || super.verifyDrawable(drawable);
    }
}
