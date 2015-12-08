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
//            v, l, n

final class c
    implements android.support.v4.b.a, android.support.v4.b.a
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
    tring n;
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
        d d1 = n;
        if (d1 != null)
        {
            if (v.a)
            {
                Log.v("LoaderManager", (new StringBuilder("  Switching to pending loader: ")).append(d1).toString());
            }
            n = null;
            o.b.a(a, null);
            c();
            o.a(d1);
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
        c1 = (b)o.c.a(a);
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
            printwriter.print(((o) (s)).a);
            printwriter.print(" mArgs=");
            printwriter.println((() (s)).b);
            printwriter.print(s1);
            printwriter.print("mCallbacks=");
            printwriter.println((() (s)).c);
            printwriter.print(s1);
            printwriter.print("mLoader=");
            printwriter.println((() (s)).d);
            if (((d) (s)).d != null)
            {
                ((d) (s)).d.a((new StringBuilder()).append(s1).append("  ").toString(), filedescriptor, printwriter, as);
            }
            if (((tring) (s)).e || ((e) (s)).f)
            {
                printwriter.print(s1);
                printwriter.print("mHaveData=");
                printwriter.print(((f) (s)).e);
                printwriter.print("  mDeliveredData=");
                printwriter.println((() (s)).f);
                printwriter.print(s1);
                printwriter.print("mData=");
                printwriter.println((() (s)).g);
            }
            printwriter.print(s1);
            printwriter.print("mStarted=");
            printwriter.print(((g) (s)).h);
            printwriter.print(" mReportNextStart=");
            printwriter.print(((h) (s)).k);
            printwriter.print(" mDestroyed=");
            printwriter.println((() (s)).l);
            printwriter.print(s1);
            printwriter.print("mRetaining=");
            printwriter.print(((l) (s)).i);
            printwriter.print(" mRetainingStarted=");
            printwriter.print(((i) (s)).j);
            printwriter.print(" mListenerRegistered=");
            printwriter.println((() (s)).m);
            if (((m) (s)).n != null)
            {
                printwriter.print(s1);
                printwriter.println("Pending Loader ");
                printwriter.print((() (s)).n);
                printwriter.println(":");
                s = (() (s)).n;
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
        o o1 = this;
        do
        {
            if (v.a)
            {
                Log.v("LoaderManager", (new StringBuilder("  Destroying: ")).append(o1).toString());
            }
            o1.l = true;
            boolean flag = o1.f;
            o1.f = false;
            if (o1.c != null && o1.d != null && o1.e && flag)
            {
                if (v.a)
                {
                    Log.v("LoaderManager", (new StringBuilder("  Reseting: ")).append(o1).toString());
                }
                Object obj;
                if (v.a(o1.o) != null)
                {
                    obj = v.a(o1.o).f.u;
                    v.a(o1.o).f.u = "onLoaderReset";
                } else
                {
                    obj = null;
                }
                if (v.a(o1.o) != null)
                {
                    v.a(o1.o).f.u = ((String) (obj));
                }
            }
            o1.c = null;
            o1.g = null;
            o1.e = false;
            if (o1.d != null)
            {
                if (o1.m)
                {
                    o1.m = false;
                    o1.d.a(o1);
                    o1.d.a(o1);
                }
                obj = o1.d;
                ((c) (obj)).c();
                obj.g = true;
                obj.e = false;
                obj.f = false;
                obj.h = false;
                obj.i = false;
            }
            if (o1.n != null)
            {
                o1 = o1.n;
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

    public tion(v v1, int i1, tion tion)
    {
        o = v1;
        super();
        a = i1;
        c = tion;
    }
}
