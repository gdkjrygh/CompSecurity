// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.content.a;
import android.support.v4.view.am;
import android.support.v4.view.r;
import android.support.v4.view.x;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

// Referenced classes of package android.support.design.widget:
//            d, a, w, p, 
//            v, AppBarLayout, s

public class CollapsingToolbarLayout extends FrameLayout
{
    public static final class a extends android.widget.FrameLayout.LayoutParams
    {

        int a;
        float b;

        public a(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            a = 0;
            b = 0.5F;
            context = context.obtainStyledAttributes(attributeset, android.support.design.a.i.CollapsingAppBarLayout_LayoutParams);
            a = context.getInt(android.support.design.a.i.CollapsingAppBarLayout_LayoutParams_layout_collapseMode, 0);
            b = context.getFloat(android.support.design.a.i.CollapsingAppBarLayout_LayoutParams_layout_collapseParallaxMultiplier, 0.5F);
            context.recycle();
        }

        public a(android.view.ViewGroup.LayoutParams layoutparams)
        {
            super(layoutparams);
            a = 0;
            b = 0.5F;
        }

        public a(android.widget.FrameLayout.LayoutParams layoutparams)
        {
            super(layoutparams);
            a = 0;
            b = 0.5F;
        }
    }

    private final class b
        implements AppBarLayout.a
    {

        final CollapsingToolbarLayout a;

        public final void a(AppBarLayout appbarlayout, int i1)
        {
            View view;
            a a1;
            v v1;
            int j1;
            int i2;
            CollapsingToolbarLayout.b(a, i1);
            int k1;
            int j2;
            if (android.support.design.widget.CollapsingToolbarLayout.a(a) != null)
            {
                j1 = android.support.design.widget.CollapsingToolbarLayout.a(a).b();
            } else
            {
                j1 = 0;
            }
            i2 = appbarlayout.a();
            k1 = 0;
            j2 = a.getChildCount();
            if (k1 >= j2)
            {
                break MISSING_BLOCK_LABEL_174;
            }
            view = a.getChildAt(k1);
            a1 = (a)view.getLayoutParams();
            v1 = android.support.design.widget.CollapsingToolbarLayout.a(view);
            switch (a1.a)
            {
            default:
                break;

            case 1: // '\001'
                break; /* Loop/switch isn't completed */

            case 2: // '\002'
                break;
            }
            break MISSING_BLOCK_LABEL_153;
_L4:
            k1++;
            if (true) goto _L2; else goto _L1
_L2:
            break MISSING_BLOCK_LABEL_49;
_L1:
            if ((a.getHeight() - j1) + i1 >= view.getHeight())
            {
                v1.a(-i1);
            }
            continue; /* Loop/switch isn't completed */
            v1.a(Math.round((float)(-i1) * a1.b));
            if (true) goto _L4; else goto _L3
_L3:
            int l1;
            int k2;
            if (CollapsingToolbarLayout.b(a) != null || CollapsingToolbarLayout.c(a) != null)
            {
                if (a.getHeight() + i1 < x.r(a) * 2 + j1)
                {
                    CollapsingToolbarLayout.d(a);
                } else
                {
                    CollapsingToolbarLayout.e(a);
                }
            }
            if (CollapsingToolbarLayout.c(a) != null && j1 > 0)
            {
                x.d(a);
            }
            l1 = a.getHeight();
            k2 = x.r(a);
            CollapsingToolbarLayout.f(a).b((float)Math.abs(i1) / (float)(l1 - k2 - j1));
            if (Math.abs(i1) == i2)
            {
                x.f(appbarlayout, appbarlayout.g());
                return;
            } else
            {
                x.f(appbarlayout, 0.0F);
                return;
            }
        }

        private b()
        {
            a = CollapsingToolbarLayout.this;
            super();
        }

        b(byte byte0)
        {
            this();
        }
    }


    private boolean a;
    private int b;
    private Toolbar c;
    private View d;
    private int e;
    private int f;
    private int g;
    private int h;
    private final Rect i;
    private final d j;
    private boolean k;
    private Drawable l;
    private Drawable m;
    private int n;
    private boolean o;
    private p p;
    private AppBarLayout.a q;
    private int r;
    private am s;

