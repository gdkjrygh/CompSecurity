// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.view;

import com.pinterest.ui.imageview.WebImageView;
import com.pinterest.ui.text.PButton;
import com.pinterest.ui.text.PTextView;

// Referenced classes of package com.pinterest.activity.commerce.view:
//            ShopSpaceCoverView

public class 
{

    public static void inject(butterknife.eCoverView ecoverview, ShopSpaceCoverView shopspacecoverview, Object obj)
    {
        shopspacecoverview.background = (WebImageView)ecoverview.background(obj, 0x7f0f0425, "field 'background'");
        shopspacecoverview.title = (PTextView)ecoverview.title(obj, 0x7f0f0426, "field 'title'");
        shopspacecoverview.description = (PTextView)ecoverview.description(obj, 0x7f0f0427, "field 'description'");
        shopspacecoverview.button = (PButton)ecoverview.button(obj, 0x7f0f0428, "field 'button'");
        shopspacecoverview.label = (PTextView)ecoverview.label(obj, 0x7f0f0429, "field 'label'");
    }

    public static void reset(ShopSpaceCoverView shopspacecoverview)
    {
        shopspacecoverview.background = null;
        shopspacecoverview.title = null;
        shopspacecoverview.description = null;
        shopspacecoverview.button = null;
        shopspacecoverview.label = null;
    }

    public ()
    {
    }
}
