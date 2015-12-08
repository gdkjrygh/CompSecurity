// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.view.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import com.kohls.mcommerce.opal.common.ui.toast.ToastUtility;
import com.kohls.mcommerce.opal.common.util.UtilityMethods;
import com.kohls.mcommerce.opal.framework.controller.ControllerFactory;
import com.kohls.mcommerce.opal.framework.controller.impl.PDPActivityControllerImpl;
import com.kohls.mcommerce.opal.framework.view.fragment.productdetails.ProductDetailsFragmentFactory;
import com.kohls.mcommerce.opal.framework.vo.ProductDetailVO;
import com.kohls.mcommerce.opal.helper.actionbar.ActionBarHelper;
import com.kohls.mcommerce.opal.helper.error.Error;
import com.kohls.mcommerce.opal.helper.error.ErrorHelper;
import com.kohls.mcommerce.opal.wl.HybridScreen;
import java.lang.ref.WeakReference;
import java.util.List;

// Referenced classes of package com.kohls.mcommerce.opal.framework.view.activity:
//            BaseActivityWithoutSlider, CollectionsActivity

public class ProductDetailsActivity extends BaseActivityWithoutSlider
{

    private String collectionID;
    private String itemIndex;
    private boolean mIsFromEditShoppingBag;
    private PDPActivityControllerImpl mProductDetailControllerImpl;
    private ProductDetailVO mProductDetailVO;
    private LinearLayout mProgressBox;
    private boolean mScan;
    public boolean mShouldRemoveToast;
    protected String mSkuCode;
    protected String mUpcCode;
    protected String mWebID;

    public ProductDetailsActivity()
    {
        mShouldRemoveToast = true;
    }

    private void attachActionItemListener()
    {
        getActionBarHelper().getItemView().setOnClickListener(new android.view.View.OnClickListener() {

            final ProductDetailsActivity this$0;

            public void onClick(View view)
            {
                UtilityMethods.openHybridScreen(ProductDetailsActivity.this, HybridScreen.SHOPPINGBAG);
            }

            
            {
                this$0 = ProductDetailsActivity.this;
                super();
            }
        });
    }

    private void initializeAttributes()
    {
        Bundle bundle = getIntent().getExtras();
        Intent intent = getIntent();
        if ("android.intent.action.VIEW".equals(intent.getAction()))
        {
            mWebID = intent.getData().getQueryParameter("webid");
            mIsFromEditShoppingBag = false;
            mScan = false;
        } else
        if (bundle != null)
        {
            mWebID = bundle.getString("key_category_id");
            mUpcCode = bundle.getString("key_upc_code");
            mScan = bundle.getBoolean("INTENT_FROM_SCAN");
            if (bundle.containsKey("key_edit_shopping_bag_itemIndexs"))
            {
                itemIndex = bundle.getString("key_edit_shopping_bag_itemIndexs");
            }
            mIsFromEditShoppingBag = bundle.getBoolean("key_is_edit_shopping_bag");
            if (bundle.getString("key_edit_shopping_bag_sku") != null)
            {
                mSkuCode = bundle.getString("key_edit_shopping_bag_sku");
            } else
            if (bundle.getString("key_sku_from_list_or_registry") != null)
            {
                mSkuCode = bundle.getString("key_sku_from_list_or_registry");
            } else
            {
                mSkuCode = bundle.getString("key_sku_code");
            }
            collectionID = bundle.getString("Collection_id");
            return;
        }
    }

    private void loadContent()
    {
        initializeController();
        loadProductDetail();
    }

    private void loadProductDetail()
    {
        mProductDetailControllerImpl.getProductDetailData(mWebID, mSkuCode, mUpcCode);
    }

    private void updateView()
    {
        if (UtilityMethods.isNetworkConnected(this))
        {
            initializeAttributes();
            loadContent();
            attachActionItemListener();
            return;
        } else
        {
            UtilityMethods.showToast(this, getString(0x7f0803cd), 0);
            finish();
            return;
        }
    }

    protected int getLayoutId()
    {
        return 0x7f0300c8;
    }

    protected void initializeController()
    {
        mProductDetailControllerImpl = (PDPActivityControllerImpl)ControllerFactory.getProductDetailController(new WeakReference(this));
    }

    protected void initializeViews(Bundle bundle)
    {
        mProgressBox = (LinearLayout)findViewById(0x7f0d04c8);
        mProgressBox.setVisibility(0);
        updateView();
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        if (i == 12)
        {
            setResult(j);
            finish();
        }
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
    }

