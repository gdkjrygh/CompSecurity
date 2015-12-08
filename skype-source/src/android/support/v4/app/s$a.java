// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Bundle;
import android.support.v4.content.c;
import android.support.v4.util.j;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

// Referenced classes of package android.support.v4.app:
//            s, k, m

final class c
    implements android.support.v4.content.ion, android.support.v4.content.ion
{

    final int a;
    final Bundle b = null;
    tring c;
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
    c n;
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
            c c2 = n;
            if (c2 != null)
            {
                if (s.a)
                {
                    (new StringBuilder("  Switching to pending loader: ")).append(c2);
                }
                n = null;
                o.b.a(a, null);
                c();
                o.a(c2);
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
            c1 = (c)o.c.a(a);
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
            printwriter.print(((o) (s1)).a);
            printwriter.print(" mArgs=");
            printwriter.println((() (s1)).b);
            printwriter.print(s2);
            printwriter.print("mCallbacks=");
            printwriter.println((() (s1)).c);
            printwriter.print(s2);
            printwriter.print("mLoader=");
            printwriter.println((() (s1)).d);
            if (((d) (s1)).d != null)
            {
                ((d) (s1)).d.a((new StringBuilder()).append(s2).append("  ").toString(), filedescriptor, printwriter, as);
            }
            if (((tring) (s1)).e || ((e) (s1)).f)
            {
                printwriter.print(s2);
                printwriter.print("mHaveData=");
                printwriter.print(((f) (s1)).e);
                printwriter.print("  mDeliveredData=");
                printwriter.println((() (s1)).f);
                printwriter.print(s2);
                printwriter.print("mData=");
                printwriter.println((() (s1)).g);
            }
            printwriter.print(s2);
            printwriter.print("mStarted=");
            printwriter.print(((g) (s1)).h);
            printwriter.print(" mReportNextStart=");
            printwriter.print(((h) (s1)).k);
            printwriter.print(" mDestroyed=");
            printwriter.println((() (s1)).l);
            printwriter.print(s2);
            printwriter.print("mRetaining=");
            printwriter.print(((l) (s1)).i);
            printwriter.print(" mRetainingStarted=");
            printwriter.print(((i) (s1)).j);
            printwriter.print(" mListenerRegistered=");
            printwriter.println((() (s1)).m);
            if (((m) (s1)).n != null)
            {
                printwriter.print(s2);
                printwriter.println("Pending Loader ");
                printwriter.print((() (s1)).n);
                printwriter.println(":");
                s1 = (() (s1)).n;
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
        g g1 = this;
        do
        {
            if (s.a)
            {
                (new StringBuilder("  Destroying: ")).append(g1);
            }
            g1.l = true;
            boolean flag = g1.f;
            g1.f = false;
            if (g1.c != null && g1.d != null && g1.e && flag)
            {
                if (s.a)
                {
                    (new StringBuilder("  Reseting: ")).append(g1);
                }
                String s1 = null;
                if (s.a(g1.o) != null)
                {
                    s1 = s.a(g1.o).d.u;
                    s.a(g1.o).d.u = "onLoaderReset";
                }
                if (s.a(g1.o) != null)
                {
                    s.a(g1.o).d.u = s1;
                }
            }
            g1.c = null;
            g1.g = null;
            g1.e = false;
            if (g1.d != null)
            {
                if (g1.m)
                {
                    g1.m = false;
                    g1.d.a(g1);
                    g1.d.b(g1);
                }
                g1.d.i();
            }
            if (g1.n != null)
            {
                g1 = g1.n;
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

    public c(s s1, int i1, c c1)
    {
        o = s1;
        super();
        a = i1;
        c = c1;
    }
}
