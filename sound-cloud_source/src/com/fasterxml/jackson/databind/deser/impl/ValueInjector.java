// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.util.Annotations;
import java.io.IOException;

public class ValueInjector extends com.fasterxml.jackson.databind.BeanProperty.Std
{

    protected final Object _valueId;

    public ValueInjector(String s, JavaType javatype, Annotations annotations, AnnotatedMember annotatedmember, Object obj)
    {
        super(s, javatype, annotations, annotatedmember);
        _valueId = obj;
    }

    public Object findValue(DeserializationContext deserializationcontext, Object obj)
    {
        return deserializationcontext.findInjectableValue(_valueId, this, obj);
    }

    public void inject(DeserializationContext deserializationcontext, Object obj)
        throws IOException
    {
        _member.setValue(obj, findValue(deserializationcontext, obj));
    }
}
