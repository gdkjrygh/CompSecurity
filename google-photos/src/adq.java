// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

public class adq
{

    private static Method a;
    private Context b;
    public PopupWindow c;
    public adt d;
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
    private DataSetObserver r;
    private final aeb s;
    private final aea t;
    private final adz u;
    private final adx v;
    private Handler w;
    private Rect x;
    private boolean y;

    public adq(Context context)
    {
        this(context, null, b.L);
    }

    public adq(Context context, AttributeSet attributeset, int i1)
    {
        this(context, attributeset, i1, 0);
    }

    public adq(Context context, AttributeSet attributeset, int i1, int j1)
    {
        o = -2;
        e = -2;
        i = 0;
        p = false;
        q = false;
        j = 0x7fffffff;
        k = 0;
        s = new aeb(this);
        t = new aea(this);
        u = new adz(this);
        v = new adx(this);
        w = new Handler();
        x = new Rect();
        b = context;
        TypedArray typedarray = context.obtainStyledAttributes(attributeset, uh.an, i1, j1);
        f = typedarray.getDimensionPixelOffset(uh.ao, 0);
        g = typedarray.getDimensionPixelOffset(uh.ap, 0);
        if (g != 0)
        {
            h = true;
        }
        typedarray.recycle();
        c = new xm(context, attributeset, i1);
        c.setInputMethodMode(1);
        jh.a(b.getResources().getConfiguration().locale);
    }

    static adt a(adq adq1)
    {
        return adq1.d;
    }

    static PopupWindow b(adq adq1)
    {
        return adq1.c;
    }

    static aeb c(adq adq1)
    {
        return adq1.s;
    }

    static Handler d(adq adq1)
    {
        return adq1.w;
    }

