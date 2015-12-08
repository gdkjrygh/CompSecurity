// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.codec.encoder.camera.gl;

import android.opengl.EGL14;
import android.opengl.EGLObjectHandle;

// Referenced classes of package com.skype.android.video.hw.codec.encoder.camera.gl:
//            GLException

public final class EGLUtils
{

    public EGLUtils()
    {
    }

    public static String idStringOf(EGLObjectHandle eglobjecthandle)
    {
        if (eglobjecthandle == null)
        {
            return "null";
        } else
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append(eglobjecthandle.getClass().getSimpleName());
            stringbuilder.append("@0x");
            stringbuilder.append(Integer.toHexString(eglobjecthandle.hashCode()));
            return stringbuilder.toString();
        }
    }

    public static void validate(String s)
        throws GLException
    {
        int i = EGL14.eglGetError();
        if (i != 12288)
        {
            throw new GLException(s, i);
        } else
        {
            return;
        }
    }
}