    public CollapsingToolbarLayout(Context context)
    {
        this(context, null);
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        a = true;
        i = new Rect();
        j = new d(this);
        j.a(android.support.design.widget.a.c);
        context = context.obtainStyledAttributes(attributeset, android.support.design.a.i.CollapsingToolbarLayout, i1, android.support.design.a.h.Widget_Design_CollapsingToolbar);
        j.c(context.getInt(android.support.design.a.i.CollapsingToolbarLayout_expandedTitleGravity, 0x800053));
        j.d(context.getInt(android.support.design.a.i.CollapsingToolbarLayout_collapsedTitleGravity, 0x800013));
        i1 = context.getDimensionPixelSize(android.support.design.a.i.CollapsingToolbarLayout_expandedTitleMargin, 0);
        h = i1;
        g = i1;
        f = i1;
        e = i1;
        int j1;
        if (x.h(this) == 1)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (context.hasValue(android.support.design.a.i.CollapsingToolbarLayout_expandedTitleMarginStart))
        {
            j1 = context.getDimensionPixelSize(android.support.design.a.i.CollapsingToolbarLayout_expandedTitleMarginStart, 0);
            if (i1 != 0)
            {
                g = j1;
            } else
            {
                e = j1;
            }
        }
        if (context.hasValue(android.support.design.a.i.CollapsingToolbarLayout_expandedTitleMarginEnd))
        {
            j1 = context.getDimensionPixelSize(android.support.design.a.i.CollapsingToolbarLayout_expandedTitleMarginEnd, 0);
            if (i1 != 0)
            {
                e = j1;
            } else
            {
                g = j1;
            }
        }
        if (context.hasValue(android.support.design.a.i.CollapsingToolbarLayout_expandedTitleMarginTop))
        {
            f = context.getDimensionPixelSize(android.support.design.a.i.CollapsingToolbarLayout_expandedTitleMarginTop, 0);
        }
        if (context.hasValue(android.support.design.a.i.CollapsingToolbarLayout_expandedTitleMarginBottom))
        {
            h = context.getDimensionPixelSize(android.support.design.a.i.CollapsingToolbarLayout_expandedTitleMarginBottom, 0);
        }
        k = context.getBoolean(android.support.design.a.i.CollapsingToolbarLayout_titleEnabled, true);
        setTitle(context.getText(android.support.design.a.i.CollapsingToolbarLayout_title));
        j.f(android.support.design.a.h.TextAppearance_Design_CollapsingToolbar_Expanded);
        j.e(android.support.design.a.h.TextAppearance_AppCompat_Widget_ActionBar_Title);
        if (context.hasValue(android.support.design.a.i.CollapsingToolbarLayout_expandedTitleTextAppearance))
        {
            j.f(context.getResourceId(android.support.design.a.i.CollapsingToolbarLayout_expandedTitleTextAppearance, 0));
        }
        if (context.hasValue(android.support.design.a.i.CollapsingToolbarLayout_collapsedTitleTextAppearance))
        {
            j.e(context.getResourceId(android.support.design.a.i.CollapsingToolbarLayout_collapsedTitleTextAppearance, 0));
        }
        setContentScrim(context.getDrawable(android.support.design.a.i.CollapsingToolbarLayout_contentScrim));
        setStatusBarScrim(context.getDrawable(android.support.design.a.i.CollapsingToolbarLayout_statusBarScrim));
        b = context.getResourceId(android.support.design.a.i.CollapsingToolbarLayout_toolbarId, -1);
        context.recycle();
        setWillNotDraw(false);
        x.a(this, new r() {

            final CollapsingToolbarLayout a;

            public final am a(View view, am am1)
            {
                android.support.design.widget.CollapsingToolbarLayout.a(a, am1);
                a.requestLayout();
                return am1.f();
            }

            
            {
                a = CollapsingToolbarLayout.this;
                super();
            }
        });
    }

    static v a(View view)
    {
        return b(view);
    }

    static am a(CollapsingToolbarLayout collapsingtoolbarlayout)
    {
        return collapsingtoolbarlayout.s;
    }

    static am a(CollapsingToolbarLayout collapsingtoolbarlayout, am am1)
    {
        collapsingtoolbarlayout.s = am1;
        return am1;
    }

