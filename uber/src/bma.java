// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class bma extends bkq
{

    public static final bkr a = new bkr() {

        public final bkq create(bjw bjw1, bmj bmj1)
        {
            if (bmj1.getRawType() == java/lang/Object)
            {
                return new bma(bjw1, (byte)0);
            } else
            {
                return null;
            }
        }

    };
    private final bjw b;

    private bma(bjw bjw1)
    {
        b = bjw1;
    }

    bma(bjw bjw1, byte byte0)
    {
        this(bjw1);
    }

    public final Object a(JsonReader jsonreader)
    {
        JsonToken jsontoken = jsonreader.peek();
        final class _cls2
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

        switch (_cls2.a[jsontoken.ordinal()])
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
            blg blg1 = new blg();
            jsonreader.beginObject();
            for (; jsonreader.hasNext(); blg1.put(jsonreader.nextName(), a(jsonreader))) { }
            jsonreader.endObject();
            return blg1;

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
    {
        if (obj == null)
        {
            jsonwriter.nullValue();
            return;
        }
        bkq bkq1 = b.a(obj.getClass());
        if (bkq1 instanceof bma)
        {
            jsonwriter.beginObject();
            jsonwriter.endObject();
            return;
        } else
        {
            bkq1.a(jsonwriter, obj);
            return;
        }
    }

}
