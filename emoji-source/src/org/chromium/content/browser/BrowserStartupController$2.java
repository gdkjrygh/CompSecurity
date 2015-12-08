// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;


// Referenced classes of package org.chromium.content.browser:
//            BrowserStartupController

class artupCallback
    implements Runnable
{

    final BrowserStartupController this$0;
    final artupCallback val$callback;

    public void run()
    {
        if (BrowserStartupController.access$100(BrowserStartupController.this))
        {
            val$callback.onSuccess(true);
            return;
        } else
        {
            val$callback.onFailure();
            return;
        }
    }

    artupCallback()
    {
        this$0 = final_browserstartupcontroller;
        val$callback = artupCallback.this;
        super();
    }
}
