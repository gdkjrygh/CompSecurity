// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.widget.popupmenu;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.util.ArrayList;

// Referenced classes of package com.android.widget.popupmenu:
//            d, a, g, ListPopupWindow, 
//            b, ListMenuItemView

public class c
    implements android.view.View.OnKeyListener, android.view.ViewTreeObserver.OnGlobalLayoutListener, android.widget.AdapterView.OnItemClickListener, android.widget.PopupWindow.OnDismissListener, d
{
    private class a extends BaseAdapter
    {

        final c a;
        private com.android.widget.popupmenu.a b;
        private int c;

        static com.android.widget.popupmenu.a a(a a1)
        {
            return a1.b;
        }

        public b a(int i1)
        {
            ArrayList arraylist;
            int j1;
            if (c.a(a))
            {
                arraylist = b.i();
            } else
            {
                arraylist = b.g();
            }
            j1 = i1;
            if (c >= 0)
            {
                j1 = i1;
                if (i1 >= c)
                {
                    j1 = i1 + 1;
                }
            }
            return (b)arraylist.get(j1);
        }

        void a()
        {
            b b1 = c.c(a).l();
            if (b1 != null)
            {
                ArrayList arraylist = c.c(a).i();
                int j1 = arraylist.size();
                for (int i1 = 0; i1 < j1; i1++)
                {
                    if ((b)arraylist.get(i1) == b1)
                    {
                        c = i1;
                        return;
                    }
                }

            }
            c = -1;
        }

        public int getCount()
        {
            ArrayList arraylist;
            if (c.a(a))
            {
                arraylist = b.i();
            } else
            {
                arraylist = b.g();
            }
            if (c < 0)
            {
                return arraylist.size();
            } else
            {
                return arraylist.size() - 1;
            }
        }

        public Object getItem(int i1)
        {
            return a(i1);
        }

        public long getItemId(int i1)
        {
            return (long)i1;
        }

        public View getView(int i1, View view, ViewGroup viewgroup)
        {
            if (view == null)
            {
                view = c.b(a).inflate(0x7f040085, viewgroup, false);
            }
            viewgroup = (e.a)view;
            if (a.a)
            {
                ((ListMenuItemView)view).setForceShowIcon(true);
            }
            viewgroup.a(a(i1), 0);
            return view;
        }

        public void notifyDataSetChanged()
        {
            a();
            super.notifyDataSetChanged();
        }

        public a(com.android.widget.popupmenu.a a1)
        {
            a = c.this;
            super();
            c = -1;
            b = a1;
            a();
        }
    }


    boolean a;
    private Context b;
    private LayoutInflater c;
    private ListPopupWindow d;
    private com.android.widget.popupmenu.a e;
    private int f;
    private View g;
    private boolean h;
    private ViewTreeObserver i;
    private a j;
    private d.a k;
    private ViewGroup l;

    public c(Context context, com.android.widget.popupmenu.a a1, View view)
    {
        this(context, a1, view, false);
    }

    public c(Context context, com.android.widget.popupmenu.a a1, View view, boolean flag)
    {
        b = context;
        c = LayoutInflater.from(context);
        e = a1;
        h = flag;
        context = context.getResources();
        f = Math.max(context.getDisplayMetrics().widthPixels / 2, context.getDimensionPixelSize(0x7f090031));
        g = view;
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
            if (l == null)
            {
                l = new FrameLayout(b);
            }
            view = listadapter.getView(j1, view, l);
            view.measure(i2, j2);
            k1 = Math.max(k1, view.getMeasuredWidth());
        }

        return k1;
    }

    static boolean a(c c1)
    {
        return c1.h;
    }

    static LayoutInflater b(c c1)
    {
        return c1.c;
    }

    static com.android.widget.popupmenu.a c(c c1)
    {
        return c1.e;
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

    public void a(Context context, com.android.widget.popupmenu.a a1)
    {
    }

    public void a(com.android.widget.popupmenu.a a1, boolean flag)
    {
        if (a1 == e)
        {
            c();
            if (k != null)
            {
                k.a(a1, flag);
                return;
            }
        }
    }

    public void a(d.a a1)
    {
        k = a1;
    }

    public void a(boolean flag)
    {
        a = flag;
    }

    public boolean a(com.android.widget.popupmenu.a a1, b b1)
    {
        return false;
    }

    public boolean a(g g1)
    {
        if (!g1.hasVisibleItems()) goto _L2; else goto _L1
_L1:
        c c1;
        int i1;
        int j1;
        c1 = new c(b, g1, g, false);
        c1.a(k);
        j1 = g1.size();
        i1 = 0;
_L5:
        MenuItem menuitem;
        if (i1 >= j1)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        menuitem = g1.getItem(i1);
        if (!menuitem.isVisible() || menuitem.getIcon() == null) goto _L4; else goto _L3
_L3:
        boolean flag = true;
_L6:
        c1.a(flag);
        if (c1.b())
        {
            if (k != null)
            {
                k.a(g1);
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

    public void b(boolean flag)
    {
        if (j != null)
        {
            j.notifyDataSetChanged();
        }
    }

    public boolean b()
    {
        boolean flag = false;
        d = new ListPopupWindow(b, null, 0x7f0100cb);
        d.a(this);
        d.a(this);
        j = new a(e);
        d.a(j);
        d.a(true);
        View view = g;
        if (view != null)
        {
            if (i == null)
            {
                flag = true;
            }
            i = view.getViewTreeObserver();
            if (flag)
            {
                i.addOnGlobalLayoutListener(this);
            }
            d.a(view);
            d.b(Math.min(a(j), f));
            d.c(2);
            d.b();
            d.g().setOnKeyListener(this);
            return true;
        } else
        {
            return false;
        }
    }

    public boolean b(com.android.widget.popupmenu.a a1, b b1)
    {
        return false;
    }

    public void c()
    {
        if (d())
        {
            d.c();
        }
    }

    public boolean d()
    {
        return d != null && d.e();
    }

    public boolean e()
    {
        return false;
    }

    public void onDismiss()
    {
        d = null;
        e.close();
        if (i != null)
        {
            if (!i.isAlive())
            {
                i = g.getViewTreeObserver();
            }
            i.removeGlobalOnLayoutListener(this);
            i = null;
        }
    }

    public void onGlobalLayout()
    {
        if (d())
        {
            View view = g;
            if (view == null || !view.isShown())
            {
                c();
            } else
            if (d())
            {
                d.b();
                return;
            }
        }
    }

    public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
        adapterview = j;
        a.a(adapterview).a(adapterview.a(i1), 0);
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
}
