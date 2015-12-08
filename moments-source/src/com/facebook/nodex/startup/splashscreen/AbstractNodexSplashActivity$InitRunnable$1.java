// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.nodex.startup.splashscreen;


// Referenced classes of package com.facebook.nodex.startup.splashscreen:
//            AbstractNodexSplashActivity

class a
    implements Runnable
{

    final long a;
    final b b;

    public void run()
    {
        (new StringBuilder("InitRunnable ")).append((int)((double)(System.nanoTime() - a) / 1000000D)).append(" ms");
        AbstractNodexSplashActivity.j(b.b);
    }

    ( , long l)
    {
        b = ;
        a = l;
        super();
    }
}
