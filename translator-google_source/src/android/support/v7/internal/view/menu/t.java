// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.a.b;
import android.support.v7.a.e;
import android.support.v7.a.i;
import android.support.v7.widget.ListPopupWindow;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;

// Referenced classes of package android.support.v7.internal.view.menu:
//            v, u, i, w, 
//            ab, m

public class t
    implements v, android.view.View.OnKeyListener, android.view.ViewTreeObserver.OnGlobalLayoutListener, android.widget.AdapterView.OnItemClickListener, android.widget.PopupWindow.OnDismissListener
{

    static final int a;
    public View b;
    public ListPopupWindow c;
    public w d;
    public boolean e;
    public int f;
    private final Context g;
    private final LayoutInflater h;
    private final android.support.v7.internal.view.menu.i i;
    private final u j;
    private final boolean k;
    private final int l;
    private final int m;
    private final int n;
    private ViewTreeObserver o;
    private ViewGroup p;
    private boolean q;
    private int r;

    public t(Context context, android.support.v7.internal.view.menu.i i1, View view)
    {
        this(context, i1, view, false, b.popupMenuStyle);
    }

    public t(Context context, android.support.v7.internal.view.menu.i i1, View view, boolean flag, int j1)
    {
        this(context, i1, view, flag, j1, (byte)0);
    }

    public t(Context context, android.support.v7.internal.view.menu.i i1, View view, boolean flag, int j1, byte byte0)
    {
        f = 0;
        g = context;
        h = LayoutInflater.from(context);
        i = i1;
        j = new u(this, i);
        k = flag;
        m = j1;
        n = 0;
        Resources resources = context.getResources();
        l = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(e.abc_config_prefDialogWidth));
        b = view;
        i1.a(this, context);
    }

    static boolean a(t t1)
    {
        return t1.k;
    }

    static LayoutInflater b(t t1)
    {
        return t1.h;
    }

    static android.support.v7.internal.view.menu.i c(t t1)
    {
        return t1.i;
    }

    public final void a(Context context, android.support.v7.internal.view.menu.i i1)
    {
    }

    public final void a(android.support.v7.internal.view.menu.i i1, boolean flag)
    {
        if (i1 == i)
        {
            d();
            if (d != null)
            {
                d.a(i1, flag);
                return;
            }
        }
    }

    public final boolean a()
    {
        return false;
    }

    public final boolean a(ab ab1)
    {
        if (!ab1.hasVisibleItems()) goto _L2; else goto _L1
_L1:
        t t1;
        int i1;
        int j1;
        t1 = new t(g, ab1, b);
        t1.d = d;
        j1 = ab1.size();
        i1 = 0;
_L5:
        MenuItem menuitem;
        if (i1 >= j1)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        menuitem = ab1.getItem(i1);
        if (!menuitem.isVisible() || menuitem.getIcon() == null) goto _L4; else goto _L3
_L3:
        boolean flag = true;
_L6:
        t1.e = flag;
        if (t1.c())
        {
            if (d != null)
            {
                d.a_(ab1);
            }
            return true;
        }
          goto _L2
_L4:
        i1++;
          goto _L5
_L2:
        return false;
        flag = false;
          goto _L6
    }

    public final void b()
    {
        if (!c())
        {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        } else
        {
            return;
        }
    }

    public final void b(boolean flag)
    {
        q = false;
        if (j != null)
        {
            j.notifyDataSetChanged();
        }
    }

    public final boolean b(m m1)
    {
        return false;
    }

    public final boolean c()
    {
        View view;
        int l1;
        l1 = 0;
        c = new ListPopupWindow(g, null, m, n);
        c.a(this);
        c.m = this;
        c.a(j);
        c.c();
        view = b;
        if (view == null) goto _L2; else goto _L1
_L1:
        int i1;
        int j1;
        u u1;
        int k1;
        int i2;
        int j2;
        int k2;
        if (o == null)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        o = view.getViewTreeObserver();
        if (i1 != 0)
        {
            o.addOnGlobalLayoutListener(this);
        }
        c.l = view;
        c.i = f;
        if (q) goto _L4; else goto _L3
_L3:
        u1 = j;
        i2 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        j2 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        k2 = u1.getCount();
        j1 = 0;
        k1 = 0;
        view = null;
        i1 = l1;
_L10:
        l1 = i1;
        if (j1 >= k2) goto _L6; else goto _L5
_L5:
        l1 = u1.getItemViewType(j1);
        if (l1 != k1)
        {
            k1 = l1;
            view = null;
        }
        if (p == null)
        {
            p = new FrameLayout(g);
        }
        view = u1.getView(j1, view, p);
        view.measure(i2, j2);
        l1 = view.getMeasuredWidth();
        if (l1 < l) goto _L8; else goto _L7
_L7:
        l1 = l;
_L6:
        r = l1;
        q = true;
_L4:
        c.a(r);
        c.e();
        c.b();
        c.d.setOnKeyListener(this);
        return true;
_L2:
        return false;
_L8:
        if (l1 > i1)
        {
            i1 = l1;
        }
        j1++;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public final boolean c(m m1)
    {
        return false;
    }

    public final void d()
    {
        if (e())
        {
            c.d();
        }
    }

    public final boolean e()
    {
        return c != null && c.c.isShowing();
    }

    public void onDismiss()
    {
        c = null;
        i.close();
        if (o != null)
        {
            if (!o.isAlive())
            {
                o = b.getViewTreeObserver();
            }
            o.removeGlobalOnLayoutListener(this);
            o = null;
        }
    }

    public void onGlobalLayout()
    {
        if (e())
        {
            View view = b;
            if (view == null || !view.isShown())
            {
                d();
            } else
            if (e())
            {
                c.b();
                return;
            }
        }
    }

    public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
        adapterview = j;
        u.a(adapterview).a(adapterview.a(i1), null, 0);
    }

    public boolean onKey(View view, int i1, KeyEvent keyevent)
    {
        if (keyevent.getAction() == 1 && i1 == 82)
        {
            d();
            return true;
        } else
        {
            return false;
        }
    }

    static 
    {
        a = i.abc_popup_menu_item_layout;
    }
}
