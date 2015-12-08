// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.gpuimage;

import android.opengl.GLES20;

// Referenced classes of package jp.co.cyberagent.android.gpuimage:
//            GPUImageFilter

public class GPUImageLuminosityFilter extends GPUImageFilter
{

    public static final String LIGHTNESS_FRAGMENT_SHADER = "varying highp vec2 textureCoordinate;\n \n uniform sampler2D inputImageTexture;\n uniform highp vec4 luminosity;\n \n void main()\n {\n     lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n     \n     gl_FragColor = vec4(mix(textureColor.rgb , luminosity.rgb*textureColor.a, luminosity.a), textureColor.w);\n }";
    private int mLuminosity;
    private int mLuminosityLocation;

    public GPUImageLuminosityFilter()
    {
        this(0);
    }

    public GPUImageLuminosityFilter(int i)
    {
        super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "varying highp vec2 textureCoordinate;\n \n uniform sampler2D inputImageTexture;\n uniform highp vec4 luminosity;\n \n void main()\n {\n     lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n     \n     gl_FragColor = vec4(mix(textureColor.rgb , luminosity.rgb*textureColor.a, luminosity.a), textureColor.w);\n }");
        mLuminosity = i;
    }

    public void onInit()
    {
        super.onInit();
        mLuminosityLocation = GLES20.glGetUniformLocation(getProgram(), "luminosity");
    }

    public void onInitialized()
    {
        super.onInitialized();
        setLuminosity(mLuminosity);
    }

    public void setLuminosity(int i)
    {
        mLuminosity = i;
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
            af[3] = (float)mLuminosity / 100F;
            setFloatVec4(mLuminosityLocation, af);
            return;
        } else
        {
            af[0] = 0.0F;
            af[1] = 0.0F;
            af[2] = 0.0F;
            af[3] = (float)(-mLuminosity) / 100F;
            setFloatVec4(mLuminosityLocation, af);
            return;
        }
    }
}
