// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.model;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.stripe.net.APIResource;
import java.io.PrintStream;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.stripe.model:
//            Account, Charge, Discount, Customer, 
//            Invoice, InvoiceItem, Plan, Subscription, 
//            Token, Coupon, Transfer, Dispute, 
//            Refund, Recipient, Summary, Fee, 
//            BankAccount, Balance, Card, BalanceTransaction, 
//            EventData, StripeObject, StripeRawJsonObject

public class EventDataDeserializer
    implements JsonDeserializer
{

    static final Map objectMap;

    public EventDataDeserializer()
    {
    }

    private Object[] deserializeJsonArray(JsonArray jsonarray)
    {
        Object aobj[] = new Object[jsonarray.a()];
        jsonarray = jsonarray.iterator();
        for (int i = 0; jsonarray.hasNext(); i++)
        {
            aobj[i] = deserializeJsonElement((JsonElement)jsonarray.next());
        }

        return aobj;
    }

    private Object deserializeJsonElement(JsonElement jsonelement)
    {
        if (jsonelement.k())
        {
            return null;
        }
        if (jsonelement.i())
        {
            HashMap hashmap = new HashMap();
            populateMapFromJSONObject(hashmap, jsonelement.l());
            return hashmap;
        }
        if (jsonelement.j())
        {
            return deserializeJsonPrimitive(jsonelement.n());
        }
        if (jsonelement.h())
        {
            return ((Object) (deserializeJsonArray(jsonelement.m())));
        } else
        {
            System.err.println((new StringBuilder()).append("Unknown JSON element type for element ").append(jsonelement).append(". ").append("If you're seeing this messaage, it's probably a bug in the Stripe Java ").append("library. Please contact us by email at support@stripe.com.").toString());
            return null;
        }
    }

    private Object deserializeJsonPrimitive(JsonPrimitive jsonprimitive)
    {
        if (jsonprimitive.a())
        {
            return Boolean.valueOf(jsonprimitive.g());
        }
        if (jsonprimitive.p())
        {
            return jsonprimitive.b();
        } else
        {
            return jsonprimitive.c();
        }
    }

    private void populateMapFromJSONObject(Map map, JsonObject jsonobject)
    {
        java.util.Map.Entry entry;
        for (jsonobject = jsonobject.a().iterator(); jsonobject.hasNext(); map.put((String)entry.getKey(), deserializeJsonElement((JsonElement)entry.getValue())))
        {
            entry = (java.util.Map.Entry)jsonobject.next();
        }

    }

    public EventData deserialize(JsonElement jsonelement, Type type, JsonDeserializationContext jsondeserializationcontext)
    {
        type = new EventData();
        jsondeserializationcontext = jsonelement.l().a().iterator();
        do
        {
            if (!jsondeserializationcontext.hasNext())
            {
                break;
            }
            Object obj = (java.util.Map.Entry)jsondeserializationcontext.next();
            String s = (String)((java.util.Map.Entry) (obj)).getKey();
            jsonelement = (JsonElement)((java.util.Map.Entry) (obj)).getValue();
            if ("previous_attributes".equals(s))
            {
                obj = new HashMap();
                populateMapFromJSONObject(((Map) (obj)), jsonelement.l());
                type.setPreviousAttributes(((Map) (obj)));
            } else
            if ("object".equals(s))
            {
                jsonelement = jsonelement.l().b("object").c();
                jsonelement = (Class)objectMap.get(jsonelement);
                Gson gson = APIResource.GSON;
                obj = (JsonElement)((java.util.Map.Entry) (obj)).getValue();
                if (jsonelement == null)
                {
                    jsonelement = com/stripe/model/StripeRawJsonObject;
                }
                type.setObject((StripeObject)gson.a(((JsonElement) (obj)), jsonelement));
            }
        } while (true);
        return type;
    }

    public volatile Object deserialize(JsonElement jsonelement, Type type, JsonDeserializationContext jsondeserializationcontext)
    {
        return deserialize(jsonelement, type, jsondeserializationcontext);
    }

    static 
    {
        objectMap = new HashMap();
        objectMap.put("account", com/stripe/model/Account);
        objectMap.put("charge", com/stripe/model/Charge);
        objectMap.put("discount", com/stripe/model/Discount);
        objectMap.put("customer", com/stripe/model/Customer);
        objectMap.put("invoice", com/stripe/model/Invoice);
        objectMap.put("invoiceitem", com/stripe/model/InvoiceItem);
        objectMap.put("plan", com/stripe/model/Plan);
        objectMap.put("subscription", com/stripe/model/Subscription);
        objectMap.put("token", com/stripe/model/Token);
        objectMap.put("coupon", com/stripe/model/Coupon);
        objectMap.put("transfer", com/stripe/model/Transfer);
        objectMap.put("dispute", com/stripe/model/Dispute);
        objectMap.put("refund", com/stripe/model/Refund);
        objectMap.put("recipient", com/stripe/model/Recipient);
        objectMap.put("summary", com/stripe/model/Summary);
        objectMap.put("fee", com/stripe/model/Fee);
        objectMap.put("bank_account", com/stripe/model/BankAccount);
        objectMap.put("balance", com/stripe/model/Balance);
        objectMap.put("card", com/stripe/model/Card);
        objectMap.put("balance_transaction", com/stripe/model/BalanceTransaction);
    }
}
