// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.googleapis.testing.services.json;

import com.google.api.client.googleapis.services.AbstractGoogleClient;
import com.google.api.client.googleapis.services.AbstractGoogleClientRequest;
import com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient;
import com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest;
import com.google.api.client.http.HttpHeaders;

// Referenced classes of package com.google.api.client.googleapis.testing.services.json:
//            MockGoogleJsonClient

public class MockGoogleJsonClientRequest extends AbstractGoogleJsonClientRequest
{

    public MockGoogleJsonClientRequest(AbstractGoogleJsonClient abstractgooglejsonclient, String s, String s1, Object obj, Class class1)
    {
        super(abstractgooglejsonclient, s, s1, obj, class1);
    }

    public volatile AbstractGoogleClient getAbstractGoogleClient()
    {
        return getAbstractGoogleClient();
    }

    public volatile AbstractGoogleJsonClient getAbstractGoogleClient()
    {
        return getAbstractGoogleClient();
    }

    public MockGoogleJsonClient getAbstractGoogleClient()
    {
        return (MockGoogleJsonClient)super.getAbstractGoogleClient();
    }

    public volatile AbstractGoogleClientRequest setDisableGZipContent(boolean flag)
    {
        return setDisableGZipContent(flag);
    }

    public volatile AbstractGoogleJsonClientRequest setDisableGZipContent(boolean flag)
    {
        return setDisableGZipContent(flag);
    }

    public MockGoogleJsonClientRequest setDisableGZipContent(boolean flag)
    {
        return (MockGoogleJsonClientRequest)super.setDisableGZipContent(flag);
    }

    public volatile AbstractGoogleClientRequest setRequestHeaders(HttpHeaders httpheaders)
    {
        return setRequestHeaders(httpheaders);
    }

    public volatile AbstractGoogleJsonClientRequest setRequestHeaders(HttpHeaders httpheaders)
    {
        return setRequestHeaders(httpheaders);
    }

    public MockGoogleJsonClientRequest setRequestHeaders(HttpHeaders httpheaders)
    {
        return (MockGoogleJsonClientRequest)super.setRequestHeaders(httpheaders);
    }
}
