// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ViewPager;
import android.support.v4.view.s;
import android.support.v4.view.x;
import android.support.v7.internal.widget.o;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.lang.annotation.Annotation;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package android.support.design.widget:
//            w, a, p, k

public class TabLayout extends HorizontalScrollView
{
    public static interface Mode
        extends Annotation
    {
    }

    public static interface TabGravity
        extends Annotation
    {
    }

    public static interface a
    {

        public abstract void a(c c1);
    }

    private final class b extends LinearLayout
    {

        final TabLayout a;
        private int b;
        private final Paint c = new Paint();
        private int d;
        private float e;
        private int f;
        private int g;

        static float a(b b1)
        {
            b1.e = 0.0F;
            return 0.0F;
        }

        static int a(b b1, int i1)
        {
            b1.d = i1;
            return i1;
        }

        private void a(int i1, int j1)
        {
            if (i1 != f || j1 != g)
            {
                f = i1;
                g = j1;
                x.d(this);
            }
        }

        static void a(b b1, int i1, int j1)
        {
            b1.a(i1, j1);
        }

        private void b()
        {
            View view = getChildAt(d);
            int i1;
            int j1;
            if (view != null && view.getWidth() > 0)
            {
                int l1 = view.getLeft();
                int k1 = view.getRight();
                i1 = l1;
                j1 = k1;
                if (e > 0.0F)
                {
                    i1 = l1;
                    j1 = k1;
                    if (d < getChildCount() - 1)
                    {
                        View view1 = getChildAt(d + 1);
                        i1 = (int)(e * (float)view1.getLeft() + (1.0F - e) * (float)l1);
                        j1 = (int)(e * (float)view1.getRight() + (1.0F - e) * (float)k1);
                    }
                }
            } else
            {
                j1 = -1;
                i1 = -1;
            }
            a(i1, j1);
        }

        final float a()
        {
            return (float)d + e;
        }

        final void a(int i1)
        {
            if (c.getColor() != i1)
            {
                c.setColor(i1);
                x.d(this);
            }
        }

        final void a(int i1, float f1)
        {
            d = i1;
            e = f1;
            b();
        }

        final void b(int i1)
        {
            if (b != i1)
            {
                b = i1;
                x.d(this);
            }
        }

        final void c(int i1)
        {
            int j1;
            int k1;
            int l1;
            int i2;
            Object obj;
            if (x.h(this) == 1)
            {
                j1 = 1;
            } else
            {
                j1 = 0;
            }
            obj = getChildAt(i1);
            l1 = ((View) (obj)).getLeft();
            i2 = ((View) (obj)).getRight();
            if (Math.abs(i1 - d) > 1) goto _L2; else goto _L1
_L1:
            j1 = f;
            k1 = g;
_L4:
            if (j1 != l1 || k1 != i2)
            {
                obj = TabLayout.a(a, w.a());
                ((p) (obj)).a(android.support.design.widget.a.b);
                ((p) (obj)).a(300);
                ((p) (obj)).a(0.0F, 1.0F);
                ((p) (obj)).a(new p.c(this, j1, l1, k1, i2) {

                    final int a;
                    final int b;
                    final int c;
                    final int d;
                    final b e;

                    public final void a(p p1)
                    {
                        float f1 = p1.f();
                        b.a(e, android.support.design.widget.a.a(a, b, f1), android.support.design.widget.a.a(c, d, f1));
                    }

            
            {
                e = b1;
                a = i1;
                b = j1;
                c = k1;
                d = l1;
                super();
            }
                });
                ((p) (obj)).a(new p.b(this, i1) {

                    final int a;
                    final b b;

                    public final void a()
                    {
                        b.a(b, a);
                        b.a(b);
                    }

                    public final void b()
                    {
                        b.a(b, a);
                        b.a(b);
                    }

            
            {
                b = b1;
                a = i1;
                super();
            }
                });
                ((p) (obj)).a();
            }
            return;
_L2:
            k1 = TabLayout.b(a, 24);
            if (i1 < d)
            {
                if (j1 == 0)
                {
                    k1 = i2 + k1;
                    j1 = k1;
                    continue; /* Loop/switch isn't completed */
                }
            } else
            if (j1 != 0)
            {
                k1 = i2 + k1;
                j1 = k1;
                continue; /* Loop/switch isn't completed */
            }
            k1 = l1 - k1;
            j1 = k1;
            if (true) goto _L4; else goto _L3
_L3:
        }

