// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.modules.lnr.framework.view.activity;


// Referenced classes of package com.kohls.mcommerce.opal.modules.lnr.framework.view.activity:
//            MyRegistryActivity

public static final class  extends Enum
{

    private static final REGISTRY_ADVANCE_SEARCH $VALUES[];
    public static final REGISTRY_ADVANCE_SEARCH CREATE_BABY_REG;
    public static final REGISTRY_ADVANCE_SEARCH CREATE_CELEB_REGISTRY;
    public static final REGISTRY_ADVANCE_SEARCH CREATE_REGISTRY;
    public static final REGISTRY_ADVANCE_SEARCH CREATE_WEDDING_REGISTRY;
    public static final REGISTRY_ADVANCE_SEARCH MANAGE_REGISTRY;
    public static final REGISTRY_ADVANCE_SEARCH REGISTRY_ADVANCE_SEARCH;
    public static final REGISTRY_ADVANCE_SEARCH REGISTRY_DETAIL_PAGE;
    public static final REGISTRY_ADVANCE_SEARCH REGISTRY_FILTER;
    public static final REGISTRY_ADVANCE_SEARCH SEARCH_RESULT_REGISTRY;
    public static final REGISTRY_ADVANCE_SEARCH WEDDING_REGISTRY_ABOUT;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/kohls/mcommerce/opal/modules/lnr/framework/view/activity/MyRegistryActivity$RegistryScreenType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        CREATE_REGISTRY = new <init>("CREATE_REGISTRY", 0);
        CREATE_WEDDING_REGISTRY = new <init>("CREATE_WEDDING_REGISTRY", 1);
        MANAGE_REGISTRY = new <init>("MANAGE_REGISTRY", 2);
        WEDDING_REGISTRY_ABOUT = new <init>("WEDDING_REGISTRY_ABOUT", 3);
        SEARCH_RESULT_REGISTRY = new <init>("SEARCH_RESULT_REGISTRY", 4);
        REGISTRY_FILTER = new <init>("REGISTRY_FILTER", 5);
        REGISTRY_DETAIL_PAGE = new <init>("REGISTRY_DETAIL_PAGE", 6);
        CREATE_BABY_REG = new <init>("CREATE_BABY_REG", 7);
        CREATE_CELEB_REGISTRY = new <init>("CREATE_CELEB_REGISTRY", 8);
        REGISTRY_ADVANCE_SEARCH = new <init>("REGISTRY_ADVANCE_SEARCH", 9);
        $VALUES = (new .VALUES[] {
            CREATE_REGISTRY, CREATE_WEDDING_REGISTRY, MANAGE_REGISTRY, WEDDING_REGISTRY_ABOUT, SEARCH_RESULT_REGISTRY, REGISTRY_FILTER, REGISTRY_DETAIL_PAGE, CREATE_BABY_REG, CREATE_CELEB_REGISTRY, REGISTRY_ADVANCE_SEARCH
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
