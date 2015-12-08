// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.model;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

// Referenced classes of package com.facebook.model:
//            GraphObject, GraphObjectList

class val.expectedType
    implements ParameterizedType
{

    final val.expectedType this$2;
    private final Class val$expectedType;

    public Type[] getActualTypeArguments()
    {
        return (new Type[] {
            val$expectedType
        });
    }

    public Type getOwnerType()
    {
        return null;
    }

    public Type getRawType()
    {
        return com/facebook/model/GraphObjectList;
    }

    ()
    {
        this$2 = final_;
        val$expectedType = Class.this;
        super();
    }
}
