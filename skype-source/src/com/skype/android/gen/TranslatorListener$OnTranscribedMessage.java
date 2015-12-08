// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.gen;

import com.skype.Translator;

// Referenced classes of package com.skype.android.gen:
//            TranslatorListener

public static class _status
{

    private int _convId;
    private int _msgId;
    private com.skype.ibedMessage._text _recotype;
    private Translator _sender;
    private com.skype.ibedMessage._text _status;
    private String _text;

    public int getConvId()
    {
        return _convId;
    }

    public int getMsgId()
    {
        return _msgId;
    }

    public com.skype.ibedMessage getRecotype()
    {
        return _recotype;
    }

    public Translator getSender()
    {
        return _sender;
    }

    public com.skype.ibedMessage getStatus()
    {
        return _status;
    }

    public String getText()
    {
        return _text;
    }

    public (Translator translator, int i, int j, String s, com.skype.ibedMessage ibedmessage, com.skype.ibedMessage ibedmessage1)
    {
        _sender = translator;
        _msgId = i;
        _convId = j;
        _text = s;
        _recotype = ibedmessage;
        _status = ibedmessage1;
    }
}
