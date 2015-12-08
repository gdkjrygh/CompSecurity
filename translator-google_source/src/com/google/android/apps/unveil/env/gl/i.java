// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.env.gl;

import android.opengl.GLES20;
import com.google.android.apps.unveil.env.af;
import java.nio.IntBuffer;

public final class i
{

    final int a;
    private final af b = new af();
    private final String c;
    private boolean d;

    public i(String s, int j, String s1)
    {
        c = s;
        a = GLES20.glCreateShader(j);
        d = true;
        GLES20.glShaderSource(a, s1);
        GLES20.glCompileShader(a);
        s = new int[1];
        GLES20.glGetShaderiv(a, 35713, IntBuffer.wrap(s));
        if (s[0] == 1)
        {
            b.b("Shader %s compiled successfully.", new Object[] {
                c
            });
            return;
        } else
        {
            s = GLES20.glGetShaderInfoLog(a);
            b.e("Shader %s did not compile:\n%s", new Object[] {
                c, s
            });
            s = c;
            throw new RuntimeException((new StringBuilder(String.valueOf(s).length() + 25)).append("Shader ").append(s).append(" failed to compile").toString());
        }
    }

    protected final void finalize()
    {
        if (d)
        {
            d = false;
            GLES20.glDeleteShader(a);
        }
        super.finalize();
        return;
        Exception exception;
        exception;
        super.finalize();
        throw exception;
    }
}
