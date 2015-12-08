// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.bind;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.net.InetAddress;

// Referenced classes of package com.google.gson.internal.bind:
//            TypeAdapters

final class  extends TypeAdapter
{

    public InetAddress a(JsonReader jsonreader)
    {
        if (jsonreader.f() == JsonToken.i)
        {
            jsonreader.j();
            return null;
        } else
        {
            return InetAddress.getByName(jsonreader.h());
        }
    }

    public void a(JsonWriter jsonwriter, InetAddress inetaddress)
    {
        if (inetaddress == null)
        {
            inetaddress = null;
        } else
        {
            inetaddress = inetaddress.getHostAddress();
        }
        jsonwriter.b(inetaddress);
    }

    public Object read(JsonReader jsonreader)
    {
        return a(jsonreader);
    }

    public void write(JsonWriter jsonwriter, Object obj)
    {
        a(jsonwriter, (InetAddress)obj);
    }

    ()
    {
    }
}
