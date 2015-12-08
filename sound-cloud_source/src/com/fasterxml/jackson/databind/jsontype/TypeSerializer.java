// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.jsontype;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.BeanProperty;
import java.io.IOException;

public abstract class TypeSerializer
{

    public TypeSerializer()
    {
    }

    public abstract TypeSerializer forProperty(BeanProperty beanproperty);

    public abstract void writeCustomTypePrefixForObject(Object obj, JsonGenerator jsongenerator, String s)
        throws IOException, JsonProcessingException;

    public abstract void writeCustomTypeSuffixForObject(Object obj, JsonGenerator jsongenerator, String s)
        throws IOException, JsonProcessingException;

    public abstract void writeTypePrefixForArray(Object obj, JsonGenerator jsongenerator)
        throws IOException, JsonProcessingException;

    public abstract void writeTypePrefixForObject(Object obj, JsonGenerator jsongenerator)
        throws IOException, JsonProcessingException;

    public abstract void writeTypePrefixForScalar(Object obj, JsonGenerator jsongenerator)
        throws IOException, JsonProcessingException;

    public void writeTypePrefixForScalar(Object obj, JsonGenerator jsongenerator, Class class1)
        throws IOException, JsonProcessingException
    {
        writeTypePrefixForScalar(obj, jsongenerator);
    }

    public abstract void writeTypeSuffixForArray(Object obj, JsonGenerator jsongenerator)
        throws IOException, JsonProcessingException;

    public abstract void writeTypeSuffixForObject(Object obj, JsonGenerator jsongenerator)
        throws IOException, JsonProcessingException;

    public abstract void writeTypeSuffixForScalar(Object obj, JsonGenerator jsongenerator)
        throws IOException, JsonProcessingException;
}