    public final void a(int i1)
    {
        Drawable drawable = c.getBackground();
        if (drawable != null)
        {
            drawable.getPadding(x);
            e = x.left + x.right + i1;
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
        if (r != null) goto _L2; else goto _L1
_L1:
        r = new ady(this);
_L4:
        n = listadapter;
        if (n != null)
        {
            listadapter.registerDataSetObserver(r);
        }
        if (d != null)
        {
            d.setAdapter(n);
        }
        return;
_L2:
        if (n != null)
        {
            n.unregisterDataSetObserver(r);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(android.widget.PopupWindow.OnDismissListener ondismisslistener)
    {
        c.setOnDismissListener(ondismisslistener);
    }

    public final void a(boolean flag)
    {
        y = true;
        c.setFocusable(true);
    }

    public void b()
    {
        int i1;
        int j1;
        int k1;
        int l1;
        int l2;
        if (d == null)
        {
            Object obj = b;
            new adr(this);
            boolean flag;
            if (!y)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            d = new adt(((Context) (obj)), flag);
            d.setAdapter(n);
            d.setOnItemClickListener(m);
            d.setFocusable(true);
            d.setFocusableInTouchMode(true);
            d.setOnItemSelectedListener(new ads(this));
            d.setOnScrollListener(u);
            obj = d;
            c.setContentView(((View) (obj)));
        } else
        {
            c.getContentView();
        }
        l1 = 0;
        obj = c.getBackground();
        if (obj != null)
        {
            ((Drawable) (obj)).getPadding(x);
            i1 = x.top + x.bottom;
            l1 = i1;
            if (!h)
            {
                g = -x.top;
                l1 = i1;
            }
        } else
        {
            x.setEmpty();
        }
        c.getInputMethodMode();
        l2 = c.getMaxAvailableHeight(l, g);
        if (o != -1) goto _L2; else goto _L1
_L1:
        i1 = l1 + l2;
_L16:
        j1 = 0;
        flag = e();
        if (!c.isShowing()) goto _L4; else goto _L3
_L3:
        int k2;
        if (e == -1)
        {
            j1 = -1;
        } else
        if (e == -2)
        {
            j1 = l.getWidth();
        } else
        {
            j1 = e;
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
                Object obj1;
                adt adt1;
                ListAdapter listadapter;
                android.view.ViewGroup.LayoutParams layoutparams;
                int i2;
                int j2;
                int i3;
                if (e == -1)
                {
                    k1 = -1;
                } else
                {
                    k1 = 0;
                }
                ((PopupWindow) (obj)).setWindowLayoutMode(k1, 0);
            } else
            {
                PopupWindow popupwindow = c;
                if (e == -1)
                {
                    k1 = -1;
                } else
                {
                    k1 = 0;
                }
                popupwindow.setWindowLayoutMode(k1, -1);
            }
        } else
        if (o != -2)
        {
            i1 = o;
        }
        c.setOutsideTouchable(true);
        c.update(l, f, g, j1, i1);
_L14:
        return;
_L2:
        e;
        JVM INSTR tableswitch -2 -1: default 388
    //                   -2 475
    //                   -1 515;
           goto _L5 _L6 _L7
_L5:
        j1 = android.view.View.MeasureSpec.makeMeasureSpec(e, 0x40000000);
_L10:
        adt1 = d;
        i1 = adt1.getListPaddingTop();
        k1 = adt1.getListPaddingBottom();
        adt1.getListPaddingLeft();
        adt1.getListPaddingRight();
        i2 = adt1.getDividerHeight();
        obj1 = adt1.getDivider();
        listadapter = adt1.getAdapter();
        if (listadapter != null) goto _L9; else goto _L8
_L8:
        k1 += i1;
_L11:
        Exception exception;
        if (k1 > 0)
        {
            i1 = l1 + 0;
        } else
        {
            i1 = 0;
        }
        i1 += k1;
        continue; /* Loop/switch isn't completed */
_L6:
        j1 = android.view.View.MeasureSpec.makeMeasureSpec(b.getResources().getDisplayMetrics().widthPixels - (x.left + x.right), 0x80000000);
          goto _L10
_L7:
        j1 = android.view.View.MeasureSpec.makeMeasureSpec(b.getResources().getDisplayMetrics().widthPixels - (x.left + x.right), 0x40000000);
          goto _L10
_L9:
        i1 = k1 + i1;
        if (i2 <= 0 || obj1 == null)
        {
            i2 = 0;
        }
        obj1 = null;
        k2 = 0;
        i3 = listadapter.getCount();
        j2 = 0;
_L12:
        k1 = i1;
        if (j2 < i3)
        {
label0:
            {
                k1 = listadapter.getItemViewType(j2);
                if (k1 != k2)
                {
                    obj1 = null;
                } else
                {
                    k1 = k2;
                }
                obj1 = listadapter.getView(j2, ((View) (obj1)), adt1);
                layoutparams = ((View) (obj1)).getLayoutParams();
                if (layoutparams != null && layoutparams.height > 0)
                {
                    k2 = android.view.View.MeasureSpec.makeMeasureSpec(layoutparams.height, 0x40000000);
                } else
                {
                    k2 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                }
                ((View) (obj1)).measure(j1, k2);
                if (j2 > 0)
                {
                    i1 += i2;
                }
                i1 = ((View) (obj1)).getMeasuredHeight() + i1;
                if (i1 < l2)
                {
                    break label0;
                }
                k1 = l2;
            }
        }
          goto _L11
        j2++;
        k2 = k1;
          goto _L12
_L4:
        if (e == -1)
        {
            j1 = -1;
        } else
        if (e == -2)
        {
            c.setWidth(l.getWidth());
        } else
        {
            c.setWidth(e);
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
        c.setWindowLayoutMode(j1, i1);
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
        c.setOutsideTouchable(true);
        c.setTouchInterceptor(t);
        re.a(c, l, f, g, i);
        d.setSelection(-1);
        if (!y || d.isInTouchMode())
        {
            d();
        }
        if (y) goto _L14; else goto _L13
_L13:
        w.post(v);
        return;
        if (true) goto _L16; else goto _L15
_L15:
    }

    public final void b(int i1)
    {
        c.setInputMethodMode(2);
    }

    public final void c()
    {
        c.dismiss();
        c.setContentView(null);
        d = null;
        w.removeCallbacks(s);
    }

    public final void d()
    {
        adt adt1 = d;
        if (adt1 != null)
        {
            adt.a(adt1, true);
            adt1.requestLayout();
        }
    }

    public final boolean e()
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
}
