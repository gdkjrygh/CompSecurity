// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api;

import com.google.gson.Gson;

public class Utils
{

    private static Gson gson;

    private Utils()
    {
        throw new IllegalStateException("Non-instantiable class.");
    }

    public static Gson getGson()
    {
        if (gson == null)
        {
            gson = new Gson();
        }
        return gson;
    }
}
