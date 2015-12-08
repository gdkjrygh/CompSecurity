// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.view;

import com.pinterest.ui.imageview.WebImageView;
import com.pinterest.ui.text.PTextView;

// Referenced classes of package com.pinterest.activity.commerce.view:
//            ShopSpaceSectionItemView

public class Q
{

    public static void inject(butterknife.onItemView onitemview, ShopSpaceSectionItemView shopspacesectionitemview, Object obj)
    {
        shopspacesectionitemview.background = (WebImageView)onitemview.background(obj, 0x7f0f0432, "field 'background'");
        shopspacesectionitemview.border = onitemview.border(obj, 0x7f0f0433, "field 'border'");
        shopspacesectionitemview.title = (PTextView)onitemview.title(obj, 0x7f0f0434, "field 'title'");
        shopspacesectionitemview.subTitle = (PTextView)onitemview.subTitle(obj, 0x7f0f0435, "field 'subTitle'");
    }

    public static void reset(ShopSpaceSectionItemView shopspacesectionitemview)
    {
        shopspacesectionitemview.background = null;
        shopspacesectionitemview.border = null;
        shopspacesectionitemview.title = null;
        shopspacesectionitemview.subTitle = null;
    }

    public Q()
    {
    }
}
