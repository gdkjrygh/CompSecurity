// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.codec.encoder.camera.gl;


public class GLException extends Exception
{

    private static final long serialVersionUID = 1L;

    GLException(String s)
    {
        super(s);
    }

    public GLException(String s, int i)
    {
        super((new StringBuilder()).append(s).append(" Error: 0x").append(Integer.toHexString(i)).toString());
    }

    public GLException(String s, Throwable throwable)
    {
        super(s, throwable);
    }

    public GLException(Throwable throwable)
    {
        super(throwable);
    }
}
