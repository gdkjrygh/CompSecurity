// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.support.v7.widget.j;
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
//            l, f, o, h, 
//            ListMenuItemView

public class k
    implements l, android.view.View.OnKeyListener, android.view.ViewTreeObserver.OnGlobalLayoutListener, android.widget.AdapterView.OnItemClickListener, android.widget.PopupWindow.OnDismissListener
{
    private final class a extends BaseAdapter
    {

        final k a;
        private f b;
        private int c;

        static f a(a a1)
        {
            return a1.b;
        }

        private void a()
        {
            h h1 = k.c(a).q();
            if (h1 != null)
            {
                ArrayList arraylist = k.c(a).n();
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

        public final h a(int i1)
        {
            ArrayList arraylist;
            int j1;
            if (k.a(a))
            {
                arraylist = b.n();
            } else
            {
                arraylist = b.k();
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

        public final int getCount()
        {
            ArrayList arraylist;
            if (k.a(a))
            {
                arraylist = b.n();
            } else
            {
                arraylist = b.k();
            }
            if (c < 0)
            {
                return arraylist.size();
            } else
            {
                return arraylist.size() - 1;
            }
        }

        public final Object getItem(int i1)
        {
            return a(i1);
        }

        public final long getItemId(int i1)
        {
            return (long)i1;
        }

        public final View getView(int i1, View view, ViewGroup viewgroup)
        {
            View view1 = view;
            if (view == null)
            {
                view1 = k.b(a).inflate(k.a, viewgroup, false);
            }
            view = (m.a)view1;
            if (a.b)
            {
                ((ListMenuItemView)view1).setForceShowIcon(true);
            }
            view.a(a(i1));
            return view1;
        }

        public final void notifyDataSetChanged()
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


    static final int a;
    boolean b;
    private final Context c;
    private final LayoutInflater d;
    private final f e;
    private final a f;
    private final boolean g;
    private final int h;
    private final int i;
    private final int j;
    private View k;
    private j l;
    private ViewTreeObserver m;
    private l.a n;
    private ViewGroup o;
    private boolean p;
    private int q;
    private int r;

    public k(Context context, f f1)
    {
        this(context, f1, null, false, android.support.v7.appcompat.a.a.popupMenuStyle);
    }

    private k(Context context, f f1, View view)
    {
        this(context, f1, view, false, android.support.v7.appcompat.a.a.popupMenuStyle);
    }

    public k(Context context, f f1, View view, boolean flag, int i1)
    {
        this(context, f1, view, flag, i1, (byte)0);
    }

    private k(Context context, f f1, View view, boolean flag, int i1, byte byte0)
    {
        r = 0;
        c = context;
        d = LayoutInflater.from(context);
        e = f1;
        f = new a(e);
        g = flag;
        i = i1;
        j = 0;
        Resources resources = context.getResources();
        h = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(android.support.v7.appcompat.a.d.abc_config_prefDialogWidth));
        k = view;
        f1.a(this, context);
    }

    static boolean a(k k1)
    {
        return k1.g;
    }

    static LayoutInflater b(k k1)
    {
        return k1.d;
    }

    static f c(k k1)
    {
        return k1.e;
    }

    public final void a(Context context, f f1)
    {
    }

    public final void a(Parcelable parcelable)
    {
    }

    public final void a(f f1, boolean flag)
    {
        if (f1 == e)
        {
            h();
            if (n != null)
            {
                n.onCloseMenu(f1, flag);
                return;
            }
        }
    }

    public final void a(l.a a1)
    {
        n = a1;
    }

    public final void a(View view)
    {
        k = view;
    }

    public final void a(boolean flag)
    {
        p = false;
        if (f != null)
        {
            f.notifyDataSetChanged();
        }
    }

    public final boolean a()
    {
        return false;
    }

    public final boolean a(h h1)
    {
        return false;
    }

    public final boolean a(o o1)
    {
        if (o1.hasVisibleItems())
        {
            k k1 = new k(c, o1, k);
            k1.n = n;
            boolean flag1 = false;
            int j1 = o1.size();
            int i1 = 0;
label0:
            do
            {
label1:
                {
                    boolean flag = flag1;
                    if (i1 < j1)
                    {
                        MenuItem menuitem = o1.getItem(i1);
                        if (!menuitem.isVisible() || menuitem.getIcon() == null)
                        {
                            break label1;
                        }
                        flag = true;
                    }
                    k1.b = flag;
                    if (k1.g())
                    {
                        if (n != null)
                        {
                            n.onOpenSubMenu(o1);
                        }
                        return true;
                    }
                    break label0;
                }
                i1++;
            } while (true);
        }
        return false;
    }

    public final int b()
    {
        return 0;
    }

    public final void b(boolean flag)
    {
        b = flag;
    }

    public final boolean b(h h1)
    {
        return false;
    }

    public final void c()
    {
        r = 0x800005;
    }

    public final Parcelable d()
    {
        return null;
    }

    public final void e()
    {
        if (!g())
        {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        } else
        {
            return;
        }
    }

    public final j f()
    {
        return l;
    }

    public final boolean g()
    {
        View view;
        l = new j(c, null, i, j);
        l.a(this);
        l.a(this);
        l.a(f);
        l.e();
        view = k;
        if (view == null) goto _L2; else goto _L1
_L1:
        int i1;
        int j1;
        int l1;
        a a1;
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
        l.c(r);
        if (p) goto _L4; else goto _L3
_L3:
        a1 = f;
        i2 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        j2 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        k2 = a1.getCount();
        j1 = 0;
        k1 = 0;
        view = null;
        i1 = 0;
_L10:
        l1 = i1;
        if (j1 >= k2) goto _L6; else goto _L5
_L5:
        l1 = a1.getItemViewType(j1);
        if (l1 != k1)
        {
            k1 = l1;
            view = null;
        }
        if (o == null)
        {
            o = new FrameLayout(c);
        }
        view = a1.getView(j1, view, o);
        view.measure(i2, j2);
        l1 = view.getMeasuredWidth();
        if (l1 < h) goto _L8; else goto _L7
_L7:
        l1 = h;
_L6:
        q = l1;
        p = true;
_L4:
        l.d(q);
        l.l();
        l.c();
        l.p().setOnKeyListener(this);
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

    public final void h()
    {
        if (i())
        {
            l.k();
        }
    }

    public final boolean i()
    {
        return l != null && l.n();
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
        if (i())
        {
            View view = k;
            if (view == null || !view.isShown())
            {
                h();
            } else
            if (i())
            {
                l.c();
                return;
            }
        }
    }

    public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
        adapterview = f;
        a.a(adapterview).b(adapterview.a(i1));
    }

    public boolean onKey(View view, int i1, KeyEvent keyevent)
    {
        if (keyevent.getAction() == 1 && i1 == 82)
        {
            h();
            return true;
        } else
        {
            return false;
        }
    }

    static 
    {
        a = android.support.v7.appcompat.a.h.abc_popup_menu_item_layout;
    }
}
