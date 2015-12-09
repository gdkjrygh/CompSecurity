// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.introspect;

import java.io.Serializable;
import java.lang.reflect.Method;

final class args
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    protected Class args[];
    protected Class clazz;
    protected String name;

    public (Method method)
    {
        clazz = method.getDeclaringClass();
        name = method.getName();
        args = method.getParameterTypes();
    }
}
