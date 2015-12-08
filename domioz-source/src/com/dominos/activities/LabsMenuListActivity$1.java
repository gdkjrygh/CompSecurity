// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import com.dominos.App;
import com.dominos.adapters.LabsProductListAdapter;
import com.dominos.android.sdk.app.ApplicationEventBus;
import com.dominos.android.sdk.core.models.LabsCategory;
import com.dominos.android.sdk.core.models.LabsProduct;
import com.dominos.android.sdk.core.product.ProductWizardManager;
import com.dominos.android.sdk.extension.nina.DomProductManager;
import com.dominos.nina.speech.SpeechManager;
import com.dominos.utils.AnalyticsUtil;
import com.nuance.b.e.c;
import java.util.List;

// Referenced classes of package com.dominos.activities:
//            LabsMenuListActivity, LabsProductDetailListActivity_, LabsFlavorListActivity_, LabsSizeListActivity_

class ry
    implements android.widget.Listener
{

    final LabsMenuListActivity this$0;
    final LabsCategory val$category;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = productListAdapter.getItem(i);
        mAnalyticsUtil.postProductSelected(val$category.getCode(), adapterview.getName());
        if (App.isDebugMode())
        {
            Log.d(LabsMenuListActivity.access$000(), (new StringBuilder("clicked product = ")).append(adapterview.toString()).toString());
        }
        LabsMenuListActivity.access$100(LabsMenuListActivity.this).initialize(adapterview);
        mNinaHelper.resetCurrentPartialProduct(adapterview);
        LabsMenuListActivity.access$100(LabsMenuListActivity.this).setCreatedFromMenu(true);
        mSpeechManager.preventNinaPause();
        if (c.i()) goto _L2; else goto _L1
_L1:
        if (LabsMenuListActivity.access$100(LabsMenuListActivity.this).getCurrentVariants().size() != 1) goto _L4; else goto _L3
_L3:
        ((tivity_.IntentBuilder_)LabsProductDetailListActivity_.intent(LabsMenuListActivity.this).flags(0x10020000)).start();
_L2:
        App.getInstance().bus.post(new com.dominos.bus.events.tSelected(LabsMenuListActivity.access$100(LabsMenuListActivity.this).isFromCouponWizard()));
        return;
_L4:
        if (LabsMenuListActivity.access$100(LabsMenuListActivity.this).hasFlavors())
        {
            ((.IntentBuilder_)LabsFlavorListActivity_.intent(LabsMenuListActivity.this).flags(0x10020000)).start();
        } else
        if (LabsMenuListActivity.access$100(LabsMenuListActivity.this).hasSizes())
        {
            ((ntentBuilder_)LabsSizeListActivity_.intent(LabsMenuListActivity.this).flags(0x10020000)).start();
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    ry()
    {
        this$0 = final_labsmenulistactivity;
        val$category = LabsCategory.this;
        super();
    }
}
