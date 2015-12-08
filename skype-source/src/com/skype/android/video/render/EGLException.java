// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.render;

import android.opengl.EGL14;

class EGLException extends RuntimeException
{

    EGLException(int i)
    {
        super((new StringBuilder("EGL error: ")).append(i).toString());
    }

    EGLException(int i, String s)
    {
        super((new StringBuilder("EGL error: ")).append(i).append(" ").append(s).toString());
    }

    EGLException(String s)
    {
        super(s);
    }

    static void check(String s)
    {
        int i = EGL14.eglGetError();
        if (i != 12288)
        {
            throw new EGLException(i, s);
        } else
        {
            return;
        }
    }
}
