// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.v4.g.i;
import android.view.LayoutInflater;
import android.view.View;
import java.io.PrintWriter;

// Referenced classes of package android.support.v4.app:
//            j, n, i, v, 
//            Fragment

public abstract class l extends j
{

    final Activity b;
    final Context c;
    final Handler d;
    final int e;
    final n f;
    i g;
    v h;
    boolean i;
    boolean j;

    private l(Activity activity, Context context, Handler handler)
    {
        f = new n();
        b = activity;
        c = context;
        d = handler;
        e = 0;
    }

    l(android.support.v4.app.i k)
    {
        this(((Activity) (k)), ((Context) (k)), k.mHandler);
    }

    final v a(String s, boolean flag, boolean flag1)
    {
        if (g == null)
        {
            g = new i();
        }
        v v1 = (v)g.get(s);
        if (v1 == null)
        {
            if (flag1)
            {
                v1 = new v(s, this, flag);
                g.put(s, v1);
            }
            return v1;
        } else
        {
            v1.h = this;
            return v1;
        }
    }

    public View a(int k)
    {
        return null;
    }

    void a(Fragment fragment)
    {
    }

    public void a(Fragment fragment, Intent intent, int k)
    {
        if (k != -1)
        {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        } else
        {
            c.startActivity(intent);
            return;
        }
    }

    public void a(Fragment fragment, String as[], int k)
    {
    }

    public void a(String s, PrintWriter printwriter, String as[])
    {
    }

    public boolean a()
    {
        return true;
    }

    public boolean a(String s)
    {
        return false;
    }

    final void b(String s)
    {
        if (g != null)
        {
            v v1 = (v)g.get(s);
            if (v1 != null && !v1.f)
            {
                v1.g();
                g.remove(s);
            }
        }
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

    public abstract Object g();

    final i h()
    {
        int i1 = 0;
        boolean flag1;
        if (g != null)
        {
            int j1 = g.size();
            v av[] = new v[j1];
            for (int k = j1 - 1; k >= 0; k--)
            {
                av[k] = (v)g.c(k);
            }

            boolean flag = false;
            do
            {
                flag1 = flag;
                if (i1 >= j1)
                {
                    break;
                }
                v v1 = av[i1];
                if (v1.f)
                {
                    flag = true;
                } else
                {
                    v1.g();
                    g.remove(v1.d);
                }
                i1++;
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
