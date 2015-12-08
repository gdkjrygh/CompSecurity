// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.gen;

import com.skype.Conversation;

// Referenced classes of package com.skype.android.gen:
//            ConversationListener

public static class _requestBody
{

    private String _questionnaireId;
    private String _reason;
    private String _requestBody;
    private Conversation _sender;

    public String getQuestionnaireId()
    {
        return _questionnaireId;
    }

    public String getReason()
    {
        return _reason;
    }

    public String getRequestBody()
    {
        return _requestBody;
    }

    public Conversation getSender()
    {
        return _sender;
    }

    public (Conversation conversation, String s, String s1, String s2)
    {
        _sender = conversation;
        _reason = s;
        _questionnaireId = s1;
        _requestBody = s2;
    }
}
