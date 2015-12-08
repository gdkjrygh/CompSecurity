// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.media;

import android.opengl.EGL14;

final class i extends RuntimeException
{

    i(int j, String s)
    {
        super((new StringBuilder("EGL error: ")).append(j).append(" ").append(s).toString());
    }

    i(String s)
    {
        super(s);
    }

    static void a(String s)
    {
        int j = EGL14.eglGetError();
        if (j != 12288)
        {
            throw new i(j, s);
        } else
        {
            return;
        }
    }
}
