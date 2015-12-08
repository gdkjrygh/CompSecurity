// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.iap.internal.b.c;

import android.os.RemoteException;
import com.amazon.android.framework.exception.KiwiException;
import com.amazon.device.iap.internal.b.h;
import com.amazon.device.iap.internal.model.ProductBuilder;
import com.amazon.device.iap.internal.model.ProductDataResponseBuilder;
import com.amazon.device.iap.internal.util.MetricsHelper;
import com.amazon.device.iap.internal.util.d;
import com.amazon.device.iap.internal.util.e;
import com.amazon.device.iap.model.Product;
import com.amazon.device.iap.model.ProductType;
import com.amazon.venezia.command.SuccessResult;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.amazon.device.iap.internal.b.c:
//            c

public final class a extends c
{

    private static final String b = com/amazon/device/iap/internal/b/c/a.getSimpleName();

    public a(com.amazon.device.iap.internal.b.e e1, Set set)
    {
        super(e1, "2.0", set);
    }

    private Product a(String s, Map map)
        throws IllegalArgumentException
    {
        String s1 = (String)map.get(s);
        Object obj;
        ProductType producttype;
        String s2;
        Object obj1;
        JSONObject jsonobject;
        try
        {
            obj1 = new JSONObject(s1);
            producttype = ProductType.valueOf(((JSONObject) (obj1)).getString("itemType").toUpperCase());
            s2 = ((JSONObject) (obj1)).getString("description");
            obj = ((JSONObject) (obj1)).optString("price", null);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("error in parsing json string").append(s1).toString());
        }
        map = ((Map) (obj));
        if (!d.a(((String) (obj))))
        {
            break MISSING_BLOCK_LABEL_129;
        }
        jsonobject = ((JSONObject) (obj1)).optJSONObject("priceJson");
        map = ((Map) (obj));
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_129;
        }
        map = Currency.getInstance(jsonobject.getString("currency"));
        obj = new BigDecimal(jsonobject.getString("value"));
        map = (new StringBuilder()).append(map.getSymbol()).append(obj).toString();
        obj = ((JSONObject) (obj1)).getString("title");
        obj1 = ((JSONObject) (obj1)).getString("iconUrl");
        s = (new ProductBuilder()).setSku(s).setProductType(producttype).setDescription(s2).setPrice(map).setSmallIconUrl(((String) (obj1))).setTitle(((String) (obj))).build();
        return s;
    }

    protected boolean a(SuccessResult successresult)
        throws RemoteException, KiwiException
    {
        Object obj = successresult.getData();
        e.a(b, (new StringBuilder()).append("data: ").append(obj).toString());
        successresult = new LinkedHashSet();
        HashMap hashmap = new HashMap();
        for (Iterator iterator = a.iterator(); iterator.hasNext();)
        {
            String s = (String)iterator.next();
            if (!((Map) (obj)).containsKey(s))
            {
                successresult.add(s);
            } else
            {
                try
                {
                    hashmap.put(s, a(s, ((Map) (obj))));
                }
                catch (IllegalArgumentException illegalargumentexception)
                {
                    successresult.add(s);
                    String s1 = (String)((Map) (obj)).get(s);
                    MetricsHelper.submitJsonParsingExceptionMetrics(c(), s1, (new StringBuilder()).append(b).append(".onResult()").toString());
                    e.b(b, (new StringBuilder()).append("Error parsing JSON for SKU ").append(s).append(": ").append(illegalargumentexception.getMessage()).toString());
                }
            }
        }

        obj = b();
        successresult = (new ProductDataResponseBuilder()).setRequestId(((com.amazon.device.iap.internal.b.e) (obj)).c()).setRequestStatus(com.amazon.device.iap.model.ProductDataResponse.RequestStatus.SUCCESSFUL).setUnavailableSkus(successresult).setProductData(hashmap).build();
        ((com.amazon.device.iap.internal.b.e) (obj)).d().a(successresult);
        return true;
    }

}
