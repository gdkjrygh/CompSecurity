// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.deser.SettableAnyProperty;

// Referenced classes of package com.fasterxml.jackson.databind.deser.impl:
//            PropertyValue

final class _propertyName extends PropertyValue
{

    final SettableAnyProperty _property;
    final String _propertyName;

    public void assign(Object obj)
    {
        _property.set(obj, _propertyName, value);
    }

    public A(PropertyValue propertyvalue, Object obj, SettableAnyProperty settableanyproperty, String s)
    {
        super(propertyvalue, obj);
        _property = settableanyproperty;
        _propertyName = s;
    }
}
