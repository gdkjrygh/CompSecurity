// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.dialogs;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.dominos.MobileSession_;
import com.dominos.android.sdk.app.Session;
import com.dominos.android.sdk.core.models.LabsProduct;
import com.dominos.android.sdk.core.product.ProductWizardManager;
import com.dominos.utils.ImageManagerCDN;

public class ProductDetailsPopUp extends PopupWindow
{

    private boolean fromCouponWizard;
    private Activity mCallingActivity;
    private LabsProduct mProduct;
    private Session mSession;
    private ProductWizardManager productWizardManager;

    public ProductDetailsPopUp(Activity activity, LabsProduct labsproduct, ProductWizardManager productwizardmanager)
    {
        super(activity);
        productWizardManager = productwizardmanager;
        mProduct = labsproduct;
        mCallingActivity = activity;
        mSession = MobileSession_.getInstance_(activity);
        createPopUpView(activity);
    }

    private void addContent(View view)
    {
        ImageView imageview = (ImageView)view.findViewById(0x7f0f0287);
        view = (TextView)view.findViewById(0x7f0f0288);
        if (imageview != null)
        {
            ImageManagerCDN.INSTANCE.addProductPopupImage(imageview, mProduct.getImageCode());
            view.setVisibility(0);
            view.setText(mProduct.getDescription());
        }
    }

    private void createPopUpView(Activity activity)
    {
        activity = ((LayoutInflater)activity.getSystemService("layout_inflater")).inflate(0x7f0300a4, null, false);
        setContentView(activity);
        setWidth(-2);
        setHeight(-2);
        setFocusable(false);
        setAnimationStyle(0x1030004);
        addContent(activity);
        setUpButtons(activity);
    }

    private void setUpButtons(View view)
    {
        ((Button)view.findViewById(0x7f0f0387)).setOnClickListener(new _cls1());
        ((Button)view.findViewById(0x7f0f0388)).setOnClickListener(new _cls2());
    }

    public void show()
    {
        showAtLocation(mCallingActivity.getWindow().getDecorView(), 17, 0, 0);
    }





    private class _cls1
        implements android.view.View.OnClickListener
    {

        final ProductDetailsPopUp this$0;

        public void onClick(View view)
        {
            dismiss();
        }

        _cls1()
        {
            this$0 = ProductDetailsPopUp.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final ProductDetailsPopUp this$0;

        public void onClick(View view)
        {
            productWizardManager.initialize(mProduct);
            ((DomProductManager)mSession.getManager("dom_product_manager")).resetCurrentPartialProduct(mProduct);
            productWizardManager.setCreatedFromMenu(true);
            if (productWizardManager.hasFlavors())
            {
                ((com.dominos.activities.LabsFlavorListActivity_.IntentBuilder_)LabsFlavorListActivity_.intent(mCallingActivity).flags(0x10020000)).start();
            } else
            if (productWizardManager.hasSizes())
            {
                ((com.dominos.activities.LabsSizeListActivity_.IntentBuilder_)LabsSizeListActivity_.intent(mCallingActivity).flags(0x10020000)).start();
            } else
            {
                ((com.dominos.activities.LabsProductDetailListActivity_.IntentBuilder_)LabsProductDetailListActivity_.intent(mCallingActivity).flags(0x10020000)).start();
            }
            App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromUX.ProductSelected(productWizardManager.isFromCouponWizard()));
            dismiss();
        }

        _cls2()
        {
            this$0 = ProductDetailsPopUp.this;
            super();
        }
    }

}
