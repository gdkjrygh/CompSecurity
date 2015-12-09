// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import android.util.Log;
import java.util.concurrent.ExecutorService;

// Referenced classes of package b.a:
//            ev, di, fb, fa, 
//            ei

public final class eu
{

    public static ev a;
    private static fa b;

    public static void a()
    {
    }

    public static void a(fa fa1)
    {
        b = fa1;
    }

    public static void a(String s)
    {
        Log.i("Crittercism", s);
    }

    public static void a(String s, Throwable throwable)
    {
        Log.e("Crittercism", s, throwable);
    }

    public static void a(Throwable throwable)
    {
        if (throwable instanceof di)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        fa fa1 = b;
        if (b != null && a == ev.b)
        {
            fa fa2 = b;
            throwable = new fb(fa2, throwable, Thread.currentThread().getId());
            if (!fa2.c.a(throwable))
            {
                fa2.b.execute(throwable);
            }
        }
        return;
        throwable;
        throw throwable;
        throwable;
    }

    public static void b()
    {
    }

    public static void b(String s)
    {
        Log.e("Crittercism", s);
    }

    public static void b(String s, Throwable throwable)
    {
        Log.w("Crittercism", s, throwable);
    }

    public static void c()
    {
    }

    public static void c(String s)
    {
        Log.w("Crittercism", s);
    }

    static 
    {
        a = ev.a;
    }
}
