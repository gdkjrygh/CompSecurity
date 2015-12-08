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
import com.dominos.android.sdk.core.cart.CartManager;
import com.dominos.android.sdk.core.models.LabsProduct;
import com.dominos.android.sdk.core.models.LabsProductLine;
import com.dominos.android.sdk.core.models.LabsVariant;
import com.dominos.android.sdk.core.product.ProductWizardManager;
import com.dominos.android.sdk.extension.nina.DomProductManager;
import com.dominos.android.sdk.extension.nina.model.NinaPartialProduct;
import com.dominos.nina.dialog.agent.CartCommandAgent;
import com.dominos.nina.dialog.agent.CouponCommandAgent;
import com.dominos.nina.dialog.agent.ProductsAgent;
import com.dominos.nina.dialog.agent.UserIntentionAgent;
import com.dominos.nina.speech.SpeechManager;
import com.dominos.utils.AnalyticsUtil;
import com.dominos.utils.CommandBuilder;
import com.nuance.b.e.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.dominos.activities:
//            LabsBaseListActivity

public class LabsFlavorListActivity extends LabsBaseListActivity
{

    private static final String TAG = com/dominos/activities/LabsFlavorListActivity.getSimpleName();
    private ProductWizardManager mProductWizardManager;
    TextView menuListTitle;
    LabsVariantListAdapter variantListAdapter;

    public LabsFlavorListActivity()
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
        if (!mProductWizardManager.isRestoreMode()) goto _L2; else goto _L1
_L1:
        LabsProductLine labsproductline = mProductWizardManager.getProductLineInEdit();
        mProductWizardManager.replaceProductLine(labsproductline);
        ((NinaPartialProduct)mNinaHelper.getNinaPartialProducts().get(0)).setVariant(labsproductline.getVariant().getCode());
        ((NinaPartialProduct)mNinaHelper.getNinaPartialProducts().get(0)).setFlavor(labsproductline.getVariant().getFlavorCode());
        ((NinaPartialProduct)mNinaHelper.getNinaPartialProducts().get(0)).setSize(labsproductline.getVariant().getSizeCode());
_L4:
        if (!c.i())
        {
            super.onBackPressed();
            return;
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (c.i() && !mNinaHelper.getNinaPartialProducts().isEmpty())
        {
            mNinaHelper.clearPartialProductsResetProductController();
        }
        if (true) goto _L4; else goto _L3
_L3:
        com.dominos.nina.speech.SpeechManager.ProductRedirection productredirection = mSpeechManager.getProductRedirection();
        CommandBuilder commandbuilder = new CommandBuilder();
        commandbuilder.appendReset(ProductsAgent.NAME);
        if (mProductWizardManager.isFromCouponWizard())
        {
            if (productredirection != null && productredirection == com.dominos.nina.speech.SpeechManager.ProductRedirection.ROOTMENU)
            {
                commandbuilder.appendReset("OrderAgency").appendValue(UserIntentionAgent.NAME, "coupon_wizard").appendReset("CouponWizardAgency").appendValue(CouponCommandAgent.NAME, "menu_root");
            } else
            if (productredirection != null && productredirection == com.dominos.nina.speech.SpeechManager.ProductRedirection.MENULIST)
            {
                commandbuilder.appendReset("OrderAgency").appendValue(UserIntentionAgent.NAME, "coupon_wizard").appendReset("CouponWizardAgency").appendValue(CouponCommandAgent.NAME, "menu_list");
            } else
            {
                commandbuilder.appendReset("CouponWizardAgency");
            }
        } else
        if (productredirection != null && productredirection == com.dominos.nina.speech.SpeechManager.ProductRedirection.ROOTMENU)
        {
            commandbuilder.appendReset("OrderAgency").appendValue(UserIntentionAgent.NAME, "cart").appendValue(CartCommandAgent.NAME, "menu");
        } else
        if (productredirection != null && productredirection == com.dominos.nina.speech.SpeechManager.ProductRedirection.MENULIST)
        {
            commandbuilder.appendReset("OrderAgency").appendValue(UserIntentionAgent.NAME, "cart").appendValue(CartCommandAgent.NAME, "menu_list");
        } else
        {
            commandbuilder.appendReset("CartAgency");
        }
        super.onBackPressed(commandbuilder.build());
        return;
    }

