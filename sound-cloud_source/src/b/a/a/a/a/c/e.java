// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a.a.c;


final class e
    implements Runnable
{

    final Runnable a;
    final a.c b;

    e(a.c c, Runnable runnable)
    {
        b = c;
        a = runnable;
        super();
    }

    public final void run()
    {
        a.run();
        b.a();
        return;
        Exception exception;
        exception;
        b.a();
        throw exception;
    }
}
