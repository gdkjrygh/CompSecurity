// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.controller.impl;

import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.po.ProductDetailPO;
import com.kohls.mcommerce.opal.common.util.Logger;
import com.kohls.mcommerce.opal.framework.controller.iface.IProductDetailController;
import com.kohls.mcommerce.opal.framework.view.activity.ProductDetailsActivity;
import com.kohls.mcommerce.opal.framework.vo.ErrorVO;
import com.kohls.mcommerce.opal.framework.vo.IValueObject;
import com.kohls.mcommerce.opal.framework.vo.InventoryVO;
import com.kohls.mcommerce.opal.framework.vo.PricingVO;
import com.kohls.mcommerce.opal.framework.vo.ProductDetailVO;
import com.kohls.mcommerce.opal.helper.adapter.AdapterHelper;
import com.kohls.mcommerce.opal.helper.adapter.AdapterProcedure;
import com.kohls.mcommerce.opal.helper.cache.inmemory.HeaderObject;
import com.kohls.mcommerce.opal.helper.error.Error;
import com.kohls.mcommerce.opal.helper.preference.PreferenceHelper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.kohls.mcommerce.opal.framework.controller.impl:
//            BaseControllerImpl

public class PDPActivityControllerImpl extends BaseControllerImpl
    implements IProductDetailController
{

    private WeakReference mProductDetailsActivity;

    public PDPActivityControllerImpl(WeakReference weakreference)
    {
        mProductDetailsActivity = weakreference;
    }

    public Error getPayloadError(IValueObject ivalueobject)
    {
        Logger.debug("Payload Error", ivalueobject.toString());
        if (ivalueobject instanceof ProductDetailVO)
        {
            ivalueobject = (ProductDetailVO)ivalueobject;
            if (ivalueobject.getErrors() != null && ivalueobject.getErrors().size() > 0)
            {
                return new Error(((com.kohls.mcommerce.opal.framework.vo.ProductDetailVO.Error)ivalueobject.getErrors().get(0)).getCode(), ((com.kohls.mcommerce.opal.framework.vo.ProductDetailVO.Error)ivalueobject.getErrors().get(0)).getMessage(), com.kohls.mcommerce.opal.helper.error.Error.ErrorType.ADAPTER_PAYLOAD);
            }
            if (ivalueobject.getPayload() != null && ivalueobject.getPayload().getproducts() != null && ivalueobject.getPayload().getproducts().size() > 0 && ((com.kohls.mcommerce.opal.framework.vo.ProductDetailVO.Payload.Product)ivalueobject.getPayload().getproducts().get(0)).getError() != null)
            {
                return new Error(((com.kohls.mcommerce.opal.framework.vo.ProductDetailVO.Payload.Product)ivalueobject.getPayload().getproducts().get(0)).getError().getCode(), ((com.kohls.mcommerce.opal.framework.vo.ProductDetailVO.Payload.Product)ivalueobject.getPayload().getproducts().get(0)).getError().getMessage(), com.kohls.mcommerce.opal.helper.error.Error.ErrorType.ADAPTER_PAYLOAD);
            }
        } else
        if (ivalueobject instanceof PricingVO)
        {
            ivalueobject = (PricingVO)ivalueobject;
            if (ivalueobject.getErrors() != null && ivalueobject.getErrors().size() > 0)
            {
                return new Error(((ErrorVO)ivalueobject.getErrors().get(0)).getCode(), ((ErrorVO)ivalueobject.getErrors().get(0)).getMessage(), com.kohls.mcommerce.opal.helper.error.Error.ErrorType.ADAPTER_PAYLOAD);
            }
        }
        return null;
    }

    public void getProductDetailData(String s, String s1, String s2)
    {
        Object obj;
        ProductDetailPO productdetailpo;
        productdetailpo = new ProductDetailPO();
        obj = null;
        if (s1 == null) goto _L2; else goto _L1
_L1:
        productdetailpo.setallSkus(true);
        productdetailpo.setSkuCode(s1);
        s = new HeaderObject("productDetail", productdetailpo.getSkuCode());
_L4:
        productdetailpo.setSkuDetail(true);
        (new AdapterHelper(AdapterProcedure.PRODUCT_DETAIL, productdetailpo, this, s)).performTask();
        return;
_L2:
        if (s != null)
        {
            productdetailpo.setWebID(s);
            s = new HeaderObject("productDetail", productdetailpo.getWebID());
        } else
        {
            s = obj;
            if (s2 != null)
            {
                productdetailpo.setallSkus(true);
                productdetailpo.setUpc(s2);
                s = new HeaderObject("productDetail", productdetailpo.getUpc());
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void getProductPricingData(String s, String s1)
    {
    }

    public void onFailure(Error error)
    {
        Logger.debug("Error", error.getMessage().toString());
        if (mProductDetailsActivity.get() != null && !((ProductDetailsActivity)mProductDetailsActivity.get()).isFinishing() && mProductDetailsActivity.get() != null)
        {
            ((ProductDetailsActivity)mProductDetailsActivity.get()).runOnUiThread(new _cls1(error));
        }
    }

    public void onSuccess(IValueObject ivalueobject)
    {
        if (!(ivalueobject instanceof ProductDetailVO)) goto _L2; else goto _L1
_L1:
        ivalueobject = (ProductDetailVO)ivalueobject;
        Logger.debug("Success for Product Details", ivalueobject.toString());
        if (mProductDetailsActivity.get() == null || ((ProductDetailsActivity)mProductDetailsActivity.get()).isFinishing()) goto _L4; else goto _L3
_L3:
        if (ivalueobject.getErrors() == null || ivalueobject.getErrors().size() <= 0) goto _L6; else goto _L5
_L5:
        ((ProductDetailsActivity)mProductDetailsActivity.get()).notifyViewOnFailure(null);
_L4:
        return;
_L6:
        ((ProductDetailsActivity)mProductDetailsActivity.get()).notifyViewOnSuccess(ivalueobject);
        KohlsPhoneApplication.getInstance().getKohlsPref().deletePref("requestID");
        return;
_L2:
        if (!(ivalueobject instanceof PricingVO))
        {
            continue; /* Loop/switch isn't completed */
        }
        ivalueobject = (PricingVO)ivalueobject;
        Logger.debug("Success for Product Pricing Details", ivalueobject.toString());
        if (mProductDetailsActivity.get() == null || ((ProductDetailsActivity)mProductDetailsActivity.get()).isFinishing()) goto _L4; else goto _L7
_L7:
        if (ivalueobject.getErrors() == null && !ivalueobject.getErrors().isEmpty())
        {
            ((ProductDetailsActivity)mProductDetailsActivity.get()).notifyViewOnFailure(null);
            return;
        } else
        {
            ((ProductDetailsActivity)mProductDetailsActivity.get()).notifyViewOnSuccess(ivalueobject);
            return;
        }
        if (!(ivalueobject instanceof InventoryVO)) goto _L4; else goto _L8
_L8:
        ivalueobject = (InventoryVO)ivalueobject;
        if (ivalueobject.getErrors() != null && !ivalueobject.getErrors().isEmpty())
        {
            ((ProductDetailsActivity)mProductDetailsActivity.get()).notifyViewOnFailure(null);
            return;
        } else
        {
            ((ProductDetailsActivity)mProductDetailsActivity.get()).notifyViewOnSuccess(ivalueobject);
            return;
        }
    }


    /* member class not found */
    class _cls1 {}

}
