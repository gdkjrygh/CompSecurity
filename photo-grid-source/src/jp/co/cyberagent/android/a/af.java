// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.a;

import android.opengl.GLES20;

// Referenced classes of package jp.co.cyberagent.android.a:
//            h

public final class af extends h
{

    private float y;
    private int z;

    public af()
    {
        this((byte)0);
    }

    private af(byte byte0)
    {
        super("uniform mat4 uMVPMatrix;\nattribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = uMVPMatrix*position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "precision highp float;\n\nvarying vec2 textureCoordinate;\n\nuniform sampler2D inputImageTexture;\nuniform highp float threshold;\n\nconst highp vec3 W = vec3(0.2125, 0.7154, 0.0721);\n\nvoid main()\n{\n  lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n  float luminance = dot(textureColor.rgb, W);\n\n  float color = luminance > threshold ? 1.0:0.0;\n  gl_FragColor = vec4(vec3(color), textureColor.a);\n}");
        y = 0.5F;
    }

    public final void c()
    {
        super.c();
        z = GLES20.glGetUniformLocation(p(), "threshold");
    }

    public final void d()
    {
        super.d();
        y = y;
        if (z != -1)
        {
            a(z, y);
        }
    }
}
