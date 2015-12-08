// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.gen;

import com.skype.SkyLib;

// Referenced classes of package com.skype.android.gen:
//            SkyLibListener

public static class _capable
{

    private boolean _capable;
    private String _identity;
    private SkyLib _sender;

    public boolean getCapable()
    {
        return _capable;
    }

    public String getIdentity()
    {
        return _identity;
    }

    public SkyLib getSender()
    {
        return _sender;
    }

    public (SkyLib skylib, String s, boolean flag)
    {
        _sender = skylib;
        _identity = s;
        _capable = flag;
    }
}
