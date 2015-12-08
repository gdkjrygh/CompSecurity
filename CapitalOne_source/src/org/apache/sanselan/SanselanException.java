// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.sanselan;


public class SanselanException extends Exception
{

    public SanselanException(String s)
    {
        super(s);
    }

    public SanselanException(String s, Exception exception)
    {
        super(s, exception);
    }
}
