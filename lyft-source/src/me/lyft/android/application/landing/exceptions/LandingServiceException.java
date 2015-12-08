// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.landing.exceptions;

import me.lyft.android.common.IHasReason;

public abstract class LandingServiceException extends Exception
    implements IHasReason
{

    public LandingServiceException()
    {
    }

    public LandingServiceException(String s, Throwable throwable)
    {
        super(s, throwable);
    }
}
