// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;


// Referenced classes of package com.dominos.activities:
//            SplashScreenActivity_

class r
    implements Runnable
{

    final SplashScreenActivity_ this$0;
    final android.content.Listener val$cancelListener;
    final int val$playServiceStatusCode;

    public void run()
    {
        SplashScreenActivity_.access$201(SplashScreenActivity_.this, val$playServiceStatusCode, val$cancelListener);
    }

    r()
    {
        this$0 = final_splashscreenactivity_;
        val$playServiceStatusCode = i;
        val$cancelListener = android.content.Listener.this;
        super();
    }
}
