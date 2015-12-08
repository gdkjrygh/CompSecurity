// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.gen;

import com.skype.SkyLib;

// Referenced classes of package com.skype.android.gen:
//            SkyLibListener

public static class _avatars
{

    private String _avatars[];
    private com.skype.ountsResult._skypenames _code;
    private String _fullnames[];
    private SkyLib _sender;
    private String _skypenames[];

    public String[] getAvatars()
    {
        return _avatars;
    }

    public com.skype.ountsResult getCode()
    {
        return _code;
    }

    public String[] getFullnames()
    {
        return _fullnames;
    }

    public SkyLib getSender()
    {
        return _sender;
    }

    public String[] getSkypenames()
    {
        return _skypenames;
    }

    public (SkyLib skylib, com.skype.ountsResult ountsresult, String as[], String as1[], String as2[])
    {
        _sender = skylib;
        _code = ountsresult;
        _skypenames = as;
        _fullnames = as1;
        _avatars = as2;
    }
}
