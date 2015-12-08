// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;

public class SimpleBeanPropertyDefinition extends BeanPropertyDefinition
{

    protected final AnnotatedMember _member;
    protected final String _name;

    public SimpleBeanPropertyDefinition(AnnotatedMember annotatedmember)
    {
        this(annotatedmember, annotatedmember.getName());
    }

    public SimpleBeanPropertyDefinition(AnnotatedMember annotatedmember, String s)
    {
        _member = annotatedmember;
        _name = s;
    }

    public AnnotatedMember getAccessor()
    {
        AnnotatedMethod annotatedmethod = getGetter();
        Object obj = annotatedmethod;
        if (annotatedmethod == null)
        {
            obj = getField();
        }
        return ((AnnotatedMember) (obj));
    }

    public AnnotatedParameter getConstructorParameter()
    {
        if (_member instanceof AnnotatedParameter)
        {
            return (AnnotatedParameter)_member;
        } else
        {
            return null;
        }
    }

    public AnnotatedField getField()
    {
        if (_member instanceof AnnotatedField)
        {
            return (AnnotatedField)_member;
        } else
        {
            return null;
        }
    }

    public AnnotatedMethod getGetter()
    {
        if ((_member instanceof AnnotatedMethod) && ((AnnotatedMethod)_member).getParameterCount() == 0)
        {
            return (AnnotatedMethod)_member;
        } else
        {
            return null;
        }
    }

    public AnnotatedMember getMutator()
    {
        AnnotatedParameter annotatedparameter = getConstructorParameter();
        Object obj = annotatedparameter;
        if (annotatedparameter == null)
        {
            AnnotatedMethod annotatedmethod = getSetter();
            obj = annotatedmethod;
            if (annotatedmethod == null)
            {
                obj = getField();
            }
        }
        return ((AnnotatedMember) (obj));
    }

    public String getName()
    {
        return _name;
    }

    public AnnotatedMember getPrimaryMember()
    {
        return _member;
    }

    public AnnotatedMethod getSetter()
    {
        if ((_member instanceof AnnotatedMethod) && ((AnnotatedMethod)_member).getParameterCount() == 1)
        {
            return (AnnotatedMethod)_member;
        } else
        {
            return null;
        }
    }

    public boolean hasConstructorParameter()
    {
        return _member instanceof AnnotatedParameter;
    }

    public boolean hasField()
    {
        return _member instanceof AnnotatedField;
    }

    public boolean hasGetter()
    {
        return getGetter() != null;
    }

    public boolean hasSetter()
    {
        return getSetter() != null;
    }

    public boolean isExplicitlyIncluded()
    {
        return false;
    }
}
