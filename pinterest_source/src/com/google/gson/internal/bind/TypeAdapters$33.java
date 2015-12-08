// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

final class val.typeAdapter
    implements TypeAdapterFactory
{

    final Class val$boxed;
    final TypeAdapter val$typeAdapter;
    final Class val$unboxed;

    public final TypeAdapter create(Gson gson, TypeToken typetoken)
    {
        gson = typetoken.getRawType();
        if (gson == val$unboxed || gson == val$boxed)
        {
            return val$typeAdapter;
        } else
        {
            return null;
        }
    }

    public final String toString()
    {
        return (new StringBuilder("Factory[type=")).append(val$boxed.getName()).append("+").append(val$unboxed.getName()).append(",adapter=").append(val$typeAdapter).append("]").toString();
    }

    ()
    {
        val$unboxed = class1;
        val$boxed = class2;
        val$typeAdapter = typeadapter;
        super();
    }
}
