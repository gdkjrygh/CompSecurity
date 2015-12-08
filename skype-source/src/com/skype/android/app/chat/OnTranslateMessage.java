// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import com.skype.Message;

public class OnTranslateMessage
{

    private Message message;
    private int position;

    public OnTranslateMessage(Message message1, int i)
    {
        message = message1;
        position = i;
    }

    public Message getMessage()
    {
        return message;
    }

    public int getPosition()
    {
        return position;
    }
}
