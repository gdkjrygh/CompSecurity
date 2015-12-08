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
import android.support.v4.view.t;
import android.support.v4.view.x;
import android.support.v7.internal.widget.TintManager;
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
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package android.support.design.widget:
//            n, a, g, d

public class TabLayout extends HorizontalScrollView
{
    public static interface a
    {

        public abstract void a(c c1);
    }

    private final class b extends LinearLayout
    {

        int a;
        final Paint b = new Paint();
        int c;
        float d;
        int e;
        int f;
        final TabLayout g;

        static float a(b b1)
        {
            b1.d = 0.0F;
            return 0.0F;
        }

        static int a(b b1, int i1)
        {
            b1.c = i1;
            return i1;
        }

        private void a(int i1, int j1)
        {
            if (i1 != e || j1 != f)
            {
                e = i1;
                f = j1;
                x.d(this);
            }
        }

        static void a(b b1, int i1, int j1)
        {
            b1.a(i1, j1);
        }

        final void a()
        {
            View view = getChildAt(c);
            int i1;
            int j1;
            if (view != null && view.getWidth() > 0)
            {
                int l1 = view.getLeft();
                int k1 = view.getRight();
                i1 = l1;
                j1 = k1;
                if (d > 0.0F)
                {
                    i1 = l1;
                    j1 = k1;
                    if (c < getChildCount() - 1)
                    {
                        View view1 = getChildAt(c + 1);
                        float f1 = d;
                        float f2 = view1.getLeft();
                        float f3 = d;
                        i1 = (int)((float)l1 * (1.0F - f3) + f1 * f2);
                        f1 = d;
                        f2 = view1.getRight();
                        f3 = d;
                        j1 = (int)((float)k1 * (1.0F - f3) + f2 * f1);
                    }
                }
            } else
            {
                i1 = -1;
                j1 = -1;
            }
            a(i1, j1);
        }

        public final void draw(Canvas canvas)
        {
            super.draw(canvas);
            if (e >= 0 && f > e)
            {
                canvas.drawRect(e, getHeight() - a, f, getHeight(), b);
            }
        }

        protected final void onLayout(boolean flag, int i1, int j1, int k1, int l1)
        {
            super.onLayout(flag, i1, j1, k1, l1);
            a();
        }

        protected final void onMeasure(int i1, int j1)
        {
            super.onMeasure(i1, j1);
            break MISSING_BLOCK_LABEL_6;
            if (android.view.View.MeasureSpec.getMode(i1) == 0x40000000 && TabLayout.j(g) == 1 && TabLayout.k(g) == 1)
            {
                int k2 = getChildCount();
                int l2 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                int l1 = 0;
                int k1 = 0;
                for (; l1 < k2; l1++)
                {
                    View view = getChildAt(l1);
                    view.measure(l2, j1);
                    k1 = Math.max(k1, view.getMeasuredWidth());
                }

                if (k1 > 0)
                {
                    int i2 = TabLayout.l(g);
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
                        TabLayout.m(g);
                        TabLayout.n(g);
                    }
                    super.onMeasure(i1, j1);
                    return;
                }
            }
            return;
        }

