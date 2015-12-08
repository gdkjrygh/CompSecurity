// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.gen;

import com.skype.SkyLib;

// Referenced classes of package com.skype.android.gen:
//            SkyLibListener

public static class _type
{

    private SkyLib _sender;
    private com.skype.EasSyncDone._type _type;

    public SkyLib getSender()
    {
        return _sender;
    }

    public com.skype.EasSyncDone getType()
    {
        return _type;
    }

    public (SkyLib skylib, com.skype.EasSyncDone eassyncdone)
    {
        _sender = skylib;
        _type = eassyncdone;
    }
}
