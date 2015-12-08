// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.base.GeneratorBase;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;

public abstract class JsonGeneratorImpl extends GeneratorBase
{

    protected static final int sOutputEscapes[] = CharTypes.get7BitOutputEscapes();
    protected CharacterEscapes _characterEscapes;
    protected final IOContext _ioContext;
    protected int _maximumNonEscapedChar;
    protected int _outputEscapes[];
    protected SerializableString _rootValueSeparator;

    public JsonGeneratorImpl(IOContext iocontext, int i, ObjectCodec objectcodec)
    {
        super(i, objectcodec);
        _outputEscapes = sOutputEscapes;
        _rootValueSeparator = DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        _ioContext = iocontext;
        if (isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII))
        {
            setHighestNonEscapedChar(127);
        }
    }

    public JsonGenerator setCharacterEscapes(CharacterEscapes characterescapes)
    {
        _characterEscapes = characterescapes;
        if (characterescapes == null)
        {
            _outputEscapes = sOutputEscapes;
            return this;
        } else
        {
            _outputEscapes = characterescapes.getEscapeCodesForAscii();
            return this;
        }
    }

    public JsonGenerator setHighestNonEscapedChar(int i)
    {
        int j = i;
        if (i < 0)
        {
            j = 0;
        }
        _maximumNonEscapedChar = j;
        return this;
    }

    public JsonGenerator setRootValueSeparator(SerializableString serializablestring)
    {
        _rootValueSeparator = serializablestring;
        return this;
    }

    public final void writeStringField(String s, String s1)
    {
        writeFieldName(s);
        writeString(s1);
    }

}
