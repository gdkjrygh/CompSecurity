// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;


// Referenced classes of package org.chromium.base:
//            JavaHandlerThread

final class b
    implements Runnable
{

    private long a;
    private long b;
    private JavaHandlerThread c;

    public final void run()
    {
        JavaHandlerThread.a(c, a, b);
    }

    (JavaHandlerThread javahandlerthread, long l, long l1)
    {
        c = javahandlerthread;
        a = l;
        b = l1;
        super();
    }
}
