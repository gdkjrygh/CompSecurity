// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.gpuimage;

import android.opengl.GLES20;

// Referenced classes of package jp.co.cyberagent.android.gpuimage:
//            GPUImageFilter

public class GPUImageExposureFilter extends GPUImageFilter
{

    public static final String EXPOSURE_FRAGMENT_SHADER = " varying highp vec2 textureCoordinate;\n \n uniform sampler2D inputImageTexture;\n uniform highp float exposure;\n \n void main()\n {\n     highp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n     \n     gl_FragColor = vec4(textureColor.rgb * pow(2.0, exposure), textureColor.w);\n } ";
    private float mExposure;
    private int mExposureLocation;

    public GPUImageExposureFilter()
    {
        this(1.0F);
    }

    public GPUImageExposureFilter(float f)
    {
        super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", " varying highp vec2 textureCoordinate;\n \n uniform sampler2D inputImageTexture;\n uniform highp float exposure;\n \n void main()\n {\n     highp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n     \n     gl_FragColor = vec4(textureColor.rgb * pow(2.0, exposure), textureColor.w);\n } ");
        mExposure = f;
    }

    public void onInit()
    {
        super.onInit();
        mExposureLocation = GLES20.glGetUniformLocation(getProgram(), "exposure");
    }

    public void onInitialized()
    {
        super.onInitialized();
        setExposure(mExposure);
    }

    public void setExposure(float f)
    {
        mExposure = f;
        setFloat(mExposureLocation, mExposure);
    }
}
