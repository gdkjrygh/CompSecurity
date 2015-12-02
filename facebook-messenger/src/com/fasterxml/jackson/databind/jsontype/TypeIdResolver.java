// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.jsontype;

import com.fasterxml.jackson.databind.JavaType;

public interface TypeIdResolver
{

    public abstract com.fasterxml.jackson.annotation.JsonTypeInfo.Id getMechanism();

    public abstract String idFromBaseType();

    public abstract String idFromValue(Object obj);

    public abstract String idFromValueAndType(Object obj, Class class1);

    public abstract void init(JavaType javatype);

    public abstract JavaType typeFromId(String s);
}
