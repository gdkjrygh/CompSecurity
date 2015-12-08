// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl.exceptions;

import java.util.List;

// Referenced classes of package com.fitbit.data.bl.exceptions:
//            NamedException

public class SignupException extends NamedException
{

    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 5;
    private static final long serialVersionUID = 0x22f3aca1fae8cbaL;
    private final List errors;

    public SignupException(List list)
    {
        errors = list;
    }

    public List a()
    {
        return errors;
    }

    public String b()
    {
        return "SignupException";
    }
}
