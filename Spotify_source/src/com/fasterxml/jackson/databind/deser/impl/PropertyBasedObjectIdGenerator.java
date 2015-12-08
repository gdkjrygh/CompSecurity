// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;

public class PropertyBasedObjectIdGenerator extends com.fasterxml.jackson.annotation.ObjectIdGenerators.PropertyGenerator
{

    private static final long serialVersionUID = 1L;

    public PropertyBasedObjectIdGenerator(Class class1)
    {
        super(class1);
    }

    public ObjectIdGenerator forScope(Class class1)
    {
        if (class1 == _scope)
        {
            return this;
        } else
        {
            return new PropertyBasedObjectIdGenerator(class1);
        }
    }

    public Object generateId(Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public com.fasterxml.jackson.annotation.ObjectIdGenerator.IdKey key(Object obj)
    {
        return new com.fasterxml.jackson.annotation.ObjectIdGenerator.IdKey(getClass(), _scope, obj);
    }

    public ObjectIdGenerator newForSerialization(Object obj)
    {
        return this;
    }
}
