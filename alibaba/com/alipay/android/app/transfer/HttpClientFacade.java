// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alipay.android.app.transfer;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.params.HttpParams;

public abstract class HttpClientFacade
{

    public HttpClientFacade()
    {
    }

    public abstract void doCheckConnect();

    public abstract HttpResponse execute(HttpUriRequest httpurirequest);

    public abstract HttpParams getParams();
}
