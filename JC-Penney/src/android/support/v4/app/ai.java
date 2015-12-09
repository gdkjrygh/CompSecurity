// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.v4.f.m;
import android.view.LayoutInflater;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

// Referenced classes of package android.support.v4.app:
//            ag, am, ac, bi, 
//            Fragment

public abstract class ai extends ag
{

    private final Activity a;
    final Context b;
    final int c;
    final am d;
    private final Handler e;
    private m f;
    private bi g;
    private boolean h;
    private boolean i;

    ai(Activity activity, Context context, Handler handler, int i1)
    {
        d = new am();
        a = activity;
        b = context;
        e = handler;
        c = i1;
    }

    ai(ac ac1)
    {
        this(((Activity) (ac1)), ((Context) (ac1)), ac1.a, 0);
    }

    bi a(String s, boolean flag, boolean flag1)
    {
        if (f == null)
        {
            f = new m();
        }
        bi bi1 = (bi)f.get(s);
        if (bi1 == null)
        {
            if (flag1)
            {
                bi1 = new bi(s, this, flag);
                f.put(s, bi1);
            }
            return bi1;
        } else
        {
            bi1.a(this);
            return bi1;
        }
    }

    public View a(int i1)
    {
        return null;
    }

    public void a(Fragment fragment, Intent intent, int i1)
    {
        if (i1 != -1)
        {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        } else
        {
            b.startActivity(intent);
            return;
        }
    }

    void a(m m1)
    {
        f = m1;
    }

    void a(String s)
    {
        if (f != null)
        {
            bi bi1 = (bi)f.get(s);
            if (bi1 != null && !bi1.f)
            {
                bi1.h();
                f.remove(s);
            }
        }
    }

    public void a(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
    }

    void a(boolean flag)
    {
        while (g == null || !i) 
        {
            return;
        }
        i = false;
        if (flag)
        {
            g.d();
            return;
        } else
        {
            g.c();
            return;
        }
    }

    public boolean a()
    {
        return true;
    }

    public boolean a(Fragment fragment)
    {
        return true;
    }

    public LayoutInflater b()
    {
        return (LayoutInflater)b.getSystemService("layout_inflater");
    }

    void b(Fragment fragment)
    {
    }

    void b(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        printwriter.print(s);
        printwriter.print("mLoadersStarted=");
        printwriter.println(i);
        if (g != null)
        {
            printwriter.print(s);
            printwriter.print("Loader Manager ");
            printwriter.print(Integer.toHexString(System.identityHashCode(g)));
            printwriter.println(":");
            g.a((new StringBuilder()).append(s).append("  ").toString(), filedescriptor, printwriter, as);
        }
    }

    public void c()
    {
    }

    public boolean d()
    {
        return true;
    }

    public int e()
    {
        return c;
    }

    Activity f()
    {
        return a;
    }

    Context g()
    {
        return b;
    }

    Handler h()
    {
        return e;
    }

    am i()
    {
        return d;
    }

    void j()
    {
        if (i)
        {
            return;
        }
        i = true;
        if (g == null) goto _L2; else goto _L1
_L1:
        g.b();
_L4:
        h = true;
        return;
_L2:
        if (!h)
        {
            g = a("(root)", i, false);
            if (g != null && !g.e)
            {
                g.b();
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    void k()
    {
        if (g == null)
        {
            return;
        } else
        {
            g.h();
            return;
        }
    }

    void l()
    {
        if (f != null)
        {
            int k1 = f.size();
            bi abi[] = new bi[k1];
            for (int i1 = k1 - 1; i1 >= 0; i1--)
            {
                abi[i1] = (bi)f.c(i1);
            }

            for (int j1 = 0; j1 < k1; j1++)
            {
                bi bi1 = abi[j1];
                bi1.e();
                bi1.g();
            }

        }
    }

    m m()
    {
        int j1 = 0;
        boolean flag1;
        if (f != null)
        {
            int k1 = f.size();
            bi abi[] = new bi[k1];
            for (int i1 = k1 - 1; i1 >= 0; i1--)
            {
                abi[i1] = (bi)f.c(i1);
            }

            boolean flag = false;
            do
            {
                flag1 = flag;
                if (j1 >= k1)
                {
                    break;
                }
                bi bi1 = abi[j1];
                if (bi1.f)
                {
                    flag = true;
                } else
                {
                    bi1.h();
                    f.remove(bi1.d);
                }
                j1++;
            } while (true);
        } else
        {
            flag1 = false;
        }
        if (flag1)
        {
            return f;
        } else
        {
            return null;
        }
    }
}
