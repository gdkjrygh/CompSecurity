// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;

public abstract class _beanType
{

    private final Class _beanType;
    private final UnresolvedForwardReference _reference;

    public Class getBeanType()
    {
        return _beanType;
    }

    public JsonLocation getLocation()
    {
        return _reference.getLocation();
    }

    public abstract void handleResolvedForwardReference(Object obj, Object obj1);

    public boolean hasId(Object obj)
    {
        return obj.equals(_reference.getUnresolvedId());
    }

    public (UnresolvedForwardReference unresolvedforwardreference, Class class1)
    {
        _reference = unresolvedforwardreference;
        _beanType = class1;
    }
}
