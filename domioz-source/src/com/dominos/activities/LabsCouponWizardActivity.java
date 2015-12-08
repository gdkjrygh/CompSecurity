// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.dominos.App;
import com.dominos.MobileSession;
import com.dominos.adapters.LabsCouponWizardListAdapter;
import com.dominos.android.sdk.app.ApplicationEventBus;
import com.dominos.android.sdk.common.CouponUtil;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.core.cart.CartManager;
import com.dominos.android.sdk.core.coupon.CouponWizardManager;
import com.dominos.android.sdk.core.loyalty.LoyaltyUtil;
import com.dominos.android.sdk.core.models.CouponWizardLineHolder;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.models.LabsProduct;
import com.dominos.android.sdk.core.models.LabsProductLine;
import com.dominos.android.sdk.core.models.LabsVariant;
import com.dominos.android.sdk.core.models.coupon.Coupon;
import com.dominos.android.sdk.core.models.coupon.LabsCouponLine;
import com.dominos.android.sdk.core.models.coupon.LabsCouponProductGroup;
import com.dominos.android.sdk.core.order.OrderManager;
import com.dominos.android.sdk.core.product.ProductWizardManager;
import com.dominos.android.sdk.core.store.MenuManager;
import com.dominos.android.sdk.extension.nina.DomProductManager;
import com.dominos.controllers.CouponWizardController;
import com.dominos.controllers.interfaces.IDominosCouponWizard;
import com.dominos.controllers.utils.ControllerLocator;
import com.dominos.nina.dialog.agent.CouponCommandAgent;
import com.dominos.nina.dialog.agent.CouponWizardGuard;
import com.dominos.nina.dialog.agent.ProductsAgent;
import com.dominos.nina.dialog.agent.UserIntentionAgent;
import com.dominos.nina.speech.SpeechManager;
import com.dominos.utils.ActivityHelper;
import com.dominos.utils.AlertType;
import com.dominos.utils.AnalyticsUtil;
import com.dominos.utils.CommandBuilder;
import com.dominos.utils.ImageManagerCDN;
import com.dominos.views.CouponWizardFooterView;
import com.dominos.views.CouponWizardFooterView_;
import com.nuance.b.e.c;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.dominos.activities:
//            LabsBaseListActivity, LabsProductDetailListActivity_, CartActivity_

