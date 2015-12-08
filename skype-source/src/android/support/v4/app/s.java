// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Bundle;
import android.support.v4.content.c;
import android.support.v4.util.j;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

// Referenced classes of package android.support.v4.app:
//            r, k, m

final class s extends r
{
    final class a
        implements android.support.v4.content.c.a, android.support.v4.content.c.b
    {

        final int a;
        final Bundle b = null;
        r.a c;
        c d;
        boolean e;
        boolean f;
        Object g;
        boolean h;
        boolean i;
        boolean j;
        boolean k;
        boolean l;
        boolean m;
        a n;
        final s o;

        final void a()
        {
            if (i && j)
            {
                h = true;
            } else
            if (!h)
            {
                h = true;
                if (s.a)
                {
                    (new StringBuilder("  Starting: ")).append(this);
                }
                if (d == null && c != null)
                {
                    d = c.a(a);
                }
                if (d != null)
                {
                    if (d.getClass().isMemberClass() && !Modifier.isStatic(d.getClass().getModifiers()))
                    {
                        throw new IllegalArgumentException((new StringBuilder("Object returned from onCreateLoader must not be a non-static inner member class: ")).append(d).toString());
                    }
                    if (!m)
                    {
                        d.a(a, this);
                        d.a(this);
                        m = true;
                    }
                    d.d();
                    return;
                }
            }
        }

        public final void a(c c1, Object obj)
        {
            if (s.a)
            {
                (new StringBuilder("onLoadComplete: ")).append(this);
            }
            break MISSING_BLOCK_LABEL_20;
            if (!l && o.b.a(a) == this)
            {
                a a1 = n;
                if (a1 != null)
                {
                    if (s.a)
                    {
                        (new StringBuilder("  Switching to pending loader: ")).append(a1);
                    }
                    n = null;
                    o.b.a(a, null);
                    c();
                    o.a(a1);
                    return;
                }
                if (g != obj || !e)
                {
                    g = obj;
                    e = true;
                    if (h)
                    {
                        b(c1, obj);
                    }
                }
                c1 = (a)o.c.a(a);
                if (c1 != null && c1 != this)
                {
                    c1.f = false;
                    c1.c();
                    o.c.c(a);
                }
                if (s.a(o) != null && !o.b())
                {
                    s.a(o).d.h();
                    return;
                }
            }
            return;
        }

        public final void a(String s1, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
        {
            String s2 = s1;
            s1 = this;
            do
            {
                printwriter.print(s2);
                printwriter.print("mId=");
                printwriter.print(((a) (s1)).a);
                printwriter.print(" mArgs=");
                printwriter.println(((a) (s1)).b);
                printwriter.print(s2);
                printwriter.print("mCallbacks=");
                printwriter.println(((a) (s1)).c);
                printwriter.print(s2);
                printwriter.print("mLoader=");
                printwriter.println(((a) (s1)).d);
                if (((a) (s1)).d != null)
                {
                    ((a) (s1)).d.a((new StringBuilder()).append(s2).append("  ").toString(), filedescriptor, printwriter, as);
                }
                if (((a) (s1)).e || ((a) (s1)).f)
                {
                    printwriter.print(s2);
                    printwriter.print("mHaveData=");
                    printwriter.print(((a) (s1)).e);
                    printwriter.print("  mDeliveredData=");
                    printwriter.println(((a) (s1)).f);
                    printwriter.print(s2);
                    printwriter.print("mData=");
                    printwriter.println(((a) (s1)).g);
                }
                printwriter.print(s2);
                printwriter.print("mStarted=");
                printwriter.print(((a) (s1)).h);
                printwriter.print(" mReportNextStart=");
                printwriter.print(((a) (s1)).k);
                printwriter.print(" mDestroyed=");
                printwriter.println(((a) (s1)).l);
                printwriter.print(s2);
                printwriter.print("mRetaining=");
                printwriter.print(((a) (s1)).i);
                printwriter.print(" mRetainingStarted=");
                printwriter.print(((a) (s1)).j);
                printwriter.print(" mListenerRegistered=");
                printwriter.println(((a) (s1)).m);
                if (((a) (s1)).n != null)
                {
                    printwriter.print(s2);
                    printwriter.println("Pending Loader ");
                    printwriter.print(((a) (s1)).n);
                    printwriter.println(":");
                    s1 = ((a) (s1)).n;
                    s2 = (new StringBuilder()).append(s2).append("  ").toString();
                } else
                {
                    return;
                }
            } while (true);
        }

        final void b()
        {
            if (s.a)
            {
                (new StringBuilder("  Stopping: ")).append(this);
            }
            h = false;
            if (!i && d != null && m)
            {
                m = false;
                d.a(this);
                d.b(this);
                d.f();
            }
        }

        final void b(c c1, Object obj)
        {
            String s1;
            if (c == null)
            {
                break MISSING_BLOCK_LABEL_151;
            }
            s1 = null;
            if (s.a(o) != null)
            {
                s1 = s.a(o).d.u;
                s.a(o).d.u = "onLoadFinished";
            }
            if (s.a)
            {
                StringBuilder stringbuilder = (new StringBuilder("  onLoadFinished in ")).append(c1).append(": ");
                StringBuilder stringbuilder1 = new StringBuilder(64);
                android.support.v4.util.c.a(obj, stringbuilder1);
                stringbuilder1.append("}");
                stringbuilder.append(stringbuilder1.toString());
            }
            c.a(c1, obj);
            if (s.a(o) != null)
            {
                s.a(o).d.u = s1;
            }
            f = true;
            return;
            c1;
            if (s.a(o) != null)
            {
                s.a(o).d.u = s1;
            }
            throw c1;
        }

        final void c()
        {
            a a1 = this;
            do
            {
                if (s.a)
                {
                    (new StringBuilder("  Destroying: ")).append(a1);
                }
                a1.l = true;
                boolean flag = a1.f;
                a1.f = false;
                if (a1.c != null && a1.d != null && a1.e && flag)
                {
                    if (s.a)
                    {
                        (new StringBuilder("  Reseting: ")).append(a1);
                    }
                    String s1 = null;
                    if (s.a(a1.o) != null)
                    {
                        s1 = s.a(a1.o).d.u;
                        s.a(a1.o).d.u = "onLoaderReset";
                    }
                    if (s.a(a1.o) != null)
                    {
                        s.a(a1.o).d.u = s1;
                    }
                }
                a1.c = null;
                a1.g = null;
                a1.e = false;
                if (a1.d != null)
                {
                    if (a1.m)
                    {
                        a1.m = false;
                        a1.d.a(a1);
                        a1.d.b(a1);
                    }
                    a1.d.i();
                }
                if (a1.n != null)
                {
                    a1 = a1.n;
                } else
                {
                    return;
                }
            } while (true);
        }

        public final String toString()
        {
            StringBuilder stringbuilder = new StringBuilder(64);
            stringbuilder.append("LoaderInfo{");
            stringbuilder.append(Integer.toHexString(System.identityHashCode(this)));
            stringbuilder.append(" #");
            stringbuilder.append(a);
            stringbuilder.append(" : ");
            android.support.v4.util.c.a(d, stringbuilder);
            stringbuilder.append("}}");
            return stringbuilder.toString();
        }

        public a(int i1, r.a a1)
        {
            o = s.this;
            super();
            a = i1;
            c = a1;
        }
    }


    static boolean a = false;
    final j b = new j();
    final j c = new j();
    final String d;
    boolean e;
    boolean f;
    boolean g;
    private k h;

    s(String s1, k k1, boolean flag)
    {
        d = s1;
        h = k1;
        e = flag;
    }

    static k a(s s1)
    {
        return s1.h;
    }

    private a c(int i, r.a a1)
    {
        a a2 = new a(i, a1);
        a2.d = a1.a(i);
        return a2;
    }

    private a d(int i, r.a a1)
    {
        g = true;
        a1 = c(i, a1);
        a(a1);
        g = false;
        return a1;
        a1;
        g = false;
        throw a1;
    }

    public final c a(int i, r.a a1)
    {
        if (g)
        {
            throw new IllegalStateException("Called while creating a loader");
        }
        a a2 = (a)b.a(i);
        if (a)
        {
            (new StringBuilder("initLoader in ")).append(this).append(": args=").append(null);
        }
        if (a2 == null)
        {
            a2 = d(i, a1);
            a1 = a2;
            if (a)
            {
                (new StringBuilder("  Created new loader ")).append(a2);
                a1 = a2;
            }
        } else
        {
            if (a)
            {
                (new StringBuilder("  Re-using existing loader ")).append(a2);
            }
            a2.c = a1;
            a1 = a2;
        }
        if (((a) (a1)).e && e)
        {
            a1.b(((a) (a1)).d, ((a) (a1)).g);
        }
        return ((a) (a1)).d;
    }

    public final void a(int i)
    {
        if (g)
        {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (a)
        {
            (new StringBuilder("destroyLoader in ")).append(this).append(" of ").append(i);
        }
        int l = b.g(i);
        if (l >= 0)
        {
            a a1 = (a)b.f(l);
            b.d(l);
            a1.c();
        }
        i = c.g(i);
        if (i >= 0)
        {
            a a2 = (a)c.f(i);
            c.d(i);
            a2.c();
        }
        if (h != null && !b())
        {
            h.d.h();
        }
    }

    final void a(k k1)
    {
        h = k1;
    }

    final void a(a a1)
    {
        b.a(a1.a, a1);
        if (e)
        {
            a1.a();
        }
    }

    public final void a(String s1, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        if (b.a() > 0)
        {
            printwriter.print(s1);
            printwriter.println("Active Loaders:");
            String s2 = (new StringBuilder()).append(s1).append("    ").toString();
            for (int i = 0; i < b.a(); i++)
            {
                a a1 = (a)b.f(i);
                printwriter.print(s1);
                printwriter.print("  #");
                printwriter.print(b.e(i));
                printwriter.print(": ");
                printwriter.println(a1.toString());
                a1.a(s2, filedescriptor, printwriter, as);
            }

        }
        if (c.a() > 0)
        {
            printwriter.print(s1);
            printwriter.println("Inactive Loaders:");
            String s3 = (new StringBuilder()).append(s1).append("    ").toString();
            for (int l = 0; l < c.a(); l++)
            {
                a a2 = (a)c.f(l);
                printwriter.print(s1);
                printwriter.print("  #");
                printwriter.print(c.e(l));
                printwriter.print(": ");
                printwriter.println(a2.toString());
                a2.a(s3, filedescriptor, printwriter, as);
            }

        }
    }

    public final c b(int i)
    {
        if (g)
        {
            throw new IllegalStateException("Called while creating a loader");
        }
        a a1 = (a)b.a(i);
        if (a1 != null)
        {
            if (a1.n != null)
            {
                return a1.n.d;
            } else
            {
                return a1.d;
            }
        } else
        {
            return null;
        }
    }

    public final c b(int i, r.a a1)
    {
        a a2;
        if (g)
        {
            throw new IllegalStateException("Called while creating a loader");
        }
        a2 = (a)b.a(i);
        if (a)
        {
            (new StringBuilder("restartLoader in ")).append(this).append(": args=").append(null);
        }
        if (a2 == null) goto _L2; else goto _L1
_L1:
        a a3 = (a)c.a(i);
        if (a3 == null) goto _L4; else goto _L3
_L3:
        if (!a2.e) goto _L6; else goto _L5
_L5:
        if (a)
        {
            (new StringBuilder("  Removing last inactive loader: ")).append(a2);
        }
        a3.f = false;
        a3.c();
_L9:
        a2.d.h();
        c.a(i, a2);
_L2:
        return d(i, a1).d;
_L6:
        if (a2.h)
        {
            break; /* Loop/switch isn't completed */
        }
        b.a(i, null);
        a2.c();
        if (true) goto _L2; else goto _L7
_L7:
        if (a)
        {
            (new StringBuilder("  Canceling: ")).append(a2);
        }
        if (a2.h && a2.d != null && a2.m)
        {
            if (a)
            {
                (new StringBuilder("onLoadCanceled: ")).append(a2);
            }
            if (!a2.l && a2.o.b.a(a2.a) == a2)
            {
                a a4 = a2.n;
                if (a4 != null)
                {
                    if (a)
                    {
                        (new StringBuilder("  Switching to pending loader: ")).append(a4);
                    }
                    a2.n = null;
                    a2.o.b.a(a2.a, null);
                    a2.c();
                    a2.o.a(a4);
                }
            }
        }
        if (a2.n != null)
        {
            if (a)
            {
                (new StringBuilder("  Removing pending loader: ")).append(a2.n);
            }
            a2.n.c();
            a2.n = null;
        }
        a2.n = c(i, a1);
        return a2.n.d;
_L4:
        if (a)
        {
            (new StringBuilder("  Making last loader inactive: ")).append(a2);
        }
        if (true) goto _L9; else goto _L8
_L8:
    }

    public final boolean b()
    {
        boolean flag1 = false;
        int l = b.a();
        int i = 0;
        while (i < l) 
        {
            a a1 = (a)b.f(i);
            boolean flag;
            if (a1.h && !a1.f)
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
            RuntimeException runtimeexception = new RuntimeException("here");
            runtimeexception.fillInStackTrace();
            Log.w("LoaderManager", (new StringBuilder("Called doStart when already started: ")).append(this).toString(), runtimeexception);
        } else
        {
            e = true;
            int i = b.a() - 1;
            while (i >= 0) 
            {
                ((a)b.f(i)).a();
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
            RuntimeException runtimeexception = new RuntimeException("here");
            runtimeexception.fillInStackTrace();
            Log.w("LoaderManager", (new StringBuilder("Called doStop when not started: ")).append(this).toString(), runtimeexception);
            return;
        }
        for (int i = b.a() - 1; i >= 0; i--)
        {
            ((a)b.f(i)).b();
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
                a a1 = (a)b.f(i);
                if (a)
                {
                    (new StringBuilder("  Retaining: ")).append(a1);
                }
                a1.i = true;
                a1.j = a1.h;
                a1.h = false;
                a1.c = null;
                i--;
            }
        }
    }

    final void f()
    {
        for (int i = b.a() - 1; i >= 0; i--)
        {
            ((a)b.f(i)).k = true;
        }

    }

    final void g()
    {
        for (int i = b.a() - 1; i >= 0; i--)
        {
            a a1 = (a)b.f(i);
            if (!a1.h || !a1.k)
            {
                continue;
            }
            a1.k = false;
            if (a1.e)
            {
                a1.b(a1.d, a1.g);
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
                ((a)b.f(i)).c();
            }

            b.b();
        }
        if (a)
        {
            (new StringBuilder("Destroying Inactive in ")).append(this);
        }
        for (int l = c.a() - 1; l >= 0; l--)
        {
            ((a)c.f(l)).c();
        }

        c.b();
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(128);
        stringbuilder.append("LoaderManager{");
        stringbuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringbuilder.append(" in ");
        android.support.v4.util.c.a(h, stringbuilder);
        stringbuilder.append("}}");
        return stringbuilder.toString();
    }

}
