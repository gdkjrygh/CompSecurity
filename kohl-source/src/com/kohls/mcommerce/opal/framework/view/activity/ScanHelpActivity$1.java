// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.view.activity;

import android.content.Intent;
import android.view.View;
import com.kohls.mcommerce.opal.wallet.fragment.ZxingScannerActivity;

// Referenced classes of package com.kohls.mcommerce.opal.framework.view.activity:
//            ScanHelpActivity

class val.scanReason
    implements android.view.r
{

    final ScanHelpActivity this$0;
    final int val$scanReason;

    public void onClick(View view)
    {
        if (val$scanReason == 2001)
        {
            view = new Intent(getApplicationContext(), com/kohls/mcommerce/opal/wallet/fragment/ZxingScannerActivity);
            view.putExtra("intent_multi_scan", false);
            startActivity(view);
            return;
        } else
        {
            ScanHelpActivity.access$000(ScanHelpActivity.this, val$scanReason);
            return;
        }
    }

    I()
    {
        this$0 = final_scanhelpactivity;
        val$scanReason = I.this;
        super();
    }
}
