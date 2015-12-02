// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.nodex.startup.splashscreen;

import android.view.View;
import android.view.animation.Animation;

// Referenced classes of package com.facebook.nodex.startup.splashscreen:
//            AbstractNodexSplashActivity

class a
    implements Runnable
{

    final Animation a;
    final AbstractNodexSplashActivity b;

    public void run()
    {
        AbstractNodexSplashActivity.d(b).startAnimation(a);
    }

    (AbstractNodexSplashActivity abstractnodexsplashactivity, Animation animation)
    {
        b = abstractnodexsplashactivity;
        a = animation;
        super();
    }
}
