// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.support.v4.content.p;
import android.support.v4.d.d;
import android.support.v4.d.n;
import java.io.FileDescriptor;
import java.io.PrintWriter;

// Referenced classes of package android.support.v4.app:
//            am, ap, an, q, 
//            s

final class ao extends am
{

    static boolean a = false;
    final n b = new n();
    final n c = new n();
    final String d;
    boolean e;
    boolean f;
    boolean g;
    q h;

    ao(String s1, q q1, boolean flag)
    {
        d = s1;
        h = q1;
        e = flag;
    }

    static q a(ao ao1)
    {
        return ao1.h;
    }

    private ap b(an an1)
    {
        ap ap1;
        g = true;
        ap1 = new ap(this, an1);
        ap1.d = an1.a();
        a(ap1);
        g = false;
        return ap1;
        an1;
        g = false;
        throw an1;
    }

    public final p a(an an1)
    {
        if (g)
        {
            throw new IllegalStateException("Called while creating a loader");
        }
        ap ap1 = (ap)b.a(0);
        if (a)
        {
            (new StringBuilder("initLoader in ")).append(this).append(": args=").append(null);
        }
        if (ap1 == null)
        {
            ap1 = b(an1);
            an1 = ap1;
            if (a)
            {
                (new StringBuilder("  Created new loader ")).append(ap1);
                an1 = ap1;
            }
        } else
        {
            if (a)
            {
                (new StringBuilder("  Re-using existing loader ")).append(ap1);
            }
            ap1.c = an1;
            an1 = ap1;
        }
        if (((ap) (an1)).e && e)
        {
            an1.b(((ap) (an1)).d, ((ap) (an1)).g);
        }
        return ((ap) (an1)).d;
    }

    public final void a()
    {
        if (g)
        {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (a)
        {
            (new StringBuilder("destroyLoader in ")).append(this).append(" of 0");
        }
        int i = b.b();
        if (i >= 0)
        {
            ap ap1 = (ap)b.d(i);
            b.b(i);
            ap1.c();
        }
        i = c.b();
        if (i >= 0)
        {
            ap ap2 = (ap)c.d(i);
            c.b(i);
            ap2.c();
        }
        if (h != null && !b())
        {
            h.f.d();
        }
    }

    final void a(ap ap1)
    {
        b.a(ap1.a, ap1);
        if (e)
        {
            ap1.a();
        }
    }

    public final void a(String s1, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        boolean flag = false;
        if (b.a() > 0)
        {
            printwriter.print(s1);
            printwriter.println("Active Loaders:");
            String s2 = (new StringBuilder()).append(s1).append("    ").toString();
            for (int i = 0; i < b.a(); i++)
            {
                ap ap1 = (ap)b.d(i);
                printwriter.print(s1);
                printwriter.print("  #");
                printwriter.print(b.c(i));
                printwriter.print(": ");
                printwriter.println(ap1.toString());
                ap1.a(s2, filedescriptor, printwriter, as);
            }

        }
        if (c.a() > 0)
        {
            printwriter.print(s1);
            printwriter.println("Inactive Loaders:");
            String s3 = (new StringBuilder()).append(s1).append("    ").toString();
            for (int j = ((flag) ? 1 : 0); j < c.a(); j++)
            {
                ap ap2 = (ap)c.d(j);
                printwriter.print(s1);
                printwriter.print("  #");
                printwriter.print(c.c(j));
                printwriter.print(": ");
                printwriter.println(ap2.toString());
                ap2.a(s3, filedescriptor, printwriter, as);
            }

        }
    }

    public final boolean b()
    {
        int j = b.a();
        int i = 0;
        boolean flag1 = false;
        while (i < j) 
        {
            ap ap1 = (ap)b.d(i);
            boolean flag;
            if (ap1.h && !ap1.f)
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

    final void c()
    {
        if (a)
        {
            (new StringBuilder("Starting in ")).append(this);
        }
        if (e)
        {
            (new RuntimeException("here")).fillInStackTrace();
            (new StringBuilder("Called doStart when already started: ")).append(this);
        } else
        {
            e = true;
            int i = b.a() - 1;
            while (i >= 0) 
            {
                ((ap)b.d(i)).a();
                i--;
            }
        }
    }

    final void d()
    {
        if (a)
        {
            (new StringBuilder("Stopping in ")).append(this);
        }
        if (!e)
        {
            (new RuntimeException("here")).fillInStackTrace();
            (new StringBuilder("Called doStop when not started: ")).append(this);
            return;
        }
        for (int i = b.a() - 1; i >= 0; i--)
        {
            ((ap)b.d(i)).b();
        }

        e = false;
    }

    final void e()
    {
        if (a)
        {
            (new StringBuilder("Retaining in ")).append(this);
        }
        if (!e)
        {
            (new RuntimeException("here")).fillInStackTrace();
            (new StringBuilder("Called doRetain when not started: ")).append(this);
        } else
        {
            f = true;
            e = false;
            int i = b.a() - 1;
            while (i >= 0) 
            {
                ap ap1 = (ap)b.d(i);
                if (a)
                {
                    (new StringBuilder("  Retaining: ")).append(ap1);
                }
                ap1.i = true;
                ap1.j = ap1.h;
                ap1.h = false;
                ap1.c = null;
                i--;
            }
        }
    }

    final void f()
    {
        for (int i = b.a() - 1; i >= 0; i--)
        {
            ((ap)b.d(i)).k = true;
        }

    }

    final void g()
    {
        for (int i = b.a() - 1; i >= 0; i--)
        {
            ap ap1 = (ap)b.d(i);
            if (!ap1.h || !ap1.k)
            {
                continue;
            }
            ap1.k = false;
            if (ap1.e)
            {
                ap1.b(ap1.d, ap1.g);
            }
        }

    }

    final void h()
    {
        if (!f)
        {
            if (a)
            {
                (new StringBuilder("Destroying Active in ")).append(this);
            }
            for (int i = b.a() - 1; i >= 0; i--)
            {
                ((ap)b.d(i)).c();
            }

            b.c();
        }
        if (a)
        {
            (new StringBuilder("Destroying Inactive in ")).append(this);
        }
        for (int j = c.a() - 1; j >= 0; j--)
        {
            ((ap)c.d(j)).c();
        }

        c.c();
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(128);
        stringbuilder.append("LoaderManager{");
        stringbuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringbuilder.append(" in ");
        android.support.v4.d.d.a(h, stringbuilder);
        stringbuilder.append("}}");
        return stringbuilder.toString();
    }

}
