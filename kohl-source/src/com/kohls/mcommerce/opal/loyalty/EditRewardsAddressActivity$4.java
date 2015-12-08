// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.loyalty;

import android.view.View;

// Referenced classes of package com.kohls.mcommerce.opal.loyalty:
//            EditRewardsAddressActivity

class this._cls0
    implements android.view.dsAddressActivity._cls4
{

    final EditRewardsAddressActivity this$0;

    public void onFocusChange(View view, boolean flag)
    {
        if (flag)
        {
            findViewById(0x7f0d004a).setVisibility(8);
            return;
        } else
        {
            findViewById(0x7f0d004a).setVisibility(0);
            return;
        }
    }

    ()
    {
        this$0 = EditRewardsAddressActivity.this;
        super();
    }
}
