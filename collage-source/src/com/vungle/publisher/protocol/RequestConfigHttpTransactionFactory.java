// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.protocol;

import com.vungle.publisher.cy;
import com.vungle.publisher.net.http.HttpTransaction;

public class RequestConfigHttpTransactionFactory extends com.vungle.publisher.net.http.HttpTransaction.Factory
{

    RequestConfigHttpRequest.Factory a;
    cy b;

    public RequestConfigHttpTransactionFactory()
    {
    }

    public final HttpTransaction a()
    {
        return super.a(a.d(), b);
    }
}
