// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wl;

import com.kohls.mcommerce.opal.helper.actionbar.ActionBarHelper;

// Referenced classes of package com.kohls.mcommerce.opal.wl:
//            WLActivity

class this._cls0
    implements Runnable
{

    final WLActivity this$0;

    public void run()
    {
        WLActivity.access$000(WLActivity.this).updateShopingBagCountAndVisibility(false);
    }

    .ActionBarHelper()
    {
        this$0 = WLActivity.this;
        super();
    }
}
