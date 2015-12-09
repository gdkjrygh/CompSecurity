// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.controllers;

import com.dominos.MobileSession;
import com.dominos.android.sdk.core.cart.CartManager;
import com.dominos.android.sdk.core.models.LabsCategory;
import com.dominos.android.sdk.core.models.LabsProduct;
import com.dominos.android.sdk.core.models.LabsVariant;
import com.dominos.android.sdk.core.models.coupon.LabsCouponLine;
import com.dominos.android.sdk.core.models.coupon.LabsCouponProductGroup;
import com.dominos.android.sdk.core.order.OrderManager;
import com.dominos.android.sdk.core.store.MenuManager;
import com.dominos.controllers.interfaces.IDominosCouponWizard;
import com.dominos.controllers.interfaces.IDominosView;
import com.dominos.controllers.interfaces.IDominosViewController;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class CouponWizardController
    implements IDominosViewController
{

    private static final String TAG = com/dominos/controllers/CouponWizardController.getName();
    private CartManager mCartManager;
    private IDominosCouponWizard mIDominosView;
    private MenuManager mMenuManager;
    MobileSession mMobileSession;
    private OrderManager mOrderManager;

    public CouponWizardController()
    {
    }

    public Map createProductGroupMap(LabsCouponProductGroup labscouponproductgroup)
    {
        return createProductGroupMapFromVariantList(labscouponproductgroup.getProductCodes());
    }

    public Map createProductGroupMapFromVariantList(List list)
    {
        HashMap hashmap = new HashMap();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            String s = (String)list.next();
            LabsVariant labsvariant = mMenuManager.getVariant(s);
            if (labsvariant != null)
            {
                if (hashmap.containsKey(labsvariant.getProductCode()))
                {
                    ((LabsProduct)hashmap.get(labsvariant.getProductCode())).addVariant(s);
                } else
                {
                    LabsProduct labsproduct = new LabsProduct(mMenuManager.getProduct(labsvariant.getProductCode()));
                    labsproduct.clearVariants();
                    labsproduct.addVariant(s);
                    hashmap.put(labsvariant.getProductCode(), labsproduct);
                }
            }
        } while (true);
        return hashmap;
    }

    public void dispose()
    {
    }

    public void filterCategory(LabsCategory labscategory, Map map)
    {
        LabsCategory labscategory1;
label0:
        for (labscategory = labscategory.getCategoryList().iterator(); labscategory.hasNext(); filterCategory(labscategory1, map))
        {
            labscategory1 = (LabsCategory)labscategory.next();
            if (labscategory1.getProducts().size() <= 0)
            {
                continue;
            }
            Iterator iterator = labscategory1.getProducts().iterator();
            do
            {
                String s;
                do
                {
                    if (!iterator.hasNext())
                    {
                        continue label0;
                    }
                    s = (String)iterator.next();
                } while (!map.containsKey(s));
                labscategory1.addCouponTargetProduct((LabsProduct)map.get(s));
            } while (true);
        }

    }

    public void onAfterInject()
    {
        mMenuManager = (MenuManager)mMobileSession.getManager("menu_manager");
        mOrderManager = (OrderManager)mMobileSession.getManager("order_manager");
        mCartManager = (CartManager)mMobileSession.getManager("cart_manager");
    }

    public void removeCoupon(LabsCouponLine labscouponline)
    {
        mCartManager.removeCoupon(mOrderManager.getOrder(), labscouponline);
        mIDominosView.onCouponRemoved();
    }

    public IDominosViewController setView(IDominosView idominosview)
    {
        mIDominosView = (IDominosCouponWizard)idominosview;
        return this;
    }

}
