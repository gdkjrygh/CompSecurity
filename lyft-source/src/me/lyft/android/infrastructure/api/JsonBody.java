// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.api;

import com.google.gson.Gson;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.RequestBody;

public class JsonBody
{

    public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");

    JsonBody()
    {
    }

    public static RequestBody create(Gson gson, Object obj)
    {
        gson = gson.a(obj);
        return RequestBody.create(JSON, gson);
    }

}
