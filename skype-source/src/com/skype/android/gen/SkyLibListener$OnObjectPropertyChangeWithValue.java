// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.gen;

import com.skype.Metatag;
import com.skype.PROPKEY;
import com.skype.SkyLib;

// Referenced classes of package com.skype.android.gen:
//            SkyLibListener

public static class _property
{

    private int _objectID;
    private PROPKEY _propKey;
    private Metatag _property;
    private SkyLib _sender;

    public int getObjectID()
    {
        return _objectID;
    }

    public PROPKEY getPropKey()
    {
        return _propKey;
    }

    public Metatag getProperty()
    {
        return _property;
    }

    public SkyLib getSender()
    {
        return _sender;
    }

    public (SkyLib skylib, int i, PROPKEY propkey, Metatag metatag)
    {
        _sender = skylib;
        _objectID = i;
        _propKey = propkey;
        _property = metatag;
    }
}
