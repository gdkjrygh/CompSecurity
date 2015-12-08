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
import b;
import uh;
import ws;
import wt;
import xx;

public class ActionBarContainer extends FrameLayout
{

    View a;
    public View b;
    public Drawable c;
    public Drawable d;
    public Drawable e;
    public boolean f;
    public boolean g;
    private boolean h;
    private View i;
    private int j;

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
            obj = new wt(this);
        } else
        {
            obj = new ws(this);
        }
        setBackgroundDrawable(((Drawable) (obj)));
        context = context.obtainStyledAttributes(attributeset, uh.a);
        c = context.getDrawable(uh.b);
        d = context.getDrawable(uh.d);
        j = context.getDimensionPixelSize(uh.j, -1);
        if (getId() == b.bl)
        {
            f = true;
            e = context.getDrawable(uh.c);
        }
        context.recycle();
        if (f)
        {
            if (e == null)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
        } else
        if (c == null && d == null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        setWillNotDraw(flag1);
    }

    private static boolean a(View view)
    {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    private static int b(View view)
    {
        android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)view.getLayoutParams();
        int k = view.getMeasuredHeight();
        int l = layoutparams.topMargin;
        return layoutparams.bottomMargin + (k + l);
    }

    public final void a(xx xx1)
    {
        if (a != null)
        {
            removeView(a);
        }
        a = xx1;
        if (xx1 != null)
        {
            addView(xx1);
            android.view.ViewGroup.LayoutParams layoutparams = xx1.getLayoutParams();
            layoutparams.width = -1;
            layoutparams.height = -2;
            xx1.b = false;
        }
    }

    public final void a(boolean flag)
    {
        h = flag;
        int k;
        if (flag)
        {
            k = 0x60000;
        } else
        {
            k = 0x40000;
        }
        setDescendantFocusability(k);
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        if (c != null && c.isStateful())
        {
            c.setState(getDrawableState());
        }
        if (d != null && d.isStateful())
        {
            d.setState(getDrawableState());
        }
        if (e != null && e.isStateful())
        {
            e.setState(getDrawableState());
        }
    }

    public void jumpDrawablesToCurrentState()
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            super.jumpDrawablesToCurrentState();
            if (c != null)
            {
                c.jumpToCurrentState();
            }
            if (d != null)
            {
                d.jumpToCurrentState();
            }
            if (e != null)
            {
                e.jumpToCurrentState();
            }
        }
    }

    public void onFinishInflate()
    {
        super.onFinishInflate();
        b = findViewById(b.aP);
        i = findViewById(b.aU);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        return h || super.onInterceptTouchEvent(motionevent);
    }

    public void onLayout(boolean flag, int k, int l, int i1, int j1)
    {
label0:
        {
            {
                boolean flag1 = true;
                super.onLayout(flag, k, l, i1, j1);
                View view = a;
                if (view != null && view.getVisibility() != 8)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (view != null && view.getVisibility() != 8)
                {
                    l = getMeasuredHeight();
                    android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)view.getLayoutParams();
                    view.layout(k, l - view.getMeasuredHeight() - layoutparams.bottomMargin, i1, l - layoutparams.bottomMargin);
                }
                if (!f)
                {
                    break label0;
                }
                if (e != null)
                {
                    e.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                    k = ((flag1) ? 1 : 0);
                } else
                {
                    k = 0;
                }
            }
            if (k != 0)
            {
                invalidate();
            }
            return;
        }
        if (c != null)
        {
            if (b.getVisibility() == 0)
            {
                c.setBounds(b.getLeft(), b.getTop(), b.getRight(), b.getBottom());
            } else
            if (i != null && i.getVisibility() == 0)
            {
                c.setBounds(i.getLeft(), i.getTop(), i.getRight(), i.getBottom());
            } else
            {
                c.setBounds(0, 0, 0, 0);
            }
            k = 1;
        } else
        {
            k = 0;
        }
        g = flag;
        if (flag && d != null)
        {
            d.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            k = ((flag1) ? 1 : 0);
        }
        if (false)
        {
        } else
        {
            break MISSING_BLOCK_LABEL_129;
        }
    }

    public void onMeasure(int k, int l)
    {
        int i1 = l;
        if (b == null)
        {
            i1 = l;
            if (android.view.View.MeasureSpec.getMode(l) == 0x80000000)
            {
                i1 = l;
                if (j >= 0)
                {
                    i1 = android.view.View.MeasureSpec.makeMeasureSpec(Math.min(j, android.view.View.MeasureSpec.getSize(l)), 0x80000000);
                }
            }
        }
        super.onMeasure(k, i1);
        if (b != null)
        {
            l = android.view.View.MeasureSpec.getMode(i1);
            if (a != null && a.getVisibility() != 8 && l != 0x40000000)
            {
                if (!a(b))
                {
                    k = b(b);
                } else
                if (!a(i))
                {
                    k = b(i);
                } else
                {
                    k = 0;
                }
                if (l == 0x80000000)
                {
                    l = android.view.View.MeasureSpec.getSize(i1);
                } else
                {
                    l = 0x7fffffff;
                }
                setMeasuredDimension(getMeasuredWidth(), Math.min(k + b(a), l));
                return;
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        super.onTouchEvent(motionevent);
        return true;
    }

    public void setVisibility(int k)
    {
        super.setVisibility(k);
        boolean flag;
        if (k == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (c != null)
        {
            c.setVisible(flag, false);
        }
        if (d != null)
        {
            d.setVisible(flag, false);
        }
        if (e != null)
        {
            e.setVisible(flag, false);
        }
    }

    public ActionMode startActionModeForChild(View view, android.view.ActionMode.Callback callback)
    {
        return null;
    }

    protected boolean verifyDrawable(Drawable drawable)
    {
        return drawable == c && !f || drawable == d && g || drawable == e && f || super.verifyDrawable(drawable);
    }
}
