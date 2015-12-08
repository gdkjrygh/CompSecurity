// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.gen;

import com.skype.SkyLib;

// Referenced classes of package com.skype.android.gen:
//            SkyLibListener

public static class _snippets
{

    private int _objectIDs[];
    private int _queryID;
    private SkyLib _sender;
    private String _snippets[];

    public int[] getObjectIDs()
    {
        return _objectIDs;
    }

    public int getQueryID()
    {
        return _queryID;
    }

    public SkyLib getSender()
    {
        return _sender;
    }

    public String[] getSnippets()
    {
        return _snippets;
    }

    public A(SkyLib skylib, int i, int ai[], String as[])
    {
        _sender = skylib;
        _queryID = i;
        _objectIDs = ai;
        _snippets = as;
    }
}
