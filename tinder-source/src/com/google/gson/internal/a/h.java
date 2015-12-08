// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.a;

import com.google.gson.b.a;
import com.google.gson.e;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.r;
import com.google.gson.s;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class h extends r
{

    public static final s a = new s() {

        public final r a(e e1, a a1)
        {
            if (a1.a == java/lang/Object)
            {
                return new h(e1, (byte)0);
            } else
            {
                return null;
            }
        }

    };
    private final e b;

    private h(e e1)
    {
        b = e1;
    }

    h(e e1, byte byte0)
    {
        this(e1);
    }

    public final Object a(JsonReader jsonreader)
        throws IOException
    {
        JsonToken jsontoken = jsonreader.peek();
        static final class _cls2
        {

            static final int a[];

            static 
            {
                a = new int[JsonToken.values().length];
                try
                {
                    a[JsonToken.BEGIN_ARRAY.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[JsonToken.BEGIN_OBJECT.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[JsonToken.STRING.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[JsonToken.NUMBER.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[JsonToken.BOOLEAN.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[JsonToken.NULL.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (com.google.gson.internal.a._cls2.a[jsontoken.ordinal()])
        {
        default:
            throw new IllegalStateException();

        case 1: // '\001'
            ArrayList arraylist = new ArrayList();
            jsonreader.beginArray();
            for (; jsonreader.hasNext(); arraylist.add(a(jsonreader))) { }
            jsonreader.endArray();
            return arraylist;

        case 2: // '\002'
            LinkedTreeMap linkedtreemap = new LinkedTreeMap();
            jsonreader.beginObject();
            for (; jsonreader.hasNext(); linkedtreemap.put(jsonreader.nextName(), a(jsonreader))) { }
            jsonreader.endObject();
            return linkedtreemap;

        case 3: // '\003'
            return jsonreader.nextString();

        case 4: // '\004'
            return Double.valueOf(jsonreader.nextDouble());

        case 5: // '\005'
            return Boolean.valueOf(jsonreader.nextBoolean());

        case 6: // '\006'
            jsonreader.nextNull();
            return null;
        }
    }

    public final void a(JsonWriter jsonwriter, Object obj)
        throws IOException
    {
        if (obj == null)
        {
            jsonwriter.nullValue();
            return;
        }
        r r1 = b.a(obj.getClass());
        if (r1 instanceof h)
        {
            jsonwriter.beginObject();
            jsonwriter.endObject();
            return;
        } else
        {
            r1.a(jsonwriter, obj);
            return;
        }
    }

}
