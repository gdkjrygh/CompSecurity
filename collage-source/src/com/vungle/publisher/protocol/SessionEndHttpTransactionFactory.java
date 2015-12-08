// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.protocol;

import com.vungle.publisher.net.http.FireAndForgetHttpResponseHandler;
import com.vungle.publisher.net.http.HttpTransaction;
import org.json.JSONException;

public class SessionEndHttpTransactionFactory extends com.vungle.publisher.net.http.HttpTransaction.Factory
{

    SessionEndHttpRequest.Factory a;
    FireAndForgetHttpResponseHandler b;

    public SessionEndHttpTransactionFactory()
    {
    }

    public final HttpTransaction a(long l, long l1)
        throws JSONException
    {
        return super.a(a.a(l, l1), b);
    }
}
