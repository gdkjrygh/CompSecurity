// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.a;

import com.google.gson.h;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.r;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.gson.internal.a:
//            m

static final class r extends r
{

    private void a(JsonWriter jsonwriter, k k1)
        throws IOException
    {
        if (k1 == null || (k1 instanceof l))
        {
            jsonwriter.nullValue();
            return;
        }
        if (k1 instanceof n)
        {
            k1 = k1.g();
            if (((n) (k1)).a instanceof Number)
            {
                jsonwriter.value(k1.a());
                return;
            }
            if (((n) (k1)).a instanceof Boolean)
            {
                jsonwriter.value(k1.f());
                return;
            } else
            {
                jsonwriter.value(k1.b());
                return;
            }
        }
        if (k1 instanceof h)
        {
            jsonwriter.beginArray();
            if (k1 instanceof h)
            {
                for (k1 = ((h)k1).iterator(); k1.hasNext(); a(jsonwriter, (k)k1.next())) { }
            } else
            {
                throw new IllegalStateException("This is not a JSON Array.");
            }
            jsonwriter.endArray();
            return;
        }
        if (k1 instanceof m)
        {
            jsonwriter.beginObject();
            if (k1 instanceof m)
            {
                java.util.ntry ntry;
                for (k1 = ((m)k1).a.entrySet().iterator(); k1.hasNext(); a(jsonwriter, (k)ntry.getValue()))
                {
                    ntry = (java.util.ntry)k1.next();
                    jsonwriter.name((String)ntry.getKey());
                }

            } else
            {
                throw new IllegalStateException((new StringBuilder("Not a JSON Object: ")).append(k1).toString());
            }
            jsonwriter.endObject();
            return;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("Couldn't write ")).append(k1.getClass()).toString());
        }
    }

    private k b(JsonReader jsonreader)
        throws IOException
    {
        m m1;
        switch (a[jsonreader.peek().ordinal()])
        {
        default:
            throw new IllegalArgumentException();

        case 3: // '\003'
            return new n(jsonreader.nextString());

        case 1: // '\001'
            return new n(new LazilyParsedNumber(jsonreader.nextString()));

        case 2: // '\002'
            return new n(Boolean.valueOf(jsonreader.nextBoolean()));

        case 4: // '\004'
            jsonreader.nextNull();
            return l.a;

        case 5: // '\005'
            h h1 = new h();
            jsonreader.beginArray();
            for (; jsonreader.hasNext(); h1.a(b(jsonreader))) { }
            jsonreader.endArray();
            return h1;

        case 6: // '\006'
            m1 = new m();
            jsonreader.beginObject();
            break;
        }
        for (; jsonreader.hasNext(); m1.a(jsonreader.nextName(), b(jsonreader))) { }
        jsonreader.endObject();
        return m1;
    }

    public final Object a(JsonReader jsonreader)
        throws IOException
    {
        return b(jsonreader);
    }

    public final volatile void a(JsonWriter jsonwriter, Object obj)
        throws IOException
    {
        a(jsonwriter, (k)obj);
    }

    r()
    {
    }
}
