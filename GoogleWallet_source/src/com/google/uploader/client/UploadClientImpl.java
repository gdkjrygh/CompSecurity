// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.uploader.client;

import com.google.common.base.Preconditions;

// Referenced classes of package com.google.uploader.client:
//            UploadClient, ResumableTransfer, HttpClient, HttpHeaders, 
//            DataStream, TransferOptions, Transfer

public final class UploadClientImpl
    implements UploadClient
{
    public static final class Builder
    {

        private HttpClient httpClient;

        public final UploadClient build()
        {
            return new UploadClientImpl(httpClient);
        }

        private Builder(HttpClient httpclient)
        {
            httpClient = httpclient;
        }

    }


    private final HttpClient httpClient;

    private UploadClientImpl(HttpClient httpclient)
    {
        httpClient = httpclient;
    }


    public static Builder newBuilder(HttpClient httpclient)
    {
        return new Builder(httpclient);
    }

    public final Transfer createTransfer(String s, String s1, HttpHeaders httpheaders, DataStream datastream, String s2, TransferOptions transferoptions)
    {
        boolean flag;
        if (s1.equalsIgnoreCase("put") || s1.equalsIgnoreCase("post"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        return ResumableTransfer.createNewTransfer(s, s1, httpheaders, datastream, s2, httpClient, transferoptions);
    }
}
