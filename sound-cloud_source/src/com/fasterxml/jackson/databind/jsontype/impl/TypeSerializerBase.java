// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;

public abstract class TypeSerializerBase extends TypeSerializer
{

    protected final TypeIdResolver _idResolver;
    protected final BeanProperty _property;

    protected TypeSerializerBase(TypeIdResolver typeidresolver, BeanProperty beanproperty)
    {
        _idResolver = typeidresolver;
        _property = beanproperty;
    }

    protected String idFromValue(Object obj)
    {
        return _idResolver.idFromValue(obj);
    }

    protected String idFromValueAndType(Object obj, Class class1)
    {
        return _idResolver.idFromValueAndType(obj, class1);
    }
}
