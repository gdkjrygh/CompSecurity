// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

// Referenced classes of package com.google.gson.internal.bind:
//            TypeAdapters

final class c
    implements TypeAdapterFactory
{

    final Class a;
    final Class b;
    final TypeAdapter c;

    public TypeAdapter create(Gson gson, TypeToken typetoken)
    {
        gson = typetoken.getRawType();
        if (gson == a || gson == b)
        {
            return c;
        } else
        {
            return null;
        }
    }

    public String toString()
    {
        return (new StringBuilder()).append("Factory[type=").append(a.getName()).append("+").append(b.getName()).append(",adapter=").append(c).append("]").toString();
    }

    (Class class1, Class class2, TypeAdapter typeadapter)
    {
        a = class1;
        b = class2;
        c = typeadapter;
        super();
    }
}
