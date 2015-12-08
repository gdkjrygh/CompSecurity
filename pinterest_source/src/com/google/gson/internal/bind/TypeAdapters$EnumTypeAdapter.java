// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.bind;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

final class constantToName extends TypeAdapter
{

    private final Map constantToName;
    private final Map nameToConstant;

    public final Enum read(JsonReader jsonreader)
    {
        if (jsonreader.peek() == JsonToken.NULL)
        {
            jsonreader.nextNull();
            return null;
        } else
        {
            return (Enum)nameToConstant.get(jsonreader.nextString());
        }
    }

    public final volatile Object read(JsonReader jsonreader)
    {
        return read(jsonreader);
    }

    public final void write(JsonWriter jsonwriter, Enum enum)
    {
        if (enum == null)
        {
            enum = null;
        } else
        {
            enum = (String)constantToName.get(enum);
        }
        jsonwriter.value(enum);
    }

    public final volatile void write(JsonWriter jsonwriter, Object obj)
    {
        write(jsonwriter, (Enum)obj);
    }

    public (Class class1)
    {
        nameToConstant = new HashMap();
        constantToName = new HashMap();
        String s;
        String s1;
        Enum aenum[];
        Enum enum;
        SerializedName serializedname;
        String as[];
        int i;
        int j;
        int k;
        int l;
        try
        {
            aenum = (Enum[])class1.getEnumConstants();
            k = aenum.length;
        }
        catch (NoSuchFieldException nosuchfieldexception)
        {
            throw new AssertionError((new StringBuilder("Missing field in ")).append(class1.getName()).toString(), nosuchfieldexception);
        }
        i = 0;
        if (i >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        enum = aenum[i];
        s = enum.name();
        serializedname = (SerializedName)class1.getField(s).getAnnotation(com/google/gson/annotations/SerializedName);
        if (serializedname == null) goto _L2; else goto _L1
_L1:
        s1 = serializedname.value();
        as = serializedname.alternate();
        l = as.length;
        j = 0;
_L3:
        s = s1;
        if (j >= l)
        {
            break; /* Loop/switch isn't completed */
        }
        s = as[j];
        nameToConstant.put(s, enum);
        j++;
        if (true) goto _L3; else goto _L2
_L2:
        nameToConstant.put(s, enum);
        constantToName.put(enum, s);
        i++;
        if (true) goto _L5; else goto _L4
_L5:
        break MISSING_BLOCK_LABEL_43;
_L4:
    }
}
