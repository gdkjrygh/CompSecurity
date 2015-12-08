// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.sdk.cmloginsdkjar.model;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

// Referenced classes of package com.cleanmaster.sdk.cmloginsdkjar.model:
//            CmObjectList, b

final class c
    implements ParameterizedType
{

    final Class a;
    final b b;

    c(b b1, Class class1)
    {
        b = b1;
        a = class1;
        super();
    }

    public final Type[] getActualTypeArguments()
    {
        return (new Type[] {
            a
        });
    }

    public final Type getOwnerType()
    {
        return null;
    }

    public final Type getRawType()
    {
        return com/cleanmaster/sdk/cmloginsdkjar/model/CmObjectList;
    }
}
