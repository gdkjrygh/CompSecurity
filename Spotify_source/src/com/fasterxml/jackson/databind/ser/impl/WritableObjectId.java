// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

// Referenced classes of package com.fasterxml.jackson.databind.ser.impl:
//            ObjectIdWriter

public final class WritableObjectId
{

    public final ObjectIdGenerator generator;
    public Object id;
    protected boolean idWritten;

    public WritableObjectId(ObjectIdGenerator objectidgenerator)
    {
        idWritten = false;
        generator = objectidgenerator;
    }

    public final Object generateId(Object obj)
    {
        obj = generator.generateId(obj);
        id = obj;
        return obj;
    }

    public final void writeAsField(JsonGenerator jsongenerator, SerializerProvider serializerprovider, ObjectIdWriter objectidwriter)
    {
        idWritten = true;
        if (jsongenerator.canWriteObjectId())
        {
            jsongenerator.writeObjectId(String.valueOf(id));
        } else
        {
            com.fasterxml.jackson.core.SerializableString serializablestring = objectidwriter.propertyName;
            if (serializablestring != null)
            {
                jsongenerator.writeFieldName(serializablestring);
                objectidwriter.serializer.serialize(id, jsongenerator, serializerprovider);
                return;
            }
        }
    }

    public final boolean writeAsId(JsonGenerator jsongenerator, SerializerProvider serializerprovider, ObjectIdWriter objectidwriter)
    {
        if (id != null && (idWritten || objectidwriter.alwaysAsId))
        {
            if (jsongenerator.canWriteObjectId())
            {
                jsongenerator.writeObjectRef(String.valueOf(id));
            } else
            {
                objectidwriter.serializer.serialize(id, jsongenerator, serializerprovider);
            }
            return true;
        } else
        {
            return false;
        }
    }
}
