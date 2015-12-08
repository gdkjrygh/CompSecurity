// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.gpuimage;

import android.opengl.GLES20;

// Referenced classes of package jp.co.cyberagent.android.gpuimage:
//            GPUImageFilter

public class GPUImageSaturationFilter extends GPUImageFilter
{

    public static final String SATURATION_FRAGMENT_SHADER = " varying highp vec2 textureCoordinate;\n \n uniform sampler2D inputImageTexture;\n uniform lowp float saturation;\n uniform lowp float alpha;\n \n // Values from \"Graphics Shaders: Theory and Practice\" by Bailey and Cunningham\n const mediump vec3 luminanceWeighting = vec3(0.2125, 0.7154, 0.0721);\n \n void main()\n {\n    lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n    lowp float luminance = dot(textureColor.rgb, luminanceWeighting);\n    lowp vec3 greyScaleColor = vec3(luminance);\n    \n    gl_FragColor = vec4(mix(greyScaleColor, textureColor.rgb, saturation)*alpha, textureColor.w);\n     \n }";
    private float mAlpha;
    private int mAlphaLocation;
    private float mSaturation;
    private int mSaturationLocation;

    public GPUImageSaturationFilter()
    {
        this(1.0F, 1.0F);
    }

    public GPUImageSaturationFilter(float f)
    {
        this(f, 1.0F);
    }

    public GPUImageSaturationFilter(float f, float f1)
    {
        super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", " varying highp vec2 textureCoordinate;\n \n uniform sampler2D inputImageTexture;\n uniform lowp float saturation;\n uniform lowp float alpha;\n \n // Values from \"Graphics Shaders: Theory and Practice\" by Bailey and Cunningham\n const mediump vec3 luminanceWeighting = vec3(0.2125, 0.7154, 0.0721);\n \n void main()\n {\n    lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n    lowp float luminance = dot(textureColor.rgb, luminanceWeighting);\n    lowp vec3 greyScaleColor = vec3(luminance);\n    \n    gl_FragColor = vec4(mix(greyScaleColor, textureColor.rgb, saturation)*alpha, textureColor.w);\n     \n }");
        mSaturation = f;
        mAlpha = f1;
    }

    public void onInit()
    {
        super.onInit();
        mSaturationLocation = GLES20.glGetUniformLocation(getProgram(), "saturation");
        mAlphaLocation = GLES20.glGetUniformLocation(getProgram(), "alpha");
    }

    public void onInitialized()
    {
        super.onInitialized();
        setSaturation(mSaturation);
        setAlpha(mAlpha);
    }

    public void setAlpha(float f)
    {
        mAlpha = f;
        setFloat(mAlphaLocation, mAlpha);
    }

    public void setSaturation(float f)
    {
        mSaturation = f;
        setFloat(mSaturationLocation, mSaturation);
    }
}
