// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.a;

import android.opengl.GLES20;

// Referenced classes of package jp.co.cyberagent.android.a:
//            h

public final class z extends h
{

    private String y;
    private int z;

    public z()
    {
        super("uniform mat4 uMVPMatrix;\nattribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = uMVPMatrix*position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "varying highp vec2 textureCoordinate;\n varying highp vec2 textureCoordinate2;\n\n uniform sampler2D inputImageTexture;\n uniform highp vec4 overlay;\n \n void main()\n {\n     mediump vec4 base = texture2D(inputImageTexture, textureCoordinate);\n     \n     mediump float ra;\n     if (2.0 * base.r < base.a) {\n         ra = 2.0 * overlay.r * base.r + overlay.r * (1.0 - base.a) + base.r * (1.0 - overlay.a);\n     } else {\n         ra = overlay.a * base.a - 2.0 * (base.a - base.r) * (overlay.a - overlay.r) + overlay.r * (1.0 - base.a) + base.r * (1.0 - overlay.a);\n     }\n     \n     mediump float ga;\n     if (2.0 * base.g < base.a) {\n         ga = 2.0 * overlay.g * base.g + overlay.g * (1.0 - base.a) + base.g * (1.0 - overlay.a);\n     } else {\n         ga = overlay.a * base.a - 2.0 * (base.a - base.g) * (overlay.a - overlay.g) + overlay.g * (1.0 - base.a) + base.g * (1.0 - overlay.a);\n     }\n     \n     mediump float ba;\n     if (2.0 * base.b < base.a) {\n         ba = 2.0 * overlay.b * base.b + overlay.b * (1.0 - base.a) + base.b * (1.0 - overlay.a);\n     } else {\n         ba = overlay.a * base.a - 2.0 * (base.a - base.b) * (overlay.a - overlay.b) + overlay.b * (1.0 - base.a) + base.b * (1.0 - overlay.a);\n     }\n     \n     gl_FragColor = vec4(ra, ga, ba, 1.0);\n }");
    }

    public final void a(String s)
    {
        y = s;
        int i = Integer.parseInt(s.replaceFirst("#", ""), 16);
        float f = (float)((0xff0000 & i) >> 16) / 255F;
        float f1 = (float)((0xff00 & i) >> 8) / 255F;
        float f2 = (float)(i & 0xff) / 255F;
        if (z != -1)
        {
            a(z, new float[] {
                f, f1, f2, 1.0F
            });
        }
    }

    public final void c()
    {
        super.c();
        z = GLES20.glGetUniformLocation(p(), "overlay");
    }

    public final void d()
    {
        super.d();
    }
}
