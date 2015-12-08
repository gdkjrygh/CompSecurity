// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

final class cc
    implements ek, el
{

    final int a;
    ca b;
    ei c;
    boolean d;
    boolean e;
    Object f;
    boolean g;
    boolean h;
    boolean i;
    boolean j;
    boolean k;
    cc l;
    private Bundle m;
    private boolean n;
    private cb o;

    public cc(cb cb1, int i1, Bundle bundle, ca ca1)
    {
        o = cb1;
        super();
        a = i1;
        m = bundle;
        b = ca1;
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
            if (cb.a)
            {
                (new StringBuilder("  Starting: ")).append(this);
            }
            if (c == null && b != null)
            {
                c = b.a(a, m);
            }
            if (c != null)
            {
                if (c.getClass().isMemberClass() && !Modifier.isStatic(c.getClass().getModifiers()))
                {
                    throw new IllegalArgumentException((new StringBuilder("Object returned from onCreateLoader must not be a non-static inner member class: ")).append(c).toString());
                }
                if (!k)
                {
                    ei ei1 = c;
                    int i1 = a;
                    if (ei1.d != null)
                    {
                        throw new IllegalStateException("There is already a listener registered");
                    }
                    ei1.d = this;
                    ei1.c = i1;
                    ei1 = c;
                    if (ei1.e != null)
                    {
                        throw new IllegalStateException("There is already a listener registered");
                    }
                    ei1.e = this;
                    k = true;
                }
                c.e();
                return;
            }
        }
    }

    public final void a(ei ei1, Object obj)
    {
        Object obj2 = null;
        if (cb.a)
        {
            (new StringBuilder("onLoadComplete: ")).append(this);
        }
        if (!n)
        {
            Object obj1 = o.b;
            int i1 = a;
            i1 = jm.a(((ka) (obj1)).c, ((ka) (obj1)).e, i1);
            if (i1 < 0 || ((ka) (obj1)).d[i1] == ka.a)
            {
                obj1 = null;
            } else
            {
                obj1 = ((ka) (obj1)).d[i1];
            }
            if (obj1 == this)
            {
                obj1 = l;
                if (obj1 != null)
                {
                    if (cb.a)
                    {
                        (new StringBuilder("  Switching to pending loader: ")).append(obj1);
                    }
                    l = null;
                    o.b.a(a, null);
                    c();
                    o.a(((cc) (obj1)));
                    return;
                }
                if (f != obj || !d)
                {
                    f = obj;
                    d = true;
                    if (g)
                    {
                        b(ei1, obj);
                    }
                }
                obj = o.c;
                i1 = a;
                i1 = jm.a(((ka) (obj)).c, ((ka) (obj)).e, i1);
                ei1 = obj2;
                if (i1 >= 0)
                {
                    if (((ka) (obj)).d[i1] == ka.a)
                    {
                        ei1 = obj2;
                    } else
                    {
                        ei1 = ((ei) (((ka) (obj)).d[i1]));
                    }
                }
                ei1 = (cc)ei1;
                if (ei1 != null && ei1 != this)
                {
                    ei1.e = false;
                    ei1.c();
                    ei1 = o.c;
                    i1 = a;
                    i1 = jm.a(((ka) (ei1)).c, ((ka) (ei1)).e, i1);
                    if (i1 >= 0 && ((ka) (ei1)).d[i1] != ka.a)
                    {
                        ((ka) (ei1)).d[i1] = ka.a;
                        ei1.b = true;
                    }
                }
                if (cb.a(o) != null && !o.a())
                {
                    cb.a(o).d.h();
                    return;
                }
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
            printwriter.print(((cc) (s)).a);
            printwriter.print(" mArgs=");
            printwriter.println(((cc) (s)).m);
            printwriter.print(s1);
            printwriter.print("mCallbacks=");
            printwriter.println(((cc) (s)).b);
            printwriter.print(s1);
            printwriter.print("mLoader=");
            printwriter.println(((cc) (s)).c);
            if (((cc) (s)).c != null)
            {
                ((cc) (s)).c.a((new StringBuilder()).append(s1).append("  ").toString(), filedescriptor, printwriter, as);
            }
            if (((cc) (s)).d || ((cc) (s)).e)
            {
                printwriter.print(s1);
                printwriter.print("mHaveData=");
                printwriter.print(((cc) (s)).d);
                printwriter.print("  mDeliveredData=");
                printwriter.println(((cc) (s)).e);
                printwriter.print(s1);
                printwriter.print("mData=");
                printwriter.println(((cc) (s)).f);
            }
            printwriter.print(s1);
            printwriter.print("mStarted=");
            printwriter.print(((cc) (s)).g);
            printwriter.print(" mReportNextStart=");
            printwriter.print(((cc) (s)).j);
            printwriter.print(" mDestroyed=");
            printwriter.println(((cc) (s)).n);
            printwriter.print(s1);
            printwriter.print("mRetaining=");
            printwriter.print(((cc) (s)).h);
            printwriter.print(" mRetainingStarted=");
            printwriter.print(((cc) (s)).i);
            printwriter.print(" mListenerRegistered=");
            printwriter.println(((cc) (s)).k);
            if (((cc) (s)).l != null)
            {
                printwriter.print(s1);
                printwriter.println("Pending Loader ");
                printwriter.print(((cc) (s)).l);
                printwriter.println(":");
                s = ((cc) (s)).l;
                s1 = (new StringBuilder()).append(s1).append("  ").toString();
            } else
            {
                return;
            }
        } while (true);
    }

    final void b()
    {
        if (cb.a)
        {
            (new StringBuilder("  Stopping: ")).append(this);
        }
        g = false;
        if (!h && c != null && k)
        {
            k = false;
            c.a(this);
            c.a(this);
            c.i();
        }
    }

    final void b(ei ei1, Object obj)
    {
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_152;
        }
        String s;
        StringBuilder stringbuilder;
        StringBuilder stringbuilder1;
        if (cb.a(o) != null)
        {
            s = cb.a(o).d.j;
            cb.a(o).d.j = "onLoadFinished";
        } else
        {
            s = null;
        }
        if (cb.a)
        {
            stringbuilder = (new StringBuilder("  onLoadFinished in ")).append(ei1).append(": ");
            stringbuilder1 = new StringBuilder(64);
            b.a(obj, stringbuilder1);
            stringbuilder1.append("}");
            stringbuilder.append(stringbuilder1.toString());
        }
        b.a(ei1, obj);
        if (cb.a(o) != null)
        {
            cb.a(o).d.j = s;
        }
        e = true;
        return;
        ei1;
        if (cb.a(o) != null)
        {
            cb.a(o).d.j = s;
        }
        throw ei1;
    }

    final void c()
    {
        cc cc1 = this;
        do
        {
            if (cb.a)
            {
                (new StringBuilder("  Destroying: ")).append(cc1);
            }
            cc1.n = true;
            boolean flag = cc1.e;
            cc1.e = false;
            if (cc1.b != null && cc1.c != null && cc1.d && flag)
            {
                if (cb.a)
                {
                    (new StringBuilder("  Reseting: ")).append(cc1);
                }
                String s;
                if (cb.a(cc1.o) != null)
                {
                    s = cb.a(cc1.o).d.j;
                    cb.a(cc1.o).d.j = "onLoaderReset";
                } else
                {
                    s = null;
                }
                if (cb.a(cc1.o) != null)
                {
                    cb.a(cc1.o).d.j = s;
                }
            }
            cc1.b = null;
            cc1.f = null;
            cc1.d = false;
            if (cc1.c != null)
            {
                if (cc1.k)
                {
                    cc1.k = false;
                    cc1.c.a(cc1);
                    cc1.c.a(cc1);
                }
                cc1.c.m();
            }
            if (cc1.l != null)
            {
                cc1 = cc1.l;
            } else
            {
                return;
            }
        } while (true);
    }

    public final void d()
    {
        if (cb.a)
        {
            (new StringBuilder("onLoadCanceled: ")).append(this);
        }
        if (!n)
        {
            Object obj = o.b;
            int i1 = a;
            i1 = jm.a(((ka) (obj)).c, ((ka) (obj)).e, i1);
            if (i1 < 0 || ((ka) (obj)).d[i1] == ka.a)
            {
                obj = null;
            } else
            {
                obj = ((ka) (obj)).d[i1];
            }
            if (obj == this)
            {
                obj = l;
                if (obj != null)
                {
                    if (cb.a)
                    {
                        (new StringBuilder("  Switching to pending loader: ")).append(obj);
                    }
                    l = null;
                    o.b.a(a, null);
                    c();
                    o.a(((cc) (obj)));
                    return;
                }
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
        b.a(c, stringbuilder);
        stringbuilder.append("}}");
        return stringbuilder.toString();
    }
}
