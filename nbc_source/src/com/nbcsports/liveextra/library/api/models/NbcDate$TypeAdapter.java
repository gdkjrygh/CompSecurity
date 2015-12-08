// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.api.models;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

// Referenced classes of package com.nbcsports.liveextra.library.api.models:
//            NbcDate

public static class 
    implements JsonDeserializer
{

    public NbcDate deserialize(JsonElement jsonelement, Type type, JsonDeserializationContext jsondeserializationcontext)
        throws JsonParseException
    {
        return new NbcDate(jsonelement.getAsString());
    }

    public volatile Object deserialize(JsonElement jsonelement, Type type, JsonDeserializationContext jsondeserializationcontext)
        throws JsonParseException
    {
        return deserialize(jsonelement, type, jsondeserializationcontext);
    }

    public ()
    {
    }
}
