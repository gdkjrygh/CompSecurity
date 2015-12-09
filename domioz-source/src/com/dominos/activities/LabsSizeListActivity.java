// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.widget.ListView;
import android.widget.TextView;
import com.dominos.App;
import com.dominos.MobileSession;
import com.dominos.adapters.LabsVariantListAdapter;
import com.dominos.android.sdk.app.ApplicationEventBus;
import com.dominos.android.sdk.common.FontManager;
import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.core.cart.CartManager;
import com.dominos.android.sdk.core.models.LabsProduct;
import com.dominos.android.sdk.core.models.LabsVariant;
import com.dominos.android.sdk.core.product.ProductWizardManager;
import com.dominos.android.sdk.core.store.MenuManager;
import com.dominos.android.sdk.extension.nina.DomProductManager;
import com.dominos.android.sdk.extension.nina.model.NinaPartialProduct;
import com.dominos.nina.dialog.agent.CartCommandAgent;
import com.dominos.nina.dialog.agent.CouponCommandAgent;
import com.dominos.nina.dialog.agent.ProductCompleteGuard;
import com.dominos.nina.dialog.agent.ProductFlavorAgent;
import com.dominos.nina.dialog.agent.ProductSizeAgent;
import com.dominos.nina.dialog.agent.ProductsAgent;
import com.dominos.nina.dialog.agent.UserIntentionAgent;
import com.dominos.nina.speech.SpeechManager;
import com.dominos.utils.AnalyticsUtil;
import com.dominos.utils.CommandBuilder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.dominos.activities:
//            LabsBaseListActivity, LabsProductDetailListActivity_

public class LabsSizeListActivity extends LabsBaseListActivity
{

    private static final String TAG = com/dominos/activities/LabsSizeListActivity.getSimpleName();
    AnalyticsUtil mProductDetailAnalytics;
    private ProductWizardManager mProductWizardManager;
    TextView menuListTitle;
    private List variantList;
    LabsVariantListAdapter variantListAdapter;

    public LabsSizeListActivity()
    {
    }

    public boolean handleHomeButtonClicked()
    {
        if (mProductWizardManager.isFromCouponWizard())
        {
            goToCouponWizard();
            return true;
        } else
        {
            return false;
        }
    }

    public void onAfterInject()
    {
        mProductWizardManager = (ProductWizardManager)mMobileSession.getManager("product_wizard_manager");
    }

