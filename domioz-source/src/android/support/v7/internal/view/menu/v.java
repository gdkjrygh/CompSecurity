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

// Referenced classes of package android.support.v7.internal.view.menu:
//            x, w, i, y, 
//            ad, m

public class v
    implements x, android.view.View.OnKeyListener, android.view.ViewTreeObserver.OnGlobalLayoutListener, android.widget.AdapterView.OnItemClickListener, android.widget.PopupWindow.OnDismissListener
{

    static final int a;
    boolean b;
    private final Context c;
    private final LayoutInflater d;
    private final android.support.v7.internal.view.menu.i e;
    private final w f;
    private final boolean g;
    private final int h;
    private final int i;
    private final int j;
    private View k;
    private ListPopupWindow l;
    private ViewTreeObserver m;
    private y n;
    private ViewGroup o;
    private boolean p;
    private int q;
    private int r;

    private v(Context context, android.support.v7.internal.view.menu.i i1, View view)
    {
        this(context, i1, view, false, b.C);
    }

    public v(Context context, android.support.v7.internal.view.menu.i i1, View view, boolean flag, int j1)
    {
        this(context, i1, view, flag, j1, (byte)0);
    }

    private v(Context context, android.support.v7.internal.view.menu.i i1, View view, boolean flag, int j1, byte byte0)
    {
        r = 0;
        c = context;
        d = LayoutInflater.from(context);
        e = i1;
        f = new w(this, e);
        g = flag;
        i = j1;
        j = 0;
        Resources resources = context.getResources();
        h = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(e.c));
        k = view;
        i1.a(this, context);
    }

    static boolean a(v v1)
    {
        return v1.g;
    }

    static LayoutInflater b(v v1)
    {
        return v1.d;
    }

    static android.support.v7.internal.view.menu.i c(v v1)
    {
        return v1.e;
    }

    public final void a()
    {
        r = 0x800005;
    }

    public final void a(Context context, android.support.v7.internal.view.menu.i i1)
    {
    }

    public final void a(android.support.v7.internal.view.menu.i i1, boolean flag)
    {
        if (i1 == e)
        {
            f();
            if (n != null)
            {
                n.a(i1, flag);
                return;
            }
        }
    }

    public final void a(y y1)
    {
        n = y1;
    }

    public final void a(View view)
    {
        k = view;
    }

    public final void a(boolean flag)
    {
        b = flag;
    }

    public final boolean a(ad ad1)
    {
        if (!ad1.hasVisibleItems()) goto _L2; else goto _L1
_L1:
        v v1;
        int i1;
        int j1;
        v1 = new v(c, ad1, k);
        v1.n = n;
        j1 = ad1.size();
        i1 = 0;
_L5:
        MenuItem menuitem;
        if (i1 >= j1)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        menuitem = ad1.getItem(i1);
        if (!menuitem.isVisible() || menuitem.getIcon() == null) goto _L4; else goto _L3
_L3:
        boolean flag = true;
_L6:
        v1.b = flag;
        if (v1.e())
        {
            if (n != null)
            {
                n.a(ad1);
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

    public final void b(boolean flag)
    {
        p = false;
        if (f != null)
        {
            f.notifyDataSetChanged();
        }
    }

    public final boolean b()
    {
        return false;
    }

    public final boolean b(m m1)
    {
        return false;
    }

    public final void c()
    {
        if (!e())
        {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        } else
        {
            return;
        }
    }

    public final boolean c(m m1)
    {
        return false;
    }

    public final ListPopupWindow d()
    {
        return l;
    }

    public final boolean e()
    {
        View view;
        int l1;
        l1 = 0;
        l = new ListPopupWindow(c, null, i, j);
        l.a(this);
        l.a(this);
        l.a(f);
        l.e();
        view = k;
        if (view == null) goto _L2; else goto _L1
_L1:
        int i1;
        int j1;
        w w1;
        int k1;
        int i2;
        int j2;
        int k2;
        if (m == null)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        m = view.getViewTreeObserver();
        if (i1 != 0)
        {
            m.addOnGlobalLayoutListener(this);
        }
        l.a(view);
        l.a(r);
        if (p) goto _L4; else goto _L3
_L3:
        w1 = f;
        i2 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        j2 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        k2 = w1.getCount();
        j1 = 0;
        k1 = 0;
        view = null;
        i1 = l1;
_L10:
        l1 = i1;
        if (j1 >= k2) goto _L6; else goto _L5
_L5:
        l1 = w1.getItemViewType(j1);
        if (l1 != k1)
        {
            k1 = l1;
            view = null;
        }
        if (o == null)
        {
            o = new FrameLayout(c);
        }
        view = w1.getView(j1, view, o);
        view.measure(i2, j2);
        l1 = view.getMeasuredWidth();
        if (l1 < h) goto _L8; else goto _L7
_L7:
        l1 = h;
_L6:
        q = l1;
        p = true;
_L4:
        l.b(q);
        l.g();
        l.c();
        l.j().setOnKeyListener(this);
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

    public final void f()
    {
        if (g())
        {
            l.a();
        }
    }

    public final boolean g()
    {
        return l != null && l.b();
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
        if (g())
        {
            View view = k;
            if (view == null || !view.isShown())
            {
                f();
            } else
            if (g())
            {
                l.c();
                return;
            }
        }
    }

    public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
        adapterview = f;
        w.a(adapterview).b(adapterview.a(i1));
    }

    public boolean onKey(View view, int i1, KeyEvent keyevent)
    {
        if (keyevent.getAction() == 1 && i1 == 82)
        {
            f();
            return true;
        } else
        {
            return false;
        }
    }

    static 
    {
        a = i.l;
    }
}
