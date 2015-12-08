// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.support.v4.view.x;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.internal.view.menu:
//            l, m, f, h, 
//            o

public abstract class b
    implements l
{

    protected Context a;
    protected Context b;
    protected f c;
    protected LayoutInflater d;
    protected LayoutInflater e;
    protected m f;
    private l.a g;
    private int h;
    private int i;
    private int j;

    public b(Context context, int k, int i1)
    {
        a = context;
        d = LayoutInflater.from(context);
        h = k;
        i = i1;
    }

    public m a(ViewGroup viewgroup)
    {
        if (f == null)
        {
            f = (m)d.inflate(h, viewgroup, false);
            f.a(c);
            a(true);
        }
        return f;
    }

    public View a(h h1, View view, ViewGroup viewgroup)
    {
        if (view instanceof m.a)
        {
            view = (m.a)view;
        } else
        {
            view = (m.a)d.inflate(i, viewgroup, false);
        }
        a(h1, ((m.a) (view)));
        return (View)view;
    }

    public final void a(int k)
    {
        j = k;
    }

    public void a(Context context, f f1)
    {
        b = context;
        e = LayoutInflater.from(b);
        c = f1;
    }

    public void a(f f1, boolean flag)
    {
        if (g != null)
        {
            g.onCloseMenu(f1, flag);
        }
    }

    public abstract void a(h h1, m.a a1);

    public final void a(l.a a1)
    {
        g = a1;
    }

    public void a(boolean flag)
    {
        ViewGroup viewgroup = (ViewGroup)f;
        if (viewgroup != null)
        {
            int i1 = 0;
            int k = 0;
            if (c != null)
            {
                c.l();
                ArrayList arraylist = c.k();
                int k1 = arraylist.size();
                int j1 = 0;
                do
                {
                    i1 = k;
                    if (j1 >= k1)
                    {
                        break;
                    }
                    h h1 = (h)arraylist.get(j1);
                    i1 = k;
                    if (c(h1))
                    {
                        View view = viewgroup.getChildAt(k);
                        Object obj;
                        View view1;
                        if (view instanceof m.a)
                        {
                            obj = ((m.a)view).a();
                        } else
                        {
                            obj = null;
                        }
                        view1 = a(h1, view, viewgroup);
                        if (h1 != obj)
                        {
                            view1.setPressed(false);
                            x.y(view1);
                        }
                        if (view1 != view)
                        {
                            obj = (ViewGroup)view1.getParent();
                            if (obj != null)
                            {
                                ((ViewGroup) (obj)).removeView(view1);
                            }
                            ((ViewGroup)f).addView(view1, k);
                        }
                        i1 = k + 1;
                    }
                    j1++;
                    k = i1;
                } while (true);
            }
            while (i1 < viewgroup.getChildCount()) 
            {
                if (!a(viewgroup, i1))
                {
                    i1++;
                }
            }
        }
    }

    public boolean a()
    {
        return false;
    }

    public final boolean a(h h1)
    {
        return false;
    }

    public boolean a(o o)
    {
        if (g != null)
        {
            return g.onOpenSubMenu(o);
        } else
        {
            return false;
        }
    }

    protected boolean a(ViewGroup viewgroup, int k)
    {
        viewgroup.removeViewAt(k);
        return true;
    }

    public final int b()
    {
        return j;
    }

    public final boolean b(h h1)
    {
        return false;
    }

    public final l.a c()
    {
        return g;
    }

    public boolean c(h h1)
    {
        return true;
    }
}
