// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

final class ap
    implements dc, dd
{

    final int a;
    an b;
    da c;
    boolean d;
    boolean e;
    Object f;
    boolean g;
    boolean h;
    boolean i;
    boolean j;
    boolean k;
    ap l;
    private Bundle m;
    private boolean n;
    private ao o;

    public ap(ao ao1, int i1, Bundle bundle, an an1)
    {
        o = ao1;
        super();
        a = i1;
        m = bundle;
        b = an1;
    }

    final void a()
    {
        if (h && i)
        {
            g = true;
        } else
        if (!g)
        {
            g = true;
            if (c == null && b != null)
            {
                c = b.a(m);
            }
            if (c != null)
            {
                if (c.getClass().isMemberClass() && !Modifier.isStatic(c.getClass().getModifiers()))
                {
                    throw new IllegalArgumentException((new StringBuilder("Object returned from onCreateLoader must not be a non-static inner member class: ")).append(c).toString());
                }
                if (!k)
                {
                    c.a(a, this);
                    da da1 = c;
                    if (da1.d != null)
                    {
                        throw new IllegalStateException("There is already a listener registered");
                    }
                    da1.d = this;
                    k = true;
                }
                c.l();
                return;
            }
        }
    }

    public final void a(Object obj)
    {
        if (!n && o.a.a(a) == this)
        {
            ap ap1 = l;
            if (ap1 != null)
            {
                l = null;
                o.a.a(a, null);
                c();
                o.a(ap1);
                return;
            }
            if (f != obj || !d)
            {
                f = obj;
                d = true;
                if (g)
                {
                    b(obj);
                }
            }
            obj = (ap)o.b.a(a);
            if (obj != null && obj != this)
            {
                obj.e = false;
                ((ap) (obj)).c();
                obj = o.b;
                int i1 = a;
                i1 = hd.a(((ht) (obj)).c, ((ht) (obj)).e, i1);
                if (i1 >= 0 && ((ht) (obj)).d[i1] != ht.a)
                {
                    ((ht) (obj)).d[i1] = ht.a;
                    obj.b = true;
                }
            }
            if (o.f != null && !o.a())
            {
                o.f.d.h();
                return;
            }
        }
    }

    public final void a(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        String s1 = s;
        s = this;
        do
        {
            printwriter.print(s1);
            printwriter.print("mId=");
            printwriter.print(((ap) (s)).a);
            printwriter.print(" mArgs=");
            printwriter.println(((ap) (s)).m);
            printwriter.print(s1);
            printwriter.print("mCallbacks=");
            printwriter.println(((ap) (s)).b);
            printwriter.print(s1);
            printwriter.print("mLoader=");
            printwriter.println(((ap) (s)).c);
            if (((ap) (s)).c != null)
            {
                ((ap) (s)).c.a((new StringBuilder()).append(s1).append("  ").toString(), filedescriptor, printwriter, as);
            }
            if (((ap) (s)).d || ((ap) (s)).e)
            {
                printwriter.print(s1);
                printwriter.print("mHaveData=");
                printwriter.print(((ap) (s)).d);
                printwriter.print("  mDeliveredData=");
                printwriter.println(((ap) (s)).e);
                printwriter.print(s1);
                printwriter.print("mData=");
                printwriter.println(((ap) (s)).f);
            }
            printwriter.print(s1);
            printwriter.print("mStarted=");
            printwriter.print(((ap) (s)).g);
            printwriter.print(" mReportNextStart=");
            printwriter.print(((ap) (s)).j);
            printwriter.print(" mDestroyed=");
            printwriter.println(((ap) (s)).n);
            printwriter.print(s1);
            printwriter.print("mRetaining=");
            printwriter.print(((ap) (s)).h);
            printwriter.print(" mRetainingStarted=");
            printwriter.print(((ap) (s)).i);
            printwriter.print(" mListenerRegistered=");
            printwriter.println(((ap) (s)).k);
            if (((ap) (s)).l != null)
            {
                printwriter.print(s1);
                printwriter.println("Pending Loader ");
                printwriter.print(((ap) (s)).l);
                printwriter.println(":");
                s = ((ap) (s)).l;
                s1 = (new StringBuilder()).append(s1).append("  ").toString();
            } else
            {
                return;
            }
        } while (true);
    }

    final void b()
    {
        g = false;
        if (!h && c != null && k)
        {
            k = false;
            c.a(this);
            c.a(this);
            c.o();
        }
    }

    final void b(Object obj)
    {
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        String s;
        if (o.f != null)
        {
            s = o.f.d.k;
            o.f.d.k = "onLoadFinished";
        } else
        {
            s = null;
        }
        b.a(obj);
        if (o.f != null)
        {
            o.f.d.k = s;
        }
        e = true;
        return;
        obj;
        if (o.f != null)
        {
            o.f.d.k = s;
        }
        throw obj;
    }

    final void c()
    {
        ap ap1 = this;
_L2:
        ap1.n = true;
        boolean flag = ap1.e;
        ap1.e = false;
        if (ap1.b == null || ap1.c == null || !ap1.d || !flag)
        {
            break MISSING_BLOCK_LABEL_117;
        }
        String s;
        Exception exception;
        if (ap1.o.f != null)
        {
            s = ap1.o.f.d.k;
            ap1.o.f.d.k = "onLoaderReset";
        } else
        {
            s = null;
        }
        ap1.b.a();
        if (ap1.o.f != null)
        {
            ap1.o.f.d.k = s;
        }
        ap1.b = null;
        ap1.f = null;
        ap1.d = false;
        if (ap1.c != null)
        {
            if (ap1.k)
            {
                ap1.k = false;
                ap1.c.a(ap1);
                ap1.c.a(ap1);
            }
            ap1.c.p();
        }
        if (ap1.l != null)
        {
            ap1 = ap1.l;
        } else
        {
            return;
        }
        if (true) goto _L2; else goto _L1
_L1:
        exception;
        if (ap1.o.f != null)
        {
            ap1.o.f.d.k = s;
        }
        throw exception;
    }

    public final void d()
    {
        if (!n && o.a.a(a) == this)
        {
            ap ap1 = l;
            if (ap1 != null)
            {
                l = null;
                o.a.a(a, null);
                c();
                o.a(ap1);
                return;
            }
        }
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(64);
        stringbuilder.append("LoaderInfo{");
        stringbuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringbuilder.append(" #");
        stringbuilder.append(a);
        stringbuilder.append(" : ");
        he.a(c, stringbuilder);
        stringbuilder.append("}}");
        return stringbuilder.toString();
    }
}
