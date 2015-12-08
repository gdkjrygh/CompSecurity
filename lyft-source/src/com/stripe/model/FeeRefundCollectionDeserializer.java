// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.model;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;

// Referenced classes of package com.stripe.model:
//            FeeRefundCollection

public class FeeRefundCollectionDeserializer
    implements JsonDeserializer
{

    public static final Type REFUND_LIST_TYPE = (new TypeToken() {

    }).getType();

    public FeeRefundCollectionDeserializer()
    {
    }

    public FeeRefundCollection deserialize(JsonElement jsonelement, Type type, JsonDeserializationContext jsondeserializationcontext)
    {
        jsondeserializationcontext = (new GsonBuilder()).a(FieldNamingPolicy.d).c();
        if (jsonelement.h())
        {
            jsonelement = (List)jsondeserializationcontext.a(jsonelement, REFUND_LIST_TYPE);
            type = new FeeRefundCollection();
            type.setData(jsonelement);
            type.setHasMore(Boolean.valueOf(false));
            type.setTotalCount(Integer.valueOf(jsonelement.size()));
            return type;
        } else
        {
            return (FeeRefundCollection)jsondeserializationcontext.a(jsonelement, type);
        }
    }

    public volatile Object deserialize(JsonElement jsonelement, Type type, JsonDeserializationContext jsondeserializationcontext)
    {
        return deserialize(jsonelement, type, jsondeserializationcontext);
    }

}
