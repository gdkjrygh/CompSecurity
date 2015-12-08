// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.gen;

import com.skype.SkyLib;

// Referenced classes of package com.skype.android.gen:
//            SkyLibListener

public static class _receivedSizes
{

    private String _appname;
    private com.skype.mListChange._streams _listType;
    private int _receivedSizes[];
    private SkyLib _sender;
    private String _streams[];

    public String getAppname()
    {
        return _appname;
    }

    public com.skype.mListChange getListType()
    {
        return _listType;
    }

    public int[] getReceivedSizes()
    {
        return _receivedSizes;
    }

    public SkyLib getSender()
    {
        return _sender;
    }

    public String[] getStreams()
    {
        return _streams;
    }

    public (SkyLib skylib, String s, com.skype.mListChange mlistchange, String as[], int ai[])
    {
        _sender = skylib;
        _appname = s;
        _listType = mlistchange;
        _streams = as;
        _receivedSizes = ai;
    }
}
