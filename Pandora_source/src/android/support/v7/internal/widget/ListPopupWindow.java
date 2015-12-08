// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;

public class ListPopupWindow
{
    private static class a extends ListView
    {

        private boolean a;
        private boolean b;

        static boolean a(a a1, boolean flag)
        {
            a1.a = flag;
            return flag;
        }

        final int a(int i1, int j1, int k1, int l1, int i2)
        {
            Object obj;
            ListAdapter listadapter;
            int j2;
            j1 = getListPaddingTop();
            j2 = getListPaddingBottom();
            getListPaddingLeft();
            getListPaddingRight();
            k1 = getDividerHeight();
            obj = getDivider();
            listadapter = getAdapter();
            if (listadapter != null) goto _L2; else goto _L1
_L1:
            i1 = j1 + j2;
_L4:
            return i1;
_L2:
            j1 = j2 + j1;
            int l2;
            int i3;
            int k3;
            if (k1 <= 0 || obj == null)
            {
                k1 = 0;
            }
            l2 = 0;
            obj = null;
            i3 = 0;
            k3 = listadapter.getCount();
            for (int k2 = 0; k2 < k3;)
            {
                int j3 = listadapter.getItemViewType(k2);
                if (j3 != i3)
                {
                    obj = null;
                    i3 = j3;
                }
                obj = listadapter.getView(k2, ((View) (obj)), this);
                android.view.ViewGroup.LayoutParams layoutparams = ((View) (obj)).getLayoutParams();
                if (layoutparams != null && layoutparams.height > 0)
                {
                    j3 = android.view.View.MeasureSpec.makeMeasureSpec(layoutparams.height, 0x40000000);
                } else
                {
                    j3 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                }
                ((View) (obj)).measure(i1, j3);
                if (k2 > 0)
                {
                    j1 += k1;
                }
                j1 += ((View) (obj)).getMeasuredHeight();
                if (j1 >= l1)
                {
                    i1 = l1;
                    if (i2 >= 0)
                    {
                        i1 = l1;
                        if (k2 > i2)
                        {
                            i1 = l1;
                            if (l2 > 0)
                            {
                                i1 = l1;
                                if (j1 != l1)
                                {
                                    return l2;
                                }
                            }
                        }
                    }
                    continue; /* Loop/switch isn't completed */
                }
                j3 = l2;
                if (i2 >= 0)
                {
                    j3 = l2;
                    if (k2 >= i2)
                    {
                        j3 = j1;
                    }
                }
                k2++;
                l2 = j3;
            }

            return j1;
            if (true) goto _L4; else goto _L3
_L3:
        }

        public boolean hasFocus()
        {
            return b || super.hasFocus();
        }

        public boolean hasWindowFocus()
        {
            return b || super.hasWindowFocus();
        }

        public boolean isFocused()
        {
            return b || super.isFocused();
        }

        public boolean isInTouchMode()
        {
            return b && a || super.isInTouchMode();
        }

        public a(Context context, boolean flag)
        {
            super(context, null, android.support.v7.appcompat.R.attr.dropDownListViewStyle);
            b = flag;
            setCacheColorHint(0);
        }
    }

    private class b
        implements Runnable
    {

        final ListPopupWindow a;

        public void run()
        {
            a.e();
        }

        private b()
        {
            a = ListPopupWindow.this;
            super();
        }

    }

    private class c extends DataSetObserver
    {

        final ListPopupWindow a;

        public void onChanged()
        {
            if (a.f())
            {
                a.c();
            }
        }

        public void onInvalidated()
        {
            a.d();
        }

        private c()
        {
            a = ListPopupWindow.this;
            super();
        }

    }

    private class d
        implements android.widget.AbsListView.OnScrollListener
    {

        final ListPopupWindow a;

        public void onScroll(AbsListView abslistview, int i1, int j1, int k1)
        {
        }

        public void onScrollStateChanged(AbsListView abslistview, int i1)
        {
            if (i1 == 1 && !a.g() && ListPopupWindow.b(a).getContentView() != null)
            {
                ListPopupWindow.d(a).removeCallbacks(ListPopupWindow.c(a));
                ListPopupWindow.c(a).run();
            }
        }

        private d()
        {
            a = ListPopupWindow.this;
            super();
        }

    }

