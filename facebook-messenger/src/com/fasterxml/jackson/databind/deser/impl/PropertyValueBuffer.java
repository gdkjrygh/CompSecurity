// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.SettableAnyProperty;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;

// Referenced classes of package com.fasterxml.jackson.databind.deser.impl:
//            PropertyValue

public final class PropertyValueBuffer
{

    private PropertyValue _buffered;
    protected final DeserializationContext _context;
    protected final Object _creatorParameters[];
    private int _paramsNeeded;
    protected final JsonParser _parser;

    public PropertyValueBuffer(JsonParser jsonparser, DeserializationContext deserializationcontext, int i)
    {
        _parser = jsonparser;
        _context = deserializationcontext;
        _paramsNeeded = i;
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

    public boolean isComplete()
    {
        return _paramsNeeded <= 0;
    }
}
