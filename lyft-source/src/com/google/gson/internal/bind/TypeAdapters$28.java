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

final class b
    implements TypeAdapterFactory
{

    final Class a;
    final TypeAdapter b;

    public TypeAdapter create(Gson gson, TypeToken typetoken)
    {
        if (typetoken.getRawType() == a)
        {
            return b;
        } else
        {
            return null;
        }
    }

    public String toString()
    {
        return (new StringBuilder()).append("Factory[type=").append(a.getName()).append(",adapter=").append(b).append("]").toString();
    }

    (Class class1, TypeAdapter typeadapter)
    {
        a = class1;
        b = typeadapter;
        super();
    }
}
