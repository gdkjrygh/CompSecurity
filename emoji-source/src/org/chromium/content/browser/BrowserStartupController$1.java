// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;


// Referenced classes of package org.chromium.content.browser:
//            BrowserStartupController

class val.alreadyStarted
    implements Runnable
{

    final BrowserStartupController this$0;
    final boolean val$alreadyStarted;
    final int val$startupFailure;

    public void run()
    {
        BrowserStartupController.access$000(BrowserStartupController.this, val$startupFailure, val$alreadyStarted);
    }

    ()
    {
        this$0 = final_browserstartupcontroller;
        val$startupFailure = i;
        val$alreadyStarted = Z.this;
        super();
    }
}
