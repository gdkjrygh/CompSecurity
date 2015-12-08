// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.fasterxml.jackson.databind.util:
//            EmptyIterator

public class SimpleBeanPropertyDefinition extends BeanPropertyDefinition
{

    protected final PropertyName _fullName;
    protected final com.fasterxml.jackson.annotation.JsonInclude.Include _inclusion;
    protected final AnnotationIntrospector _introspector;
    protected final AnnotatedMember _member;
    protected final PropertyMetadata _metadata;
    protected final String _name;

    protected SimpleBeanPropertyDefinition(AnnotatedMember annotatedmember, PropertyName propertyname, AnnotationIntrospector annotationintrospector, PropertyMetadata propertymetadata, com.fasterxml.jackson.annotation.JsonInclude.Include include)
    {
        _introspector = annotationintrospector;
        _member = annotatedmember;
        _fullName = propertyname;
        _name = propertyname.getSimpleName();
        annotatedmember = propertymetadata;
        if (propertymetadata == null)
        {
            annotatedmember = PropertyMetadata.STD_OPTIONAL;
        }
        _metadata = annotatedmember;
        _inclusion = include;
    }

    public static SimpleBeanPropertyDefinition construct(MapperConfig mapperconfig, AnnotatedMember annotatedmember)
    {
        PropertyName propertyname = new PropertyName(annotatedmember.getName());
        if (mapperconfig == null)
        {
            mapperconfig = null;
        } else
        {
            mapperconfig = mapperconfig.getAnnotationIntrospector();
        }
        return new SimpleBeanPropertyDefinition(annotatedmember, propertyname, mapperconfig, null, null);
    }

    public static SimpleBeanPropertyDefinition construct(MapperConfig mapperconfig, AnnotatedMember annotatedmember, PropertyName propertyname)
    {
        return construct(mapperconfig, annotatedmember, propertyname, null, null);
    }

    public static SimpleBeanPropertyDefinition construct(MapperConfig mapperconfig, AnnotatedMember annotatedmember, PropertyName propertyname, PropertyMetadata propertymetadata, com.fasterxml.jackson.annotation.JsonInclude.Include include)
    {
        if (mapperconfig == null)
        {
            mapperconfig = null;
        } else
        {
            mapperconfig = mapperconfig.getAnnotationIntrospector();
        }
        return new SimpleBeanPropertyDefinition(annotatedmember, propertyname, mapperconfig, propertymetadata, include);
    }

    public com.fasterxml.jackson.annotation.JsonInclude.Include findInclusion()
    {
        return _inclusion;
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

    public Iterator getConstructorParameters()
    {
        AnnotatedParameter annotatedparameter = getConstructorParameter();
        if (annotatedparameter == null)
        {
            return EmptyIterator.instance();
        } else
        {
            return Collections.singleton(annotatedparameter).iterator();
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

    public PropertyName getFullName()
    {
        return _fullName;
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

    public PropertyMetadata getMetadata()
    {
        return _metadata;
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
        return _fullName.getSimpleName();
    }

    public AnnotatedMember getNonConstructorMutator()
    {
        AnnotatedMethod annotatedmethod = getSetter();
        Object obj = annotatedmethod;
        if (annotatedmethod == null)
        {
            obj = getField();
        }
        return ((AnnotatedMember) (obj));
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

    public PropertyName getWrapperName()
    {
        if (_introspector == null && _member != null)
        {
            return null;
        } else
        {
            return _introspector.findWrapperName(_member);
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

    public boolean isExplicitlyNamed()
    {
        return false;
    }
}
