// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.gpuimage;

import android.opengl.GLES20;

// Referenced classes of package jp.co.cyberagent.android.gpuimage:
//            GPUImageTwoInputFilter

public class GPUImageDivideFilter extends GPUImageTwoInputFilter
{

    public static final String DIVIDE_FRAGMENT_SHADER = "varying highp vec2 textureCoordinate;\n varying highp vec2 textureCoordinate2;\n\n uniform sampler2D inputImageTexture;\n uniform sampler2D inputImageTexture2;\n uniform highp float eps;\n \n void main()\n {\n     mediump vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n     mediump vec4 textureColor2 = texture2D(inputImageTexture2, textureCoordinate2);\n     gl_FragColor = vec4(textureColor.rgb / (textureColor2.rgb+vec3(eps)), textureColor.a*textureColor2.a);\n }";
    private int mEPSLocation;
    private float mEps;

    public GPUImageDivideFilter()
    {
        this(0.01F);
    }

    public GPUImageDivideFilter(float f)
    {
        super("varying highp vec2 textureCoordinate;\n varying highp vec2 textureCoordinate2;\n\n uniform sampler2D inputImageTexture;\n uniform sampler2D inputImageTexture2;\n uniform highp float eps;\n \n void main()\n {\n     mediump vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n     mediump vec4 textureColor2 = texture2D(inputImageTexture2, textureCoordinate2);\n     gl_FragColor = vec4(textureColor.rgb / (textureColor2.rgb+vec3(eps)), textureColor.a*textureColor2.a);\n }");
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
