// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.v4.util.i;
import android.support.v4.util.j;
import android.view.LayoutInflater;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

// Referenced classes of package android.support.v4.app:
//            i, m, FragmentActivity, s, 
//            Fragment

public abstract class k extends android.support.v4.app.i
{

    private final Activity a;
    final Context b;
    final int c;
    final m d;
    private final Handler e;
    private i f;
    private s g;
    private boolean h;
    private boolean i;

    private k(Activity activity, Context context, Handler handler)
    {
        d = new m();
        a = activity;
        b = context;
        e = handler;
        c = 0;
    }

    k(FragmentActivity fragmentactivity)
    {
        this(((Activity) (fragmentactivity)), ((Context) (fragmentactivity)), fragmentactivity.mHandler);
    }

    final s a(String s1, boolean flag, boolean flag1)
    {
        if (f == null)
        {
            f = new i();
        }
        s s2 = (s)f.get(s1);
        if (s2 == null)
        {
            if (flag1)
            {
                s2 = new s(s1, this, flag);
                f.put(s1, s2);
            }
            return s2;
        } else
        {
            s2.a(this);
            return s2;
        }
    }

    public View a(int i1)
    {
        return null;
    }

    void a(Fragment fragment)
    {
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

    public void a(Fragment fragment, String as[], int i1)
    {
    }

    final void a(i i1)
    {
        f = i1;
    }

    final void a(String s1, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        printwriter.print(s1);
        printwriter.print("mLoadersStarted=");
        printwriter.println(i);
        if (g != null)
        {
            printwriter.print(s1);
            printwriter.print("Loader Manager ");
            printwriter.print(Integer.toHexString(System.identityHashCode(g)));
            printwriter.println(":");
            g.a((new StringBuilder()).append(s1).append("  ").toString(), filedescriptor, printwriter, as);
        }
    }

    public void a(String s1, PrintWriter printwriter, String as[])
    {
    }

    final void a(boolean flag)
    {
        while (g == null || !i) 
        {
            return;
        }
        i = false;
        if (flag)
        {
            g.e();
            return;
        } else
        {
            g.d();
            return;
        }
    }

    public boolean a()
    {
        return true;
    }

    public boolean a(String s1)
    {
        return false;
    }

    final void b(String s1)
    {
        if (f != null)
        {
            s s2 = (s)f.get(s1);
            if (s2 != null && !s2.f)
            {
                s2.h();
                f.remove(s1);
            }
        }
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
        return c;
    }

    public abstract Object g();

    final Activity h()
    {
        return a;
    }

    final Handler i()
    {
        return e;
    }

    final s j()
    {
        if (g != null)
        {
            return g;
        } else
        {
            h = true;
            g = a("(root)", i, true);
            return g;
        }
    }

    final void k()
    {
        if (i)
        {
            return;
        }
        i = true;
        if (g == null) goto _L2; else goto _L1
_L1:
        g.c();
_L4:
        h = true;
        return;
_L2:
        if (!h)
        {
            g = a("(root)", i, false);
            if (g != null && !g.e)
            {
                g.c();
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    final void l()
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

    final void m()
    {
        if (f != null)
        {
            int l1 = f.size();
            s as[] = new s[l1];
            for (int i1 = l1 - 1; i1 >= 0; i1--)
            {
                as[i1] = (s)f.c(i1);
            }

            for (int j1 = 0; j1 < l1; j1++)
            {
                s s1 = as[j1];
                if (s1.f)
                {
                    if (s.a)
                    {
                        (new StringBuilder("Finished Retaining in ")).append(s1);
                    }
                    s1.f = false;
                    for (int k1 = s1.b.a() - 1; k1 >= 0; k1--)
                    {
                        s.a a1 = (s.a)s1.b.f(k1);
                        if (a1.i)
                        {
                            if (s.a)
                            {
                                (new StringBuilder("  Finished Retaining: ")).append(a1);
                            }
                            a1.i = false;
                            if (a1.h != a1.j && !a1.h)
                            {
                                a1.b();
                            }
                        }
                        if (a1.h && a1.e && !a1.k)
                        {
                            a1.b(a1.d, a1.g);
                        }
                    }

                }
                s1.g();
            }

        }
    }

    final i n()
    {
        boolean flag1 = false;
        int j1 = 0;
        if (f != null)
        {
            int k1 = f.size();
            s as[] = new s[k1];
            for (int i1 = k1 - 1; i1 >= 0; i1--)
            {
                as[i1] = (s)f.c(i1);
            }

            flag1 = false;
            boolean flag = j1;
            j1 = ((flag1) ? 1 : 0);
            do
            {
                flag1 = flag;
                if (j1 >= k1)
                {
                    break;
                }
                s s1 = as[j1];
                if (s1.f)
                {
                    flag = true;
                } else
                {
                    s1.h();
                    f.remove(s1.d);
                }
                j1++;
            } while (true);
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
