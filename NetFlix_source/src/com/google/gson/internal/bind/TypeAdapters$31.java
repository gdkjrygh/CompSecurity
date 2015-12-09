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

static final class val.typeAdapter
    implements TypeAdapterFactory
{

    final Class val$clazz;
    final TypeAdapter val$typeAdapter;

    public TypeAdapter create(Gson gson, TypeToken typetoken)
    {
        if (val$clazz.isAssignableFrom(typetoken.getRawType()))
        {
            return val$typeAdapter;
        } else
        {
            return null;
        }
    }

    public String toString()
    {
        return (new StringBuilder()).append("Factory[typeHierarchy=").append(val$clazz.getName()).append(",adapter=").append(val$typeAdapter).append("]").toString();
    }

    (Class class1, TypeAdapter typeadapter)
    {
        val$clazz = class1;
        val$typeAdapter = typeadapter;
        super();
    }
}
