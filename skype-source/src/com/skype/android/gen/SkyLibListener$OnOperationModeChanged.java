// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.gen;

import com.skype.SkyLib;

// Referenced classes of package com.skype.android.gen:
//            SkyLibListener

public static class _level
{

    private int _level;
    private SkyLib _sender;

    public int getLevel()
    {
        return _level;
    }

    public SkyLib getSender()
    {
        return _sender;
    }

    public A(SkyLib skylib, int i)
    {
        _sender = skylib;
        _level = i;
    }
}
