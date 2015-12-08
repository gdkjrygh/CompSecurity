// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.util.Annotations;

// Referenced classes of package com.fasterxml.jackson.databind:
//            BeanProperty, PropertyMetadata, PropertyName, JavaType

public class _contextAnnotations
    implements BeanProperty
{

    protected final Annotations _contextAnnotations;
    public final AnnotatedMember _member;
    protected final PropertyMetadata _metadata;
    protected final PropertyName _name;
    protected final JavaType _type;
    protected final PropertyName _wrapperName;

    public AnnotatedMember getMember()
    {
        return _member;
    }

    public JavaType getType()
    {
        return _type;
    }

    public PropertyName getWrapperName()
    {
        return _wrapperName;
    }

    public _wrapperName withType(JavaType javatype)
    {
        return new <init>(_name, javatype, _wrapperName, _contextAnnotations, _member, _metadata);
    }

    public tedMember(PropertyName propertyname, JavaType javatype, PropertyName propertyname1, Annotations annotations, AnnotatedMember annotatedmember, PropertyMetadata propertymetadata)
    {
        _name = propertyname;
        _type = javatype;
        _wrapperName = propertyname1;
        _metadata = propertymetadata;
        _member = annotatedmember;
        _contextAnnotations = annotations;
    }
}
