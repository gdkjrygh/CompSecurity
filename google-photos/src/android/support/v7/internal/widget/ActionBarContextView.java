// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import aav;
import aay;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.ActionMenuView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import b;
import ob;
import uh;
import vu;
import wq;
import wu;
import yj;
import yo;

public class ActionBarContextView extends wq
{

    public CharSequence f;
    public CharSequence g;
    public View h;
    public boolean i;
    private View j;
    private LinearLayout k;
    private TextView l;
    private TextView m;
    private int n;
    private int o;
    private int p;

    public ActionBarContextView(Context context)
    {
        this(context, null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, b.r);
    }

    public ActionBarContextView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        context = yj.a(context, attributeset, uh.x, i1, 0);
        setBackgroundDrawable(context.a(uh.y));
        n = context.f(uh.C, 0);
        o = context.f(uh.B, 0);
        d = context.e(uh.A, 0);
        p = context.f(uh.z, b.bu);
        ((yj) (context)).a.recycle();
    }

    private void c()
    {
label0:
        {
            byte byte1 = 8;
            boolean flag = true;
            if (k == null)
            {
                LayoutInflater.from(getContext()).inflate(b.br, this);
                k = (LinearLayout)getChildAt(getChildCount() - 1);
                l = (TextView)k.findViewById(b.aT);
                m = (TextView)k.findViewById(b.aS);
                if (n != 0)
                {
                    l.setTextAppearance(getContext(), n);
                }
                if (o != 0)
                {
                    m.setTextAppearance(getContext(), o);
                }
            }
            l.setText(f);
            m.setText(g);
            Object obj;
            byte byte0;
            int i1;
            if (!TextUtils.isEmpty(f))
            {
                byte0 = 1;
            } else
            {
                byte0 = 0;
            }
            if (TextUtils.isEmpty(g))
            {
                flag = false;
            }
            obj = m;
            if (flag)
            {
                i1 = 0;
            } else
            {
                i1 = 8;
            }
            ((TextView) (obj)).setVisibility(i1);
            obj = k;
            if (byte0 == 0)
            {
                byte0 = byte1;
                if (!flag)
                {
                    break label0;
                }
            }
            byte0 = 0;
        }
        ((LinearLayout) (obj)).setVisibility(byte0);
        if (k.getParent() == null)
        {
            addView(k);
        }
    }

    public final volatile ob a(int i1, long l1)
    {
        return super.a(i1, l1);
    }

    public final void a(int i1)
    {
        d = i1;
    }

    public final void a(aav aav1)
    {
        if (h != null) goto _L2; else goto _L1
_L1:
        h = LayoutInflater.from(getContext()).inflate(p, this, false);
        addView(h);
_L4:
        h.findViewById(b.aW).setOnClickListener(new wu(this, aav1));
        aav1 = (vu)aav1.b();
        if (c != null)
        {
            c.d();
        }
        c = new aay(getContext());
        c.c(true);
        android.view.ViewGroup.LayoutParams layoutparams = new android.view.ViewGroup.LayoutParams(-2, -1);
        aav1.a(c, a);
        b = (ActionMenuView)c.a(this);
        b.setBackgroundDrawable(null);
        addView(b, layoutparams);
        return;
_L2:
        if (h.getParent() == null)
        {
            addView(h);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(View view)
    {
        if (j != null)
        {
            removeView(j);
        }
        j = view;
        if (view != null && k != null)
        {
            removeView(k);
            k = null;
        }
        if (view != null)
        {
            addView(view);
        }
        requestLayout();
    }

    public final void a(CharSequence charsequence)
    {
        f = charsequence;
        c();
    }

    public final void a(boolean flag)
    {
        if (flag != i)
        {
            requestLayout();
        }
        i = flag;
    }

    public final boolean a()
    {
        if (c != null)
        {
            return c.b();
        } else
        {
            return false;
        }
    }

    public final void b()
    {
        removeAllViews();
        j = null;
        b = null;
    }

    public final void b(CharSequence charsequence)
    {
        g = charsequence;
        c();
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new android.view.ViewGroup.MarginLayoutParams(-1, -2);
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return new android.view.ViewGroup.MarginLayoutParams(getContext(), attributeset);
    }

    public void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (c != null)
        {
            c.c();
            c.e();
        }
    }

    public volatile boolean onHoverEvent(MotionEvent motionevent)
    {
        return super.onHoverEvent(motionevent);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
label0:
        {
            if (android.os.Build.VERSION.SDK_INT >= 14)
            {
                if (accessibilityevent.getEventType() != 32)
                {
                    break label0;
                }
                accessibilityevent.setSource(this);
                accessibilityevent.setClassName(getClass().getName());
                accessibilityevent.setPackageName(getContext().getPackageName());
                accessibilityevent.setContentDescription(f);
            }
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityevent);
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        flag = yo.a(this);
        int i2;
        int j2;
        int k2;
        if (flag)
        {
            i2 = k1 - i1 - getPaddingRight();
        } else
        {
            i2 = getPaddingLeft();
        }
        j2 = getPaddingTop();
        k2 = l1 - j1 - getPaddingTop() - getPaddingBottom();
        j1 = i2;
        if (h != null)
        {
            j1 = i2;
            if (h.getVisibility() != 8)
            {
                Object obj = (android.view.ViewGroup.MarginLayoutParams)h.getLayoutParams();
                if (flag)
                {
                    j1 = ((android.view.ViewGroup.MarginLayoutParams) (obj)).rightMargin;
                } else
                {
                    j1 = ((android.view.ViewGroup.MarginLayoutParams) (obj)).leftMargin;
                }
                if (flag)
                {
                    l1 = ((android.view.ViewGroup.MarginLayoutParams) (obj)).leftMargin;
                } else
                {
                    l1 = ((android.view.ViewGroup.MarginLayoutParams) (obj)).rightMargin;
                }
                j1 = a(i2, j1, flag);
                j1 = a(j1 + a(h, j1, j2, k2, flag), l1, flag);
            }
        }
        l1 = j1;
        if (k != null)
        {
            l1 = j1;
            if (j == null)
            {
                l1 = j1;
                if (k.getVisibility() != 8)
                {
                    l1 = j1 + a(k, j1, j2, k2, flag);
                }
            }
        }
        if (j != null)
        {
            a(j, l1, j2, k2, flag);
        }
        if (flag)
        {
            i1 = getPaddingLeft();
        } else
        {
            i1 = k1 - i1 - getPaddingRight();
        }
        if (b != null)
        {
            obj = b;
            if (!flag)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a(((View) (obj)), i1, j2, k2, flag);
        }
    }

    protected void onMeasure(int i1, int j1)
    {
        int i2 = 0x40000000;
        boolean flag = false;
        if (android.view.View.MeasureSpec.getMode(i1) != 0x40000000)
        {
            throw new IllegalStateException((new StringBuilder()).append(getClass().getSimpleName()).append(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)").toString());
        }
        if (android.view.View.MeasureSpec.getMode(j1) == 0)
        {
            throw new IllegalStateException((new StringBuilder()).append(getClass().getSimpleName()).append(" can only be used with android:layout_height=\"wrap_content\"").toString());
        }
        int k2 = android.view.View.MeasureSpec.getSize(i1);
        int k1;
        int l1;
        int j2;
        int l2;
        if (d > 0)
        {
            k1 = d;
        } else
        {
            k1 = android.view.View.MeasureSpec.getSize(j1);
        }
        l2 = getPaddingTop() + getPaddingBottom();
        i1 = k2 - getPaddingLeft() - getPaddingRight();
        j2 = k1 - l2;
        l1 = android.view.View.MeasureSpec.makeMeasureSpec(j2, 0x80000000);
        j1 = i1;
        if (h != null)
        {
            i1 = a(h, i1, l1, 0);
            android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)h.getLayoutParams();
            j1 = marginlayoutparams.leftMargin;
            j1 = i1 - (marginlayoutparams.rightMargin + j1);
        }
        i1 = j1;
        if (b != null)
        {
            i1 = j1;
            if (b.getParent() == this)
            {
                i1 = a(b, j1, l1, 0);
            }
        }
        j1 = i1;
        if (k != null)
        {
            j1 = i1;
            if (j == null)
            {
                if (i)
                {
                    j1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                    k.measure(j1, l1);
                    int i3 = k.getMeasuredWidth();
                    Object obj;
                    if (i3 <= i1)
                    {
                        l1 = 1;
                    } else
                    {
                        l1 = 0;
                    }
                    j1 = i1;
                    if (l1 != 0)
                    {
                        j1 = i1 - i3;
                    }
                    obj = k;
                    if (l1 != 0)
                    {
                        i1 = 0;
                    } else
                    {
                        i1 = 8;
                    }
                    ((LinearLayout) (obj)).setVisibility(i1);
                } else
                {
                    j1 = a(k, i1, l1, 0);
                }
            }
        }
        if (j != null)
        {
            obj = j.getLayoutParams();
            if (((android.view.ViewGroup.LayoutParams) (obj)).width != -2)
            {
                i1 = 0x40000000;
            } else
            {
                i1 = 0x80000000;
            }
            l1 = j1;
            if (((android.view.ViewGroup.LayoutParams) (obj)).width >= 0)
            {
                l1 = Math.min(((android.view.ViewGroup.LayoutParams) (obj)).width, j1);
            }
            if (((android.view.ViewGroup.LayoutParams) (obj)).height != -2)
            {
                j1 = i2;
            } else
            {
                j1 = 0x80000000;
            }
            if (((android.view.ViewGroup.LayoutParams) (obj)).height >= 0)
            {
                i2 = Math.min(((android.view.ViewGroup.LayoutParams) (obj)).height, j2);
            } else
            {
                i2 = j2;
            }
            j.measure(android.view.View.MeasureSpec.makeMeasureSpec(l1, i1), android.view.View.MeasureSpec.makeMeasureSpec(i2, j1));
        }
        if (d <= 0)
        {
            l1 = getChildCount();
            i1 = 0;
            for (j1 = ((flag) ? 1 : 0); j1 < l1; j1++)
            {
                k1 = getChildAt(j1).getMeasuredHeight() + l2;
                if (k1 > i1)
                {
                    i1 = k1;
                }
            }

            setMeasuredDimension(k2, i1);
            return;
        } else
        {
            setMeasuredDimension(k2, k1);
            return;
        }
    }

    public volatile boolean onTouchEvent(MotionEvent motionevent)
    {
        return super.onTouchEvent(motionevent);
    }

    public volatile void setVisibility(int i1)
    {
        super.setVisibility(i1);
    }

    public boolean shouldDelayChildPressedState()
    {
        return false;
    }
}
