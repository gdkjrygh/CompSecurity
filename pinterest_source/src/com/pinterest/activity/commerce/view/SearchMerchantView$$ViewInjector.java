// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.view;

import com.pinterest.ui.imageview.WebImageView;
import com.pinterest.ui.text.PTextView;

// Referenced classes of package com.pinterest.activity.commerce.view:
//            SearchMerchantView

public class 
{

    public static void inject(butterknife.rchantView rchantview, SearchMerchantView searchmerchantview, Object obj)
    {
        searchmerchantview.title = (PTextView)rchantview.title(obj, 0x7f0f03dc, "field 'title'");
        searchmerchantview.subtitle = (PTextView)rchantview.subtitle(obj, 0x7f0f03dd, "field 'subtitle'");
        searchmerchantview.logo = (WebImageView)rchantview.logo(obj, 0x7f0f03da, "field 'logo'");
        searchmerchantview.logoBorder = rchantview.logoBorder(obj, 0x7f0f03db, "field 'logoBorder'");
    }

    public static void reset(SearchMerchantView searchmerchantview)
    {
        searchmerchantview.title = null;
        searchmerchantview.subtitle = null;
        searchmerchantview.logo = null;
        searchmerchantview.logoBorder = null;
    }

    public ()
    {
    }
}
