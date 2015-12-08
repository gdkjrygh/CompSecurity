// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.gpuimage;

import android.opengl.GLES20;

// Referenced classes of package jp.co.cyberagent.android.gpuimage:
//            GPUImageFilter

public class GPUImageGammaFilter extends GPUImageFilter
{

    public static final String GAMMA_FRAGMENT_SHADER = "varying highp vec2 textureCoordinate;\n \n uniform sampler2D inputImageTexture;\n uniform lowp float gamma;\n \n void main()\n {\n     lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n     \n     gl_FragColor = vec4(pow(textureColor.rgb, vec3(gamma)), textureColor.w);\n }";
    private float mGamma;
    private int mGammaLocation;

    public GPUImageGammaFilter()
    {
        this(1.2F);
    }

    public GPUImageGammaFilter(float f)
    {
        super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "varying highp vec2 textureCoordinate;\n \n uniform sampler2D inputImageTexture;\n uniform lowp float gamma;\n \n void main()\n {\n     lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n     \n     gl_FragColor = vec4(pow(textureColor.rgb, vec3(gamma)), textureColor.w);\n }");
        mGamma = f;
    }

    public void onInit()
    {
        super.onInit();
        mGammaLocation = GLES20.glGetUniformLocation(getProgram(), "gamma");
    }

    public void onInitialized()
    {
        super.onInitialized();
        setGamma(mGamma);
    }

    public void setGamma(float f)
    {
        mGamma = f;
        setFloat(mGammaLocation, mGamma);
    }
}
