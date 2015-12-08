// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.adapters;

import android.util.Log;
import android.view.View;
import com.dominos.App;
import com.dominos.MobileSession;
import com.dominos.activities.LabsMenuListActivity_;
import com.dominos.android.sdk.app.ApplicationEventBus;
import com.dominos.android.sdk.core.models.LabsCategory;
import com.dominos.android.sdk.core.product.ProductWizardManager;
import com.dominos.nina.speech.SpeechManager;
import com.dominos.utils.AnalyticsUtil;
import java.util.ArrayList;

// Referenced classes of package com.dominos.adapters:
//            LabsProductGridAdapter

class this._cls0
    implements android.view.apter._cls1
{

    final LabsProductGridAdapter this$0;

    public void onClick(View view)
    {
        LabsCategory labscategory = (LabsCategory)view.getTag();
        ArrayList arraylist = new ArrayList();
        arraylist.add(labscategory);
        if (App.isDebugMode())
        {
            Log.d("GridAdapter", labscategory.toString());
        }
        mSpeechManager.preventNinaPause();
        ProductWizardManager productwizardmanager = (ProductWizardManager)mMobileSession.getManager("product_wizard_manager");
        App.getInstance().bus.post(new com.dominos.bus.events.Selected(productwizardmanager.isFromCouponWizard()));
        mAnalyticsUtil.postMenuCategoryClick(labscategory.getCode());
        LabsMenuListActivity_.intent(view.getContext()).invokedFromRootMenu(true).categories(arraylist).start();
    }

    ntentBuilder_()
    {
        this$0 = LabsProductGridAdapter.this;
        super();
    }
}
