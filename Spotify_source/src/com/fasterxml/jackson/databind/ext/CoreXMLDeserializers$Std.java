// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer;
import java.util.GregorianCalendar;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.namespace.QName;

// Referenced classes of package com.fasterxml.jackson.databind.ext:
//            CoreXMLDeserializers

public class _kind extends FromStringDeserializer
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

    public zer(Class class1, int i)
    {
        super(class1);
        _kind = i;
    }
}
