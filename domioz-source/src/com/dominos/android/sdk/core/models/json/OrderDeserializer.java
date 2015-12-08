// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models.json;

import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.core.models.LabsAddress;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.models.LabsProductLine;
import com.dominos.android.sdk.core.models.LabsVariant;
import com.dominos.android.sdk.core.models.coupon.LabsCouponLine;
import com.dominos.android.sdk.core.models.loyalty.PricePlaceLoyalty;
import com.dominos.android.sdk.extension.model.Partners;
import com.google.b.ac;
import com.google.b.k;
import com.google.b.t;
import com.google.b.u;
import com.google.b.v;
import com.google.b.w;
import com.google.b.z;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.dominos.android.sdk.core.models.json:
//            PaymentDeserializer, PromotionDeserializer

public class OrderDeserializer
    implements v
{

    public OrderDeserializer()
    {
    }

    public LabsOrder deserialize(w w1, Type type, u u1)
    {
        boolean flag = false;
        type = new LabsOrder();
        w1 = (z)w1;
        LogUtil.d("OrderDeserializer", (new StringBuilder("orderObj: ")).append(w1.toString()).toString(), new Object[0]);
        w1.a("Version");
        w1.a("OrderMethod");
        if (w1.a("OrderID"))
        {
            type.setId(w1.b("OrderID").c());
        }
        if (w1.a("StoreID"))
        {
            type.setStoreId(w1.b("StoreID").c());
        }
        if (w1.a("ServiceMethod"))
        {
            type.setServiceMethod(w1.b("ServiceMethod").c());
        }
        if (w1.a("FirstName"))
        {
            type.setFirstName(w1.b("FirstName").c());
        }
        if (w1.a("LastName"))
        {
            type.setLastName(w1.b("LastName").c());
        }
        if (w1.a("SourceOrganizationURI"))
        {
            String s = w1.b("SourceOrganizationURI").c();
            if (StringHelper.containsIgnoreCase(s, "android"))
            {
                type.setSourceOrganizationURI(s);
            }
        }
        if (w1.a("Loyalty"))
        {
            type.setPricePlaceLoyalty((PricePlaceLoyalty)(new k()).a(w1.d("Loyalty"), com/dominos/android/sdk/core/models/loyalty/PricePlaceLoyalty));
        }
        w1.a("LanguageCode");
        if (w1.a("CustomerID"))
        {
            type.setCustomerId(w1.b("CustomerID").c());
        }
        if (w1.a("Phone"))
        {
            type.setPhone(w1.b("Phone").c());
        }
        if (w1.a("Extension"))
        {
            type.setPhoneExtension(w1.b("Extension").c());
        }
        if (w1.a("Email"))
        {
            type.setEmail(w1.b("Email").c());
        }
        if (w1.a("Address") && (w1.b("Address") instanceof z))
        {
            type.setAddress((LabsAddress)u1.a(w1.d("Address"), com/dominos/android/sdk/core/models/LabsAddress));
        }
        if (w1.a("Products") && (w1.b("Products") instanceof t))
        {
            ArrayList arraylist = new ArrayList();
            t t1 = w1.c("Products");
            for (int i = 0; i < t1.a(); i++)
            {
                LabsProductLine labsproductline = (LabsProductLine)u1.a(t1.a(i).h(), com/dominos/android/sdk/core/models/LabsProductLine);
                if (labsproductline == null)
                {
                    continue;
                }
                if (labsproductline.isNeedsCustomization() && labsproductline.getVariant() != null)
                {
                    labsproductline.getVariant().setCode("");
                }
                arraylist.add(labsproductline);
            }

            type.setProductLineList(arraylist);
        }
        if (w1.a("Coupons") && (w1.b("Coupons") instanceof t))
        {
            ArrayList arraylist1 = new ArrayList();
            t t2 = w1.c("Coupons");
            for (int j = 0; j < t2.a(); j++)
            {
                LabsCouponLine labscouponline = (LabsCouponLine)u1.a(t2.a(j).h(), com/dominos/android/sdk/core/models/coupon/LabsCouponLine);
                if (labscouponline != null)
                {
                    arraylist1.add(labscouponline);
                }
            }

            type.setCouponLineList(arraylist1);
        }
        if (w1.a("metaData") && (w1.b("metaData") instanceof z))
        {
            z z1 = w1.d("metaData");
            if (z1.a("originalOrderId"))
            {
                type.setOriginalOrderId(z1.b("originalOrderId").c());
            }
        }
        if (w1.a("Status"))
        {
            type.setStatus(w1.b("Status").f());
        }
        if (w1.a("StatusItems"))
        {
            ArrayList arraylist2 = new ArrayList();
            t t3 = w1.c("StatusItems");
            for (int l = 0; l < t3.a(); l++)
            {
                HashMap hashmap = new HashMap();
                Iterator iterator = t3.a(l).h().a().iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                    if ((w)entry.getValue() instanceof ac)
                    {
                        hashmap.put(entry.getKey(), ((w)entry.getValue()).c());
                    }
                } while (true);
                arraylist2.add(hashmap);
            }

            type.setStatusItemList(arraylist2);
        }
        if (w1.a("Payments") && (w1.b("Payments") instanceof t))
        {
            ArrayList arraylist3 = new ArrayList();
            t t4 = w1.c("Payments");
            for (int i1 = ((flag) ? 1 : 0); i1 < t4.a(); i1++)
            {
                arraylist3.add((new PaymentDeserializer()).deserialize(t4.a(i1).h(), null, u1));
            }

            type.setPaymentList(arraylist3);
        }
        if (w1.a("Promotions") && (w1.b("Promotions") instanceof z))
        {
            com.dominos.android.sdk.core.models.LabsPromotion labspromotion = (new PromotionDeserializer()).deserialize(w1.b("Promotions").h(), null, u1);
            if (labspromotion != null)
            {
                type.setPromotion(labspromotion);
            }
        }
        if (w1.a("StoreOrderID"))
        {
            type.setStoreOrderId(w1.b("StoreOrderID").c());
        }
        if (w1.a("PlaceOrderTime"))
        {
            type.setPlaceOrderTime(w1.b("PlaceOrderTime").c());
        }
        if (w1.a("BusinessDate"))
        {
            type.setBusinessDate(w1.b("BusinessDate").c());
        }
        if (w1.a("AmountsBreakdown"))
        {
            z z2 = w1.d("AmountsBreakdown");
            if (z2.a("FoodAndBeverage"))
            {
                type.setNetAmount(z2.b("FoodAndBeverage").d());
            }
            if (z2.a("Bottle"))
            {
                type.setDepositAmount(z2.b("Bottle").d());
            }
            if (z2.a("DeliveryFee"))
            {
                type.setDeliveryAmount(z2.b("DeliveryFee").d());
            }
            if (z2.a("Tax"))
            {
                type.setTaxAmount(z2.b("Tax").d());
            }
            if (z2.a("Customer"))
            {
                type.setPrice(z2.b("Customer").d());
            }
            if (z2.a("Savings"))
            {
                type.setSavings(z2.b("Savings").c());
            }
        }
        if (w1.a("EstimatedWaitMinutes"))
        {
            type.setEstimatedWaitMinutes(w1.b("EstimatedWaitMinutes").c());
        }
        if (w1.a("Partners") && (w1.b("Partners") instanceof z) && w1.d("Partners").a("ShopRunner"))
        {
            type.setPartner((Partners)u1.a(w1.d("Partners"), com/dominos/android/sdk/extension/model/Partners));
        }
        if (w1.a("RemovedProducts"))
        {
            type.setProductRemoved(w1.b("RemovedProducts").g());
        }
        return type;
    }

    public volatile Object deserialize(w w1, Type type, u u1)
    {
        return deserialize(w1, type, u1);
    }
}
