// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.jsontype.impl:
//            TypeSerializerBase

public class AsWrapperTypeSerializer extends TypeSerializerBase
{

    public AsWrapperTypeSerializer(TypeIdResolver typeidresolver, BeanProperty beanproperty)
    {
        super(typeidresolver, beanproperty);
    }

    protected String _validTypeId(String s)
    {
        String s1 = s;
        if (s == null)
        {
            s1 = "";
        }
        return s1;
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

    public void writeCustomTypePrefixForArray(Object obj, JsonGenerator jsongenerator, String s)
        throws IOException
    {
        if (jsongenerator.canWriteTypeId())
        {
            if (s != null)
            {
                jsongenerator.writeTypeId(s);
            }
            jsongenerator.writeStartArray();
            return;
        } else
        {
            jsongenerator.writeStartObject();
            jsongenerator.writeArrayFieldStart(_validTypeId(s));
            return;
        }
    }

    public void writeCustomTypePrefixForObject(Object obj, JsonGenerator jsongenerator, String s)
        throws IOException
    {
        if (jsongenerator.canWriteTypeId())
        {
            if (s != null)
            {
                jsongenerator.writeTypeId(s);
            }
            jsongenerator.writeStartObject();
            return;
        } else
        {
            jsongenerator.writeStartObject();
            jsongenerator.writeObjectFieldStart(_validTypeId(s));
            return;
        }
    }

    public void writeCustomTypeSuffixForArray(Object obj, JsonGenerator jsongenerator, String s)
        throws IOException
    {
        if (!jsongenerator.canWriteTypeId())
        {
            writeTypeSuffixForArray(obj, jsongenerator);
        }
    }

    public void writeCustomTypeSuffixForObject(Object obj, JsonGenerator jsongenerator, String s)
        throws IOException
    {
        if (!jsongenerator.canWriteTypeId())
        {
            writeTypeSuffixForObject(obj, jsongenerator);
        }
    }

    public void writeTypePrefixForArray(Object obj, JsonGenerator jsongenerator)
        throws IOException
    {
        obj = idFromValue(obj);
        if (jsongenerator.canWriteTypeId())
        {
            if (obj != null)
            {
                jsongenerator.writeTypeId(obj);
            }
            jsongenerator.writeStartArray();
            return;
        } else
        {
            jsongenerator.writeStartObject();
            jsongenerator.writeArrayFieldStart(_validTypeId(((String) (obj))));
            return;
        }
    }

    public void writeTypePrefixForObject(Object obj, JsonGenerator jsongenerator)
        throws IOException
    {
        obj = idFromValue(obj);
        if (jsongenerator.canWriteTypeId())
        {
            if (obj != null)
            {
                jsongenerator.writeTypeId(obj);
            }
            jsongenerator.writeStartObject();
            return;
        } else
        {
            jsongenerator.writeStartObject();
            jsongenerator.writeObjectFieldStart(_validTypeId(((String) (obj))));
            return;
        }
    }

    public void writeTypePrefixForScalar(Object obj, JsonGenerator jsongenerator)
        throws IOException
    {
        obj = idFromValue(obj);
        if (jsongenerator.canWriteTypeId())
        {
            if (obj != null)
            {
                jsongenerator.writeTypeId(obj);
            }
            return;
        } else
        {
            jsongenerator.writeStartObject();
            jsongenerator.writeFieldName(_validTypeId(((String) (obj))));
            return;
        }
    }

    public void writeTypePrefixForScalar(Object obj, JsonGenerator jsongenerator, Class class1)
        throws IOException
    {
        obj = idFromValueAndType(obj, class1);
        if (jsongenerator.canWriteTypeId())
        {
            if (obj != null)
            {
                jsongenerator.writeTypeId(obj);
            }
            return;
        } else
        {
            jsongenerator.writeStartObject();
            jsongenerator.writeFieldName(_validTypeId(((String) (obj))));
            return;
        }
    }

    public void writeTypeSuffixForArray(Object obj, JsonGenerator jsongenerator)
        throws IOException
    {
        jsongenerator.writeEndArray();
        if (!jsongenerator.canWriteTypeId())
        {
            jsongenerator.writeEndObject();
        }
    }

    public void writeTypeSuffixForObject(Object obj, JsonGenerator jsongenerator)
        throws IOException
    {
        jsongenerator.writeEndObject();
        if (!jsongenerator.canWriteTypeId())
        {
            jsongenerator.writeEndObject();
        }
    }

    public void writeTypeSuffixForScalar(Object obj, JsonGenerator jsongenerator)
        throws IOException
    {
        if (!jsongenerator.canWriteTypeId())
        {
            jsongenerator.writeEndObject();
        }
    }
}
