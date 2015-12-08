// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.logic;

import com.pinterest.activity.commerce.event.VariantSelectedEvent;
import com.pinterest.activity.commerce.viewmodel.VariantRowItem;
import java.util.Map;

// Referenced classes of package com.pinterest.activity.commerce.logic:
//            VariantSelectionController

class this._cls0
    implements com.pinterest.base.ectionController._cls2
{

    final VariantSelectionController this$0;

    public void onEventMainThread(VariantSelectedEvent variantselectedevent)
    {
        if (!VariantSelectionController.access$100(VariantSelectionController.this))
        {
            VariantSelectionController.access$200(VariantSelectionController.this).putAll(variantselectedevent.getVariantRowItem().getOptions());
            VariantSelectionController.access$302(VariantSelectionController.this, variantselectedevent.getVariantRowItem().getVariant());
            if (VariantSelectionController.access$400(VariantSelectionController.this))
            {
                VariantSelectionController.access$500(VariantSelectionController.this, true);
                return;
            }
        }
    }

    ()
    {
        this$0 = VariantSelectionController.this;
        super();
    }
}
