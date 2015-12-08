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
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import java.lang.reflect.Type;

// Referenced classes of package com.stripe.model:
//            Dispute, EvidenceSubObject

public class DisputeDataDeserializer
    implements JsonDeserializer
{

    public DisputeDataDeserializer()
    {
    }

    public Dispute deserialize(JsonElement jsonelement, Type type, JsonDeserializationContext jsondeserializationcontext)
    {
        EvidenceSubObject evidencesubobject = null;
        Gson gson = (new GsonBuilder()).a(FieldNamingPolicy.d).c();
        if (jsonelement.k())
        {
            return null;
        }
        if (!jsonelement.i())
        {
            throw new JsonParseException("Dispute type was not an object, which is problematic.");
        }
        JsonObject jsonobject = jsonelement.l();
        jsondeserializationcontext = jsonobject.b("evidence");
        if (jsondeserializationcontext.j())
        {
            jsondeserializationcontext = jsondeserializationcontext.n();
            if (!jsondeserializationcontext.q())
            {
                throw new JsonParseException("Evidence field on a dispute was a primitive non-string type.");
            }
            jsondeserializationcontext = jsondeserializationcontext.c();
        } else
        if (jsondeserializationcontext.i())
        {
            evidencesubobject = (EvidenceSubObject)gson.a(jsondeserializationcontext.l(), com/stripe/model/EvidenceSubObject);
            jsondeserializationcontext = null;
        } else
        {
            if (!jsondeserializationcontext.k())
            {
                throw new JsonParseException("Evidence field on a dispute was a non-primitive, non-object type.");
            }
            jsondeserializationcontext = null;
        }
        jsonobject.a("evidence");
        jsonelement = (Dispute)gson.a(jsonelement, type);
        jsonelement.setEvidence(jsondeserializationcontext);
        jsonelement.setEvidenceSubObject(evidencesubobject);
        return jsonelement;
    }

    public volatile Object deserialize(JsonElement jsonelement, Type type, JsonDeserializationContext jsondeserializationcontext)
    {
        return deserialize(jsonelement, type, jsondeserializationcontext);
    }
}
