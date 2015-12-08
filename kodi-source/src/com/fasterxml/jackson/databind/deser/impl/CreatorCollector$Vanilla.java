// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

// Referenced classes of package com.fasterxml.jackson.databind.deser.impl:
//            CreatorCollector

protected static final class _type extends ValueInstantiator
    implements Serializable
{

    private final int _type;

    public boolean canCreateUsingDefault()
    {
        return true;
    }

    public boolean canInstantiate()
    {
        return true;
    }

    public Object createUsingDefault(DeserializationContext deserializationcontext)
        throws IOException
    {
        switch (_type)
        {
        default:
            throw new IllegalStateException((new StringBuilder()).append("Unknown type ").append(_type).toString());

        case 1: // '\001'
            return new ArrayList();

        case 2: // '\002'
            return new LinkedHashMap();

        case 3: // '\003'
            return new HashMap();
        }
    }

    public String getValueTypeDesc()
    {
        switch (_type)
        {
        default:
            return java/lang/Object.getName();

        case 1: // '\001'
            return java/util/ArrayList.getName();

        case 2: // '\002'
            return java/util/LinkedHashMap.getName();

        case 3: // '\003'
            return java/util/HashMap.getName();
        }
    }

    public (int i)
    {
        _type = i;
    }
}
