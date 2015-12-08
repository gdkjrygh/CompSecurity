// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public final class cb extends bz
{

    public static boolean a = false;
    final ka b = new ka();
    final ka c = new ka();
    final String d;
    boolean e;
    boolean f;
    ax g;
    private boolean h;

    cb(String s, ax ax1, boolean flag)
    {
        d = s;
        g = ax1;
        e = flag;
    }

    static ax a(cb cb1)
    {
        return cb1.g;
    }

    private cc c(int i, Bundle bundle, ca ca1)
    {
        cc cc1 = new cc(this, i, bundle, ca1);
        cc1.c = ca1.a(i, bundle);
        return cc1;
    }

    private cc d(int i, Bundle bundle, ca ca1)
    {
        h = true;
        bundle = c(i, bundle, ca1);
        a(bundle);
        h = false;
        return bundle;
        bundle;
        h = false;
        throw bundle;
    }

    public final ei a(int i, Bundle bundle, ca ca1)
    {
        if (h)
        {
            throw new IllegalStateException("Called while creating a loader");
        }
        Object obj = b;
        int j = jm.a(((ka) (obj)).c, ((ka) (obj)).e, i);
        if (j < 0 || ((ka) (obj)).d[j] == ka.a)
        {
            obj = null;
        } else
        {
            obj = ((ka) (obj)).d[j];
        }
        obj = (cc)obj;
        if (a)
        {
            (new StringBuilder("initLoader in ")).append(this).append(": args=").append(bundle);
        }
        if (obj == null)
        {
            ca1 = d(i, bundle, ca1);
            bundle = ca1;
            if (a)
            {
                (new StringBuilder("  Created new loader ")).append(ca1);
                bundle = ca1;
            }
        } else
        {
            if (a)
            {
                (new StringBuilder("  Re-using existing loader ")).append(obj);
            }
            obj.b = ca1;
            bundle = ((Bundle) (obj));
        }
        if (((cc) (bundle)).d && e)
        {
            bundle.b(((cc) (bundle)).c, ((cc) (bundle)).f);
        }
        return ((cc) (bundle)).c;
    }

    public final void a(int i)
    {
        if (h)
        {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (a)
        {
            (new StringBuilder("destroyLoader in ")).append(this).append(" of ").append(i);
        }
        int j = b.d(i);
        if (j >= 0)
        {
            cc cc1 = (cc)b.c(j);
            b.a(j);
            cc1.c();
        }
        i = c.d(i);
        if (i >= 0)
        {
            cc cc2 = (cc)c.c(i);
            c.a(i);
            cc2.c();
        }
        if (g != null && !a())
        {
            g.d.h();
        }
    }

    final void a(cc cc1)
    {
        b.a(cc1.a, cc1);
        if (e)
        {
            cc1.a();
        }
    }

    public final void a(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        boolean flag = false;
        if (b.a() > 0)
        {
            printwriter.print(s);
            printwriter.println("Active Loaders:");
            String s1 = (new StringBuilder()).append(s).append("    ").toString();
            for (int i = 0; i < b.a(); i++)
            {
                cc cc1 = (cc)b.c(i);
                printwriter.print(s);
                printwriter.print("  #");
                printwriter.print(b.b(i));
                printwriter.print(": ");
                printwriter.println(cc1.toString());
                cc1.a(s1, filedescriptor, printwriter, as);
            }

        }
        if (c.a() > 0)
        {
            printwriter.print(s);
            printwriter.println("Inactive Loaders:");
            String s2 = (new StringBuilder()).append(s).append("    ").toString();
            for (int j = ((flag) ? 1 : 0); j < c.a(); j++)
            {
                cc cc2 = (cc)c.c(j);
                printwriter.print(s);
                printwriter.print("  #");
                printwriter.print(c.b(j));
                printwriter.print(": ");
                printwriter.println(cc2.toString());
                cc2.a(s2, filedescriptor, printwriter, as);
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
            cc cc1 = (cc)b.c(i);
            boolean flag;
            if (cc1.g && !cc1.e)
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

    public final ei b(int i)
    {
        cc cc1;
label0:
        {
            Object obj1 = null;
            if (h)
            {
                throw new IllegalStateException("Called while creating a loader");
            }
            Object obj = b;
            i = jm.a(((ka) (obj)).c, ((ka) (obj)).e, i);
            if (i < 0 || ((ka) (obj)).d[i] == ka.a)
            {
                obj = null;
            } else
            {
                obj = ((ka) (obj)).d[i];
            }
            cc1 = (cc)obj;
            obj = obj1;
            if (cc1 != null)
            {
                if (cc1.l == null)
                {
                    break label0;
                }
                obj = cc1.l.c;
            }
            return ((ei) (obj));
        }
        return cc1.c;
    }

    public final ei b(int i, Bundle bundle, ca ca1)
    {
        Object obj;
        cc cc1;
        int j;
        if (h)
        {
            throw new IllegalStateException("Called while creating a loader");
        }
        obj = b;
        j = jm.a(((ka) (obj)).c, ((ka) (obj)).e, i);
        if (j < 0 || ((ka) (obj)).d[j] == ka.a)
        {
            obj = null;
        } else
        {
            obj = ((ka) (obj)).d[j];
        }
        cc1 = (cc)obj;
        if (a)
        {
            (new StringBuilder("restartLoader in ")).append(this).append(": args=").append(bundle);
        }
        if (cc1 == null) goto _L2; else goto _L1
_L1:
        obj = c;
        j = jm.a(((ka) (obj)).c, ((ka) (obj)).e, i);
        if (j < 0 || ((ka) (obj)).d[j] == ka.a)
        {
            obj = null;
        } else
        {
            obj = ((ka) (obj)).d[j];
        }
        obj = (cc)obj;
        if (obj == null) goto _L4; else goto _L3
_L3:
        if (!cc1.d) goto _L6; else goto _L5
_L5:
        if (a)
        {
            (new StringBuilder("  Removing last inactive loader: ")).append(cc1);
        }
        obj.e = false;
        ((cc) (obj)).c();
_L9:
        cc1.c.k();
        c.a(i, cc1);
_L2:
        return d(i, bundle, ca1).c;
_L6:
        if (cc1.g)
        {
            break; /* Loop/switch isn't completed */
        }
        b.a(i, null);
        cc1.c();
        if (true) goto _L2; else goto _L7
_L7:
        if (a)
        {
            (new StringBuilder("  Canceling: ")).append(cc1);
        }
        if (cc1.g && cc1.c != null && cc1.k && !cc1.c.g())
        {
            cc1.d();
        }
        if (cc1.l != null)
        {
            if (a)
            {
                (new StringBuilder("  Removing pending loader: ")).append(cc1.l);
            }
            cc1.l.c();
            cc1.l = null;
        }
        cc1.l = c(i, bundle, ca1);
        return cc1.l.c;
_L4:
        if (a)
        {
            (new StringBuilder("  Making last loader inactive: ")).append(cc1);
        }
        if (true) goto _L9; else goto _L8
_L8:
    }

    final void b()
    {
        if (a)
        {
            (new StringBuilder("Starting in ")).append(this);
        }
        if (e)
        {
            RuntimeException runtimeexception = new RuntimeException("here");
            runtimeexception.fillInStackTrace();
            Log.w("LoaderManager", (new StringBuilder("Called doStart when already started: ")).append(this).toString(), runtimeexception);
        } else
        {
            e = true;
            int i = b.a() - 1;
            while (i >= 0) 
            {
                ((cc)b.c(i)).a();
                i--;
            }
        }
    }

    final void c()
    {
        if (a)
        {
            (new StringBuilder("Stopping in ")).append(this);
        }
        if (!e)
        {
            RuntimeException runtimeexception = new RuntimeException("here");
            runtimeexception.fillInStackTrace();
            Log.w("LoaderManager", (new StringBuilder("Called doStop when not started: ")).append(this).toString(), runtimeexception);
            return;
        }
        for (int i = b.a() - 1; i >= 0; i--)
        {
            ((cc)b.c(i)).b();
        }

        e = false;
    }

    final void d()
    {
        if (a)
        {
            (new StringBuilder("Retaining in ")).append(this);
        }
        if (!e)
        {
            RuntimeException runtimeexception = new RuntimeException("here");
            runtimeexception.fillInStackTrace();
            Log.w("LoaderManager", (new StringBuilder("Called doRetain when not started: ")).append(this).toString(), runtimeexception);
        } else
        {
            f = true;
            e = false;
            int i = b.a() - 1;
            while (i >= 0) 
            {
                cc cc1 = (cc)b.c(i);
                if (a)
                {
                    (new StringBuilder("  Retaining: ")).append(cc1);
                }
                cc1.h = true;
                cc1.i = cc1.g;
                cc1.g = false;
                cc1.b = null;
                i--;
            }
        }
    }

    final void e()
    {
        for (int i = b.a() - 1; i >= 0; i--)
        {
            ((cc)b.c(i)).j = true;
        }

    }

    final void f()
    {
        for (int i = b.a() - 1; i >= 0; i--)
        {
            cc cc1 = (cc)b.c(i);
            if (!cc1.g || !cc1.j)
            {
                continue;
            }
            cc1.j = false;
            if (cc1.d)
            {
                cc1.b(cc1.c, cc1.f);
            }
        }

    }

    final void g()
    {
        if (!f)
        {
            if (a)
            {
                (new StringBuilder("Destroying Active in ")).append(this);
            }
            for (int i = b.a() - 1; i >= 0; i--)
            {
                ((cc)b.c(i)).c();
            }

            b.b();
        }
        if (a)
        {
            (new StringBuilder("Destroying Inactive in ")).append(this);
        }
        for (int j = c.a() - 1; j >= 0; j--)
        {
            ((cc)c.c(j)).c();
        }

        c.b();
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(128);
        stringbuilder.append("LoaderManager{");
        stringbuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringbuilder.append(" in ");
        b.a(g, stringbuilder);
        stringbuilder.append("}}");
        return stringbuilder.toString();
    }

}
