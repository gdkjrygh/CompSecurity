// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.onboarding.auth.tasks;

import java.util.List;

public class AuthTaskException extends Exception
{

    private final String errors[];

    public AuthTaskException(List list)
    {
        errors = (String[])list.toArray(new String[list.size()]);
    }

    public transient AuthTaskException(String as[])
    {
        errors = as;
    }

    public String[] getErrors()
    {
        return errors;
    }

    public String getFirstError()
    {
        if (errors == null || errors.length == 0)
        {
            return "";
        } else
        {
            return errors[0];
        }
    }
}
