// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.content.res.Configuration;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import com.dominos.App;
import com.dominos.MobileSession;
import com.dominos.adapters.LabsProductListAdapter;
import com.dominos.android.sdk.app.ApplicationEventBus;
import com.dominos.android.sdk.common.FontManager;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.core.cart.CartManager;
import com.dominos.android.sdk.core.models.LabsCategory;
import com.dominos.android.sdk.core.models.LabsProduct;
import com.dominos.android.sdk.core.product.ProductWizardManager;
import com.dominos.android.sdk.core.store.MenuManager;
import com.dominos.android.sdk.extension.nina.DomProductManager;
import com.dominos.controllers.MenuListController;
import com.dominos.controllers.interfaces.IDominosMenuList;
import com.dominos.controllers.utils.ControllerLocator;
import com.dominos.dialogs.ProductDetailsPopUp;
import com.dominos.nina.dialog.agent.CartCommandAgent;
import com.dominos.nina.dialog.agent.CouponCommandAgent;
import com.dominos.nina.speech.SpeechManager;
import com.dominos.utils.ActivityHelper;
import com.dominos.utils.AnalyticsUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.dominos.activities:
//            LabsBaseListActivity, LabsRootMenuListActivity_, LabsCouponListActivity_

public class LabsMenuListActivity extends LabsBaseListActivity
    implements IDominosMenuList
{

    private static final String TAG = com/dominos/activities/LabsMenuListActivity.getName();
    String ambiguousProductCode;
    ArrayList categories;
    private LabsProduct detailProduct;
    boolean invokedFromRootMenu;
    ControllerLocator mControllerLocator;
    private BusSubscriberHackForOtto mEventBusSubscriber;
    private ProductWizardManager mProductWizardManager;
    private MenuListController menuListController;
    TextView menuListTitle;
    private ProductDetailsPopUp popUp;
    LabsProductListAdapter productListAdapter;
    String subcategory;

    public LabsMenuListActivity()
    {
        mEventBusSubscriber = null;
    }

    private void goToRootMenuActivity()
    {
        mAnalyticsUtil.postMenuButtonClicked();
        if (!mMenuManager.isMenuLoaded())
        {
            return;
        } else
        {
            mSpeechManager.preventNinaPause();
            ((LabsRootMenuListActivity_.IntentBuilder_)LabsRootMenuListActivity_.intent(this).flags(0x4000000)).start();
            finish();
            return;
        }
    }

    private boolean popUpIsShowing()
    {
        return popUp != null && popUp.isShowing();
    }

    private void showArtisanTextView()
    {
        View view = getLayoutInflater().inflate(0x7f0300c6, null);
        TextView textview = (TextView)view.findViewById(0x7f0f0436);
        textview.setText(0x7f0800fd);
        textview.setOnClickListener(new _cls2());
        getListView().addFooterView(view, null, false);
        FontManager.applyDominosFont(this, view);
    }

    protected void goToCouponListActivity()
    {
        mAnalyticsUtil.postCartCouponClicked();
        LabsCouponListActivity_.intent(this).start();
        finish();
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
        menuListController = mControllerLocator.getMenuListController(this);
        mProductWizardManager = (ProductWizardManager)mMobileSession.getManager("product_wizard_manager");
    }

    public void onBackPressed()
    {
        if (popUpIsShowing())
        {
            popUp.dismiss();
            return;
        }
        mNinaHelper.clearPartialProductsResetProductController();
        String as[];
        if (mProductWizardManager.isFromCouponWizard())
        {
            if (invokedFromRootMenu)
            {
                as = new String[4];
                as[0] = "CouponWizardAgency";
                as[1] = "RESET";
                as[2] = CouponCommandAgent.NAME;
                as[3] = "menu_root";
            } else
            {
                as = new String[2];
                as[0] = "CouponWizardAgency";
                as[1] = "RESET";
            }
        } else
        if (invokedFromRootMenu)
        {
            as = new String[4];
            as[0] = "CartAgency";
            as[1] = "RESET";
            as[2] = CartCommandAgent.NAME;
            as[3] = "menu";
        } else
        {
            as = new String[2];
            as[0] = "CartAgency";
            as[1] = "RESET";
        }
        super.onBackPressed(as);
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        configuration.orientation;
        JVM INSTR tableswitch 1 2: default 32
    //                   1 33
    //                   2 33;
           goto _L1 _L2 _L2
_L1:
        return;
_L2:
        if (popUpIsShowing())
        {
            showPopUpDetails(detailProduct);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
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

    public void onProductPopupClick(View view)
    {
        if (view instanceof ImageButton)
        {
            view = (ImageButton)view;
            if (view.getTag() != null && (view.getTag() instanceof LabsProduct))
            {
                showPopUpDetails((LabsProduct)view.getTag());
            }
        }
    }

    public void onResume()
    {
        super.onResume();
        if (popUpIsShowing())
        {
            popUp.dismiss();
        }
        if (subcategory != null && !"".equals(subcategory))
        {
            scrollToCategory(subcategory);
        }
        if (mProductWizardManager.isCreatedFromMenu())
        {
            mNinaHelper.clearPartialProductsResetProductController();
        }
        mEventBusSubscriber = new BusSubscriberHackForOtto();
        App.getInstance().bus.register(mEventBusSubscriber);
        App.getInstance().bus.post(new com.dominos.bus.events.ExplicitNavigationEvents.MenuListActivityTransition(mProductWizardManager.isFromCouponWizard()));
    }

    public void scrollToCategory(String s)
    {
        if (s != null)
        {
            Iterator iterator = categories.iterator();
            while (iterator.hasNext()) 
            {
                Object obj = (LabsCategory)iterator.next();
                if (((LabsCategory) (obj)).getCategoryList() != null)
                {
                    int i = 0;
                    obj = ((LabsCategory) (obj)).getCategoryList().iterator();
                    while (((Iterator) (obj)).hasNext()) 
                    {
                        LabsCategory labscategory = (LabsCategory)((Iterator) (obj)).next();
                        if (s.equalsIgnoreCase(labscategory.getCode()))
                        {
                            getListView().setSelection(i);
                            return;
                        }
                        if (labscategory.getProducts() != null)
                        {
                            i = labscategory.getProducts().size() + i;
                        }
                    }
                }
            }
        }
    }

    void setupMenuList()
    {
        mCartManager.setPanWithMarinara(false);
        productListAdapter.setAmbiguousProductCodes(ambiguousProductCode);
        productListAdapter.setCategories(categories);
        setListAdapter(productListAdapter);
        final LabsCategory category;
        for (Iterator iterator = categories.iterator(); iterator.hasNext(); getListView().setOnItemClickListener(new _cls1()))
        {
            category = (LabsCategory)iterator.next();
            if (categories != null && categories.size() == 1)
            {
                menuListTitle.setText(category.getName());
                if (StringHelper.equals(category.getName(), "Pizza"))
                {
                    showArtisanTextView();
                }
            }
            FontManager.applyDominosFont(menuListTitle);
            mAnalyticsUtil.postScreenViews(category);
        }

        getListView().addFooterView(getNinaPaddingView(), null, false);
    }

    public void showPopUpDetails(LabsProduct labsproduct)
    {
        detailProduct = labsproduct;
        if (popUpIsShowing())
        {
            popUp.dismiss();
        }
        popUp = new ProductDetailsPopUp(this, labsproduct, mProductWizardManager);
        popUp.show();
    }

    protected void showProductReplacedAlert(String s)
    {
        String s1 = mCartManager.getReplacedProductMessage(s);
        mActivityHelper.showCustomLookGeneralAlert(getString(0x7f0800b9), s1, getString(0x7f0800b7), null, null);
        mCartManager.setProductRemovedAlertShown(s, "3.0.1");
    }





    private class _cls2
        implements android.view.View.OnClickListener
    {

        final LabsMenuListActivity this$0;

        public void onClick(View view)
        {
            class _cls1 extends com.dominos.utils.ActivityHelper.AlertActionCallback
            {

                final _cls2 this$1;

                public void onAlertDismissed()
                {
                    if (c.i())
                    {
                        CartConfirmAgent.redirection = com.dominos.nina.dialog.agent.CartConfirmAgent.Redirection.MENULIST;
                    }
                }

                _cls1()
                {
                    this$1 = _cls2.this;
                    super();
                }
            }

            mActivityHelper.showAlert(AlertType.DISCONTINUED_PRODUCTS_ARTISAN_MESSAGE, new _cls1());
        }

        _cls2()
        {
            this$0 = LabsMenuListActivity.this;
            super();
        }
    }


    private class BusSubscriberHackForOtto
    {

        final LabsMenuListActivity this$0;

        public void onProductReplaced(com.dominos.bus.events.OriginatedFromSpeech.ShowProductReplaced showproductreplaced)
        {
            showProductReplacedAlert(showproductreplaced.getProductCode());
        }

        public void openCategory(com.dominos.bus.events.OriginatedFromSpeech.RootMenuSelected rootmenuselected)
        {
            goToRootMenuActivity();
        }

        public void openCouponList(com.dominos.bus.events.OriginatedFromSpeech.CouponListRequested couponlistrequested)
        {
            goToCouponListActivity();
        }

        public BusSubscriberHackForOtto()
        {
            this$0 = LabsMenuListActivity.this;
            super();
        }
    }


    private class _cls1
        implements android.widget.AdapterView.OnItemClickListener
    {

        final LabsMenuListActivity this$0;
        final LabsCategory val$category;

        public void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
            adapterview = productListAdapter.getItem(i);
            mAnalyticsUtil.postProductSelected(category.getCode(), adapterview.getName());
            if (App.isDebugMode())
            {
                Log.d(LabsMenuListActivity.TAG, (new StringBuilder("clicked product = ")).append(adapterview.toString()).toString());
            }
            mProductWizardManager.initialize(adapterview);
            mNinaHelper.resetCurrentPartialProduct(adapterview);
            mProductWizardManager.setCreatedFromMenu(true);
            mSpeechManager.preventNinaPause();
            if (c.i()) goto _L2; else goto _L1
_L1:
            if (mProductWizardManager.getCurrentVariants().size() != 1) goto _L4; else goto _L3
_L3:
            ((LabsProductDetailListActivity_.IntentBuilder_)LabsProductDetailListActivity_.intent(LabsMenuListActivity.this).flags(0x10020000)).start();
_L2:
            App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromUX.ProductSelected(mProductWizardManager.isFromCouponWizard()));
            return;
_L4:
            if (mProductWizardManager.hasFlavors())
            {
                ((LabsFlavorListActivity_.IntentBuilder_)LabsFlavorListActivity_.intent(LabsMenuListActivity.this).flags(0x10020000)).start();
            } else
            if (mProductWizardManager.hasSizes())
            {
                ((LabsSizeListActivity_.IntentBuilder_)LabsSizeListActivity_.intent(LabsMenuListActivity.this).flags(0x10020000)).start();
            }
            if (true) goto _L2; else goto _L5
_L5:
        }

        _cls1()
        {
            this$0 = LabsMenuListActivity.this;
            category = labscategory;
            super();
        }
    }

}
