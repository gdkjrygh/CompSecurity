// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.afollestad.materialdialogs.internal;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ScrollView;
import com.afollestad.materialdialogs.e;
import com.afollestad.materialdialogs.util.a;

// Referenced classes of package com.afollestad.materialdialogs.internal:
//            MDButton

public class MDRootLayout extends ViewGroup
{

    private View a;
    private View b;
    private boolean c;
    private boolean d;
    private final MDButton e[];
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private int k;
    private int l;
    private int m;
    private e n;
    private int o;
    private Paint p;
    private android.view.ViewTreeObserver.OnScrollChangedListener q;
    private android.view.ViewTreeObserver.OnScrollChangedListener r;
    private int s;

    public MDRootLayout(Context context)
    {
        super(context);
        c = false;
        d = false;
        e = new MDButton[3];
        f = false;
        g = false;
        h = true;
        n = e.a;
        a(context, ((AttributeSet) (null)), 0);
    }

    public MDRootLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = false;
        d = false;
        e = new MDButton[3];
        f = false;
        g = false;
        h = true;
        n = e.a;
        a(context, attributeset, 0);
    }

    public MDRootLayout(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        c = false;
        d = false;
        e = new MDButton[3];
        f = false;
        g = false;
        h = true;
        n = e.a;
        a(context, attributeset, i1);
    }

    public MDRootLayout(Context context, AttributeSet attributeset, int i1, int j1)
    {
        super(context, attributeset, i1, j1);
        c = false;
        d = false;
        e = new MDButton[3];
        f = false;
        g = false;
        h = true;
        n = e.a;
        a(context, attributeset, i1);
    }

    private static View a(ViewGroup viewgroup)
    {
        if (viewgroup != null && viewgroup.getChildCount() != 0) goto _L2; else goto _L1
_L1:
        View view = null;
_L6:
        return view;
_L2:
        int i1 = viewgroup.getChildCount() - 1;
_L7:
        if (i1 < 0) goto _L4; else goto _L3
_L3:
        View view1;
        view1 = viewgroup.getChildAt(i1);
        if (view1.getVisibility() != 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        view = view1;
        if (view1.getBottom() == viewgroup.getMeasuredHeight()) goto _L6; else goto _L5
_L5:
        i1--;
          goto _L7
_L4:
        return null;
    }

    private void a(Context context, AttributeSet attributeset, int i1)
    {
        Resources resources = context.getResources();
        attributeset = context.obtainStyledAttributes(attributeset, com.afollestad.materialdialogs.R.styleable.MDRootLayout, i1, 0);
        i = attributeset.getBoolean(com.afollestad.materialdialogs.R.styleable.MDRootLayout_md_reduce_padding_no_title_no_buttons, true);
        attributeset.recycle();
        k = resources.getDimensionPixelSize(com.afollestad.materialdialogs.R.dimen.md_notitle_vertical_padding);
        l = resources.getDimensionPixelSize(com.afollestad.materialdialogs.R.dimen.md_button_frame_vertical_padding);
        o = resources.getDimensionPixelSize(com.afollestad.materialdialogs.R.dimen.md_button_padding_frame_side);
        m = resources.getDimensionPixelSize(com.afollestad.materialdialogs.R.dimen.md_button_height);
        p = new Paint();
        s = resources.getDimensionPixelSize(com.afollestad.materialdialogs.R.dimen.md_divider_height);
        p.setColor(com.afollestad.materialdialogs.util.a.a(context, com.afollestad.materialdialogs.R.attr.md_divider_color));
        setWillNotDraw(false);
    }

    private void a(View view, boolean flag, boolean flag1)
    {
        if (view != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!(view instanceof ScrollView))
        {
            break; /* Loop/switch isn't completed */
        }
        view = (ScrollView)view;
        if (a(((ScrollView) (view))))
        {
            a(((ViewGroup) (view)), flag, flag1);
            return;
        }
        if (flag)
        {
            c = false;
        }
        if (flag1)
        {
            d = false;
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (!(view instanceof AdapterView))
        {
            break; /* Loop/switch isn't completed */
        }
        view = (AdapterView)view;
        if (a(((AdapterView) (view))))
        {
            a(((ViewGroup) (view)), flag, flag1);
            return;
        }
        if (flag)
        {
            c = false;
        }
        if (flag1)
        {
            d = false;
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
        if (view instanceof WebView)
        {
            view.getViewTreeObserver().addOnPreDrawListener(new android.view.ViewTreeObserver.OnPreDrawListener(view, flag, flag1) {

                final View a;
                final boolean b;
                final boolean c;
                final MDRootLayout d;

                public boolean onPreDraw()
                {
                    if (a.getMeasuredHeight() != 0)
                    {
                        if (!com.afollestad.materialdialogs.internal.MDRootLayout.a((WebView)a))
                        {
                            if (b)
                            {
                                com.afollestad.materialdialogs.internal.MDRootLayout.a(d, false);
                            }
                            if (c)
                            {
                                MDRootLayout.b(d, false);
                            }
                        } else
                        {
                            com.afollestad.materialdialogs.internal.MDRootLayout.a(d, (ViewGroup)a, b, c);
                        }
                        a.getViewTreeObserver().removeOnPreDrawListener(this);
                    }
                    return true;
                }

            
            {
                d = MDRootLayout.this;
                a = view;
                b = flag;
                c = flag1;
                super();
            }
            });
            return;
        }
        if (!(view instanceof RecyclerView))
        {
            continue; /* Loop/switch isn't completed */
        }
        boolean flag2 = a((RecyclerView)view);
        if (flag)
        {
            c = flag2;
        }
        if (flag1)
        {
            d = flag2;
            return;
        }
        continue; /* Loop/switch isn't completed */
        if (!(view instanceof ViewGroup)) goto _L1; else goto _L5
_L5:
        View view1 = b((ViewGroup)view);
        a(view1, flag, flag1);
        view = a((ViewGroup)view);
        if (view != view1)
        {
            a(view, false, true);
            return;
        }
        if (true) goto _L1; else goto _L6
_L6:
    }

    private void a(ViewGroup viewgroup, boolean flag, boolean flag1)
    {
        if (!flag1 && q == null || flag1 && r == null)
        {
            android.view.ViewTreeObserver.OnScrollChangedListener onscrollchangedlistener = new android.view.ViewTreeObserver.OnScrollChangedListener(viewgroup, flag, flag1) {

                final ViewGroup a;
                final boolean b;
                final boolean c;
                final MDRootLayout d;

                public void onScrollChanged()
                {
                    MDButton amdbutton[];
                    int i1;
                    int j1;
                    amdbutton = com.afollestad.materialdialogs.internal.MDRootLayout.a(d);
                    j1 = amdbutton.length;
                    i1 = 0;
_L3:
                    MDButton mdbutton;
                    if (i1 >= j1)
                    {
                        break MISSING_BLOCK_LABEL_113;
                    }
                    mdbutton = amdbutton[i1];
                    if (mdbutton == null || mdbutton.getVisibility() == 8) goto _L2; else goto _L1
_L1:
                    boolean flag2 = true;
_L4:
                    if (a instanceof WebView)
                    {
                        com.afollestad.materialdialogs.internal.MDRootLayout.a(d, (WebView)a, b, c, flag2);
                    } else
                    {
                        com.afollestad.materialdialogs.internal.MDRootLayout.a(d, a, b, c, flag2);
                    }
                    d.invalidate();
                    return;
_L2:
                    i1++;
                      goto _L3
                    flag2 = false;
                      goto _L4
                }

            
            {
                d = MDRootLayout.this;
                a = viewgroup;
                b = flag;
                c = flag1;
                super();
            }
            };
            if (!flag1)
            {
                q = onscrollchangedlistener;
                viewgroup.getViewTreeObserver().addOnScrollChangedListener(q);
            } else
            {
                r = onscrollchangedlistener;
                viewgroup.getViewTreeObserver().addOnScrollChangedListener(r);
            }
            onscrollchangedlistener.onScrollChanged();
        }
    }

    private void a(ViewGroup viewgroup, boolean flag, boolean flag1, boolean flag2)
    {
        boolean flag3 = true;
        if (flag && viewgroup.getChildCount() > 0)
        {
            if (a != null && a.getVisibility() != 8 && viewgroup.getScrollY() + viewgroup.getPaddingTop() > viewgroup.getChildAt(0).getTop())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            c = flag;
        }
        if (flag1 && viewgroup.getChildCount() > 0)
        {
            if (flag2 && (viewgroup.getScrollY() + viewgroup.getHeight()) - viewgroup.getPaddingBottom() < viewgroup.getChildAt(viewgroup.getChildCount() - 1).getBottom())
            {
                flag = flag3;
            } else
            {
                flag = false;
            }
            d = flag;
        }
    }

    private void a(WebView webview, boolean flag, boolean flag1, boolean flag2)
    {
        boolean flag3 = true;
        if (flag)
        {
            if (a != null && a.getVisibility() != 8 && webview.getScrollY() + webview.getPaddingTop() > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            c = flag;
        }
        if (flag1)
        {
            if (flag2 && (float)((webview.getScrollY() + webview.getMeasuredHeight()) - webview.getPaddingBottom()) < (float)webview.getContentHeight() * webview.getScale())
            {
                flag = flag3;
            } else
            {
                flag = false;
            }
            d = flag;
        }
    }

    static void a(MDRootLayout mdrootlayout, ViewGroup viewgroup, boolean flag, boolean flag1)
    {
        mdrootlayout.a(viewgroup, flag, flag1);
    }

    static void a(MDRootLayout mdrootlayout, ViewGroup viewgroup, boolean flag, boolean flag1, boolean flag2)
    {
        mdrootlayout.a(viewgroup, flag, flag1, flag2);
    }

    static void a(MDRootLayout mdrootlayout, WebView webview, boolean flag, boolean flag1, boolean flag2)
    {
        mdrootlayout.a(webview, flag, flag1, flag2);
    }

    public static boolean a(RecyclerView recyclerview)
    {
        if (recyclerview != null && recyclerview.getAdapter() != null && recyclerview.getLayoutManager() != null)
        {
            android.support.v7.widget.RecyclerView.LayoutManager layoutmanager = recyclerview.getLayoutManager();
            int i1 = recyclerview.getAdapter().getItemCount();
            if (layoutmanager instanceof LinearLayoutManager)
            {
                int j1 = ((LinearLayoutManager)layoutmanager).findLastVisibleItemPosition();
                if (j1 != -1)
                {
                    boolean flag;
                    if (j1 == i1 - 1)
                    {
                        i1 = 1;
                    } else
                    {
                        i1 = 0;
                    }
                    if (!i1 || recyclerview.getChildCount() > 0 && recyclerview.getChildAt(recyclerview.getChildCount() - 1).getBottom() > recyclerview.getHeight() - recyclerview.getPaddingBottom())
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    return flag;
                }
            } else
            {
                throw new com.afollestad.materialdialogs.f.i("Material Dialogs currently only supports LinearLayoutManager. Please report any new layout managers.");
            }
        }
        return false;
    }

    private static boolean a(View view)
    {
        boolean flag;
        if (view != null && view.getVisibility() != 8)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag && (view instanceof MDButton))
        {
            return ((MDButton)view).getText().toString().trim().length() > 0;
        } else
        {
            return flag;
        }
    }

    static boolean a(WebView webview)
    {
        return b(webview);
    }

    private static boolean a(AdapterView adapterview)
    {
        boolean flag3 = true;
        boolean flag2;
        if (adapterview.getLastVisiblePosition() == -1)
        {
            flag2 = false;
        } else
        {
            boolean flag;
            boolean flag1;
            if (adapterview.getFirstVisiblePosition() == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (adapterview.getLastVisiblePosition() == adapterview.getCount() - 1)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            flag2 = flag3;
            if (flag)
            {
                flag2 = flag3;
                if (flag1)
                {
                    flag2 = flag3;
                    if (adapterview.getChildCount() > 0)
                    {
                        flag2 = flag3;
                        if (adapterview.getChildAt(0).getTop() >= adapterview.getPaddingTop())
                        {
                            flag2 = flag3;
                            if (adapterview.getChildAt(adapterview.getChildCount() - 1).getBottom() <= adapterview.getHeight() - adapterview.getPaddingBottom())
                            {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return flag2;
    }

    private static boolean a(ScrollView scrollview)
    {
        int i1;
        if (scrollview.getChildCount() != 0)
        {
            if (scrollview.getMeasuredHeight() - scrollview.getPaddingTop() - scrollview.getPaddingBottom() < (i1 = scrollview.getChildAt(0).getMeasuredHeight()))
            {
                return true;
            }
        }
        return false;
    }

    static boolean a(MDRootLayout mdrootlayout, boolean flag)
    {
        mdrootlayout.c = flag;
        return flag;
    }

    static MDButton[] a(MDRootLayout mdrootlayout)
    {
        return mdrootlayout.e;
    }

    private static View b(ViewGroup viewgroup)
    {
        if (viewgroup != null && viewgroup.getChildCount() != 0) goto _L2; else goto _L1
_L1:
        View view = null;
_L6:
        return view;
_L2:
        int i1 = viewgroup.getChildCount() - 1;
_L7:
        if (i1 < 0) goto _L4; else goto _L3
_L3:
        View view1;
        view1 = viewgroup.getChildAt(i1);
        if (view1.getVisibility() != 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        view = view1;
        if (view1.getTop() == 0) goto _L6; else goto _L5
_L5:
        i1--;
          goto _L7
_L4:
        return null;
    }

    private void b()
    {
        while (android.os.Build.VERSION.SDK_INT < 17 || getResources().getConfiguration().getLayoutDirection() != 1) 
        {
            return;
        }
        static class _cls3
        {

            static final int a[];

            static 
            {
                a = new int[com.afollestad.materialdialogs.e.values().length];
                try
                {
                    a[e.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[e.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (com.afollestad.materialdialogs.internal._cls3.a[n.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            n = e.c;
            return;

        case 2: // '\002'
            n = e.a;
            break;
        }
    }

    private static boolean b(WebView webview)
    {
        return (float)webview.getMeasuredHeight() < (float)webview.getContentHeight() * webview.getScale();
    }

    static boolean b(MDRootLayout mdrootlayout, boolean flag)
    {
        mdrootlayout.d = flag;
        return flag;
    }

    public void a()
    {
        j = true;
    }

    public void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (b != null)
        {
            if (c)
            {
                int i1 = b.getTop();
                canvas.drawRect(0.0F, i1 - s, getMeasuredWidth(), i1, p);
            }
            if (d)
            {
                int j1 = b.getBottom();
                canvas.drawRect(0.0F, j1, getMeasuredWidth(), j1 + s, p);
            }
        }
    }

    public void onFinishInflate()
    {
        super.onFinishInflate();
        int i1 = 0;
        while (i1 < getChildCount()) 
        {
            View view = getChildAt(i1);
            if (view.getId() == com.afollestad.materialdialogs.R.id.titleFrame)
            {
                a = view;
            } else
            if (view.getId() == com.afollestad.materialdialogs.R.id.buttonDefaultNeutral)
            {
                e[0] = (MDButton)view;
            } else
            if (view.getId() == com.afollestad.materialdialogs.R.id.buttonDefaultNegative)
            {
                e[1] = (MDButton)view;
            } else
            if (view.getId() == com.afollestad.materialdialogs.R.id.buttonDefaultPositive)
            {
                e[2] = (MDButton)view;
            } else
            {
                b = view;
            }
            i1++;
        }
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        if (!a(a)) goto _L2; else goto _L1
_L1:
        int i2;
        i2 = a.getMeasuredHeight();
        a.layout(i1, j1, k1, j1 + i2);
        i2 = j1 + i2;
_L5:
        if (a(b))
        {
            b.layout(i1, i2, k1, b.getMeasuredHeight() + i2);
        }
        if (!g)
        {
            break; /* Loop/switch isn't completed */
        }
        l1 -= l;
        MDButton amdbutton[] = e;
        int k2 = amdbutton.length;
        for (j1 = 0; j1 < k2;)
        {
            MDButton mdbutton = amdbutton[j1];
            i2 = l1;
            if (a(mdbutton))
            {
                mdbutton.layout(i1, l1 - mdbutton.getMeasuredHeight(), k1, l1);
                i2 = l1 - mdbutton.getMeasuredHeight();
            }
            j1++;
            l1 = i2;
        }

          goto _L3
_L2:
        i2 = j1;
        if (!j)
        {
            i2 = j1;
            if (h)
            {
                i2 = j1 + k;
            }
        }
        if (true) goto _L5; else goto _L4
_L4:
        int i3 = l1;
        if (h)
        {
            i3 = l1 - l;
        }
        int j3 = i3 - m;
        int l2 = o;
        int j2;
        if (a(e[2]))
        {
            if (n == e.c)
            {
                l1 = i1 + l2;
                j1 = e[2].getMeasuredWidth() + l1;
                j2 = -1;
            } else
            {
                j1 = k1 - l2;
                l1 = j1 - e[2].getMeasuredWidth();
                j2 = l1;
            }
            e[2].layout(l1, j3, j1, i3);
            j1 = e[2].getMeasuredWidth() + l2;
        } else
        {
            j2 = -1;
            j1 = l2;
        }
        if (a(e[1]))
        {
            if (n == e.c)
            {
                l2 = i1 + j1;
                l1 = e[1].getMeasuredWidth() + l2;
                j1 = -1;
            } else
            if (n == e.a)
            {
                l1 = k1 - j1;
                l2 = l1 - e[1].getMeasuredWidth();
                j1 = -1;
            } else
            {
                l2 = i1 + o;
                l1 = e[1].getMeasuredWidth() + l2;
                j1 = l1;
            }
            e[1].layout(l2, j3, l1, i3);
            l1 = j1;
        } else
        {
            l1 = -1;
        }
        if (!a(e[0])) goto _L3; else goto _L6
_L6:
        if (n != e.c) goto _L8; else goto _L7
_L7:
        j1 = k1 - o;
        l1 = j1 - e[0].getMeasuredWidth();
_L10:
        e[0].layout(l1, j3, j1, i3);
_L3:
        a(b, true, true);
        return;
_L8:
        if (n == e.a)
        {
            l1 = i1 + o;
            j1 = l1 + e[0].getMeasuredWidth();
        } else
        if (l1 == -1 && j2 != -1)
        {
            l1 = j2 - e[0].getMeasuredWidth();
            j1 = j2;
        } else
        if (j2 == -1 && l1 != -1)
        {
            j1 = l1 + e[0].getMeasuredWidth();
        } else
        {
            j1 = j2;
            if (j2 == -1)
            {
                l1 = (k1 - i1) / 2 - e[0].getMeasuredWidth() / 2;
                j1 = l1 + e[0].getMeasuredWidth();
            }
        }
        if (true) goto _L10; else goto _L9
_L9:
    }

    public void onMeasure(int i1, int j1)
    {
        boolean flag = false;
        int k4 = android.view.View.MeasureSpec.getSize(i1);
        int j4 = android.view.View.MeasureSpec.getSize(j1);
        h = true;
        int k1;
        boolean flag1;
        if (!f)
        {
            MDButton amdbutton[] = e;
            int l4 = amdbutton.length;
            int l1 = 0;
            int j3 = 0;
            int k2;
            for (k1 = 0; l1 < l4; k1 = k2)
            {
                MDButton mdbutton = amdbutton[l1];
                int l3 = j3;
                k2 = k1;
                if (mdbutton != null)
                {
                    l3 = j3;
                    k2 = k1;
                    if (a(mdbutton))
                    {
                        mdbutton.a(false, false);
                        measureChild(mdbutton, i1, j1);
                        l3 = j3 + mdbutton.getMeasuredWidth();
                        k2 = 1;
                    }
                }
                l1++;
                j3 = l3;
            }

            MDButton mdbutton1;
            int l2;
            int i4;
            if (j3 > k4 - getContext().getResources().getDimensionPixelSize(com.afollestad.materialdialogs.R.dimen.md_neutral_button_margin) * 2)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
        } else
        {
            flag1 = true;
            k1 = 0;
        }
        g = flag1;
        int j2;
        int i3;
        int k3;
        if (flag1)
        {
            amdbutton = e;
            l4 = amdbutton.length;
            l2 = 0;
            j3 = 0;
            int i2 = k1;
            k1 = j3;
            while (l2 < l4) 
            {
                mdbutton1 = amdbutton[l2];
                i4 = k1;
                j3 = i2;
                if (mdbutton1 != null)
                {
                    i4 = k1;
                    j3 = i2;
                    if (a(mdbutton1))
                    {
                        mdbutton1.a(true, false);
                        measureChild(mdbutton1, i1, j1);
                        i4 = k1 + mdbutton1.getMeasuredHeight();
                        j3 = 1;
                    }
                }
                l2++;
                k1 = i4;
                i2 = j3;
            }
            i3 = i2;
        } else
        {
            i1 = 0;
            i3 = k1;
            k1 = i1;
        }
        if (i3 != 0)
        {
            if (g)
            {
                j1 = j4 - k1;
                i1 = 0 + l * 2;
                k1 = l * 2 + 0;
            } else
            {
                j1 = m;
                i1 = l;
                j1 = j4 - j1;
                i1 = i1 * 2 + 0;
                k1 = 0;
            }
        } else
        {
            i1 = l * 2 + 0;
            j1 = j4;
            k1 = 0;
        }
        if (a(a))
        {
            a.measure(android.view.View.MeasureSpec.makeMeasureSpec(k4, 0x40000000), 0);
            j2 = j1 - a.getMeasuredHeight();
            k3 = i1;
        } else
        {
            k3 = i1;
            j2 = j1;
            if (!j)
            {
                k3 = i1 + k;
                j2 = j1;
            }
        }
        if (a(b))
        {
            b.measure(android.view.View.MeasureSpec.makeMeasureSpec(k4, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(j2 - k1, 0x80000000));
            if (b.getMeasuredHeight() <= j2 - k3)
            {
                if (!i || a(a) || i3 != 0)
                {
                    h = true;
                    i1 = j2 - (b.getMeasuredHeight() + k3);
                } else
                {
                    h = false;
                    i1 = j2 - (k1 + b.getMeasuredHeight());
                }
            } else
            {
                h = false;
                i1 = ((flag) ? 1 : 0);
            }
        } else
        {
            i1 = j2;
        }
        setMeasuredDimension(k4, j4 - i1);
    }

    public void setButtonGravity(e e1)
    {
        n = e1;
        b();
    }

    public void setButtonStackedGravity(e e1)
    {
        MDButton amdbutton[] = e;
        int j1 = amdbutton.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            MDButton mdbutton = amdbutton[i1];
            if (mdbutton != null)
            {
                mdbutton.setStackedGravity(e1);
            }
        }

    }

    public void setDividerColor(int i1)
    {
        p.setColor(i1);
        invalidate();
    }

    public void setForceStack(boolean flag)
    {
        f = flag;
        invalidate();
    }
}