        public final void draw(Canvas canvas)
        {
            super.draw(canvas);
            if (f >= 0 && g > f)
            {
                canvas.drawRect(f, getHeight() - b, g, getHeight(), c);
            }
        }

        protected final void onLayout(boolean flag, int i1, int j1, int k1, int l1)
        {
            super.onLayout(flag, i1, j1, k1, l1);
            b();
        }

        protected final void onMeasure(int i1, int j1)
        {
            super.onMeasure(i1, j1);
            break MISSING_BLOCK_LABEL_6;
            if (android.view.View.MeasureSpec.getMode(i1) == 0x40000000 && TabLayout.j(a) == 1 && TabLayout.k(a) == 1)
            {
                int k2 = getChildCount();
                int l2 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                int k1 = 0;
                for (int l1 = 0; l1 < k2; l1++)
                {
                    View view = getChildAt(l1);
                    view.measure(l2, j1);
                    k1 = Math.max(k1, view.getMeasuredWidth());
                }

                if (k1 > 0)
                {
                    int i2 = TabLayout.b(a, 16);
                    if (k1 * k2 <= getMeasuredWidth() - i2 * 2)
                    {
                        for (int j2 = 0; j2 < k2; j2++)
                        {
                            android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)getChildAt(j2).getLayoutParams();
                            layoutparams.width = k1;
                            layoutparams.weight = 0.0F;
                        }

                    } else
                    {
                        TabLayout.l(a);
                        TabLayout.m(a);
                    }
                    super.onMeasure(i1, j1);
                    return;
                }
            }
            return;
        }

