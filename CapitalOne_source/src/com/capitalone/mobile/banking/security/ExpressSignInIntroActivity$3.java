// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.capitalone.mobile.banking.security;

import com.EnterpriseMobileBanking.Plugins.Components.AppHeader;

// Referenced classes of package com.capitalone.mobile.banking.security:
//            ExpressSignInIntroActivity

class this._cls0
    implements Runnable
{

    final ExpressSignInIntroActivity this$0;

    public void run()
    {
        ExpressSignInIntroActivity.access$000(ExpressSignInIntroActivity.this).setAppHeaderDisabled(false);
    }

    I()
    {
        this$0 = ExpressSignInIntroActivity.this;
        super();
    }
}
