// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.deser.SettableAnyProperty;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import java.io.IOException;

public abstract class PropertyValue
{
    static final class Any extends PropertyValue
    {

        final SettableAnyProperty _property;
        final String _propertyName;

        public void assign(Object obj)
            throws IOException, JsonProcessingException
        {
            _property.set(obj, _propertyName, value);
        }

        public Any(PropertyValue propertyvalue, Object obj, SettableAnyProperty settableanyproperty, String s)
        {
            super(propertyvalue, obj);
            _property = settableanyproperty;
            _propertyName = s;
        }
    }

    static final class Map extends PropertyValue
    {

        final Object _key;

        public void assign(Object obj)
            throws IOException, JsonProcessingException
        {
            ((java.util.Map)obj).put(_key, value);
        }

        public Map(PropertyValue propertyvalue, Object obj, Object obj1)
        {
            super(propertyvalue, obj);
            _key = obj1;
        }
    }

    static final class Regular extends PropertyValue
    {

        final SettableBeanProperty _property;

        public void assign(Object obj)
            throws IOException, JsonProcessingException
        {
            _property.set(obj, value);
        }

        public Regular(PropertyValue propertyvalue, Object obj, SettableBeanProperty settablebeanproperty)
        {
            super(propertyvalue, obj);
            _property = settablebeanproperty;
        }
    }


    public final PropertyValue next;
    public final Object value;

    protected PropertyValue(PropertyValue propertyvalue, Object obj)
    {
        next = propertyvalue;
        value = obj;
    }

    public abstract void assign(Object obj)
        throws IOException, JsonProcessingException;
}
