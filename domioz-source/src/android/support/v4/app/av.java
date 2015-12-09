// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Bundle;
import android.support.v4.content.i;
import android.support.v4.content.j;
import android.support.v4.e.d;
import android.support.v4.e.q;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

// Referenced classes of package android.support.v4.app:
//            au, at, FragmentActivity, x

final class av
    implements j
{

    final int a;
    final Bundle b = null;
    at c;
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
    av n;
    final au o;

    public av(au au1, int i1, at at1)
    {
        o = au1;
        super();
        a = i1;
        c = at1;
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
            if (au.a)
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
                    d.a(a, this);
                    m = true;
                }
                d.d();
                return;
            }
        }
    }

    public final void a(i i1, Object obj)
    {
        if (au.a)
        {
            Log.v("LoaderManager", (new StringBuilder("onLoadComplete: ")).append(this).toString());
        }
        if (!l) goto _L2; else goto _L1
_L1:
        if (au.a)
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
        if (au.a)
        {
            Log.v("LoaderManager", "  Ignoring load complete -- not active");
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        av av1 = n;
        if (av1 != null)
        {
            if (au.a)
            {
                Log.v("LoaderManager", (new StringBuilder("  Switching to pending loader: ")).append(av1).toString());
            }
            n = null;
            o.b.a(a, null);
            c();
            o.a(av1);
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
        i1 = (av)o.c.a(a);
        if (i1 != null && i1 != this)
        {
            i1.f = false;
            i1.c();
            o.c.b(a);
        }
        if (o.e != null && !o.b())
        {
            o.e.mFragments.g();
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
            printwriter.print(((av) (s)).a);
            printwriter.print(" mArgs=");
            printwriter.println(((av) (s)).b);
            printwriter.print(s1);
            printwriter.print("mCallbacks=");
            printwriter.println(((av) (s)).c);
            printwriter.print(s1);
            printwriter.print("mLoader=");
            printwriter.println(((av) (s)).d);
            if (((av) (s)).d != null)
            {
                ((av) (s)).d.a((new StringBuilder()).append(s1).append("  ").toString(), filedescriptor, printwriter, as);
            }
            if (((av) (s)).e || ((av) (s)).f)
            {
                printwriter.print(s1);
                printwriter.print("mHaveData=");
                printwriter.print(((av) (s)).e);
                printwriter.print("  mDeliveredData=");
                printwriter.println(((av) (s)).f);
                printwriter.print(s1);
                printwriter.print("mData=");
                printwriter.println(((av) (s)).g);
            }
            printwriter.print(s1);
            printwriter.print("mStarted=");
            printwriter.print(((av) (s)).h);
            printwriter.print(" mReportNextStart=");
            printwriter.print(((av) (s)).k);
            printwriter.print(" mDestroyed=");
            printwriter.println(((av) (s)).l);
            printwriter.print(s1);
            printwriter.print("mRetaining=");
            printwriter.print(((av) (s)).i);
            printwriter.print(" mRetainingStarted=");
            printwriter.print(((av) (s)).j);
            printwriter.print(" mListenerRegistered=");
            printwriter.println(((av) (s)).m);
            if (((av) (s)).n != null)
            {
                printwriter.print(s1);
                printwriter.println("Pending Loader ");
                printwriter.print(((av) (s)).n);
                printwriter.println(":");
                s = ((av) (s)).n;
                s1 = (new StringBuilder()).append(s1).append("  ").toString();
            } else
            {
                return;
            }
        } while (true);
    }

    final void b()
    {
        if (au.a)
        {
            Log.v("LoaderManager", (new StringBuilder("  Stopping: ")).append(this).toString());
        }
        h = false;
        if (!i && d != null && m)
        {
            m = false;
            d.a(this);
            d.f();
        }
    }

    final void b(i i1, Object obj)
    {
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_159;
        }
        String s;
        StringBuilder stringbuilder;
        StringBuilder stringbuilder1;
        if (o.e != null)
        {
            s = o.e.mFragments.u;
            o.e.mFragments.u = "onLoadFinished";
        } else
        {
            s = null;
        }
        if (au.a)
        {
            stringbuilder = (new StringBuilder("  onLoadFinished in ")).append(i1).append(": ");
            stringbuilder1 = new StringBuilder(64);
            android.support.v4.e.d.a(obj, stringbuilder1);
            stringbuilder1.append("}");
            Log.v("LoaderManager", stringbuilder.append(stringbuilder1.toString()).toString());
        }
        c.a(i1, obj);
        if (o.e != null)
        {
            o.e.mFragments.u = s;
        }
        f = true;
        return;
        i1;
        if (o.e != null)
        {
            o.e.mFragments.u = s;
        }
        throw i1;
    }

    final void c()
    {
        av av1 = this;
        do
        {
            if (au.a)
            {
                Log.v("LoaderManager", (new StringBuilder("  Destroying: ")).append(av1).toString());
            }
            av1.l = true;
            boolean flag = av1.f;
            av1.f = false;
            if (av1.c != null && av1.d != null && av1.e && flag)
            {
                if (au.a)
                {
                    Log.v("LoaderManager", (new StringBuilder("  Reseting: ")).append(av1).toString());
                }
                String s;
                if (av1.o.e != null)
                {
                    s = av1.o.e.mFragments.u;
                    av1.o.e.mFragments.u = "onLoaderReset";
                } else
                {
                    s = null;
                }
                if (av1.o.e != null)
                {
                    av1.o.e.mFragments.u = s;
                }
            }
            av1.c = null;
            av1.g = null;
            av1.e = false;
            if (av1.d != null)
            {
                if (av1.m)
                {
                    av1.m = false;
                    av1.d.a(av1);
                }
                av1.d.i();
            }
            if (av1.n != null)
            {
                av1 = av1.n;
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
        android.support.v4.e.d.a(d, stringbuilder);
        stringbuilder.append("}}");
        return stringbuilder.toString();
    }
}
