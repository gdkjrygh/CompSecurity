// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.io.IOException;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//            StdScalarSerializer

public class InetSocketAddressSerializer extends StdScalarSerializer
{

    public InetSocketAddressSerializer()
    {
        super(java/net/InetSocketAddress);
    }

    public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        serialize((InetSocketAddress)obj, jsongenerator, serializerprovider);
    }

    public void serialize(InetSocketAddress inetsocketaddress, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException
    {
        InetAddress inetaddress = inetsocketaddress.getAddress();
        String s;
        int i;
        if (inetaddress == null)
        {
            s = inetsocketaddress.getHostName();
        } else
        {
            s = inetaddress.toString().trim();
        }
        i = s.indexOf('/');
        serializerprovider = s;
        if (i >= 0)
        {
            if (i == 0)
            {
                if (inetaddress instanceof Inet6Address)
                {
                    serializerprovider = (new StringBuilder()).append("[").append(s.substring(1)).append("]").toString();
                } else
                {
                    serializerprovider = s.substring(1);
                }
            } else
            {
                serializerprovider = s.substring(0, i);
            }
        }
        jsongenerator.writeString((new StringBuilder()).append(serializerprovider).append(":").append(inetsocketaddress.getPort()).toString());
    }

    public volatile void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
        throws IOException
    {
        serializeWithType((InetSocketAddress)obj, jsongenerator, serializerprovider, typeserializer);
    }

    public void serializeWithType(InetSocketAddress inetsocketaddress, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
        throws IOException, JsonGenerationException
    {
        typeserializer.writeTypePrefixForScalar(inetsocketaddress, jsongenerator, java/net/InetSocketAddress);
        serialize(inetsocketaddress, jsongenerator, serializerprovider);
        typeserializer.writeTypeSuffixForScalar(inetsocketaddress, jsongenerator);
    }
}
