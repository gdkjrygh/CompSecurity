// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.nodex.startup.splashscreen;

import android.view.animation.Animation;
import com.facebook.tools.dextr.runtime.detour.HandlerDetour;

// Referenced classes of package com.facebook.nodex.startup.splashscreen:
//            AbstractNodexSplashActivity

class a
    implements android.view.animation.SplashActivity._cls3
{

    final long a;
    final AbstractNodexSplashActivity b;

    public void onAnimationEnd(Animation animation)
    {
        HandlerDetour.b(b.b, AbstractNodexSplashActivity.c(b), a, 0x3093ff7b);
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
