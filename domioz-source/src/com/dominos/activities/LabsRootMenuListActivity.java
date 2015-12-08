// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;
import com.dominos.App;
import com.dominos.MobileSession;
import com.dominos.adapters.LabsProductGridAdapter;
import com.dominos.android.sdk.app.ApplicationEventBus;
import com.dominos.android.sdk.common.FontManager;
import com.dominos.android.sdk.common.dom.useraccounts.UserAuthorization;
import com.dominos.android.sdk.core.cart.CartManager;
import com.dominos.android.sdk.core.models.LabsCategory;
import com.dominos.android.sdk.core.product.ProductWizardManager;
import com.dominos.android.sdk.core.store.MenuManager;
import com.dominos.android.sdk.core.user.UserProfileManager;
import com.dominos.android.sdk.extension.nina.DomProductManager;
import com.dominos.controllers.interfaces.IDominosRootMenuList;
import com.dominos.controllers.utils.ControllerLocator;
import com.dominos.nina.speech.SpeechManager;
import com.dominos.utils.ActivityHelper;
import com.dominos.utils.AnalyticsUtil;

// Referenced classes of package com.dominos.activities:
//            BaseActivity, LabsCouponListActivity_, LabsFlavorListActivity_, LabsSizeListActivity_, 
//            LabsProductDetailListActivity_