public class LabsCouponWizardActivity extends LabsBaseListActivity
    implements IDominosCouponWizard, com.dominos.views.CouponWizardFooterView.OnButtonClickListener
{

    private static final int ADDITIONAL_LINE_ITEM = -1;
    boolean avoidCouponAutoFulfill;
    ImageView deleteButton;
    RelativeLayout editButton;
    TextView editButtonText;
    LayoutInflater inflater;
    ImageView mBigProductImageView;
    ControllerLocator mControllerLocator;
    private Coupon mCoupon;
    private LabsCouponLine mCouponLine;
    TextView mCouponLineDesctiptionTextView;
    TextView mCouponLinePriceTextView;
    String mCouponSelectProductsText;
    private CouponWizardController mCouponWizardController;
    String mCouponWizardTitleText;
    TextView mCpnName;
    private CouponWizardFooterView mFooterView;
    String mLoyaltyHeader;
    private ProductWizardManager mProductWizardManager;
    TextView mTitleTextView;
    LabsCouponWizardListAdapter wizAdapter;

    public LabsCouponWizardActivity()
    {
    }

    private void checkIfWeCameBackFromCart()
    {
        if (!mCouponLine.isFulfilled() && mCoupon.isDoneEditing())
        {
            mCoupon.setDoneEditing(false);
        }
    }

    private String cleanPrice(String s)
    {
        StringBuffer stringbuffer = new StringBuffer();
        if (s.trim().equalsIgnoreCase(""))
        {
            return "";
        }
        stringbuffer.append("$").append(s);
        if (!s.contains("."))
        {
            stringbuffer.append(".00");
        }
        return stringbuffer.toString();
    }

    private void displayList()
    {
        mProductWizardManager.reset();
        handleCouponList();
    }

    private void endCouponEditing()
    {
        if (mCoupon != null)
        {
            mCoupon.setDoneEditing(true);
        }
    }

    private String getCouponLineLabelForVariantCodes(List list, int i, boolean flag)
    {
        String s = getResources().getString(0x7f08029f, new Object[] {
            Integer.valueOf(i)
        });
        if (flag)
        {
            HashSet hashset = new HashSet();
            String s1;
            for (list = list.iterator(); list.hasNext(); hashset.add(mMenuManager.getProduct(s1).getProductType()))
            {
                s1 = (String)list.next();
                s1 = mMenuManager.getVariant(s1).getProductCode();
            }

            list = (String[])hashset.toArray(new String[hashset.size()]);
            Arrays.sort(list);
            list = StringHelper.join(list, ", ");
            return (new StringBuilder()).append(s).append("\n").append(list).toString();
        } else
        {
            return s;
        }
    }

    private void goToLabsProductDetailActivity()
    {
        mSpeechManager.preventNinaPause();
        ((LabsProductDetailListActivity_.IntentBuilder_)LabsProductDetailListActivity_.intent(this).flags(0x10020000)).start();
    }

    private void handleCouponList()
    {
        List list = mCouponWizardManager.getCouponWizardHolderList();
        for (int i = 0; i < list.size(); i++)
        {
            CouponWizardLineHolder couponwizardlineholder = (CouponWizardLineHolder)list.get(i);
            if (couponwizardlineholder.getLine() instanceof LabsCouponLine)
            {
                boolean flag = mCouponWizardManager.getCouponLine().getCoupon().isBundled();
                String s = getCouponLineLabelForVariantCodes(couponwizardlineholder.getGroup().getProductCodes(), i + 1, flag);
                ((LabsCouponLine)couponwizardlineholder.getLine()).setLabel(s);
            }
        }

        wizAdapter.setLineList(list);
        getListView().addFooterView(getNinaPaddingView(), null, false);
        int j;
        if (c.i())
        {
            j = 0;
        } else
        {
            j = 8;
        }
        setNinaPaddingVisibility(j);
        setListAdapter(wizAdapter);
        setEditBtnText();
        if (mCouponWizardManager.isCouponFulfilled(mCoupon, mCouponLine))
        {
            setUpFooterView();
        } else
        if (mCoupon.isBundled() && mCouponWizardManager.isCouponFulfilled(mCoupon, mCouponLine))
        {
            onCouponFulfilled();
        } else
        {
            removeFooterView();
        }
        getListView().setOnItemClickListener(new _cls1());
        getListView().setOnItemLongClickListener(new _cls2());
        if (getListView().getFooterViewsCount() == 0 && CouponUtil.isPromotional(mCoupon))
        {
            View view = inflater.inflate(0x7f030050, null, false);
            ((TextView)view.findViewById(0x7f0f01cf)).setText(0x7f0801cf);
            getListView().addFooterView(view);
            mCartManager.setPromotionLegaleseDisplayed(true);
        }
        getListView().removeFooterView(getNinaPaddingView());
        getListView().addFooterView(getNinaPaddingView(), null, false);
    }

    private void removeFooterView()
    {
        if (getListView() != null && mFooterView != null)
        {
            getListView().removeFooterView(mFooterView);
            mFooterView = null;
        }
    }

    private void scrolllToTheBottom()
    {
        if (getListView() != null)
        {
            getListView().setSelection(getListView().getAdapter().getCount() - 1);
        }
    }

    private void setDescription(String s)
    {
        if (s.trim().length() > 0)
        {
            mCouponLineDesctiptionTextView.setVisibility(0);
            mCouponLineDesctiptionTextView.setText(s);
            return;
        } else
        {
            mCouponLineDesctiptionTextView.setText("");
            mCouponLineDesctiptionTextView.setVisibility(8);
            return;
        }
    }

    private void setEditBtnText()
    {
        LabsCouponWizardListAdapter labscouponwizardlistadapter;
label0:
        {
label1:
            {
                labscouponwizardlistadapter = (LabsCouponWizardListAdapter)getListAdapter();
                if (!labscouponwizardlistadapter.isEmpty() && (labscouponwizardlistadapter.getItem(0) instanceof CouponWizardLineHolder))
                {
                    if (!(((CouponWizardLineHolder)labscouponwizardlistadapter.getItem(0)).getLine() instanceof LabsProductLine))
                    {
                        break label0;
                    }
                    editButton.setVisibility(0);
                    if (!labscouponwizardlistadapter.isEditMode())
                    {
                        break label1;
                    }
                    editButtonText.setText(0x7f080100);
                }
                return;
            }
            editButtonText.setText(0x7f08010d);
            return;
        }
        if (labscouponwizardlistadapter.isEditMode())
        {
            labscouponwizardlistadapter.toggleEditMode();
            showCouponLineRemoveImage();
        }
        editButton.setVisibility(8);
    }

    private void setLabel(String s)
    {
        mCpnName.setText(s);
    }

    private void setPrice(String s)
    {
        if (s.trim().length() > 0)
        {
            mCouponLinePriceTextView.setVisibility(0);
            mCouponLinePriceTextView.setText(s);
            return;
        } else
        {
            mCouponLinePriceTextView.setText("");
            mCouponLinePriceTextView.setVisibility(8);
            return;
        }
    }

    private void setUpFooterView()
    {
        if (getListView() != null && mFooterView == null)
        {
            mFooterView = CouponWizardFooterView_.build(this);
            mFooterView.setClickListener(this);
            getListView().addFooterView(mFooterView);
        }
    }

    private void showCouponLineRemoveImage()
    {
        if (((LabsCouponWizardListAdapter)getListAdapter()).isEditMode())
        {
            deleteButton.setVisibility(0);
            return;
        } else
        {
            deleteButton.setVisibility(8);
            return;
        }
    }

    private void showDeleteConfirm(final int id)
    {
        mActivityHelper.showOptionAlert(AlertType.DELETE_CONFIRMATION_PRODUCT_COUPON_WIZARD, null, new _cls4());
    }

    public void doTheSetup()
    {
        mCouponLine = mCouponWizardManager.getCouponLine();
        if (mCouponLine == null)
        {
            finish();
        } else
        {
            mCoupon = mCouponWizardManager.getUpdatedCouponByCode(mCouponLine.getCoupon().getCode());
            checkIfWeCameBackFromCart();
            if (mCoupon != null)
            {
                setDescription("");
                if (mCoupon.getName() != null)
                {
                    setLabel(mCoupon.getName());
                }
                if (mCoupon.getPrice() != null)
                {
                    setPrice(cleanPrice(mCoupon.getPrice()));
                }
                if (LoyaltyUtil.isLoyaltyCoupon(mCoupon))
                {
                    mTitleTextView.setText(mLoyaltyHeader);
                    return;
                } else
                {
                    mTitleTextView.setText(mCouponWizardTitleText);
                    return;
                }
            }
        }
    }

    public void doneWithCoupon()
    {
        App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromUX.CouponCompleted());
        onCouponFulfilled();
    }

    public boolean handleHomeButtonClicked()
    {
        mCouponWizardController.removeCoupon(mCouponLine);
        return true;
    }

    public void onAddAnotherItemClick()
    {
        mAnalyticsUtil.postAddAnotherItemClick();
        getListView().performItemClick(null, -1, 0L);
    }

    public void onAddAnotherItemRequested(com.dominos.bus.events.OriginatedFromSpeech.CouponAddAnotherItemRequested couponaddanotheritemrequested)
    {
        mSpeechManager.preventNinaPause();
        onAddAnotherItemClick();
    }

    void onAfterInject()
    {
        mCouponWizardController = mControllerLocator.getCouponWizardController(this);
        mProductWizardManager = (ProductWizardManager)mMobileSession.getManager("product_wizard_manager");
    }

    public void onBackPressed()
    {
        mCouponWizardController.removeCoupon(mCouponLine);
    }

    public void onCouponDone(com.dominos.bus.events.OriginatedFromSpeech.CouponDone coupondone)
    {
        mSpeechManager.preventNinaPause();
        onDoneButtonClick();
    }

    protected void onCouponEditClick()
    {
        ((LabsCouponWizardListAdapter)getListAdapter()).toggleEditMode();
        showCouponLineRemoveImage();
        setEditBtnText();
    }

    public void onCouponFulfilled()
    {
        mSpeechManager.preventNinaPause();
        mOrderManager.getOrder().clearPrices();
        ((CartActivity_.IntentBuilder_)CartActivity_.intent(this).flags(0x4000000)).start();
    }

    public void onCouponRemoveClick()
    {
        mActivityHelper.showOptionAlert(AlertType.DELETE_CONFIRMATION_COUPON, null, new _cls5());
    }

    public void onCouponRemoved()
    {
        mSpeechManager.preventNinaPause();
        ((CartActivity_.IntentBuilder_)CartActivity_.intent(this).flags(0x4000000)).start();
        App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromUX.CouponReset());
        App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromUX.CouponRemoved());
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        return true;
    }

    public void onDeleteClick(View view)
    {
        showDeleteConfirm(((Integer)view.getTag()).intValue());
    }

    public void onDoneButtonClick()
    {
        mAnalyticsUtil.postDoneButtonClicked();
        App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromUX.CouponCompleted());
        endCouponEditing();
        onCouponFulfilled();
    }

    protected void onPause()
    {
        super.onPause();
        App.getInstance().bus.unregister(this);
    }

    public void onProductPopupClick(View view)
    {
        View view1 = inflater.inflate(0x7f0300a4, null, false);
        final PopupWindow pw = (ImageView)view1.findViewById(0x7f0f0287);
        ImageManagerCDN.INSTANCE.addProductPopupImage(pw, (String)view.getTag());
        pw = new PopupWindow(view1, 450, 400, true);
        pw.setAnimationStyle(0x1030004);
        pw.showAtLocation(view, 17, 0, 0);
        ((Button)view1.findViewById(0x7f0f0387)).setOnClickListener(new _cls3());
    }

    public void onProductReplaced(com.dominos.bus.events.OriginatedFromSpeech.ShowProductReplaced showproductreplaced)
    {
        showProductReplacedAlert(showproductreplaced.getProductCode());
    }

    public void onResume()
    {
        super.onResume();
        mProductWizardManager.setFromCouponWizard(true);
        displayList();
        App.getInstance().bus.post(new com.dominos.bus.events.ExplicitNavigationEvents.CouponWizardActivityTransition());
        App.getInstance().bus.register(this);
        mNinaHelper.clearPartialProductsResetProductController();
        scrolllToTheBottom();
    }

    protected void onStart()
    {
        super.onStart();
        mAnalyticsUtil.postCouponWizardVisit();
    }

    public void onVoiceRemove(com.dominos.bus.events.OriginatedFromSpeech.CouponRemoved couponremoved)
    {
        mCouponWizardController.removeCoupon(mCouponLine);
    }

    protected void showProductReplacedAlert(String s)
    {
        s = mCartManager.getReplacedProductMessage(s);
        String as[] = (new CommandBuilder()).appendReset(CouponCommandAgent.NAME).appendValue(ProductsAgent.CONCEPT, "DONE").appendValue(UserIntentionAgent.CONCEPT, "detail").appendValue(CouponWizardGuard.CONCEPT, "DONE").build();
        mActivityHelper.showCustomLookGeneralAlert(getString(0x7f0800b9), s, getString(0x7f0800b7), as, null);
    }







    private class _cls1
        implements android.widget.AdapterView.OnItemClickListener
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
                hashmap.putAll(mCouponWizardController.createProductGroupMap(adapterview));
            }
            labscategory = LabsCategory.getInstance(mMenuManager.getFoodCategory());
            mCouponWizardController.filterCategory(labscategory, hashmap);
            labscategory.pruneCategory();
            s = labscategory.singleProductCategorySearch();
            mSpeechManager.preventNinaPause();
            if (view instanceof LabsProductLine)
            {
                i = ((LabsProductLine)view).getId();
                view = new LabsProductLine((LabsProductLine)view);
                view.setId(i);
                mProductWizardManager.initialize(view.getProduct(), mNinaHelper.getGroupVariantsByProduct(adapterview, view.getProduct()));
                mProductWizardManager.setProductLine(view);
                mProductWizardManager.setEditMode(true);
                mProductWizardManager.setProductLineId(i);
                mNinaHelper.resetCurrentPartialProduct(view.getProduct());
                App.getInstance().bus.post(new com.dominos.bus.events.SpeechEvents.StopNinaRequest());
                goToLabsProductDetailActivity();
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
                mProductWizardManager.replaceProductLine(adapterview);
                goToLabsProductDetailActivity();
                return;
            }
            mProductWizardManager.setEditMode(false);
            if (labscategory.getCategoryList().size() != 1)
            {
                break MISSING_BLOCK_LABEL_687;
            }
            if (hashmap.size() != 1 || s == null) goto _L2; else goto _L1
