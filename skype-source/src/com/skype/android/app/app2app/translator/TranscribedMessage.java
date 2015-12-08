// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.app2app.translator;


public class TranscribedMessage
{

    private int messageId;
    private String partnerId;
    private com.skype.Translator.TRANSLATOR_RECO_TYPE recordType;
    private String text;
    private boolean valid;

    public TranscribedMessage()
    {
        recordType = com.skype.Translator.TRANSLATOR_RECO_TYPE.WRAPPER_UNKNOWN_VALUE;
    }

    public int getMessageId()
    {
        return messageId;
    }

    public String getPartnerId()
    {
        return partnerId;
    }

    public com.skype.Translator.TRANSLATOR_RECO_TYPE getRecordType()
    {
        return recordType;
    }

    public String getText()
    {
        return text;
    }

    public boolean isValid()
    {
        return valid;
    }

    public void setMessageId(int i)
    {
        if (i != 0)
        {
            messageId = i;
            return;
        } else
        {
            throw new IllegalArgumentException("MessageId shouldn't be 0");
        }
    }

    public void setPartnerId(String s)
    {
        if (s != null)
        {
            partnerId = s;
            return;
        } else
        {
            throw new IllegalArgumentException("partnerId can't be null");
        }
    }

    public void setRecordType(com.skype.Translator.TRANSLATOR_RECO_TYPE translator_reco_type)
    {
        if (translator_reco_type != com.skype.Translator.TRANSLATOR_RECO_TYPE.WRAPPER_UNKNOWN_VALUE)
        {
            recordType = translator_reco_type;
            return;
        } else
        {
            throw new IllegalArgumentException("Illegal recordType");
        }
    }

    public void setText(String s)
    {
        if (s != null)
        {
            text = s;
            return;
        } else
        {
            throw new IllegalArgumentException("text can't be null");
        }
    }

    public void setValid(boolean flag)
    {
        valid = flag;
    }
}
