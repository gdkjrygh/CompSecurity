// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.services.now;

import com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest;
import com.google.api.client.googleapis.services.json.CommonGoogleJsonClientRequestInitializer;
import java.io.IOException;

// Referenced classes of package com.google.api.services.now:
//            NowRequest

public class NowRequestInitializer extends CommonGoogleJsonClientRequestInitializer
{

    public NowRequestInitializer()
    {
    }

    public NowRequestInitializer(String s)
    {
        super(s);
    }

    public NowRequestInitializer(String s, String s1)
    {
        super(s, s1);
    }

    public final void initializeJsonRequest(AbstractGoogleJsonClientRequest abstractgooglejsonclientrequest)
        throws IOException
    {
        super.initializeJsonRequest(abstractgooglejsonclientrequest);
        initializeNowRequest((NowRequest)abstractgooglejsonclientrequest);
    }

    protected void initializeNowRequest(NowRequest nowrequest)
        throws IOException
    {
    }
}
