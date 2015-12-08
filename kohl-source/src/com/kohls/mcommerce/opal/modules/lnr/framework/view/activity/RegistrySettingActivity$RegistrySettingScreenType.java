// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.modules.lnr.framework.view.activity;


// Referenced classes of package com.kohls.mcommerce.opal.modules.lnr.framework.view.activity:
//            RegistrySettingActivity

public static final class  extends Enum
{

    private static final REGISTRY_SETTING $VALUES[];
    public static final REGISTRY_SETTING REGISTRY_SETTING;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/kohls/mcommerce/opal/modules/lnr/framework/view/activity/RegistrySettingActivity$RegistrySettingScreenType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        REGISTRY_SETTING = new <init>("REGISTRY_SETTING", 0);
        $VALUES = (new .VALUES[] {
            REGISTRY_SETTING
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
