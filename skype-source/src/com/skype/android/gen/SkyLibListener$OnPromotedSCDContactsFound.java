// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.gen;

import com.skype.SkyLib;

// Referenced classes of package com.skype.android.gen:
//            SkyLibListener

public static class _resultObjectIDList
{

    private int _requestId;
    private int _resultObjectIDList[];
    private SkyLib _sender;

    public int getRequestId()
    {
        return _requestId;
    }

    public int[] getResultObjectIDList()
    {
        return _resultObjectIDList;
    }

    public SkyLib getSender()
    {
        return _sender;
    }

    public (SkyLib skylib, int i, int ai[])
    {
        _sender = skylib;
        _requestId = i;
        _resultObjectIDList = ai;
    }
}
