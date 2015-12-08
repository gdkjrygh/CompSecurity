// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.b.b;
import android.support.v7.b.d;
import android.support.v7.b.h;
import android.support.v7.widget.ac;
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

// Referenced classes of package android.support.v7.internal.view.menu:
//            u, t, g, v, 
//            aa, j

public class s
    implements u, android.view.View.OnKeyListener, android.view.ViewTreeObserver.OnGlobalLayoutListener, android.widget.AdapterView.OnItemClickListener, android.widget.PopupWindow.OnDismissListener
{

    static final int a;
    boolean b;
    private final Context c;
    private final LayoutInflater d;
    private final g e;
    private final t f;
    private final boolean g;
    private final int h;
    private final int i;
    private final int j;
    private View k;
    private ac l;
    private ViewTreeObserver m;
    private v n;
    private ViewGroup o;
    private boolean p;
    private int q;
    private int r;

    public s(Context context, g g1, View view)
    {
        this(context, g1, view, false, b.popupMenuStyle);
    }

    public s(Context context, g g1, View view, boolean flag, int i1)
    {
        this(context, g1, view, flag, i1, 0);
    }

    public s(Context context, g g1, View view, boolean flag, int i1, int j1)
    {
        r = 0;
        c = context;
        d = LayoutInflater.from(context);
        e = g1;
        f = new t(this, e);
        g = flag;
        i = i1;
        j = j1;
        Resources resources = context.getResources();
        h = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(d.abc_config_prefDialogWidth));
        k = view;
        g1.a(this, context);
    }

    static boolean a(s s1)
    {
        return s1.g;
    }

    static LayoutInflater b(s s1)
    {
        return s1.d;
    }

    static g c(s s1)
    {
        return s1.e;
    }

    private int g()
    {
        t t1 = f;
        int i2 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        int j2 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        int k2 = t1.getCount();
        int j1 = 0;
        int k1 = 0;
        View view = null;
        int i1 = 0;
        do
        {
            int l1;
label0:
            {
                l1 = i1;
                if (j1 < k2)
                {
                    l1 = t1.getItemViewType(j1);
                    if (l1 != k1)
                    {
                        k1 = l1;
                        view = null;
                    }
                    if (o == null)
                    {
                        o = new FrameLayout(c);
                    }
                    view = t1.getView(j1, view, o);
                    view.measure(i2, j2);
                    l1 = view.getMeasuredWidth();
                    if (l1 < h)
                    {
                        break label0;
                    }
                    l1 = h;
                }
                return l1;
            }
            if (l1 > i1)
            {
                i1 = l1;
            }
            j1++;
        } while (true);
    }

    public void a()
    {
        if (!d())
        {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        } else
        {
            return;
        }
    }

    public void a(int i1)
    {
        r = i1;
    }

    public void a(Context context, g g1)
    {
    }

    public void a(g g1, boolean flag)
    {
        if (g1 == e)
        {
            e();
            if (n != null)
            {
                n.a(g1, flag);
                return;
            }
        }
    }

    public void a(v v1)
    {
        n = v1;
    }

    public void a(View view)
    {
        k = view;
    }

    public void a(boolean flag)
    {
        b = flag;
    }

    public boolean a(aa aa1)
    {
        if (!aa1.hasVisibleItems()) goto _L2; else goto _L1
_L1:
        s s1;
        int i1;
        int j1;
        s1 = new s(c, aa1, k);
        s1.a(n);
        j1 = aa1.size();
        i1 = 0;
_L5:
        MenuItem menuitem;
        if (i1 >= j1)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        menuitem = aa1.getItem(i1);
        if (!menuitem.isVisible() || menuitem.getIcon() == null) goto _L4; else goto _L3
_L3:
        boolean flag = true;
_L6:
        s1.a(flag);
        if (s1.d())
        {
            if (n != null)
            {
                n.a(aa1);
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

    public boolean a(g g1, j j1)
    {
        return false;
    }

    public void b(boolean flag)
    {
        p = false;
        if (f != null)
        {
            f.notifyDataSetChanged();
        }
    }

    public boolean b()
    {
        return false;
    }

    public boolean b(g g1, j j1)
    {
        return false;
    }

    public ac c()
    {
        return l;
    }

    public boolean d()
    {
        boolean flag = false;
        l = new ac(c, null, i, j);
        l.a(this);
        l.a(this);
        l.a(f);
        l.a(true);
        View view = k;
        if (view != null)
        {
            if (m == null)
            {
                flag = true;
            }
            m = view.getViewTreeObserver();
            if (flag)
            {
                m.addOnGlobalLayoutListener(this);
            }
            l.a(view);
            l.d(r);
            if (!p)
            {
                q = g();
                p = true;
            }
            l.f(q);
            l.g(2);
            l.c();
            l.m().setOnKeyListener(this);
            return true;
        } else
        {
            return false;
        }
    }

    public void e()
    {
        if (f())
        {
            l.i();
        }
    }

    public boolean f()
    {
        return l != null && l.k();
    }

    public void onDismiss()
    {
        l = null;
        e.close();
        if (m != null)
        {
            if (!m.isAlive())
            {
                m = k.getViewTreeObserver();
            }
            m.removeGlobalOnLayoutListener(this);
            m = null;
        }
    }

    public void onGlobalLayout()
    {
        if (f())
        {
            View view = k;
            if (view == null || !view.isShown())
            {
                e();
            } else
            if (f())
            {
                l.c();
                return;
            }
        }
    }

    public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
        adapterview = f;
        t.a(adapterview).a(adapterview.a(i1), 0);
    }

    public boolean onKey(View view, int i1, KeyEvent keyevent)
    {
        if (keyevent.getAction() == 1 && i1 == 82)
        {
            e();
            return true;
        } else
        {
            return false;
        }
    }

    static 
    {
        a = h.abc_popup_menu_item_layout;
    }
}
