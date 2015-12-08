// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a.a.c;

import java.util.concurrent.ThreadFactory;

// Referenced classes of package b.a.a.a.a.c:
//            p

protected static final class 
    implements ThreadFactory
{

    private final int a = 10;

    public final Thread newThread(Runnable runnable)
    {
        runnable = new Thread(runnable);
        runnable.setPriority(a);
        runnable.setName("Queue");
        return runnable;
    }

    public ()
    {
    }
}
