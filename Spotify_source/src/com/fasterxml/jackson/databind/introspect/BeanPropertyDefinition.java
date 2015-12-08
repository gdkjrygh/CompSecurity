// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;

// Referenced classes of package com.fasterxml.jackson.databind.introspect:
//            ObjectIdInfo, AnnotatedMember, AnnotatedParameter, AnnotatedField, 
//            AnnotatedMethod

public abstract class BeanPropertyDefinition
{

    public BeanPropertyDefinition()
    {
    }

    public boolean couldDeserialize()
    {
        return getMutator() != null;
    }

    public ObjectIdInfo findObjectIdInfo()
    {
        return null;
    }

    public com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty findReferenceType()
    {
        return null;
    }

    public Class[] findViews()
    {
        return null;
    }

    public abstract AnnotatedMember getAccessor();

    public abstract AnnotatedParameter getConstructorParameter();

    public abstract AnnotatedField getField();

    public abstract PropertyName getFullName();

    public abstract AnnotatedMethod getGetter();

    public abstract PropertyMetadata getMetadata();

    public abstract AnnotatedMember getMutator();

    public abstract String getName();

    public abstract AnnotatedMember getNonConstructorMutator();

    public AnnotatedMember getPrimaryMember()
    {
        return null;
    }

    public abstract AnnotatedMethod getSetter();

    public abstract PropertyName getWrapperName();

    public abstract boolean hasConstructorParameter();

    public abstract boolean hasField();

    public abstract boolean hasGetter();

    public abstract boolean hasSetter();

    public abstract boolean isExplicitlyIncluded();

    public boolean isExplicitlyNamed()
    {
        return isExplicitlyIncluded();
    }

    public boolean isTypeId()
    {
        return false;
    }
}
