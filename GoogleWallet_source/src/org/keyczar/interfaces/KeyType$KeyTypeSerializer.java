// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.keyczar.interfaces;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

// Referenced classes of package org.keyczar.interfaces:
//            KeyType

public static final class 
    implements JsonSerializer
{

    private static JsonElement serialize(KeyType keytype, Type type, JsonSerializationContext jsonserializationcontext)
    {
        return new JsonPrimitive(keytype.getName());
    }

    public final volatile JsonElement serialize(Object obj, Type type, JsonSerializationContext jsonserializationcontext)
    {
        return serialize((KeyType)obj, type, jsonserializationcontext);
    }

    public ()
    {
    }
}
