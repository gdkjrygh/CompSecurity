// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Bundle;
import android.support.v4.b.c;
import android.support.v4.g.b;
import android.support.v4.g.j;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

// Referenced classes of package android.support.v4.app:
//            u, l, n

public final class v extends u
{
    final class a
        implements android.support.v4.b.c.a, android.support.v4.b.c.b
    {

        final int a;
        final Bundle b = null;
        u.a c;
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
        final v o;

        final void a()
        {
            if (i && j)
            {
                h = true;
            } else
            if (!h)
            {
                h = true;
                if (v.a)
                {
                    Log.v("LoaderManager", (new StringBuilder("  Starting: ")).append(this).toString());
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
                        c c1 = d;
                        int i1 = a;
                        if (c1.b != null)
                        {
                            throw new IllegalStateException("There is already a listener registered");
                        }
                        c1.b = this;
                        c1.a = i1;
                        c1 = d;
                        if (c1.c != null)
                        {
                            throw new IllegalStateException("There is already a listener registered");
                        }
                        c1.c = this;
                        m = true;
                    }
                    c c2 = d;
                    c2.e = true;
                    c2.g = false;
                    c2.f = false;
                    c2.a();
                    return;
                }
            }
        }

        public final void a(c c1, Object obj)
        {
            if (v.a)
            {
                Log.v("LoaderManager", (new StringBuilder("onLoadComplete: ")).append(this).toString());
            }
            if (!l) goto _L2; else goto _L1
_L1:
            if (v.a)
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
            if (v.a)
            {
                Log.v("LoaderManager", "  Ignoring load complete -- not active");
                return;
            }
            if (true) goto _L4; else goto _L3
_L3:
            a a1 = n;
            if (a1 != null)
            {
                if (v.a)
                {
                    Log.v("LoaderManager", (new StringBuilder("  Switching to pending loader: ")).append(a1).toString());
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
                c1 = o.c;
                int i1 = a;
                i1 = android.support.v4.g.b.a(((j) (c1)).c, ((j) (c1)).e, i1);
                if (i1 >= 0 && ((j) (c1)).d[i1] != j.a)
                {
                    ((j) (c1)).d[i1] = j.a;
                    c1.b = true;
                }
            }
            if (v.a(o) != null && !o.a())
            {
                v.a(o).f.h();
                return;
            }
            if (true) goto _L4; else goto _L5
_L5:
        }

        public final void a(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
        {
            String s1 = s;
            s = this;
            do
            {
                printwriter.print(s1);
                printwriter.print("mId=");
                printwriter.print(((a) (s)).a);
                printwriter.print(" mArgs=");
                printwriter.println(((a) (s)).b);
                printwriter.print(s1);
                printwriter.print("mCallbacks=");
                printwriter.println(((a) (s)).c);
                printwriter.print(s1);
                printwriter.print("mLoader=");
                printwriter.println(((a) (s)).d);
                if (((a) (s)).d != null)
                {
                    ((a) (s)).d.a((new StringBuilder()).append(s1).append("  ").toString(), filedescriptor, printwriter, as);
                }
                if (((a) (s)).e || ((a) (s)).f)
                {
                    printwriter.print(s1);
                    printwriter.print("mHaveData=");
                    printwriter.print(((a) (s)).e);
                    printwriter.print("  mDeliveredData=");
                    printwriter.println(((a) (s)).f);
                    printwriter.print(s1);
                    printwriter.print("mData=");
                    printwriter.println(((a) (s)).g);
                }
                printwriter.print(s1);
                printwriter.print("mStarted=");
                printwriter.print(((a) (s)).h);
                printwriter.print(" mReportNextStart=");
                printwriter.print(((a) (s)).k);
                printwriter.print(" mDestroyed=");
                printwriter.println(((a) (s)).l);
                printwriter.print(s1);
                printwriter.print("mRetaining=");
                printwriter.print(((a) (s)).i);
                printwriter.print(" mRetainingStarted=");
                printwriter.print(((a) (s)).j);
                printwriter.print(" mListenerRegistered=");
                printwriter.println(((a) (s)).m);
                if (((a) (s)).n != null)
                {
                    printwriter.print(s1);
                    printwriter.println("Pending Loader ");
                    printwriter.print(((a) (s)).n);
                    printwriter.println(":");
                    s = ((a) (s)).n;
                    s1 = (new StringBuilder()).append(s1).append("  ").toString();
                } else
                {
                    return;
                }
            } while (true);
        }

        final void b()
        {
            if (v.a)
            {
                Log.v("LoaderManager", (new StringBuilder("  Stopping: ")).append(this).toString());
            }
            h = false;
            if (!i && d != null && m)
            {
                m = false;
                d.a(this);
                d.a(this);
                c c1 = d;
                c1.e = false;
                c1.b();
            }
        }

        final void b(c c1, Object obj)
        {
            if (c == null)
            {
                break MISSING_BLOCK_LABEL_160;
            }
            String s;
            StringBuilder stringbuilder;
            StringBuilder stringbuilder1;
            if (v.a(o) != null)
            {
                s = v.a(o).f.u;
                v.a(o).f.u = "onLoadFinished";
            } else
            {
                s = null;
            }
            if (v.a)
            {
                stringbuilder = (new StringBuilder("  onLoadFinished in ")).append(c1).append(": ");
                stringbuilder1 = new StringBuilder(64);
                android.support.v4.g.c.a(obj, stringbuilder1);
                stringbuilder1.append("}");
                Log.v("LoaderManager", stringbuilder.append(stringbuilder1.toString()).toString());
            }
            c.a(c1, obj);
            if (v.a(o) != null)
            {
                v.a(o).f.u = s;
            }
            f = true;
            return;
            c1;
            if (v.a(o) != null)
            {
                v.a(o).f.u = s;
            }
            throw c1;
        }

        final void c()
        {
            a a1 = this;
            do
            {
                if (v.a)
                {
                    Log.v("LoaderManager", (new StringBuilder("  Destroying: ")).append(a1).toString());
                }
                a1.l = true;
                boolean flag = a1.f;
                a1.f = false;
                if (a1.c != null && a1.d != null && a1.e && flag)
                {
                    if (v.a)
                    {
                        Log.v("LoaderManager", (new StringBuilder("  Reseting: ")).append(a1).toString());
                    }
                    Object obj;
                    if (v.a(a1.o) != null)
                    {
                        obj = v.a(a1.o).f.u;
                        v.a(a1.o).f.u = "onLoaderReset";
                    } else
                    {
                        obj = null;
                    }
                    if (v.a(a1.o) != null)
                    {
                        v.a(a1.o).f.u = ((String) (obj));
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
                        a1.d.a(a1);
                    }
                    obj = a1.d;
                    ((c) (obj)).c();
                    obj.g = true;
                    obj.e = false;
                    obj.f = false;
                    obj.h = false;
                    obj.i = false;
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
            android.support.v4.g.c.a(d, stringbuilder);
            stringbuilder.append("}}");
            return stringbuilder.toString();
        }

        public a(int i1, u.a a1)
        {
            o = v.this;
            super();
            a = i1;
            c = a1;
        }
    }


    public static boolean a = false;
    final j b = new j();
    final j c = new j();
    final String d;
    boolean e;
    boolean f;
    boolean g;
    l h;

    v(String s, l l1, boolean flag)
    {
        d = s;
        h = l1;
        e = flag;
    }

    static l a(v v1)
    {
        return v1.h;
    }

    private a c(int i, u.a a1)
    {
        a a2 = new a(i, a1);
        a2.d = a1.a(i);
        return a2;
    }

    private a d(int i, u.a a1)
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

    public final c a(int i, u.a a1)
    {
        if (g)
        {
            throw new IllegalStateException("Called while creating a loader");
        }
        a a2 = (a)b.a(i);
        if (a)
        {
            Log.v("LoaderManager", (new StringBuilder("initLoader in ")).append(this).append(": args=").append(null).toString());
        }
        if (a2 == null)
        {
            a2 = d(i, a1);
            a1 = a2;
            if (a)
            {
                Log.v("LoaderManager", (new StringBuilder("  Created new loader ")).append(a2).toString());
                a1 = a2;
            }
        } else
        {
            if (a)
            {
                Log.v("LoaderManager", (new StringBuilder("  Re-using existing loader ")).append(a2).toString());
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
            Log.v("LoaderManager", (new StringBuilder("destroyLoader in ")).append(this).append(" of ").append(i).toString());
        }
        int k = b.e(i);
        if (k >= 0)
        {
            a a1 = (a)b.d(k);
            b.b(k);
            a1.c();
        }
        i = c.e(i);
        if (i >= 0)
        {
            a a2 = (a)c.d(i);
            c.b(i);
            a2.c();
        }
        if (h != null && !a())
        {
            h.f.h();
        }
    }

    final void a(a a1)
    {
        b.a(a1.a, a1);
        if (e)
        {
            a1.a();
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
                a a1 = (a)b.d(i);
                printwriter.print(s);
                printwriter.print("  #");
                printwriter.print(b.c(i));
                printwriter.print(": ");
                printwriter.println(a1.toString());
                a1.a(s1, filedescriptor, printwriter, as);
            }

        }
        if (c.a() > 0)
        {
            printwriter.print(s);
            printwriter.println("Inactive Loaders:");
            String s2 = (new StringBuilder()).append(s).append("    ").toString();
            for (int k = ((flag) ? 1 : 0); k < c.a(); k++)
            {
                a a2 = (a)c.d(k);
                printwriter.print(s);
                printwriter.print("  #");
                printwriter.print(c.c(k));
                printwriter.print(": ");
                printwriter.println(a2.toString());
                a2.a(s2, filedescriptor, printwriter, as);
            }

        }
    }

    public final boolean a()
    {
        int k = b.a();
        int i = 0;
        boolean flag1 = false;
        while (i < k) 
        {
            a a1 = (a)b.d(i);
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

    public final c b(int i, u.a a1)
    {
        a a2;
        if (g)
        {
            throw new IllegalStateException("Called while creating a loader");
        }
        a2 = (a)b.a(i);
        if (a)
        {
            Log.v("LoaderManager", (new StringBuilder("restartLoader in ")).append(this).append(": args=").append(null).toString());
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
            Log.v("LoaderManager", (new StringBuilder("  Removing last inactive loader: ")).append(a2).toString());
        }
        a3.f = false;
        a3.c();
_L13:
        a2.d.f = true;
        c.a(i, a2);
_L2:
        return d(i, a1).d;
_L6:
        if (a2.h)
        {
            break; /* Loop/switch isn't completed */
        }
        if (a)
        {
            Log.v("LoaderManager", "  Current loader is stopped; replacing");
        }
        b.a(i, null);
        a2.c();
        if (true) goto _L2; else goto _L7
_L7:
        if (a)
        {
            Log.v("LoaderManager", "  Current loader is running; attempting to cancel");
        }
        if (a)
        {
            Log.v("LoaderManager", (new StringBuilder("  Canceling: ")).append(a2).toString());
        }
        if (!a2.h || a2.d == null || !a2.m) goto _L9; else goto _L8
_L8:
        if (a)
        {
            Log.v("LoaderManager", (new StringBuilder("onLoadCanceled: ")).append(a2).toString());
        }
        if (!a2.l) goto _L11; else goto _L10
_L10:
        if (a)
        {
            Log.v("LoaderManager", "  Ignoring load canceled -- destroyed");
        }
_L9:
        if (a2.n != null)
        {
            if (a)
            {
                Log.v("LoaderManager", (new StringBuilder("  Removing pending loader: ")).append(a2.n).toString());
            }
            a2.n.c();
            a2.n = null;
        }
        if (a)
        {
            Log.v("LoaderManager", "  Enqueuing as new pending loader");
        }
        a2.n = c(i, a1);
        return a2.n.d;
_L11:
        if (a2.o.b.a(a2.a) != a2)
        {
            if (a)
            {
                Log.v("LoaderManager", "  Ignoring load canceled -- not active");
            }
        } else
        {
            a a4 = a2.n;
            if (a4 != null)
            {
                if (a)
                {
                    Log.v("LoaderManager", (new StringBuilder("  Switching to pending loader: ")).append(a4).toString());
                }
                a2.n = null;
                a2.o.b.a(a2.a, null);
                a2.c();
                a2.o.a(a4);
            }
        }
        if (true) goto _L9; else goto _L4
_L4:
        if (a)
        {
            Log.v("LoaderManager", (new StringBuilder("  Making last loader inactive: ")).append(a2).toString());
        }
        if (true) goto _L13; else goto _L12
_L12:
    }

    final void b()
    {
        if (a)
        {
            Log.v("LoaderManager", (new StringBuilder("Starting in ")).append(this).toString());
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
                ((a)b.d(i)).a();
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
        if (!e)
        {
            RuntimeException runtimeexception = new RuntimeException("here");
            runtimeexception.fillInStackTrace();
            Log.w("LoaderManager", (new StringBuilder("Called doStop when not started: ")).append(this).toString(), runtimeexception);
            return;
        }
        for (int i = b.a() - 1; i >= 0; i--)
        {
            ((a)b.d(i)).b();
        }

        e = false;
    }

    final void d()
    {
        if (a)
        {
            Log.v("LoaderManager", (new StringBuilder("Retaining in ")).append(this).toString());
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
                a a1 = (a)b.d(i);
                if (a)
                {
                    Log.v("LoaderManager", (new StringBuilder("  Retaining: ")).append(a1).toString());
                }
                a1.i = true;
                a1.j = a1.h;
                a1.h = false;
                a1.c = null;
                i--;
            }
        }
    }

    final void e()
    {
        for (int i = b.a() - 1; i >= 0; i--)
        {
            ((a)b.d(i)).k = true;
        }

    }

    final void f()
    {
        for (int i = b.a() - 1; i >= 0; i--)
        {
            a a1 = (a)b.d(i);
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

    final void g()
    {
        if (!f)
        {
            if (a)
            {
                Log.v("LoaderManager", (new StringBuilder("Destroying Active in ")).append(this).toString());
            }
            for (int i = b.a() - 1; i >= 0; i--)
            {
                ((a)b.d(i)).c();
            }

            b.b();
        }
        if (a)
        {
            Log.v("LoaderManager", (new StringBuilder("Destroying Inactive in ")).append(this).toString());
        }
        for (int k = c.a() - 1; k >= 0; k--)
        {
            ((a)c.d(k)).c();
        }

        c.b();
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(128);
        stringbuilder.append("LoaderManager{");
        stringbuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringbuilder.append(" in ");
        android.support.v4.g.c.a(h, stringbuilder);
        stringbuilder.append("}}");
        return stringbuilder.toString();
    }

}
