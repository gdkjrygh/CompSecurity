// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.push;


public class PushRegistrationException extends RuntimeException
{

    public PushRegistrationException(Exception exception)
    {
        super(exception);
    }

    public PushRegistrationException(String s)
    {
        super(s);
    }
}
