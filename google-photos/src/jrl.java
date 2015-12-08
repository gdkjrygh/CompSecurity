// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jrl
    implements Thread.UncaughtExceptionHandler
{

    private jrk a;

    jrl(jrk jrk1)
    {
        a = jrk1;
        super();
    }

    public final void uncaughtException(Thread thread, Throwable throwable)
    {
        thread = a.e;
        if (thread != null)
        {
            thread.e("Job execution failed", throwable);
        }
    }
}
