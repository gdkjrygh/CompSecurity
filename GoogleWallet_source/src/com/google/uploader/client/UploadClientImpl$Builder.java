// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.uploader.client;


// Referenced classes of package com.google.uploader.client:
//            UploadClientImpl, HttpClient, UploadClient

public static final class <init>
{

    private HttpClient httpClient;

    public final UploadClient build()
    {
        return new UploadClientImpl(httpClient, null);
    }

    private _cls9(HttpClient httpclient)
    {
        httpClient = httpclient;
    }

    httpClient(HttpClient httpclient, httpClient httpclient1)
    {
        this(httpclient);
    }
}
