// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.gpuimage;

import android.opengl.GLES20;

// Referenced classes of package jp.co.cyberagent.android.gpuimage:
//            GPUImageTwoInputFilter

public class GPUImageGuideCoeA extends GPUImageTwoInputFilter
{

    public static final String GUIDECOEA_FRAGMENT_SHADER = "varying highp vec2 textureCoordinate;\n varying highp vec2 textureCoordinate2;\n\n uniform sampler2D inputImageTexture;\n uniform sampler2D inputImageTexture2;\n uniform highp float eps;\n \n void main()\n {\n     highp vec4 color1 = texture2D(inputImageTexture, textureCoordinate);\n     highp vec4 color2 = texture2D(inputImageTexture2, textureCoordinate2);\n     highp vec4 color3 = color1 * color1;\n     highp vec4 color4 = vec4(color2.rgb - color3.rgb, color2.a*color3.a);\n     highp vec4 color5 = vec4(color4.rgb / (color4.rgb+vec3(eps)), color4.a*color4.a);\n     gl_FragColor = color5;\n }";
    private int mEPSLocation;
    private float mEps;

    public GPUImageGuideCoeA()
    {
        super("varying highp vec2 textureCoordinate;\n varying highp vec2 textureCoordinate2;\n\n uniform sampler2D inputImageTexture;\n uniform sampler2D inputImageTexture2;\n uniform highp float eps;\n \n void main()\n {\n     highp vec4 color1 = texture2D(inputImageTexture, textureCoordinate);\n     highp vec4 color2 = texture2D(inputImageTexture2, textureCoordinate2);\n     highp vec4 color3 = color1 * color1;\n     highp vec4 color4 = vec4(color2.rgb - color3.rgb, color2.a*color3.a);\n     highp vec4 color5 = vec4(color4.rgb / (color4.rgb+vec3(eps)), color4.a*color4.a);\n     gl_FragColor = color5;\n }");
    }

    public GPUImageGuideCoeA(float f)
    {
        super("varying highp vec2 textureCoordinate;\n varying highp vec2 textureCoordinate2;\n\n uniform sampler2D inputImageTexture;\n uniform sampler2D inputImageTexture2;\n uniform highp float eps;\n \n void main()\n {\n     highp vec4 color1 = texture2D(inputImageTexture, textureCoordinate);\n     highp vec4 color2 = texture2D(inputImageTexture2, textureCoordinate2);\n     highp vec4 color3 = color1 * color1;\n     highp vec4 color4 = vec4(color2.rgb - color3.rgb, color2.a*color3.a);\n     highp vec4 color5 = vec4(color4.rgb / (color4.rgb+vec3(eps)), color4.a*color4.a);\n     gl_FragColor = color5;\n }");
        mEps = f;
    }

    public void onInit()
    {
        super.onInit();
        mEPSLocation = GLES20.glGetUniformLocation(getProgram(), "eps");
    }

    public void onInitialized()
    {
        super.onInitialized();
        setEPS(mEps);
    }

    public void setEPS(float f)
    {
        mEps = f;
        setFloat(mEPSLocation, mEps);
    }
}
