// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.media;

import android.opengl.GLES20;

// Referenced classes of package com.skype.android.media:
//            GLES20Program, GLES20Renderer

private final class n extends GLES20Program
{

    final GLES20Renderer a;
    private int b;
    private int c;
    private int d;
    private int e;

    static int a(n n)
    {
        return n.b;
    }

    static int b(b b1)
    {
        return b1.c;
    }

    static int c(c c1)
    {
        return c1.d;
    }

    static int d(d d1)
    {
        return d1.e;
    }

    (GLES20Renderer gles20renderer, String s)
    {
        a = gles20renderer;
        super("uniform mat4 uMVPMatrix;\nuniform mat4 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uMVPMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n", s);
        int i = b();
        d = GLES20.glGetAttribLocation(i, "aPosition");
        e = GLES20.glGetAttribLocation(i, "aTextureCoord");
        b = GLES20.glGetUniformLocation(i, "uMVPMatrix");
        c = GLES20.glGetUniformLocation(i, "uTexMatrix");
    }
}
