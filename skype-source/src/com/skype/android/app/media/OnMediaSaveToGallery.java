// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.media;

import com.skype.Message;

public class OnMediaSaveToGallery
{

    private Message message;

    public OnMediaSaveToGallery(Message message1)
    {
        message = message1;
    }

    public Message getMessage()
    {
        return message;
    }

    public void setMessage(Message message1)
    {
        message = message1;
    }
}
