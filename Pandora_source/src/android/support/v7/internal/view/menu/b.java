// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.internal.view.menu:
//            l, m, f, h, 
//            p

public abstract class b
    implements l
{

    private l.a a;
    private int b;
    protected Context c;
    protected Context d;
    protected f e;
    protected LayoutInflater f;
    protected LayoutInflater g;
    protected m h;
    private int i;
    private int j;

    public b(Context context, int k, int i1)
    {
        c = context;
        f = LayoutInflater.from(context);
        b = k;
        i = i1;
    }

    public m a(ViewGroup viewgroup)
    {
        if (h == null)
        {
            h = (m)f.inflate(b, viewgroup, false);
            h.a(e);
            c(true);
        }
        return h;
    }

    public View a(h h1, View view, ViewGroup viewgroup)
    {
        if (view instanceof m.a)
        {
            view = (m.a)view;
        } else
        {
            view = b(viewgroup);
        }
        a(h1, ((m.a) (view)));
        return (View)view;
    }

    public void a(Context context, f f1)
    {
        d = context;
        g = LayoutInflater.from(d);
        e = f1;
    }

    public void a(f f1, boolean flag)
    {
        if (a != null)
        {
            a.a(f1, flag);
        }
    }

    public abstract void a(h h1, m.a a1);

    public void a(l.a a1)
    {
        a = a1;
    }

    protected void a(View view, int k)
    {
        ViewGroup viewgroup = (ViewGroup)view.getParent();
        if (viewgroup != null)
        {
            viewgroup.removeView(view);
        }
        ((ViewGroup)h).addView(view, k);
    }

    public boolean a(int k, h h1)
    {
        return true;
    }

    public boolean a(f f1, h h1)
    {
        return false;
    }

    public boolean a(p p)
    {
        if (a != null)
        {
            return a.b(p);
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

    public m.a b(ViewGroup viewgroup)
    {
        return (m.a)f.inflate(i, viewgroup, false);
    }

    public void b(int k)
    {
        j = k;
    }

    public boolean b(f f1, h h1)
    {
        return false;
    }

    public void c(boolean flag)
    {
        ViewGroup viewgroup = (ViewGroup)h;
        if (viewgroup != null)
        {
            int i1;
            if (e != null)
            {
                e.j();
                ArrayList arraylist = e.i();
                int k1 = arraylist.size();
                int j1 = 0;
                int k = 0;
                do
                {
                    i1 = k;
                    if (j1 >= k1)
                    {
                        break;
                    }
                    h h2 = (h)arraylist.get(j1);
                    if (a(k, h2))
                    {
                        View view = viewgroup.getChildAt(k);
                        h h1;
                        View view1;
                        if (view instanceof m.a)
                        {
                            h1 = ((m.a)view).getItemData();
                        } else
                        {
                            h1 = null;
                        }
                        view1 = a(h2, view, viewgroup);
                        if (h2 != h1)
                        {
                            view1.setPressed(false);
                        }
                        if (view1 != view)
                        {
                            a(view1, k);
                        }
                        k++;
                    }
                    j1++;
                } while (true);
            } else
            {
                i1 = 0;
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

    public boolean g()
    {
        return false;
    }
}