_L1:
            view = (LabsProduct)hashmap.get(s);
            mProductWizardManager.initialize(view, mMenuManager.getVariantsForVariantCodes(adapterview.getProductCodes()));
            mNinaHelper.resetCurrentPartialProduct(view);
            if (mProductWizardManager.getCurrentVariants().size() != 1) goto _L4; else goto _L3
_L3:
            ((LabsProductDetailListActivity_.IntentBuilder_)LabsProductDetailListActivity_.intent(LabsCouponWizardActivity.this).flags(0x10020000)).start();
_L5:
            App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromUX.ProductSelected(true));
            return;
_L4:
            if (mProductWizardManager.hasFlavors())
            {
                ((LabsFlavorListActivity_.IntentBuilder_)LabsFlavorListActivity_.intent(LabsCouponWizardActivity.this).flags(0x10020000)).start();
            } else
            if (mProductWizardManager.hasSizes())
            {
                ((LabsSizeListActivity_.IntentBuilder_)LabsSizeListActivity_.intent(LabsCouponWizardActivity.this).flags(0x10020000)).start();
            }
            if (true) goto _L5; else goto _L2
_L2:
            App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromUX.MenuListSelected(true));
            LabsMenuListActivity_.intent(LabsCouponWizardActivity.this).categories((ArrayList)labscategory.getCategoryList()).start();
            return;
            App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromUX.MenuSelected(true));
            LabsRootMenuListActivity_.intent(LabsCouponWizardActivity.this).category(labscategory).start();
            return;
        }

        _cls1()
        {
            this$0 = LabsCouponWizardActivity.this;
            super();
        }
    }


    private class _cls2
        implements android.widget.AdapterView.OnItemLongClickListener
    {

        final LabsCouponWizardActivity this$0;

        public boolean onItemLongClick(AdapterView adapterview, View view, int i, long l)
        {
            if (view instanceof LabsProductLineView)
            {
                showDeleteConfirm(i);
            }
            return true;
        }

        _cls2()
        {
            this$0 = LabsCouponWizardActivity.this;
            super();
        }
    }


    private class _cls4 extends com.dominos.utils.ActivityHelper.OptionAlertActionCallback
    {

        final LabsCouponWizardActivity this$0;
        final int val$id;

        public void onNegativeButtonClicked()
        {
        }

        public void onNeutralButtonClicked()
        {
        }

        public void onPositiveButtonClicked()
        {
            LabsOrder labsorder = mOrderManager.getOrder();
            LabsProductLine labsproductline = (LabsProductLine)((CouponWizardLineHolder)((LabsCouponWizardListAdapter)getListAdapter()).getItem(id)).getLine();
            mCartManager.removeCouponProductLine(labsorder, labsproductline);
            labsorder.clearPrices();
            displayList();
        }

        _cls4()
        {
            this$0 = LabsCouponWizardActivity.this;
            id = i;
            super();
        }
    }


    private class _cls5 extends com.dominos.utils.ActivityHelper.OptionAlertActionCallback
    {

        final LabsCouponWizardActivity this$0;

        public void onNegativeButtonClicked()
        {
        }

        public void onNeutralButtonClicked()
        {
        }

        public void onPositiveButtonClicked()
        {
            mCouponWizardController.removeCoupon(mCouponLine);
        }

        _cls5()
        {
            this$0 = LabsCouponWizardActivity.this;
            super();
        }
    }


    private class _cls3
        implements android.view.View.OnClickListener
    {

        final LabsCouponWizardActivity this$0;
        final PopupWindow val$pw;

        public void onClick(View view)
        {
            pw.dismiss();
        }

        _cls3()
        {
            this$0 = LabsCouponWizardActivity.this;
            pw = popupwindow;
            super();
        }
    }

}