    private void a()
    {
        Toolbar toolbar1;
        Object obj;
        int i1;
        int j1;
        if (!a)
        {
            return;
        }
        toolbar1 = null;
        obj = null;
        i1 = 0;
        j1 = getChildCount();
_L7:
        Toolbar toolbar = obj;
        if (i1 >= j1) goto _L2; else goto _L1
_L1:
        View view;
        view = getChildAt(i1);
        toolbar = toolbar1;
        if (!(view instanceof Toolbar)) goto _L4; else goto _L3
_L3:
        if (b == -1)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        if (b != view.getId()) goto _L6; else goto _L5
_L5:
        toolbar = (Toolbar)view;
_L2:
        Toolbar toolbar2 = toolbar;
        if (toolbar == null)
        {
            toolbar2 = toolbar1;
        }
        c = toolbar2;
        b();
        a = false;
        return;
_L6:
        toolbar = toolbar1;
        if (toolbar1 == null)
        {
            toolbar = (Toolbar)view;
        }
_L4:
        i1++;
        toolbar1 = toolbar;
          goto _L7
        toolbar = (Toolbar)view;
          goto _L2
    }

    private void a(int i1)
    {
        a();
        if (p != null) goto _L2; else goto _L1
_L1:
        p = android.support.design.widget.w.a();
        p.a(600);
        p.a(android.support.design.widget.a.b);
        p.a(new p.c() {

            final CollapsingToolbarLayout a;

            public final void a(p p1)
            {
                android.support.design.widget.CollapsingToolbarLayout.a(a, p1.c());
            }

            
            {
                a = CollapsingToolbarLayout.this;
                super();
            }
        });
_L4:
        p.a(n, i1);
        p.a();
        return;
_L2:
        if (p.b())
        {
            p.e();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static void a(CollapsingToolbarLayout collapsingtoolbarlayout, int i1)
    {
        collapsingtoolbarlayout.b(i1);
    }

    static int b(CollapsingToolbarLayout collapsingtoolbarlayout, int i1)
    {
        collapsingtoolbarlayout.r = i1;
        return i1;
    }

    static Drawable b(CollapsingToolbarLayout collapsingtoolbarlayout)
    {
        return collapsingtoolbarlayout.l;
    }

    private static v b(View view)
    {
        v v2 = (v)view.getTag(android.support.design.a.f.view_offset_helper);
        v v1 = v2;
        if (v2 == null)
        {
            v1 = new v(view);
            view.setTag(android.support.design.a.f.view_offset_helper, v1);
        }
        return v1;
    }

    private void b()
    {
        if (!k && d != null)
        {
            android.view.ViewParent viewparent = d.getParent();
            if (viewparent instanceof ViewGroup)
            {
                ((ViewGroup)viewparent).removeView(d);
            }
        }
        if (k && c != null)
        {
            if (d == null)
            {
                d = new View(getContext());
            }
            if (d.getParent() == null)
            {
                c.addView(d, -1, -1);
            }
        }
    }

    private void b(int i1)
    {
        if (i1 != n)
        {
            if (l != null && c != null)
            {
                x.d(c);
            }
            n = i1;
            x.d(this);
        }
    }

    static Drawable c(CollapsingToolbarLayout collapsingtoolbarlayout)
    {
        return collapsingtoolbarlayout.m;
    }

    private a c()
    {
        return new a(super.generateDefaultLayoutParams());
    }

    static void d(CollapsingToolbarLayout collapsingtoolbarlayout)
    {
        if (!collapsingtoolbarlayout.o)
        {
            if (x.E(collapsingtoolbarlayout) && !collapsingtoolbarlayout.isInEditMode())
            {
                collapsingtoolbarlayout.a(255);
            } else
            {
                collapsingtoolbarlayout.b(255);
            }
            collapsingtoolbarlayout.o = true;
        }
    }

    static void e(CollapsingToolbarLayout collapsingtoolbarlayout)
    {
        if (collapsingtoolbarlayout.o)
        {
            if (x.E(collapsingtoolbarlayout) && !collapsingtoolbarlayout.isInEditMode())
            {
                collapsingtoolbarlayout.a(0);
            } else
            {
                collapsingtoolbarlayout.b(0);
            }
            collapsingtoolbarlayout.o = false;
        }
    }

    static d f(CollapsingToolbarLayout collapsingtoolbarlayout)
    {
        return collapsingtoolbarlayout.j;
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return layoutparams instanceof a;
    }

    public void draw(Canvas canvas)
    {
        super.draw(canvas);
        a();
        if (c == null && l != null && n > 0)
        {
            l.mutate().setAlpha(n);
            l.draw(canvas);
        }
        if (k)
        {
            j.a(canvas);
        }
        if (m != null && n > 0)
        {
            int i1;
            if (s != null)
            {
                i1 = s.b();
            } else
            {
                i1 = 0;
            }
            if (i1 > 0)
            {
                m.setBounds(0, -r, getWidth(), i1 - r);
                m.mutate().setAlpha(n);
                m.draw(canvas);
            }
        }
    }

    protected boolean drawChild(Canvas canvas, View view, long l1)
    {
        a();
        if (view == c && l != null && n > 0)
        {
            l.mutate().setAlpha(n);
            l.draw(canvas);
        }
        return super.drawChild(canvas, view, l1);
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return c();
    }

    protected android.widget.FrameLayout.LayoutParams generateDefaultLayoutParams()
    {
        return c();
    }

    public volatile android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return generateLayoutParams(attributeset);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return new a(layoutparams);
    }

    public android.widget.FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return new a(getContext(), attributeset);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        android.view.ViewParent viewparent = getParent();
        if (viewparent instanceof AppBarLayout)
        {
            if (q == null)
            {
                q = new b((byte)0);
            }
            ((AppBarLayout)viewparent).a(q);
        }
    }

