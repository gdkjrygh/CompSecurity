// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.view.fragment.productdetails;


// Referenced classes of package com.kohls.mcommerce.opal.framework.view.fragment.productdetails:
//            ProductDetailsFragmentFactory

public static final class  extends Enum
{

    private static final COLLECTIONS $VALUES[];
    public static final COLLECTIONS COLLECTIONS;
    public static final COLLECTIONS SINGLE_PRODUCT_DETAILS;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/kohls/mcommerce/opal/framework/view/fragment/productdetails/ProductDetailsFragmentFactory$ProductDetailsType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        SINGLE_PRODUCT_DETAILS = new <init>("SINGLE_PRODUCT_DETAILS", 0);
        COLLECTIONS = new <init>("COLLECTIONS", 1);
        $VALUES = (new .VALUES[] {
            SINGLE_PRODUCT_DETAILS, COLLECTIONS
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
