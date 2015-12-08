// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer;


public final class ExoPlaybackException extends Exception
{

    public final boolean caughtAtTopLevel;

    public ExoPlaybackException(String s)
    {
        super(s);
        caughtAtTopLevel = false;
    }

    public ExoPlaybackException(String s, Throwable throwable)
    {
        super(s, throwable);
        caughtAtTopLevel = false;
    }

    public ExoPlaybackException(Throwable throwable)
    {
        super(throwable);
        caughtAtTopLevel = false;
    }

    public ExoPlaybackException(Throwable throwable, byte byte0)
    {
        super(throwable);
        caughtAtTopLevel = true;
    }
}
