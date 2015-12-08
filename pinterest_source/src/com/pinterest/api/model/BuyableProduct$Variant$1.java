// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import com.google.gson.JsonElement;
import com.pinterest.common.utils.Function;

final class 
    implements Function
{

    public final volatile Object apply(Object obj)
    {
        return apply((JsonElement)obj);
    }

    public final String apply(JsonElement jsonelement)
    {
        if (jsonelement == null || jsonelement.isJsonNull())
        {
            return null;
        } else
        {
            return jsonelement.getAsString();
        }
    }

    ()
    {
    }
}
