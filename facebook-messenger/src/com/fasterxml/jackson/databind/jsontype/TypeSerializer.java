// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.jsontype;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;

// Referenced classes of package com.fasterxml.jackson.databind.jsontype:
//            TypeIdResolver

public abstract class TypeSerializer
{

    public TypeSerializer()
    {
    }

    public abstract TypeSerializer forProperty(BeanProperty beanproperty);

    public abstract String getPropertyName();

    public abstract TypeIdResolver getTypeIdResolver();

    public abstract com.fasterxml.jackson.annotation.JsonTypeInfo.As getTypeInclusion();

    public abstract void writeCustomTypePrefixForArray(Object obj, JsonGenerator jsongenerator, String s);

    public abstract void writeCustomTypePrefixForObject(Object obj, JsonGenerator jsongenerator, String s);

    public abstract void writeCustomTypePrefixForScalar(Object obj, JsonGenerator jsongenerator, String s);

    public abstract void writeCustomTypeSuffixForArray(Object obj, JsonGenerator jsongenerator, String s);

    public abstract void writeCustomTypeSuffixForObject(Object obj, JsonGenerator jsongenerator, String s);

    public abstract void writeCustomTypeSuffixForScalar(Object obj, JsonGenerator jsongenerator, String s);

    public abstract void writeTypePrefixForArray(Object obj, JsonGenerator jsongenerator);

    public void writeTypePrefixForArray(Object obj, JsonGenerator jsongenerator, Class class1)
    {
        writeTypePrefixForArray(obj, jsongenerator);
    }

    public abstract void writeTypePrefixForObject(Object obj, JsonGenerator jsongenerator);

    public void writeTypePrefixForObject(Object obj, JsonGenerator jsongenerator, Class class1)
    {
        writeTypePrefixForObject(obj, jsongenerator);
    }

    public abstract void writeTypePrefixForScalar(Object obj, JsonGenerator jsongenerator);

    public void writeTypePrefixForScalar(Object obj, JsonGenerator jsongenerator, Class class1)
    {
        writeTypePrefixForScalar(obj, jsongenerator);
    }

    public abstract void writeTypeSuffixForArray(Object obj, JsonGenerator jsongenerator);

    public abstract void writeTypeSuffixForObject(Object obj, JsonGenerator jsongenerator);

    public abstract void writeTypeSuffixForScalar(Object obj, JsonGenerator jsongenerator);
}
