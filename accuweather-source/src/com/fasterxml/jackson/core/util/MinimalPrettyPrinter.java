// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.PrettyPrinter;
import java.io.IOException;
import java.io.Serializable;

public class MinimalPrettyPrinter
    implements PrettyPrinter, Serializable
{

    public static final String DEFAULT_ROOT_VALUE_SEPARATOR = " ";
    private static final long serialVersionUID = 0xf830a81f78ea9af6L;
    protected String _rootValueSeparator;

    public MinimalPrettyPrinter()
    {
        this(" ");
    }

    public MinimalPrettyPrinter(String s)
    {
        _rootValueSeparator = " ";
        _rootValueSeparator = s;
    }

    public void beforeArrayValues(JsonGenerator jsongenerator)
        throws IOException, JsonGenerationException
    {
    }

    public void beforeObjectEntries(JsonGenerator jsongenerator)
        throws IOException, JsonGenerationException
    {
    }

    public void setRootValueSeparator(String s)
    {
        _rootValueSeparator = s;
    }

    public void writeArrayValueSeparator(JsonGenerator jsongenerator)
        throws IOException, JsonGenerationException
    {
        jsongenerator.writeRaw(',');
    }

    public void writeEndArray(JsonGenerator jsongenerator, int i)
        throws IOException, JsonGenerationException
    {
        jsongenerator.writeRaw(']');
    }

    public void writeEndObject(JsonGenerator jsongenerator, int i)
        throws IOException, JsonGenerationException
    {
        jsongenerator.writeRaw('}');
    }

    public void writeObjectEntrySeparator(JsonGenerator jsongenerator)
        throws IOException, JsonGenerationException
    {
        jsongenerator.writeRaw(',');
    }

    public void writeObjectFieldValueSeparator(JsonGenerator jsongenerator)
        throws IOException, JsonGenerationException
    {
        jsongenerator.writeRaw(':');
    }

    public void writeRootValueSeparator(JsonGenerator jsongenerator)
        throws IOException, JsonGenerationException
    {
        if (_rootValueSeparator != null)
        {
            jsongenerator.writeRaw(_rootValueSeparator);
        }
    }

    public void writeStartArray(JsonGenerator jsongenerator)
        throws IOException, JsonGenerationException
    {
        jsongenerator.writeRaw('[');
    }

    public void writeStartObject(JsonGenerator jsongenerator)
        throws IOException, JsonGenerationException
    {
        jsongenerator.writeRaw('{');
    }
}
