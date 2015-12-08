// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.richpush;

import android.content.ContentValues;

class MessageListResponse
{

    private final long lastModifiedTimeMS;
    private final ContentValues serverMessages[];
    private final int status;

    public MessageListResponse(ContentValues acontentvalues[], int i, long l)
    {
        serverMessages = acontentvalues;
        status = i;
        lastModifiedTimeMS = l;
    }

    public long getLastModifiedTimeMS()
    {
        return lastModifiedTimeMS;
    }

    public ContentValues[] getServerMessages()
    {
        return serverMessages;
    }

    public int getStatus()
    {
        return status;
    }
}
