// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.base;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.json.DupDetector;
import com.fasterxml.jackson.core.json.JsonWriteContext;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import java.io.InputStream;

public abstract class GeneratorBase extends JsonGenerator
{

    protected static final int DERIVED_FEATURES_MASK;
    public boolean _cfgNumbersAsStrings;
    protected boolean _closed;
    protected int _features;
    protected ObjectCodec _objectCodec;
    public JsonWriteContext _writeContext;

    public GeneratorBase(int i, ObjectCodec objectcodec)
    {
        _features = i;
        DupDetector dupdetector;
        if (com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION.enabledIn(i))
        {
            dupdetector = DupDetector.rootDetector(this);
        } else
        {
            dupdetector = null;
        }
        _writeContext = JsonWriteContext.createRootContext(dupdetector);
        _objectCodec = objectcodec;
        _cfgNumbersAsStrings = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.enabledIn(i);
    }

    public abstract void _releaseBuffers();

    public abstract void _verifyValueWrite(String s);

    public void close()
    {
        _closed = true;
    }

    public JsonGenerator disable(com.fasterxml.jackson.core.JsonGenerator.Feature feature)
    {
        int i = feature.getMask();
        _features = _features & ~i;
        if ((i & DERIVED_FEATURES_MASK) != 0)
        {
            if (feature == com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS)
            {
                _cfgNumbersAsStrings = false;
            } else
            if (feature == com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII)
            {
                setHighestNonEscapedChar(0);
                return this;
            }
        }
        return this;
    }

    public JsonGenerator enable(com.fasterxml.jackson.core.JsonGenerator.Feature feature)
    {
        int i = feature.getMask();
        _features = _features | i;
        if ((i & DERIVED_FEATURES_MASK) != 0)
        {
            if (feature == com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS)
            {
                _cfgNumbersAsStrings = true;
            } else
            if (feature == com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII)
            {
                setHighestNonEscapedChar(127);
                return this;
            }
        }
        return this;
    }

    public final JsonWriteContext getOutputContext()
    {
        return _writeContext;
    }

    public final boolean isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature feature)
    {
        return (_features & feature.getMask()) != 0;
    }

    public JsonGenerator useDefaultPrettyPrinter()
    {
        if (getPrettyPrinter() != null)
        {
            return this;
        } else
        {
            return setPrettyPrinter(new DefaultPrettyPrinter());
        }
    }

    public int writeBinary(Base64Variant base64variant, InputStream inputstream, int i)
    {
        _reportUnsupportedOperation();
        return 0;
    }

    public void writeFieldName(SerializableString serializablestring)
    {
        writeFieldName(serializablestring.getValue());
    }

    public void writeObject(Object obj)
    {
        if (obj == null)
        {
            writeNull();
            return;
        }
        if (_objectCodec != null)
        {
            _objectCodec.writeValue(this, obj);
            return;
        } else
        {
            _writeSimpleObject(obj);
            return;
        }
    }

    public void writeRawValue(String s)
    {
        _verifyValueWrite("write raw value");
        writeRaw(s);
    }

    public void writeString(SerializableString serializablestring)
    {
        writeString(serializablestring.getValue());
    }

    static 
    {
        DERIVED_FEATURES_MASK = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.getMask() | com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII.getMask();
    }
}
