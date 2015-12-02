// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Bundle;
import android.support.v4.a.c;
import android.support.v4.c.a;
import android.support.v4.c.d;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;

// Referenced classes of package android.support.v4.app:
//            ag, aj, ah, p

class ai extends ag
{

    static boolean a = false;
    final d b = new d();
    final d c = new d();
    final String d;
    p e;
    boolean f;
    boolean g;
    boolean h;

    ai(String s, p p, boolean flag)
    {
        d = s;
        e = p;
        f = flag;
    }

    private aj c(int i, Bundle bundle, ah ah1)
    {
        aj aj1 = new aj(this, i, bundle, ah1);
        aj1.d = ah1.a(i, bundle);
        return aj1;
    }

    private aj d(int i, Bundle bundle, ah ah1)
    {
        h = true;
        bundle = c(i, bundle, ah1);
        a(bundle);
        h = false;
        return bundle;
        bundle;
        h = false;
        throw bundle;
    }

    public c a(int i)
    {
        if (h)
        {
            throw new IllegalStateException("Called while creating a loader");
        }
        aj aj1 = (aj)b.a(i);
        if (aj1 != null)
        {
            if (aj1.n != null)
            {
                return aj1.n.d;
            } else
            {
                return aj1.d;
            }
        } else
        {
            return null;
        }
    }

    public c a(int i, Bundle bundle, ah ah1)
    {
        if (h)
        {
            throw new IllegalStateException("Called while creating a loader");
        }
        aj aj1 = (aj)b.a(i);
        if (a)
        {
            Log.v("LoaderManager", (new StringBuilder()).append("initLoader in ").append(this).append(": args=").append(bundle).toString());
        }
        if (aj1 == null)
        {
            ah1 = d(i, bundle, ah1);
            bundle = ah1;
            if (a)
            {
                Log.v("LoaderManager", (new StringBuilder()).append("  Created new loader ").append(ah1).toString());
                bundle = ah1;
            }
        } else
        {
            if (a)
            {
                Log.v("LoaderManager", (new StringBuilder()).append("  Re-using existing loader ").append(aj1).toString());
            }
            aj1.c = ah1;
            bundle = aj1;
        }
        if (((aj) (bundle)).e && f)
        {
            bundle.b(((aj) (bundle)).d, ((aj) (bundle)).g);
        }
        return ((aj) (bundle)).d;
    }

    void a(aj aj1)
    {
        b.b(aj1.a, aj1);
        if (f)
        {
            aj1.a();
        }
    }

    void a(p p)
    {
        e = p;
    }

    public void a(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        boolean flag = false;
        if (b.a() > 0)
        {
            printwriter.print(s);
            printwriter.println("Active Loaders:");
            String s1 = (new StringBuilder()).append(s).append("    ").toString();
            for (int i = 0; i < b.a(); i++)
            {
                aj aj1 = (aj)b.e(i);
                printwriter.print(s);
                printwriter.print("  #");
                printwriter.print(b.d(i));
                printwriter.print(": ");
                printwriter.println(aj1.toString());
                aj1.a(s1, filedescriptor, printwriter, as);
            }

        }
        if (c.a() > 0)
        {
            printwriter.print(s);
            printwriter.println("Inactive Loaders:");
            String s2 = (new StringBuilder()).append(s).append("    ").toString();
            for (int j = ((flag) ? 1 : 0); j < c.a(); j++)
            {
                aj aj2 = (aj)c.e(j);
                printwriter.print(s);
                printwriter.print("  #");
                printwriter.print(c.d(j));
                printwriter.print(": ");
                printwriter.println(aj2.toString());
                aj2.a(s2, filedescriptor, printwriter, as);
            }

        }
    }

