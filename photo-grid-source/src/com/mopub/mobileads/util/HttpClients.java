// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads.util;

import org.apache.http.client.HttpClient;

// Referenced classes of package com.mopub.mobileads.util:
//            a

public class HttpClients
{

    public HttpClients()
    {
    }

    public static void safeShutdown(HttpClient httpclient)
    {
        (new Thread(new a(httpclient))).start();
    }
}
