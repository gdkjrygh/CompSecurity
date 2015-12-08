// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.gen;

import com.skype.GI;

// Referenced classes of package com.skype.android.gen:
//            GIListener

public static class _connStatus
{

    private com.skype.tatusChange._sender _connStatus;
    private GI _sender;

    public com.skype.tatusChange getConnStatus()
    {
        return _connStatus;
    }

    public GI getSender()
    {
        return _sender;
    }

    public _cls9(GI gi, com.skype.tatusChange tatuschange)
    {
        _sender = gi;
        _connStatus = tatuschange;
    }
}
