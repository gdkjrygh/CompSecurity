// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.gpuimage;

import android.opengl.GLES20;

// Referenced classes of package jp.co.cyberagent.android.gpuimage:
//            GPUImageFilter

public class GPUImageColorMatrixFilter extends GPUImageFilter
{

    public static final String COLOR_MATRIX_FRAGMENT_SHADER = "varying highp vec2 textureCoordinate;\n\nuniform sampler2D inputImageTexture;\n\nuniform lowp mat4 colorMatrix;\nuniform lowp float intensity;\n\nvoid main()\n{\n    lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n    lowp vec4 outputColor = textureColor * colorMatrix;\n    \n    gl_FragColor = (intensity * outputColor) + ((1.0 - intensity) * textureColor);\n}";
    private float mColorMatrix[];
    private int mColorMatrixLocation;
    private float mIntensity;
    private int mIntensityLocation;

    public GPUImageColorMatrixFilter()
    {
        this(1.0F, new float[] {
            1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 
            1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F
        });
    }

    public GPUImageColorMatrixFilter(float f, float af[])
    {
        super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "varying highp vec2 textureCoordinate;\n\nuniform sampler2D inputImageTexture;\n\nuniform lowp mat4 colorMatrix;\nuniform lowp float intensity;\n\nvoid main()\n{\n    lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n    lowp vec4 outputColor = textureColor * colorMatrix;\n    \n    gl_FragColor = (intensity * outputColor) + ((1.0 - intensity) * textureColor);\n}");
        mIntensity = f;
        mColorMatrix = af;
    }

    public void onInit()
    {
        super.onInit();
        mColorMatrixLocation = GLES20.glGetUniformLocation(getProgram(), "colorMatrix");
        mIntensityLocation = GLES20.glGetUniformLocation(getProgram(), "intensity");
    }

    public void onInitialized()
    {
        super.onInitialized();
        setIntensity(mIntensity);
        setColorMatrix(mColorMatrix);
    }

    public void setColorMatrix(float af[])
    {
        mColorMatrix = af;
        setUniformMatrix4f(mColorMatrixLocation, af);
    }

    public void setIntensity(float f)
    {
        mIntensity = f;
        setFloat(mIntensityLocation, f);
    }
}
