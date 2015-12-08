// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.support.v4.b.d;
import android.support.v4.b.m;
import android.support.v4.content.c;
import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

// Referenced classes of package android.support.v4.app:
//            u, x, v, FragmentActivity

final class w extends u
{

    static boolean a = false;
    final m b;
    final m c;
    final String d;
    FragmentActivity e;
    boolean f;
    boolean g;

    final void a(FragmentActivity fragmentactivity)
    {
        e = fragmentactivity;
    }

    public final void a(String s, PrintWriter printwriter)
    {
        boolean flag = false;
        if (b.a() > 0)
        {
            printwriter.print(s);
            printwriter.println("Active Loaders:");
            String s1 = (new StringBuilder()).append(s).append("    ").toString();
            for (int i = 0; i < b.a(); i++)
            {
                x x1 = (x)b.b(i);
                printwriter.print(s);
                printwriter.print("  #");
                printwriter.print(b.a(i));
                printwriter.print(": ");
                printwriter.println(x1.toString());
                x1.a(s1, printwriter);
            }

        }
        if (c.a() > 0)
        {
            printwriter.print(s);
            printwriter.println("Inactive Loaders:");
            String s2 = (new StringBuilder()).append(s).append("    ").toString();
            for (int j = ((flag) ? 1 : 0); j < c.a(); j++)
            {
                x x2 = (x)c.b(j);
                printwriter.print(s);
                printwriter.print("  #");
                printwriter.print(c.a(j));
                printwriter.print(": ");
                printwriter.println(x2.toString());
                x2.a(s2, printwriter);
            }

        }
    }

    public final boolean a()
    {
        int j = b.a();
        int i = 0;
        boolean flag1 = false;
        while (i < j) 
        {
            x x1 = (x)b.b(i);
            boolean flag;
            if (x1.h && !x1.f)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            flag1 |= flag;
            i++;
        }
        return flag1;
    }

    final void b()
    {
        if (a)
        {
            Log.v("LoaderManager", (new StringBuilder("Starting in ")).append(this).toString());
        }
        if (f)
        {
            RuntimeException runtimeexception = new RuntimeException("here");
            runtimeexception.fillInStackTrace();
            Log.w("LoaderManager", (new StringBuilder("Called doStart when already started: ")).append(this).toString(), runtimeexception);
        } else
        {
            f = true;
            int i = b.a() - 1;
            while (i >= 0) 
            {
                x x1 = (x)b.b(i);
                if (x1.i && x1.j)
                {
                    x1.h = true;
                } else
                if (!x1.h)
                {
                    x1.h = true;
                    if (a)
                    {
                        Log.v("LoaderManager", (new StringBuilder("  Starting: ")).append(x1).toString());
                    }
                    if (x1.d == null && x1.c != null)
                    {
                        v v1 = x1.c;
                        int j = x1.a;
                        android.os.Bundle bundle = x1.b;
                        x1.d = v1.a();
                    }
                    if (x1.d != null)
                    {
                        if (x1.d.getClass().isMemberClass() && !Modifier.isStatic(x1.d.getClass().getModifiers()))
                        {
                            throw new IllegalArgumentException((new StringBuilder("Object returned from onCreateLoader must not be a non-static inner member class: ")).append(x1.d).toString());
                        }
                        if (!x1.m)
                        {
                            x1.d.a(x1.a, x1);
                            x1.m = true;
                        }
                        x1.d.a();
                    }
                }
                i--;
            }
        }
    }

    final void c()
    {
        if (a)
        {
            Log.v("LoaderManager", (new StringBuilder("Stopping in ")).append(this).toString());
        }
        if (!f)
        {
            RuntimeException runtimeexception = new RuntimeException("here");
            runtimeexception.fillInStackTrace();
            Log.w("LoaderManager", (new StringBuilder("Called doStop when not started: ")).append(this).toString(), runtimeexception);
            return;
        }
        for (int i = b.a() - 1; i >= 0; i--)
        {
            ((x)b.b(i)).a();
        }

        f = false;
    }

    final void d()
    {
        if (a)
        {
            Log.v("LoaderManager", (new StringBuilder("Retaining in ")).append(this).toString());
        }
        if (!f)
        {
            RuntimeException runtimeexception = new RuntimeException("here");
            runtimeexception.fillInStackTrace();
            Log.w("LoaderManager", (new StringBuilder("Called doRetain when not started: ")).append(this).toString(), runtimeexception);
        } else
        {
            g = true;
            f = false;
            int i = b.a() - 1;
            while (i >= 0) 
            {
                x x1 = (x)b.b(i);
                if (a)
                {
                    Log.v("LoaderManager", (new StringBuilder("  Retaining: ")).append(x1).toString());
                }
                x1.i = true;
                x1.j = x1.h;
                x1.h = false;
                x1.c = null;
                i--;
            }
        }
    }

    final void e()
    {
        if (g)
        {
            if (a)
            {
                Log.v("LoaderManager", (new StringBuilder("Finished Retaining in ")).append(this).toString());
            }
            g = false;
            for (int i = b.a() - 1; i >= 0; i--)
            {
                x x1 = (x)b.b(i);
                if (x1.i)
                {
                    if (a)
                    {
                        Log.v("LoaderManager", (new StringBuilder("  Finished Retaining: ")).append(x1).toString());
                    }
                    x1.i = false;
                    if (x1.h != x1.j && !x1.h)
                    {
                        x1.a();
                    }
                }
                if (x1.h && x1.e && !x1.k)
                {
                    x1.a(x1.d, x1.g);
                }
            }

        }
    }

    final void f()
    {
        for (int i = b.a() - 1; i >= 0; i--)
        {
            ((x)b.b(i)).k = true;
        }

    }

    final void g()
    {
        for (int i = b.a() - 1; i >= 0; i--)
        {
            x x1 = (x)b.b(i);
            if (!x1.h || !x1.k)
            {
                continue;
            }
            x1.k = false;
            if (x1.e)
            {
                x1.a(x1.d, x1.g);
            }
        }

    }

    final void h()
    {
        if (!g)
        {
            if (a)
            {
                Log.v("LoaderManager", (new StringBuilder("Destroying Active in ")).append(this).toString());
            }
            for (int i = b.a() - 1; i >= 0; i--)
            {
                ((x)b.b(i)).b();
            }

            b.b();
        }
        if (a)
        {
            Log.v("LoaderManager", (new StringBuilder("Destroying Inactive in ")).append(this).toString());
        }
        for (int j = c.a() - 1; j >= 0; j--)
        {
            ((x)c.b(j)).b();
        }

        c.b();
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(128);
        stringbuilder.append("LoaderManager{");
        stringbuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringbuilder.append(" in ");
        android.support.v4.b.d.a(e, stringbuilder);
        stringbuilder.append("}}");
        return stringbuilder.toString();
    }

}
