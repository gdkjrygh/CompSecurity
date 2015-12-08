// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;

// Referenced classes of package com.fasterxml.jackson.databind.jsontype.impl:
//            TypeSerializerBase

public class AsWrapperTypeSerializer extends TypeSerializerBase
{

    public AsWrapperTypeSerializer(TypeIdResolver typeidresolver, BeanProperty beanproperty)
    {
        super(typeidresolver, beanproperty);
    }

    public volatile TypeSerializer forProperty(BeanProperty beanproperty)
    {
        return forProperty(beanproperty);
    }

    public AsWrapperTypeSerializer forProperty(BeanProperty beanproperty)
    {
        if (_property == beanproperty)
        {
            return this;
        } else
        {
            return new AsWrapperTypeSerializer(_idResolver, beanproperty);
        }
    }

    public void writeCustomTypePrefixForObject(Object obj, JsonGenerator jsongenerator, String s)
    {
        if (jsongenerator.canWriteTypeId())
        {
            jsongenerator.writeTypeId(s);
            jsongenerator.writeStartObject();
            return;
        } else
        {
            jsongenerator.writeStartObject();
            jsongenerator.writeObjectFieldStart(s);
            return;
        }
    }

    public void writeCustomTypeSuffixForObject(Object obj, JsonGenerator jsongenerator, String s)
    {
        if (!jsongenerator.canWriteTypeId())
        {
            writeTypeSuffixForObject(obj, jsongenerator);
        }
    }

    public void writeTypePrefixForArray(Object obj, JsonGenerator jsongenerator)
    {
        obj = idFromValue(obj);
        if (jsongenerator.canWriteTypeId())
        {
            jsongenerator.writeTypeId(obj);
            jsongenerator.writeStartObject();
            return;
        } else
        {
            jsongenerator.writeStartObject();
            jsongenerator.writeArrayFieldStart(((String) (obj)));
            return;
        }
    }

    public void writeTypePrefixForObject(Object obj, JsonGenerator jsongenerator)
    {
        obj = idFromValue(obj);
        if (jsongenerator.canWriteTypeId())
        {
            jsongenerator.writeTypeId(obj);
            jsongenerator.writeStartObject();
            return;
        } else
        {
            jsongenerator.writeStartObject();
            jsongenerator.writeObjectFieldStart(((String) (obj)));
            return;
        }
    }

    public void writeTypePrefixForScalar(Object obj, JsonGenerator jsongenerator)
    {
        obj = idFromValue(obj);
        if (jsongenerator.canWriteTypeId())
        {
            jsongenerator.writeTypeId(obj);
            return;
        } else
        {
            jsongenerator.writeStartObject();
            jsongenerator.writeFieldName(((String) (obj)));
            return;
        }
    }

    public void writeTypePrefixForScalar(Object obj, JsonGenerator jsongenerator, Class class1)
    {
        obj = idFromValueAndType(obj, class1);
        if (jsongenerator.canWriteTypeId())
        {
            jsongenerator.writeTypeId(obj);
            return;
        } else
        {
            jsongenerator.writeStartObject();
            jsongenerator.writeFieldName(((String) (obj)));
            return;
        }
    }

    public void writeTypeSuffixForArray(Object obj, JsonGenerator jsongenerator)
    {
        jsongenerator.writeEndArray();
        if (!jsongenerator.canWriteTypeId())
        {
            jsongenerator.writeEndObject();
        }
    }

    public void writeTypeSuffixForObject(Object obj, JsonGenerator jsongenerator)
    {
        jsongenerator.writeEndObject();
        if (!jsongenerator.canWriteTypeId())
        {
            jsongenerator.writeEndObject();
        }
    }

    public void writeTypeSuffixForScalar(Object obj, JsonGenerator jsongenerator)
    {
        if (!jsongenerator.canWriteTypeId())
        {
            jsongenerator.writeEndObject();
        }
    }
}
