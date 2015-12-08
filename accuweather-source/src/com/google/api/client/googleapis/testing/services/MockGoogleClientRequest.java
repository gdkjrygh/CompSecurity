// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.googleapis.testing.services;

import com.google.api.client.googleapis.services.AbstractGoogleClient;
import com.google.api.client.googleapis.services.AbstractGoogleClientRequest;
import com.google.api.client.http.HttpContent;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.util.GenericData;

public class MockGoogleClientRequest extends AbstractGoogleClientRequest
{

    public MockGoogleClientRequest(AbstractGoogleClient abstractgoogleclient, String s, String s1, HttpContent httpcontent, Class class1)
    {
        super(abstractgoogleclient, s, s1, httpcontent, class1);
    }

    public volatile AbstractGoogleClientRequest set(String s, Object obj)
    {
        return set(s, obj);
    }

    public MockGoogleClientRequest set(String s, Object obj)
    {
        return (MockGoogleClientRequest)super.set(s, obj);
    }

    public volatile GenericData set(String s, Object obj)
    {
        return set(s, obj);
    }

    public volatile AbstractGoogleClientRequest setDisableGZipContent(boolean flag)
    {
        return setDisableGZipContent(flag);
    }

    public MockGoogleClientRequest setDisableGZipContent(boolean flag)
    {
        return (MockGoogleClientRequest)super.setDisableGZipContent(flag);
    }

    public volatile AbstractGoogleClientRequest setRequestHeaders(HttpHeaders httpheaders)
    {
        return setRequestHeaders(httpheaders);
    }

    public MockGoogleClientRequest setRequestHeaders(HttpHeaders httpheaders)
    {
        return (MockGoogleClientRequest)super.setRequestHeaders(httpheaders);
    }
}
