// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.gpuimage;

import android.opengl.GLES20;
import java.util.List;

// Referenced classes of package jp.co.cyberagent.android.gpuimage:
//            GPUImageTwoPassTextureSamplingFilter, GPUImageFilter

public class GPUImageBoxBlurFilter2 extends GPUImageTwoPassTextureSamplingFilter
{

    public static final String FRAGMENT_SHADER = "precision highp float;\n\nconst int radius = 10;\nuniform sampler2D inputImageTexture;\n\nuniform float texelWidthOffset; \nuniform float texelHeightOffset; \nvarying vec2 centerTextureCoordinate;\n\nvoid main()\n{\n   highp vec4 fragmentColor = vec4(0.0);\n   for(int i=-radius; i <= radius; i++){       fragmentColor += texture2D(inputImageTexture, centerTextureCoordinate + float(i)*vec2(texelWidthOffset, texelHeightOffset)) / (2.0*float(radius)+1.0);\n   }\ngl_FragColor = fragmentColor;\n}\n";
    public static final String VERTEX_SHADER = "attribute vec4 position;\nattribute vec2 inputTextureCoordinate;\n\nvarying vec2 centerTextureCoordinate;\n\nvoid main()\n{\ngl_Position = position;\n\ncenterTextureCoordinate = inputTextureCoordinate;\n}\n";
    private float blurSize;
    private float mHeight;
    private float mWidth;

    public GPUImageBoxBlurFilter2(float f, int i, int j)
    {
        super("attribute vec4 position;\nattribute vec2 inputTextureCoordinate;\n\nvarying vec2 centerTextureCoordinate;\n\nvoid main()\n{\ngl_Position = position;\n\ncenterTextureCoordinate = inputTextureCoordinate;\n}\n", "precision highp float;\n\nconst int radius = 10;\nuniform sampler2D inputImageTexture;\n\nuniform float texelWidthOffset; \nuniform float texelHeightOffset; \nvarying vec2 centerTextureCoordinate;\n\nvoid main()\n{\n   highp vec4 fragmentColor = vec4(0.0);\n   for(int i=-radius; i <= radius; i++){       fragmentColor += texture2D(inputImageTexture, centerTextureCoordinate + float(i)*vec2(texelWidthOffset, texelHeightOffset)) / (2.0*float(radius)+1.0);\n   }\ngl_FragColor = fragmentColor;\n}\n", "attribute vec4 position;\nattribute vec2 inputTextureCoordinate;\n\nvarying vec2 centerTextureCoordinate;\n\nvoid main()\n{\ngl_Position = position;\n\ncenterTextureCoordinate = inputTextureCoordinate;\n}\n", "precision highp float;\n\nconst int radius = 10;\nuniform sampler2D inputImageTexture;\n\nuniform float texelWidthOffset; \nuniform float texelHeightOffset; \nvarying vec2 centerTextureCoordinate;\n\nvoid main()\n{\n   highp vec4 fragmentColor = vec4(0.0);\n   for(int i=-radius; i <= radius; i++){       fragmentColor += texture2D(inputImageTexture, centerTextureCoordinate + float(i)*vec2(texelWidthOffset, texelHeightOffset)) / (2.0*float(radius)+1.0);\n   }\ngl_FragColor = fragmentColor;\n}\n");
        blurSize = 1.0F;
        blurSize = f;
        mWidth = i;
        mHeight = j;
    }

    public GPUImageBoxBlurFilter2(int i, int j)
    {
        this(1.0F, i, j);
    }

    public float getHorizontalTexelOffsetRatio()
    {
        return 1.0F;
    }

    public float getVerticalTexelOffsetRatio()
    {
        return 1.0F;
    }

    protected void initTexelOffsets()
    {
        float f = getHorizontalTexelOffsetRatio();
        GPUImageFilter gpuimagefilter = (GPUImageFilter)mFilters.get(0);
        int i = GLES20.glGetUniformLocation(gpuimagefilter.getProgram(), "texelWidthOffset");
        int j = GLES20.glGetUniformLocation(gpuimagefilter.getProgram(), "texelHeightOffset");
        gpuimagefilter.setFloat(i, f / mWidth);
        gpuimagefilter.setFloat(j, 0.0F);
        f = getVerticalTexelOffsetRatio();
        gpuimagefilter = (GPUImageFilter)mFilters.get(1);
        i = GLES20.glGetUniformLocation(gpuimagefilter.getProgram(), "texelWidthOffset");
        j = GLES20.glGetUniformLocation(gpuimagefilter.getProgram(), "texelHeightOffset");
        gpuimagefilter.setFloat(i, 0.0F);
        gpuimagefilter.setFloat(j, f / mHeight);
    }

    public void onOutputSizeChanged(int i, int j)
    {
        initTexelOffsets();
    }

    public void setBlurSize(float f)
    {
        blurSize = f;
        runOnDraw(new _cls1());
    }

    private class _cls1
        implements Runnable
    {

        final GPUImageBoxBlurFilter2 this$0;

        public void run()
        {
            initTexelOffsets();
        }

        _cls1()
        {
            this$0 = GPUImageBoxBlurFilter2.this;
            super();
        }
    }

}
