// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.jsontype;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import java.util.Collection;

public abstract class SubtypeResolver
{

    public SubtypeResolver()
    {
    }

    public abstract Collection collectAndResolveSubtypes(AnnotatedClass annotatedclass, MapperConfig mapperconfig, AnnotationIntrospector annotationintrospector);

    public abstract Collection collectAndResolveSubtypes(AnnotatedMember annotatedmember, MapperConfig mapperconfig, AnnotationIntrospector annotationintrospector, JavaType javatype);
}
