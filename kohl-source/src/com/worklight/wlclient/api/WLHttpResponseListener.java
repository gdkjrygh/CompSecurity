// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient.api;

import org.apache.http.HttpResponse;

public interface WLHttpResponseListener
{

    public abstract void onFailure(HttpResponse httpresponse, Exception exception);

    public abstract void onSuccess(HttpResponse httpresponse);
}
