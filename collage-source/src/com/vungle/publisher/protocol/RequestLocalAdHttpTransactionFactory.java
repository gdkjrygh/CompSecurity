// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.protocol;

import com.vungle.publisher.ct;
import com.vungle.publisher.cw;
import com.vungle.publisher.net.http.HttpTransaction;
import dagger.Lazy;

public class RequestLocalAdHttpTransactionFactory extends com.vungle.publisher.net.http.HttpTransaction.Factory
{

    RequestLocalAdHttpRequest.Factory a;
    Lazy b;

    public RequestLocalAdHttpTransactionFactory()
    {
    }

    public final HttpTransaction a(cw cw)
    {
        return super.a(a.d(), (ct)b.get(), cw);
    }
}
