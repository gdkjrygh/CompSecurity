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

// Referenced classes of package com.google.gson.internal.bind:
//            TypeAdapters

static final class b extends TypeAdapter
{

    private final Map a;
    private final Map b;

    public final Object read(JsonReader jsonreader)
    {
        if (jsonreader.peek() == JsonToken.NULL)
        {
            jsonreader.nextNull();
            return null;
        } else
        {
            return (Enum)a.get(jsonreader.nextString());
        }
    }

    public final void write(JsonWriter jsonwriter, Object obj)
    {
        obj = (Enum)obj;
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = (String)b.get(obj);
        }
        jsonwriter.value(((String) (obj)));
    }

    public (Class class1)
    {
        a = new HashMap();
        b = new HashMap();
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
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            throw new AssertionError();
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
        a.put(s, enum);
        j++;
        if (true) goto _L3; else goto _L2
_L2:
        a.put(s, enum);
        b.put(enum, s);
        i++;
        if (true) goto _L5; else goto _L4
_L5:
        break MISSING_BLOCK_LABEL_43;
_L4:
    }
}