        b(Context context)
        {
            a = TabLayout.this;
            super(context);
            d = -1;
            f = -1;
            g = -1;
            setWillNotDraw(false);
        }
    }

    public static final class c
    {

        private Drawable a;
        private CharSequence b;
        private CharSequence c;
        private int d;
        private View e;
        private final TabLayout f;

        static TabLayout a(c c1)
        {
            return c1.f;
        }

        public final c a(View view)
        {
            e = view;
            if (d >= 0)
            {
                TabLayout.a(f, d);
            }
            return this;
        }

        public final c a(CharSequence charsequence)
        {
            b = charsequence;
            if (d >= 0)
            {
                TabLayout.a(f, d);
            }
            return this;
        }

        public final View a()
        {
            return e;
        }

        final void a(int i1)
        {
            d = i1;
        }

        public final Drawable b()
        {
            return a;
        }

        public final int c()
        {
            return d;
        }

        public final CharSequence d()
        {
            return b;
        }

        public final void e()
        {
            f.a(this);
        }

        public final CharSequence f()
        {
            return c;
        }

        c(TabLayout tablayout)
        {
            d = -1;
            f = tablayout;
        }
    }

    public static final class d
        implements android.support.v4.view.ViewPager.f
    {

        private final WeakReference a;
        private int b;
        private int c;

        public final void onPageScrollStateChanged(int i1)
        {
            c = i1;
        }

        public final void onPageScrolled(int i1, float f1, int j1)
        {
            TabLayout tablayout = (TabLayout)a.get();
            if (tablayout != null)
            {
                if (b == -1 || TabLayout.n(tablayout) != (float)b)
                {
                    tablayout.setScrollPosition(i1, f1, true);
                }
                if (c == 0 && b != -1)
                {
                    tablayout.a(tablayout.a(b));
                    b = -1;
                }
            }
        }

        public final void onPageSelected(int i1)
        {
            b = i1;
        }

        public d(TabLayout tablayout)
        {
            b = -1;
            a = new WeakReference(tablayout);
        }
    }

    final class e extends LinearLayout
        implements android.view.View.OnLongClickListener
    {

        final TabLayout a;
        private final c b;
        private TextView c;
        private ImageView d;
        private View e;
        private TextView f;
        private ImageView g;

        private void a(c c1, TextView textview, ImageView imageview)
        {
            Drawable drawable = c1.b();
            CharSequence charsequence = c1.d();
            boolean flag;
            if (imageview != null)
            {
                if (drawable != null)
                {
                    imageview.setImageDrawable(drawable);
                    imageview.setVisibility(0);
                    setVisibility(0);
                } else
                {
                    imageview.setVisibility(8);
                    imageview.setImageDrawable(null);
                }
                imageview.setContentDescription(c1.f());
            }
            if (!TextUtils.isEmpty(charsequence))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (textview != null)
            {
                if (flag)
                {
                    textview.setText(charsequence);
                    textview.setContentDescription(c1.f());
                    textview.setVisibility(0);
                    setVisibility(0);
                } else
                {
                    textview.setVisibility(8);
                    textview.setText(null);
                }
            }
            if (!flag && !TextUtils.isEmpty(c1.f()))
            {
                setOnLongClickListener(this);
                return;
            } else
            {
                setOnLongClickListener(null);
                setLongClickable(false);
                return;
            }
        }

        final void a()
        {
            c c1 = b;
            View view = c1.a();
            if (view != null)
            {
                android.view.ViewParent viewparent = view.getParent();
                if (viewparent != this)
                {
                    if (viewparent != null)
                    {
                        ((ViewGroup)viewparent).removeView(view);
                    }
                    addView(view);
                }
                e = view;
                if (c != null)
                {
                    c.setVisibility(8);
                }
                if (d != null)
                {
                    d.setVisibility(8);
                    d.setImageDrawable(null);
                }
                f = (TextView)view.findViewById(0x1020014);
                g = (ImageView)view.findViewById(0x1020006);
            } else
            {
                if (e != null)
                {
                    removeView(e);
                    e = null;
                }
                f = null;
                g = null;
            }
            if (e == null)
            {
                if (d == null)
                {
                    ImageView imageview = (ImageView)LayoutInflater.from(getContext()).inflate(android.support.design.a.g.design_layout_tab_icon, this, false);
                    addView(imageview, 0);
                    d = imageview;
                }
                if (c == null)
                {
                    TextView textview = (TextView)LayoutInflater.from(getContext()).inflate(android.support.design.a.g.design_layout_tab_text, this, false);
                    addView(textview);
                    c = textview;
                }
                c.setTextAppearance(getContext(), TabLayout.h(a));
                if (TabLayout.i(a) != null)
                {
                    c.setTextColor(TabLayout.i(a));
                }
                a(c1, c, d);
            } else
            if (f != null || g != null)
            {
                a(c1, f, g);
                return;
            }
        }

        public final c b()
        {
            return b;
        }

        public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
        {
            super.onInitializeAccessibilityEvent(accessibilityevent);
            accessibilityevent.setClassName(android/support/v7/app/ActionBar$b.getName());
        }

        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
        {
            super.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
            accessibilitynodeinfo.setClassName(android/support/v7/app/ActionBar$b.getName());
        }

        public final boolean onLongClick(View view)
        {
            view = new int[2];
            getLocationOnScreen(view);
            Object obj = getContext();
            int i1 = getWidth();
            int j1 = getHeight();
            int k1 = ((Context) (obj)).getResources().getDisplayMetrics().widthPixels;
            obj = Toast.makeText(((Context) (obj)), b.f(), 0);
            ((Toast) (obj)).setGravity(49, (view[0] + i1 / 2) - k1 / 2, j1);
            ((Toast) (obj)).show();
            return true;
        }

        public final void onMeasure(int i1, int j1)
        {
            super.onMeasure(i1, j1);
            i1 = getMeasuredWidth();
            if (i1 < TabLayout.f(a) || i1 > TabLayout.g(a))
            {
                super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(android.support.design.widget.k.a(i1, TabLayout.f(a), TabLayout.g(a)), 0x40000000), j1);
            }
        }

        public final void setSelected(boolean flag)
        {
            boolean flag1;
            if (isSelected() != flag)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            super.setSelected(flag);
            if (flag1 && flag)
            {
                sendAccessibilityEvent(4);
                if (c != null)
                {
                    c.setSelected(flag);
                }
                if (d != null)
                {
                    d.setSelected(flag);
                }
            }
        }

        public e(Context context, c c1)
        {
            a = TabLayout.this;
            super(context);
            b = c1;
            if (TabLayout.a(TabLayout.this) != 0)
            {
                setBackgroundDrawable(android.support.v7.internal.widget.o.a(context, TabLayout.a(TabLayout.this)));
            }
            x.b(this, TabLayout.b(TabLayout.this), TabLayout.c(TabLayout.this), TabLayout.d(TabLayout.this), TabLayout.e(TabLayout.this));
            setGravity(17);
            a();
        }
    }

    public static final class f
        implements a
    {

        private final ViewPager a;

        public final void a(c c1)
        {
            a.setCurrentItem(c1.c());
        }

        public f(ViewPager viewpager)
        {
            a = viewpager;
        }
    }


    private final ArrayList a;
    private c b;
    private final b c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private ColorStateList i;
    private final int j;
    private final int k;
    private int l;
    private final int m;
    private int n;
    private int o;
    private int p;
    private a q;
    private android.view.View.OnClickListener r;
    private p s;
    private p t;

    public TabLayout(Context context)
    {
        this(context, null);
    }

    public TabLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public TabLayout(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        a = new ArrayList();
        l = 0x7fffffff;
        setHorizontalScrollBarEnabled(false);
        setFillViewport(true);
        c = new b(context);
        addView(c, -2, -1);
        context = context.obtainStyledAttributes(attributeset, android.support.design.a.i.TabLayout, i1, android.support.design.a.h.Widget_Design_TabLayout);
        c.b(context.getDimensionPixelSize(android.support.design.a.i.TabLayout_tabIndicatorHeight, 0));
        c.a(context.getColor(android.support.design.a.i.TabLayout_tabIndicatorColor, 0));
        h = context.getResourceId(android.support.design.a.i.TabLayout_tabTextAppearance, android.support.design.a.h.TextAppearance_Design_Tab);
        i1 = context.getDimensionPixelSize(android.support.design.a.i.TabLayout_tabPadding, 0);
        g = i1;
        f = i1;
        e = i1;
        d = i1;
        d = context.getDimensionPixelSize(android.support.design.a.i.TabLayout_tabPaddingStart, d);
        e = context.getDimensionPixelSize(android.support.design.a.i.TabLayout_tabPaddingTop, e);
        f = context.getDimensionPixelSize(android.support.design.a.i.TabLayout_tabPaddingEnd, f);
        g = context.getDimensionPixelSize(android.support.design.a.i.TabLayout_tabPaddingBottom, g);
        i = f(h);
        if (context.hasValue(android.support.design.a.i.TabLayout_tabTextColor))
        {
            i = context.getColorStateList(android.support.design.a.i.TabLayout_tabTextColor);
        }
        if (context.hasValue(android.support.design.a.i.TabLayout_tabSelectedTextColor))
        {
            i1 = context.getColor(android.support.design.a.i.TabLayout_tabSelectedTextColor, 0);
            i = a(i.getDefaultColor(), i1);
        }
        k = context.getDimensionPixelSize(android.support.design.a.i.TabLayout_tabMinWidth, 0);
        m = context.getDimensionPixelSize(android.support.design.a.i.TabLayout_tabMaxWidth, 0);
        j = context.getResourceId(android.support.design.a.i.TabLayout_tabBackground, 0);
        n = context.getDimensionPixelSize(android.support.design.a.i.TabLayout_tabContentStart, 0);
        p = context.getInt(android.support.design.a.i.TabLayout_tabMode, 1);
        o = context.getInt(android.support.design.a.i.TabLayout_tabGravity, 0);
        context.recycle();
        b();
    }

    private int a(int i1, float f1)
    {
        int j1 = 0;
        boolean flag = false;
        if (p == 0)
        {
            View view1 = c.getChildAt(i1);
            View view;
            if (i1 + 1 < c.getChildCount())
            {
                view = c.getChildAt(i1 + 1);
            } else
            {
                view = null;
            }
            if (view1 != null)
            {
                i1 = view1.getWidth();
            } else
            {
                i1 = 0;
            }
            j1 = ((flag) ? 1 : 0);
            if (view != null)
            {
                j1 = view.getWidth();
            }
            j1 = (view1.getLeft() + (int)((float)(i1 + j1) * f1 * 0.5F) + view1.getWidth() / 2) - getWidth() / 2;
        }
        return j1;
    }

    static int a(TabLayout tablayout)
    {
        return tablayout.j;
    }

    private static ColorStateList a(int i1, int j1)
    {
        return new ColorStateList(new int[][] {
            SELECTED_STATE_SET, EMPTY_STATE_SET
        }, new int[] {
            j1, i1
        });
    }

    static p a(TabLayout tablayout, p p1)
    {
        tablayout.t = p1;
        return p1;
    }

    private void a(c c1, int i1)
    {
        c1.a(i1);
        a.add(i1, c1);
        int j1 = a.size();
        for (i1++; i1 < j1; i1++)
        {
            ((c)a.get(i1)).a(i1);
        }

    }

    static void a(TabLayout tablayout, int i1)
    {
        tablayout.b(i1);
    }

    private void a(android.widget.LinearLayout.LayoutParams layoutparams)
    {
        if (p == 1 && o == 0)
        {
            layoutparams.width = 0;
            layoutparams.weight = 1.0F;
            return;
        } else
        {
            layoutparams.width = -2;
            layoutparams.weight = 0.0F;
            return;
        }
    }

    static int b(TabLayout tablayout)
    {
        return tablayout.d;
    }

    static int b(TabLayout tablayout, int i1)
    {
        return tablayout.c(i1);
    }

    private void b()
    {
        int i1 = 0;
        if (p == 0)
        {
            i1 = Math.max(0, n - d);
        }
        x.b(c, i1, 0, 0, 0);
        p;
        JVM INSTR tableswitch 0 1: default 60
    //                   0 76
    //                   1 65;
           goto _L1 _L2 _L3
_L1:
        c();
        return;
_L3:
        c.setGravity(1);
        continue; /* Loop/switch isn't completed */
_L2:
        c.setGravity(0x800003);
        if (true) goto _L1; else goto _L4
_L4:
    }

    private void b(int i1)
    {
        e e1 = (e)c.getChildAt(i1);
        if (e1 != null)
        {
            e1.a();
        }
    }

    private int c(int i1)
    {
        return Math.round(getResources().getDisplayMetrics().density * (float)i1);
    }

    static int c(TabLayout tablayout)
    {
        return tablayout.e;
    }

    private void c()
    {
        for (int i1 = 0; i1 < c.getChildCount(); i1++)
        {
            View view = c.getChildAt(i1);
            a((android.widget.LinearLayout.LayoutParams)view.getLayoutParams());
            view.requestLayout();
        }

    }

    static int d(TabLayout tablayout)
    {
        return tablayout.f;
    }

    private void d(int i1)
    {
        boolean flag1;
        flag1 = false;
        if (i1 == -1)
        {
            return;
        }
        if (getWindowToken() == null || !x.E(this)) goto _L2; else goto _L1
_L1:
        b b1;
        int j1;
        int i2;
        b1 = c;
        i2 = b1.getChildCount();
        j1 = 0;
_L8:
        boolean flag = flag1;
        if (j1 >= i2) goto _L4; else goto _L3
_L3:
        if (b1.getChildAt(j1).getWidth() > 0) goto _L6; else goto _L5
_L5:
        flag = true;
_L4:
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
_L2:
        setScrollPosition(i1, 0.0F, true);
        return;
_L6:
        j1++;
        if (true) goto _L8; else goto _L7
_L7:
        int k1 = getScrollX();
        int l1 = a(i1, 0.0F);
        if (k1 != l1)
        {
            if (s == null)
            {
                s = w.a();
                s.a(android.support.design.widget.a.b);
                s.a(300);
                s.a(new p.c() {

                    final TabLayout a;

                    public final void a(p p1)
                    {
                        a.scrollTo(p1.c(), 0);
                    }

            
            {
                a = TabLayout.this;
                super();
            }
                });
            }
            s.a(k1, l1);
            s.a();
        }
        c.c(i1);
        return;
    }

    static int e(TabLayout tablayout)
    {
        return tablayout.g;
    }

    private void e(int i1)
    {
        int k1 = c.getChildCount();
        if (i1 < k1 && !c.getChildAt(i1).isSelected())
        {
            int j1 = 0;
            while (j1 < k1) 
            {
                View view = c.getChildAt(j1);
                boolean flag;
                if (j1 == i1)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                view.setSelected(flag);
                j1++;
            }
        }
    }

    static int f(TabLayout tablayout)
    {
        return tablayout.k;
    }

    private ColorStateList f(int i1)
    {
        TypedArray typedarray = getContext().obtainStyledAttributes(i1, android.support.design.a.i.TextAppearance);
        ColorStateList colorstatelist = typedarray.getColorStateList(android.support.design.a.i.TextAppearance_android_textColor);
        typedarray.recycle();
        return colorstatelist;
        Exception exception;
        exception;
        typedarray.recycle();
        throw exception;
    }

    static int g(TabLayout tablayout)
    {
        return tablayout.l;
    }

    static int h(TabLayout tablayout)
    {
        return tablayout.h;
    }

    static ColorStateList i(TabLayout tablayout)
    {
        return tablayout.i;
    }

    static int j(TabLayout tablayout)
    {
        return tablayout.p;
    }

    static int k(TabLayout tablayout)
    {
        return tablayout.o;
    }

    static int l(TabLayout tablayout)
    {
        tablayout.o = 0;
        return 0;
    }

    static void m(TabLayout tablayout)
    {
        tablayout.c();
    }

    static float n(TabLayout tablayout)
    {
        return tablayout.c.a();
    }

    public final int a()
    {
        return a.size();
    }

    public final c a(int i1)
    {
        return (c)a.get(i1);
    }

    final void a(c c1)
    {
        if (b == c1)
        {
            if (b != null)
            {
                d(c1.c());
            }
        } else
        {
            int i1;
            if (c1 != null)
            {
                i1 = c1.c();
            } else
            {
                i1 = -1;
            }
            e(i1);
            if ((b == null || b.c() == -1) && i1 != -1)
            {
                setScrollPosition(i1, 0.0F, true);
            } else
            {
                d(i1);
            }
            b = c1;
            if (b != null && q != null)
            {
                q.a(b);
                return;
            }
        }
    }

    protected void onMeasure(int i1, int j1)
    {
        int k1 = c(48) + getPaddingTop() + getPaddingBottom();
        android.view.View.MeasureSpec.getMode(j1);
        JVM INSTR lookupswitch 2: default 48
    //                   -2147483648: 188
    //                   0: 207;
           goto _L1 _L2 _L3
_L1:
label0:
        {
            super.onMeasure(i1, j1);
            if (p == 1 && getChildCount() == 1)
            {
                View view = getChildAt(0);
                k1 = getMeasuredWidth();
                if (view.getMeasuredWidth() > k1)
                {
                    int l1 = getChildMeasureSpec(j1, getPaddingTop() + getPaddingBottom(), view.getLayoutParams().height);
                    view.measure(android.view.View.MeasureSpec.makeMeasureSpec(k1, 0x40000000), l1);
                }
            }
            int i2 = m;
            int j2 = getMeasuredWidth() - c(56);
            if (i2 != 0)
            {
                k1 = i2;
                if (i2 <= j2)
                {
                    break label0;
                }
            }
            k1 = j2;
        }
        if (l != k1)
        {
            l = k1;
            super.onMeasure(i1, j1);
        }
        return;
_L2:
        j1 = android.view.View.MeasureSpec.makeMeasureSpec(Math.min(k1, android.view.View.MeasureSpec.getSize(j1)), 0x40000000);
        continue; /* Loop/switch isn't completed */
_L3:
        j1 = android.view.View.MeasureSpec.makeMeasureSpec(k1, 0x40000000);
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void setOnTabSelectedListener(a a1)
    {
        q = a1;
    }

    public void setScrollPosition(int i1, float f1, boolean flag)
    {
        if ((t == null || !t.b()) && i1 >= 0 && i1 < c.getChildCount())
        {
            c.a(i1, f1);
            scrollTo(a(i1, f1), 0);
            if (flag)
            {
                e(Math.round((float)i1 + f1));
                return;
            }
        }
    }

    public void setSelectedTabIndicatorColor(int i1)
    {
        c.a(i1);
    }

    public void setSelectedTabIndicatorHeight(int i1)
    {
        c.b(i1);
    }

    public void setTabGravity(int i1)
    {
        if (o != i1)
        {
            o = i1;
            b();
        }
    }

    public void setTabMode(int i1)
    {
        if (i1 != p)
        {
            p = i1;
            b();
        }
    }

    public void setTabTextColors(int i1, int j1)
    {
        setTabTextColors(a(i1, j1));
    }

    public void setTabTextColors(ColorStateList colorstatelist)
    {
        if (i != colorstatelist)
        {
            i = colorstatelist;
            int i1 = 0;
            for (int j1 = c.getChildCount(); i1 < j1; i1++)
            {
                b(i1);
            }

        }
    }

    public void setTabsFromPagerAdapter(s s1)
    {
        c.removeAllViews();
        for (Iterator iterator = a.iterator(); iterator.hasNext(); iterator.remove())
        {
            ((c)iterator.next()).a(-1);
        }

        b = null;
        int i1 = 0;
        for (int j1 = s1.getCount(); i1 < j1; i1++)
        {
            c c1 = (new c(this)).a(s1.getPageTitle(i1));
            boolean flag = a.isEmpty();
            if (c.a(c1) != this)
            {
                throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
            }
            e e1 = new e(getContext(), c1);
            e1.setFocusable(true);
            if (r == null)
            {
                r = new android.view.View.OnClickListener() {

                    final TabLayout a;

                    public final void onClick(View view)
                    {
                        ((e)view).b().e();
                    }

            
            {
                a = TabLayout.this;
                super();
            }
                };
            }
            e1.setOnClickListener(r);
            b b1 = c;
            android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-2, -1);
            a(layoutparams);
            b1.addView(e1, layoutparams);
            if (flag)
            {
                e1.setSelected(true);
            }
            a(c1, a.size());
            if (flag)
            {
                c1.e();
            }
        }

    }

    public void setupWithViewPager(ViewPager viewpager)
    {
        s s1 = viewpager.a();
        if (s1 == null)
        {
            throw new IllegalArgumentException("ViewPager does not have a PagerAdapter set");
        }
        setTabsFromPagerAdapter(s1);
        viewpager.a(new d(this));
        setOnTabSelectedListener(new f(viewpager));
        if (s1.getCount() > 0)
        {
            int j1 = viewpager.b();
            int i1;
            if (b != null)
            {
                i1 = b.c();
            } else
            {
                i1 = -1;
            }
            if (i1 != j1)
            {
                a(a(j1));
            }
        }
    }
}
