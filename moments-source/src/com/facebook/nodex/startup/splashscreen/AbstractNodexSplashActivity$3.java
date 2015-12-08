// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.nodex.startup.splashscreen;

import android.os.Handler;
import android.view.animation.Animation;

// Referenced classes of package com.facebook.nodex.startup.splashscreen:
//            AbstractNodexSplashActivity

class a
    implements android.view.animation.SplashActivity._cls3
{

    final long a;
    final AbstractNodexSplashActivity b;

    public void onAnimationEnd(Animation animation)
    {
        b.b.postDelayed(AbstractNodexSplashActivity.c(b), a);
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }

    (AbstractNodexSplashActivity abstractnodexsplashactivity, long l)
    {
        b = abstractnodexsplashactivity;
        a = l;
        super();
    }
}
