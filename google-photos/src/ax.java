// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class ax extends av
{

    final Activity a;
    final Context b;
    final Handler c;
    final bb d;
    jz e;
    cb f;
    boolean g;
    boolean h;
    private int i;

    private ax(Activity activity, Context context, Handler handler, int j)
    {
        d = new bb();
        a = activity;
        b = context;
        c = handler;
        i = 0;
    }

    ax(ar ar1)
    {
        this(((Activity) (ar1)), ((Context) (ar1)), ar1.a, 0);
    }

    public View a(int j)
    {
        return null;
    }

    final cb a(String s, boolean flag, boolean flag1)
    {
        if (e == null)
        {
            e = new jz();
        }
        cb cb1 = (cb)e.get(s);
        if (cb1 == null)
        {
            if (flag1)
            {
                cb1 = new cb(s, this, flag);
                e.put(s, cb1);
            }
            return cb1;
        } else
        {
            cb1.g = this;
            return cb1;
        }
    }

    void a(am am)
    {
    }

    public void a(am am, Intent intent, int j)
    {
        if (j != -1)
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
            cb cb1 = (cb)e.get(s);
            if (cb1 != null && !cb1.f)
            {
                cb1.g();
                e.remove(s);
            }
        }
    }

    public void a(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
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
        return i;
    }

    final jz g()
    {
        int k = 0;
        boolean flag1;
        if (e != null)
        {
            int l = e.size();
            cb acb[] = new cb[l];
            for (int j = l - 1; j >= 0; j--)
            {
                acb[j] = (cb)e.c(j);
            }

            boolean flag = false;
            do
            {
                flag1 = flag;
                if (k >= l)
                {
                    break;
                }
                cb cb1 = acb[k];
                if (cb1.f)
                {
                    flag = true;
                } else
                {
                    cb1.g();
                    e.remove(cb1.d);
                }
                k++;
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
