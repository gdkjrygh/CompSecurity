// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

public final class AC
    implements JsonDeserializer, JsonSerializer
{

    public static final anm DATE_TIME_FORMATTER = anl.a("yyyy-MM-dd'T'HH:mmZ");
    private static final String PATTERN = "yyyy-MM-dd'T'HH:mmZ";

    public AC()
    {
    }

    public final Object deserialize(JsonElement jsonelement, Type type, JsonDeserializationContext jsondeserializationcontext)
    {
        if (jsonelement.getAsString() == null || jsonelement.getAsString().isEmpty())
        {
            return null;
        } else
        {
            return DATE_TIME_FORMATTER.b(jsonelement.getAsString());
        }
    }

    public final JsonElement serialize(Object obj, Type type, JsonSerializationContext jsonserializationcontext)
    {
        obj = (als)obj;
        return new JsonPrimitive(anl.a("yyyy-MM-dd'T'HH:mmZ").a(((alM) (obj))));
    }

}
