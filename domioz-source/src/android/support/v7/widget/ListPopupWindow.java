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
import android.support.v4.d.f;
import android.support.v4.widget.aa;
import android.support.v7.a.b;
import android.support.v7.a.l;
import android.support.v7.internal.widget.AppCompatPopupWindow;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

// Referenced classes of package android.support.v7.widget:
//            ar, aq, ap, an, 
//            ao, aj, ah, ai

public class ListPopupWindow
{

    private static Method a;
    private Handler A;
    private Rect B;
    private boolean C;
    private int D;
    int b;
    private Context c;
    private PopupWindow d;
    private ListAdapter e;
    private aj f;
    private int g;
    private int h;
    private int i;
    private int j;
    private boolean k;
    private int l;
    private boolean m;
    private boolean n;
    private View o;
    private int p;
    private DataSetObserver q;
    private View r;
    private Drawable s;
    private android.widget.AdapterView.OnItemClickListener t;
    private android.widget.AdapterView.OnItemSelectedListener u;
    private final ar v;
    private final aq w;
    private final ap x;
    private final an y;
    private Runnable z;

    public ListPopupWindow(Context context)
    {
        this(context, null, b.A);
    }

    public ListPopupWindow(Context context, AttributeSet attributeset, int i1)
    {
        this(context, attributeset, i1, 0);
    }

    public ListPopupWindow(Context context, AttributeSet attributeset, int i1, int j1)
    {
        g = -2;
        h = -2;
        l = 0;
        m = false;
        n = false;
        b = 0x7fffffff;
        p = 0;
        v = new ar(this, (byte)0);
        w = new aq(this, (byte)0);
        x = new ap(this, (byte)0);
        y = new an(this, (byte)0);
        A = new Handler();
        B = new Rect();
        c = context;
        TypedArray typedarray = context.obtainStyledAttributes(attributeset, l.ae, i1, j1);
        i = typedarray.getDimensionPixelOffset(l.af, 0);
        j = typedarray.getDimensionPixelOffset(l.ag, 0);
        if (j != 0)
        {
            k = true;
        }
        typedarray.recycle();
        d = new AppCompatPopupWindow(context, attributeset, i1);
        d.setInputMethodMode(1);
        D = android.support.v4.d.f.a(c.getResources().getConfiguration().locale);
    }

    static aj a(ListPopupWindow listpopupwindow)
    {
        return listpopupwindow.f;
    }

    static PopupWindow b(ListPopupWindow listpopupwindow)
    {
        return listpopupwindow.d;
    }

    static ar c(ListPopupWindow listpopupwindow)
    {
        return listpopupwindow.v;
    }

    static Handler d(ListPopupWindow listpopupwindow)
    {
        return listpopupwindow.A;
    }

    public final void a()
    {
        d.dismiss();
        if (o != null)
        {
            android.view.ViewParent viewparent = o.getParent();
            if (viewparent instanceof ViewGroup)
            {
                ((ViewGroup)viewparent).removeView(o);
            }
        }
        d.setContentView(null);
        f = null;
        A.removeCallbacks(v);
    }

    public final void a(int i1)
    {
        l = i1;
    }

    public final void a(Drawable drawable)
    {
        d.setBackgroundDrawable(drawable);
    }

    public final void a(View view)
    {
        r = view;
    }

    public final void a(android.widget.AdapterView.OnItemClickListener onitemclicklistener)
    {
        t = onitemclicklistener;
    }

