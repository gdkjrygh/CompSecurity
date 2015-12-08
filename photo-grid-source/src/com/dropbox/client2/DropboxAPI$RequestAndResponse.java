// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dropbox.client2;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpUriRequest;

public final class response
{

    public final HttpUriRequest request;
    public final HttpResponse response;

    protected (HttpUriRequest httpurirequest, HttpResponse httpresponse)
    {
        request = httpurirequest;
        response = httpresponse;
    }
}
