// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.a.g;
import android.support.v7.a.l;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

// Referenced classes of package android.support.v7.internal.widget:
//            f, e, ah

public class ActionBarContainer extends FrameLayout
{

    Drawable a;
    Drawable b;
    Drawable c;
    boolean d;
    boolean e;
    private boolean f;
    private View g;
    private View h;
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
            obj = new f(this);
        } else
        {
            obj = new e(this);
        }
        setBackgroundDrawable(((Drawable) (obj)));
        context = context.obtainStyledAttributes(attributeset, l.a);
        a = context.getDrawable(l.d);
        b = context.getDrawable(l.f);
        j = context.getDimensionPixelSize(l.l, -1);
        if (getId() == g.t)
        {
            d = true;
            c = context.getDrawable(l.e);
        }
        context.recycle();
        if (d)
        {
            if (c == null)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
        } else
        if (a == null && b == null)
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
        int i1 = layoutparams.topMargin;
        return layoutparams.bottomMargin + (k + i1);
    }

    public final View a()
    {
        return g;
    }

    public final void a(ah ah1)
    {
        if (g != null)
        {
            removeView(g);
        }
        g = ah1;
        if (ah1 != null)
        {
            addView(ah1);
            android.view.ViewGroup.LayoutParams layoutparams = ah1.getLayoutParams();
            layoutparams.width = -1;
            layoutparams.height = -2;
            ah1.a(false);
        }
    }

    public final void a(boolean flag)
    {
        f = flag;
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
        if (a != null && a.isStateful())
        {
            a.setState(getDrawableState());
        }
        if (b != null && b.isStateful())
        {
            b.setState(getDrawableState());
        }
        if (c != null && c.isStateful())
        {
            c.setState(getDrawableState());
        }
    }

    public void jumpDrawablesToCurrentState()
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            super.jumpDrawablesToCurrentState();
            if (a != null)
            {
                a.jumpToCurrentState();
            }
            if (b != null)
            {
                b.jumpToCurrentState();
            }
            if (c != null)
            {
                c.jumpToCurrentState();
            }
        }
    }

    public void onFinishInflate()
    {
        super.onFinishInflate();
        h = findViewById(g.a);
        i = findViewById(g.f);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        return f || super.onInterceptTouchEvent(motionevent);
    }

    public void onLayout(boolean flag, int k, int i1, int j1, int k1)
    {
label0:
        {
            {
                boolean flag1 = true;
                super.onLayout(flag, k, i1, j1, k1);
                View view = g;
                if (view != null && view.getVisibility() != 8)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (view != null && view.getVisibility() != 8)
                {
                    i1 = getMeasuredHeight();
                    android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)view.getLayoutParams();
                    view.layout(k, i1 - view.getMeasuredHeight() - layoutparams.bottomMargin, j1, i1 - layoutparams.bottomMargin);
                }
                if (!d)
                {
                    break label0;
                }
                if (c != null)
                {
                    c.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
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
        if (a != null)
        {
            if (h.getVisibility() == 0)
            {
                a.setBounds(h.getLeft(), h.getTop(), h.getRight(), h.getBottom());
            } else
            if (i != null && i.getVisibility() == 0)
            {
                a.setBounds(i.getLeft(), i.getTop(), i.getRight(), i.getBottom());
            } else
            {
                a.setBounds(0, 0, 0, 0);
            }
            k = 1;
        } else
        {
            k = 0;
        }
        e = flag;
        if (flag && b != null)
        {
            b.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            k = ((flag1) ? 1 : 0);
        }
        if (false)
        {
        } else
        {
            break MISSING_BLOCK_LABEL_129;
        }
    }

    public void onMeasure(int k, int i1)
    {
        int j1 = i1;
        if (h == null)
        {
            j1 = i1;
            if (android.view.View.MeasureSpec.getMode(i1) == 0x80000000)
            {
                j1 = i1;
                if (j >= 0)
                {
                    j1 = android.view.View.MeasureSpec.makeMeasureSpec(Math.min(j, android.view.View.MeasureSpec.getSize(i1)), 0x80000000);
                }
            }
        }
        super.onMeasure(k, j1);
        if (h != null)
        {
            i1 = android.view.View.MeasureSpec.getMode(j1);
            if (g != null && g.getVisibility() != 8 && i1 != 0x40000000)
            {
                if (!a(h))
                {
                    k = b(h);
                } else
                if (!a(i))
                {
                    k = b(i);
                } else
                {
                    k = 0;
                }
                if (i1 == 0x80000000)
                {
                    i1 = android.view.View.MeasureSpec.getSize(j1);
                } else
                {
                    i1 = 0x7fffffff;
                }
                setMeasuredDimension(getMeasuredWidth(), Math.min(k + b(g), i1));
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
        if (a != null)
        {
            a.setVisible(flag, false);
        }
        if (b != null)
        {
            b.setVisible(flag, false);
        }
        if (c != null)
        {
            c.setVisible(flag, false);
        }
    }

    public ActionMode startActionModeForChild(View view, android.view.ActionMode.Callback callback)
    {
        return null;
    }

    protected boolean verifyDrawable(Drawable drawable)
    {
        return drawable == a && !d || drawable == b && e || drawable == c && d || super.verifyDrawable(drawable);
    }
}
