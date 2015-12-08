// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.media;


public class OnMediaUploadRetry
{

    private final int mediaDocumentId;
    private final int messageId;
    private final boolean started;

    public OnMediaUploadRetry(int i, int j, boolean flag)
    {
        messageId = i;
        mediaDocumentId = j;
        started = flag;
    }

    public int getMediaDocumentId()
    {
        return mediaDocumentId;
    }

    public int getMessageId()
    {
        return messageId;
    }

    public boolean isStarted()
    {
        return started;
    }
}
