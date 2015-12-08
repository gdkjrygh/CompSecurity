// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.v4.c.h;
import android.support.v4.widget.as;
import android.support.v7.a.b;
import android.support.v7.a.l;
import android.support.v7.internal.widget.v;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

// Referenced classes of package android.support.v7.widget:
//            af, ae, ad, ab, 
//            ac, w, x

public class ListPopupWindow
{

    private static Method a;
    private Handler A;
    private Rect B;
    private boolean C;
    private int D;
    private Context b;
    public PopupWindow c;
    public DropDownListView d;
    int e;
    int f;
    int g;
    boolean h;
    public int i;
    int j;
    int k;
    public View l;
    public android.widget.AdapterView.OnItemClickListener m;
    private ListAdapter n;
    private int o;
    private boolean p;
    private boolean q;
    private View r;
    private DataSetObserver s;
    private Drawable t;
    private android.widget.AdapterView.OnItemSelectedListener u;
    private final af v;
    private final ae w;
    private final ad x;
    private final ab y;
    private Runnable z;

    public ListPopupWindow(Context context)
    {
        this(context, null, b.listPopupWindowStyle);
    }

    public ListPopupWindow(Context context, AttributeSet attributeset, int i1)
    {
        this(context, attributeset, i1, 0);
    }

    public ListPopupWindow(Context context, AttributeSet attributeset, int i1, int j1)
    {
        o = -2;
        e = -2;
        i = 0;
        p = false;
        q = false;
        j = 0x7fffffff;
        k = 0;
        v = new af(this);
        w = new ae(this);
        x = new ad(this);
        y = new ab(this);
        A = new Handler();
        B = new Rect();
        b = context;
        TypedArray typedarray = context.obtainStyledAttributes(attributeset, l.ListPopupWindow, i1, j1);
        f = typedarray.getDimensionPixelOffset(l.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        g = typedarray.getDimensionPixelOffset(l.ListPopupWindow_android_dropDownVerticalOffset, 0);
        if (g != 0)
        {
            h = true;
        }
        typedarray.recycle();
        c = new v(context, attributeset, i1);
        c.setInputMethodMode(1);
        D = android.support.v4.c.h.a(b.getResources().getConfiguration().locale);
    }

    static DropDownListView a(ListPopupWindow listpopupwindow)
    {
        return listpopupwindow.d;
    }

    static PopupWindow b(ListPopupWindow listpopupwindow)
    {
        return listpopupwindow.c;
    }

    static af c(ListPopupWindow listpopupwindow)
    {
        return listpopupwindow.v;
    }

    static Handler d(ListPopupWindow listpopupwindow)
    {
        return listpopupwindow.A;
    }

    public final void a(int i1)
    {
        Drawable drawable = c.getBackground();
        if (drawable != null)
        {
            drawable.getPadding(B);
            e = B.left + B.right + i1;
            return;
        } else
        {
            e = i1;
            return;
        }
    }

    public final void a(Drawable drawable)
    {
        c.setBackgroundDrawable(drawable);
    }

    public void a(ListAdapter listadapter)
    {
        if (s != null) goto _L2; else goto _L1
_L1:
        s = new ac(this);
_L4:
        n = listadapter;
        if (n != null)
        {
            listadapter.registerDataSetObserver(s);
        }
        if (d != null)
        {
            d.setAdapter(n);
        }
        return;
_L2:
        if (n != null)
        {
            n.unregisterDataSetObserver(s);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(android.widget.PopupWindow.OnDismissListener ondismisslistener)
    {
        c.setOnDismissListener(ondismisslistener);
    }

    public void b()
    {
        byte byte2;
        boolean flag1;
        boolean flag2;
        flag2 = true;
        flag1 = true;
        byte2 = -1;
        if (d != null) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj1;
        View view;
        android.widget.LinearLayout.LayoutParams layoutparams;
        int i1;
        int l1;
        int i2;
        boolean flag;
        obj1 = b;
        z = new w(this);
        int j1;
        if (!C)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d = new DropDownListView(((Context) (obj1)), flag);
        if (t != null)
        {
            d.setSelector(t);
        }
        d.setAdapter(n);
        d.setOnItemClickListener(m);
        d.setFocusable(true);
        d.setFocusableInTouchMode(true);
        d.setOnItemSelectedListener(new x(this));
        d.setOnScrollListener(x);
        if (u != null)
        {
            d.setOnItemSelectedListener(u);
        }
        obj = d;
        view = r;
        if (view == null)
        {
            break MISSING_BLOCK_LABEL_1171;
        }
        obj1 = new LinearLayout(((Context) (obj1)));
        ((LinearLayout) (obj1)).setOrientation(1);
        layoutparams = new android.widget.LinearLayout.LayoutParams(-1, 0, 1.0F);
        k;
        JVM INSTR tableswitch 0 1: default 224
    //                   0 554
    //                   1 539;
           goto _L3 _L4 _L5
_L3:
        (new StringBuilder("Invalid hint position ")).append(k);
_L10:
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(e, 0x80000000), 0);
        obj = (android.widget.LinearLayout.LayoutParams)view.getLayoutParams();
        i1 = view.getMeasuredHeight();
        j1 = ((android.widget.LinearLayout.LayoutParams) (obj)).topMargin;
        i1 = ((android.widget.LinearLayout.LayoutParams) (obj)).bottomMargin + (i1 + j1);
        obj = obj1;
_L19:
        c.setContentView(((View) (obj)));
_L11:
        obj = c.getBackground();
        if (obj != null)
        {
            ((Drawable) (obj)).getPadding(B);
            j1 = B.top + B.bottom;
            l1 = j1;
            if (!h)
            {
                g = -B.top;
                l1 = j1;
            }
        } else
        {
            B.setEmpty();
            l1 = 0;
        }
        c.getInputMethodMode();
        i2 = c.getMaxAvailableHeight(l, g);
        if (!p && o != -1) goto _L7; else goto _L6
_L6:
        i1 = i2 + l1;
_L15:
        flag = g();
        if (!c.isShowing()) goto _L9; else goto _L8
_L8:
        int k1;
        if (e == -1)
        {
            k1 = -1;
        } else
        if (e == -2)
        {
            k1 = l.getWidth();
        } else
        {
            k1 = e;
        }
        if (o == -1)
        {
            if (!flag)
            {
                i1 = -1;
            }
            if (flag)
            {
                obj = c;
                if (e == -1)
                {
                    l1 = byte2;
                } else
                {
                    l1 = 0;
                }
                ((PopupWindow) (obj)).setWindowLayoutMode(l1, 0);
            } else
            {
                obj = c;
                byte byte1;
                if (e == -1)
                {
                    byte1 = -1;
                } else
                {
                    byte1 = 0;
                }
                ((PopupWindow) (obj)).setWindowLayoutMode(byte1, -1);
            }
        } else
        if (o != -2)
        {
            i1 = o;
        }
        obj = c;
        if (!q && !p)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        ((PopupWindow) (obj)).setOutsideTouchable(flag);
        c.update(l, f, g, k1, i1);
_L18:
        return;
_L5:
        ((LinearLayout) (obj1)).addView(((View) (obj)), layoutparams);
        ((LinearLayout) (obj1)).addView(view);
          goto _L10
_L4:
        ((LinearLayout) (obj1)).addView(view);
        ((LinearLayout) (obj1)).addView(((View) (obj)), layoutparams);
          goto _L10
_L2:
        c.getContentView();
        obj = r;
        Exception exception;
        byte byte0;
        if (obj != null)
        {
            obj1 = (android.widget.LinearLayout.LayoutParams)((View) (obj)).getLayoutParams();
            i1 = ((View) (obj)).getMeasuredHeight();
            k1 = ((android.widget.LinearLayout.LayoutParams) (obj1)).topMargin;
            i1 = ((android.widget.LinearLayout.LayoutParams) (obj1)).bottomMargin + (i1 + k1);
        } else
        {
            i1 = 0;
        }
          goto _L11
_L7:
        e;
        JVM INSTR tableswitch -2 -1: default 660
    //                   -2 714
    //                   -1 754;
           goto _L12 _L13 _L14
_L14:
        break MISSING_BLOCK_LABEL_754;
_L12:
        k1 = android.view.View.MeasureSpec.makeMeasureSpec(e, 0x40000000);
_L16:
        i2 = d.a(k1, i2 - i1);
        k1 = i1;
        if (i2 > 0)
        {
            k1 = i1 + l1;
        }
        i1 = k1 + i2;
          goto _L15
_L13:
        k1 = android.view.View.MeasureSpec.makeMeasureSpec(b.getResources().getDisplayMetrics().widthPixels - (B.left + B.right), 0x80000000);
          goto _L16
        k1 = android.view.View.MeasureSpec.makeMeasureSpec(b.getResources().getDisplayMetrics().widthPixels - (B.left + B.right), 0x40000000);
          goto _L16
_L9:
        if (e == -1)
        {
            byte0 = -1;
        } else
        if (e == -2)
        {
            c.setWidth(l.getWidth());
            byte0 = 0;
        } else
        {
            c.setWidth(e);
            byte0 = 0;
        }
        if (o == -1)
        {
            i1 = -1;
        } else
        if (o == -2)
        {
            c.setHeight(i1);
            i1 = 0;
        } else
        {
            c.setHeight(o);
            i1 = 0;
        }
        c.setWindowLayoutMode(byte0, i1);
        if (a != null)
        {
            try
            {
                a.invoke(c, new Object[] {
                    Boolean.valueOf(true)
                });
            }
            // Misplaced declaration of an exception variable
            catch (Exception exception) { }
        }
        obj = c;
        if (!q && !p)
        {
            flag = flag2;
        } else
        {
            flag = false;
        }
        ((PopupWindow) (obj)).setOutsideTouchable(flag);
        c.setTouchInterceptor(w);
        as.a(c, l, f, g, i);
        d.setSelection(-1);
        if (!C || d.isInTouchMode())
        {
            f();
        }
        if (C) goto _L18; else goto _L17
_L17:
        A.post(y);
        return;
        i1 = 0;
          goto _L19
    }

    public final void c()
    {
        C = true;
        c.setFocusable(true);
    }

    public final void d()
    {
        c.dismiss();
        if (r != null)
        {
            android.view.ViewParent viewparent = r.getParent();
            if (viewparent instanceof ViewGroup)
            {
                ((ViewGroup)viewparent).removeView(r);
            }
        }
        c.setContentView(null);
        d = null;
        A.removeCallbacks(v);
    }

    public final void e()
    {
        c.setInputMethodMode(2);
    }

    public final void f()
    {
        DropDownListView dropdownlistview = d;
        if (dropdownlistview != null)
        {
            android.support.v7.widget.DropDownListView.a(dropdownlistview, true);
            dropdownlistview.requestLayout();
        }
    }

    public final boolean g()
    {
        return c.getInputMethodMode() == 2;
    }

    static 
    {
        try
        {
            a = android/widget/PopupWindow.getDeclaredMethod("setClipToScreenEnabled", new Class[] {
                Boolean.TYPE
            });
        }
        catch (NoSuchMethodException nosuchmethodexception) { }
    }

    private class DropDownListView extends ListViewCompat
    {

        private boolean g;
        private boolean h;
        private boolean i;
        private dq j;
        private ak k;

        static boolean a(DropDownListView dropdownlistview, boolean flag)
        {
            dropdownlistview.g = flag;
            return flag;
        }

        protected final boolean a()
        {
            return i || super.a();
        }

        public final boolean a(MotionEvent motionevent, int i1)
        {
            int j1;
            boolean flag;
            flag = true;
            j1 = at.a(motionevent);
            j1;
            JVM INSTR tableswitch 1 3: default 36
        //                       1 137
        //                       2 140
        //                       3 129;
               goto _L1 _L2 _L3 _L4
_L1:
            flag = true;
            i1 = 0;
_L7:
            if (!flag || i1 != 0)
            {
                i = false;
                setPressed(false);
                drawableStateChanged();
                if (j != null)
                {
                    j.a();
                    j = null;
                }
            }
            if (!flag) goto _L6; else goto _L5
_L5:
            if (k == null)
            {
                k = new ak(this);
            }
            k.a(true);
            k.onTouch(this, motionevent);
_L9:
            return flag;
_L4:
            flag = false;
            i1 = 0;
              goto _L7
_L2:
            flag = false;
_L3:
            int k1;
            int l1;
            k1 = motionevent.findPointerIndex(i1);
            if (k1 < 0)
            {
                flag = false;
                i1 = 0;
            } else
            {
label0:
                {
                    i1 = (int)motionevent.getX(k1);
                    l1 = (int)motionevent.getY(k1);
                    k1 = pointToPosition(i1, l1);
                    if (k1 != -1)
                    {
                        break label0;
                    }
                    i1 = 1;
                }
            }
              goto _L7
            View view = getChildAt(k1 - getFirstVisiblePosition());
            float f1 = i1;
            float f2 = l1;
            i = true;
            setPressed(true);
            layoutChildren();
            setSelection(k1);
            Drawable drawable = getSelector();
            float f3;
            float f4;
            Object obj;
            if (drawable != null && k1 != -1)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            if (i1 != 0)
            {
                drawable.setVisible(false, false);
            }
            obj = super.a;
            ((Rect) (obj)).set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            obj.left = ((Rect) (obj)).left - super.b;
            obj.top = ((Rect) (obj)).top - super.c;
            obj.right = ((Rect) (obj)).right + super.d;
            obj.bottom = ((Rect) (obj)).bottom + super.e;
            flag = super.f.getBoolean(this);
            if (view.isEnabled() == flag)
            {
                break MISSING_BLOCK_LABEL_415;
            }
            obj = super.f;
            if (!flag)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            ((Field) (obj)).set(this, Boolean.valueOf(flag));
            if (k1 != -1)
            {
                try
                {
                    refreshDrawableState();
                }
                catch (IllegalAccessException illegalaccessexception)
                {
                    illegalaccessexception.printStackTrace();
                }
            }
            if (i1 != 0)
            {
                obj = super.a;
                f3 = ((Rect) (obj)).exactCenterX();
                f4 = ((Rect) (obj)).exactCenterY();
                if (getVisibility() == 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                drawable.setVisible(flag, false);
                android.support.v4.a.a.a.a(drawable, f3, f4);
            }
            drawable = getSelector();
            if (drawable != null && k1 != -1)
            {
                android.support.v4.a.a.a.a(drawable, f1, f2);
            }
            setSelectorEnabled(false);
            refreshDrawableState();
            if (j1 == 1)
            {
                performItemClick(view, k1, getItemIdAtPosition(k1));
            }
              goto _L1
_L6:
            if (k == null) goto _L9; else goto _L8
_L8:
            k.a(false);
            return flag;
              goto _L7
        }

        public boolean hasFocus()
        {
            return h || super.hasFocus();
        }

        public boolean hasWindowFocus()
        {
            return h || super.hasWindowFocus();
        }

        public boolean isFocused()
        {
            return h || super.isFocused();
        }

        public boolean isInTouchMode()
        {
            return h && g || super.isInTouchMode();
        }

        public DropDownListView(Context context, boolean flag)
        {
            super(context, null, b.dropDownListViewStyle);
            h = flag;
            setCacheColorHint(0);
        }
    }

}
