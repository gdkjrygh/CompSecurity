// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking;

import android.view.View;

// Referenced classes of package com.EnterpriseMobileBanking:
//            AppRelContainer, AppHelper

class this._cls0
    implements Runnable
{

    final AppRelContainer this$0;

    public void run()
    {
        AppHelper.findAppViewById(0x7f0800b0).requestFocus();
    }

    ()
    {
        this$0 = AppRelContainer.this;
        super();
    }
}
