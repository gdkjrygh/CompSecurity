// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.codec.encoder.camera.capture;


public class CapturerException extends Exception
{

    private static final long serialVersionUID = 1L;

    CapturerException(String s)
    {
        super(s);
    }

    CapturerException(String s, Throwable throwable)
    {
        super(s, throwable);
    }

    public CapturerException(Throwable throwable)
    {
        super(throwable);
    }
}
