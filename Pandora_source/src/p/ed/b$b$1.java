// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ed;


// Referenced classes of package p.ed:
//            b

class bject
    implements .UncaughtExceptionHandler
{

    final b a;
    final hrowable b;

    public void uncaughtException(Thread thread, Throwable throwable)
    {
        Thread.getDefaultUncaughtExceptionHandler().uncaughtException(thread, throwable);
    }

    hrowable(hrowable hrowable, b b1)
    {
        b = hrowable;
        a = b1;
        super();
    }
}
