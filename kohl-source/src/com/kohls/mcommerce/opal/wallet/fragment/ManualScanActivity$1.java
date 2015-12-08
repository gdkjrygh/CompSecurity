// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.fragment;

import android.content.DialogInterface;
import com.kohls.mcommerce.opal.common.util.UtilityMethods;

// Referenced classes of package com.kohls.mcommerce.opal.wallet.fragment:
//            ManualScanActivity

class this._cls0
    implements android.content.ckListener
{

    final ManualScanActivity this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        UtilityMethods.openUrlInWebViewActivity("https://cs-stress.kohlsecommerce.com/app/answers/detail/a_id/50", getApplicationContext());
    }

    ()
    {
        this$0 = ManualScanActivity.this;
        super();
    }
}
