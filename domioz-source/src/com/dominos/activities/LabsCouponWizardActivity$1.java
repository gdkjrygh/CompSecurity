// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.view.View;
import android.widget.AdapterView;
import com.dominos.App;
import com.dominos.adapters.LabsCouponWizardListAdapter;
import com.dominos.android.sdk.app.ApplicationEventBus;
import com.dominos.android.sdk.core.models.CouponWizardLineHolder;
import com.dominos.android.sdk.core.models.LabsCategory;
import com.dominos.android.sdk.core.models.LabsProduct;
import com.dominos.android.sdk.core.models.LabsProductLine;
import com.dominos.android.sdk.core.models.coupon.LabsCouponLine;
import com.dominos.android.sdk.core.models.coupon.LabsCouponProductGroup;
import com.dominos.android.sdk.core.product.ProductWizardManager;
import com.dominos.android.sdk.core.store.MenuManager;
import com.dominos.android.sdk.extension.nina.DomProductManager;
import com.dominos.controllers.CouponWizardController;
import com.dominos.nina.speech.SpeechManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.dominos.activities:
//            LabsCouponWizardActivity, LabsProductDetailListActivity_, LabsFlavorListActivity_, LabsSizeListActivity_, 
//            LabsMenuListActivity_, LabsRootMenuListActivity_

class this._cls0
    implements android.widget.ener
{

    final LabsCouponWizardActivity this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        HashMap hashmap = new HashMap();
        String s;
        LabsCategory labscategory;
        if (i == -1)
        {
            view = new LabsCouponLine();
            adapterview = ((CouponWizardLineHolder)wizAdapter.getItem(0)).getGroup();
        } else
        {
            view = ((View) (((CouponWizardLineHolder)wizAdapter.getItem(i)).getLine()));
            adapterview = ((CouponWizardLineHolder)wizAdapter.getItem(i)).getGroup();
        }
        if (adapterview != null)
        {
            hashmap.putAll(LabsCouponWizardActivity.access$000(LabsCouponWizardActivity.this).createProductGroupMap(adapterview));
        }
        labscategory = LabsCategory.getInstance(mMenuManager.getFoodCategory());
        LabsCouponWizardActivity.access$000(LabsCouponWizardActivity.this).filterCategory(labscategory, hashmap);
        labscategory.pruneCategory();
        s = labscategory.singleProductCategorySearch();
        mSpeechManager.preventNinaPause();
        if (view instanceof LabsProductLine)
        {
            i = ((LabsProductLine)view).getId();
            view = new LabsProductLine((LabsProductLine)view);
            view.setId(i);
            LabsCouponWizardActivity.access$100(LabsCouponWizardActivity.this).initialize(view.getProduct(), mNinaHelper.getGroupVariantsByProduct(adapterview, view.getProduct()));
            LabsCouponWizardActivity.access$100(LabsCouponWizardActivity.this).setProductLine(view);
            LabsCouponWizardActivity.access$100(LabsCouponWizardActivity.this).setEditMode(true);
            LabsCouponWizardActivity.access$100(LabsCouponWizardActivity.this).setProductLineId(i);
            mNinaHelper.resetCurrentPartialProduct(view.getProduct());
            App.getInstance().bus.post(new com.dominos.bus.events.t());
            LabsCouponWizardActivity.access$200(LabsCouponWizardActivity.this);
            return;
        }
        if (s != null && (mMenuManager.getVariant(s) != null || mMenuManager.getProduct(s) != null && mMenuManager.getProduct(s).getVariants().size() == 1))
        {
            if (mMenuManager.getVariant(s) != null)
            {
                adapterview = s;
            } else
            if (mMenuManager.getProduct(s) != null)
            {
                adapterview = (String)mMenuManager.getProduct(s).getVariants().get(0);
            } else
            {
                adapterview = "";
            }
            adapterview = mMenuManager.createProductLineFromVariantCode(adapterview);
            LabsCouponWizardActivity.access$100(LabsCouponWizardActivity.this).replaceProductLine(adapterview);
            LabsCouponWizardActivity.access$200(LabsCouponWizardActivity.this);
            return;
        }
        LabsCouponWizardActivity.access$100(LabsCouponWizardActivity.this).setEditMode(false);
        if (labscategory.getCategoryList().size() != 1)
        {
            break MISSING_BLOCK_LABEL_687;
        }
        if (hashmap.size() != 1 || s == null) goto _L2; else goto _L1
_L1:
        view = (LabsProduct)hashmap.get(s);
        LabsCouponWizardActivity.access$100(LabsCouponWizardActivity.this).initialize(view, mMenuManager.getVariantsForVariantCodes(adapterview.getProductCodes()));
        mNinaHelper.resetCurrentPartialProduct(view);
        if (LabsCouponWizardActivity.access$100(LabsCouponWizardActivity.this).getCurrentVariants().size() != 1) goto _L4; else goto _L3
_L3:
        ((ty_.IntentBuilder_)LabsProductDetailListActivity_.intent(LabsCouponWizardActivity.this).flags(0x10020000)).start();
_L5:
        App.getInstance().bus.post(new com.dominos.bus.events.ected(true));
        return;
_L4:
        if (LabsCouponWizardActivity.access$100(LabsCouponWizardActivity.this).hasFlavors())
        {
            ((entBuilder_)LabsFlavorListActivity_.intent(LabsCouponWizardActivity.this).flags(0x10020000)).start();
        } else
        if (LabsCouponWizardActivity.access$100(LabsCouponWizardActivity.this).hasSizes())
        {
            ((tBuilder_)LabsSizeListActivity_.intent(LabsCouponWizardActivity.this).flags(0x10020000)).start();
        }
        if (true) goto _L5; else goto _L2
_L2:
        App.getInstance().bus.post(new com.dominos.bus.events.lected(true));
        LabsMenuListActivity_.intent(LabsCouponWizardActivity.this).categories((ArrayList)labscategory.getCategoryList()).start();
        return;
        App.getInstance().bus.post(new com.dominos.bus.events.ed(true));
        LabsRootMenuListActivity_.intent(LabsCouponWizardActivity.this).category(labscategory).start();
        return;
    }

    ntentBuilder_()
    {
        this$0 = LabsCouponWizardActivity.this;
        super();
    }
}
