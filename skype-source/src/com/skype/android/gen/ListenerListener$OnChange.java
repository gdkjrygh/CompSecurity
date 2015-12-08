// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.gen;

import com.skype.Listener;

// Referenced classes of package com.skype.android.gen:
//            ListenerListener

public static class _key
{

    private String _key;
    private Listener _sender;

    public String getKey()
    {
        return _key;
    }

    public Listener getSender()
    {
        return _sender;
    }

    public (Listener listener, String s)
    {
        _sender = listener;
        _key = s;
    }
}
