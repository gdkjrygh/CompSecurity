// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.media.effects;

import android.opengl.GLES20;
import com.skype.android.media.GLES20Program;

// Referenced classes of package com.skype.android.media.effects:
//            DoodleRenderer

private final class b extends GLES20Program
{

    final DoodleRenderer a;
    private int b;
    private int c;
    private int d;

    static int a(b b1)
    {
        return b1.c;
    }

    static int b(c c1)
    {
        return c1.d;
    }

    static int c(d d1)
    {
        return d1.b;
    }

    (DoodleRenderer doodlerenderer)
    {
        a = doodlerenderer;
        super("precision mediump float;                                     \nuniform mat4 uMVPMatrix;                                     \nattribute vec3 a_position;                                   \nattribute vec3 a_color;                                      \nvarying vec3 vertex_color;                                   \nvoid main()                                                  \n{                                                    \n   vec4 pos = vec4(a_position, 1.0);                 \n   gl_Position = uMVPMatrix*pos;                     \n   vertex_color = a_color;                           \n   gl_PointSize = 8.0;                               \n}", "precision mediump float;                                     \nvarying vec3 vertex_color;                                   \nvoid main()                                                  \n{                                                            \n  gl_FragColor = vec4(vertex_color, 1.0f);                   \n}                                                            \n");
        int i = b();
        c = GLES20.glGetAttribLocation(i, "a_position");
        d = GLES20.glGetAttribLocation(i, "a_color");
        b = GLES20.glGetUniformLocation(i, "uMVPMatrix");
    }
}
