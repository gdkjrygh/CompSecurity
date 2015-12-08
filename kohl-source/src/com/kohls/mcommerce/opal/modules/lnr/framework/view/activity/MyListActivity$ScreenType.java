// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.modules.lnr.framework.view.activity;


// Referenced classes of package com.kohls.mcommerce.opal.modules.lnr.framework.view.activity:
//            MyListActivity

public static final class  extends Enum
{

    private static final LIST_SEARCH_RESULT $VALUES[];
    public static final LIST_SEARCH_RESULT CREATE_LIST;
    public static final LIST_SEARCH_RESULT LIST_SEARCH_RESULT;
    public static final LIST_SEARCH_RESULT MY_LIST;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/kohls/mcommerce/opal/modules/lnr/framework/view/activity/MyListActivity$ScreenType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        CREATE_LIST = new <init>("CREATE_LIST", 0);
        MY_LIST = new <init>("MY_LIST", 1);
        LIST_SEARCH_RESULT = new <init>("LIST_SEARCH_RESULT", 2);
        $VALUES = (new .VALUES[] {
            CREATE_LIST, MY_LIST, LIST_SEARCH_RESULT
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
