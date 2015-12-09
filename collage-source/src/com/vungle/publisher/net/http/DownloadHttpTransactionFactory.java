// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.net.http;

import com.vungle.publisher.cw;
import javax.inject.Provider;

// Referenced classes of package com.vungle.publisher.net.http:
//            DownloadHttpRequest, HttpRequest, DownloadHttpResponseHandler, HttpTransaction

public class DownloadHttpTransactionFactory extends HttpTransaction.Factory
{

    DownloadHttpRequest.Factory a;
    DownloadHttpResponseHandler.Factory b;

    public DownloadHttpTransactionFactory()
    {
    }

    public final HttpTransaction a(String s, com.vungle.publisher.bj.b b1, String s1, String s2, cw cw)
    {
        DownloadHttpRequest downloadhttprequest = (DownloadHttpRequest)a.c();
        downloadhttprequest.b = s1;
        s1 = (DownloadHttpResponseHandler)b.a.get();
        s1.a = s;
        s1.b = s2;
        s1.c = b1;
        return super.a(downloadhttprequest, s1, cw);
    }
}
