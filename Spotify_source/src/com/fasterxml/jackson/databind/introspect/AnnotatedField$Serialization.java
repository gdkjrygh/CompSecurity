// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.introspect;

import java.io.Serializable;
import java.lang.reflect.Field;

final class name
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    protected Class clazz;
    protected String name;

    public (Field field)
    {
        clazz = field.getDeclaringClass();
        name = field.getName();
    }
}
