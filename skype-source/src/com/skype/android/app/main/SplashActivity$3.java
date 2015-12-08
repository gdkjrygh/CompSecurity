// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.main;

import android.animation.ObjectAnimator;

// Referenced classes of package com.skype.android.app.main:
//            SplashActivity

final class val.animator
    implements Runnable
{

    final SplashActivity this$0;
    final ObjectAnimator val$animator;

    public final void run()
    {
        val$animator.start();
    }

    ()
    {
        this$0 = final_splashactivity;
        val$animator = ObjectAnimator.this;
        super();
    }
}
