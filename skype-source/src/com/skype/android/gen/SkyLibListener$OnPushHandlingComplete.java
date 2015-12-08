// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.gen;

import com.skype.SkyLib;

// Referenced classes of package com.skype.android.gen:
//            SkyLibListener

public static class _result
{

    private int _pushId;
    private com.skype.ingComplete._sender _result;
    private SkyLib _sender;

    public int getPushId()
    {
        return _pushId;
    }

    public com.skype.ingComplete getResult()
    {
        return _result;
    }

    public SkyLib getSender()
    {
        return _sender;
    }

    public A(SkyLib skylib, int i, com.skype.ingComplete ingcomplete)
    {
        _sender = skylib;
        _pushId = i;
        _result = ingcomplete;
    }
}
