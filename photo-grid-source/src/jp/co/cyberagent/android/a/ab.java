// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.a;

import android.opengl.GLES20;

// Referenced classes of package jp.co.cyberagent.android.a:
//            aj, a

public final class ab extends aj
{

    public static final int y;

    public ab()
    {
        super("varying highp vec2 textureCoordinate;\n varying highp vec2 textureCoordinate2;\n\n uniform sampler2D inputImageTexture;\n uniform sampler2D inputImageTexture2;\n uniform lowp float alpha;\n \n void main()\n {\n     mediump vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n     mediump vec4 textureColor2 = texture2D(inputImageTexture2, textureCoordinate2);\n     mediump vec4 whiteColor = vec4(1.0);\n     gl_FragColor = (whiteColor - ((whiteColor - textureColor2) * (whiteColor - textureColor)))*alpha;\n }");
    }

    public final void c()
    {
        super.c();
        e = GLES20.glGetUniformLocation(p(), "alpha");
    }

    static 
    {
        y = a.K;
    }
}
