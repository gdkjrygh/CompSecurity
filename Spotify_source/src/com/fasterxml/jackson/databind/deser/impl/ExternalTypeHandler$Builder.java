// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.fasterxml.jackson.databind.deser.impl:
//            ExternalTypeHandler

public class Property
{

    private final HashMap _nameToPropertyIndex = new HashMap();
    private final ArrayList _properties = new ArrayList();

    public void addExternal(SettableBeanProperty settablebeanproperty, TypeDeserializer typedeserializer)
    {
        Integer integer = Integer.valueOf(_properties.size());
        _properties.add(new Property(settablebeanproperty, typedeserializer));
        _nameToPropertyIndex.put(settablebeanproperty.getName(), integer);
        _nameToPropertyIndex.put(typedeserializer.getPropertyName(), integer);
    }

    public ExternalTypeHandler build()
    {
        return new ExternalTypeHandler((Property[])_properties.toArray(new Property[_properties.size()]), _nameToPropertyIndex, null, null);
    }

    public Property()
    {
    }
}
