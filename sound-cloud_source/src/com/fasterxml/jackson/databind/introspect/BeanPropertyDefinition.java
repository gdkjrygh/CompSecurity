// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.introspect;


// Referenced classes of package com.fasterxml.jackson.databind.introspect:
//            AnnotatedMember, AnnotatedField, AnnotatedMethod

public abstract class BeanPropertyDefinition
{

    public BeanPropertyDefinition()
    {
    }

    public boolean couldDeserialize()
    {
        return getMutator() != null;
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

    public abstract AnnotatedField getField();

    public abstract AnnotatedMethod getGetter();

    public abstract AnnotatedMember getMutator();

    public abstract String getName();

    public AnnotatedMember getPrimaryMember()
    {
        return null;
    }

    public abstract AnnotatedMethod getSetter();

    public abstract boolean hasConstructorParameter();

    public abstract boolean hasField();

    public abstract boolean hasGetter();

    public abstract boolean hasSetter();

    public abstract boolean isExplicitlyIncluded();

    public boolean isTypeId()
    {
        return false;
    }
}
