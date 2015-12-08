// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.view.bp;
import android.support.v4.view.cy;
import android.support.v4.view.do;
import android.support.v7.a.b;
import android.support.v7.a.g;
import android.support.v7.a.i;
import android.support.v7.a.l;
import android.support.v7.c.a;
import android.support.v7.widget.ActionMenuPresenter;
import android.support.v7.widget.ActionMenuView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;

// Referenced classes of package android.support.v7.internal.widget:
//            a, az, g, be

public class ActionBarContextView extends android.support.v7.internal.widget.a
    implements do
{

    private CharSequence i;
    private CharSequence j;
    private View k;
    private View l;
    private LinearLayout m;
    private TextView n;
    private TextView o;
    private int p;
    private int q;
    private Drawable r;
    private boolean s;
    private int t;
    private android.support.v7.internal.view.i u;
    private boolean v;
    private int w;

    public ActionBarContextView(Context context)
    {
        this(context, null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, b.j);
    }

    public ActionBarContextView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        context = android.support.v7.internal.widget.az.a(context, attributeset, l.y, i1);
        setBackgroundDrawable(context.a(l.z));
        p = context.f(l.E, 0);
        q = context.f(l.D, 0);
        g = context.e(l.C, 0);
        r = context.a(l.A);
        t = context.f(l.B, i.d);
        context.b();
    }

    private void g()
    {
label0:
        {
            byte byte1 = 8;
            boolean flag = true;
            if (m == null)
            {
                LayoutInflater.from(getContext()).inflate(i.a, this);
                m = (LinearLayout)getChildAt(getChildCount() - 1);
                n = (TextView)m.findViewById(g.e);
                o = (TextView)m.findViewById(g.d);
                if (p != 0)
                {
                    n.setTextAppearance(getContext(), p);
                }
                if (q != 0)
                {
                    o.setTextAppearance(getContext(), q);
                }
            }
            n.setText(i);
            o.setText(j);
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
            obj = o;
            if (flag)
            {
                i1 = 0;
            } else
            {
                i1 = 8;
            }
            ((TextView) (obj)).setVisibility(i1);
            obj = m;
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
        if (m.getParent() == null)
        {
            addView(m);
        }
    }

    private void h()
    {
        android.support.v7.internal.view.i i1 = u;
        if (i1 != null)
        {
            u = null;
            i1.b();
        }
    }

    public final void a(int i1)
    {
        g = i1;
    }

    public final void a(a a1)
    {
        android.view.ViewGroup.LayoutParams layoutparams;
        if (k == null)
        {
            k = LayoutInflater.from(getContext()).inflate(t, this, false);
            addView(k);
        } else
        if (k.getParent() == null)
        {
            addView(k);
        }
        k.findViewById(g.i).setOnClickListener(new android.support.v7.internal.widget.g(this, a1));
        a1 = (android.support.v7.internal.view.menu.i)a1.b();
        if (d != null)
        {
            d.i();
        }
        d = new ActionMenuPresenter(getContext());
        d.d();
        layoutparams = new android.view.ViewGroup.LayoutParams(-2, -1);
        if (!f)
        {
            a1.a(d, b);
            c = (ActionMenuView)d.a(this);
            c.setBackgroundDrawable(null);
            addView(c, layoutparams);
        } else
        {
            d.b(getContext().getResources().getDisplayMetrics().widthPixels);
            d.e();
            layoutparams.width = -1;
            layoutparams.height = g;
            a1.a(d, b);
            c = (ActionMenuView)d.a(this);
            c.setBackgroundDrawable(r);
            e.addView(c, layoutparams);
        }
        v = true;
    }

    public final void a(View view)
    {
    }

    public final void a(CharSequence charsequence)
    {
        i = charsequence;
        g();
    }

    public final void a(boolean flag)
    {
        if (flag != s)
        {
            requestLayout();
        }
        s = flag;
    }

    public final boolean a()
    {
        if (d != null)
        {
            return d.g();
        } else
        {
            return false;
        }
    }

    public final CharSequence b()
    {
        return i;
    }

    public final volatile void b(int i1)
    {
        super.b(i1);
    }

    public final void b(View view)
    {
        if (w == 2)
        {
            e();
        }
        w = 0;
    }

    public final void b(CharSequence charsequence)
    {
        j = charsequence;
        g();
    }

    public final CharSequence c()
    {
        return j;
    }

    public final void c(View view)
    {
    }

    public final void d()
    {
        if (w == 2)
        {
            return;
        }
        if (k == null)
        {
            e();
            return;
        }
        h();
        w = 2;
        cy cy1 = bp.o(k).b(-k.getWidth() - ((android.view.ViewGroup.MarginLayoutParams)k.getLayoutParams()).leftMargin);
        cy1.a(200L);
        cy1.a(this);
        cy1.a(new DecelerateInterpolator());
        android.support.v7.internal.view.i i1 = new android.support.v7.internal.view.i();
        i1.a(cy1);
        if (c != null)
        {
            c.getChildCount();
        }
        u = i1;
        u.a();
    }

    public final void d(View view)
    {
        if (l != null)
        {
            removeView(l);
        }
        l = view;
        if (m != null)
        {
            removeView(m);
            m = null;
        }
        if (view != null)
        {
            addView(view);
        }
        requestLayout();
    }

    public final void e()
    {
        h();
        removeAllViews();
        if (e != null)
        {
            e.removeView(c);
        }
        l = null;
        c = null;
        v = false;
    }

    public final boolean f()
    {
        return s;
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
        if (d != null)
        {
            d.h();
            d.j();
        }
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
        flag = android.support.v7.internal.widget.be.a(this);
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
        if (k != null)
        {
            j1 = i2;
            if (k.getVisibility() != 8)
            {
                Object obj = (android.view.ViewGroup.MarginLayoutParams)k.getLayoutParams();
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
                l1 = a(j1 + a(k, j1, j2, k2, flag), l1, flag);
                j1 = l1;
                if (v)
                {
                    w = 1;
                    bp.a(k, -k.getWidth() - ((android.view.ViewGroup.MarginLayoutParams)k.getLayoutParams()).leftMargin);
                    cy cy1 = bp.o(k).b(0.0F);
                    cy1.a(200L);
                    cy1.a(this);
                    cy1.a(new DecelerateInterpolator());
                    obj = new android.support.v7.internal.view.i();
                    ((android.support.v7.internal.view.i) (obj)).a(cy1);
                    if (c != null)
                    {
                        j1 = c.getChildCount();
                        if (j1 > 0)
                        {
                            for (j1--; j1 >= 0; j1--)
                            {
                                Object obj1 = c.getChildAt(j1);
                                bp.e(((View) (obj1)), 0.0F);
                                obj1 = bp.o(((View) (obj1))).a();
                                ((cy) (obj1)).a(300L);
                                ((android.support.v7.internal.view.i) (obj)).a(((cy) (obj1)));
                            }

                        }
                    }
                    u = ((android.support.v7.internal.view.i) (obj));
                    u.a();
                    v = false;
                    j1 = l1;
                }
            }
        }
        l1 = j1;
        if (m != null)
        {
            l1 = j1;
            if (l == null)
            {
                l1 = j1;
                if (m.getVisibility() != 8)
                {
                    l1 = j1 + a(m, j1, j2, k2, flag);
                }
            }
        }
        if (l != null)
        {
            a(l, l1, j2, k2, flag);
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
            ActionMenuView actionmenuview = c;
            if (!flag)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a(actionmenuview, i1, j2, k2, flag);
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
        if (g > 0)
        {
            k1 = g;
        } else
        {
            k1 = android.view.View.MeasureSpec.getSize(j1);
        }
        l2 = getPaddingTop() + getPaddingBottom();
        i1 = k2 - getPaddingLeft() - getPaddingRight();
        j2 = k1 - l2;
        l1 = android.view.View.MeasureSpec.makeMeasureSpec(j2, 0x80000000);
        j1 = i1;
        if (k != null)
        {
            i1 = a(k, i1, l1);
            android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)k.getLayoutParams();
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
        if (m != null)
        {
            j1 = i1;
            if (l == null)
            {
                if (s)
                {
                    j1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                    m.measure(j1, l1);
                    int i3 = m.getMeasuredWidth();
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
                    obj = m;
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
                    j1 = a(m, i1, l1);
                }
            }
        }
        if (l != null)
        {
            obj = l.getLayoutParams();
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
            l.measure(android.view.View.MeasureSpec.makeMeasureSpec(l1, i1), android.view.View.MeasureSpec.makeMeasureSpec(i2, j1));
        }
        if (g <= 0)
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

    public boolean shouldDelayChildPressedState()
    {
        return false;
    }
}