    protected void onDetachedFromWindow()
    {
        android.view.ViewParent viewparent = getParent();
        if (q != null && (viewparent instanceof AppBarLayout))
        {
            ((AppBarLayout)viewparent).b(q);
        }
        super.onDetachedFromWindow();
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        super.onLayout(flag, i1, j1, k1, l1);
        int i2 = 0;
        for (int j2 = getChildCount(); i2 < j2; i2++)
        {
            View view = getChildAt(i2);
            if (s != null && !x.x(view))
            {
                int k2 = s.b();
                if (view.getTop() < k2)
                {
                    view.offsetTopAndBottom(k2);
                }
            }
            b(view).a();
        }

        if (k && d != null)
        {
            android.support.design.widget.s.a(this, d, i);
            j.b(i.left, l1 - i.height(), i.right, l1);
            j.a(e, i.bottom + f, k1 - i1 - g, l1 - j1 - h);
            j.d();
        }
        if (c != null)
        {
            if (k && TextUtils.isEmpty(j.e()))
            {
                j.a(c.i());
            }
            setMinimumHeight(c.getHeight());
        }
    }

    protected void onMeasure(int i1, int j1)
    {
        a();
        super.onMeasure(i1, j1);
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
        if (l != null)
        {
            l.setBounds(0, 0, i1, j1);
        }
    }

    public void setCollapsedTitleGravity(int i1)
    {
        j.c(i1);
    }

    public void setCollapsedTitleTextAppearance(int i1)
    {
        j.e(i1);
    }

    public void setCollapsedTitleTextColor(int i1)
    {
        j.a(i1);
    }

    public void setContentScrim(Drawable drawable)
    {
        if (l != drawable)
        {
            if (l != null)
            {
                l.setCallback(null);
            }
            l = drawable;
            drawable.setBounds(0, 0, getWidth(), getHeight());
            drawable.setCallback(this);
            drawable.mutate().setAlpha(n);
            x.d(this);
        }
    }

    public void setContentScrimColor(int i1)
    {
        setContentScrim(new ColorDrawable(i1));
    }

    public void setContentScrimResource(int i1)
    {
        setContentScrim(android.support.v4.content.a.a(getContext(), i1));
    }

    public void setExpandedTitleColor(int i1)
    {
        j.b(i1);
    }

    public void setExpandedTitleGravity(int i1)
    {
        j.c(i1);
    }

    public void setExpandedTitleTextAppearance(int i1)
    {
        j.f(i1);
    }

    public void setStatusBarScrim(Drawable drawable)
    {
        if (m != drawable)
        {
            if (m != null)
            {
                m.setCallback(null);
            }
            m = drawable;
            drawable.setCallback(this);
            drawable.mutate().setAlpha(n);
            x.d(this);
        }
    }

    public void setStatusBarScrimColor(int i1)
    {
        setStatusBarScrim(new ColorDrawable(i1));
    }

    public void setStatusBarScrimResource(int i1)
    {
        setStatusBarScrim(android.support.v4.content.a.a(getContext(), i1));
    }

    public void setTitle(CharSequence charsequence)
    {
        j.a(charsequence);
    }

    public void setTitleEnabled(boolean flag)
    {
        if (flag != k)
        {
            k = flag;
            b();
            requestLayout();
        }
    }
}
