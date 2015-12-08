// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.gpuimage;


// Referenced classes of package jp.co.cyberagent.android.gpuimage:
//            GPUImageTwoInputFilter

public class GPUImageMulityply extends GPUImageTwoInputFilter
{

    public static final String MULITPLY_FRAGMENT_SHADER = "varying highp vec2 textureCoordinate;\n varying highp vec2 textureCoordinate2;\n\n uniform sampler2D inputImageTexture;\n uniform sampler2D inputImageTexture2;\n \n void main()\n {\n     highp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n     highp vec4 textureColor2 = texture2D(inputImageTexture2, textureCoordinate2);\n     gl_FragColor = vec4(textureColor.rgb * textureColor2.rgb, textureColor.a*textureColor2.a);\n }";

    public GPUImageMulityply()
    {
        super("varying highp vec2 textureCoordinate;\n varying highp vec2 textureCoordinate2;\n\n uniform sampler2D inputImageTexture;\n uniform sampler2D inputImageTexture2;\n \n void main()\n {\n     highp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n     highp vec4 textureColor2 = texture2D(inputImageTexture2, textureCoordinate2);\n     gl_FragColor = vec4(textureColor.rgb * textureColor2.rgb, textureColor.a*textureColor2.a);\n }");
    }
}
