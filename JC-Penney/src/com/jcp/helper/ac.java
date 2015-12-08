// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.helper;

import android.text.TextUtils;
import com.jcp.fragments.ShoppingBagFragment;
import com.jcp.productentity.AddToBagInputEntity;
import com.jcp.productentity.AttributesList;
import com.jcp.util.ae;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class ac
{

    private static final String a = com/jcp/fragments/ShoppingBagFragment.getSimpleName();

    public static JSONArray a(AddToBagInputEntity addtobaginputentity)
    {
        JSONArray jsonarray = new JSONArray();
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("id", addtobaginputentity.getId());
            jsonobject.put("ppId", addtobaginputentity.getPpId());
            jsonobject.put("quantity", addtobaginputentity.getQuantity());
            jsonobject.put("searchTerm", "");
        }
        // Misplaced declaration of an exception variable
        catch (AddToBagInputEntity addtobaginputentity)
        {
            addtobaginputentity.printStackTrace();
        }
        jsonarray.put(jsonobject);
        return jsonarray;
    }

    public static JSONArray b(AddToBagInputEntity addtobaginputentity)
    {
        JSONArray jsonarray;
        JSONArray jsonarray1;
        JSONObject jsonobject1;
        int i;
        jsonarray = new JSONArray();
        jsonarray1 = new JSONArray();
        jsonobject1 = new JSONObject();
        i = 0;
_L2:
        if (i >= addtobaginputentity.getmAttributesList().size())
        {
            break; /* Loop/switch isn't completed */
        }
        jsonobject1.put("type", ((AttributesList)addtobaginputentity.getmAttributesList().get(i)).getType());
        jsonobject1.put("value", ((AttributesList)addtobaginputentity.getmAttributesList().get(i)).getValue());
        i++;
        if (true) goto _L2; else goto _L1
        IndexOutOfBoundsException indexoutofboundsexception;
        indexoutofboundsexception;
        ae.a(a, "IndexOutOfBoundsException while getting AttributesList : ", indexoutofboundsexception);
_L1:
        jsonarray1.put(jsonobject1);
        jsonobject1 = new JSONObject();
        JSONException jsonexception;
        try
        {
            jsonobject1.put("id", addtobaginputentity.getId());
            jsonobject1.put("ppId", addtobaginputentity.getPpId());
            jsonobject1.put("quantity", addtobaginputentity.getQuantity());
            jsonobject1.put("attributes", jsonarray1);
            if (!TextUtils.isEmpty(addtobaginputentity.getServiceAgreementId()))
            {
                JSONObject jsonobject = new JSONObject();
                jsonobject.put("id", addtobaginputentity.getServiceAgreementId());
                jsonobject.put("quantity", addtobaginputentity.getQuantity());
                jsonobject.put("ppId", addtobaginputentity.getPpId());
                jsonarray.put(jsonobject);
            }
        }
        // Misplaced declaration of an exception variable
        catch (AddToBagInputEntity addtobaginputentity)
        {
            addtobaginputentity.printStackTrace();
        }
        jsonarray.put(jsonobject1);
        return jsonarray;
        jsonexception;
        ae.a(a, "JSONException while adding attributes to Json Object : ", jsonexception);
          goto _L1
    }

    public static JSONArray c(AddToBagInputEntity addtobaginputentity)
    {
        JSONArray jsonarray = new JSONArray();
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("id", addtobaginputentity.getId());
            jsonobject.put("quantity", addtobaginputentity.getQuantity());
            jsonobject.put("ppId", addtobaginputentity.getPpId());
            if (!TextUtils.isEmpty(addtobaginputentity.getServiceAgreementId()))
            {
                JSONObject jsonobject1 = new JSONObject();
                jsonobject1.put("id", addtobaginputentity.getServiceAgreementId());
                jsonobject1.put("quantity", addtobaginputentity.getQuantity());
                jsonobject1.put("ppId", addtobaginputentity.getPpId());
                jsonarray.put(jsonobject1);
            }
        }
        // Misplaced declaration of an exception variable
        catch (AddToBagInputEntity addtobaginputentity)
        {
            addtobaginputentity.printStackTrace();
        }
        jsonarray.put(jsonobject);
        return jsonarray;
    }

}
