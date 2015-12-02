// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.a;

import java.util.concurrent.CountDownLatch;

// Referenced classes of package android.support.v4.a:
//            i, a

final class b extends i
    implements Runnable
{

    Object a;
    boolean b;
    final a c;
    private CountDownLatch e;

    b(a a1)
    {
        c = a1;
        super();
        e = new CountDownLatch(1);
    }

    protected volatile Object a(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected transient Object a(Void avoid[])
    {
        a = c.e();
        return a;
    }

    protected void a()
    {
        c.a(this, a);
        e.countDown();
        return;
        Exception exception;
        exception;
        e.countDown();
        throw exception;
    }

    protected void a(Object obj)
    {
        c.b(this, obj);
        e.countDown();
        return;
        obj;
        e.countDown();
        throw obj;
    }

    public void run()
    {
        b = false;
        c.c();
    }
}
