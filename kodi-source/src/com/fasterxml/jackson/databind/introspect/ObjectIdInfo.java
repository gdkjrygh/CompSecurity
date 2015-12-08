// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.SimpleObjectIdResolver;
import com.fasterxml.jackson.databind.PropertyName;

public class ObjectIdInfo
{

    protected final boolean _alwaysAsId;
    protected final Class _generator;
    protected final PropertyName _propertyName;
    protected final Class _resolver;
    protected final Class _scope;

    public ObjectIdInfo(PropertyName propertyname, Class class1, Class class2, Class class3)
    {
        this(propertyname, class1, class2, false, class3);
    }

    protected ObjectIdInfo(PropertyName propertyname, Class class1, Class class2, boolean flag, Class class3)
    {
        _propertyName = propertyname;
        _scope = class1;
        _generator = class2;
        _alwaysAsId = flag;
        propertyname = class3;
        if (class3 == null)
        {
            propertyname = com/fasterxml/jackson/annotation/SimpleObjectIdResolver;
        }
        _resolver = propertyname;
    }

    public boolean getAlwaysAsId()
    {
        return _alwaysAsId;
    }

    public Class getGeneratorType()
    {
        return _generator;
    }

    public PropertyName getPropertyName()
    {
        return _propertyName;
    }

    public Class getResolverType()
    {
        return _resolver;
    }

    public Class getScope()
    {
        return _scope;
    }

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("ObjectIdInfo: propName=").append(_propertyName).append(", scope=");
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
            return new ObjectIdInfo(_propertyName, _scope, _generator, flag, _resolver);
        }
    }
}
