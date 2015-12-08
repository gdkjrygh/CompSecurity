// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.deser.impl:
//            PropertyValue

static final class _property extends PropertyValue
{

    final SettableBeanProperty _property;

    public void assign(Object obj)
        throws IOException, JsonProcessingException
    {
        _property.set(obj, value);
    }

    public (PropertyValue propertyvalue, Object obj, SettableBeanProperty settablebeanproperty)
    {
        super(propertyvalue, obj);
        _property = settablebeanproperty;
    }
}
