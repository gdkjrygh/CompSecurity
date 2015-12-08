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
//            AsPropertyTypeSerializer, AsArrayTypeSerializer

public class AsExistingPropertyTypeSerializer extends AsPropertyTypeSerializer
{

    public AsExistingPropertyTypeSerializer(TypeIdResolver typeidresolver, BeanProperty beanproperty, String s)
    {
        super(typeidresolver, beanproperty, s);
    }

    public volatile TypeSerializer forProperty(BeanProperty beanproperty)
    {
        return forProperty(beanproperty);
    }

    public volatile AsArrayTypeSerializer forProperty(BeanProperty beanproperty)
    {
        return forProperty(beanproperty);
    }

    public AsExistingPropertyTypeSerializer forProperty(BeanProperty beanproperty)
    {
        if (_property == beanproperty)
        {
            return this;
        } else
        {
            return new AsExistingPropertyTypeSerializer(_idResolver, beanproperty, _typePropertyName);
        }
    }

    public volatile AsPropertyTypeSerializer forProperty(BeanProperty beanproperty)
    {
        return forProperty(beanproperty);
    }

    public void writeCustomTypePrefixForObject(Object obj, JsonGenerator jsongenerator, String s)
        throws IOException
    {
        if (s != null && jsongenerator.canWriteTypeId())
        {
            jsongenerator.writeTypeId(s);
        }
        jsongenerator.writeStartObject();
    }

    public void writeTypePrefixForObject(Object obj, JsonGenerator jsongenerator)
        throws IOException
    {
        obj = idFromValue(obj);
        if (obj != null && jsongenerator.canWriteTypeId())
        {
            jsongenerator.writeTypeId(obj);
        }
        jsongenerator.writeStartObject();
    }
}
