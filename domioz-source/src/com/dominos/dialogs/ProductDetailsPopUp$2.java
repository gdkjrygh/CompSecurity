// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.dialogs;

import android.view.View;
import com.dominos.App;
import com.dominos.activities.LabsFlavorListActivity_;
import com.dominos.activities.LabsProductDetailListActivity_;
import com.dominos.activities.LabsSizeListActivity_;
import com.dominos.android.sdk.app.ApplicationEventBus;
import com.dominos.android.sdk.app.Session;
import com.dominos.android.sdk.core.product.ProductWizardManager;
import com.dominos.android.sdk.extension.nina.DomProductManager;

// Referenced classes of package com.dominos.dialogs:
//            ProductDetailsPopUp

class this._cls0
    implements android.view.opUp._cls2
{

    final ProductDetailsPopUp this$0;

    public void onClick(View view)
    {
        ProductDetailsPopUp.access$100(ProductDetailsPopUp.this).initialize(ProductDetailsPopUp.access$000(ProductDetailsPopUp.this));
        ((DomProductManager)ProductDetailsPopUp.access$200(ProductDetailsPopUp.this).getManager("dom_product_manager")).resetCurrentPartialProduct(ProductDetailsPopUp.access$000(ProductDetailsPopUp.this));
        ProductDetailsPopUp.access$100(ProductDetailsPopUp.this).setCreatedFromMenu(true);
        if (ProductDetailsPopUp.access$100(ProductDetailsPopUp.this).hasFlavors())
        {
            ((com.dominos.activities._.IntentBuilder_)LabsFlavorListActivity_.intent(ProductDetailsPopUp.access$300(ProductDetailsPopUp.this)).flags(0x10020000)).start();
        } else
        if (ProductDetailsPopUp.access$100(ProductDetailsPopUp.this).hasSizes())
        {
            ((com.dominos.activities.IntentBuilder_)LabsSizeListActivity_.intent(ProductDetailsPopUp.access$300(ProductDetailsPopUp.this)).flags(0x10020000)).start();
        } else
        {
            ((com.dominos.activities.ctivity_.IntentBuilder_)LabsProductDetailListActivity_.intent(ProductDetailsPopUp.access$300(ProductDetailsPopUp.this)).flags(0x10020000)).start();
        }
        App.getInstance().bus.post(new com.dominos.bus.events.ctSelected(ProductDetailsPopUp.access$100(ProductDetailsPopUp.this).isFromCouponWizard()));
        dismiss();
    }

    stActivity_.IntentBuilder_()
    {
        this$0 = ProductDetailsPopUp.this;
        super();
    }
}
