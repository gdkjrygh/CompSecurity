// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Bundle;
import android.support.v4.c.d;
import android.support.v4.c.i;
import android.support.v4.content.f;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

// Referenced classes of package android.support.v4.app:
//            j, FragmentActivity, FragmentManagerImpl

class k extends j
{
    final class a
        implements android.support.v4.content.f.a
    {

        final int a;
        final Bundle b;
        j.a c;
        f d;
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
        final k o;

        void a()
        {
            if (i && j)
            {
                h = true;
            } else
            if (!h)
            {
                h = true;
                if (k.a)
                {
                    Log.v("LoaderManager", (new StringBuilder()).append("  Starting: ").append(this).toString());
                }
                if (d == null && c != null)
                {
                    d = c.a(a, b);
                }
                if (d != null)
                {
                    if (d.getClass().isMemberClass() && !Modifier.isStatic(d.getClass().getModifiers()))
                    {
                        throw new IllegalArgumentException((new StringBuilder()).append("Object returned from onCreateLoader must not be a non-static inner member class: ").append(d).toString());
                    }
                    if (!m)
                    {
                        d.a(a, this);
                        m = true;
                    }
                    d.a();
                    return;
                }
            }
        }

        void a(f f1, Object obj)
        {
            if (c == null)
            {
                break MISSING_BLOCK_LABEL_130;
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
            if (k.a)
            {
                Log.v("LoaderManager", (new StringBuilder()).append("  onLoadFinished in ").append(f1).append(": ").append(f1.a(obj)).toString());
            }
            c.a(f1, obj);
            if (o.e != null)
            {
                o.e.b.u = s;
            }
            f = true;
            return;
            f1;
            if (o.e != null)
            {
                o.e.b.u = s;
            }
            throw f1;
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
                d.a((new StringBuilder()).append(s).append("  ").toString(), filedescriptor, printwriter, as);
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
            if (k.a)
            {
                Log.v("LoaderManager", (new StringBuilder()).append("  Retaining: ").append(this).toString());
            }
            i = true;
            j = h;
            h = false;
            c = null;
        }

        void c()
        {
            if (i)
            {
                if (k.a)
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
                a(d, g);
            }
        }

        void d()
        {
            if (h && k)
            {
                k = false;
                if (e)
                {
                    a(d, g);
                }
            }
        }

        void e()
        {
            if (k.a)
            {
                Log.v("LoaderManager", (new StringBuilder()).append("  Stopping: ").append(this).toString());
            }
            h = false;
            if (!i && d != null && m)
            {
                m = false;
                d.a(this);
                d.c();
            }
        }

        void f()
        {
            if (k.a)
            {
                Log.v("LoaderManager", (new StringBuilder()).append("  Destroying: ").append(this).toString());
            }
            l = true;
            boolean flag = f;
            f = false;
            if (c == null || d == null || !e || !flag)
            {
                break MISSING_BLOCK_LABEL_178;
            }
            if (k.a)
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
            c.a(d);
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
                    d.a(this);
                }
                d.e();
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
            android.support.v4.c.d.a(d, stringbuilder);
            stringbuilder.append("}}");
            return stringbuilder.toString();
        }
    }


    static boolean a = false;
    final i b = new i();
    final i c = new i();
    final String d;
    FragmentActivity e;
    boolean f;
    boolean g;

    k(String s, FragmentActivity fragmentactivity, boolean flag)
    {
        d = s;
        e = fragmentactivity;
        f = flag;
    }

    void a(FragmentActivity fragmentactivity)
    {
        e = fragmentactivity;
    }

    public void a(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        boolean flag = false;
        if (b.b() > 0)
        {
            printwriter.print(s);
            printwriter.println("Active Loaders:");
            String s1 = (new StringBuilder()).append(s).append("    ").toString();
            for (int l = 0; l < b.b(); l++)
            {
                a a1 = (a)b.b(l);
                printwriter.print(s);
                printwriter.print("  #");
                printwriter.print(b.a(l));
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
            for (int i1 = ((flag) ? 1 : 0); i1 < c.b(); i1++)
            {
                a a2 = (a)c.b(i1);
                printwriter.print(s);
                printwriter.print("  #");
                printwriter.print(c.a(i1));
                printwriter.print(": ");
                printwriter.println(a2.toString());
                a2.a(s2, filedescriptor, printwriter, as);
            }

        }
    }

    public boolean a()
    {
        int i1 = b.b();
        int l = 0;
        boolean flag1 = false;
        while (l < i1) 
        {
            a a1 = (a)b.b(l);
            boolean flag;
            if (a1.h && !a1.f)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            flag1 |= flag;
            l++;
        }
        return flag1;
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
            int l = b.b() - 1;
            while (l >= 0) 
            {
                ((a)b.b(l)).a();
                l--;
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
        for (int l = b.b() - 1; l >= 0; l--)
        {
            ((a)b.b(l)).e();
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
            int l = b.b() - 1;
            while (l >= 0) 
            {
                ((a)b.b(l)).b();
                l--;
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
            for (int l = b.b() - 1; l >= 0; l--)
            {
                ((a)b.b(l)).c();
            }

        }
    }

    void f()
    {
        for (int l = b.b() - 1; l >= 0; l--)
        {
            ((a)b.b(l)).k = true;
        }

    }

    void g()
    {
        for (int l = b.b() - 1; l >= 0; l--)
        {
            ((a)b.b(l)).d();
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
            for (int l = b.b() - 1; l >= 0; l--)
            {
                ((a)b.b(l)).f();
            }

            b.c();
        }
        if (a)
        {
            Log.v("LoaderManager", (new StringBuilder()).append("Destroying Inactive in ").append(this).toString());
        }
        for (int i1 = c.b() - 1; i1 >= 0; i1--)
        {
            ((a)c.b(i1)).f();
        }

        c.c();
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(128);
        stringbuilder.append("LoaderManager{");
        stringbuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringbuilder.append(" in ");
        android.support.v4.c.d.a(e, stringbuilder);
        stringbuilder.append("}}");
        return stringbuilder.toString();
    }

}
