// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;

// Referenced classes of package com.fasterxml.jackson.databind:
//            JsonMappingException, RuntimeJsonMappingException, JsonDeserializer, DeserializationContext, 
//            JavaType

public class MappingIterator
    implements Iterator
{

    protected static final MappingIterator EMPTY_ITERATOR = new MappingIterator(null, null, null, null, false, null);
    protected final boolean _closeParser;
    protected final DeserializationContext _context;
    protected final JsonDeserializer _deserializer;
    protected boolean _hasNextChecked;
    protected JsonParser _parser;
    protected final JavaType _type;
    protected final Object _updatedValue;

    protected MappingIterator(JavaType javatype, JsonParser jsonparser, DeserializationContext deserializationcontext, JsonDeserializer jsondeserializer)
    {
        this(javatype, jsonparser, deserializationcontext, jsondeserializer, true, null);
    }

    protected MappingIterator(JavaType javatype, JsonParser jsonparser, DeserializationContext deserializationcontext, JsonDeserializer jsondeserializer, boolean flag, Object obj)
    {
        _type = javatype;
        _parser = jsonparser;
        _context = deserializationcontext;
        _deserializer = jsondeserializer;
        if (jsonparser != null && jsonparser.getCurrentToken() == JsonToken.START_ARRAY && !jsonparser.getParsingContext().inRoot())
        {
            jsonparser.clearCurrentToken();
        }
        _closeParser = flag;
        if (obj == null)
        {
            _updatedValue = null;
            return;
        } else
        {
            _updatedValue = obj;
            return;
        }
    }

    protected static MappingIterator emptyIterator()
    {
        return EMPTY_ITERATOR;
    }

    public boolean hasNext()
    {
        boolean flag;
        try
        {
            flag = hasNextValue();
        }
        catch (JsonMappingException jsonmappingexception)
        {
            throw new RuntimeJsonMappingException(jsonmappingexception.getMessage(), jsonmappingexception);
        }
        catch (IOException ioexception)
        {
            throw new RuntimeException(ioexception.getMessage(), ioexception);
        }
        return flag;
    }

    public boolean hasNextValue()
    {
        if (_parser != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Object obj;
        if (_hasNextChecked)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = _parser.getCurrentToken();
        _hasNextChecked = true;
        if (obj != null)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = _parser.nextToken();
        if (obj != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = _parser;
        _parser = null;
        if (!_closeParser) goto _L1; else goto _L3
_L3:
        ((JsonParser) (obj)).close();
        return false;
        if (obj == JsonToken.END_ARRAY) goto _L1; else goto _L4
_L4:
        return true;
    }

    public Object next()
    {
        Object obj;
        try
        {
            obj = nextValue();
        }
        catch (JsonMappingException jsonmappingexception)
        {
            throw new RuntimeJsonMappingException(jsonmappingexception.getMessage(), jsonmappingexception);
        }
        catch (IOException ioexception)
        {
            throw new RuntimeException(ioexception.getMessage(), ioexception);
        }
        return obj;
    }

    public Object nextValue()
    {
        if (!_hasNextChecked && !hasNextValue())
        {
            throw new NoSuchElementException();
        }
        if (_parser == null)
        {
            throw new NoSuchElementException();
        }
        _hasNextChecked = false;
        Object obj;
        if (_updatedValue == null)
        {
            obj = _deserializer.deserialize(_parser, _context);
        } else
        {
            _deserializer.deserialize(_parser, _context, _updatedValue);
            obj = _updatedValue;
        }
        _parser.clearCurrentToken();
        return obj;
    }

    public void remove()
    {
        throw new UnsupportedOperationException();
    }

}
