// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.deser.SettableBeanProperty;

// Referenced classes of package com.fasterxml.jackson.databind.deser.impl:
//            PropertyValue

final class _property extends PropertyValue
{

    final SettableBeanProperty _property;

    public void assign(Object obj)
    {
        _property.set(obj, value);
    }

    public (PropertyValue propertyvalue, Object obj, SettableBeanProperty settablebeanproperty)
    {
        super(propertyvalue, obj);
        _property = settablebeanproperty;
    }
}
