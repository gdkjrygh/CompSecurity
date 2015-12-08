// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bolts;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Referenced classes of package bolts:
//            g, a

final class f
{

    private static final f a = new f();
    private final ExecutorService b;
    private final Executor c = new g((byte)0);

    private f()
    {
        Object obj = System.getProperty("java.runtime.name");
        boolean flag;
        if (obj == null)
        {
            flag = false;
        } else
        {
            flag = ((String) (obj)).toLowerCase(Locale.US).contains("android");
        }
        if (!flag)
        {
            obj = Executors.newCachedThreadPool();
        } else
        {
            obj = bolts.a.a();
        }
        b = ((ExecutorService) (obj));
    }

    public static ExecutorService a()
    {
        return a.b;
    }

    static Executor b()
    {
        return a.c;
    }

}
