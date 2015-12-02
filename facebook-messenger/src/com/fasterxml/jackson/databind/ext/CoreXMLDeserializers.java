// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.util.Provider;
import java.util.Arrays;
import java.util.Collection;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;

public class CoreXMLDeserializers
    implements Provider
{

    static final DatatypeFactory _dataTypeFactory;

    public CoreXMLDeserializers()
    {
    }

    public Collection provide()
    {
        return Arrays.asList(new StdDeserializer[] {
            new DurationDeserializer(), new GregorianCalendarDeserializer(), new QNameDeserializer()
        });
    }

    static 
    {
        try
        {
            _dataTypeFactory = DatatypeFactory.newInstance();
        }
        catch (DatatypeConfigurationException datatypeconfigurationexception)
        {
            throw new RuntimeException(datatypeconfigurationexception);
        }
    }

    private class DurationDeserializer extends FromStringDeserializer
    {

        protected volatile Object _deserialize(String s, DeserializationContext deserializationcontext)
        {
            return _deserialize(s, deserializationcontext);
        }

        protected Duration _deserialize(String s, DeserializationContext deserializationcontext)
        {
            return CoreXMLDeserializers._dataTypeFactory.newDuration(s);
        }

        public DurationDeserializer()
        {
            super(javax/xml/datatype/Duration);
        }
    }


    private class GregorianCalendarDeserializer extends StdScalarDeserializer
    {

        public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public XMLGregorianCalendar deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        {
            jsonparser = _parseDate(jsonparser, deserializationcontext);
            if (jsonparser == null)
            {
                return null;
            } else
            {
                deserializationcontext = new GregorianCalendar();
                deserializationcontext.setTime(jsonparser);
                return CoreXMLDeserializers._dataTypeFactory.newXMLGregorianCalendar(deserializationcontext);
            }
        }

        public GregorianCalendarDeserializer()
        {
            super(javax/xml/datatype/XMLGregorianCalendar);
        }
    }


    private class QNameDeserializer extends FromStringDeserializer
    {

        protected volatile Object _deserialize(String s, DeserializationContext deserializationcontext)
        {
            return _deserialize(s, deserializationcontext);
        }

        protected QName _deserialize(String s, DeserializationContext deserializationcontext)
        {
            return QName.valueOf(s);
        }

        public QNameDeserializer()
        {
            super(javax/xml/namespace/QName);
        }
    }

}
