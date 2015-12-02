// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer;
import java.util.GregorianCalendar;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

// Referenced classes of package com.fasterxml.jackson.databind.ext:
//            CoreXMLDeserializers

public class  extends StdScalarDeserializer
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

    public ()
    {
        super(javax/xml/datatype/XMLGregorianCalendar);
    }
}
