// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.concurrency;


public class UnmetDependencyException extends RuntimeException
{

    public UnmetDependencyException()
    {
    }

    public UnmetDependencyException(String s)
    {
        super(s);
    }

    public UnmetDependencyException(Throwable throwable)
    {
        super(throwable);
    }
}
