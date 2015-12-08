// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.gen;

import com.skype.ObjectInterface;
import com.skype.PROPKEY;

// Referenced classes of package com.skype.android.gen:
//            ConversationListener

public static class _propKey
{

    private PROPKEY _propKey;
    private ObjectInterface _sender;

    public PROPKEY getPropKey()
    {
        return _propKey;
    }

    public ObjectInterface getSender()
    {
        return _sender;
    }

    public A(ObjectInterface objectinterface, PROPKEY propkey)
    {
        _sender = objectinterface;
        _propKey = propkey;
    }
}
