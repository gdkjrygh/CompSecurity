// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.gen;

import com.skype.Participant;

// Referenced classes of package com.skype.android.gen:
//            ParticipantListener

public static class _dtmf
{

    private com.skype.ncomingDTMF._sender _dtmf;
    private Participant _sender;

    public com.skype.ncomingDTMF getDtmf()
    {
        return _dtmf;
    }

    public Participant getSender()
    {
        return _sender;
    }

    public (Participant participant, com.skype.ncomingDTMF ncomingdtmf)
    {
        _sender = participant;
        _dtmf = ncomingdtmf;
    }
}
