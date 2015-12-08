// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

public class CoreXMLDeserializers extends com.fasterxml.jackson.databind.deser.Deserializers.Base
{

    static final DatatypeFactory _dataTypeFactory;

    public JsonDeserializer findBeanDeserializer(JavaType javatype, DeserializationConfig deserializationconfig, BeanDescription beandescription)
    {
        javatype = javatype.getRawClass();
        if (javatype == javax/xml/namespace/QName)
        {
            return new Std(javatype, 3);
        }
        if (javatype == javax/xml/datatype/XMLGregorianCalendar)
        {
            return new Std(javatype, 2);
        }
        if (javatype == javax/xml/datatype/Duration)
        {
            return new Std(javatype, 1);
        } else
        {
            return null;
        }
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

    private class Std extends FromStringDeserializer
    {

        private static final long serialVersionUID = 1L;
        protected final int _kind;

        protected Object _deserialize(String s, DeserializationContext deserializationcontext)
        {
            switch (_kind)
            {
            case 2: // '\002'
            default:
                throw new IllegalStateException();

            case 1: // '\001'
                return CoreXMLDeserializers._dataTypeFactory.newDuration(s);

            case 3: // '\003'
                return QName.valueOf(s);
            }
        }

        public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        {
            if (_kind == 2)
            {
                java.util.Date date = _parseDate(jsonparser, deserializationcontext);
                if (date == null)
                {
                    return null;
                }
                jsonparser = new GregorianCalendar();
                jsonparser.setTime(date);
                deserializationcontext = deserializationcontext.getTimeZone();
                if (deserializationcontext != null)
                {
                    jsonparser.setTimeZone(deserializationcontext);
                }
                return CoreXMLDeserializers._dataTypeFactory.newXMLGregorianCalendar(jsonparser);
            } else
            {
                return super.deserialize(jsonparser, deserializationcontext);
            }
        }

        public Std(Class class1, int i)
        {
            super(class1);
            _kind = i;
        }
    }

}
