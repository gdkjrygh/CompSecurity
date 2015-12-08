// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.support.v4.d.m;
import android.view.LayoutInflater;
import android.view.View;
import java.io.PrintWriter;

// Referenced classes of package android.support.v4.app:
//            o, s, FragmentActivity, ao

public class q extends o
{

    final Activity b;
    final Context c;
    final Handler d;
    final int e;
    final s f;
    m g;
    ao h;
    boolean i;
    boolean j;

    private q(Activity activity, Context context, Handler handler)
    {
        f = new s();
        b = activity;
        c = context;
        d = handler;
        e = 0;
    }

    q(FragmentActivity fragmentactivity)
    {
        this(((Activity) (fragmentactivity)), ((Context) (fragmentactivity)), fragmentactivity.a);
    }

    final ao a(String s1, boolean flag, boolean flag1)
    {
        if (g == null)
        {
            g = new m();
        }
        ao ao1 = (ao)g.get(s1);
        if (ao1 == null)
        {
            if (flag1)
            {
                ao1 = new ao(s1, this, flag);
                g.put(s1, ao1);
            }
            return ao1;
        } else
        {
            ao1.h = this;
            return ao1;
        }
    }

    public View a(int k)
    {
        return null;
    }

    final void a(String s1)
    {
        if (g != null)
        {
            ao ao1 = (ao)g.get(s1);
            if (ao1 != null && !ao1.f)
            {
                ao1.h();
                g.remove(s1);
            }
        }
    }

    public void a(String s1, PrintWriter printwriter, String as[])
    {
    }

    public boolean a()
    {
        return true;
    }

    public boolean b()
    {
        return true;
    }

    public LayoutInflater c()
    {
        return (LayoutInflater)c.getSystemService("layout_inflater");
    }

    public void d()
    {
    }

    public boolean e()
    {
        return true;
    }

    public int f()
    {
        return e;
    }

    final m g()
    {
        int l = 0;
        boolean flag1;
        if (g != null)
        {
            int i1 = g.size();
            ao aao[] = new ao[i1];
            for (int k = i1 - 1; k >= 0; k--)
            {
                aao[k] = (ao)g.c(k);
            }

            boolean flag = false;
            do
            {
                flag1 = flag;
                if (l >= i1)
                {
                    break;
                }
                ao ao1 = aao[l];
                if (ao1.f)
                {
                    flag = true;
                } else
                {
                    ao1.h();
                    g.remove(ao1.d);
                }
                l++;
            } while (true);
        } else
        {
            flag1 = false;
        }
        if (flag1)
        {
            return g;
        } else
        {
            return null;
        }
    }
}
