// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.support.v4.view.bq;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.internal.view.menu:
//            u, x, v, g, 
//            j, w, aa

public abstract class d
    implements u
{

    protected Context a;
    protected Context b;
    protected g c;
    protected LayoutInflater d;
    protected LayoutInflater e;
    protected w f;
    private v g;
    private int h;
    private int i;

    public d(Context context, int k, int l)
    {
        a = context;
        d = LayoutInflater.from(context);
        h = k;
        i = l;
    }

    public v a()
    {
        return g;
    }

    public x a(ViewGroup viewgroup)
    {
        return (x)d.inflate(i, viewgroup, false);
    }

    public View a(j j1, View view, ViewGroup viewgroup)
    {
        if (view instanceof x)
        {
            view = (x)view;
        } else
        {
            view = a(viewgroup);
        }
        a(j1, ((x) (view)));
        return (View)view;
    }

    public void a(Context context, g g1)
    {
        b = context;
        e = LayoutInflater.from(b);
        c = g1;
    }

    public void a(g g1, boolean flag)
    {
        if (g != null)
        {
            g.a(g1, flag);
        }
    }

    public abstract void a(j j1, x x1);

    public void a(v v1)
    {
        g = v1;
    }

    protected void a(View view, int k)
    {
        ViewGroup viewgroup = (ViewGroup)view.getParent();
        if (viewgroup != null)
        {
            viewgroup.removeView(view);
        }
        ((ViewGroup)f).addView(view, k);
    }

    public boolean a(int k, j j1)
    {
        return true;
    }

    public boolean a(aa aa)
    {
        if (g != null)
        {
            return g.a(aa);
        } else
        {
            return false;
        }
    }

    public boolean a(g g1, j j1)
    {
        return false;
    }

    protected boolean a(ViewGroup viewgroup, int k)
    {
        viewgroup.removeViewAt(k);
        return true;
    }

    public void b(boolean flag)
    {
        ViewGroup viewgroup = (ViewGroup)f;
        if (viewgroup != null)
        {
            int l;
            if (c != null)
            {
                c.i();
                ArrayList arraylist = c.h();
                int k1 = arraylist.size();
                int i1 = 0;
                int k = 0;
                do
                {
                    l = k;
                    if (i1 >= k1)
                    {
                        break;
                    }
                    j j2 = (j)arraylist.get(i1);
                    if (a(k, j2))
                    {
                        View view = viewgroup.getChildAt(k);
                        j j1;
                        View view1;
                        if (view instanceof x)
                        {
                            j1 = ((x)view).getItemData();
                        } else
                        {
                            j1 = null;
                        }
                        view1 = a(j2, view, viewgroup);
                        if (j2 != j1)
                        {
                            view1.setPressed(false);
                            bq.o(view1);
                        }
                        if (view1 != view)
                        {
                            a(view1, k);
                        }
                        k++;
                    }
                    i1++;
                } while (true);
            } else
            {
                l = 0;
            }
            while (l < viewgroup.getChildCount()) 
            {
                if (!a(viewgroup, l))
                {
                    l++;
                }
            }
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
}
