// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.model;

import com.apptentive.android.sdk.Log;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.apptentive.android.sdk.model:
//            ExtendedData

public class CommerceExtendedData extends ExtendedData
{

    private static final String KEY_AFFILIATION = "affiliation";
    private static final String KEY_CURRENCY = "currency";
    private static final String KEY_ID = "id";
    private static final String KEY_ITEMS = "items";
    private static final String KEY_ITEMS_CATEGORY = "category";
    private static final String KEY_ITEMS_CURRENCY = "currency";
    private static final String KEY_ITEMS_ID = "id";
    private static final String KEY_ITEMS_NAME = "name";
    private static final String KEY_ITEMS_PRICE = "price";
    private static final String KEY_ITEMS_QUANTITY = "quantity";
    private static final String KEY_REVENUE = "revenue";
    private static final String KEY_SHIPPING = "shipping";
    private static final String KEY_TAX = "tax";
    private static final int VERSION = 1;

    public CommerceExtendedData(Object obj)
    {
        setId(obj);
    }

    public CommerceExtendedData(Object obj, Object obj1, Number number, Number number1, Number number2, String s)
    {
        this(obj);
        setId(obj);
        setAffiliation(obj1);
        setRevenue(number);
        setShipping(number1);
        setTax(number2);
        setCurrency(s);
    }

    public CommerceExtendedData addItem(Object obj, Object obj1, String s, Number number, Number number1, String s1)
    {
        JSONArray jsonarray;
        if (!isNull("items"))
        {
            break MISSING_BLOCK_LABEL_130;
        }
        jsonarray = new JSONArray();
        put("items", jsonarray);
_L1:
        JSONObject jsonobject = new JSONObject();
        if (obj != null)
        {
            try
            {
                jsonobject.put("id", obj);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.w("Error adding %s to CommerceCustomData.", new Object[] {
                    "items", obj
                });
                return this;
            }
        }
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        jsonobject.put("name", obj1);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        jsonobject.put("category", s);
        if (number == null)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        jsonobject.put("price", number);
        if (number1 == null)
        {
            break MISSING_BLOCK_LABEL_105;
        }
        jsonobject.put("quantity", number1);
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        jsonobject.put("currency", s1);
        jsonarray.put(jsonobject);
        return this;
        jsonarray = getJSONArray("items");
          goto _L1
    }

    protected void init()
    {
        setType(ExtendedData.Type.commerce);
        setVersion(1);
    }

    public CommerceExtendedData setAffiliation(Object obj)
    {
        try
        {
            put("affiliation", obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.w("Error adding %s to CommerceCustomData.", new Object[] {
                "affiliation", obj
            });
            return this;
        }
        return this;
    }

    public CommerceExtendedData setCurrency(String s)
    {
        try
        {
            put("currency", s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.w("Error adding %s to CommerceCustomData.", new Object[] {
                "currency", s
            });
            return this;
        }
        return this;
    }

    public CommerceExtendedData setId(Object obj)
    {
        try
        {
            put("id", obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.w("Error adding %s to CommerceCustomData.", new Object[] {
                "id", obj
            });
            return this;
        }
        return this;
    }

    public CommerceExtendedData setRevenue(Number number)
    {
        try
        {
            put("revenue", number);
        }
        // Misplaced declaration of an exception variable
        catch (Number number)
        {
            Log.w("Error adding %s to CommerceCustomData.", new Object[] {
                "revenue", number
            });
            return this;
        }
        return this;
    }

    public CommerceExtendedData setShipping(Number number)
    {
        try
        {
            put("shipping", number);
        }
        // Misplaced declaration of an exception variable
        catch (Number number)
        {
            Log.w("Error adding %s to CommerceCustomData.", new Object[] {
                "shipping", number
            });
            return this;
        }
        return this;
    }

    public CommerceExtendedData setTax(Number number)
    {
        try
        {
            put("tax", number);
        }
        // Misplaced declaration of an exception variable
        catch (Number number)
        {
            Log.w("Error adding %s to CommerceCustomData.", new Object[] {
                "tax", number
            });
            return this;
        }
        return this;
    }
}
