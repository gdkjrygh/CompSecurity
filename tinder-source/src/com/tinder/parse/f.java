// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.parse;

import com.tinder.model.ProductGroup;
import com.tinder.model.TinderPurchase;
import com.tinder.utils.r;
import com.tinder.utils.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class f
{
    public static final class a
    {

        public String a;
        public List b;

        public final String toString()
        {
            return (new StringBuilder("error: [")).append(a).append("] purchases:[").append(b).append("]").toString();
        }

        public a()
        {
        }
    }


    public static a a(JSONObject jsonobject)
    {
        a a1 = new a();
        try
        {
            JSONArray jsonarray = jsonobject.getJSONArray("results");
            if (!jsonarray.isNull(0))
            {
                a1.a = jsonarray.getJSONObject(0).optString("error");
                a1.b = b(jsonobject);
                (new StringBuilder("purchaseResults:")).append(a1.toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            v.a("Failed to parse tinder purchase result object", jsonobject);
            return a1;
        }
        return a1;
    }

    public static List a(JSONArray jsonarray)
    {
        int i = 0;
        if (jsonarray == null) goto _L2; else goto _L1
_L1:
        ArrayList arraylist = new ArrayList(jsonarray.length());
_L4:
        Object obj;
        if (i >= jsonarray.length())
        {
            break MISSING_BLOCK_LABEL_170;
        }
        obj = jsonarray.optJSONObject(i);
        if (obj != null)
        {
            try
            {
                String s = ((JSONObject) (obj)).optString("type");
                String s1 = ((JSONObject) (obj)).optString("sub_type");
                String s2 = ((JSONObject) (obj)).optString("key");
                String s3 = ((JSONObject) (obj)).optString("group_id");
                String s4 = ((JSONObject) (obj)).optString("version");
                boolean flag = ((JSONObject) (obj)).optBoolean("is_base_group");
                boolean flag1 = ((JSONObject) (obj)).optBoolean("is_primary");
                obj = new ProductGroup();
                obj.isBase = flag;
                obj.isPrimary = flag1;
                obj.type = s;
                obj.subType = s1;
                obj.key = s2;
                obj.groupId = s3;
                obj.version = s4;
                arraylist.add(obj);
            }
            // Misplaced declaration of an exception variable
            catch (JSONArray jsonarray)
            {
                v.a("Failed to parse sku groups from API", jsonarray);
                return arraylist;
            }
        }
        i++;
        continue; /* Loop/switch isn't completed */
        Collections.sort(arraylist, new Comparator() {

            public final int compare(Object obj1, Object obj2)
            {
                obj1 = (ProductGroup)obj1;
                obj2 = (ProductGroup)obj2;
                obj1 = ((ProductGroup) (obj1)).key;
                obj2 = ((ProductGroup) (obj2)).key;
                int j = r.b(((String) (obj1)));
                int k = r.b(((String) (obj2)));
                if (j > k)
                {
                    return -1;
                }
                return j == k || k <= j ? 0 : 1;
            }

        });
        return arraylist;
_L2:
        return new ArrayList(0);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static List b(JSONObject jsonobject)
    {
        ArrayList arraylist;
        JSONObject jsonobject1;
        int i;
        try
        {
            jsonobject = jsonobject.getJSONArray("results");
            arraylist = new ArrayList(jsonobject.length());
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            jsonobject.getMessage();
            return new ArrayList(0);
        }
        i = 0;
        if (i >= jsonobject.length())
        {
            break; /* Loop/switch isn't completed */
        }
        jsonobject1 = jsonobject.getJSONObject(i);
        arraylist.add(new TinderPurchase(jsonobject1.optString("_id"), jsonobject1.optString("purchase_type"), jsonobject1.optString("product_id"), jsonobject1.optString("product_type"), jsonobject1.optString("create_date")));
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_21;
_L1:
        return arraylist;
    }
}
