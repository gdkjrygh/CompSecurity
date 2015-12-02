// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.a;

import android.content.Context;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;

// Referenced classes of package com.actionbarsherlock.internal.a:
//            h, g, f, d, 
//            c, b, e

public class a
{

    private Context a;
    private PopupWindow b;
    private ListAdapter c;
    private c d;
    private int e;
    private int f;
    private int g;
    private int h;
    private boolean i;
    private int j;
    private View k;
    private int l;
    private DataSetObserver m;
    private View n;
    private Drawable o;
    private android.widget.AdapterView.OnItemClickListener p;
    private android.widget.AdapterView.OnItemSelectedListener q;
    private final h r = new h(this, null);
    private final g s = new g(this, null);
    private final f t = new f(this, null);
    private final d u = new d(this, null);
    private Handler v;
    private Rect w;
    private boolean x;

    public a(Context context, AttributeSet attributeset, int i1)
    {
        e = -2;
        f = -2;
        j = 0x7fffffff;
        l = 0;
        v = new Handler();
        w = new Rect();
        a = context;
        b = new PopupWindow(context, attributeset, i1);
        b.setInputMethodMode(1);
    }

    private int a(int i1, int j1, int k1, int l1, int i2)
    {
        ListAdapter listadapter;
        boolean flag;
        flag = false;
        listadapter = c;
        if (listadapter != null) goto _L2; else goto _L1
_L1:
        i1 = d.getListPaddingTop() + d.getListPaddingBottom();
_L4:
        return i1;
_L2:
        int k3 = d.getListPaddingTop() + d.getListPaddingBottom();
        int j2;
        int k2;
        int l2;
        int i3;
        int j3;
        if (d.getDividerHeight() > 0 && d.getDivider() != null)
        {
            k2 = d.getDividerHeight();
        } else
        {
            k2 = 0;
        }
        j2 = k3;
        l2 = ((flag) ? 1 : 0);
        i3 = j1;
        j3 = k1;
        if (k1 == -1)
        {
            j3 = listadapter.getCount() - 1;
            i3 = j1;
            l2 = ((flag) ? 1 : 0);
            j2 = k3;
        }
        while (i3 <= j3) 
        {
            View view = c.getView(i3, null, d);
            if (d.getCacheColorHint() != 0)
            {
                view.setDrawingCacheBackgroundColor(d.getCacheColorHint());
            }
            a(view, i3, i1);
            j1 = j2;
            if (i3 > 0)
            {
                j1 = j2 + k2;
            }
            j2 = j1 + view.getMeasuredHeight();
            if (j2 >= l1)
            {
                i1 = l1;
                if (i2 >= 0)
                {
                    i1 = l1;
                    if (i3 > i2)
                    {
                        i1 = l1;
                        if (l2 > 0)
                        {
                            i1 = l1;
                            if (j2 != l1)
                            {
                                return l2;
                            }
                        }
                    }
                }
                continue; /* Loop/switch isn't completed */
            }
            j1 = l2;
            if (i2 >= 0)
            {
                j1 = l2;
                if (i3 >= i2)
                {
                    j1 = j2;
                }
            }
            i3++;
            l2 = j1;
        }
        return j2;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private int a(View view, int i1, boolean flag)
    {
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        int ai[] = new int[2];
        view.getLocationOnScreen(ai);
        int j1 = rect.bottom;
        if (flag)
        {
            j1 = view.getContext().getResources().getDisplayMetrics().heightPixels;
        }
        j1 = Math.max(j1 - (ai[1] + view.getHeight()) - i1, (ai[1] - rect.top) + i1);
        i1 = j1;
        if (b.getBackground() != null)
        {
            b.getBackground().getPadding(w);
            i1 = j1 - (w.top + w.bottom);
        }
        return i1;
    }

    static c a(a a1)
    {
        return a1.d;
    }

    private void a(View view, int i1, int j1)
    {
        android.widget.AbsListView.LayoutParams layoutparams1 = (android.widget.AbsListView.LayoutParams)view.getLayoutParams();
        android.widget.AbsListView.LayoutParams layoutparams = layoutparams1;
        if (layoutparams1 == null)
        {
            layoutparams = new android.widget.AbsListView.LayoutParams(-1, -2, 0);
            view.setLayoutParams(layoutparams);
        }
        j1 = ViewGroup.getChildMeasureSpec(j1, d.getPaddingLeft() + d.getPaddingRight(), layoutparams.width);
        i1 = layoutparams.height;
        if (i1 > 0)
        {
            i1 = android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x40000000);
        } else
        {
            i1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        view.measure(j1, i1);
    }

    static int b(a a1)
    {
        return a1.j;
    }

    static PopupWindow c(a a1)
    {
        return a1.b;
    }

    static h d(a a1)
    {
        return a1.r;
    }

    static Handler e(a a1)
    {
        return a1.v;
    }

    private boolean f()
    {
        return b.getInputMethodMode() == 2;
    }

    static boolean f(a a1)
    {
        return a1.f();
    }

    private int g()
    {
        boolean flag1 = true;
        if (d != null) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj2;
        View view;
        android.widget.LinearLayout.LayoutParams layoutparams1;
        int i1;
        boolean flag;
        obj2 = a;
        int j1;
        int l1;
        if (!x)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d = new c(((Context) (obj2)), flag);
        if (o != null)
        {
            d.setSelector(o);
        }
        d.setAdapter(c);
        d.setOnItemClickListener(p);
        d.setFocusable(true);
        d.setFocusableInTouchMode(true);
        d.setOnItemSelectedListener(new b(this));
        d.setOnScrollListener(t);
        if (q != null)
        {
            d.setOnItemSelectedListener(q);
        }
        obj = d;
        view = k;
        if (view == null)
        {
            break MISSING_BLOCK_LABEL_517;
        }
        obj2 = new LinearLayout(((Context) (obj2)));
        ((LinearLayout) (obj2)).setOrientation(1);
        layoutparams1 = new android.widget.LinearLayout.LayoutParams(-1, 0, 1.0F);
        l;
        JVM INSTR tableswitch 0 1: default 204
    //                   0 392
    //                   1 377;
           goto _L3 _L4 _L5
_L3:
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(f, 0x80000000), 0);
        obj = (android.widget.LinearLayout.LayoutParams)view.getLayoutParams();
        i1 = view.getMeasuredHeight();
        j1 = ((android.widget.LinearLayout.LayoutParams) (obj)).topMargin;
        i1 = ((android.widget.LinearLayout.LayoutParams) (obj)).bottomMargin + (i1 + j1);
        obj = obj2;
_L7:
        b.setContentView(((View) (obj)));
          goto _L6
_L5:
        ((LinearLayout) (obj2)).addView(((View) (obj)), layoutparams1);
        ((LinearLayout) (obj2)).addView(view);
          goto _L3
_L4:
        ((LinearLayout) (obj2)).addView(view);
        ((LinearLayout) (obj2)).addView(((View) (obj)), layoutparams1);
          goto _L3
_L2:
        Object obj1 = (ViewGroup)b.getContentView();
        obj1 = k;
        int j2;
        int k2;
        if (obj1 != null)
        {
            android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)((View) (obj1)).getLayoutParams();
            i1 = ((View) (obj1)).getMeasuredHeight();
            k1 = layoutparams.topMargin;
            i1 = layoutparams.bottomMargin + (i1 + k1);
        } else
        {
            i1 = 0;
        }
_L6:
        obj = b.getBackground();
        int k1;
        int i2;
        if (obj != null)
        {
            ((Drawable) (obj)).getPadding(w);
            j1 = w.top;
            l1 = w.bottom;
            if (!i)
            {
                h = -w.top;
            }
            k1 += l1;
        } else
        {
            k1 = 0;
        }
        if (b.getInputMethodMode() == 2)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        i2 = a(n, h, flag);
        if (e == -1)
        {
            return i2 + k1;
        }
        k2 = a(0, 0, -1, i2 - i1, -1);
        j2 = i1;
        if (k2 > 0)
        {
            j2 = i1 + k1;
        }
        return k2 + j2;
        i1 = 0;
          goto _L7
    }

    public void a()
    {
        int j1;
        byte byte1;
        byte byte2;
        boolean flag;
        boolean flag1;
        flag = false;
        byte1 = 0;
        byte2 = -1;
        j1 = g();
        flag1 = f();
        if (!b.isShowing()) goto _L2; else goto _L1
_L1:
        int i1;
        if (f == -1)
        {
            i1 = -1;
        } else
        if (f == -2)
        {
            i1 = n.getWidth();
        } else
        {
            i1 = f;
        }
        if (e != -1) goto _L4; else goto _L3
_L3:
        if (!flag1)
        {
            j1 = -1;
        }
        if (flag1)
        {
            PopupWindow popupwindow = b;
            if (f == -1)
            {
                byte1 = byte2;
            } else
            {
                byte1 = 0;
            }
            popupwindow.setWindowLayoutMode(byte1, 0);
        } else
        {
            PopupWindow popupwindow1 = b;
            if (f == -1)
            {
                byte1 = -1;
            }
            popupwindow1.setWindowLayoutMode(byte1, -1);
        }
_L8:
        b.setOutsideTouchable(true);
        b.update(n, g, h, i1, j1);
_L6:
        return;
_L4:
        if (e != -2)
        {
            j1 = e;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        byte byte0;
        if (f == -1)
        {
            byte0 = -1;
        } else
        if (f == -2)
        {
            b.setWidth(n.getWidth());
            byte0 = 0;
        } else
        {
            b.setWidth(f);
            byte0 = 0;
        }
        if (e == -1)
        {
            j1 = -1;
        } else
        if (e == -2)
        {
            b.setHeight(j1);
            j1 = ((flag) ? 1 : 0);
        } else
        {
            b.setHeight(e);
            j1 = ((flag) ? 1 : 0);
        }
        b.setWindowLayoutMode(byte0, j1);
        b.setOutsideTouchable(true);
        b.setTouchInterceptor(s);
        b.setFocusable(x);
        b.showAsDropDown(n, g, h);
        d.setSelection(-1);
        if (!x || d.isInTouchMode())
        {
            c();
        }
        if (x) goto _L6; else goto _L5
_L5:
        v.post(u);
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public void a(int i1)
    {
        Drawable drawable = b.getBackground();
        if (drawable != null)
        {
            drawable.getPadding(w);
            f = w.left + w.right + i1;
            return;
        } else
        {
            f = i1;
            return;
        }
    }

    public void a(View view)
    {
        n = view;
    }

    public void a(android.widget.AdapterView.OnItemClickListener onitemclicklistener)
    {
        p = onitemclicklistener;
    }

    public void a(ListAdapter listadapter)
    {
        if (m != null) goto _L2; else goto _L1
_L1:
        m = new e(this, null);
_L4:
        c = listadapter;
        if (c != null)
        {
            listadapter.registerDataSetObserver(m);
        }
        if (d != null)
        {
            d.setAdapter(c);
        }
        return;
_L2:
        if (c != null)
        {
            c.unregisterDataSetObserver(m);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void a(android.widget.PopupWindow.OnDismissListener ondismisslistener)
    {
        b.setOnDismissListener(ondismisslistener);
    }

    public void a(boolean flag)
    {
        x = true;
        b.setFocusable(flag);
    }

    public void b()
    {
        b.setFocusable(false);
        b.dismiss();
        if (k != null)
        {
            android.view.ViewParent viewparent = k.getParent();
            if (viewparent instanceof ViewGroup)
            {
                ((ViewGroup)viewparent).removeView(k);
            }
        }
        b.setContentView(null);
        d = null;
        v.removeCallbacks(r);
    }

    public void b(int i1)
    {
        b.setInputMethodMode(i1);
    }

    public void c()
    {
        c c1 = d;
        if (c1 != null)
        {
            com.actionbarsherlock.internal.a.c.a(c1, true);
            c1.requestLayout();
        }
    }

    public boolean d()
    {
        return b.isShowing();
    }

    public ListView e()
    {
        return d;
    }
}
