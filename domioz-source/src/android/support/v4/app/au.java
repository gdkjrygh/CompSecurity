// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.support.v4.content.i;
import android.support.v4.e.d;
import android.support.v4.e.q;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;

// Referenced classes of package android.support.v4.app:
//            as, av, at, FragmentActivity, 
//            x

final class au extends as
{

    static boolean a = false;
    final q b = new q();
    final q c = new q();
    final String d;
    FragmentActivity e;
    boolean f;
    boolean g;
    boolean h;

    au(String s, FragmentActivity fragmentactivity, boolean flag)
    {
        d = s;
        e = fragmentactivity;
        f = flag;
    }

    private av c(int j, at at1)
    {
        av av1 = new av(this, j, at1);
        av1.d = at1.a(j);
        return av1;
    }

    private av d(int j, at at1)
    {
        h = true;
        at1 = c(j, at1);
        a(at1);
        h = false;
        return at1;
        at1;
        h = false;
        throw at1;
    }

    public final i a(int j, at at1)
    {
        if (h)
        {
            throw new IllegalStateException("Called while creating a loader");
        }
        av av1 = (av)b.a(j);
        if (a)
        {
            Log.v("LoaderManager", (new StringBuilder("initLoader in ")).append(this).append(": args=").append(null).toString());
        }
        if (av1 == null)
        {
            av1 = d(j, at1);
            at1 = av1;
            if (a)
            {
                Log.v("LoaderManager", (new StringBuilder("  Created new loader ")).append(av1).toString());
                at1 = av1;
            }
        } else
        {
            if (a)
            {
                Log.v("LoaderManager", (new StringBuilder("  Re-using existing loader ")).append(av1).toString());
            }
            av1.c = at1;
            at1 = av1;
        }
        if (((av) (at1)).e && f)
        {
            at1.b(((av) (at1)).d, ((av) (at1)).g);
        }
        return ((av) (at1)).d;
    }