    private class e
        implements android.view.View.OnTouchListener
    {

        final ListPopupWindow a;

        public boolean onTouch(View view, MotionEvent motionevent)
        {
            int i1;
            int j1;
            int k1;
            i1 = motionevent.getAction();
            j1 = (int)motionevent.getX();
            k1 = (int)motionevent.getY();
            if (i1 != 0 || ListPopupWindow.b(a) == null || !ListPopupWindow.b(a).isShowing() || j1 < 0 || j1 >= ListPopupWindow.b(a).getWidth() || k1 < 0 || k1 >= ListPopupWindow.b(a).getHeight()) goto _L2; else goto _L1
_L1:
            ListPopupWindow.d(a).postDelayed(ListPopupWindow.c(a), 250L);
_L4:
            return false;
_L2:
            if (i1 == 1)
            {
                ListPopupWindow.d(a).removeCallbacks(ListPopupWindow.c(a));
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        private e()
        {
            a = ListPopupWindow.this;
            super();
        }

    }

    private class f
        implements Runnable
    {

        final ListPopupWindow a;

        public void run()
        {
            if (ListPopupWindow.a(a) != null && ListPopupWindow.a(a).getCount() > ListPopupWindow.a(a).getChildCount() && ListPopupWindow.a(a).getChildCount() <= a.a)
            {
                ListPopupWindow.b(a).setInputMethodMode(2);
                a.c();
            }
        }

        private f()
        {
            a = ListPopupWindow.this;
            super();
        }

    }


    private boolean A;
    int a;
    private Context b;
    private PopupWindow c;
    private ListAdapter d;
    private a e;
    private int f;
    private int g;
    private int h;
    private int i;
    private boolean j;
    private boolean k;
    private boolean l;
    private View m;
    private int n;
    private DataSetObserver o;
    private View p;
    private Drawable q;
    private android.widget.AdapterView.OnItemClickListener r;
    private android.widget.AdapterView.OnItemSelectedListener s;
    private final f t;
    private final e u;
    private final d v;
    private final b w;
    private Runnable x;
    private Handler y;
    private Rect z;

    public ListPopupWindow(Context context)
    {
        this(context, null, android.support.v7.appcompat.R.attr.listPopupWindowStyle);
    }

    public ListPopupWindow(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, android.support.v7.appcompat.R.attr.listPopupWindowStyle);
    }

    public ListPopupWindow(Context context, AttributeSet attributeset, int i1)
    {
        f = -2;
        g = -2;
        k = false;
        l = false;
        a = 0x7fffffff;
        n = 0;
        t = new f();
        u = new e();
        v = new d();
        w = new b();
        y = new Handler();
        z = new Rect();
        b = context;
        c = new PopupWindow(context, attributeset, i1);
        c.setInputMethodMode(1);
        context = b.getResources().getConfiguration().locale;
    }

    static a a(ListPopupWindow listpopupwindow)
    {
        return listpopupwindow.e;
    }

    static PopupWindow b(ListPopupWindow listpopupwindow)
    {
        return listpopupwindow.c;
    }

    static f c(ListPopupWindow listpopupwindow)
    {
        return listpopupwindow.t;
    }

    static Handler d(ListPopupWindow listpopupwindow)
    {
        return listpopupwindow.y;
    }

    private void i()
    {
        if (m != null)
        {
            android.view.ViewParent viewparent = m.getParent();
            if (viewparent instanceof ViewGroup)
            {
                ((ViewGroup)viewparent).removeView(m);
            }
        }
    }

    private int j()
    {
        boolean flag1 = true;
        if (e != null) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj1;
        View view;
        android.widget.LinearLayout.LayoutParams layoutparams;
        int i1;
        int j1;
        int l1;
        boolean flag;
        obj1 = b;
        x = new Runnable() {

            final ListPopupWindow a;

            public void run()
            {
                View view1 = a.b();
                if (view1 != null && view1.getWindowToken() != null)
                {
                    a.c();
                }
            }

            
            {
                a = ListPopupWindow.this;
                super();
            }
        };
        if (!A)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        e = new a(((Context) (obj1)), flag);
        if (q != null)
        {
            e.setSelector(q);
        }
        e.setAdapter(d);
        e.setOnItemClickListener(r);
        e.setFocusable(true);
        e.setFocusableInTouchMode(true);
        e.setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() {

            final ListPopupWindow a;

            public void onItemSelected(AdapterView adapterview, View view1, int i2, long l2)
            {
                if (i2 != -1)
                {
                    adapterview = ListPopupWindow.a(a);
                    if (adapterview != null)
                    {
                        a.a(adapterview, false);
                    }
                }
            }

            public void onNothingSelected(AdapterView adapterview)
            {
            }

            
            {
                a = ListPopupWindow.this;
                super();
            }
        });
        e.setOnScrollListener(v);
        if (s != null)
        {
            e.setOnItemSelectedListener(s);
        }
        obj = e;
        view = m;
        if (view == null) goto _L4; else goto _L3
_L3:
        obj1 = new LinearLayout(((Context) (obj1)));
        ((LinearLayout) (obj1)).setOrientation(1);
        layoutparams = new android.widget.LinearLayout.LayoutParams(-1, 0, 1.0F);
        n;
        JVM INSTR tableswitch 0 1: default 216
    //                   0 430
    //                   1 415;
           goto _L5 _L6 _L7
_L5:
        Log.e("ListPopupWindow", (new StringBuilder()).append("Invalid hint position ").append(n).toString());
_L9:
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(g, 0x80000000), 0);
        obj = (android.widget.LinearLayout.LayoutParams)view.getLayoutParams();
        i1 = view.getMeasuredHeight();
        j1 = ((android.widget.LinearLayout.LayoutParams) (obj)).topMargin;
        i1 = ((android.widget.LinearLayout.LayoutParams) (obj)).bottomMargin + (i1 + j1);
        obj = obj1;
_L15:
        c.setContentView(((View) (obj)));
_L10:
        obj = c.getBackground();
        if (obj != null)
        {
            ((Drawable) (obj)).getPadding(z);
            j1 = z.top + z.bottom;
            if (!j)
            {
                i = -z.top;
            }
        } else
        {
            z.setEmpty();
            j1 = 0;
        }
        if (c.getInputMethodMode() == 2)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        l1 = a(b(), i, flag);
        if (k || f == -1)
        {
            return l1 + j1;
        }
          goto _L8
_L7:
        ((LinearLayout) (obj1)).addView(((View) (obj)), layoutparams);
        ((LinearLayout) (obj1)).addView(view);
          goto _L9
_L6:
        ((LinearLayout) (obj1)).addView(view);
        ((LinearLayout) (obj1)).addView(((View) (obj)), layoutparams);
          goto _L9
_L2:
        obj = (ViewGroup)c.getContentView();
        obj = m;
        int k1;
        if (obj != null)
        {
            obj1 = (android.widget.LinearLayout.LayoutParams)((View) (obj)).getLayoutParams();
            i1 = ((View) (obj)).getMeasuredHeight();
            j1 = ((android.widget.LinearLayout.LayoutParams) (obj1)).topMargin;
            i1 = ((android.widget.LinearLayout.LayoutParams) (obj1)).bottomMargin + (i1 + j1);
        } else
        {
            i1 = 0;
        }
          goto _L10
_L8:
        g;
        JVM INSTR tableswitch -2 -1: default 544
    //                   -2 597
    //                   -1 636;
           goto _L11 _L12 _L13
_L11:
        k1 = android.view.View.MeasureSpec.makeMeasureSpec(g, 0x40000000);
_L14:
        l1 = e.a(k1, 0, -1, l1 - i1, -1);
        k1 = i1;
        if (l1 > 0)
        {
            k1 = i1 + j1;
        }
        return l1 + k1;
_L12:
        k1 = android.view.View.MeasureSpec.makeMeasureSpec(b.getResources().getDisplayMetrics().widthPixels - (z.left + z.right), 0x80000000);
        continue; /* Loop/switch isn't completed */
_L13:
        k1 = android.view.View.MeasureSpec.makeMeasureSpec(b.getResources().getDisplayMetrics().widthPixels - (z.left + z.right), 0x40000000);
        if (true) goto _L14; else goto _L4
_L4:
        i1 = 0;
          goto _L15
    }

    public int a(View view, int i1, boolean flag)
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
        if (c.getBackground() != null)
        {
            c.getBackground().getPadding(z);
            i1 = j1 - (z.top + z.bottom);
        }
        return i1;
    }

    public Drawable a()
    {
        return c.getBackground();
    }

    public void a(int i1)
    {
        n = i1;
    }

    public void a(Drawable drawable)
    {
        c.setBackgroundDrawable(drawable);
    }

    public void a(View view)
    {
        p = view;
    }

    public void a(android.widget.AdapterView.OnItemClickListener onitemclicklistener)
    {
        r = onitemclicklistener;
    }

    public void a(ListAdapter listadapter)
    {
        if (o != null) goto _L2; else goto _L1
_L1:
        o = new c();
_L4:
        d = listadapter;
        if (d != null)
        {
            listadapter.registerDataSetObserver(o);
        }
        if (e != null)
        {
            e.setAdapter(d);
        }
        return;
_L2:
        if (d != null)
        {
            d.unregisterDataSetObserver(o);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void a(android.widget.PopupWindow.OnDismissListener ondismisslistener)
    {
        c.setOnDismissListener(ondismisslistener);
    }

    public void a(boolean flag)
    {
        A = true;
        c.setFocusable(flag);
    }

    public View b()
    {
        return p;
    }

    public void b(int i1)
    {
        h = i1;
    }

    public void c()
    {
        int j1;
        byte byte1;
        boolean flag;
        boolean flag1;
        boolean flag2;
        flag = true;
        flag1 = false;
        byte1 = -1;
        j1 = j();
        flag2 = g();
        if (!c.isShowing()) goto _L2; else goto _L1
_L1:
        int i1;
        if (g == -1)
        {
            i1 = -1;
        } else
        if (g == -2)
        {
            i1 = b().getWidth();
        } else
        {
            i1 = g;
        }
        if (f != -1) goto _L4; else goto _L3
_L3:
        if (!flag2)
        {
            j1 = -1;
        }
        if (flag2)
        {
            PopupWindow popupwindow = c;
            if (g != -1)
            {
                byte1 = 0;
            }
            popupwindow.setWindowLayoutMode(byte1, 0);
        } else
        {
            PopupWindow popupwindow1 = c;
            byte byte2;
            if (g == -1)
            {
                byte2 = -1;
            } else
            {
                byte2 = 0;
            }
            popupwindow1.setWindowLayoutMode(byte2, -1);
        }
_L8:
        popupwindow = c;
        flag = flag1;
        if (!l)
        {
            flag = flag1;
            if (!k)
            {
                flag = true;
            }
        }
        popupwindow.setOutsideTouchable(flag);
        c.update(b(), h, i, i1, j1);
_L6:
        return;
_L4:
        if (f != -2)
        {
            j1 = f;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        PopupWindow popupwindow2;
        byte byte0;
        if (g == -1)
        {
            byte0 = -1;
        } else
        if (g == -2)
        {
            c.setWidth(b().getWidth());
            byte0 = 0;
        } else
        {
            c.setWidth(g);
            byte0 = 0;
        }
        if (f == -1)
        {
            j1 = -1;
        } else
        if (f == -2)
        {
            c.setHeight(j1);
            j1 = 0;
        } else
        {
            c.setHeight(f);
            j1 = 0;
        }
        c.setWindowLayoutMode(byte0, j1);
        popupwindow2 = c;
        if (l || k)
        {
            flag = false;
        }
        popupwindow2.setOutsideTouchable(flag);
        c.setTouchInterceptor(u);
        c.showAsDropDown(b(), h, i);
        e.setSelection(-1);
        if (!A || e.isInTouchMode())
        {
            e();
        }
        if (A) goto _L6; else goto _L5
_L5:
        y.post(w);
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public void c(int i1)
    {
        i = i1;
        j = true;
    }

    public void d()
    {
        c.dismiss();
        i();
        c.setContentView(null);
        e = null;
        y.removeCallbacks(t);
    }

    public void d(int i1)
    {
        g = i1;
    }

    public void e()
    {
        a a1 = e;
        if (a1 != null)
        {
            a.a(a1, true);
            a1.requestLayout();
        }
    }

    public void e(int i1)
    {
        Drawable drawable = c.getBackground();
        if (drawable != null)
        {
            drawable.getPadding(z);
            g = z.left + z.right + i1;
            return;
        } else
        {
            d(i1);
            return;
        }
    }

    public void f(int i1)
    {
        c.setInputMethodMode(i1);
    }

    public boolean f()
    {
        return c.isShowing();
    }

    public void g(int i1)
    {
        a a1 = e;
        if (f() && a1 != null)
        {
            a.a(a1, false);
            a1.setSelection(i1);
            if (a1.getChoiceMode() != 0)
            {
                a1.setItemChecked(i1, true);
            }
        }
    }

    public boolean g()
    {
        return c.getInputMethodMode() == 2;
    }

    public ListView h()
    {
        return e;
    }
}
