// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Bundle;
import android.support.v4.content.p;
import android.support.v4.content.r;
import android.support.v4.content.s;
import android.support.v4.d.c;
import android.support.v4.d.d;
import android.support.v4.d.n;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

// Referenced classes of package android.support.v4.app:
//            ao, an, q, s

final class ap
    implements r, s
{

    final int a = 0;
    final Bundle b = null;
    an c;
    p d;
    boolean e;
    boolean f;
    Object g;
    boolean h;
    boolean i;
    boolean j;
    boolean k;
    boolean l;
    boolean m;
    ap n;
    final ao o;

    public ap(ao ao1, an an1)
    {
        o = ao1;
        super();
        c = an1;
    }

    final void a()
    {
        if (i && j)
        {
            h = true;
        } else
        if (!h)
        {
            h = true;
            if (ao.a)
            {
                (new StringBuilder("  Starting: ")).append(this);
            }
            if (d == null && c != null)
            {
                d = c.a();
            }
            if (d != null)
            {
                if (d.getClass().isMemberClass() && !Modifier.isStatic(d.getClass().getModifiers()))
                {
                    throw new IllegalArgumentException((new StringBuilder("Object returned from onCreateLoader must not be a non-static inner member class: ")).append(d).toString());
                }
                if (!m)
                {
                    p p1 = d;
                    int i1 = a;
                    if (p1.o != null)
                    {
                        throw new IllegalStateException("There is already a listener registered");
                    }
                    p1.o = this;
                    p1.n = i1;
                    p1 = d;
                    if (p1.p != null)
                    {
                        throw new IllegalStateException("There is already a listener registered");
                    }
                    p1.p = this;
                    m = true;
                }
                d.i();
                return;
            }
        }
    }

    public final void a(p p1, Object obj)
    {
        if (ao.a)
        {
            (new StringBuilder("onLoadComplete: ")).append(this);
        }
        break MISSING_BLOCK_LABEL_20;
        if (!l && o.b.a(a) == this)
        {
            ap ap1 = n;
            if (ap1 != null)
            {
                if (ao.a)
                {
                    (new StringBuilder("  Switching to pending loader: ")).append(ap1);
                }
                n = null;
                o.b.a(a, null);
                c();
                o.a(ap1);
                return;
            }
            if (g != obj || !e)
            {
                g = obj;
                e = true;
                if (h)
                {
                    b(p1, obj);
                }
            }
            p1 = (ap)o.c.a(a);
            if (p1 != null && p1 != this)
            {
                p1.f = false;
                p1.c();
                p1 = o.c;
                int i1 = a;
                i1 = android.support.v4.d.c.a(((n) (p1)).c, ((n) (p1)).e, i1);
                if (i1 >= 0 && ((n) (p1)).d[i1] != n.a)
                {
                    ((n) (p1)).d[i1] = n.a;
                    p1.b = true;
                }
            }
            if (ao.a(o) != null && !o.b())
            {
                ao.a(o).f.d();
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
            printwriter.print(((ap) (s1)).a);
            printwriter.print(" mArgs=");
            printwriter.println(((ap) (s1)).b);
            printwriter.print(s2);
            printwriter.print("mCallbacks=");
            printwriter.println(((ap) (s1)).c);
            printwriter.print(s2);
            printwriter.print("mLoader=");
            printwriter.println(((ap) (s1)).d);
            if (((ap) (s1)).d != null)
            {
                ((ap) (s1)).d.a((new StringBuilder()).append(s2).append("  ").toString(), filedescriptor, printwriter, as);
            }
            if (((ap) (s1)).e || ((ap) (s1)).f)
            {
                printwriter.print(s2);
                printwriter.print("mHaveData=");
                printwriter.print(((ap) (s1)).e);
                printwriter.print("  mDeliveredData=");
                printwriter.println(((ap) (s1)).f);
                printwriter.print(s2);
                printwriter.print("mData=");
                printwriter.println(((ap) (s1)).g);
            }
            printwriter.print(s2);
            printwriter.print("mStarted=");
            printwriter.print(((ap) (s1)).h);
            printwriter.print(" mReportNextStart=");
            printwriter.print(((ap) (s1)).k);
            printwriter.print(" mDestroyed=");
            printwriter.println(((ap) (s1)).l);
            printwriter.print(s2);
            printwriter.print("mRetaining=");
            printwriter.print(((ap) (s1)).i);
            printwriter.print(" mRetainingStarted=");
            printwriter.print(((ap) (s1)).j);
            printwriter.print(" mListenerRegistered=");
            printwriter.println(((ap) (s1)).m);
            if (((ap) (s1)).n != null)
            {
                printwriter.print(s2);
                printwriter.println("Pending Loader ");
                printwriter.print(((ap) (s1)).n);
                printwriter.println(":");
                s1 = ((ap) (s1)).n;
                s2 = (new StringBuilder()).append(s2).append("  ").toString();
            } else
            {
                return;
            }
        } while (true);
    }

    final void b()
    {
        if (ao.a)
        {
            (new StringBuilder("  Stopping: ")).append(this);
        }
        h = false;
        if (!i && d != null && m)
        {
            m = false;
            d.a(this);
            d.a(this);
            d.l();
        }
    }

    final void b(p p1, Object obj)
    {
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_149;
        }
        String s1;
        StringBuilder stringbuilder;
        if (ao.a(o) != null)
        {
            s1 = ao.a(o).f.u;
            ao.a(o).f.u = "onLoadFinished";
        } else
        {
            s1 = null;
        }
        if (ao.a)
        {
            p1 = (new StringBuilder("  onLoadFinished in ")).append(p1).append(": ");
            stringbuilder = new StringBuilder(64);
            android.support.v4.d.d.a(obj, stringbuilder);
            stringbuilder.append("}");
            p1.append(stringbuilder.toString());
        }
        c.a(obj);
        if (ao.a(o) != null)
        {
            ao.a(o).f.u = s1;
        }
        f = true;
        return;
        p1;
        if (ao.a(o) != null)
        {
            ao.a(o).f.u = s1;
        }
        throw p1;
    }

    final void c()
    {
        ap ap1 = this;
_L2:
        if (ao.a)
        {
            (new StringBuilder("  Destroying: ")).append(ap1);
        }
        ap1.l = true;
        boolean flag = ap1.f;
        ap1.f = false;
        if (ap1.c == null || ap1.d == null || !ap1.e || !flag)
        {
            break MISSING_BLOCK_LABEL_159;
        }
        if (ao.a)
        {
            (new StringBuilder("  Reseting: ")).append(ap1);
        }
        String s1;
        Exception exception;
        if (ao.a(ap1.o) != null)
        {
            s1 = ao.a(ap1.o).f.u;
            ao.a(ap1.o).f.u = "onLoaderReset";
        } else
        {
            s1 = null;
        }
        ap1.c.b();
        if (ao.a(ap1.o) != null)
        {
            ao.a(ap1.o).f.u = s1;
        }
        ap1.c = null;
        ap1.g = null;
        ap1.e = false;
        if (ap1.d != null)
        {
            if (ap1.m)
            {
                ap1.m = false;
                ap1.d.a(ap1);
                ap1.d.a(ap1);
            }
            ap1.d.m();
        }
        if (ap1.n != null)
        {
            ap1 = ap1.n;
        } else
        {
            return;
        }
        if (true) goto _L2; else goto _L1
_L1:
        exception;
        if (ao.a(ap1.o) != null)
        {
            ao.a(ap1.o).f.u = s1;
        }
        throw exception;
    }

    public final void d()
    {
        if (ao.a)
        {
            (new StringBuilder("onLoadCanceled: ")).append(this);
        }
        break MISSING_BLOCK_LABEL_21;
        if (!l && o.b.a(a) == this)
        {
            ap ap1 = n;
            if (ap1 != null)
            {
                if (ao.a)
                {
                    (new StringBuilder("  Switching to pending loader: ")).append(ap1);
                }
                n = null;
                o.b.a(a, null);
                c();
                o.a(ap1);
                return;
            }
        }
        return;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(64);
        stringbuilder.append("LoaderInfo{");
        stringbuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringbuilder.append(" #");
        stringbuilder.append(a);
        stringbuilder.append(" : ");
        android.support.v4.d.d.a(d, stringbuilder);
        stringbuilder.append("}}");
        return stringbuilder.toString();
    }
}
