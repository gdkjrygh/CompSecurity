// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.model;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;

// Referenced classes of package com.stripe.model:
//            StripeRawJsonObject

public class StripeRawJsonObjectDeserializer
    implements JsonDeserializer
{

    public StripeRawJsonObjectDeserializer()
    {
    }

    public StripeRawJsonObject deserialize(JsonElement jsonelement, Type type, JsonDeserializationContext jsondeserializationcontext)
    {
        type = new StripeRawJsonObject();
        type.json = jsonelement.l();
        return type;
    }

    public volatile Object deserialize(JsonElement jsonelement, Type type, JsonDeserializationContext jsondeserializationcontext)
    {
        return deserialize(jsonelement, type, jsondeserializationcontext);
    }
}
