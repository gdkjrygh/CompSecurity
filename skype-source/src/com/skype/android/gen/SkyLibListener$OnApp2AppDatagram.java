// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.gen;

import com.skype.SkyLib;

// Referenced classes of package com.skype.android.gen:
//            SkyLibListener

public static class _data
{

    private String _appname;
    private byte _data[];
    private SkyLib _sender;
    private String _stream;

    public String getAppname()
    {
        return _appname;
    }

    public byte[] getData()
    {
        return _data;
    }

    public SkyLib getSender()
    {
        return _sender;
    }

    public String getStream()
    {
        return _stream;
    }

    public (SkyLib skylib, String s, String s1, byte abyte0[])
    {
        _sender = skylib;
        _appname = s;
        _stream = s1;
        _data = abyte0;
    }
}
