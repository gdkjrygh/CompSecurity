// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.a;

import android.opengl.GLES20;

// Referenced classes of package jp.co.cyberagent.android.a:
//            h

public final class w extends h
{

    private int A;
    private int B;
    private String y;
    private float z;

    public w()
    {
        this("#000000");
    }

    private w(String s)
    {
        super("uniform mat4 uMVPMatrix;\nattribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = uMVPMatrix*position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "varying highp vec2 textureCoordinate;\n varying highp vec2 textureCoordinate2;\n\n uniform sampler2D inputImageTexture;\n uniform highp vec4 screenColor;\n uniform highp float alpha;\n \n void main()\n {\n     lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n     \n     gl_FragColor = vec4(mix(textureColor.rgb, screenColor.rgb, alpha), textureColor.a);\n }");
        y = s;
        z = 0.0F;
    }

    public final void a(String s, float f)
    {
        y = s;
        z = f;
        int i = Integer.parseInt(s.replaceFirst("#", ""), 16);
        float f1 = (float)((0xff0000 & i) >> 16) / 255F;
        float f2 = (float)((0xff00 & i) >> 8) / 255F;
        float f3 = (float)(i & 0xff) / 255F;
        if (A != -1)
        {
            a(A, new float[] {
                f1, f2, f3, 1.0F
            });
        }
        if (B != -1)
        {
            a(B, f);
        }
    }

    public final void c()
    {
        super.c();
        A = GLES20.glGetUniformLocation(p(), "screenColor");
        B = GLES20.glGetUniformLocation(p(), "alpha");
    }

    public final void d()
    {
        super.d();
        a(y, z);
    }
}
