// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.actionbarsherlock.internal.view.a;
import com.actionbarsherlock.internal.view.b;
import com.facebook.g;
import com.facebook.k;

// Referenced classes of package com.actionbarsherlock.internal.view.menu:
//            h, a, i, l, 
//            g, c

public class d
    implements android.view.View.OnKeyListener, android.view.ViewTreeObserver.OnGlobalLayoutListener, android.widget.AdapterView.OnItemClickListener, android.widget.PopupWindow.OnDismissListener, b, h
{

    static final int a;
    boolean b;
    private Context c;
    private LayoutInflater d;
    private com.actionbarsherlock.internal.a.a e;
    private com.actionbarsherlock.internal.view.menu.a f;
    private int g;
    private View h;
    private boolean i;
    private ViewTreeObserver j;
    private com.actionbarsherlock.internal.view.menu.g k;
    private i l;
    private ViewGroup m;

    public d(Context context, com.actionbarsherlock.internal.view.menu.a a1, View view)
    {
        this(context, a1, view, false);
    }

    public d(Context context, com.actionbarsherlock.internal.view.menu.a a1, View view, boolean flag)
    {
        c = context;
        d = LayoutInflater.from(context);
        f = a1;
        i = flag;
        context = context.getResources();
        g = Math.max(context.getDisplayMetrics().widthPixels / 2, context.getDimensionPixelSize(g.abs__config_prefDialogWidth));
        h = view;
        a1.a(this);
    }

    private int a(ListAdapter listadapter)
    {
        int i2 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        int j2 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        int k2 = listadapter.getCount();
        int j1 = 0;
        int i1 = 0;
        View view = null;
        int k1 = 0;
        for (; j1 < k2; j1++)
        {
            int l1 = listadapter.getItemViewType(j1);
            if (l1 != i1)
            {
                view = null;
                i1 = l1;
            }
            if (m == null)
            {
                m = new FrameLayout(c);
            }
            view = listadapter.getView(j1, view, m);
            view.measure(i2, j2);
            k1 = Math.max(k1, view.getMeasuredWidth());
        }

        return k1;
    }

    static boolean a(d d1)
    {
        return d1.i;
    }

    static LayoutInflater b(d d1)
    {
        return d1.d;
    }

    static com.actionbarsherlock.internal.view.menu.a c(d d1)
    {
        return d1.f;
    }

    static com.actionbarsherlock.internal.view.menu.g d(d d1)
    {
        return d1.k;
    }

    public void a()
    {
        if (!b())
        {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        } else
        {
            return;
        }
    }

    public void a(Context context, com.actionbarsherlock.internal.view.menu.a a1)
    {
    }

    public void a(View view)
    {
    }

    public void a(com.actionbarsherlock.internal.view.menu.a a1, boolean flag)
    {
        if (a1 == f)
        {
            c();
            if (l != null)
            {
                l.a(a1, flag);
                return;
            }
        }
    }

    public void a(i i1)
    {
        l = i1;
    }

    public void a(boolean flag)
    {
        b = flag;
    }

    public boolean a(com.actionbarsherlock.internal.view.menu.a a1, c c1)
    {
        return false;
    }

    public boolean a(l l1)
    {
        if (!l1.b()) goto _L2; else goto _L1
_L1:
        d d1;
        int i1;
        int j1;
        d1 = new d(c, l1, h, false);
        d1.a(l);
        j1 = l1.c();
        i1 = 0;
_L5:
        com.actionbarsherlock.a.b b1;
        if (i1 >= j1)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        b1 = l1.h(i1);
        if (!b1.u() || b1.q() == null) goto _L4; else goto _L3
_L3:
        boolean flag = true;
_L6:
        d1.a(flag);
        if (d1.b())
        {
            if (l != null)
            {
                l.a(l1);
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

    public void b(View view)
    {
        if (j != null)
        {
            if (!j.isAlive())
            {
                j = view.getViewTreeObserver();
            }
            j.removeGlobalOnLayoutListener(this);
        }
        ((a)view).b(this);
    }

    public void b(boolean flag)
    {
        if (k != null)
        {
            k.notifyDataSetChanged();
        }
    }

    public boolean b()
    {
        boolean flag = false;
        e = new com.actionbarsherlock.internal.a.a(c, null, com.facebook.d.popupMenuStyle);
        e.a(this);
        e.a(this);
        k = new com.actionbarsherlock.internal.view.menu.g(this, f);
        e.a(k);
        e.a(true);
        View view = h;
        if (view != null)
        {
            if (j == null)
            {
                flag = true;
            }
            j = view.getViewTreeObserver();
            if (flag)
            {
                j.addOnGlobalLayoutListener(this);
            }
            ((a)view).a(this);
            e.a(view);
            e.a(Math.min(a(k), g));
            e.b(2);
            e.a();
            e.e().setOnKeyListener(this);
            return true;
        } else
        {
            return false;
        }
    }

    public void c()
    {
        if (d())
        {
            e.b();
        }
    }

    public boolean d()
    {
        return e != null && e.d();
    }

    public void onDismiss()
    {
        e = null;
        f.h();
        if (j != null)
        {
            if (!j.isAlive())
            {
                j = h.getViewTreeObserver();
            }
            j.removeGlobalOnLayoutListener(this);
            j = null;
        }
        ((a)h).b(this);
    }

    public void onGlobalLayout()
    {
        if (d())
        {
            View view = h;
            if (view == null || !view.isShown())
            {
                c();
            } else
            if (d())
            {
                e.a();
                return;
            }
        }
    }

    public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
        adapterview = k;
        com.actionbarsherlock.internal.view.menu.g.a(adapterview).a(adapterview.a(i1), 0);
    }

    public boolean onKey(View view, int i1, KeyEvent keyevent)
    {
        if (keyevent.getAction() == 1 && i1 == 82)
        {
            c();
            return true;
        } else
        {
            return false;
        }
    }

    static 
    {
        a = k.abs__popup_menu_item_layout;
    }
}
