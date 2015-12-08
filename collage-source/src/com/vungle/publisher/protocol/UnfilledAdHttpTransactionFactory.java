// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.protocol;

import com.vungle.publisher.net.http.FireAndForgetHttpResponseHandler;
import com.vungle.publisher.net.http.HttpTransaction;

public class UnfilledAdHttpTransactionFactory extends com.vungle.publisher.net.http.HttpTransaction.Factory
{

    UnfilledAdHttpRequest.Factory a;
    FireAndForgetHttpResponseHandler b;

    public UnfilledAdHttpTransactionFactory()
    {
    }

    public final HttpTransaction a(long l)
    {
        return super.a(a.a(l), b);
    }
}
