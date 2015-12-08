// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.java_websocket.exceptions;


// Referenced classes of package com.mixpanel.android.java_websocket.exceptions:
//            InvalidDataException

public class LimitExedeedException extends InvalidDataException
{

    private static final long serialVersionUID = 0x5fdf5a6688bc28a1L;

    public LimitExedeedException()
    {
        super(1009);
    }

    public LimitExedeedException(String s)
    {
        super(1009, s);
    }
}
