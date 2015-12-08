// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.media.effects;

import android.opengl.GLES20;
import com.skype.android.media.GLES20Program;

// Referenced classes of package com.skype.android.media.effects:
//            FaceDecorationRenderer

final class c extends GLES20Program
{

    final FaceDecorationRenderer a;
    private int b;
    private int c;
    private int d;
    private int e;

    static int a(c c1)
    {
        return c1.b;
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

    (FaceDecorationRenderer facedecorationrenderer)
    {
        a = facedecorationrenderer;
        super("uniform mat4 uMVPMatrix;\nuniform mat4 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uMVPMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n", "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
        int i = b();
        d = GLES20.glGetAttribLocation(i, "aPosition");
        e = GLES20.glGetAttribLocation(i, "aTextureCoord");
        b = GLES20.glGetUniformLocation(i, "uMVPMatrix");
        c = GLES20.glGetUniformLocation(i, "uTexMatrix");
    }
}
