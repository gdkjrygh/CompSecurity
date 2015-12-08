// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.view.fragment.productdetails;

import android.app.Activity;
import android.os.Bundle;
import com.kohls.mcommerce.opal.framework.view.fragment.FragmentFactory;
import com.kohls.mcommerce.opal.framework.vo.ProductDetailVO;

// Referenced classes of package com.kohls.mcommerce.opal.framework.view.fragment.productdetails:
//            ProductDetailsDecorator, CollectionsDecorator

public class ProductDetailsFragmentFactory
{
    public static final class ProductDetailsType extends Enum
    {

        private static final ProductDetailsType $VALUES[];
        public static final ProductDetailsType COLLECTIONS;
        public static final ProductDetailsType SINGLE_PRODUCT_DETAILS;

        public static ProductDetailsType valueOf(String s)
        {
            return (ProductDetailsType)Enum.valueOf(com/kohls/mcommerce/opal/framework/view/fragment/productdetails/ProductDetailsFragmentFactory$ProductDetailsType, s);
        }

        public static ProductDetailsType[] values()
        {
            return (ProductDetailsType[])$VALUES.clone();
        }

        static 
        {
            SINGLE_PRODUCT_DETAILS = new ProductDetailsType("SINGLE_PRODUCT_DETAILS", 0);
            COLLECTIONS = new ProductDetailsType("COLLECTIONS", 1);
            $VALUES = (new ProductDetailsType[] {
                SINGLE_PRODUCT_DETAILS, COLLECTIONS
            });
        }

        private ProductDetailsType(String s, int i)
        {
            super(s, i);
        }
    }


    public ProductDetailsFragmentFactory()
    {
    }

    public static void attachProductDetails(ProductDetailsType productdetailstype, Activity activity, Bundle bundle, String s, String s1, String s2, ProductDetailVO productdetailvo, boolean flag, 
            String s3, String s4)
    {
    /* anonymous class not found */
    class _anm1 {}

        switch (_cls1..SwitchMap.com.kohls.mcommerce.opal.framework.view.fragment.productdetails.ProductDetailsFragmentFactory.ProductDetailsType[productdetailstype.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            FragmentFactory.attachProductDetailsFragment(activity, bundle, new ProductDetailsDecorator(activity, s, s1, s2, productdetailvo, flag, s4, s3));
            return;

        case 2: // '\002'
            FragmentFactory.attachProductDetailsFragment(activity, bundle, new CollectionsDecorator(s, s1, s2, productdetailvo, flag, s3));
            break;
        }
    }
}
