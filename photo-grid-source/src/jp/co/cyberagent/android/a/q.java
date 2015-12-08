// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.a;

import android.opengl.GLES20;

// Referenced classes of package jp.co.cyberagent.android.a:
//            h

public final class q extends h
{

    private int y;
    private int z;

    public q()
    {
        this((byte)0);
    }

    private q(byte byte0)
    {
        super("uniform mat4 uMVPMatrix;\nattribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = uMVPMatrix*position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "varying highp vec2 textureCoordinate;\n \n uniform sampler2D inputImageTexture;\n uniform highp vec4 luminosity;\n \n void main()\n {\n     lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n     \n     gl_FragColor = vec4(mix(textureColor.rgb , luminosity.rgb*textureColor.a, luminosity.a), textureColor.w);\n }");
        y = 0;
    }

    public final void a(int i)
    {
        y = i;
        float af[] = new float[4];
        float[] _tmp = af;
        af[0] = 0.0F;
        af[1] = 0.0F;
        af[2] = 0.0F;
        af[3] = 0.0F;
        if (i >= 0)
        {
            af[0] = 1.0F;
            af[1] = 1.0F;
            af[2] = 1.0F;
            af[3] = (float)y / 100F;
        } else
        {
            af[0] = 0.0F;
            af[1] = 0.0F;
            af[2] = 0.0F;
            af[3] = (float)(-y) / 100F;
        }
        if (z != -1)
        {
            a(z, af);
        }
    }

    public final void c()
    {
        super.c();
        z = GLES20.glGetUniformLocation(p(), "luminosity");
    }

    public final void d()
    {
        super.d();
        a(y);
    }
}
