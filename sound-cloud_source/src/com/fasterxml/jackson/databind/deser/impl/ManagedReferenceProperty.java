// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.util.Annotations;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public final class ManagedReferenceProperty extends SettableBeanProperty
{

    protected final SettableBeanProperty _backProperty;
    protected final boolean _isContainer;
    protected final SettableBeanProperty _managedProperty;
    protected final String _referenceName;

    public ManagedReferenceProperty(SettableBeanProperty settablebeanproperty, String s, SettableBeanProperty settablebeanproperty1, Annotations annotations, boolean flag)
    {
        super(settablebeanproperty.getName(), settablebeanproperty.getType(), settablebeanproperty.getValueTypeDeserializer(), annotations);
        _referenceName = s;
        _managedProperty = settablebeanproperty;
        _backProperty = settablebeanproperty1;
        _isContainer = flag;
    }

    protected ManagedReferenceProperty(ManagedReferenceProperty managedreferenceproperty, JsonDeserializer jsondeserializer)
    {
        super(managedreferenceproperty, jsondeserializer);
        _referenceName = managedreferenceproperty._referenceName;
        _isContainer = managedreferenceproperty._isContainer;
        _managedProperty = managedreferenceproperty._managedProperty;
        _backProperty = managedreferenceproperty._backProperty;
    }

    protected ManagedReferenceProperty(ManagedReferenceProperty managedreferenceproperty, String s)
    {
        super(managedreferenceproperty, s);
        _referenceName = managedreferenceproperty._referenceName;
        _isContainer = managedreferenceproperty._isContainer;
        _managedProperty = managedreferenceproperty._managedProperty;
        _backProperty = managedreferenceproperty._backProperty;
    }

    public final void deserializeAndSet(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
        throws IOException, JsonProcessingException
    {
        set(obj, _managedProperty.deserialize(jsonparser, deserializationcontext));
    }

    public final Object deserializeSetAndReturn(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
        throws IOException, JsonProcessingException
    {
        return setAndReturn(obj, deserialize(jsonparser, deserializationcontext));
    }

    public final AnnotatedMember getMember()
    {
        return _managedProperty.getMember();
    }

    public final void set(Object obj, Object obj1)
        throws IOException
    {
        setAndReturn(obj, obj1);
    }

    public final Object setAndReturn(Object obj, Object obj1)
        throws IOException
    {
        Object obj2 = _managedProperty.setAndReturn(obj, obj1);
        if (obj1 != null)
        {
            if (_isContainer)
            {
                if (obj1 instanceof Object[])
                {
                    obj1 = ((Object) ((Object[])(Object[])obj1));
                    int j = obj1.length;
                    for (int i = 0; i < j; i++)
                    {
                        Object obj3 = obj1[i];
                        if (obj3 != null)
                        {
                            _backProperty.set(obj3, obj);
                        }
                    }

                } else
                if (obj1 instanceof Collection)
                {
                    obj1 = ((Collection)obj1).iterator();
                    do
                    {
                        if (!((Iterator) (obj1)).hasNext())
                        {
                            break;
                        }
                        Object obj4 = ((Iterator) (obj1)).next();
                        if (obj4 != null)
                        {
                            _backProperty.set(obj4, obj);
                        }
                    } while (true);
                } else
                if (obj1 instanceof Map)
                {
                    obj1 = ((Map)obj1).values().iterator();
                    do
                    {
                        if (!((Iterator) (obj1)).hasNext())
                        {
                            break;
                        }
                        Object obj5 = ((Iterator) (obj1)).next();
                        if (obj5 != null)
                        {
                            _backProperty.set(obj5, obj);
                        }
                    } while (true);
                } else
                {
                    throw new IllegalStateException((new StringBuilder("Unsupported container type (")).append(obj1.getClass().getName()).append(") when resolving reference '").append(_referenceName).append("'").toString());
                }
            } else
            {
                _backProperty.set(obj1, obj);
            }
        }
        return obj2;
    }

    public final volatile SettableBeanProperty withName(String s)
    {
        return withName(s);
    }

    public final ManagedReferenceProperty withName(String s)
    {
        return new ManagedReferenceProperty(this, s);
    }

    public final volatile SettableBeanProperty withValueDeserializer(JsonDeserializer jsondeserializer)
    {
        return withValueDeserializer(jsondeserializer);
    }

    public final ManagedReferenceProperty withValueDeserializer(JsonDeserializer jsondeserializer)
    {
        return new ManagedReferenceProperty(this, jsondeserializer);
    }
}
