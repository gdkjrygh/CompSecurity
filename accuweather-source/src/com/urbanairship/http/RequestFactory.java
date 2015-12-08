// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.http;

import java.net.URL;

// Referenced classes of package com.urbanairship.http:
//            Request

public class RequestFactory
{

    public RequestFactory()
    {
    }

    public Request createRequest(String s, URL url)
    {
        return new Request(s, url);
    }
}
