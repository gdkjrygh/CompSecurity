// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.keyczar.interfaces;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import org.keyczar.DefaultKeyType;
import org.keyczar.KeyczarKey;
import org.keyczar.exceptions.KeyczarException;

public interface KeyType
{
    public static interface Builder
    {

        public abstract KeyczarKey read(String s)
            throws KeyczarException;
    }

    public static final class KeyTypeDeserializer
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

        public KeyTypeDeserializer()
        {
        }
    }

    public static final class KeyTypeSerializer
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

        public KeyTypeSerializer()
        {
        }
    }


    public abstract Builder getBuilder();

    public abstract String getName();
}
