// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.gen;

import com.skype.Translator;

// Referenced classes of package com.skype.android.gen:
//            TranslatorListener

public static class _status
{

    private int _durationInMilliSec;
    private int _offsetInMilliSec;
    private String _origText;
    private int _recoId;
    private com.skype.SessionText._transText _recotype;
    private Translator _sender;
    private com.skype.SessionText._transText _status;
    private int _transSessionId;
    private String _transText;

    public int getDurationInMilliSec()
    {
        return _durationInMilliSec;
    }

    public int getOffsetInMilliSec()
    {
        return _offsetInMilliSec;
    }

    public String getOrigText()
    {
        return _origText;
    }

    public int getRecoId()
    {
        return _recoId;
    }

    public com.skype.SessionText getRecotype()
    {
        return _recotype;
    }

    public Translator getSender()
    {
        return _sender;
    }

    public com.skype.SessionText getStatus()
    {
        return _status;
    }

    public int getTransSessionId()
    {
        return _transSessionId;
    }

    public String getTransText()
    {
        return _transText;
    }

    public (Translator translator, int i, int j, String s, String s1, com.skype.SessionText sessiontext, int k, 
            int l, com.skype.SessionText sessiontext1)
    {
        _sender = translator;
        _transSessionId = i;
        _recoId = j;
        _origText = s;
        _transText = s1;
        _recotype = sessiontext;
        _offsetInMilliSec = k;
        _durationInMilliSec = l;
        _status = sessiontext1;
    }
}
