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
    private String _origLang;
    private String _origText;
    private Translator _sender;
    private com.skype.atedMessage._transText _status;
    private String _transLang;
    private String _transText;

    public int getConvId()
    {
        return _convId;
    }

    public int getMsgId()
    {
        return _msgId;
    }

    public String getOrigLang()
    {
        return _origLang;
    }

    public String getOrigText()
    {
        return _origText;
    }

    public Translator getSender()
    {
        return _sender;
    }

    public com.skype.atedMessage getStatus()
    {
        return _status;
    }

    public String getTransLang()
    {
        return _transLang;
    }

    public String getTransText()
    {
        return _transText;
    }

    public (Translator translator, int i, int j, String s, String s1, String s2, String s3, 
            com.skype.atedMessage atedmessage)
    {
        _sender = translator;
        _msgId = i;
        _convId = j;
        _origText = s;
        _origLang = s1;
        _transText = s2;
        _transLang = s3;
        _status = atedmessage;
    }
}
