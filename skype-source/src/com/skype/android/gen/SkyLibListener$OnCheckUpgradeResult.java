// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.gen;

import com.skype.SkyLib;

// Referenced classes of package com.skype.android.gen:
//            SkyLibListener

public static class _result
{

    private boolean _isManual;
    private com.skype.gradeResult._sender _result;
    private SkyLib _sender;

    public boolean getIsManual()
    {
        return _isManual;
    }

    public com.skype.gradeResult getResult()
    {
        return _result;
    }

    public SkyLib getSender()
    {
        return _sender;
    }

    public (SkyLib skylib, boolean flag, com.skype.gradeResult graderesult)
    {
        _sender = skylib;
        _isManual = flag;
        _result = graderesult;
    }
}
