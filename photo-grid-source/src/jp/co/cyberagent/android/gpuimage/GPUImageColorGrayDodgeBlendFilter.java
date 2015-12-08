// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.gpuimage;


// Referenced classes of package jp.co.cyberagent.android.gpuimage:
//            GPUImageTwoInputFilter

public class GPUImageColorGrayDodgeBlendFilter extends GPUImageTwoInputFilter
{

    public static final String COLOR_GRAY_DODGE_BLEND_FRAGMENT_SHADER = "precision mediump float;\n \n varying highp vec2 textureCoordinate;\n varying highp vec2 textureCoordinate2;\n \n uniform sampler2D inputImageTexture;\n uniform sampler2D inputImageTexture2;\n \n void main()\n {\n\t  const highp vec3 W = vec3(0.2125, 0.7154, 0.0721);\n     vec4 base = texture2D(inputImageTexture2, textureCoordinate2);\n     vec4 overlay = texture2D(inputImageTexture, textureCoordinate);\n  \t  float luminance = dot(base.rgb, W);\n\t  base = vec4(luminance);\t\n\t  vec4 result = base + base*overlay / (vec4(1.0)-overlay);\n\t  result.r = clamp(result.r, 0.0,1.0);\n\t  result.g = clamp(result.g, 0.0,1.0);\n\t  result.b = clamp(result.b, 0.0,1.0);\n     gl_FragColor = vec4(result.rgb, 1.0);\n }";

    public GPUImageColorGrayDodgeBlendFilter()
    {
        this(false);
    }

    public GPUImageColorGrayDodgeBlendFilter(boolean flag)
    {
        boolean flag1 = true;
        super("precision mediump float;\n \n varying highp vec2 textureCoordinate;\n varying highp vec2 textureCoordinate2;\n \n uniform sampler2D inputImageTexture;\n uniform sampler2D inputImageTexture2;\n \n void main()\n {\n\t  const highp vec3 W = vec3(0.2125, 0.7154, 0.0721);\n     vec4 base = texture2D(inputImageTexture2, textureCoordinate2);\n     vec4 overlay = texture2D(inputImageTexture, textureCoordinate);\n  \t  float luminance = dot(base.rgb, W);\n\t  base = vec4(luminance);\t\n\t  vec4 result = base + base*overlay / (vec4(1.0)-overlay);\n\t  result.r = clamp(result.r, 0.0,1.0);\n\t  result.g = clamp(result.g, 0.0,1.0);\n\t  result.b = clamp(result.b, 0.0,1.0);\n     gl_FragColor = vec4(result.rgb, 1.0);\n }");
        mUseSrcTex = true;
        if (!flag)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        isUseSrcTex = flag;
    }
}
