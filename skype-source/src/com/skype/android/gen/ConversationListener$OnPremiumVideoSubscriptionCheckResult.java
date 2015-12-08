// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.gen;

import com.skype.Conversation;

// Referenced classes of package com.skype.android.gen:
//            ConversationListener

public static class _resultCode
{

    private int _requestId;
    private com.skype.CheckResult._sender _resultCode;
    private Conversation _sender;

    public int getRequestId()
    {
        return _requestId;
    }

    public com.skype.CheckResult getResultCode()
    {
        return _resultCode;
    }

    public Conversation getSender()
    {
        return _sender;
    }

    public (Conversation conversation, int i, com.skype.CheckResult checkresult)
    {
        _sender = conversation;
        _requestId = i;
        _resultCode = checkresult;
    }
}
