// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson;

import com.google.gson.internal.GsonInternalAccess;
import com.google.gson.reflect.TypeToken;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.gson:
//            Gson, TypeAdapterFactory, TypeAdapter

static final class pter extends GsonInternalAccess
{

    public TypeAdapter getNextAdapter(Gson gson, TypeAdapterFactory typeadapterfactory, TypeToken typetoken)
    {
        boolean flag = false;
        for (Iterator iterator = Gson.access$100(gson).iterator(); iterator.hasNext();)
        {
            Object obj = (TypeAdapterFactory)iterator.next();
            if (!flag)
            {
                if (obj == typeadapterfactory)
                {
                    flag = true;
                }
            } else
            {
                obj = ((TypeAdapterFactory) (obj)).create(gson, typetoken);
                if (obj != null)
                {
                    return ((TypeAdapter) (obj));
                }
            }
        }

        throw new IllegalArgumentException((new StringBuilder()).append("GSON cannot serialize ").append(typetoken).toString());
    }

    pter()
    {
    }
}
