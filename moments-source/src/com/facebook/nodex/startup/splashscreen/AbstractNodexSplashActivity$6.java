// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.nodex.startup.splashscreen;


// Referenced classes of package com.facebook.nodex.startup.splashscreen:
//            AbstractNodexSplashActivity

class a
    implements Runnable
{

    final AbstractNodexSplashActivity a;

    public void run()
    {
        a.finish();
        a.overridePendingTransition(0, 0);
    }

    (AbstractNodexSplashActivity abstractnodexsplashactivity)
    {
        a = abstractnodexsplashactivity;
        super();
    }
}
