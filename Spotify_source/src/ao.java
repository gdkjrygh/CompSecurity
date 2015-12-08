// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public final class ao extends am
{

    final ht a = new ht();
    final ht b = new ht();
    final String c;
    boolean d;
    boolean e;
    z f;
    private boolean g;

    ao(String s, z z1, boolean flag)
    {
        c = s;
        f = z1;
        d = flag;
    }

    private ap c(int i, Bundle bundle, an an1)
    {
        ap ap1 = new ap(this, i, bundle, an1);
        ap1.c = an1.a(bundle);
        return ap1;
    }

    private ap d(int i, Bundle bundle, an an1)
    {
        g = true;
        bundle = c(i, bundle, an1);
        a(bundle);
        g = false;
        return bundle;
        bundle;
        g = false;
        throw bundle;
    }

    public final da a(int i, Bundle bundle, an an1)
    {
        if (g)
        {
            throw new IllegalStateException("Called while creating a loader");
        }
        ap ap1 = (ap)a.a(i);
        if (ap1 == null)
        {
            bundle = d(i, bundle, an1);
        } else
        {
            ap1.b = an1;
            bundle = ap1;
        }
        if (((ap) (bundle)).d && d)
        {
            bundle.b(((ap) (bundle)).f);
        }
        return ((ap) (bundle)).c;
    }

    public final void a(int i)
    {
        if (g)
        {
            throw new IllegalStateException("Called while creating a loader");
        }
        int j = a.e(i);
        if (j >= 0)
        {
            ap ap1 = (ap)a.d(j);
            a.b(j);
            ap1.c();
        }
        i = b.e(i);
        if (i >= 0)
        {
            ap ap2 = (ap)b.d(i);
            b.b(i);
            ap2.c();
        }
        if (f != null && !a())
        {
            f.d.h();
        }
    }

    final void a(ap ap1)
    {
        a.a(ap1.a, ap1);
        if (d)
        {
            ap1.a();
        }
    }

    public final void a(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        boolean flag = false;
        if (a.a() > 0)
        {
            printwriter.print(s);
            printwriter.println("Active Loaders:");
            String s1 = (new StringBuilder()).append(s).append("    ").toString();
            for (int i = 0; i < a.a(); i++)
            {
                ap ap1 = (ap)a.d(i);
                printwriter.print(s);
                printwriter.print("  #");
                printwriter.print(a.c(i));
                printwriter.print(": ");
                printwriter.println(ap1.toString());
                ap1.a(s1, filedescriptor, printwriter, as);
            }

        }
        if (b.a() > 0)
        {
            printwriter.print(s);
            printwriter.println("Inactive Loaders:");
            String s2 = (new StringBuilder()).append(s).append("    ").toString();
            for (int j = ((flag) ? 1 : 0); j < b.a(); j++)
            {
                ap ap2 = (ap)b.d(j);
                printwriter.print(s);
                printwriter.print("  #");
                printwriter.print(b.c(j));
                printwriter.print(": ");
                printwriter.println(ap2.toString());
                ap2.a(s2, filedescriptor, printwriter, as);
            }

        }
    }

    public final boolean a()
    {
        int j = a.a();
        int i = 0;
        boolean flag1 = false;
        while (i < j) 
        {
            ap ap1 = (ap)a.d(i);
            boolean flag;
            if (ap1.g && !ap1.e)
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

    public final da b(int i)
    {
        if (g)
        {
            throw new IllegalStateException("Called while creating a loader");
        }
        ap ap1 = (ap)a.a(i);
        if (ap1 != null)
        {
            if (ap1.l != null)
            {
                return ap1.l.c;
            } else
            {
                return ap1.c;
            }
        } else
        {
            return null;
        }
    }

    public final da b(int i, Bundle bundle, an an1)
    {
        ap ap1;
        if (g)
        {
            throw new IllegalStateException("Called while creating a loader");
        }
        ap1 = (ap)a.a(i);
        if (ap1 == null) goto _L2; else goto _L1
_L1:
        ap ap2 = (ap)b.a(i);
        if (ap2 == null) goto _L4; else goto _L3
_L3:
        if (!ap1.d) goto _L6; else goto _L5
_L5:
        ap2.e = false;
        ap2.c();
_L4:
        ap1.c.g = true;
        b.a(i, ap1);
_L2:
        return d(i, bundle, an1).c;
_L6:
        if (ap1.g)
        {
            break; /* Loop/switch isn't completed */
        }
        a.a(i, null);
        ap1.c();
        if (true) goto _L2; else goto _L7
_L7:
        if (ap1.g && ap1.c != null && ap1.k && !ap1.c.m())
        {
            ap1.d();
        }
        if (ap1.l != null)
        {
            ap1.l.c();
            ap1.l = null;
        }
        ap1.l = c(i, bundle, an1);
        return ap1.l.c;
    }

    public final void b()
    {
        if (d)
        {
            RuntimeException runtimeexception = new RuntimeException("here");
            runtimeexception.fillInStackTrace();
            Log.w("LoaderManager", (new StringBuilder("Called doStart when already started: ")).append(this).toString(), runtimeexception);
        } else
        {
            d = true;
            int i = a.a() - 1;
            while (i >= 0) 
            {
                ((ap)a.d(i)).a();
                i--;
            }
        }
    }

    public final void c()
    {
        if (!d)
        {
            RuntimeException runtimeexception = new RuntimeException("here");
            runtimeexception.fillInStackTrace();
            Log.w("LoaderManager", (new StringBuilder("Called doStop when not started: ")).append(this).toString(), runtimeexception);
            return;
        }
        for (int i = a.a() - 1; i >= 0; i--)
        {
            ((ap)a.d(i)).b();
        }

        d = false;
    }

    public final void d()
    {
        if (!d)
        {
            RuntimeException runtimeexception = new RuntimeException("here");
            runtimeexception.fillInStackTrace();
            Log.w("LoaderManager", (new StringBuilder("Called doRetain when not started: ")).append(this).toString(), runtimeexception);
        } else
        {
            e = true;
            d = false;
            int i = a.a() - 1;
            while (i >= 0) 
            {
                ap ap1 = (ap)a.d(i);
                ap1.h = true;
                ap1.i = ap1.g;
                ap1.g = false;
                ap1.b = null;
                i--;
            }
        }
    }

    final void e()
    {
        for (int i = a.a() - 1; i >= 0; i--)
        {
            ((ap)a.d(i)).j = true;
        }

    }

    final void f()
    {
        for (int i = a.a() - 1; i >= 0; i--)
        {
            ap ap1 = (ap)a.d(i);
            if (!ap1.g || !ap1.j)
            {
                continue;
            }
            ap1.j = false;
            if (ap1.d)
            {
                ap1.b(ap1.f);
            }
        }

    }

    public final void g()
    {
        if (!e)
        {
            for (int i = a.a() - 1; i >= 0; i--)
            {
                ((ap)a.d(i)).c();
            }

            a.b();
        }
        for (int j = b.a() - 1; j >= 0; j--)
        {
            ((ap)b.d(j)).c();
        }

        b.b();
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(128);
        stringbuilder.append("LoaderManager{");
        stringbuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringbuilder.append(" in ");
        he.a(f, stringbuilder);
        stringbuilder.append("}}");
        return stringbuilder.toString();
    }
}
