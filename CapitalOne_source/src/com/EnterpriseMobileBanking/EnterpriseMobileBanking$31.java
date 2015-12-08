// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking;

import org.apache.cordova.CordovaWebView;
import org.apache.cordova.DroidGap;

// Referenced classes of package com.EnterpriseMobileBanking:
//            EnterpriseMobileBanking

class val.errorUrl
    implements Runnable
{

    final EnterpriseMobileBanking this$0;
    final String val$errorUrl;
    final DroidGap val$me;

    public void run()
    {
        val$me.spinnerStop();
        EnterpriseMobileBanking.access$1900(EnterpriseMobileBanking.this).showWebPage(val$errorUrl, false, true, null);
    }

    ()
    {
        this$0 = final_enterprisemobilebanking;
        val$me = droidgap;
        val$errorUrl = String.this;
        super();
    }
}
