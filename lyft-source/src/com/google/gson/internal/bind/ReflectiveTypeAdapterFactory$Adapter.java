// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public final class <init> extends TypeAdapter
{

    private final ObjectConstructor a;
    private final Map b;

    public Object read(JsonReader jsonreader)
    {
        Object obj;
        if (jsonreader.f() == JsonToken.i)
        {
            jsonreader.j();
            return null;
        }
        obj = a.a();
        jsonreader.c();
_L1:
        Object obj1;
        if (!jsonreader.e())
        {
            break MISSING_BLOCK_LABEL_103;
        }
        obj1 = jsonreader.g();
        obj1 = (ld)b.get(obj1);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        if (((ld) (obj1)).i)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        jsonreader.n();
          goto _L1
        try
        {
            ((ld) (obj1)).a(jsonreader, obj);
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
        jsonreader.d();
        return obj;
    }

    public void write(JsonWriter jsonwriter, Object obj)
    {
        if (obj == null)
        {
            jsonwriter.f();
            return;
        }
        jsonwriter.d();
        try
        {
            Iterator iterator = b.values().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                ld ld = (ld)iterator.next();
                if (ld.a(obj))
                {
                    jsonwriter.a(ld.g);
                    ld.a(jsonwriter, obj);
                }
            } while (true);
        }
        // Misplaced declaration of an exception variable
        catch (JsonWriter jsonwriter)
        {
            throw new AssertionError();
        }
        jsonwriter.e();
    }

    private ld(ObjectConstructor objectconstructor, Map map)
    {
        a = objectconstructor;
        b = map;
    }

    b(ObjectConstructor objectconstructor, Map map, b b1)
    {
        this(objectconstructor, map);
    }
}
