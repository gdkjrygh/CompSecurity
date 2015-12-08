// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.gpuimage;


// Referenced classes of package jp.co.cyberagent.android.gpuimage:
//            GPUImageMixBlendFilter

public class GPUImageAlphaBlendFilter2 extends GPUImageMixBlendFilter
{

    public static final String ALPHA2_BLEND_FRAGMENT_SHADER = "varying highp vec2 textureCoordinate;\n varying highp vec2 textureCoordinate2;\n\n uniform sampler2D inputImageTexture;\n uniform sampler2D inputImageTexture2;\n \n uniform lowp float mixturePercent;\n\n void main()\n {\n   highp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n   highp vec4 textureColor2 = texture2D(inputImageTexture2, textureCoordinate2);\n\n   gl_FragColor = vec4(mix(textureColor.rgb, textureColor2.rgb, 1.0-textureColor.a), textureColor2.a);\n }";

    public GPUImageAlphaBlendFilter2()
    {
        super("varying highp vec2 textureCoordinate;\n varying highp vec2 textureCoordinate2;\n\n uniform sampler2D inputImageTexture;\n uniform sampler2D inputImageTexture2;\n \n uniform lowp float mixturePercent;\n\n void main()\n {\n   highp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n   highp vec4 textureColor2 = texture2D(inputImageTexture2, textureCoordinate2);\n\n   gl_FragColor = vec4(mix(textureColor.rgb, textureColor2.rgb, 1.0-textureColor.a), textureColor2.a);\n }");
    }

    public GPUImageAlphaBlendFilter2(float f)
    {
        super("varying highp vec2 textureCoordinate;\n varying highp vec2 textureCoordinate2;\n\n uniform sampler2D inputImageTexture;\n uniform sampler2D inputImageTexture2;\n \n uniform lowp float mixturePercent;\n\n void main()\n {\n   highp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n   highp vec4 textureColor2 = texture2D(inputImageTexture2, textureCoordinate2);\n\n   gl_FragColor = vec4(mix(textureColor.rgb, textureColor2.rgb, 1.0-textureColor.a), textureColor2.a);\n }", f);
        mUseSrcTex = false;
    }

    public GPUImageAlphaBlendFilter2(boolean flag)
    {
        super("varying highp vec2 textureCoordinate;\n varying highp vec2 textureCoordinate2;\n\n uniform sampler2D inputImageTexture;\n uniform sampler2D inputImageTexture2;\n \n uniform lowp float mixturePercent;\n\n void main()\n {\n   highp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n   highp vec4 textureColor2 = texture2D(inputImageTexture2, textureCoordinate2);\n\n   gl_FragColor = vec4(mix(textureColor.rgb, textureColor2.rgb, 1.0-textureColor.a), textureColor2.a);\n }");
        mUseSrcTex = flag;
        isUseSrcTex = true;
    }
}