        b(Context context)
        {
            g = TabLayout.this;
            super(context);
            c = -1;
            e = -1;
            f = -1;
            setWillNotDraw(false);
        }
    }

    public static final class c
    {

        Drawable a;
        CharSequence b;
        CharSequence c;
        int d;
        View e;
        final TabLayout f;

        public final void a()
        {
            f.a(this, true);
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

        public final void a(int i1)
        {
            b = c;
            c = i1;
        }

        public final void a(int i1, float f1, int j1)
        {
            boolean flag1 = true;
            TabLayout tablayout = (TabLayout)a.get();
            if (tablayout != null)
            {
                boolean flag = flag1;
                if (c != 1)
                {
                    if (c == 2 && b == 1)
                    {
                        flag = flag1;
                    } else
                    {
                        flag = false;
                    }
                }
                tablayout.a(i1, f1, flag);
            }
        }

        public final void b(int i1)
        {
            TabLayout tablayout = (TabLayout)a.get();
            if (tablayout != null)
            {
                c c1 = tablayout.a(i1);
                boolean flag;
                if (c == 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                tablayout.a(c1, flag);
            }
        }

        public d(TabLayout tablayout)
        {
            a = new WeakReference(tablayout);
        }
    }

    final class e extends LinearLayout
        implements android.view.View.OnLongClickListener
    {

        final c a;
        final TabLayout b;
        private TextView c;
        private ImageView d;
        private View e;
        private TextView f;
        private ImageView g;

        private void a(c c1, TextView textview, ImageView imageview)
        {
            Drawable drawable = c1.a;
            CharSequence charsequence = c1.b;
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
                imageview.setContentDescription(c1.c);
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
                    textview.setContentDescription(c1.c);
                    textview.setVisibility(0);
                    setVisibility(0);
                } else
                {
                    textview.setVisibility(8);
                    textview.setText(null);
                }
            }
            if (!flag && !TextUtils.isEmpty(c1.c))
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
            c c1 = a;
            View view = c1.e;
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
                    ImageView imageview = (ImageView)LayoutInflater.from(getContext()).inflate(android.support.design.a.e.layout_tab_icon, this, false);
                    addView(imageview, 0);
                    d = imageview;
                }
                if (c == null)
                {
                    TextView textview = (TextView)LayoutInflater.from(getContext()).inflate(android.support.design.a.e.layout_tab_text, this, false);
                    addView(textview);
                    c = textview;
                }
                c.setTextAppearance(getContext(), TabLayout.h(b));
                if (TabLayout.i(b) != null)
                {
                    c.setTextColor(TabLayout.i(b));
                }
                a(c1, c, d);
            } else
            if (f != null || g != null)
            {
                a(c1, f, g);
                return;
            }
        }

        public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
        {
            super.onInitializeAccessibilityEvent(accessibilityevent);
            accessibilityevent.setClassName(android/support/v7/app/ActionBar$Tab.getName());
        }

        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
        {
            super.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
            accessibilitynodeinfo.setClassName(android/support/v7/app/ActionBar$Tab.getName());
        }

        public final boolean onLongClick(View view)
        {
            view = new int[2];
            getLocationOnScreen(view);
            Object obj = getContext();
            int i1 = getWidth();
            int j1 = getHeight();
            int k1 = ((Context) (obj)).getResources().getDisplayMetrics().widthPixels;
            obj = Toast.makeText(((Context) (obj)), a.c, 0);
            ((Toast) (obj)).setGravity(49, (view[0] + i1 / 2) - k1 / 2, j1);
            ((Toast) (obj)).show();
            return true;
        }

        public final void onMeasure(int i1, int j1)
        {
            super.onMeasure(i1, j1);
            i1 = getMeasuredWidth();
            if (i1 < TabLayout.f(b) || i1 > TabLayout.g(b))
            {
                super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(android.support.design.widget.d.a(i1, TabLayout.f(b), TabLayout.g(b)), 0x40000000), j1);
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
            b = TabLayout.this;
            super(context);
            a = c1;
            if (TabLayout.a(TabLayout.this) != 0)
            {
                setBackgroundDrawable(TintManager.getDrawable(context, TabLayout.a(TabLayout.this)));
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
            a.setCurrentItem(c1.d);
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
    private g s;
    private g t;

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
        setHorizontalScrollBarEnabled(false);
        setFillViewport(true);
        c = new b(context);
        addView(c, -2, -1);
        context = context.obtainStyledAttributes(attributeset, android.support.design.a.g.TabLayout, i1, android.support.design.a.f.Widget_Design_TabLayout);
        attributeset = c;
        attributeset.a = context.getDimensionPixelSize(android.support.design.a.g.TabLayout_tabIndicatorHeight, 0);
        x.d(attributeset);
        attributeset = c;
        i1 = context.getColor(android.support.design.a.g.TabLayout_tabIndicatorColor, 0);
        ((b) (attributeset)).b.setColor(i1);
        x.d(attributeset);
        h = context.getResourceId(android.support.design.a.g.TabLayout_tabTextAppearance, android.support.design.a.f.TextAppearance_Design_Tab);
        i1 = context.getDimensionPixelSize(android.support.design.a.g.TabLayout_tabPadding, 0);
        g = i1;
        f = i1;
        e = i1;
        d = i1;
        d = context.getDimensionPixelSize(android.support.design.a.g.TabLayout_tabPaddingStart, d);
        e = context.getDimensionPixelSize(android.support.design.a.g.TabLayout_tabPaddingTop, e);
        f = context.getDimensionPixelSize(android.support.design.a.g.TabLayout_tabPaddingEnd, f);
        g = context.getDimensionPixelSize(android.support.design.a.g.TabLayout_tabPaddingBottom, g);
        i = e(h);
        if (context.hasValue(android.support.design.a.g.TabLayout_tabTextColor))
        {
            i = context.getColorStateList(android.support.design.a.g.TabLayout_tabTextColor);
        }
        if (context.hasValue(android.support.design.a.g.TabLayout_tabSelectedTextColor))
        {
            i1 = context.getColor(android.support.design.a.g.TabLayout_tabSelectedTextColor, 0);
            int j1 = i.getDefaultColor();
            i = new ColorStateList(new int[][] {
                SELECTED_STATE_SET, EMPTY_STATE_SET
            }, new int[] {
                i1, j1
            });
        }
        k = context.getDimensionPixelSize(android.support.design.a.g.TabLayout_tabMinWidth, 0);
        m = context.getDimensionPixelSize(android.support.design.a.g.TabLayout_tabMaxWidth, 0);
        j = context.getResourceId(android.support.design.a.g.TabLayout_tabBackground, 0);
        n = context.getDimensionPixelSize(android.support.design.a.g.TabLayout_tabContentStart, 0);
        p = context.getInt(android.support.design.a.g.TabLayout_tabMode, 1);
        o = context.getInt(android.support.design.a.g.TabLayout_tabGravity, 0);
        context.recycle();
        a();
    }

    private int a(int i1, float f1)
    {
        int j1 = 0;
        int k1 = 0;
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
            j1 = k1;
            if (view != null)
            {
                j1 = view.getWidth();
            }
            k1 = view1.getLeft();
            j1 = ((int)((float)(j1 + i1) * f1 * 0.5F) + k1 + view1.getWidth() / 2) - getWidth() / 2;
        }
        return j1;
    }

    static int a(TabLayout tablayout)
    {
        return tablayout.j;
    }

    private void a()
    {
        int i1;
        if (p == 0)
        {
            i1 = Math.max(0, n - d);
        } else
        {
            i1 = 0;
        }
        x.b(c, i1, 0, 0, 0);
        p;
        JVM INSTR tableswitch 0 1: default 60
    //                   0 76
    //                   1 65;
           goto _L1 _L2 _L3
_L1:
        b();
        return;
_L3:
        c.setGravity(1);
        continue; /* Loop/switch isn't completed */
_L2:
        c.setGravity(0x800003);
        if (true) goto _L1; else goto _L4
_L4:
    }

    private void a(c c1, int i1)
    {
        c1.d = i1;
        a.add(i1, c1);
        int j1 = a.size();
        for (i1++; i1 < j1; i1++)
        {
            ((c)a.get(i1)).d = i1;
        }

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

    private void b()
    {
        for (int i1 = 0; i1 < c.getChildCount(); i1++)
        {
            View view = c.getChildAt(i1);
            a((android.widget.LinearLayout.LayoutParams)view.getLayoutParams());
            view.requestLayout();
        }

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

    static int d(TabLayout tablayout)
    {
        return tablayout.f;
    }

    private void d(int i1)
    {
        int k1 = 0;
        if (i1 != -1) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (getWindowToken() == null || !x.E(this)) goto _L4; else goto _L3
_L3:
        Object obj;
        int j1;
        int l1;
        obj = c;
        l1 = ((b) (obj)).getChildCount();
        j1 = 0;
_L7:
        if (j1 >= l1)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        if (((b) (obj)).getChildAt(j1).getWidth() > 0) goto _L6; else goto _L5
_L5:
        j1 = 1;
_L8:
        if (j1 == 0)
        {
            break MISSING_BLOCK_LABEL_87;
        }
_L4:
        a(i1, 0.0F, true);
        return;
_L6:
        j1++;
          goto _L7
        j1 = 0;
          goto _L8
        int i2;
        j1 = getScrollX();
        l1 = a(i1, 0.0F);
        if (j1 != l1)
        {
            if (s == null)
            {
                s = android.support.design.widget.n.a();
                s.a(android.support.design.widget.a.b);
                s.a.e();
                s.a(new g.c() {

                    final TabLayout a;

                    public final void a(g g2)
                    {
                        a.scrollTo(g2.a.c(), 0);
                    }

            
            {
                a = TabLayout.this;
                super();
            }
                });
            }
            s.a(j1, l1);
            s.a.a();
        }
        obj = c;
        j1 = k1;
        if (x.h(((View) (obj))) == 1)
        {
            j1 = 1;
        }
        View view = ((b) (obj)).getChildAt(i1);
        l1 = view.getLeft();
        i2 = view.getRight();
        if (Math.abs(i1 - ((b) (obj)).c) > 1)
        {
            break; /* Loop/switch isn't completed */
        }
        j1 = ((b) (obj)).e;
        k1 = ((b) (obj)).f;
_L10:
        if (j1 != l1 || k1 != i2)
        {
            TabLayout tablayout = ((b) (obj)).g;
            g g1 = android.support.design.widget.n.a();
            tablayout.t = g1;
            g1.a(android.support.design.widget.a.b);
            g1.a.e();
            g1.a.d();
            g1.a(new g.c(((b) (obj)), j1, l1, k1, i2) {

                final int a;
                final int b;
                final int c;
                final int d;
                final b e;

                public final void a(g g2)
                {
                    float f1 = g2.a.g();
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
            obj = new g.b(((b) (obj)), i1) {

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
            };
            g1.a.a(new g._cls2(g1, ((g.a) (obj))));
            g1.a.a();
            return;
        }
        if (true) goto _L1; else goto _L9
_L9:
label0:
        {
            k1 = ((b) (obj)).g.c(24);
            if (i1 < ((b) (obj)).c)
            {
                if (j1 != 0)
                {
                    break label0;
                }
                k1 = i2 + k1;
                j1 = k1;
            } else
            {
                if (j1 == 0)
                {
                    break label0;
                }
                k1 = i2 + k1;
                j1 = k1;
            }
        }
          goto _L10
        k1 = l1 - k1;
        j1 = k1;
          goto _L10
    }

    static int e(TabLayout tablayout)
    {
        return tablayout.g;
    }

    private ColorStateList e(int i1)
    {
        TypedArray typedarray = getContext().obtainStyledAttributes(i1, android.support.design.a.g.TextAppearance);
        ColorStateList colorstatelist = typedarray.getColorStateList(android.support.design.a.g.TextAppearance_android_textColor);
        typedarray.recycle();
        return colorstatelist;
        Exception exception;
        exception;
        typedarray.recycle();
        throw exception;
    }

    static int f(TabLayout tablayout)
    {
        return tablayout.k;
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
        return tablayout.c(16);
    }

    static int m(TabLayout tablayout)
    {
        tablayout.o = 0;
        return 0;
    }

    static void n(TabLayout tablayout)
    {
        tablayout.b();
    }

    private void setSelectedTabView(int i1)
    {
        int k1 = c.getChildCount();
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

    public final c a(int i1)
    {
        return (c)a.get(i1);
    }

    public final void a(int i1, float f1, boolean flag)
    {
        if ((t == null || !t.a.b()) && i1 >= 0 && i1 < c.getChildCount())
        {
            b b1 = c;
            if (b1.g.t == null || !b1.g.t.a.b())
            {
                b1.c = i1;
                b1.d = f1;
                b1.a();
            }
            scrollTo(a(i1, f1), 0);
            if (flag)
            {
                setSelectedTabView(Math.round((float)i1 + f1));
                return;
            }
        }
    }

    final void a(c c1, boolean flag)
    {
        if (b == c1)
        {
            if (b != null)
            {
                d(c1.d);
            }
        } else
        {
            int i1;
            if (c1 != null)
            {
                i1 = c1.d;
            } else
            {
                i1 = -1;
            }
            setSelectedTabView(i1);
            if (flag)
            {
                if ((b == null || b.d == -1) && i1 != -1)
                {
                    a(i1, 0.0F, true);
                } else
                {
                    d(i1);
                }
            }
            b = c1;
            if (b != null && q != null)
            {
                q.a(b);
                return;
            }
        }
    }

    public int getSelectedTabPosition()
    {
        if (b != null)
        {
            return b.d;
        } else
        {
            return -1;
        }
    }

    public int getTabCount()
    {
        return a.size();
    }

    public int getTabGravity()
    {
        return o;
    }

    public int getTabMode()
    {
        return p;
    }

    public ColorStateList getTabTextColors()
    {
        return i;
    }

    protected void onMeasure(int i1, int j1)
    {
        int k1 = c(48) + getPaddingTop() + getPaddingBottom();
        android.view.View.MeasureSpec.getMode(j1);
        JVM INSTR lookupswitch 2: default 48
    //                   -2147483648: 161
    //                   0: 180;
           goto _L1 _L2 _L3
_L1:
label0:
        {
            super.onMeasure(i1, j1);
            if (p == 1 && getChildCount() == 1)
            {
                View view = getChildAt(0);
                i1 = getMeasuredWidth();
                if (view.getMeasuredWidth() > i1)
                {
                    j1 = getChildMeasureSpec(j1, getPaddingTop() + getPaddingBottom(), view.getLayoutParams().height);
                    view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x40000000), j1);
                }
            }
            j1 = m;
            k1 = getMeasuredWidth() - c(56);
            if (j1 != 0)
            {
                i1 = j1;
                if (j1 <= k1)
                {
                    break label0;
                }
            }
            i1 = k1;
        }
        l = i1;
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

    public void setTabGravity(int i1)
    {
        if (o != i1)
        {
            o = i1;
            a();
        }
    }

    public void setTabMode(int i1)
    {
        if (i1 != p)
        {
            p = i1;
            a();
        }
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

    public void setTabsFromPagerAdapter(t t1)
    {
        c.removeAllViews();
        for (Iterator iterator = a.iterator(); iterator.hasNext(); iterator.remove())
        {
            ((c)iterator.next()).d = -1;
        }

        b = null;
        int i1 = 0;
        for (int j1 = t1.getCount(); i1 < j1; i1++)
        {
            c c1 = new c(this);
            c1.b = t1.getPageTitle(i1);
            if (c1.d >= 0)
            {
                c1.f.b(c1.d);
            }
            boolean flag = a.isEmpty();
            if (c1.f != this)
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
                        ((e)view).a.a();
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
                c1.a();
            }
        }

    }

    public void setupWithViewPager(ViewPager viewpager)
    {
        t t1 = viewpager.getAdapter();
        if (t1 == null)
        {
            throw new IllegalArgumentException("ViewPager does not have a PagerAdapter set");
        }
        setTabsFromPagerAdapter(t1);
        viewpager.addOnPageChangeListener(new d(this));
        setOnTabSelectedListener(new f(viewpager));
        if (b == null || b.d != viewpager.getCurrentItem())
        {
            a(viewpager.getCurrentItem()).a();
        }
    }
}