    public void onResume()
    {
        super.onResume();
        if (!mNinaHelper.getNinaPartialProducts().isEmpty())
        {
            ((NinaPartialProduct)mNinaHelper.getNinaPartialProducts().get(0)).setFlavor(null);
            if (!mProductWizardManager.isFromPartialWizard())
            {
                ((NinaPartialProduct)mNinaHelper.getNinaPartialProducts().get(0)).setSize(null);
            }
        }
        App.getInstance().bus.post(new com.dominos.bus.events.ExplicitNavigationEvents.FlavorListActivityTransition());
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
            mAnalyticsUtil.postCrustFlavorsPageLoad(mProductWizardManager.getProduct().getProductType(), mProductWizardManager.getProduct().getName());
        }
    }

    void setupVariantList()
    {
        ArrayList arraylist = new ArrayList(mProductWizardManager.getCurrentVariants());
        Object obj = new HashMap();
        for (Iterator iterator = arraylist.iterator(); iterator.hasNext();)
        {
            LabsVariant labsvariant = (LabsVariant)iterator.next();
            if (!((HashMap) (obj)).containsKey(labsvariant.getFlavorCode()))
            {
                ((HashMap) (obj)).put(labsvariant.getFlavorCode(), null);
            } else
            {
                iterator.remove();
            }
        }

        mCartManager.setPanWithMarinara(false);
        obj = menuListTitle;
        int i;
        if (mProductWizardManager.getProduct().isPizza())
        {
            i = 0x7f080380;
        } else
        {
            i = 0x7f080386;
        }
        ((TextView) (obj)).setText(i);
        FontManager.applyDominosFont(menuListTitle);
        Collections.sort(arraylist, new _cls1());
        variantListAdapter.setVariantList(arraylist);
        variantListAdapter.setShowFlavorOnly(true);
        setListAdapter(variantListAdapter);
        getListView().setOnItemClickListener(new _cls2());
    }




    private class _cls1
        implements Comparator
    {

        final LabsFlavorListActivity this$0;

        public int compare(LabsVariant labsvariant, LabsVariant labsvariant1)
        {
            boolean flag = false;
            labsvariant = mMenuManager.getFlavor(labsvariant);
            labsvariant1 = mMenuManager.getFlavor(labsvariant1);
            int i = ((flag) ? 1 : 0);
            if (labsvariant != null)
            {
                i = ((flag) ? 1 : 0);
                if (labsvariant1 != null)
                {
                    i = Integer.parseInt(labsvariant.getSortSeq()) - Integer.parseInt(labsvariant1.getSortSeq());
                }
            }
            return i;
        }

        public volatile int compare(Object obj, Object obj1)
        {
            return compare((LabsVariant)obj, (LabsVariant)obj1);
        }

        _cls1()
        {
            this$0 = LabsFlavorListActivity.this;
            super();
        }
    }


    private class _cls2
        implements android.widget.AdapterView.OnItemClickListener
    {

        final LabsFlavorListActivity this$0;

        public void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
            adapterview = variantListAdapter.getItem(i);
            mProductWizardManager.setFlavor(adapterview.getFlavorCode());
            if (!mNinaHelper.getNinaPartialProducts().isEmpty())
            {
                ((NinaPartialProduct)mNinaHelper.getNinaPartialProducts().get(0)).setFlavor(adapterview.getFlavorCode());
            }
            mSpeechManager.preventNinaPause();
            if (!c.i())
            {
                if (!mProductWizardManager.hasSizes() || mProductWizardManager.getCurrentVariants().size() <= 1)
                {
                    break MISSING_BLOCK_LABEL_149;
                }
                ((LabsSizeListActivity_.IntentBuilder_)LabsSizeListActivity_.intent(LabsFlavorListActivity.this).flags(0x10020000)).start();
            }
_L1:
            App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromUX.ItemSelected());
            return;
            try
            {
                ((LabsProductDetailListActivity_.IntentBuilder_)LabsProductDetailListActivity_.intent(LabsFlavorListActivity.this).flags(0x10020000)).start();
            }
            // Misplaced declaration of an exception variable
            catch (AdapterView adapterview)
            {
                LogUtil.e(LabsFlavorListActivity.TAG, adapterview.getStackTrace().toString(), new Object[0]);
                return;
            }
              goto _L1
        }

        _cls2()
        {
            this$0 = LabsFlavorListActivity.this;
            super();
        }
    }

}
