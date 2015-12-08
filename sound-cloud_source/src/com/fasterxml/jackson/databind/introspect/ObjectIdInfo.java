// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.introspect;


public class ObjectIdInfo
{

    protected final boolean _alwaysAsId;
    protected final Class _generator;
    protected final String _propertyName;
    protected final Class _scope;

    public ObjectIdInfo(String s, Class class1, Class class2)
    {
        this(s, class1, class2, false);
    }

    protected ObjectIdInfo(String s, Class class1, Class class2, boolean flag)
    {
        _propertyName = s;
        _scope = class1;
        _generator = class2;
        _alwaysAsId = flag;
    }

    public boolean getAlwaysAsId()
    {
        return _alwaysAsId;
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

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder("ObjectIdInfo: propName=")).append(_propertyName).append(", scope=");
        String s;
        if (_scope == null)
        {
            s = "null";
        } else
        {
            s = _scope.getName();
        }
        stringbuilder = stringbuilder.append(s).append(", generatorType=");
        if (_generator == null)
        {
            s = "null";
        } else
        {
            s = _generator.getName();
        }
        return stringbuilder.append(s).append(", alwaysAsId=").append(_alwaysAsId).toString();
    }

    public ObjectIdInfo withAlwaysAsId(boolean flag)
    {
        if (_alwaysAsId == flag)
        {
            return this;
        } else
        {
            return new ObjectIdInfo(_propertyName, _scope, _generator, flag);
        }
    }
}
