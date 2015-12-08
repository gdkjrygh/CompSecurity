// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.gen;

import com.skype.SkyLib;

// Referenced classes of package com.skype.android.gen:
//            SkyLibListener

public static class _values
{

    private String _ids[];
    private boolean _isEntitled;
    private String _planName;
    private SkyLib _sender;
    private int _values[];

    public String[] getIds()
    {
        return _ids;
    }

    public boolean getIsEntitled()
    {
        return _isEntitled;
    }

    public String getPlanName()
    {
        return _planName;
    }

    public SkyLib getSender()
    {
        return _sender;
    }

    public int[] getValues()
    {
        return _values;
    }

    public (SkyLib skylib, boolean flag, String s, String as[], int ai[])
    {
        _sender = skylib;
        _isEntitled = flag;
        _planName = s;
        _ids = as;
        _values = ai;
    }
}
