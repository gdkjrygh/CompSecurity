// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.support.v4.f.d;
import android.support.v4.f.n;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;

// Referenced classes of package android.support.v4.app:
//            bg, bj, ai

class bi extends bg
{

    static boolean a = false;
    final n b = new n();
    final n c = new n();
    final String d;
    boolean e;
    boolean f;
    private ai g;

    bi(String s, ai ai, boolean flag)
    {
        d = s;
        g = ai;
        e = flag;
    }

    static ai a(bi bi1)
    {
        return bi1.g;
    }

    void a(ai ai)
    {
        g = ai;
    }

    public void a(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        boolean flag = false;
        if (b.b() > 0)
        {
            printwriter.print(s);
            printwriter.println("Active Loaders:");
            String s1 = (new StringBuilder()).append(s).append("    ").toString();
            for (int i = 0; i < b.b(); i++)
            {
                bj bj1 = (bj)b.b(i);
                printwriter.print(s);
                printwriter.print("  #");
                printwriter.print(b.a(i));
                printwriter.print(": ");
                printwriter.println(bj1.toString());
                bj1.a(s1, filedescriptor, printwriter, as);
            }

        }
        if (c.b() > 0)
        {
            printwriter.print(s);
            printwriter.println("Inactive Loaders:");
            String s2 = (new StringBuilder()).append(s).append("    ").toString();
            for (int j = ((flag) ? 1 : 0); j < c.b(); j++)
            {
                bj bj2 = (bj)c.b(j);
                printwriter.print(s);
                printwriter.print("  #");
                printwriter.print(c.a(j));
                printwriter.print(": ");
                printwriter.println(bj2.toString());
                bj2.a(s2, filedescriptor, printwriter, as);
            }

        }
    }

    public boolean a()
    {
        int j = b.b();
        int i = 0;
        boolean flag1 = false;
        while (i < j) 
        {
            bj bj1 = (bj)b.b(i);
            boolean flag;
            if (bj1.h && !bj1.f)
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

    void b()
    {
        if (a)
        {
            Log.v("LoaderManager", (new StringBuilder()).append("Starting in ").append(this).toString());
        }
        if (e)
        {
            RuntimeException runtimeexception = new RuntimeException("here");
            runtimeexception.fillInStackTrace();
            Log.w("LoaderManager", (new StringBuilder()).append("Called doStart when already started: ").append(this).toString(), runtimeexception);
        } else
        {
            e = true;
            int i = b.b() - 1;
            while (i >= 0) 
            {
                ((bj)b.b(i)).a();
                i--;
            }
        }
    }

    void c()
    {
        if (a)
        {
            Log.v("LoaderManager", (new StringBuilder()).append("Stopping in ").append(this).toString());
        }
        if (!e)
        {
            RuntimeException runtimeexception = new RuntimeException("here");
            runtimeexception.fillInStackTrace();
            Log.w("LoaderManager", (new StringBuilder()).append("Called doStop when not started: ").append(this).toString(), runtimeexception);
            return;
        }
        for (int i = b.b() - 1; i >= 0; i--)
        {
            ((bj)b.b(i)).e();
        }

        e = false;
    }

    void d()
    {
        if (a)
        {
            Log.v("LoaderManager", (new StringBuilder()).append("Retaining in ").append(this).toString());
        }
        if (!e)
        {
            RuntimeException runtimeexception = new RuntimeException("here");
            runtimeexception.fillInStackTrace();
            Log.w("LoaderManager", (new StringBuilder()).append("Called doRetain when not started: ").append(this).toString(), runtimeexception);
        } else
        {
            f = true;
            e = false;
            int i = b.b() - 1;
            while (i >= 0) 
            {
                ((bj)b.b(i)).b();
                i--;
            }
        }
    }

    void e()
    {
        if (f)
        {
            if (a)
            {
                Log.v("LoaderManager", (new StringBuilder()).append("Finished Retaining in ").append(this).toString());
            }
            f = false;
            for (int i = b.b() - 1; i >= 0; i--)
            {
                ((bj)b.b(i)).c();
            }

        }
    }

    void f()
    {
        for (int i = b.b() - 1; i >= 0; i--)
        {
            ((bj)b.b(i)).k = true;
        }

    }

    void g()
    {
        for (int i = b.b() - 1; i >= 0; i--)
        {
            ((bj)b.b(i)).d();
        }

    }

    void h()
    {
        if (!f)
        {
            if (a)
            {
                Log.v("LoaderManager", (new StringBuilder()).append("Destroying Active in ").append(this).toString());
            }
            for (int i = b.b() - 1; i >= 0; i--)
            {
                ((bj)b.b(i)).f();
            }

            b.c();
        }
        if (a)
        {
            Log.v("LoaderManager", (new StringBuilder()).append("Destroying Inactive in ").append(this).toString());
        }
        for (int j = c.b() - 1; j >= 0; j--)
        {
            ((bj)c.b(j)).f();
        }

        c.c();
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(128);
        stringbuilder.append("LoaderManager{");
        stringbuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringbuilder.append(" in ");
        android.support.v4.f.d.a(g, stringbuilder);
        stringbuilder.append("}}");
        return stringbuilder.toString();
    }

}