    public void onBackPressed()
    {
        CommandBuilder commandbuilder;
        commandbuilder = new CommandBuilder();
        commandbuilder.appendReset(ProductsAgent.NAME);
        Object obj;
        mProductWizardManager.setSize(null);
        obj = mNinaHelper.getCurrentPartialProduct();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        ((NinaPartialProduct) (obj)).setSize("");
        if (!mProductWizardManager.hasFlavors()) goto _L2; else goto _L1
_L1:
        commandbuilder.appendReset(ProductFlavorAgent.NAME).appendReset(ProductSizeAgent.NAME).appendReset(ProductCompleteGuard.NAME);
        mProductWizardManager.setFlavor(null);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        ((NinaPartialProduct) (obj)).setFlavor("");
        mNinaHelper.resetCurrentPartialProduct(mProductWizardManager.getProduct());
_L3:
        super.onBackPressed(commandbuilder.build());
        return;
_L2:
        mNinaHelper.clearPartialProductsResetProductController();
        obj = mSpeechManager.getProductRedirection();
        if (!mProductWizardManager.isFromCouponWizard())
        {
            break MISSING_BLOCK_LABEL_268;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_198;
        }
        if (obj != com.dominos.nina.speech.SpeechManager.ProductRedirection.ROOTMENU)
        {
            break MISSING_BLOCK_LABEL_198;
        }
        commandbuilder.appendReset("OrderAgency").appendValue(UserIntentionAgent.NAME, "coupon_wizard").appendReset("CouponWizardAgency").appendValue(CouponCommandAgent.NAME, "menu_root");
          goto _L3
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_258;
        }
        if (obj != com.dominos.nina.speech.SpeechManager.ProductRedirection.MENULIST)
        {
            break MISSING_BLOCK_LABEL_258;
        }
        commandbuilder.appendReset("OrderAgency").appendValue(UserIntentionAgent.NAME, "coupon_wizard").appendReset("CouponWizardAgency").appendValue(CouponCommandAgent.NAME, "menu_list");
          goto _L3
        try
        {
            commandbuilder.appendReset("CouponWizardAgency");
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            LogUtil.e(TAG, ((com.dominos.android.sdk.core.product.ProductWizardManager.InvalidSizeException) (obj)).getMessage(), new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            LogUtil.e(TAG, ((com.dominos.android.sdk.core.product.ProductWizardManager.InvalidFlavorException) (obj)).getMessage(), new Object[0]);
        }
          goto _L3
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_305;
        }
        if (obj != com.dominos.nina.speech.SpeechManager.ProductRedirection.ROOTMENU)
        {
            break MISSING_BLOCK_LABEL_305;
        }
        commandbuilder.appendReset("OrderAgency").appendValue(UserIntentionAgent.NAME, "cart").appendValue(CartCommandAgent.NAME, "menu");
          goto _L3
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_342;
        }
        if (obj != com.dominos.nina.speech.SpeechManager.ProductRedirection.MENULIST)
        {
            break MISSING_BLOCK_LABEL_342;
        }
        commandbuilder.appendReset("OrderAgency").appendValue(UserIntentionAgent.NAME, "cart").appendValue(CartCommandAgent.NAME, "menu_list");
          goto _L3
        commandbuilder.appendReset("CartAgency");
          goto _L3
    }

    public void onResume()
    {
        super.onResume();
        if (!mNinaHelper.getNinaPartialProducts().isEmpty())
        {
            ((NinaPartialProduct)mNinaHelper.getNinaPartialProducts().get(0)).setSize(null);
        }
        App.getInstance().bus.post(new com.dominos.bus.events.ExplicitNavigationEvents.SizeListActivityTransition());
        if (mProductWizardManager.isEditMode())
        {
            App.getInstance().bus.post(new com.dominos.bus.events.SpeechEvents.RemoveInvokeButton(this));
        }
    }

    protected void onStart()
    {
        super.onStart();
        if (mProductWizardManager.getProduct() != null)
        {
            mAnalyticsUtil.postSizesPageLoad(mProductWizardManager.getProduct().getProductType(), mProductWizardManager.getProduct().getName());
        }
    }

    void setupVariantList()
    {
        variantList = new ArrayList(mProductWizardManager.getCurrentVariants());
        if (!mMenuManager.isMenuLoaded())
        {
            return;
        }
        if (variantList.size() == 1)
        {
            ((LabsProductDetailListActivity_.IntentBuilder_)LabsProductDetailListActivity_.intent(this).flags(0x10020000)).start();
            finish();
            return;
        }
        if (!mNinaHelper.getNinaPartialProducts().isEmpty())
        {
            Object obj = (NinaPartialProduct)mNinaHelper.getNinaPartialProducts().get(0);
            if (obj != null)
            {
                obj = ((NinaPartialProduct) (obj)).getSize();
                LabsVariant labsvariant;
                if (StringHelper.isNotEmpty(((String) (obj))))
                {
                    try
                    {
                        mProductWizardManager.setSize(((String) (obj)));
                        variantList = mProductWizardManager.getCurrentVariants();
                    }
                    catch (com.dominos.android.sdk.core.product.ProductWizardManager.InvalidSizeException invalidsizeexception)
                    {
                        LogUtil.e(TAG, invalidsizeexception.getStackTrace().toString(), new Object[0]);
                    }
                }
            }
        }
        obj = new HashMap();
        for (Iterator iterator = variantList.iterator(); iterator.hasNext();)
        {
            labsvariant = (LabsVariant)iterator.next();
            if (!((HashMap) (obj)).containsKey(labsvariant.getSizeCode()))
            {
                ((HashMap) (obj)).put(labsvariant.getSizeCode(), null);
            } else
            {
                iterator.remove();
            }
        }

        if (variantList.size() == 1)
        {
            if (!mNinaHelper.getNinaPartialProducts().isEmpty())
            {
                mNinaHelper.getCurrentPartialProduct().setSize(((LabsVariant)variantList.get(0)).getSizeCode());
            }
            ((LabsProductDetailListActivity_.IntentBuilder_)LabsProductDetailListActivity_.intent(this).flags(0x10020000)).start();
            finish();
            return;
        } else
        {
            mCartManager.setPanWithMarinara(false);
            menuListTitle.setText(getString(0x7f08043d));
            FontManager.applyDominosFont(menuListTitle);
            Collections.sort(variantList, new _cls1());
            variantListAdapter.setVariantList(variantList);
            variantListAdapter.setShowFlavorOnly(false);
            setListAdapter(variantListAdapter);
            getListView().setOnItemClickListener(new _cls2());
            return;
        }
    }




    private class _cls1
        implements Comparator
    {

        final LabsSizeListActivity this$0;

        public int compare(LabsVariant labsvariant, LabsVariant labsvariant1)
        {
            LabsSize labssize = mMenuManager.getSize(labsvariant);
            LabsSize labssize1 = mMenuManager.getSize(labsvariant1);
            int j = 0;
            int i = j;
            if (labssize != null)
            {
                i = j;
                if (labssize1 != null)
                {
                    i = Integer.parseInt(labssize.getSortSeq()) - Integer.parseInt(labssize1.getSortSeq());
                }
            }
            j = i;
            if (i == 0)
            {
                labsvariant = mMenuManager.getFlavor(labsvariant);
                labsvariant1 = mMenuManager.getFlavor(labsvariant1);
                j = i;
                if (labsvariant != null)
                {
                    j = i;
                    if (labsvariant1 != null)
                    {
                        j = Integer.parseInt(labsvariant.getSortSeq()) - Integer.parseInt(labsvariant1.getSortSeq());
                    }
                }
            }
            return j;
        }

        public volatile int compare(Object obj, Object obj1)
        {
            return compare((LabsVariant)obj, (LabsVariant)obj1);
        }

        _cls1()
        {
            this$0 = LabsSizeListActivity.this;
            super();
        }
    }


    private class _cls2
        implements android.widget.AdapterView.OnItemClickListener
    {

        final LabsSizeListActivity this$0;

        public void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
            adapterview = variantListAdapter.getItem(i);
            try
            {
                mProductWizardManager.setSize(adapterview.getSizeCode());
                if (!mNinaHelper.getNinaPartialProducts().isEmpty())
                {
                    ((NinaPartialProduct)mNinaHelper.getNinaPartialProducts().get(0)).setSize(adapterview.getSizeCode());
                }
                mSpeechManager.preventNinaPause();
                if (!c.i())
                {
                    ((LabsProductDetailListActivity_.IntentBuilder_)LabsProductDetailListActivity_.intent(LabsSizeListActivity.this).flags(0x10020000)).start();
                }
                App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromUX.ItemSelected());
                return;
            }
            // Misplaced declaration of an exception variable
            catch (AdapterView adapterview)
            {
                LogUtil.e(LabsSizeListActivity.TAG, adapterview.getMessage(), new Object[0]);
            }
        }

        _cls2()
        {
            this$0 = LabsSizeListActivity.this;
            super();
        }
    }

}
