// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public final class bmc extends bkq
{

    private final bll a;
    private final Map b;

    private bmc(bll bll1, Map map)
    {
        a = bll1;
        b = map;
    }

    bmc(bll bll1, Map map, byte byte0)
    {
        this(bll1, map);
    }

    public final Object a(JsonReader jsonreader)
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
        obj1 = (bmd)b.get(obj1);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        if (((bmd) (obj1)).i)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        jsonreader.skipValue();
          goto _L1
        try
        {
            ((bmd) (obj1)).a(jsonreader, obj);
        }
        // Misplaced declaration of an exception variable
        catch (JsonReader jsonreader)
        {
            throw new bkm(jsonreader);
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
                bmd bmd1 = (bmd)iterator.next();
                if (bmd1.a(obj))
                {
                    jsonwriter.name(bmd1.g);
                    bmd1.a(jsonwriter, obj);
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
}
