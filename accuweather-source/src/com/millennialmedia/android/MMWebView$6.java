// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;


// Referenced classes of package com.millennialmedia.android:
//            MMWebView

class val.url
    implements Runnable
{

    final MMWebView this$0;
    final String val$url;

    public void run()
    {
        loadUrl(val$url);
    }

    ()
    {
        this$0 = final_mmwebview;
        val$url = String.this;
        super();
    }
}
