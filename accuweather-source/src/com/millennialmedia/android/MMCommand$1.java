// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;


// Referenced classes of package com.millennialmedia.android:
//            MMCommand, MMWebView, MMJSResponse

class 
    implements Runnable
{

    final MMCommand this$0;
    final MMJSResponse val$resp;
    final MMWebView val$webViewCallback;

    public void run()
    {
        if (MMCommand.access$000(MMCommand.this).equals("expandWithProperties"))
        {
            val$webViewCallback.isExpanding = true;
        }
        String s = String.format("javascript:%s(%s);", new Object[] {
            MMCommand.access$100(MMCommand.this), val$resp.toJSONString()
        });
        val$webViewCallback.loadUrl(s);
    }

    ()
    {
        this$0 = final_mmcommand;
        val$webViewCallback = mmwebview;
        val$resp = MMJSResponse.this;
        super();
    }
}
