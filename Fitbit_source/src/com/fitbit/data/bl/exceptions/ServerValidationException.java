// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl.exceptions;

import com.fitbit.serverinteraction.q;

public class ServerValidationException extends Exception
{

    private static final long serialVersionUID = 1L;
    private String fieldName;
    private String message;

    public ServerValidationException(q q1)
    {
        String s1 = null;
        String s;
        if (q1 != null)
        {
            s = q1.a();
        } else
        {
            s = null;
        }
        if (q1 != null)
        {
            s1 = q1.b();
        }
        this(s, s1);
    }

    public ServerValidationException(String s, String s1)
    {
        fieldName = s;
        message = s1;
    }

    public q a()
    {
        return new q(fieldName, message);
    }

    public String getMessage()
    {
        return message;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Validation Error: field = ").append(fieldName).append(", message = ").append(message).toString();
    }
}
