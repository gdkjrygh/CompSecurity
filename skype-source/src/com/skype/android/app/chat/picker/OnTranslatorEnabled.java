// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat.picker;

import com.skype.Conversation;

public class OnTranslatorEnabled
{

    private Conversation conversation;
    private boolean enabled;

    public OnTranslatorEnabled(Conversation conversation1, boolean flag)
    {
        conversation = conversation1;
        enabled = flag;
    }

    public Conversation getConversation()
    {
        return conversation;
    }

    public boolean isEnabled()
    {
        return enabled;
    }
}
