// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.amazon.device.associates:
//            UserData, x, Receipt, Image, 
//            Product, Price

class aw
{

    private static final String a = com/amazon/device/associates/aw.getSimpleName();

    private aw()
    {
    }

    static UserData a(JSONObject jsonobject)
        throws JSONException
    {
        return new UserData(jsonobject.getString("userId"), jsonobject.getString("marketplace"));
    }

    static Collection a(JSONArray jsonarray, Collection collection)
    {
        int i = 0;
        while (i < jsonarray.length()) 
        {
            try
            {
                collection.add(jsonarray.getString(i));
            }
            catch (JSONException jsonexception)
            {
                x.b(a, (new StringBuilder()).append("error in parseStrings: ").append(jsonexception).toString());
            }
            i++;
        }
        return collection;
    }

    static Receipt b(JSONObject jsonobject)
        throws JSONException, ParseException
    {
        String s1 = jsonobject.getString("receiptId");
        String s2 = jsonobject.getString("productId");
        String s = null;
        if (jsonobject.has("parentProductId"))
        {
            s = jsonobject.getString("parentProductId");
        }
        return new Receipt(s1, s2, s, jsonobject.getInt("quantity"), jsonobject.getString("purchaseToken"), new Date(jsonobject.getLong("purchaseDate")), jsonobject.getBoolean("isCanceled"));
    }

    static Collection b(JSONArray jsonarray, Collection collection)
    {
        int i = 0;
        while (i < jsonarray.length()) 
        {
            try
            {
                collection.add(b(jsonarray.getJSONObject(i)));
            }
            catch (Exception exception)
            {
                x.b(a, (new StringBuilder()).append("error in parseReceipts: ").append(exception).toString());
            }
            i++;
        }
        return collection;
    }

    static Image c(JSONObject jsonobject)
    {
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        jsonobject = new Image(jsonobject.getString("url"), jsonobject.getInt("width"), jsonobject.getInt("height"));
        return jsonobject;
        jsonobject;
        x.b(a, (new StringBuilder()).append("error in parseImage. returning null: ").append(jsonobject).toString());
        return null;
    }

    static Collection c(JSONArray jsonarray, Collection collection)
    {
        int i = 0;
        while (i < jsonarray.length()) 
        {
            try
            {
                JSONObject jsonobject = jsonarray.getJSONObject(i);
                collection.add(new Product(jsonobject.getString("productId"), jsonobject.optString("title"), jsonobject.optString("description"), c(jsonobject.optJSONObject("image")), d(jsonobject.optJSONObject("price")), jsonobject.optString("brand"), jsonobject.optDouble("rating", 0.0D)));
            }
            catch (Exception exception)
            {
                x.b(a, (new StringBuilder()).append("error in parseProducts: ").append(exception).toString());
            }
            i++;
        }
        return collection;
    }

    static Price d(JSONObject jsonobject)
    {
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        jsonobject = new Price(Currency.getInstance(jsonobject.getString("currency")), new BigDecimal(jsonobject.getDouble("minValue")), new BigDecimal(jsonobject.getDouble("maxValue")), jsonobject.getString("formattedPrice"));
        return jsonobject;
        jsonobject;
        x.b(a, (new StringBuilder()).append("error in parsePrice. returning null: ").append(jsonobject).toString());
        return null;
    }

}
