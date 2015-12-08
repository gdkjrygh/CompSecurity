// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.net.InetAddress;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//            StdScalarSerializer

public class InetAddressSerializer extends StdScalarSerializer
{

    public InetAddressSerializer()
    {
        super(java/net/InetAddress);
    }

    public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        serialize((InetAddress)obj, jsongenerator, serializerprovider);
    }

    public void serialize(InetAddress inetaddress, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        serializerprovider = inetaddress.toString().trim();
        int i = serializerprovider.indexOf('/');
        inetaddress = serializerprovider;
        if (i >= 0)
        {
            if (i == 0)
            {
                inetaddress = serializerprovider.substring(1);
            } else
            {
                inetaddress = serializerprovider.substring(0, i);
            }
        }
        jsongenerator.writeString(inetaddress);
    }

    public volatile void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
    {
        serializeWithType((InetAddress)obj, jsongenerator, serializerprovider, typeserializer);
    }

    public void serializeWithType(InetAddress inetaddress, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
    {
        typeserializer.writeTypePrefixForScalar(inetaddress, jsongenerator, java/net/InetAddress);
        serialize(inetaddress, jsongenerator, serializerprovider);
        typeserializer.writeTypeSuffixForScalar(inetaddress, jsongenerator);
    }
}
