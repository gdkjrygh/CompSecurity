// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.iap.internal.b.c;

import android.os.RemoteException;
import com.amazon.android.framework.exception.KiwiException;
import com.amazon.device.iap.internal.b.h;
import com.amazon.device.iap.internal.model.ProductBuilder;
import com.amazon.device.iap.internal.model.ProductDataResponseBuilder;
import com.amazon.device.iap.internal.util.e;
import com.amazon.device.iap.model.Product;
import com.amazon.device.iap.model.ProductType;
import com.amazon.venezia.command.SuccessResult;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.amazon.device.iap.internal.b.c:
//            c

public final class b extends c
{

    private static final String b = com/amazon/device/iap/internal/b/c/b.getSimpleName();

    public b(com.amazon.device.iap.internal.b.e e1, Set set)
    {
        super(e1, "1.0", set);
    }

    private Product a(String s, Map map)
        throws IllegalArgumentException
    {
        map = (String)map.get(s);
        try
        {
            Object obj = new JSONObject(map);
            ProductType producttype = ProductType.valueOf(((JSONObject) (obj)).getString("itemType").toUpperCase());
            String s1 = ((JSONObject) (obj)).getString("description");
            String s2 = ((JSONObject) (obj)).optString("price");
            String s3 = ((JSONObject) (obj)).getString("title");
            obj = ((JSONObject) (obj)).getString("iconUrl");
            s = (new ProductBuilder()).setSku(s).setProductType(producttype).setDescription(s1).setPrice(s2).setSmallIconUrl(((String) (obj))).setTitle(s3).build();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("error in parsing json string").append(map).toString());
        }
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
