// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.uploader.client;


// Referenced classes of package com.google.uploader.client:
//            HttpResponse, TransferException

public final class TransferExceptionOrHttpResponse
{

    private final HttpResponse response;
    private final TransferException transferException;

    public TransferExceptionOrHttpResponse(HttpResponse httpresponse)
    {
        transferException = null;
        response = httpresponse;
    }

    public TransferExceptionOrHttpResponse(TransferException transferexception)
    {
        transferException = transferexception;
        response = null;
    }

    public final HttpResponse getHttpResponse()
    {
        return response;
    }

    public final TransferException getTransferException()
    {
        return transferException;
    }

    public final boolean hasHttpResponse()
    {
        return response != null;
    }

    public final boolean hasTransferException()
    {
        return transferException != null;
    }
}
