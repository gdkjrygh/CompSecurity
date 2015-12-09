// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking;

import android.webkit.WebChromeClient;

// Referenced classes of package com.EnterpriseMobileBanking:
//            EnterpriseMobileBanking

class this._cls0 extends WebChromeClient
{

    final EnterpriseMobileBanking this$0;

    public void onGeolocationPermissionsShowPrompt(String s, android.webkit.lback lback)
    {
        lback.invoke(s, true, false);
    }

    ()
    {
        this$0 = EnterpriseMobileBanking.this;
        super();
    }
}
