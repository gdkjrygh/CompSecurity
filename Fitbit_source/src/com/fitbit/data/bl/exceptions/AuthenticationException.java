// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl.exceptions;


// Referenced classes of package com.fitbit.data.bl.exceptions:
//            UserFriendlyTextException

public class AuthenticationException extends UserFriendlyTextException
{

    private static final long serialVersionUID = 0x4e413627d6e3fbfL;

    public AuthenticationException()
    {
    }

    public int a()
    {
        return 0x7f08005f;
    }

    public String b()
    {
        return "AuthenticationException";
    }
}
