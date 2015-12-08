// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.gen;

import com.skype.Translator;

// Referenced classes of package com.skype.android.gen:
//            TranslatorListener

public static class _status
{

    private byte _audioChunk[];
    private Translator _sender;
    private com.skype.essionAudio._transSessionId _status;
    private int _transSessionId;

    public byte[] getAudioChunk()
    {
        return _audioChunk;
    }

    public Translator getSender()
    {
        return _sender;
    }

    public com.skype.essionAudio getStatus()
    {
        return _status;
    }

    public int getTransSessionId()
    {
        return _transSessionId;
    }

    public (Translator translator, int i, byte abyte0[], com.skype.essionAudio essionaudio)
    {
        _sender = translator;
        _transSessionId = i;
        _audioChunk = abyte0;
        _status = essionaudio;
    }
}
