// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking.Plugins;

import com.EnterpriseMobileBanking.AppHelper;

// Referenced classes of package com.EnterpriseMobileBanking.Plugins:
//            WebViewLinker

class val.enabled
    implements Runnable
{

    final WebViewLinker this$0;
    final boolean val$enabled;
    final WebViewLinker val$me;

    public void run()
    {
        synchronized (val$me)
        {
            AppHelper.changeButtonImage(val$enabled);
            AppHelper.setNavigationEnabled(val$enabled);
        }
        return;
        exception;
        webviewlinker;
        JVM INSTR monitorexit ;
        throw exception;
    }

    _cls9()
    {
        this$0 = final_webviewlinker;
        val$me = webviewlinker1;
        val$enabled = Z.this;
        super();
    }
}