    public boolean a()
    {
        int j = b.a();
        int i = 0;
        boolean flag1 = false;
        while (i < j) 
        {
            aj aj1 = (aj)b.e(i);
            boolean flag;
            if (aj1.h && !aj1.f)
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

    public c b(int i, Bundle bundle, ah ah1)
    {
        if (h)
        {
            throw new IllegalStateException("Called while creating a loader");
        }
        aj aj1 = (aj)b.a(i);
        if (a)
        {
            Log.v("LoaderManager", (new StringBuilder()).append("restartLoader in ").append(this).append(": args=").append(bundle).toString());
        }
        if (aj1 != null)
        {
            aj aj2 = (aj)c.a(i);
            if (aj2 != null)
            {
                if (aj1.e)
                {
                    if (a)
                    {
                        Log.v("LoaderManager", (new StringBuilder()).append("  Removing last inactive loader: ").append(aj1).toString());
                    }
                    aj2.f = false;
                    aj2.f();
                    aj1.d.m();
                    c.b(i, aj1);
                } else
                if (!aj1.h)
                {
                    if (a)
                    {
                        Log.v("LoaderManager", "  Current loader is stopped; replacing");
                    }
                    b.b(i, null);
                    aj1.f();
                } else
                {
                    if (aj1.n != null)
                    {
                        if (a)
                        {
                            Log.v("LoaderManager", (new StringBuilder()).append("  Removing pending loader: ").append(aj1.n).toString());
                        }
                        aj1.n.f();
                        aj1.n = null;
                    }
                    if (a)
                    {
                        Log.v("LoaderManager", "  Enqueuing as new pending loader");
                    }
                    aj1.n = c(i, bundle, ah1);
                    return aj1.n.d;
                }
            } else
            {
                if (a)
                {
                    Log.v("LoaderManager", (new StringBuilder()).append("  Making last loader inactive: ").append(aj1).toString());
                }
                aj1.d.m();
                c.b(i, aj1);
            }
        }
        return d(i, bundle, ah1).d;
    }

    void b()
    {
        if (a)
        {
            Log.v("LoaderManager", (new StringBuilder()).append("Starting in ").append(this).toString());
        }
        if (f)
        {
            RuntimeException runtimeexception = new RuntimeException("here");
            runtimeexception.fillInStackTrace();
            Log.w("LoaderManager", (new StringBuilder()).append("Called doStart when already started: ").append(this).toString(), runtimeexception);
        } else
        {
            f = true;
            int i = b.a() - 1;
            while (i >= 0) 
            {
                ((aj)b.e(i)).a();
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
        if (!f)
        {
            RuntimeException runtimeexception = new RuntimeException("here");
            runtimeexception.fillInStackTrace();
            Log.w("LoaderManager", (new StringBuilder()).append("Called doStop when not started: ").append(this).toString(), runtimeexception);
            return;
        }
        for (int i = b.a() - 1; i >= 0; i--)
        {
            ((aj)b.e(i)).e();
        }

        f = false;
    }

    void d()
    {
        if (a)
        {
            Log.v("LoaderManager", (new StringBuilder()).append("Retaining in ").append(this).toString());
        }
        if (!f)
        {
            RuntimeException runtimeexception = new RuntimeException("here");
            runtimeexception.fillInStackTrace();
            Log.w("LoaderManager", (new StringBuilder()).append("Called doRetain when not started: ").append(this).toString(), runtimeexception);
        } else
        {
            g = true;
            f = false;
            int i = b.a() - 1;
            while (i >= 0) 
            {
                ((aj)b.e(i)).b();
                i--;
            }
        }
    }

    void e()
    {
        if (g)
        {
            if (a)
            {
                Log.v("LoaderManager", (new StringBuilder()).append("Finished Retaining in ").append(this).toString());
            }
            g = false;
            for (int i = b.a() - 1; i >= 0; i--)
            {
                ((aj)b.e(i)).c();
            }

        }
    }

    void f()
    {
        for (int i = b.a() - 1; i >= 0; i--)
        {
            ((aj)b.e(i)).k = true;
        }

    }

    void g()
    {
        for (int i = b.a() - 1; i >= 0; i--)
        {
            ((aj)b.e(i)).d();
        }

    }

    void h()
    {
        if (!g)
        {
            if (a)
            {
                Log.v("LoaderManager", (new StringBuilder()).append("Destroying Active in ").append(this).toString());
            }
            for (int i = b.a() - 1; i >= 0; i--)
            {
                ((aj)b.e(i)).f();
            }

        }
        if (a)
        {
            Log.v("LoaderManager", (new StringBuilder()).append("Destroying Inactive in ").append(this).toString());
        }
        for (int j = c.a() - 1; j >= 0; j--)
        {
            ((aj)c.e(j)).f();
        }

        c.b();
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(128);
        stringbuilder.append("LoaderManager{");
        stringbuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringbuilder.append(" in ");
        android.support.v4.c.a.a(e, stringbuilder);
        stringbuilder.append("}}");
        return stringbuilder.toString();
    }

}
