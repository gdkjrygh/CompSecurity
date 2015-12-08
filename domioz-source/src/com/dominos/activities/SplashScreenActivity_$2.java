// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;


// Referenced classes of package com.dominos.activities:
//            SplashScreenActivity_

class val.message
    implements Runnable
{

    final SplashScreenActivity_ this$0;
    final int val$errorCode;
    final String val$message;

    public void run()
    {
        SplashScreenActivity_.access$101(SplashScreenActivity_.this, val$errorCode, val$message);
    }

    ()
    {
        this$0 = final_splashscreenactivity_;
        val$errorCode = i;
        val$message = String.this;
        super();
    }
}
