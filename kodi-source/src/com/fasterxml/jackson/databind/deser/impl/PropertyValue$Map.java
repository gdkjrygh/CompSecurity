// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.IOException;
import java.util.Map;

// Referenced classes of package com.fasterxml.jackson.databind.deser.impl:
//            PropertyValue

static final class _key extends PropertyValue
{

    final Object _key;

    public void assign(Object obj)
        throws IOException, JsonProcessingException
    {
        ((Map)obj).put(_key, value);
    }

    public A(PropertyValue propertyvalue, Object obj, Object obj1)
    {
        super(propertyvalue, obj);
        _key = obj1;
    }
}
