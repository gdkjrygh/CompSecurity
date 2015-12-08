// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.GenericArrayType;

// Referenced classes of package com.google.gson.internal.bind:
//            ArrayTypeAdapter

static final class 
    implements TypeAdapterFactory
{

    public TypeAdapter create(Gson gson, TypeToken typetoken)
    {
        typetoken = typetoken.getType();
        if (!(typetoken instanceof GenericArrayType) && (!(typetoken instanceof Class) || !((Class)typetoken).isArray()))
        {
            return null;
        } else
        {
            typetoken = com.google.gson.internal.yComponentType(typetoken);
            return new ArrayTypeAdapter(gson, gson.getAdapter(TypeToken.get(typetoken)), com.google.gson.internal.ype(typetoken));
        }
    }

    ()
    {
    }
}
