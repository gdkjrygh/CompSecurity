// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cx;

import com.pandora.radio.util.b;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ab
{
    public static class a extends b
    {

        private static ExecutorService a;

        public static ExecutorService a()
        {
            if (a == null)
            {
                return Executors.newFixedThreadPool(2);
            } else
            {
                return a;
            }
        }
    }


    private static volatile ab a;
    private ExecutorService b;

    private ab()
    {
        b = a.a();
    }

    public static ab a()
    {
        if (a == null)
        {
            a = new ab();
        }
        return a;
    }

    public static void b()
    {
        if (a != null)
        {
            if (a.b != null)
            {
                a.b.shutdownNow();
                a.b = null;
            }
            a = null;
        }
    }

    public Future a(Runnable runnable)
    {
        return b.submit(runnable);
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        throw new CloneNotSupportedException();
    }
}
