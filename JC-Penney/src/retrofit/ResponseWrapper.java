// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit;

import retrofit.client.Response;

final class ResponseWrapper
{

    final Response response;
    final Object responseBody;

    ResponseWrapper(Response response1, Object obj)
    {
        response = response1;
        responseBody = obj;
    }
}