    protected void onPause()
    {
        if (mShouldRemoveToast)
        {
            ToastUtility.hideAllCustomToast();
        }
        super.onPause();
    }

    protected void updateActionBarViews()
    {
        getActionBarHelper().showActionBarWithProductDetail();
    }

    public void updateViewsOnFailure(Object obj)
    {
        mProgressBox.setVisibility(8);
        if (!(obj instanceof Error)) goto _L2; else goto _L1
_L1:
        if (ErrorHelper.isApplicationManagable((Error)obj)) goto _L4; else goto _L3
_L3:
        if (!mScan) goto _L6; else goto _L5
_L5:
        obj = UtilityMethods.getAlertDialog(this, getResources().getString(0x7f0804a8), getResources().getString(0x7f0803e5), null, new android.content.DialogInterface.OnClickListener() {

            final ProductDetailsActivity this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                if (i == -1)
                {
                    finish();
                }
            }

            
            {
                this$0 = ProductDetailsActivity.this;
                super();
            }
        });
        ((android.app.AlertDialog.Builder) (obj)).setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

            final ProductDetailsActivity this$0;

            public void onCancel(DialogInterface dialoginterface)
            {
                finish();
            }

            
            {
                this$0 = ProductDetailsActivity.this;
                super();
            }
        });
        ((android.app.AlertDialog.Builder) (obj)).show();
_L4:
        return;
_L6:
        UtilityMethods.showToast(this, ((Error)obj).getMessage(), 0);
        return;
_L2:
        if (!(obj instanceof ProductDetailVO))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((ProductDetailVO)obj).getErrors() == null || ((ProductDetailVO)obj).getErrors().size() <= 0 || ((com.kohls.mcommerce.opal.framework.vo.ProductDetailVO.Error)((ProductDetailVO)obj).getErrors().get(0)).getMessage() == null) goto _L4; else goto _L7
_L7:
        UtilityMethods.showToast(this, ((Error)obj).getMessage(), 0);
        return;
        if (mProductDetailVO == null || mProductDetailVO.getPayload() == null || mProductDetailVO.getPayload().getproducts() == null) goto _L4; else goto _L8
_L8:
        ProductDetailsFragmentFactory.attachProductDetails(com.kohls.mcommerce.opal.framework.view.fragment.productdetails.ProductDetailsFragmentFactory.ProductDetailsType.SINGLE_PRODUCT_DETAILS, this, getIntent().getExtras(), mWebID, mSkuCode, mUpcCode, mProductDetailVO, mScan, itemIndex, collectionID);
        return;
    }

    public void updateViewsOnSuccess(Object obj)
    {
label0:
        {
            if (obj instanceof ProductDetailVO)
            {
                mProductDetailVO = (ProductDetailVO)obj;
                if (mProductDetailVO != null && mProductDetailVO.getPayload() != null && mProductDetailVO.getPayload().getproducts() != null)
                {
                    if (((com.kohls.mcommerce.opal.framework.vo.ProductDetailVO.Payload.Product)mProductDetailVO.getPayload().getproducts().get(0)).getCollection() == null || ((com.kohls.mcommerce.opal.framework.vo.ProductDetailVO.Payload.Product)mProductDetailVO.getPayload().getproducts().get(0)).getCollection().isEmpty())
                    {
                        break label0;
                    }
                    mProgressBox.setVisibility(8);
                    ProductDetailsFragmentFactory.attachProductDetails(com.kohls.mcommerce.opal.framework.view.fragment.productdetails.ProductDetailsFragmentFactory.ProductDetailsType.COLLECTIONS, this, getIntent().getExtras(), mWebID, mSkuCode, mUpcCode, mProductDetailVO, mScan, itemIndex, collectionID);
                    if ((CollectionsActivity)this != null)
                    {
                        ((CollectionsActivity)this).setColloectionWebID(mWebID);
                    }
                }
            }
            return;
        }
        mProgressBox.setVisibility(8);
        ProductDetailsFragmentFactory.attachProductDetails(com.kohls.mcommerce.opal.framework.view.fragment.productdetails.ProductDetailsFragmentFactory.ProductDetailsType.SINGLE_PRODUCT_DETAILS, this, getIntent().getExtras(), mWebID, mSkuCode, mUpcCode, mProductDetailVO, mScan, itemIndex, collectionID);
    }
}
