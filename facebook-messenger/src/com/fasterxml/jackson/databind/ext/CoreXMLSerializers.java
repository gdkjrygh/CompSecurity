// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.fasterxml.jackson.databind.util.Provider;
import java.util.Collection;
import java.util.HashMap;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

public class CoreXMLSerializers
    implements Provider
{

    static final HashMap _serializers;

    public CoreXMLSerializers()
    {
    }

    public Collection provide()
    {
        return _serializers.entrySet();
    }

    static 
    {
        _serializers = new HashMap();
        ToStringSerializer tostringserializer = ToStringSerializer.instance;
        _serializers.put(javax/xml/datatype/Duration, tostringserializer);
        _serializers.put(javax/xml/datatype/XMLGregorianCalendar, new XMLGregorianCalendarSerializer());
        _serializers.put(javax/xml/namespace/QName, tostringserializer);
    }

    private class XMLGregorianCalendarSerializer extends StdSerializer
    {

        public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
        {
            return CalendarSerializer.instance.getSchema(serializerprovider, type);
        }

        public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        {
            serialize((XMLGregorianCalendar)obj, jsongenerator, serializerprovider);
        }

        public void serialize(XMLGregorianCalendar xmlgregoriancalendar, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        {
            CalendarSerializer.instance.serialize(xmlgregoriancalendar.toGregorianCalendar(), jsongenerator, serializerprovider);
        }

        public XMLGregorianCalendarSerializer()
        {
            super(javax/xml/datatype/XMLGregorianCalendar);
        }
    }

}
