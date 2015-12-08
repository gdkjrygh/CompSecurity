// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.a;

import com.google.gson.a.c;
import com.google.gson.r;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.gson.internal.a:
//            m

private static final class b extends r
{

    private final Map a;
    private final Map b;

    public final Object a(JsonReader jsonreader)
        throws IOException
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

    public final void a(JsonWriter jsonwriter, Object obj)
        throws IOException
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

    public er(Class class1)
    {
        a = new HashMap();
        b = new HashMap();
        String s;
        Enum aenum[];
        Enum enum;
        c c1;
        int i;
        int j;
        try
        {
            aenum = (Enum[])class1.getEnumConstants();
            j = aenum.length;
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            throw new AssertionError();
        }
        i = 0;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        enum = aenum[i];
        s = enum.name();
        c1 = (c)class1.getField(s).getAnnotation(com/google/gson/a/c);
        if (c1 == null)
        {
            break MISSING_BLOCK_LABEL_88;
        }
        s = c1.a();
        a.put(s, enum);
        b.put(enum, s);
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_41;
_L1:
    }
}
