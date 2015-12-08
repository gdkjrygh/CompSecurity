// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.app2app.translator;


// Referenced classes of package com.skype.android.app.app2app.translator:
//            TranscribedMessage

public class OnTranscribedMessage
{

    private final TranscribedMessage message;

    public OnTranscribedMessage(TranscribedMessage transcribedmessage)
    {
        message = transcribedmessage;
    }

    public int getMessageId()
    {
        return message.getMessageId();
    }

    public String getPartnerId()
    {
        return message.getPartnerId();
    }

    public com.skype.Translator.TRANSLATOR_RECO_TYPE getRecordType()
    {
        return message.getRecordType();
    }

    public String getText()
    {
        return message.getText();
    }
}
