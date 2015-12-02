// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Bundle;
import android.support.v4.a.c;
import android.support.v4.a.d;
import android.support.v4.c.a;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

// Referenced classes of package android.support.v4.app:
//            ai, ah, p, s

final class aj
    implements d
{

    final int a;
    final Bundle b;
    ah c;
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
    aj n;
    final ai o;

    public aj(ai ai1, int i1, Bundle bundle, ah ah1)
    {
        o = ai1;
        super();
        a = i1;
        b = bundle;
        c = ah1;
    }

    void a()
    {
        if (i && j)
        {
            h = true;
        } else
        if (!h)
        {
            h = true;
            if (android.support.v4.app.ai.a)
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
                d.h();
                return;
            }
        }
    }

    public void a(c c1, Object obj)
    {
        if (android.support.v4.app.ai.a)
        {
            Log.v("LoaderManager", (new StringBuilder()).append("onLoadComplete: ").append(this).toString());
        }
        if (!l) goto _L2; else goto _L1
_L1:
        if (android.support.v4.app.ai.a)
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
        if (android.support.v4.app.ai.a)
        {
            Log.v("LoaderManager", "  Ignoring load complete -- not active");
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        aj aj1 = n;
        if (aj1 != null)
        {
            if (android.support.v4.app.ai.a)
            {
                Log.v("LoaderManager", (new StringBuilder()).append("  Switching to pending loader: ").append(aj1).toString());
            }
            n = null;
            o.b.b(a, null);
            f();
            o.a(aj1);
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
        c1 = (aj)o.c.a(a);
        if (c1 != null && c1 != this)
        {
            c1.f = false;
            c1.f();
            o.c.c(a);
        }
        if (o.e != null && !o.a())
        {
            o.e.g().g();
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public void a(String s1, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        printwriter.print(s1);
        printwriter.print("mId=");
        printwriter.print(a);
        printwriter.print(" mArgs=");
        printwriter.println(b);
        printwriter.print(s1);
        printwriter.print("mCallbacks=");
        printwriter.println(c);
        printwriter.print(s1);
        printwriter.print("mLoader=");
        printwriter.println(d);
        if (d != null)
        {
            d.a((new StringBuilder()).append(s1).append("  ").toString(), filedescriptor, printwriter, as);
        }
        if (e || f)
        {
            printwriter.print(s1);
            printwriter.print("mHaveData=");
            printwriter.print(e);
            printwriter.print("  mDeliveredData=");
            printwriter.println(f);
            printwriter.print(s1);
            printwriter.print("mData=");
            printwriter.println(g);
        }
        printwriter.print(s1);
        printwriter.print("mStarted=");
        printwriter.print(h);
        printwriter.print(" mReportNextStart=");
        printwriter.print(k);
        printwriter.print(" mDestroyed=");
        printwriter.println(l);
        printwriter.print(s1);
        printwriter.print("mRetaining=");
        printwriter.print(i);
        printwriter.print(" mRetainingStarted=");
        printwriter.print(j);
        printwriter.print(" mListenerRegistered=");
        printwriter.println(m);
        if (n != null)
        {
            printwriter.print(s1);
            printwriter.println("Pending Loader ");
            printwriter.print(n);
            printwriter.println(":");
            n.a((new StringBuilder()).append(s1).append("  ").toString(), filedescriptor, printwriter, as);
        }
    }

    void b()
    {
        if (android.support.v4.app.ai.a)
        {
            Log.v("LoaderManager", (new StringBuilder()).append("  Retaining: ").append(this).toString());
        }
        i = true;
        j = h;
        h = false;
        c = null;
    }

    void b(c c1, Object obj)
    {
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_130;
        }
        String s1;
        if (o.e != null)
        {
            s1 = o.e.g().u;
            o.e.g().u = "onLoadFinished";
        } else
        {
            s1 = null;
        }
        if (android.support.v4.app.ai.a)
        {
            Log.v("LoaderManager", (new StringBuilder()).append("  onLoadFinished in ").append(c1).append(": ").append(c1.c(obj)).toString());
        }
        c.a(c1, obj);
        if (o.e != null)
        {
            o.e.g().u = s1;
        }
        f = true;
        return;
        c1;
        if (o.e != null)
        {
            o.e.g().u = s1;
        }
        throw c1;
    }

    void c()
    {
        if (i)
        {
            if (android.support.v4.app.ai.a)
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
        if (android.support.v4.app.ai.a)
        {
            Log.v("LoaderManager", (new StringBuilder()).append("  Stopping: ").append(this).toString());
        }
        h = false;
        if (!i && d != null && m)
        {
            m = false;
            d.a(this);
            d.k();
        }
    }

    void f()
    {
        if (android.support.v4.app.ai.a)
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
        if (android.support.v4.app.ai.a)
        {
            Log.v("LoaderManager", (new StringBuilder()).append("  Reseting: ").append(this).toString());
        }
        String s1;
        Exception exception;
        if (o.e != null)
        {
            s1 = o.e.g().u;
            o.e.g().u = "onLoaderReset";
        } else
        {
            s1 = null;
        }
        c.a(d);
        if (o.e != null)
        {
            o.e.g().u = s1;
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
            d.o();
        }
        if (n != null)
        {
            n.f();
        }
        return;
        exception;
        if (o.e != null)
        {
            o.e.g().u = s1;
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
        android.support.v4.c.a.a(d, stringbuilder);
        stringbuilder.append("}}");
        return stringbuilder.toString();
    }
}
