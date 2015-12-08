// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import java.io.Serializable;

public abstract class NopAnnotationIntrospector extends AnnotationIntrospector
    implements Serializable
{

    public static final NopAnnotationIntrospector instance = new NopAnnotationIntrospector() {

    };

    public NopAnnotationIntrospector()
    {
    }

}
