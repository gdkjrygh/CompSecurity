// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.datatype.guava;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.type.TypeModifier;
import com.google.common.a.iw;
import java.lang.reflect.Type;

public class MultimapTypeModifier extends TypeModifier
{

    public MultimapTypeModifier()
    {
    }

    public JavaType modifyType(JavaType javatype, Type type, TypeBindings typebindings, TypeFactory typefactory)
    {
        type = javatype;
        if (com/google/common/a/iw.isAssignableFrom(javatype.getRawClass()))
        {
            typebindings = javatype.containedType(0);
            JavaType javatype1 = javatype.containedType(1);
            type = typebindings;
            if (typebindings == null)
            {
                type = typefactory.constructType(java/lang/String);
            }
            typebindings = javatype1;
            if (javatype1 == null)
            {
                typebindings = typefactory.constructType(java/lang/Object);
            }
            type = typefactory.constructMapLikeType(javatype.getRawClass(), type, typebindings);
        }
        return type;
    }
}
