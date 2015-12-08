// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.json;

import com.google.api.client.http.HttpMediaType;
import com.google.api.client.util.Charsets;

public class Json
{

    public static final String MEDIA_TYPE;

    public Json()
    {
    }

    static 
    {
        MEDIA_TYPE = (new HttpMediaType("application/json")).setCharsetParameter(Charsets.UTF_8).build();
    }
}
