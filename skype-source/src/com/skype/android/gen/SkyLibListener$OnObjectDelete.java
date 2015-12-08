// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.gen;

import com.skype.SkyLib;

// Referenced classes of package com.skype.android.gen:
//            SkyLibListener

public static class _objectID
{

    private int _objectID;
    private com.skype.bjectDelete._sender _objectType;
    private SkyLib _sender;

    public int getObjectID()
    {
        return _objectID;
    }

    public com.skype.bjectDelete getObjectType()
    {
        return _objectType;
    }

    public SkyLib getSender()
    {
        return _sender;
    }

    public _cls9(SkyLib skylib, com.skype.bjectDelete bjectdelete, int i)
    {
        _sender = skylib;
        _objectType = bjectdelete;
        _objectID = i;
    }
}
