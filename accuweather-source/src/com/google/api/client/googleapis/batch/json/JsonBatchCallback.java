// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.googleapis.batch.json;

import com.google.api.client.googleapis.batch.BatchCallback;
import com.google.api.client.googleapis.json.GoogleJsonError;
import com.google.api.client.googleapis.json.GoogleJsonErrorContainer;
import com.google.api.client.http.HttpHeaders;
import java.io.IOException;

public abstract class JsonBatchCallback
    implements BatchCallback
{

    public JsonBatchCallback()
    {
    }

    public abstract void onFailure(GoogleJsonError googlejsonerror, HttpHeaders httpheaders)
        throws IOException;

    public final void onFailure(GoogleJsonErrorContainer googlejsonerrorcontainer, HttpHeaders httpheaders)
        throws IOException
    {
        onFailure(googlejsonerrorcontainer.getError(), httpheaders);
    }

    public volatile void onFailure(Object obj, HttpHeaders httpheaders)
        throws IOException
    {
        onFailure((GoogleJsonErrorContainer)obj, httpheaders);
    }
}
