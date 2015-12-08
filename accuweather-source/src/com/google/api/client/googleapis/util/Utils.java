// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.googleapis.util;

import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;

public final class Utils
{
    private static class JsonFactoryInstanceHolder
    {

        static final JsonFactory INSTANCE = new JacksonFactory();


        private JsonFactoryInstanceHolder()
        {
        }
    }

    private static class TransportInstanceHolder
    {

        static final HttpTransport INSTANCE = new NetHttpTransport();


        private TransportInstanceHolder()
        {
        }
    }


    private Utils()
    {
    }

    public static JsonFactory getDefaultJsonFactory()
    {
        return JsonFactoryInstanceHolder.INSTANCE;
    }

    public static HttpTransport getDefaultTransport()
    {
        return TransportInstanceHolder.INSTANCE;
    }
}
