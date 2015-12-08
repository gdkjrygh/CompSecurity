// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.googleapis.notifications.json;

import com.google.api.client.googleapis.notifications.TypedNotificationCallback;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonObjectParser;
import com.google.api.client.util.ObjectParser;
import java.io.IOException;

public abstract class JsonNotificationCallback extends TypedNotificationCallback
{

    private static final long serialVersionUID = 1L;

    public JsonNotificationCallback()
    {
    }

    protected abstract JsonFactory getJsonFactory()
        throws IOException;

    protected final JsonObjectParser getObjectParser()
        throws IOException
    {
        return new JsonObjectParser(getJsonFactory());
    }

    protected volatile ObjectParser getObjectParser()
        throws IOException
    {
        return getObjectParser();
    }
}
