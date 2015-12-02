// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;

// Referenced classes of package com.fasterxml.jackson.databind.ext:
//            CoreXMLDeserializers

public class  extends FromStringDeserializer
{

    protected volatile Object _deserialize(String s, DeserializationContext deserializationcontext)
    {
        return _deserialize(s, deserializationcontext);
    }

    protected Duration _deserialize(String s, DeserializationContext deserializationcontext)
    {
        return CoreXMLDeserializers._dataTypeFactory.newDuration(s);
    }

    public ()
    {
        super(javax/xml/datatype/Duration);
    }
}
