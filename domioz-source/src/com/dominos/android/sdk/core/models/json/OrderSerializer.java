// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models.json;

import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.constant.PaymentTag;
import com.dominos.android.sdk.core.models.LabsAddress;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.models.LabsPayment;
import com.dominos.android.sdk.core.models.LabsProductLine;
import com.dominos.android.sdk.core.models.coupon.LabsCouponLine;
import com.dominos.android.sdk.core.models.loyalty.PricePlaceLoyalty;
import com.dominos.android.sdk.extension.model.Partners;
import com.google.b.ad;
import com.google.b.ae;
import com.google.b.t;
import com.google.b.w;
import com.google.b.z;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.a.a.a.l;

public class OrderSerializer
    implements ae
{

    public OrderSerializer()
    {
    }

    public w serialize(LabsOrder labsorder, Type type, ad ad1)
    {
        z z1 = new z();
        z1.a("Version", "1.0");
        z1.a("OrderMethod", "WEB");
        type = labsorder.getSourceOrganizationURI();
        if (StringHelper.isNotEmpty(type))
        {
            z1.a("SourceOrganizationURI", type);
        } else
        {
            z1.a("SourceOrganizationURI", "android.dominos.com");
        }
        z1.a("Platform", "androidNativeApp");
        z1.a("Channel", labsorder.getChannel());
        if (StringHelper.isNotEmpty(labsorder.getId()))
        {
            z1.a("OrderID", labsorder.getId());
        }
        z1.a("StoreID", labsorder.getStoreId());
        z1.a("ServiceMethod", labsorder.getServiceMethod());
        if (StringHelper.isNotEmpty(labsorder.getFirstName()))
        {
            z1.a("FirstName", labsorder.getFirstName());
        }
        if (StringHelper.isNotEmpty(labsorder.getLastName()))
        {
            z1.a("LastName", labsorder.getLastName());
        }
        if (Locale.getDefault().getLanguage().toLowerCase().startsWith("es"))
        {
            type = "es";
        } else
        {
            type = "en";
        }
        z1.a("LanguageCode", type);
        if (StringHelper.isNotEmpty(labsorder.getCustomerId()))
        {
            z1.a("CustomerID", labsorder.getCustomerId());
        }
        if (labsorder.hasWings())
        {
            z1.a("NoCombine", "true");
        }
        if (StringHelper.isNotEmpty(labsorder.getPhone()))
        {
            z1.a("Phone", labsorder.getPhone());
        }
        if (StringHelper.isNotEmpty(labsorder.getPhoneExtension()))
        {
            z1.a("Extension", labsorder.getPhoneExtension());
        }
        if (StringHelper.isNotEmpty(labsorder.getEmail()))
        {
            z1.a("Email", labsorder.getEmail());
        }
        if (labsorder.getAddress() != null && StringHelper.isNotEmpty(labsorder.getAddress().getPostalCode()))
        {
            z1.a("Address", ad1.a(labsorder.getAddress(), com/dominos/android/sdk/core/models/LabsAddress));
        }
        if (StringHelper.isNotEmpty(labsorder.getStoreOrderId()))
        {
            z1.a("StoreOrderID", labsorder.getStoreOrderId());
        }
        type = new t();
        for (Iterator iterator = labsorder.getProductLineList().iterator(); iterator.hasNext(); type.a(ad1.a((LabsProductLine)iterator.next(), com/dominos/android/sdk/core/models/LabsProductLine))) { }
        z1.a("Products", type);
        if (StringHelper.isNotEmpty(labsorder.getStoreOrderId()))
        {
            z1.a("StoreOrderID", labsorder.getStoreOrderId());
        }
        if (l.b(labsorder.getCustomerId()) && labsorder.getPricePlaceLoyalty() != null)
        {
            type = new z();
            type.a("LoyaltyCustomer", Boolean.valueOf(labsorder.getPricePlaceLoyalty().isLoyaltyCustomer()));
            z1.a("Loyalty", type);
        }
        type = new t();
        for (Iterator iterator1 = labsorder.getCouponLineList().iterator(); iterator1.hasNext(); type.a(ad1.a((LabsCouponLine)iterator1.next(), com/dominos/android/sdk/core/models/coupon/LabsCouponLine))) { }
        z1.a("Coupons", type);
        type = new z();
        if (labsorder.getPaymentTag() == PaymentTag.GOOGLE)
        {
            type.a("Wallet", labsorder.getPaymentTag().toString());
        }
        z1.a("Tags", type);
        type = new t();
        for (Iterator iterator2 = labsorder.getPaymentList().iterator(); iterator2.hasNext(); type.a(ad1.a((LabsPayment)iterator2.next(), com/dominos/android/sdk/core/models/LabsPayment))) { }
        z1.a("Payments", type);
        type = new z();
        Object obj = new t();
        z z2;
        for (Iterator iterator3 = labsorder.getStatusItemList().iterator(); iterator3.hasNext(); ((t) (obj)).a(z2))
        {
            Map map = (Map)iterator3.next();
            z2 = new z();
            String s;
            for (Iterator iterator4 = map.keySet().iterator(); iterator4.hasNext(); z2.a(s, (String)map.get(s)))
            {
                s = (String)iterator4.next();
            }

        }

        type.a("Status", Integer.valueOf(labsorder.getStatus()));
        if (((t) (obj)).a() > 0)
        {
            type.a("StatusItems", ((w) (obj)));
        }
        obj = new z();
        ((z) (obj)).a("voiceOrder", String.valueOf(labsorder.isVoiceOrder()));
        if (labsorder.isVoiceOrder())
        {
            type = labsorder.getVoiceSessionID();
        } else
        {
            type = "";
        }
        ((z) (obj)).a("voiceSessionID", type);
        if (labsorder.isEasyOrder())
        {
            ((z) (obj)).a("easyOrder", Boolean.valueOf(labsorder.isEasyOrder()));
            ((z) (obj)).a("easyOrderNickName", labsorder.getEasyOrderNickName());
        }
        if (!labsorder.getOriginalOrderId().equals(""))
        {
            if (labsorder.isEasyOrder())
            {
                type = "easyOrder";
            } else
            {
                type = "historicalOrder";
            }
            ((z) (obj)).a("originatedFrom", type);
            ((z) (obj)).a("originalOrderId", labsorder.getOriginalOrderId());
        }
        if (StringHelper.isNotEmpty(labsorder.getFeature()))
        {
            ((z) (obj)).a(labsorder.getFeature(), "true");
        }
        if (((z) (obj)).a().size() > 0)
        {
            z1.a("metaData", ((w) (obj)));
        }
        if (labsorder.getPartners() != null && labsorder.isDelivery())
        {
            z1.a("Partners", ad1.a(labsorder.getPartners(), com/dominos/android/sdk/extension/model/Partners));
        }
        return z1;
    }

    public volatile w serialize(Object obj, Type type, ad ad1)
    {
        return serialize((LabsOrder)obj, type, ad1);
    }
}
