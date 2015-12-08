// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.gen;

import com.skype.GI;

// Referenced classes of package com.skype.android.gen:
//            GIListener

public static class _nodeinfo
{

    private byte _nodeinfo[];
    private GI _sender;

    public byte[] getNodeinfo()
    {
        return _nodeinfo;
    }

    public GI getSender()
    {
        return _sender;
    }

    public (GI gi, byte abyte0[])
    {
        _sender = gi;
        _nodeinfo = abyte0;
    }
}
