// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl.exceptions;


// Referenced classes of package com.fitbit.data.bl.exceptions:
//            NamedException

public abstract class UserFriendlyTextException extends NamedException
{

    private static final long serialVersionUID = 0x698785e8d4707d4dL;

    public UserFriendlyTextException()
    {
    }

    public UserFriendlyTextException(String s)
    {
        super(s);
    }

    public UserFriendlyTextException(String s, Throwable throwable)
    {
        super(s, throwable);
    }

    public UserFriendlyTextException(Throwable throwable)
    {
        super(throwable);
    }

    public abstract int a();
}
