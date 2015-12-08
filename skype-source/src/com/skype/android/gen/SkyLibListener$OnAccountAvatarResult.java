// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.gen;

import com.skype.SkyLib;

// Referenced classes of package com.skype.android.gen:
//            SkyLibListener

public static class _data
{

    private com.skype.vatarResult._skypename _code;
    private byte _data[];
    private SkyLib _sender;
    private String _skypename;

    public com.skype.vatarResult getCode()
    {
        return _code;
    }

    public byte[] getData()
    {
        return _data;
    }

    public SkyLib getSender()
    {
        return _sender;
    }

    public String getSkypename()
    {
        return _skypename;
    }

    public (SkyLib skylib, com.skype.vatarResult vatarresult, String s, byte abyte0[])
    {
        _sender = skylib;
        _code = vatarresult;
        _skypename = s;
        _data = abyte0;
    }
}
