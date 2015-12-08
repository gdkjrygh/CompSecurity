// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.main;

import android.graphics.drawable.AnimationDrawable;

// Referenced classes of package com.skype.android.app.main:
//            SplashActivity

final class val.animation
    implements Runnable
{

    final SplashActivity this$0;
    final AnimationDrawable val$animation;

    public final void run()
    {
        if (!val$animation.isRunning())
        {
            val$animation.stop();
        }
        val$animation.start();
    }

    ()
    {
        this$0 = final_splashactivity;
        val$animation = AnimationDrawable.this;
        super();
    }
}
