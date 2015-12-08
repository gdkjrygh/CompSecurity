// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.web.fragment;

import com.pinterest.activity.pin.view.modules.util.VerifiedDomainUtil;

// Referenced classes of package com.pinterest.activity.web.fragment:
//            WebViewFragment

class this._cls0
    implements Runnable
{

    final WebViewFragment this$0;

    public void run()
    {
        VerifiedDomainUtil.showToastIfNecessary(WebViewFragment.access$1200(WebViewFragment.this));
    }

    omainUtil()
    {
        this$0 = WebViewFragment.this;
        super();
    }
}