    public final void a(int j)
    {
        if (h)
        {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (a)
        {
            Log.v("LoaderManager", (new StringBuilder("destroyLoader in ")).append(this).append(" of ").append(j).toString());
        }
        int k = b.f(j);
        if (k >= 0)
        {
            av av1 = (av)b.e(k);
            b.c(k);
            av1.c();
        }
        j = c.f(j);
        if (j >= 0)
        {
            av av2 = (av)c.e(j);
            c.c(j);
            av2.c();
        }
        if (e != null && !b())
        {
            e.mFragments.g();
        }
    }

    final void a(av av1)
    {
        b.a(av1.a, av1);
        if (f)
        {
            av1.a();
        }
    }

    public final void a(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as1[])
    {
        boolean flag = false;
        if (b.a() > 0)
        {
            printwriter.print(s);
            printwriter.println("Active Loaders:");
            String s1 = (new StringBuilder()).append(s).append("    ").toString();
            for (int j = 0; j < b.a(); j++)
            {
                av av1 = (av)b.e(j);
                printwriter.print(s);
                printwriter.print("  #");
                printwriter.print(b.d(j));
                printwriter.print(": ");
                printwriter.println(av1.toString());
                av1.a(s1, filedescriptor, printwriter, as1);
            }

        }
        if (c.a() > 0)
        {
            printwriter.print(s);
            printwriter.println("Inactive Loaders:");
            String s2 = (new StringBuilder()).append(s).append("    ").toString();
            for (int k = ((flag) ? 1 : 0); k < c.a(); k++)
            {
                av av2 = (av)c.e(k);
                printwriter.print(s);
                printwriter.print("  #");
                printwriter.print(c.d(k));
                printwriter.print(": ");
                printwriter.println(av2.toString());
                av2.a(s2, filedescriptor, printwriter, as1);
            }

        }
    }

    public final i b(int j)
    {
        if (h)
        {
            throw new IllegalStateException("Called while creating a loader");
        }
        av av1 = (av)b.a(j);
        if (av1 != null)
        {
            if (av1.n != null)
            {
                return av1.n.d;
            } else
            {
                return av1.d;
            }
        } else
        {
            return null;
        }
    }

    public final i b(int j, at at1)
    {
        av av1;
        if (h)
        {
            throw new IllegalStateException("Called while creating a loader");
        }
        av1 = (av)b.a(j);
        if (a)
        {
            Log.v("LoaderManager", (new StringBuilder("restartLoader in ")).append(this).append(": args=").append(null).toString());
        }
        if (av1 == null) goto _L2; else goto _L1
_L1:
        av av2 = (av)c.a(j);
        if (av2 == null) goto _L4; else goto _L3
_L3:
        if (!av1.e) goto _L6; else goto _L5
_L5:
        if (a)
        {
            Log.v("LoaderManager", (new StringBuilder("  Removing last inactive loader: ")).append(av1).toString());
        }
        av2.f = false;
        av2.c();
_L9:
        av1.d.h();
        c.a(j, av1);
_L2:
        return d(j, at1).d;
_L6:
        if (av1.h)
        {
            break; /* Loop/switch isn't completed */
        }
        if (a)
        {
            Log.v("LoaderManager", "  Current loader is stopped; replacing");
        }
        b.a(j, null);
        av1.c();
        if (true) goto _L2; else goto _L7
_L7:
        if (av1.n != null)
        {
            if (a)
            {
                Log.v("LoaderManager", (new StringBuilder("  Removing pending loader: ")).append(av1.n).toString());
            }
            av1.n.c();
            av1.n = null;
        }
        if (a)
        {
            Log.v("LoaderManager", "  Enqueuing as new pending loader");
        }
        av1.n = c(j, at1);
        return av1.n.d;
_L4:
        if (a)
        {
            Log.v("LoaderManager", (new StringBuilder("  Making last loader inactive: ")).append(av1).toString());
        }
        if (true) goto _L9; else goto _L8
_L8:
    }

    public final boolean b()
    {
        int k = b.a();
        int j = 0;
        boolean flag1 = false;
        while (j < k) 
        {
            av av1 = (av)b.e(j);
            boolean flag;
            if (av1.h && !av1.f)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            flag1 |= flag;
            j++;
        }
        return flag1;
    }

    final void c()
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
            int j = b.a() - 1;
            while (j >= 0) 
            {
                ((av)b.e(j)).a();
                j--;
            }
        }
    }

    final void d()
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
        for (int j = b.a() - 1; j >= 0; j--)
        {
            ((av)b.e(j)).b();
        }

        f = false;
    }

    final void e()
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
            int j = b.a() - 1;
            while (j >= 0) 
            {
                av av1 = (av)b.e(j);
                if (a)
                {
                    Log.v("LoaderManager", (new StringBuilder("  Retaining: ")).append(av1).toString());
                }
                av1.i = true;
                av1.j = av1.h;
                av1.h = false;
                av1.c = null;
                j--;
            }
        }
    }

    final void f()
    {
        for (int j = b.a() - 1; j >= 0; j--)
        {
            ((av)b.e(j)).k = true;
        }

    }

    final void g()
    {
        for (int j = b.a() - 1; j >= 0; j--)
        {
            av av1 = (av)b.e(j);
            if (!av1.h || !av1.k)
            {
                continue;
            }
            av1.k = false;
            if (av1.e)
            {
                av1.b(av1.d, av1.g);
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
            for (int j = b.a() - 1; j >= 0; j--)
            {
                ((av)b.e(j)).c();
            }

            b.b();
        }
        if (a)
        {
            Log.v("LoaderManager", (new StringBuilder("Destroying Inactive in ")).append(this).toString());
        }
        for (int k = c.a() - 1; k >= 0; k--)
        {
            ((av)c.e(k)).c();
        }

        c.b();
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(128);
        stringbuilder.append("LoaderManager{");
        stringbuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringbuilder.append(" in ");
        android.support.v4.e.d.a(e, stringbuilder);
        stringbuilder.append("}}");
        return stringbuilder.toString();
    }

}
