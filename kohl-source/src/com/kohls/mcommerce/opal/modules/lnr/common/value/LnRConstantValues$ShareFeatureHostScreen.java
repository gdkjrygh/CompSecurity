// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.modules.lnr.common.value;


// Referenced classes of package com.kohls.mcommerce.opal.modules.lnr.common.value:
//            LnRConstantValues

public static final class  extends Enum
{

    private static final LIST_DETAILS_SCREEN $VALUES[];
    public static final LIST_DETAILS_SCREEN LIST_DETAILS_SCREEN;
    public static final LIST_DETAILS_SCREEN PRODUCT_DETAILS_SCREEN;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/kohls/mcommerce/opal/modules/lnr/common/value/LnRConstantValues$ShareFeatureHostScreen, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        PRODUCT_DETAILS_SCREEN = new <init>("PRODUCT_DETAILS_SCREEN", 0);
        LIST_DETAILS_SCREEN = new <init>("LIST_DETAILS_SCREEN", 1);
        $VALUES = (new .VALUES[] {
            PRODUCT_DETAILS_SCREEN, LIST_DETAILS_SCREEN
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
