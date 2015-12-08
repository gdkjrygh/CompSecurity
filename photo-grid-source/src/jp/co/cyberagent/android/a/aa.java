// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.a;

import android.opengl.GLES20;

// Referenced classes of package jp.co.cyberagent.android.a:
//            h

public final class aa extends h
{

    private float A;
    private int B;
    private int y;
    private float z;

    public aa()
    {
        this(1.0F, (byte)0);
    }

    public aa(float f)
    {
        this(f, (byte)0);
    }

    private aa(float f, byte byte0)
    {
        super("uniform mat4 uMVPMatrix;\nattribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = uMVPMatrix*position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", " varying highp vec2 textureCoordinate;\n \n uniform sampler2D inputImageTexture;\n uniform lowp float saturation;\n uniform lowp float alpha;\n \n // Values from \"Graphics Shaders: Theory and Practice\" by Bailey and Cunningham\n const mediump vec3 luminanceWeighting = vec3(0.2125, 0.7154, 0.0721);\n \n void main()\n {\n    lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n    lowp float luminance = dot(textureColor.rgb, luminanceWeighting);\n    lowp vec3 greyScaleColor = vec3(luminance);\n    \n    gl_FragColor = vec4(mix(greyScaleColor, textureColor.rgb, saturation), textureColor.w);\n     \n }");
        z = f;
        A = 1.0F;
    }

    public final void a(float f)
    {
        z = f;
        if (y != -1)
        {
            a(y, z);
        }
    }

    public final void c()
    {
        super.c();
        y = GLES20.glGetUniformLocation(p(), "saturation");
        B = GLES20.glGetUniformLocation(p(), "alpha");
    }

    public final void d()
    {
        super.d();
        a(z);
        e(A);
    }

    public final void e(float f)
    {
        A = f;
        if (B != -1)
        {
            a(B, A);
        }
    }
}
