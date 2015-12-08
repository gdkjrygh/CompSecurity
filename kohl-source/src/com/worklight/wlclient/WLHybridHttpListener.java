// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient;

import org.apache.http.HttpResponse;

public interface WLHybridHttpListener
{

    public abstract void onException(Exception exception);

    public abstract void onResponse(HttpResponse httpresponse);
}
