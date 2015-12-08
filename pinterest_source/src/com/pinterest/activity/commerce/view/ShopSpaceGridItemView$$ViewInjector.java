// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.view;

import com.pinterest.ui.imageview.WebImageView;
import com.pinterest.ui.text.PTextView;

// Referenced classes of package com.pinterest.activity.commerce.view:
//            ShopSpaceGridItemView

public class 
{

    public static void inject(butterknife.idItemView iditemview, ShopSpaceGridItemView shopspacegriditemview, Object obj)
    {
        shopspacegriditemview.background = (WebImageView)iditemview.background(obj, 0x7f0f042a, "field 'background'");
        shopspacegriditemview.title = (PTextView)iditemview.title(obj, 0x7f0f042c, "field 'title'");
        shopspacegriditemview.border = iditemview.border(obj, 0x7f0f042b);
    }

    public static void reset(ShopSpaceGridItemView shopspacegriditemview)
    {
        shopspacegriditemview.background = null;
        shopspacegriditemview.title = null;
        shopspacegriditemview.border = null;
    }

    public ()
    {
    }
}
