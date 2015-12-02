// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.introspect;


public class ObjectIdInfo
{

    protected final Class _generator;
    protected final String _propertyName;
    protected final Class _scope;

    public ObjectIdInfo(String s, Class class1, Class class2)
    {
        _propertyName = s;
        _generator = class2;
        _scope = class1;
    }

    public Class getGeneratorType()
    {
        return _generator;
    }

    public String getPropertyName()
    {
        return _propertyName;
    }

    public Class getScope()
    {
        return _scope;
    }
}
