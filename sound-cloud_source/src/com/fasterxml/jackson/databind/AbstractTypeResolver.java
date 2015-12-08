// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind;


// Referenced classes of package com.fasterxml.jackson.databind:
//            DeserializationConfig, JavaType

public abstract class AbstractTypeResolver
{

    public AbstractTypeResolver()
    {
    }

    public JavaType findTypeMapping(DeserializationConfig deserializationconfig, JavaType javatype)
    {
        return null;
    }

    public JavaType resolveAbstractType(DeserializationConfig deserializationconfig, JavaType javatype)
    {
        return null;
    }
}
