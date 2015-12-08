// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public abstract class vp
    implements wj
{

    public Context a;
    public Context b;
    public vu c;
    public wk d;
    public wl e;
    private LayoutInflater f;
    private int g;
    private int h;

    public vp(Context context, int i, int j)
    {
        a = context;
        f = LayoutInflater.from(context);
        g = i;
        h = j;
    }

    public View a(vy vy1, View view, ViewGroup viewgroup)
    {
        if (view instanceof wm)
        {
            view = (wm)view;
        } else
        {
            view = (wm)f.inflate(h, viewgroup, false);
        }
        a(vy1, ((wm) (view)));
        return (View)view;
    }

    public wl a(ViewGroup viewgroup)
    {
        if (e == null)
        {
            e = (wl)f.inflate(g, viewgroup, false);
            e.a(c);
            b(true);
        }
        return e;
    }

    public void a(Context context, vu vu1)
    {
        b = context;
        LayoutInflater.from(b);
        c = vu1;
    }

    public void a(vu vu1, boolean flag)
    {
        if (d != null)
        {
            d.a(vu1, flag);
        }
    }

    public abstract void a(vy vy1, wm wm1);

    public boolean a()
    {
        return false;
    }

    public boolean a(ViewGroup viewgroup, int i)
    {
        viewgroup.removeViewAt(i);
        return true;
    }

    public boolean a(vy vy1)
    {
        return true;
    }

    public boolean a(wo wo)
    {
        if (d != null)
        {
            return d.a_(wo);
        } else
        {
            return false;
        }
    }

    public void b(boolean flag)
    {
        ViewGroup viewgroup = (ViewGroup)e;
        if (viewgroup != null)
        {
            int j;
            if (c != null)
            {
                c.i();
                ArrayList arraylist = c.h();
                int l = arraylist.size();
                int k = 0;
                int i = 0;
                do
                {
                    j = i;
                    if (k >= l)
                    {
                        break;
                    }
                    vy vy1 = (vy)arraylist.get(k);
                    if (a(vy1))
                    {
                        View view = viewgroup.getChildAt(i);
                        Object obj;
                        View view1;
                        if (view instanceof wm)
                        {
                            obj = ((wm)view).a();
                        } else
                        {
                            obj = null;
                        }
                        view1 = a(vy1, view, viewgroup);
                        if (vy1 != obj)
                        {
                            view1.setPressed(false);
                            mk.w(view1);
                        }
                        if (view1 != view)
                        {
                            obj = (ViewGroup)view1.getParent();
                            if (obj != null)
                            {
                                ((ViewGroup) (obj)).removeView(view1);
                            }
                            ((ViewGroup)e).addView(view1, i);
                        }
                        i++;
                    }
                    k++;
                } while (true);
            } else
            {
                j = 0;
            }
            while (j < viewgroup.getChildCount()) 
            {
                if (!a(viewgroup, j))
                {
                    j++;
                }
            }
        }
    }

    public final boolean b(vy vy1)
    {
        return false;
    }

    public final boolean c(vy vy1)
    {
        return false;
    }
}
