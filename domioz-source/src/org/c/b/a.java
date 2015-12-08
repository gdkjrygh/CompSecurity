// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.b;


public abstract class a
{

    public a()
    {
    }

    public static String buildMessage(String s, Throwable throwable)
    {
        Object obj = s;
        if (throwable != null)
        {
            obj = new StringBuilder();
            if (s != null)
            {
                ((StringBuilder) (obj)).append(s).append("; ");
            }
            ((StringBuilder) (obj)).append("nested exception is ").append(throwable);
            obj = ((StringBuilder) (obj)).toString();
        }
        return ((String) (obj));
    }
}
