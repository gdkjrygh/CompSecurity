// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Bundle;
import android.support.v4.content.c;
import android.support.v4.content.d;
import android.util.Log;
import java.io.PrintWriter;

// Referenced classes of package android.support.v4.app:
//            w, FragmentActivity, m, v

final class x
    implements d
{

    final int a;
    final Bundle b;
    v c;
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
    x n;
    final w o;

    final void a()
    {
        if (w.a)
        {
            Log.v("LoaderManager", (new StringBuilder("  Stopping: ")).append(this).toString());
        }
        h = false;
        if (!i && d != null && m)
        {
            m = false;
            d.a(this);
            d.b();
        }
    }

    final void a(c c1, Object obj)
    {
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_148;
        }
        String s;
        StringBuilder stringbuilder;
        if (o.e != null)
        {
            s = o.e.b.u;
            o.e.b.u = "onLoadFinished";
        } else
        {
            s = null;
        }
        if (w.a)
        {
            c1 = (new StringBuilder("  onLoadFinished in ")).append(c1).append(": ");
            stringbuilder = new StringBuilder(64);
            android.support.v4.b.d.a(obj, stringbuilder);
            stringbuilder.append("}");
            Log.v("LoaderManager", c1.append(stringbuilder.toString()).toString());
        }
        c1 = c;
        if (o.e != null)
        {
            o.e.b.u = s;
        }
        f = true;
        return;
        c1;
        if (o.e != null)
        {
            o.e.b.u = s;
        }
        throw c1;
    }

    public final void a(String s, PrintWriter printwriter)
    {
        String s1 = s;
        s = this;
        do
        {
            printwriter.print(s1);
            printwriter.print("mId=");
            printwriter.print(((x) (s)).a);
            printwriter.print(" mArgs=");
            printwriter.println(((x) (s)).b);
            printwriter.print(s1);
            printwriter.print("mCallbacks=");
            printwriter.println(((x) (s)).c);
            printwriter.print(s1);
            printwriter.print("mLoader=");
            printwriter.println(((x) (s)).d);
            if (((x) (s)).d != null)
            {
                ((x) (s)).d.a((new StringBuilder()).append(s1).append("  ").toString(), printwriter);
            }
            if (((x) (s)).e || ((x) (s)).f)
            {
                printwriter.print(s1);
                printwriter.print("mHaveData=");
                printwriter.print(((x) (s)).e);
                printwriter.print("  mDeliveredData=");
                printwriter.println(((x) (s)).f);
                printwriter.print(s1);
                printwriter.print("mData=");
                printwriter.println(((x) (s)).g);
            }
            printwriter.print(s1);
            printwriter.print("mStarted=");
            printwriter.print(((x) (s)).h);
            printwriter.print(" mReportNextStart=");
            printwriter.print(((x) (s)).k);
            printwriter.print(" mDestroyed=");
            printwriter.println(((x) (s)).l);
            printwriter.print(s1);
            printwriter.print("mRetaining=");
            printwriter.print(((x) (s)).i);
            printwriter.print(" mRetainingStarted=");
            printwriter.print(((x) (s)).j);
            printwriter.print(" mListenerRegistered=");
            printwriter.println(((x) (s)).m);
            if (((x) (s)).n != null)
            {
                printwriter.print(s1);
                printwriter.println("Pending Loader ");
                printwriter.print(((x) (s)).n);
                printwriter.println(":");
                s = ((x) (s)).n;
                s1 = (new StringBuilder()).append(s1).append("  ").toString();
            } else
            {
                return;
            }
        } while (true);
    }

    final void b()
    {
        x x1 = this;
_L2:
        if (w.a)
        {
            Log.v("LoaderManager", (new StringBuilder("  Destroying: ")).append(x1).toString());
        }
        x1.l = true;
        boolean flag = x1.f;
        x1.f = false;
        if (x1.c == null || x1.d == null || !x1.e || !flag)
        {
            break MISSING_BLOCK_LABEL_173;
        }
        if (w.a)
        {
            Log.v("LoaderManager", (new StringBuilder("  Reseting: ")).append(x1).toString());
        }
        String s;
        Object obj;
        Exception exception;
        if (x1.o.e != null)
        {
            s = x1.o.e.b.u;
            x1.o.e.b.u = "onLoaderReset";
        } else
        {
            s = null;
        }
        obj = x1.c;
        obj = x1.d;
        if (x1.o.e != null)
        {
            x1.o.e.b.u = s;
        }
        x1.c = null;
        x1.g = null;
        x1.e = false;
        if (x1.d != null)
        {
            if (x1.m)
            {
                x1.m = false;
                x1.d.a(x1);
            }
            x1.d.c();
        }
        if (x1.n != null)
        {
            x1 = x1.n;
        } else
        {
            return;
        }
        if (true) goto _L2; else goto _L1
_L1:
        exception;
        if (x1.o.e != null)
        {
            x1.o.e.b.u = s;
        }
        throw exception;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(64);
        stringbuilder.append("LoaderInfo{");
        stringbuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringbuilder.append(" #");
        stringbuilder.append(a);
        stringbuilder.append(" : ");
        android.support.v4.b.d.a(d, stringbuilder);
        stringbuilder.append("}}");
        return stringbuilder.toString();
    }
}
