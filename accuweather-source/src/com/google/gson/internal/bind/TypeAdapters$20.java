// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.bind;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.net.InetAddress;
import java.sql.Timestamp;
import java.util.Date;

// Referenced classes of package com.google.gson.internal.bind:
//            TypeAdapters

static final class _cls1.val.dateTypeAdapter extends TypeAdapter
{

    public volatile Object read(JsonReader jsonreader)
        throws IOException
    {
        return read(jsonreader);
    }

    public InetAddress read(JsonReader jsonreader)
        throws IOException
    {
        if (jsonreader.peek() == JsonToken.NULL)
        {
            jsonreader.nextNull();
            return null;
        } else
        {
            return InetAddress.getByName(jsonreader.nextString());
        }
    }

    public volatile void write(JsonWriter jsonwriter, Object obj)
        throws IOException
    {
        write(jsonwriter, (InetAddress)obj);
    }

    public void write(JsonWriter jsonwriter, InetAddress inetaddress)
        throws IOException
    {
        if (inetaddress == null)
        {
            inetaddress = null;
        } else
        {
            inetaddress = inetaddress.getHostAddress();
        }
        jsonwriter.value(inetaddress);
    }

    _cls1.val.dateTypeAdapter()
    {
    }

    // Unreferenced inner class com/google/gson/internal/bind/TypeAdapters$20$1

/* anonymous class */
    class _cls1 extends TypeAdapter
    {

        final TypeAdapters._cls20 this$0;
        final TypeAdapter val$dateTypeAdapter;

        public volatile Object read(JsonReader jsonreader)
            throws IOException
        {
            return read(jsonreader);
        }

        public Timestamp read(JsonReader jsonreader)
            throws IOException
        {
            jsonreader = (Date)dateTypeAdapter.read(jsonreader);
            if (jsonreader != null)
            {
                return new Timestamp(jsonreader.getTime());
            } else
            {
                return null;
            }
        }

        public volatile void write(JsonWriter jsonwriter, Object obj)
            throws IOException
        {
            write(jsonwriter, (Timestamp)obj);
        }

        public void write(JsonWriter jsonwriter, Timestamp timestamp)
            throws IOException
        {
            dateTypeAdapter.write(jsonwriter, timestamp);
        }

            
            {
                this$0 = TypeAdapters._cls20.this;
                dateTypeAdapter = typeadapter;
                super();
            }
    }

}