public class LabsRootMenuListActivity extends BaseActivity
    implements IDominosRootMenuList
{

    Button buildYourOwnPizzaButton;
    LabsCategory category;
    ControllerLocator mControllerLocator;
    private BusSubscriberHackForOtto mEventBusSubscriber;
    LabsProductGridAdapter mProductGridAdapter;
    private ProductWizardManager mProductWizardManager;
    TextView menuListTitleText;
    GridView productGrid;
    ListView productList;

    public LabsRootMenuListActivity()
    {
        mEventBusSubscriber = null;
    }

    private void setOrientationOptions()
    {
        byte byte0;
        if (mProductWizardManager.isFromCouponWizard())
        {
            byte0 = 2;
        } else
        {
            byte0 = 0;
        }
        mProductGridAdapter.setAdapterType(byte0);
        if (byte0 == 0)
        {
            productList.setVisibility(8);
            productGrid.setVisibility(0);
            productGrid.setAdapter(mProductGridAdapter);
        } else
        {
            productList.setVisibility(0);
            productGrid.setVisibility(8);
            productList.setAdapter(mProductGridAdapter);
        }
        mProductGridAdapter.setEditMode(mProductWizardManager.isEditMode());
        mProductGridAdapter.setProductLineId(mProductWizardManager.getProductLineId());
    }

    private void updateAuthorization()
    {
        userAuth.updateLastAccessedTime();
        if (!mProfileManager.isRemembered() && userAuth.isAuthorizationExpired())
        {
            mProfileManager.clearCurrentUser();
        }
        userAuth.getAuthorizationCode();
    }

    public void finish()
    {
        super.finish();
        overridePendingTransition(0x10a0002, 0x10a0003);
    }

    protected void goToCouponActivity()
    {
        mAnalyticsUtil.postCartCouponClicked();
        LabsCouponListActivity_.intent(this).start();
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

    void onAfterInject()
    {
        mProductWizardManager = (ProductWizardManager)mMobileSession.getManager("product_wizard_manager");
    }

    public void onBackPressed()
    {
        String as[];
        if (mProductWizardManager.isFromCouponWizard())
        {
            as = new String[2];
            as[0] = "CouponWizardAgency";
            as[1] = "RESET";
        } else
        {
            as = new String[2];
            as[0] = "CartAgency";
            as[1] = "RESET";
        }
        super.onBackPressed(as);
    }

    public void onBuildPizza(View view)
    {
        view = mMenuManager.getProduct("S_PIZZA");
        mProductWizardManager.initialize(view);
        mNinaHelper.resetCurrentPartialProduct(view);
        mProductWizardManager.setCreatedFromMenu(true);
        mSpeechManager.preventNinaPause();
        if (mProductWizardManager.hasFlavors())
        {
            ((LabsFlavorListActivity_.IntentBuilder_)LabsFlavorListActivity_.intent(this).flags(0x10020000)).start();
        } else
        if (mProductWizardManager.hasSizes())
        {
            ((LabsSizeListActivity_.IntentBuilder_)LabsSizeListActivity_.intent(this).flags(0x10020000)).start();
        } else
        {
            ((LabsProductDetailListActivity_.IntentBuilder_)LabsProductDetailListActivity_.intent(this).flags(0x10020000)).start();
        }
        App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromUX.ProductSelected(mProductWizardManager.isFromCouponWizard()));
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
    }

    protected void onPause()
    {
        mSpeechManager.preventNinaPause();
        super.onPause();
        if (mEventBusSubscriber != null)
        {
            App.getInstance().bus.unregister(mEventBusSubscriber);
        }
    }

    protected void onResume()
    {
        super.onResume();
        if (mProductWizardManager.isCreatedFromMenu())
        {
            mNinaHelper.clearPartialProductsResetProductController();
        }
        mEventBusSubscriber = new BusSubscriberHackForOtto(null);
        App.getInstance().bus.register(mEventBusSubscriber);
        App.getInstance().bus.post(new com.dominos.bus.events.ExplicitNavigationEvents.RootMenuActivityTransition(mProductWizardManager.isFromCouponWizard()));
    }

    void setupMenuList()
    {
        if (mProductWizardManager.isFromCouponWizard())
        {
            mAnalyticsUtil.postCouponWizardAvailableProducts();
        }
        FontManager.applyDominosFont(this);
        LabsCategory labscategory;
        String s;
        if (category == null)
        {
            labscategory = mMenuManager.getFoodCategory();
        } else
        {
            labscategory = category;
        }
        s = labscategory.getName();
        if (s.equals("Food"))
        {
            menuListTitleText.setText(getString(0x7f0801c1));
            mAnalyticsUtil.postMenu();
        } else
        {
            menuListTitleText.setText(s);
        }
        mProductGridAdapter.setCategoryList(labscategory.getCategoryList());
        setOrientationOptions();
        if (!mProductWizardManager.isFromCouponWizard())
        {
            buildYourOwnPizzaButton.setText(getString(0x7f080072));
            buildYourOwnPizzaButton.setTextColor(-1);
            buildYourOwnPizzaButton.setVisibility(0);
            return;
        } else
        {
            buildYourOwnPizzaButton.setVisibility(8);
            return;
        }
    }

    protected void showProductReplacedAlert(String s)
    {
        String s1 = mCartManager.getReplacedProductMessage(s);
        mActivityHelper.showCustomLookGeneralAlert(getString(0x7f0800b9), s1, getString(0x7f0800b7), null, null);
        mCartManager.setProductRemovedAlertShown(s, "3.0.1");
    }

    public void startActivity(Intent intent)
    {
        super.startActivity(intent);
        overridePendingTransition(0x7f040012, 0x7f040013);
    }

    private class BusSubscriberHackForOtto
    {

        final LabsRootMenuListActivity this$0;

        public void onProductReplaced(com.dominos.bus.events.OriginatedFromSpeech.ShowProductReplaced showproductreplaced)
        {
            showProductReplacedAlert(showproductreplaced.getProductCode());
        }

        public void openCoupons(com.dominos.bus.events.OriginatedFromSpeech.CouponListRequested couponlistrequested)
        {
            goToCouponActivity();
        }

        private BusSubscriberHackForOtto()
        {
            this$0 = LabsRootMenuListActivity.this;
            super();
        }

        BusSubscriberHackForOtto(_cls1 _pcls1)
        {
            this();
        }
    }

}
