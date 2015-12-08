// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.a;

import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.e;
import com.google.gson.r;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

// Referenced classes of package com.google.gson.internal.a:
//            i

public static final class <init> extends r
{

    private final e a;
    private final Map b;

    public final Object a(JsonReader jsonreader)
        throws IOException
    {
        Object obj;
        if (jsonreader.peek() == JsonToken.NULL)
        {
            jsonreader.nextNull();
            return null;
        }
        obj = a.a();
        jsonreader.beginObject();
_L1:
        Object obj1;
        if (!jsonreader.hasNext())
        {
            break MISSING_BLOCK_LABEL_103;
        }
        obj1 = jsonreader.nextName();
        obj1 = (er.nextName)b.get(obj1);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        if (((b) (obj1)).i)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        jsonreader.skipValue();
          goto _L1
        try
        {
            ((er.skipValue) (obj1)).a(jsonreader, obj);
        }
        // Misplaced declaration of an exception variable
        catch (JsonReader jsonreader)
        {
            throw new JsonSyntaxException(jsonreader);
        }
        // Misplaced declaration of an exception variable
        catch (JsonReader jsonreader)
        {
            throw new AssertionError(jsonreader);
        }
          goto _L1
        jsonreader.endObject();
        return obj;
    }

    public final void a(JsonWriter jsonwriter, Object obj)
        throws IOException
    {
        if (obj == null)
        {
            jsonwriter.nullValue();
            return;
        }
        jsonwriter.beginObject();
        try
        {
            Iterator iterator = b.values().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                er er = (b)iterator.next();
                if (er.h)
                {
                    jsonwriter.name(er.g);
                    er.a(jsonwriter, obj);
                }
            } while (true);
        }
        // Misplaced declaration of an exception variable
        catch (JsonWriter jsonwriter)
        {
            throw new AssertionError();
        }
        jsonwriter.endObject();
    }

    private n(e e1, Map map)
    {
        a = e1;
        b = map;
    }

    b(e e1, Map map, byte byte0)
    {
        this(e1, map);
    }
}
