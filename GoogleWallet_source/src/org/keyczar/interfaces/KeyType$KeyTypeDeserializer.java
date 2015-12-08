// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.keyczar.interfaces;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import org.keyczar.DefaultKeyType;

// Referenced classes of package org.keyczar.interfaces:
//            KeyType

public static final class 
    implements JsonDeserializer
{

    private static Map typeMap = new HashMap();

    private static KeyType deserialize(JsonElement jsonelement, Type type, JsonDeserializationContext jsondeserializationcontext)
        throws JsonParseException
    {
        jsonelement = jsonelement.getAsJsonPrimitive().getAsString();
        if (!typeMap.containsKey(jsonelement))
        {
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(jsonelement).length() + 52)).append("Cannot deserialize ").append(jsonelement).append(" no such key has been registered.").toString());
        } else
        {
            return (KeyType)typeMap.get(jsonelement);
        }
    }

    private static void registerType(KeyType keytype)
    {
        String s = keytype.getName();
        if (typeMap.containsKey(s))
        {
            keytype = String.valueOf(s);
            if (keytype.length() != 0)
            {
                keytype = "Attempt to map two key types to the same name ".concat(keytype);
            } else
            {
                keytype = new String("Attempt to map two key types to the same name ");
            }
            throw new IllegalArgumentException(keytype);
        } else
        {
            typeMap.put(s, keytype);
            return;
        }
    }

    public final volatile Object deserialize(JsonElement jsonelement, Type type, JsonDeserializationContext jsondeserializationcontext)
        throws JsonParseException
    {
        return deserialize(jsonelement, type, jsondeserializationcontext);
    }

    static 
    {
        DefaultKeyType adefaultkeytype[] = DefaultKeyType.values();
        int j = adefaultkeytype.length;
        for (int i = 0; i < j; i++)
        {
            registerType(adefaultkeytype[i]);
        }

    }

    public ()
    {
    }
}
