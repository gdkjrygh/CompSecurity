// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

final class bmi extends bkq
{

    private final Map a;
    private final Map b;

    public bmi(Class class1)
    {
        a = new HashMap();
        b = new HashMap();
        String s;
        Enum aenum[];
        Enum enum;
        bku bku1;
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
        bku1 = (bku)class1.getField(s).getAnnotation(bku);
        if (bku1 == null)
        {
            break MISSING_BLOCK_LABEL_88;
        }
        s = bku1.a();
        a.put(s, enum);
        b.put(enum, s);
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_41;
_L1:
    }

    private void a(JsonWriter jsonwriter, Enum enum)
    {
        if (enum == null)
        {
            enum = null;
        } else
        {
            enum = (String)b.get(enum);
        }
        jsonwriter.value(enum);
    }

    private Enum b(JsonReader jsonreader)
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

    public final Object a(JsonReader jsonreader)
    {
        return b(jsonreader);
    }

    public final volatile void a(JsonWriter jsonwriter, Object obj)
    {
        a(jsonwriter, (Enum)obj);
    }
}
