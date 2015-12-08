// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.googleapis.services.json;

import com.google.api.client.googleapis.services.AbstractGoogleClientRequest;
import com.google.api.client.googleapis.services.CommonGoogleClientRequestInitializer;
import java.io.IOException;

// Referenced classes of package com.google.api.client.googleapis.services.json:
//            AbstractGoogleJsonClientRequest

public class CommonGoogleJsonClientRequestInitializer extends CommonGoogleClientRequestInitializer
{

    public CommonGoogleJsonClientRequestInitializer()
    {
    }

    public CommonGoogleJsonClientRequestInitializer(String s)
    {
        super(s);
    }

    public CommonGoogleJsonClientRequestInitializer(String s, String s1)
    {
        super(s, s1);
    }

    public final void initialize(AbstractGoogleClientRequest abstractgoogleclientrequest)
        throws IOException
    {
        super.initialize(abstractgoogleclientrequest);
        initializeJsonRequest((AbstractGoogleJsonClientRequest)abstractgoogleclientrequest);
    }

    protected void initializeJsonRequest(AbstractGoogleJsonClientRequest abstractgooglejsonclientrequest)
        throws IOException
    {
    }
}