    public void a(ListAdapter listadapter)
    {
        if (q != null) goto _L2; else goto _L1
_L1:
        q = new ao(this, (byte)0);
_L4:
        e = listadapter;
        if (e != null)
        {
            listadapter.registerDataSetObserver(q);
        }
        if (f != null)
        {
            f.setAdapter(e);
        }
        return;
_L2:
        if (e != null)
        {
            e.unregisterDataSetObserver(q);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(android.widget.PopupWindow.OnDismissListener ondismisslistener)
    {
        d.setOnDismissListener(ondismisslistener);
    }

    public final void b(int i1)
    {
        Drawable drawable = d.getBackground();
        if (drawable != null)
        {
            drawable.getPadding(B);
            h = B.left + B.right + i1;
            return;
        } else
        {
            h = i1;
            return;
        }
    }

    public final boolean b()
    {
        return d.isShowing();
    }

    public final void c()
    {
        byte byte2;
        boolean flag1;
        boolean flag2;
        flag2 = true;
        flag1 = true;
        byte2 = -1;
        if (f != null) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj1;
        View view;
        android.widget.LinearLayout.LayoutParams layoutparams;
        int i1;
        int l1;
        int i2;
        boolean flag;
        obj1 = c;
        z = new ah(this);
        int j1;
        if (!C)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        f = new aj(((Context) (obj1)), flag);
        if (s != null)
        {
            f.setSelector(s);
        }
        f.setAdapter(e);
        f.setOnItemClickListener(t);
        f.setFocusable(true);
        f.setFocusableInTouchMode(true);
        f.setOnItemSelectedListener(new ai(this));
        f.setOnScrollListener(x);
        if (u != null)
        {
            f.setOnItemSelectedListener(u);
        }
        obj = f;
        view = o;
        if (view == null)
        {
            break MISSING_BLOCK_LABEL_1188;
        }
        obj1 = new LinearLayout(((Context) (obj1)));
        ((LinearLayout) (obj1)).setOrientation(1);
        layoutparams = new android.widget.LinearLayout.LayoutParams(-1, 0, 1.0F);
        p;
        JVM INSTR tableswitch 0 1: default 224
    //                   0 562
    //                   1 547;
           goto _L3 _L4 _L5
_L3:
        Log.e("ListPopupWindow", (new StringBuilder("Invalid hint position ")).append(p).toString());
_L10:
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(h, 0x80000000), 0);
        obj = (android.widget.LinearLayout.LayoutParams)view.getLayoutParams();
        i1 = view.getMeasuredHeight();
        j1 = ((android.widget.LinearLayout.LayoutParams) (obj)).topMargin;
        i1 = ((android.widget.LinearLayout.LayoutParams) (obj)).bottomMargin + (i1 + j1);
        obj = obj1;
_L19:
        d.setContentView(((View) (obj)));
_L11:
        obj = d.getBackground();
        if (obj != null)
        {
            ((Drawable) (obj)).getPadding(B);
            j1 = B.top + B.bottom;
            l1 = j1;
            if (!k)
            {
                j = -B.top;
                l1 = j1;
            }
        } else
        {
            B.setEmpty();
            l1 = 0;
        }
        d.getInputMethodMode();
        i2 = d.getMaxAvailableHeight(r, j);
        if (!m && g != -1) goto _L7; else goto _L6
_L6:
        i1 = i2 + l1;
_L15:
        flag = i();
        if (!d.isShowing()) goto _L9; else goto _L8
_L8:
        int k1;
        if (h == -1)
        {
            k1 = -1;
        } else
        if (h == -2)
        {
            k1 = r.getWidth();
        } else
        {
            k1 = h;
        }
        if (g == -1)
        {
            if (!flag)
            {
                i1 = -1;
            }
            if (flag)
            {
                obj = d;
                if (h == -1)
                {
                    l1 = byte2;
                } else
                {
                    l1 = 0;
                }
                ((PopupWindow) (obj)).setWindowLayoutMode(l1, 0);
            } else
            {
                obj = d;
                byte byte1;
                if (h == -1)
                {
                    byte1 = -1;
                } else
                {
                    byte1 = 0;
                }
                ((PopupWindow) (obj)).setWindowLayoutMode(byte1, -1);
            }
        } else
        if (g != -2)
        {
            i1 = g;
        }
        obj = d;
        if (!n && !m)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        ((PopupWindow) (obj)).setOutsideTouchable(flag);
        d.update(r, i, j, k1, i1);
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
        d.getContentView();
        obj = o;
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
        h;
        JVM INSTR tableswitch -2 -1: default 668
    //                   -2 722
    //                   -1 762;
           goto _L12 _L13 _L14
_L14:
        break MISSING_BLOCK_LABEL_762;
_L12:
        k1 = android.view.View.MeasureSpec.makeMeasureSpec(h, 0x40000000);
_L16:
        i2 = f.a(k1, i2 - i1);
        k1 = i1;
        if (i2 > 0)
        {
            k1 = i1 + l1;
        }
        i1 = k1 + i2;
          goto _L15
_L13:
        k1 = android.view.View.MeasureSpec.makeMeasureSpec(c.getResources().getDisplayMetrics().widthPixels - (B.left + B.right), 0x80000000);
          goto _L16
        k1 = android.view.View.MeasureSpec.makeMeasureSpec(c.getResources().getDisplayMetrics().widthPixels - (B.left + B.right), 0x40000000);
          goto _L16
_L9:
        if (h == -1)
        {
            byte0 = -1;
        } else
        if (h == -2)
        {
            d.setWidth(r.getWidth());
            byte0 = 0;
        } else
        {
            d.setWidth(h);
            byte0 = 0;
        }
        if (g == -1)
        {
            i1 = -1;
        } else
        if (g == -2)
        {
            d.setHeight(i1);
            i1 = 0;
        } else
        {
            d.setHeight(g);
            i1 = 0;
        }
        d.setWindowLayoutMode(byte0, i1);
        if (a != null)
        {
            try
            {
                a.invoke(d, new Object[] {
                    Boolean.valueOf(true)
                });
            }
            // Misplaced declaration of an exception variable
            catch (Exception exception)
            {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
        obj = d;
        if (!n && !m)
        {
            flag = flag2;
        } else
        {
            flag = false;
        }
        ((PopupWindow) (obj)).setOutsideTouchable(flag);
        d.setTouchInterceptor(w);
        aa.a(d, r, i, j, l);
        f.setSelection(-1);
        if (!C || f.isInTouchMode())
        {
            h();
        }
        if (C) goto _L18; else goto _L17
_L17:
        A.post(y);
        return;
        i1 = 0;
          goto _L19
    }

    public final void d()
    {
        p = 0;
    }

    public final void e()
    {
        C = true;
        d.setFocusable(true);
    }

    public final View f()
    {
        return r;
    }

    public final void g()
    {
        d.setInputMethodMode(2);
    }

    public final void h()
    {
        aj aj1 = f;
        if (aj1 != null)
        {
            aj.a(aj1, true);
            aj1.requestLayout();
        }
    }

    public final boolean i()
    {
        return d.getInputMethodMode() == 2;
    }

    public final ListView j()
    {
        return f;
    }

    static 
    {
        try
        {
            a = android/widget/PopupWindow.getDeclaredMethod("setClipToScreenEnabled", new Class[] {
                Boolean.TYPE
            });
        }
        catch (NoSuchMethodException nosuchmethodexception)
        {
            Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
        }
    }
}
