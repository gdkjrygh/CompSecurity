// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;

public class PropertyBasedObjectIdGenerator extends com.fasterxml.jackson.annotation.ObjectIdGenerators.PropertyGenerator
{

    protected final BeanPropertyWriter _property;

    public PropertyBasedObjectIdGenerator(ObjectIdInfo objectidinfo, BeanPropertyWriter beanpropertywriter)
    {
        this(objectidinfo.getScope(), beanpropertywriter);
    }

    protected PropertyBasedObjectIdGenerator(Class class1, BeanPropertyWriter beanpropertywriter)
    {
        super(class1);
        _property = beanpropertywriter;
    }

    public boolean canUseFor(ObjectIdGenerator objectidgenerator)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (objectidgenerator.getClass() == getClass())
        {
            objectidgenerator = (PropertyBasedObjectIdGenerator)objectidgenerator;
            flag = flag1;
            if (objectidgenerator.getScope() == _scope)
            {
                flag = flag1;
                if (((PropertyBasedObjectIdGenerator) (objectidgenerator))._property == _property)
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public ObjectIdGenerator forScope(Class class1)
    {
        if (class1 == _scope)
        {
            return this;
        } else
        {
            return new PropertyBasedObjectIdGenerator(class1, _property);
        }
    }

    public Object generateId(Object obj)
    {
        try
        {
            obj = _property.get(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new IllegalStateException((new StringBuilder()).append("Problem accessing property '").append(_property.getName()).append("': ").append(((Exception) (obj)).getMessage()).toString(), ((Throwable) (obj)));
        }
        return obj;
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
