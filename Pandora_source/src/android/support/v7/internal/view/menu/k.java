// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.internal.widget.ListPopupWindow;
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

// Referenced classes of package android.support.v7.internal.view.menu:
//            l, f, p, h, 
//            ListMenuItemView

public class k
    implements l, android.view.View.OnKeyListener, android.view.ViewTreeObserver.OnGlobalLayoutListener, android.widget.AdapterView.OnItemClickListener, android.widget.PopupWindow.OnDismissListener
{
    private class a extends BaseAdapter
    {

        final k a;
        private f b;
        private int c;

        static f a(a a1)
        {
            return a1.b;
        }

        public h a(int i1)
        {
            ArrayList arraylist;
            int j1;
            if (k.a(a))
            {
                arraylist = b.l();
            } else
            {
                arraylist = b.i();
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
            return (h)arraylist.get(j1);
        }

        void a()
        {
            h h1 = k.c(a).r();
            if (h1 != null)
            {
                ArrayList arraylist = k.c(a).l();
                int j1 = arraylist.size();
                for (int i1 = 0; i1 < j1; i1++)
                {
                    if ((h)arraylist.get(i1) == h1)
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
            if (k.a(a))
            {
                arraylist = b.l();
            } else
            {
                arraylist = b.i();
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
                view = k.b(a).inflate(k.b, viewgroup, false);
            }
            viewgroup = (m.a)view;
            if (a.c)
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

        public a(f f1)
        {
            a = k.this;
            super();
            c = -1;
            b = f1;
            a();
        }
    }


    static final int b;
    private Context a;
    boolean c;
    private LayoutInflater d;
    private ListPopupWindow e;
    private f f;
    private int g;
    private View h;
    private boolean i;
    private ViewTreeObserver j;
    private a k;
    private l.a l;
    private ViewGroup m;

    public k(Context context, f f1, View view, boolean flag)
    {
        a = context;
        d = LayoutInflater.from(context);
        f = f1;
        i = flag;
        context = context.getResources();
        g = Math.max(context.getDisplayMetrics().widthPixels / 2, context.getDimensionPixelSize(android.support.v7.appcompat.R.dimen.abc_config_prefDialogWidth));
        h = view;
        f1.a(this);
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
                m = new FrameLayout(a);
            }
            view = listadapter.getView(j1, view, m);
            view.measure(i2, j2);
            k1 = Math.max(k1, view.getMeasuredWidth());
        }

        return k1;
    }

    static boolean a(k k1)
    {
        return k1.i;
    }

    static LayoutInflater b(k k1)
    {
        return k1.d;
    }

    static f c(k k1)
    {
        return k1.f;
    }

    public void a(Context context, f f1)
    {
    }

    public void a(f f1, boolean flag)
    {
        if (f1 == f)
        {
            b();
            if (l != null)
            {
                l.a(f1, flag);
                return;
            }
        }
    }

    public void a(l.a a1)
    {
        l = a1;
    }

    public void a(boolean flag)
    {
        c = flag;
    }

    public boolean a()
    {
        boolean flag = false;
        e = new ListPopupWindow(a, null, android.support.v7.appcompat.R.attr.popupMenuStyle);
        e.a(this);
        e.a(this);
        k = new a(f);
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
            e.a(view);
            e.e(Math.min(a(((ListAdapter) (k))), g));
            e.f(2);
            e.c();
            e.h().setOnKeyListener(this);
            return true;
        } else
        {
            return false;
        }
    }

    public boolean a(f f1, h h1)
    {
        return false;
    }

    public boolean a(p p1)
    {
        if (!p1.hasVisibleItems()) goto _L2; else goto _L1
_L1:
        k k1;
        int i1;
        int j1;
        k1 = new k(a, p1, h, false);
        k1.a(l);
        j1 = p1.size();
        i1 = 0;
_L5:
        MenuItem menuitem;
        if (i1 >= j1)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        menuitem = p1.getItem(i1);
        if (!menuitem.isVisible() || menuitem.getIcon() == null) goto _L4; else goto _L3
_L3:
        boolean flag = true;
_L6:
        k1.a(flag);
        if (k1.a())
        {
            if (l != null)
            {
                l.b(p1);
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

    public void b()
    {
        if (c())
        {
            e.d();
        }
    }

    public boolean b(f f1, h h1)
    {
        return false;
    }

    public void c(boolean flag)
    {
        if (k != null)
        {
            k.notifyDataSetChanged();
        }
    }

    public boolean c()
    {
        return e != null && e.f();
    }

    public boolean g()
    {
        return false;
    }

    public void onDismiss()
    {
        e = null;
        f.close();
        if (j != null)
        {
            if (!j.isAlive())
            {
                j = h.getViewTreeObserver();
            }
            j.removeGlobalOnLayoutListener(this);
            j = null;
        }
    }

    public void onGlobalLayout()
    {
        if (c())
        {
            View view = h;
            if (view == null || !view.isShown())
            {
                b();
            } else
            if (c())
            {
                e.c();
                return;
            }
        }
    }

    public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
        adapterview = k;
        a.a(adapterview).a(adapterview.a(i1), 0);
    }

    public boolean onKey(View view, int i1, KeyEvent keyevent)
    {
        if (keyevent.getAction() == 1 && i1 == 82)
        {
            b();
            return true;
        } else
        {
            return false;
        }
    }

    static 
    {
        b = android.support.v7.appcompat.R.layout.abc_popup_menu_item_layout;
    }
}
