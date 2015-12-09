// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import aaj;
import aan;
import aao;
import aap;
import aaq;
import aar;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.v7.internal.widget.AppCompatPopupWindow;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import gz;
import java.lang.reflect.Method;
import pp;
import sr;

public class ListPopupWindow
{

    private static Method a;
    private static Method b;
    public PopupWindow c;
    public aaj d;
    public int e;
    public int f;
    int g;
    boolean h;
    public int i;
    public int j;
    public View k;
    public android.widget.AdapterView.OnItemClickListener l;
    private Context m;
    private ListAdapter n;
    private int o;
    private int p;
    private DataSetObserver q;
    private final aar r;
    private final aaq s;
    private final aap t;
    private final aan u;
    private final Handler v;
    private Rect w;
    private boolean x;

    public ListPopupWindow(Context context)
    {
        this(context, null, 0x7f01011f);
    }

    public ListPopupWindow(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x7f01011f);
    }

    public ListPopupWindow(Context context, AttributeSet attributeset, int i1)
    {
        this(context, attributeset, i1, (byte)0);
    }

    public ListPopupWindow(Context context, AttributeSet attributeset, int i1, byte byte0)
    {
        o = -2;
        e = -2;
        p = 1002;
        i = 0;
        j = 0x7fffffff;
        r = new aar(this, (byte)0);
        s = new aaq(this, (byte)0);
        t = new aap(this, (byte)0);
        u = new aan(this, (byte)0);
        w = new Rect();
        m = context;
        v = new Handler(context.getMainLooper());
        TypedArray typedarray = context.obtainStyledAttributes(attributeset, sr.ap, i1, 0);
        f = typedarray.getDimensionPixelOffset(sr.aq, 0);
        g = typedarray.getDimensionPixelOffset(sr.ar, 0);
        if (g != 0)
        {
            h = true;
        }
        typedarray.recycle();
        c = new AppCompatPopupWindow(context, attributeset, i1);
        c.setInputMethodMode(1);
        gz.a(m.getResources().getConfiguration().locale);
    }

    private int a(View view, int i1, boolean flag)
    {
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        int j1 = ((Integer)b.invoke(c, new Object[] {
            view, Integer.valueOf(i1), Boolean.valueOf(flag)
        })).intValue();
        return j1;
        Exception exception;
        exception;
        Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
        return c.getMaxAvailableHeight(view, i1);
    }

    public static aaj a(ListPopupWindow listpopupwindow)
    {
        return listpopupwindow.d;
    }

    public static PopupWindow b(ListPopupWindow listpopupwindow)
    {
        return listpopupwindow.c;
    }

    public static aar c(ListPopupWindow listpopupwindow)
    {
        return listpopupwindow.r;
    }

    public static Handler d(ListPopupWindow listpopupwindow)
    {
        return listpopupwindow.v;
    }

    public final void a(int i1)
    {
        Drawable drawable = c.getBackground();
        if (drawable != null)
        {
            drawable.getPadding(w);
            e = w.left + w.right + i1;
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
        if (q != null) goto _L2; else goto _L1
_L1:
        q = new aao(this, (byte)0);
_L4:
        n = listadapter;
        if (n != null)
        {
            listadapter.registerDataSetObserver(q);
        }
        if (d != null)
        {
            d.setAdapter(n);
        }
        return;
_L2:
        if (n != null)
        {
            n.unregisterDataSetObserver(q);
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
        int i1;
        byte byte0;
        int i2;
        byte0 = 0;
        byte byte1 = -1;
        boolean flag;
        if (d == null)
        {
            Object obj = m;
            new Runnable() {

                private ListPopupWindow a;

                public final void run()
                {
                    View view1 = a.k;
                    if (view1 != null && view1.getWindowToken() != null)
                    {
                        a.b();
                    }
                }

            
            {
                a = ListPopupWindow.this;
                super();
            }
            };
            View view;
            int j1;
            int j2;
            if (!x)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            d = new aaj(((Context) (obj)), flag);
            d.setAdapter(n);
            d.setOnItemClickListener(l);
            d.setFocusable(true);
            d.setFocusableInTouchMode(true);
            d.setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() {

                private ListPopupWindow a;

                public final void onItemSelected(AdapterView adapterview, View view1, int k2, long l2)
                {
                    if (k2 != -1)
                    {
                        adapterview = ListPopupWindow.a(a);
                        if (adapterview != null)
                        {
                            aaj.a(adapterview, false);
                        }
                    }
                }

                public final void onNothingSelected(AdapterView adapterview)
                {
                }

            
            {
                a = ListPopupWindow.this;
                super();
            }
            });
            d.setOnScrollListener(t);
            obj = d;
            c.setContentView(((View) (obj)));
        } else
        {
            c.getContentView();
        }
        obj = c.getBackground();
        if (obj != null)
        {
            ((Drawable) (obj)).getPadding(w);
            j1 = w.top + w.bottom;
            i1 = j1;
            if (!h)
            {
                g = -w.top;
                i1 = j1;
            }
        } else
        {
            w.setEmpty();
            i1 = 0;
        }
        if (c.getInputMethodMode() == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i2 = a(k, g, flag);
        if (o != -1) goto _L2; else goto _L1
_L1:
        i1 += i2;
_L12:
        flag = f();
        pp.a(c, p);
        if (!c.isShowing()) goto _L4; else goto _L3
_L3:
        int k1;
        if (e == -1)
        {
            k1 = -1;
        } else
        if (e == -2)
        {
            k1 = k.getWidth();
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
                    byte0 = -1;
                } else
                {
                    byte0 = 0;
                }
                ((PopupWindow) (obj)).setWidth(byte0);
                c.setHeight(0);
            } else
            {
                PopupWindow popupwindow = c;
                if (e == -1)
                {
                    byte0 = -1;
                }
                popupwindow.setWidth(byte0);
                c.setHeight(-1);
            }
        } else
        if (o != -2)
        {
            i1 = o;
        }
        c.setOutsideTouchable(true);
        obj = c;
        view = k;
        i2 = f;
        j2 = g;
        byte0 = k1;
        if (k1 < 0)
        {
            byte0 = -1;
        }
        if (i1 < 0)
        {
            i1 = byte1;
        }
        ((PopupWindow) (obj)).update(view, i2, j2, byte0, i1);
_L10:
        return;
_L2:
        e;
        JVM INSTR tableswitch -2 -1: default 444
    //                   -2 482
    //                   -1 522;
           goto _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_522;
_L5:
        k1 = android.view.View.MeasureSpec.makeMeasureSpec(e, 0x40000000);
_L8:
        k1 = d.a(k1, i2);
        Exception exception;
        int l1;
        if (k1 <= 0)
        {
            i1 = 0;
        }
        i1 += k1;
        continue; /* Loop/switch isn't completed */
_L6:
        k1 = android.view.View.MeasureSpec.makeMeasureSpec(m.getResources().getDisplayMetrics().widthPixels - (w.left + w.right), 0x80000000);
          goto _L8
        k1 = android.view.View.MeasureSpec.makeMeasureSpec(m.getResources().getDisplayMetrics().widthPixels - (w.left + w.right), 0x40000000);
          goto _L8
_L4:
        if (e == -1)
        {
            l1 = -1;
        } else
        if (e == -2)
        {
            l1 = k.getWidth();
        } else
        {
            l1 = e;
        }
        if (o == -1)
        {
            i1 = -1;
        } else
        if (o != -2)
        {
            i1 = o;
        }
        c.setWidth(l1);
        c.setHeight(i1);
        if (a != null)
        {
            try
            {
                a.invoke(c, new Object[] {
                    Boolean.valueOf(true)
                });
            }
            // Misplaced declaration of an exception variable
            catch (Exception exception)
            {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
        c.setOutsideTouchable(true);
        c.setTouchInterceptor(s);
        pp.a(c, k, f, g, i);
        d.setSelection(-1);
        if (!x || d.isInTouchMode())
        {
            e();
        }
        if (x) goto _L10; else goto _L9
_L9:
        v.post(u);
        return;
        if (true) goto _L12; else goto _L11
_L11:
    }

    public final void c()
    {
        x = true;
        c.setFocusable(true);
    }

    public final void d()
    {
        c.setInputMethodMode(2);
    }

    public void dismiss()
    {
        c.dismiss();
        c.setContentView(null);
        d = null;
        v.removeCallbacks(r);
    }

    public final void e()
    {
        aaj aaj1 = d;
        if (aaj1 != null)
        {
            aaj.a(aaj1, true);
            aaj1.requestLayout();
        }
    }

    public final boolean f()
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
        catch (NoSuchMethodException nosuchmethodexception)
        {
            Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
        }
        try
        {
            b = android/widget/PopupWindow.getDeclaredMethod("getMaxAvailableHeight", new Class[] {
                android/view/View, Integer.TYPE, Boolean.TYPE
            });
        }
        catch (NoSuchMethodException nosuchmethodexception1)
        {
            Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
        }
    }
}
