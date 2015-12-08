// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.view.dq;
import android.support.v7.a.b;
import android.support.v7.a.g;
import android.support.v7.a.i;
import android.support.v7.a.l;
import android.support.v7.c.a;
import android.support.v7.widget.ActionMenuPresenter;
import android.support.v7.widget.ActionMenuView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;

// Referenced classes of package android.support.v7.internal.widget:
//            AbsActionBarView, an, d, at

public class ActionBarContextView extends AbsActionBarView
{

    public View g;
    public boolean h;
    private CharSequence i;
    private CharSequence j;
    private View k;
    private LinearLayout l;
    private TextView m;
    private TextView n;
    private int o;
    private int p;
    private int q;

    public ActionBarContextView(Context context)
    {
        this(context, null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, b.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        context = android.support.v7.internal.widget.an.a(context, attributeset, l.ActionMode, i1);
        setBackgroundDrawable(context.a(l.ActionMode_background));
        o = context.e(l.ActionMode_titleTextStyle, 0);
        p = context.e(l.ActionMode_subtitleTextStyle, 0);
        e = context.d(l.ActionMode_height, 0);
        q = context.e(l.ActionMode_closeItemLayout, i.abc_action_mode_close_item_material);
        ((an) (context)).a.recycle();
    }

    private void c()
    {
label0:
        {
            byte byte1 = 8;
            boolean flag = true;
            if (l == null)
            {
                LayoutInflater.from(getContext()).inflate(i.abc_action_bar_title_item, this);
                l = (LinearLayout)getChildAt(getChildCount() - 1);
                m = (TextView)l.findViewById(g.action_bar_title);
                n = (TextView)l.findViewById(g.action_bar_subtitle);
                if (o != 0)
                {
                    m.setTextAppearance(getContext(), o);
                }
                if (p != 0)
                {
                    n.setTextAppearance(getContext(), p);
                }
            }
            m.setText(i);
            n.setText(j);
            Object obj;
            byte byte0;
            int i1;
            if (!TextUtils.isEmpty(i))
            {
                byte0 = 1;
            } else
            {
                byte0 = 0;
            }
            if (TextUtils.isEmpty(j))
            {
                flag = false;
            }
            obj = n;
            if (flag)
            {
                i1 = 0;
            } else
            {
                i1 = 8;
            }
            ((TextView) (obj)).setVisibility(i1);
            obj = l;
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
        if (l.getParent() == null)
        {
            addView(l);
        }
    }

    public final volatile dq a(int i1, long l1)
    {
        return super.a(i1, l1);
    }

    public final void a(a a1)
    {
        if (g != null) goto _L2; else goto _L1
_L1:
        g = LayoutInflater.from(getContext()).inflate(q, this, false);
        addView(g);
_L4:
        g.findViewById(g.action_mode_close_button).setOnClickListener(new d(this, a1));
        a1 = (android.support.v7.internal.view.menu.i)a1.b();
        if (d != null)
        {
            d.e();
        }
        d = new ActionMenuPresenter(getContext());
        d.b();
        android.view.ViewGroup.LayoutParams layoutparams = new android.view.ViewGroup.LayoutParams(-2, -1);
        a1.a(d, b);
        c = (ActionMenuView)d.a(this);
        c.setBackgroundDrawable(null);
        addView(c, layoutparams);
        return;
_L2:
        if (g.getParent() == null)
        {
            addView(g);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final boolean a()
    {
        if (d != null)
        {
            return d.c();
        } else
        {
            return false;
        }
    }

    public final void b()
    {
        removeAllViews();
        k = null;
        c = null;
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new android.view.ViewGroup.MarginLayoutParams(-1, -2);
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return new android.view.ViewGroup.MarginLayoutParams(getContext(), attributeset);
    }

    public volatile int getAnimatedVisibility()
    {
        return super.getAnimatedVisibility();
    }

    public volatile int getContentHeight()
    {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle()
    {
        return j;
    }

    public CharSequence getTitle()
    {
        return i;
    }

    public void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (d != null)
        {
            d.d();
            d.f();
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
                accessibilityevent.setContentDescription(i);
            }
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityevent);
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        flag = android.support.v7.internal.widget.at.a(this);
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
        if (g != null)
        {
            j1 = i2;
            if (g.getVisibility() != 8)
            {
                Object obj = (android.view.ViewGroup.MarginLayoutParams)g.getLayoutParams();
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
                j1 = a(j1 + a(g, j1, j2, k2, flag), l1, flag);
            }
        }
        l1 = j1;
        if (l != null)
        {
            l1 = j1;
            if (k == null)
            {
                l1 = j1;
                if (l.getVisibility() != 8)
                {
                    l1 = j1 + a(l, j1, j2, k2, flag);
                }
            }
        }
        if (k != null)
        {
            a(k, l1, j2, k2, flag);
        }
        if (flag)
        {
            i1 = getPaddingLeft();
        } else
        {
            i1 = k1 - i1 - getPaddingRight();
        }
        if (c != null)
        {
            obj = c;
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
        if (e > 0)
        {
            k1 = e;
        } else
        {
            k1 = android.view.View.MeasureSpec.getSize(j1);
        }
        l2 = getPaddingTop() + getPaddingBottom();
        i1 = k2 - getPaddingLeft() - getPaddingRight();
        j2 = k1 - l2;
        l1 = android.view.View.MeasureSpec.makeMeasureSpec(j2, 0x80000000);
        j1 = i1;
        if (g != null)
        {
            i1 = a(g, i1, l1);
            android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)g.getLayoutParams();
            j1 = marginlayoutparams.leftMargin;
            j1 = i1 - (marginlayoutparams.rightMargin + j1);
        }
        i1 = j1;
        if (c != null)
        {
            i1 = j1;
            if (c.getParent() == this)
            {
                i1 = a(c, j1, l1);
            }
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1;
            if (k == null)
            {
                if (h)
                {
                    j1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                    l.measure(j1, l1);
                    int i3 = l.getMeasuredWidth();
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
                    obj = l;
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
                    j1 = a(l, i1, l1);
                }
            }
        }
        if (k != null)
        {
            obj = k.getLayoutParams();
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
            k.measure(android.view.View.MeasureSpec.makeMeasureSpec(l1, i1), android.view.View.MeasureSpec.makeMeasureSpec(i2, j1));
        }
        if (e <= 0)
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

    public void setContentHeight(int i1)
    {
        e = i1;
    }

    public void setCustomView(View view)
    {
        if (k != null)
        {
            removeView(k);
        }
        k = view;
        if (view != null && l != null)
        {
            removeView(l);
            l = null;
        }
        if (view != null)
        {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charsequence)
    {
        j = charsequence;
        c();
    }

    public void setTitle(CharSequence charsequence)
    {
        i = charsequence;
        c();
    }

    public void setTitleOptional(boolean flag)
    {
        if (flag != h)
        {
            requestLayout();
        }
        h = flag;
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
