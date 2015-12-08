// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.app2app.translator;


public class OnUITranscribedMessage
{

    private int conversationId;
    private String originalForMe;
    private String partnerId;
    private String translationForMe;

    public OnUITranscribedMessage(int i, String s, String s1, String s2)
    {
        conversationId = i;
        partnerId = s;
        originalForMe = s1;
        translationForMe = s2;
    }

    public int getConversationId()
    {
        return conversationId;
    }

    public String getOriginalForMe()
    {
        return originalForMe;
    }

    public String getPartnerId()
    {
        return partnerId;
    }

    public String getTranslationForMe()
    {
        return translationForMe;
    }
}
