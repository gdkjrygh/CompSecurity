// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking;

import com.EnterpriseMobileBanking.Plugins.COFBusy;
import com.EnterpriseMobileBanking.Plugins.COFBusyIndicator;

// Referenced classes of package com.EnterpriseMobileBanking:
//            EnterpriseMobileBanking

class this._cls0
    implements Runnable
{

    final EnterpriseMobileBanking this$0;

    public void run()
    {
        COFBusy cofbusy = COFBusyIndicator.getBusy();
        if (cofbusy != null && !EnterpriseMobileBanking.access$1800())
        {
            cofbusy.forceHide();
        }
    }

    ()
    {
        this$0 = EnterpriseMobileBanking.this;
        super();
    }
}
