// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import java.io.PrintWriter;

public abstract class z extends x
{

    public final Activity a;
    public final Context b;
    final Handler c;
    final ac d;
    hs e;
    ao f;
    boolean g;
    boolean h;

    private z(Activity activity, Context context, Handler handler)
    {
        d = new ac();
        a = activity;
        b = context;
        c = handler;
    }

    z(u u1)
    {
        this(((Activity) (u1)), ((Context) (u1)), u1.a);
    }

    public View a(int i)
    {
        return null;
    }

    public final ao a(String s, boolean flag, boolean flag1)
    {
        if (e == null)
        {
            e = new hs();
        }
        ao ao1 = (ao)e.get(s);
        if (ao1 == null)
        {
            if (flag1)
            {
                ao1 = new ao(s, this, flag);
                e.put(s, ao1);
            }
            return ao1;
        } else
        {
            ao1.f = this;
            return ao1;
        }
    }

    public void a(Fragment fragment, Intent intent, int i)
    {
        if (i != -1)
        {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        } else
        {
            b.startActivity(intent);
            return;
        }
    }

    final void a(String s)
    {
        if (e != null)
        {
            ao ao1 = (ao)e.get(s);
            if (ao1 != null && !ao1.e)
            {
                ao1.g();
                e.remove(s);
            }
        }
    }

    public void a(String s, PrintWriter printwriter, String as[])
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
        return (LayoutInflater)b.getSystemService("layout_inflater");
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
        return 0;
    }

    final hs g()
    {
        int j = 0;
        boolean flag1;
        if (e != null)
        {
            int k = e.size();
            ao aao[] = new ao[k];
            for (int i = k - 1; i >= 0; i--)
            {
                aao[i] = (ao)e.c(i);
            }

            boolean flag = false;
            do
            {
                flag1 = flag;
                if (j >= k)
                {
                    break;
                }
                ao ao1 = aao[j];
                if (ao1.e)
                {
                    flag = true;
                } else
                {
                    ao1.g();
                    e.remove(ao1.c);
                }
                j++;
            } while (true);
        } else
        {
            flag1 = false;
        }
        if (flag1)
        {
            return e;
        } else
        {
            return null;
        }
    }
}
