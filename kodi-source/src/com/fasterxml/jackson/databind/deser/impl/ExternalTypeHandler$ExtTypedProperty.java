// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;

// Referenced classes of package com.fasterxml.jackson.databind.deser.impl:
//            ExternalTypeHandler

private static final class _typePropertyName
{

    private final SettableBeanProperty _property;
    private final TypeDeserializer _typeDeserializer;
    private final String _typePropertyName;

    public String getDefaultTypeId()
    {
        Class class1 = _typeDeserializer.getDefaultImpl();
        if (class1 == null)
        {
            return null;
        } else
        {
            return _typeDeserializer.getTypeIdResolver().idFromValueAndType(null, class1);
        }
    }

    public SettableBeanProperty getProperty()
    {
        return _property;
    }

    public String getTypePropertyName()
    {
        return _typePropertyName;
    }

    public boolean hasDefaultType()
    {
        return _typeDeserializer.getDefaultImpl() != null;
    }

    public boolean hasTypePropertyName(String s)
    {
        return s.equals(_typePropertyName);
    }

    public (SettableBeanProperty settablebeanproperty, TypeDeserializer typedeserializer)
    {
        _property = settablebeanproperty;
        _typeDeserializer = typedeserializer;
        _typePropertyName = typedeserializer.getPropertyName();
    }
}
