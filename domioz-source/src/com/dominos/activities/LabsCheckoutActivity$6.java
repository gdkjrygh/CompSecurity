// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.view.View;
import com.dominos.android.sdk.common.LogUtil;
import com.dominos.fragments.GoogleFullWalletFragment;

// Referenced classes of package com.dominos.activities:
//            LabsCheckoutActivity

class this._cls0
    implements android.view.ctivity._cls6
{

    final LabsCheckoutActivity this$0;

    public void onClick(View view)
    {
        LogUtil.d(LabsCheckoutActivity.access$600(), "Clicked the change button", new Object[0]);
        if (LabsCheckoutActivity.access$700(LabsCheckoutActivity.this) != null)
        {
            LabsCheckoutActivity.access$700(LabsCheckoutActivity.this).changeMaskedWallet();
        }
    }

    ()
    {
        this$0 = LabsCheckoutActivity.this;
        super();
    }
}
