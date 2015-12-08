// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.support.v4.view.bt;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.internal.view.menu:
//            v, x, y, w, 
//            i, m, ab

public abstract class d
    implements v
{

    public Context a;
    public Context b;
    public i c;
    public LayoutInflater d;
    public LayoutInflater e;
    public w f;
    public x g;
    public int h;
    private int i;
    private int j;

    public d(Context context, int k, int l)
    {
        a = context;
        d = LayoutInflater.from(context);
        i = k;
        j = l;
    }

    public x a(ViewGroup viewgroup)
    {
        if (g == null)
        {
            g = (x)d.inflate(i, viewgroup, false);
            g.a(c);
            b(true);
        }
        return g;
    }

    public View a(m m1, View view, ViewGroup viewgroup)
    {
        if (view instanceof y)
        {
            view = (y)view;
        } else
        {
            view = (y)d.inflate(j, viewgroup, false);
        }
        a(m1, ((y) (view)));
        return (View)view;
    }

    public void a(Context context, i k)
    {
        b = context;
        e = LayoutInflater.from(b);
        c = k;
    }

    public void a(i k, boolean flag)
    {
        if (f != null)
        {
            f.a(k, flag);
        }
    }

    public abstract void a(m m1, y y1);

    public boolean a()
    {
        return false;
    }

    public boolean a(ab ab)
    {
        if (f != null)
        {
            return f.a_(ab);
        } else
        {
            return false;
        }
    }

    public boolean a(m m1)
    {
        return true;
    }

    public boolean a(ViewGroup viewgroup, int k)
    {
        viewgroup.removeViewAt(k);
        return true;
    }

    public void b(boolean flag)
    {
        ViewGroup viewgroup = (ViewGroup)g;
        if (viewgroup != null)
        {
            int l;
            if (c != null)
            {
                c.i();
                ArrayList arraylist = c.h();
                int j1 = arraylist.size();
                int i1 = 0;
                int k = 0;
                do
                {
                    l = k;
                    if (i1 >= j1)
                    {
                        break;
                    }
                    m m1 = (m)arraylist.get(i1);
                    if (a(m1))
                    {
                        View view = viewgroup.getChildAt(k);
                        Object obj;
                        View view1;
                        if (view instanceof y)
                        {
                            obj = ((y)view).getItemData();
                        } else
                        {
                            obj = null;
                        }
                        view1 = a(m1, view, viewgroup);
                        if (m1 != obj)
                        {
                            view1.setPressed(false);
                            bt.r(view1);
                        }
                        if (view1 != view)
                        {
                            obj = (ViewGroup)view1.getParent();
                            if (obj != null)
                            {
                                ((ViewGroup) (obj)).removeView(view1);
                            }
                            ((ViewGroup)g).addView(view1, k);
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

    public final boolean b(m m1)
    {
        return false;
    }

    public final boolean c(m m1)
    {
        return false;
    }
}
