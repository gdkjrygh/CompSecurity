// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal;

import com.google.gson.JsonIOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumSet;

// Referenced classes of package com.google.gson.internal:
//            ObjectConstructor, ConstructorConstructor

class val.type
    implements ObjectConstructor
{

    final ConstructorConstructor this$0;
    final Type val$type;

    public Object construct()
    {
        if (val$type instanceof ParameterizedType)
        {
            Type type1 = ((ParameterizedType)val$type).getActualTypeArguments()[0];
            if (type1 instanceof Class)
            {
                return EnumSet.noneOf((Class)type1);
            } else
            {
                throw new JsonIOException((new StringBuilder()).append("Invalid EnumSet type: ").append(val$type.toString()).toString());
            }
        } else
        {
            throw new JsonIOException((new StringBuilder()).append("Invalid EnumSet type: ").append(val$type.toString()).toString());
        }
    }

    ()
    {
        this$0 = final_constructorconstructor;
        val$type = Type.this;
        super();
    }
}
