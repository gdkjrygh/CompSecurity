// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.SettableAnyProperty;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.deser.impl:
//            ObjectIdReader, ReadableObjectId, PropertyValue

public final class PropertyValueBuffer
{

    private PropertyValue _buffered;
    protected final DeserializationContext _context;
    protected final Object _creatorParameters[];
    private Object _idValue;
    protected final ObjectIdReader _objectIdReader;
    private int _paramsNeeded;
    protected final JsonParser _parser;

    public PropertyValueBuffer(JsonParser jsonparser, DeserializationContext deserializationcontext, int i, ObjectIdReader objectidreader)
    {
        _parser = jsonparser;
        _context = deserializationcontext;
        _paramsNeeded = i;
        _objectIdReader = objectidreader;
        _creatorParameters = new Object[i];
    }

    public boolean assignParameter(int i, Object obj)
    {
        _creatorParameters[i] = obj;
        i = _paramsNeeded - 1;
        _paramsNeeded = i;
        return i <= 0;
    }

    public void bufferAnyProperty(SettableAnyProperty settableanyproperty, String s, Object obj)
    {
        _buffered = new PropertyValue.Any(_buffered, obj, settableanyproperty, s);
    }

    public void bufferMapProperty(Object obj, Object obj1)
    {
        _buffered = new PropertyValue.Map(_buffered, obj1, obj);
    }

    public void bufferProperty(SettableBeanProperty settablebeanproperty, Object obj)
    {
        _buffered = new PropertyValue.Regular(_buffered, obj, settablebeanproperty);
    }

    protected PropertyValue buffered()
    {
        return _buffered;
    }

    protected final Object[] getParameters(Object aobj[])
    {
        if (aobj != null)
        {
            int i = 0;
            for (int j = _creatorParameters.length; i < j; i++)
            {
                if (_creatorParameters[i] != null)
                {
                    continue;
                }
                Object obj = aobj[i];
                if (obj != null)
                {
                    _creatorParameters[i] = obj;
                }
            }

        }
        return _creatorParameters;
    }

    public Object handleIdValue(DeserializationContext deserializationcontext, Object obj)
        throws IOException
    {
label0:
        {
            Object obj1 = obj;
            if (_objectIdReader != null)
            {
                if (_idValue == null)
                {
                    break label0;
                }
                deserializationcontext.findObjectId(_idValue, _objectIdReader.generator, _objectIdReader.resolver).bindItem(obj);
                deserializationcontext = _objectIdReader.idProperty;
                obj1 = obj;
                if (deserializationcontext != null)
                {
                    obj1 = deserializationcontext.setAndReturn(obj, _idValue);
                }
            }
            return obj1;
        }
        throw deserializationcontext.mappingException((new StringBuilder()).append("No _idValue when handleIdValue called, on instance of ").append(obj.getClass().getName()).toString());
    }

    public void inject(SettableBeanProperty asettablebeanproperty[])
    {
        int i = 0;
        for (int j = asettablebeanproperty.length; i < j; i++)
        {
            SettableBeanProperty settablebeanproperty = asettablebeanproperty[i];
            if (settablebeanproperty != null)
            {
                _creatorParameters[i] = _context.findInjectableValue(settablebeanproperty.getInjectableValueId(), settablebeanproperty, null);
            }
        }

    }

    public boolean readIdProperty(String s)
        throws IOException
    {
        if (_objectIdReader != null && s.equals(_objectIdReader.propertyName.getSimpleName()))
        {
            _idValue = _objectIdReader.readObjectReference(_parser, _context);
            return true;
        } else
        {
            return false;
        }
    }
}
