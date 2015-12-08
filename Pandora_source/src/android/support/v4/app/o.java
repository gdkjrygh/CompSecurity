// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Bundle;
import android.support.v4.content.i;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import p.e.c;
import p.e.h;

// Referenced classes of package android.support.v4.app:
//            n, FragmentActivity, i

class o extends n
{
    final class a
        implements android.support.v4.content.i.b
    {

        final int a;
        final Bundle b;
        n.a c;
        i d;
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
        final o o;

        void a()
        {
            if (i && j)
            {
                h = true;
            } else
            if (!h)
            {
                h = true;
                if (o.a)
                {
                    Log.v("LoaderManager", (new StringBuilder()).append("  Starting: ").append(this).toString());
                }
                if (d == null && c != null)
                {
                    d = c.onCreateLoader(a, b);
                }
                if (d != null)
                {
                    if (d.getClass().isMemberClass() && !Modifier.isStatic(d.getClass().getModifiers()))
                    {
                        throw new IllegalArgumentException((new StringBuilder()).append("Object returned from onCreateLoader must not be a non-static inner member class: ").append(d).toString());
                    }
                    if (!m)
                    {
                        d.registerListener(a, this);
                        m = true;
                    }
                    d.startLoading();
                    return;
                }
            }
        }

        public void a(i i1, Object obj)
        {
            if (o.a)
            {
                Log.v("LoaderManager", (new StringBuilder()).append("onLoadComplete: ").append(this).toString());
            }
            if (!l) goto _L2; else goto _L1
_L1:
            if (o.a)
            {
                Log.v("LoaderManager", "  Ignoring load complete -- destroyed");
            }
_L4:
            return;
_L2:
            if (o.b.a(a) == this)
            {
                break; /* Loop/switch isn't completed */
            }
            if (o.a)
            {
                Log.v("LoaderManager", "  Ignoring load complete -- not active");
                return;
            }
            if (true) goto _L4; else goto _L3
_L3:
            a a1 = n;
            if (a1 != null)
            {
                if (o.a)
                {
                    Log.v("LoaderManager", (new StringBuilder()).append("  Switching to pending loader: ").append(a1).toString());
                }
                n = null;
                o.b.b(a, null);
                f();
                o.a(a1);
                return;
            }
            if (g != obj || !e)
            {
                g = obj;
                e = true;
                if (h)
                {
                    b(i1, obj);
                }
            }
            i1 = (a)o.c.a(a);
            if (i1 != null && i1 != this)
            {
                i1.f = false;
                i1.f();
                o.c.c(a);
            }
            if (o.e != null && !o.a())
            {
                o.e.b.g();
                return;
            }
            if (true) goto _L4; else goto _L5
_L5:
        }

        public void a(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
        {
            printwriter.print(s);
            printwriter.print("mId=");
            printwriter.print(a);
            printwriter.print(" mArgs=");
            printwriter.println(b);
            printwriter.print(s);
            printwriter.print("mCallbacks=");
            printwriter.println(c);
            printwriter.print(s);
            printwriter.print("mLoader=");
            printwriter.println(d);
            if (d != null)
            {
                d.dump((new StringBuilder()).append(s).append("  ").toString(), filedescriptor, printwriter, as);
            }
            if (e || f)
            {
                printwriter.print(s);
                printwriter.print("mHaveData=");
                printwriter.print(e);
                printwriter.print("  mDeliveredData=");
                printwriter.println(f);
                printwriter.print(s);
                printwriter.print("mData=");
                printwriter.println(g);
            }
            printwriter.print(s);
            printwriter.print("mStarted=");
            printwriter.print(h);
            printwriter.print(" mReportNextStart=");
            printwriter.print(k);
            printwriter.print(" mDestroyed=");
            printwriter.println(l);
            printwriter.print(s);
            printwriter.print("mRetaining=");
            printwriter.print(i);
            printwriter.print(" mRetainingStarted=");
            printwriter.print(j);
            printwriter.print(" mListenerRegistered=");
            printwriter.println(m);
            if (n != null)
            {
                printwriter.print(s);
                printwriter.println("Pending Loader ");
                printwriter.print(n);
                printwriter.println(":");
                n.a((new StringBuilder()).append(s).append("  ").toString(), filedescriptor, printwriter, as);
            }
        }

        void b()
        {
            if (o.a)
            {
                Log.v("LoaderManager", (new StringBuilder()).append("  Retaining: ").append(this).toString());
            }
            i = true;
            j = h;
            h = false;
            c = null;
        }

        void b(i i1, Object obj)
        {
            if (c == null)
            {
                break MISSING_BLOCK_LABEL_131;
            }
            String s;
            if (o.e != null)
            {
                s = o.e.b.u;
                o.e.b.u = "onLoadFinished";
            } else
            {
                s = null;
            }
            if (o.a)
            {
                Log.v("LoaderManager", (new StringBuilder()).append("  onLoadFinished in ").append(i1).append(": ").append(i1.dataToString(obj)).toString());
            }
            c.onLoadFinished(i1, obj);
            if (o.e != null)
            {
                o.e.b.u = s;
            }
            f = true;
            return;
            i1;
            if (o.e != null)
            {
                o.e.b.u = s;
            }
            throw i1;
        }

        void c()
        {
            if (i)
            {
                if (o.a)
                {
                    Log.v("LoaderManager", (new StringBuilder()).append("  Finished Retaining: ").append(this).toString());
                }
                i = false;
                if (h != j && !h)
                {
                    e();
                }
            }
            if (h && e && !k)
            {
                b(d, g);
            }
        }

        void d()
        {
            if (h && k)
            {
                k = false;
                if (e)
                {
                    b(d, g);
                }
            }
        }

        void e()
        {
            if (o.a)
            {
                Log.v("LoaderManager", (new StringBuilder()).append("  Stopping: ").append(this).toString());
            }
            h = false;
            if (!i && d != null && m)
            {
                m = false;
                d.unregisterListener(this);
                d.stopLoading();
            }
        }

        void f()
        {
            if (o.a)
            {
                Log.v("LoaderManager", (new StringBuilder()).append("  Destroying: ").append(this).toString());
            }
            l = true;
            boolean flag = f;
            f = false;
            if (c == null || d == null || !e || !flag)
            {
                break MISSING_BLOCK_LABEL_181;
            }
            if (o.a)
            {
                Log.v("LoaderManager", (new StringBuilder()).append("  Reseting: ").append(this).toString());
            }
            String s;
            Exception exception;
            if (o.e != null)
            {
                s = o.e.b.u;
                o.e.b.u = "onLoaderReset";
            } else
            {
                s = null;
            }
            c.onLoaderReset(d);
            if (o.e != null)
            {
                o.e.b.u = s;
            }
            c = null;
            g = null;
            e = false;
            if (d != null)
            {
                if (m)
                {
                    m = false;
                    d.unregisterListener(this);
                }
                d.reset();
            }
            if (n != null)
            {
                n.f();
            }
            return;
            exception;
            if (o.e != null)
            {
                o.e.b.u = s;
            }
            throw exception;
        }

        public String toString()
        {
            StringBuilder stringbuilder = new StringBuilder(64);
            stringbuilder.append("LoaderInfo{");
            stringbuilder.append(Integer.toHexString(System.identityHashCode(this)));
            stringbuilder.append(" #");
            stringbuilder.append(a);
            stringbuilder.append(" : ");
            p.e.c.a(d, stringbuilder);
            stringbuilder.append("}}");
            return stringbuilder.toString();
        }

        public a(int i1, Bundle bundle, n.a a1)
        {
            o = o.this;
            super();
            a = i1;
            b = bundle;
            c = a1;
        }
    }


    static boolean a = false;
    final h b = new h();
    final h c = new h();
    final String d;
    FragmentActivity e;
    boolean f;
    boolean g;
    boolean h;

    o(String s, FragmentActivity fragmentactivity, boolean flag)
    {
        d = s;
        e = fragmentactivity;
        f = flag;
    }

    private a c(int j, Bundle bundle, n.a a1)
    {
        a a2 = new a(j, bundle, a1);
        a2.d = a1.onCreateLoader(j, bundle);
        return a2;
    }

    private a d(int j, Bundle bundle, n.a a1)
    {
        h = true;
        bundle = c(j, bundle, a1);
        a(bundle);
        h = false;
        return bundle;
        bundle;
        h = false;
        throw bundle;
    }

    public i a(int j, Bundle bundle, n.a a1)
    {
        if (h)
        {
            throw new IllegalStateException("Called while creating a loader");
        }
        a a2 = (a)b.a(j);
        if (a)
        {
            Log.v("LoaderManager", (new StringBuilder()).append("initLoader in ").append(this).append(": args=").append(bundle).toString());
        }
        if (a2 == null)
        {
            a1 = d(j, bundle, a1);
            bundle = a1;
            if (a)
            {
                Log.v("LoaderManager", (new StringBuilder()).append("  Created new loader ").append(a1).toString());
                bundle = a1;
            }
        } else
        {
            if (a)
            {
                Log.v("LoaderManager", (new StringBuilder()).append("  Re-using existing loader ").append(a2).toString());
            }
            a2.c = a1;
            bundle = a2;
        }
        if (((a) (bundle)).e && f)
        {
            bundle.b(((a) (bundle)).d, ((a) (bundle)).g);
        }
        return ((a) (bundle)).d;
    }

    public void a(int j)
    {
        if (h)
        {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (a)
        {
            Log.v("LoaderManager", (new StringBuilder()).append("destroyLoader in ").append(this).append(" of ").append(j).toString());
        }
        int k = b.g(j);
        if (k >= 0)
        {
            a a1 = (a)b.f(k);
            b.d(k);
            a1.f();
        }
        j = c.g(j);
        if (j >= 0)
        {
            a a2 = (a)c.f(j);
            c.d(j);
            a2.f();
        }
        if (e != null && !a())
        {
            e.b.g();
        }
    }

    void a(FragmentActivity fragmentactivity)
    {
        e = fragmentactivity;
    }

    void a(a a1)
    {
        b.b(a1.a, a1);
        if (f)
        {
            a1.a();
        }
    }

    public void a(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        boolean flag = false;
        if (b.b() > 0)
        {
            printwriter.print(s);
            printwriter.println("Active Loaders:");
            String s1 = (new StringBuilder()).append(s).append("    ").toString();
            for (int j = 0; j < b.b(); j++)
            {
                a a1 = (a)b.f(j);
                printwriter.print(s);
                printwriter.print("  #");
                printwriter.print(b.e(j));
                printwriter.print(": ");
                printwriter.println(a1.toString());
                a1.a(s1, filedescriptor, printwriter, as);
            }

        }
        if (c.b() > 0)
        {
            printwriter.print(s);
            printwriter.println("Inactive Loaders:");
            String s2 = (new StringBuilder()).append(s).append("    ").toString();
            for (int k = ((flag) ? 1 : 0); k < c.b(); k++)
            {
                a a2 = (a)c.f(k);
                printwriter.print(s);
                printwriter.print("  #");
                printwriter.print(c.e(k));
                printwriter.print(": ");
                printwriter.println(a2.toString());
                a2.a(s2, filedescriptor, printwriter, as);
            }

        }
    }

    public boolean a()
    {
        int k = b.b();
        int j = 0;
        boolean flag1 = false;
        while (j < k) 
        {
            a a1 = (a)b.f(j);
            boolean flag;
            if (a1.h && !a1.f)
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

    public i b(int j)
    {
        if (h)
        {
            throw new IllegalStateException("Called while creating a loader");
        }
        a a1 = (a)b.a(j);
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

    public i b(int j, Bundle bundle, n.a a1)
    {
        if (h)
        {
            throw new IllegalStateException("Called while creating a loader");
        }
        a a2 = (a)b.a(j);
        if (a)
        {
            Log.v("LoaderManager", (new StringBuilder()).append("restartLoader in ").append(this).append(": args=").append(bundle).toString());
        }
        if (a2 != null)
        {
            a a3 = (a)c.a(j);
            if (a3 != null)
            {
                if (a2.e)
                {
                    if (a)
                    {
                        Log.v("LoaderManager", (new StringBuilder()).append("  Removing last inactive loader: ").append(a2).toString());
                    }
                    a3.f = false;
                    a3.f();
                    a2.d.abandon();
                    c.b(j, a2);
                } else
                if (!a2.h)
                {
                    if (a)
                    {
                        Log.v("LoaderManager", "  Current loader is stopped; replacing");
                    }
                    b.b(j, null);
                    a2.f();
                } else
                {
                    if (a2.n != null)
                    {
                        if (a)
                        {
                            Log.v("LoaderManager", (new StringBuilder()).append("  Removing pending loader: ").append(a2.n).toString());
                        }
                        a2.n.f();
                        a2.n = null;
                    }
                    if (a)
                    {
                        Log.v("LoaderManager", "  Enqueuing as new pending loader");
                    }
                    a2.n = c(j, bundle, a1);
                    return a2.n.d;
                }
            } else
            {
                if (a)
                {
                    Log.v("LoaderManager", (new StringBuilder()).append("  Making last loader inactive: ").append(a2).toString());
                }
                a2.d.abandon();
                c.b(j, a2);
            }
        }
        return d(j, bundle, a1).d;
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
            int j = b.b() - 1;
            while (j >= 0) 
            {
                ((a)b.f(j)).a();
                j--;
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
        for (int j = b.b() - 1; j >= 0; j--)
        {
            ((a)b.f(j)).e();
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
            int j = b.b() - 1;
            while (j >= 0) 
            {
                ((a)b.f(j)).b();
                j--;
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
            for (int j = b.b() - 1; j >= 0; j--)
            {
                ((a)b.f(j)).c();
            }

        }
    }

    void f()
    {
        for (int j = b.b() - 1; j >= 0; j--)
        {
            ((a)b.f(j)).k = true;
        }

    }

    void g()
    {
        for (int j = b.b() - 1; j >= 0; j--)
        {
            ((a)b.f(j)).d();
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
            for (int j = b.b() - 1; j >= 0; j--)
            {
                ((a)b.f(j)).f();
            }

            b.c();
        }
        if (a)
        {
            Log.v("LoaderManager", (new StringBuilder()).append("Destroying Inactive in ").append(this).toString());
        }
        for (int k = c.b() - 1; k >= 0; k--)
        {
            ((a)c.f(k)).f();
        }

        c.c();
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(128);
        stringbuilder.append("LoaderManager{");
        stringbuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringbuilder.append(" in ");
        p.e.c.a(e, stringbuilder);
        stringbuilder.append("}}");
        return stringbuilder.toString();
    }

}
