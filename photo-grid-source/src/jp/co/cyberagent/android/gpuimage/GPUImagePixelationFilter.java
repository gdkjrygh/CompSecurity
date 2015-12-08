// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.gpuimage;

import android.opengl.GLES20;

// Referenced classes of package jp.co.cyberagent.android.gpuimage:
//            GPUImageFilter

public class GPUImagePixelationFilter extends GPUImageFilter
{

    public static final String PIXELATION_FRAGMENT_SHADER = "precision highp float;\nvarying vec2 textureCoordinate;\nuniform float imageWidthFactor;\nuniform float imageHeightFactor;\nuniform sampler2D inputImageTexture;\nuniform float pixel;\nvoid main()\n{\n  vec2 uv  = textureCoordinate.xy;\n  float dx = pixel * imageWidthFactor;\n  float dy = pixel * imageHeightFactor;\n  vec2 coord = vec2(dx * floor(uv.x / dx), dy * floor(uv.y / dy));\n  vec3 tc = texture2D(inputImageTexture, coord).xyz;\n  gl_FragColor = vec4(tc, 1.0);\n}";
    private int mImageHeightFactorLocation;
    private int mImageWidthFactorLocation;
    private float mPixel;
    private int mPixelLocation;

    public GPUImagePixelationFilter()
    {
        super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "precision highp float;\nvarying vec2 textureCoordinate;\nuniform float imageWidthFactor;\nuniform float imageHeightFactor;\nuniform sampler2D inputImageTexture;\nuniform float pixel;\nvoid main()\n{\n  vec2 uv  = textureCoordinate.xy;\n  float dx = pixel * imageWidthFactor;\n  float dy = pixel * imageHeightFactor;\n  vec2 coord = vec2(dx * floor(uv.x / dx), dy * floor(uv.y / dy));\n  vec3 tc = texture2D(inputImageTexture, coord).xyz;\n  gl_FragColor = vec4(tc, 1.0);\n}");
        mPixel = 1.0F;
    }

    public void onInit()
    {
        super.onInit();
        mImageWidthFactorLocation = GLES20.glGetUniformLocation(getProgram(), "imageWidthFactor");
        mImageHeightFactorLocation = GLES20.glGetUniformLocation(getProgram(), "imageHeightFactor");
        mPixelLocation = GLES20.glGetUniformLocation(getProgram(), "pixel");
        setPixel(mPixel);
    }

    public void onOutputSizeChanged(int i, int j)
    {
        super.onOutputSizeChanged(i, j);
        setFloat(mImageWidthFactorLocation, 1.0F / (float)i);
        setFloat(mImageHeightFactorLocation, 1.0F / (float)j);
    }

    public void setPixel(float f)
    {
        mPixel = f;
        setFloat(mPixelLocation, mPixel);
    }
}
