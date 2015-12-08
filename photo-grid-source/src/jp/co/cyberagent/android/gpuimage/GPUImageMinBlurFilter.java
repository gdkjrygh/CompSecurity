// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.gpuimage;

import android.opengl.GLES20;
import java.util.List;

// Referenced classes of package jp.co.cyberagent.android.gpuimage:
//            GPUImageTwoPassTextureSamplingFilter, GPUImageFilter

public class GPUImageMinBlurFilter extends GPUImageTwoPassTextureSamplingFilter
{

    public static final String ONE_FRAGMENT_SHADER = "precision highp float;\n\n\nuniform sampler2D inputImageTexture;\n\nuniform float radius;\nuniform float texelWidthOffset; \nuniform float texelHeightOffset; \n\nvarying vec2 centerTextureCoordinate;\n\nvec4 minColor(vec4 color1, vec4 color2)\n{\n\tvec4 color;\n\tcolor.r = min(color1.r, color2.r); \n   color.g = min(color1.g, color2.g); \n   color.b = min(color1.b, color2.b); \n   return color;\n}\n\nvoid main()\n{\n\tvec4 baseColor;\n   vec2 offsetCoordinate = vec2(-radius*texelWidthOffset,-radius*texelHeightOffset); \n   baseColor = texture2D(inputImageTexture, centerTextureCoordinate+offsetCoordinate); \n\tfor(float i=-radius+1.0; i <= radius; i+=1.0)\n\t{\n\t\tvec2 offsetCoordinate = vec2(i*texelWidthOffset,i*texelHeightOffset); \n   \tlowp vec4 fragmentColor = texture2D(inputImageTexture, centerTextureCoordinate+offsetCoordinate); \n\t\tbaseColor.r = min(baseColor.r, fragmentColor.r); \n\t\tbaseColor.g = min(baseColor.g, fragmentColor.g); \n       baseColor.b = min(baseColor.b, fragmentColor.b); \n\t\t\n\t}\n;\ngl_FragColor = baseColor;\n}\n";
    public static final String TWO_FRAGMENT_SHADER = "precision highp float;\n\n\nuniform sampler2D inputImageTexture;\n\nuniform float texelWidthOffset; \nuniform float texelHeightOffset; \n\nvarying vec2 centerTextureCoordinate;\n\nvec4 minColor(vec4 color1, vec4 color2)\n{\n\tvec4 color;\n\tcolor.r = min(color1.r, color2.r); \n   color.g = min(color1.g, color2.g); \n   color.b = min(color1.b, color2.b); \n   return color;\n}\nvec4 minTriColor(vec2 coord, vec4 baseColor)\n{\n   vec4 minc;\n   vec4 baseColorTop = texture2D(inputImageTexture, centerTextureCoordinate-coord); \n   vec4 baseColorBottom = texture2D(inputImageTexture, centerTextureCoordinate+coord); \n   minc = minColor(baseColorTop, baseColor);\n   minc = minColor(baseColorBottom, minc);\n   return minc;\n}\n\nvoid main()\n{\n   vec2 offsetCoordinate = vec2(texelWidthOffset,texelHeightOffset); \n   vec2 offsetCoordinate2 = vec2(2.0*texelWidthOffset,2.0*texelHeightOffset); \n   vec2 offsetCoordinate3 = vec2(3.0*texelWidthOffset,3.0*texelHeightOffset); \n   vec2 offsetCoordinate4 = vec2(4.0*texelWidthOffset,4.0*texelHeightOffset); \n   vec2 offsetCoordinate5 = vec2(5.0*texelWidthOffset,5.0*texelHeightOffset); \n   vec2 offsetCoordinate6 = vec2(6.0*texelWidthOffset,6.0*texelHeightOffset); \n   //vec2 offsetCoordinate7 = vec2(7.0*texelWidthOffset,7.0*texelHeightOffset); \n   vec4 baseColor = texture2D(inputImageTexture, centerTextureCoordinate); \n   baseColor = minTriColor(offsetCoordinate, baseColor);\n   baseColor = minTriColor(offsetCoordinate2, baseColor);\n   baseColor = minTriColor(offsetCoordinate3, baseColor);\n   baseColor = minTriColor(offsetCoordinate4, baseColor);\n   baseColor = minTriColor(offsetCoordinate5, baseColor);\n   baseColor = minTriColor(offsetCoordinate6, baseColor);\n   //baseColor = minTriColor(offsetCoordinate7, baseColor);\n\n   gl_FragColor = baseColor;\n}\n";
    public static final String VERTEX_SHADER = "attribute vec4 position;\nattribute vec2 inputTextureCoordinate;\nvarying vec2 centerTextureCoordinate;\n\nvoid main()\n{\ngl_Position = position;\n\ncenterTextureCoordinate = inputTextureCoordinate;\n}\n";
    private float blurSize;

    public GPUImageMinBlurFilter()
    {
        this(1.0F);
    }

    public GPUImageMinBlurFilter(float f)
    {
        super("attribute vec4 position;\nattribute vec2 inputTextureCoordinate;\nvarying vec2 centerTextureCoordinate;\n\nvoid main()\n{\ngl_Position = position;\n\ncenterTextureCoordinate = inputTextureCoordinate;\n}\n", "precision highp float;\n\n\nuniform sampler2D inputImageTexture;\n\nuniform float texelWidthOffset; \nuniform float texelHeightOffset; \n\nvarying vec2 centerTextureCoordinate;\n\nvec4 minColor(vec4 color1, vec4 color2)\n{\n\tvec4 color;\n\tcolor.r = min(color1.r, color2.r); \n   color.g = min(color1.g, color2.g); \n   color.b = min(color1.b, color2.b); \n   return color;\n}\nvec4 minTriColor(vec2 coord, vec4 baseColor)\n{\n   vec4 minc;\n   vec4 baseColorTop = texture2D(inputImageTexture, centerTextureCoordinate-coord); \n   vec4 baseColorBottom = texture2D(inputImageTexture, centerTextureCoordinate+coord); \n   minc = minColor(baseColorTop, baseColor);\n   minc = minColor(baseColorBottom, minc);\n   return minc;\n}\n\nvoid main()\n{\n   vec2 offsetCoordinate = vec2(texelWidthOffset,texelHeightOffset); \n   vec2 offsetCoordinate2 = vec2(2.0*texelWidthOffset,2.0*texelHeightOffset); \n   vec2 offsetCoordinate3 = vec2(3.0*texelWidthOffset,3.0*texelHeightOffset); \n   vec2 offsetCoordinate4 = vec2(4.0*texelWidthOffset,4.0*texelHeightOffset); \n   vec2 offsetCoordinate5 = vec2(5.0*texelWidthOffset,5.0*texelHeightOffset); \n   vec2 offsetCoordinate6 = vec2(6.0*texelWidthOffset,6.0*texelHeightOffset); \n   //vec2 offsetCoordinate7 = vec2(7.0*texelWidthOffset,7.0*texelHeightOffset); \n   vec4 baseColor = texture2D(inputImageTexture, centerTextureCoordinate); \n   baseColor = minTriColor(offsetCoordinate, baseColor);\n   baseColor = minTriColor(offsetCoordinate2, baseColor);\n   baseColor = minTriColor(offsetCoordinate3, baseColor);\n   baseColor = minTriColor(offsetCoordinate4, baseColor);\n   baseColor = minTriColor(offsetCoordinate5, baseColor);\n   baseColor = minTriColor(offsetCoordinate6, baseColor);\n   //baseColor = minTriColor(offsetCoordinate7, baseColor);\n\n   gl_FragColor = baseColor;\n}\n", "attribute vec4 position;\nattribute vec2 inputTextureCoordinate;\nvarying vec2 centerTextureCoordinate;\n\nvoid main()\n{\ngl_Position = position;\n\ncenterTextureCoordinate = inputTextureCoordinate;\n}\n", "precision highp float;\n\n\nuniform sampler2D inputImageTexture;\n\nuniform float texelWidthOffset; \nuniform float texelHeightOffset; \n\nvarying vec2 centerTextureCoordinate;\n\nvec4 minColor(vec4 color1, vec4 color2)\n{\n\tvec4 color;\n\tcolor.r = min(color1.r, color2.r); \n   color.g = min(color1.g, color2.g); \n   color.b = min(color1.b, color2.b); \n   return color;\n}\nvec4 minTriColor(vec2 coord, vec4 baseColor)\n{\n   vec4 minc;\n   vec4 baseColorTop = texture2D(inputImageTexture, centerTextureCoordinate-coord); \n   vec4 baseColorBottom = texture2D(inputImageTexture, centerTextureCoordinate+coord); \n   minc = minColor(baseColorTop, baseColor);\n   minc = minColor(baseColorBottom, minc);\n   return minc;\n}\n\nvoid main()\n{\n   vec2 offsetCoordinate = vec2(texelWidthOffset,texelHeightOffset); \n   vec2 offsetCoordinate2 = vec2(2.0*texelWidthOffset,2.0*texelHeightOffset); \n   vec2 offsetCoordinate3 = vec2(3.0*texelWidthOffset,3.0*texelHeightOffset); \n   vec2 offsetCoordinate4 = vec2(4.0*texelWidthOffset,4.0*texelHeightOffset); \n   vec2 offsetCoordinate5 = vec2(5.0*texelWidthOffset,5.0*texelHeightOffset); \n   vec2 offsetCoordinate6 = vec2(6.0*texelWidthOffset,6.0*texelHeightOffset); \n   //vec2 offsetCoordinate7 = vec2(7.0*texelWidthOffset,7.0*texelHeightOffset); \n   vec4 baseColor = texture2D(inputImageTexture, centerTextureCoordinate); \n   baseColor = minTriColor(offsetCoordinate, baseColor);\n   baseColor = minTriColor(offsetCoordinate2, baseColor);\n   baseColor = minTriColor(offsetCoordinate3, baseColor);\n   baseColor = minTriColor(offsetCoordinate4, baseColor);\n   baseColor = minTriColor(offsetCoordinate5, baseColor);\n   baseColor = minTriColor(offsetCoordinate6, baseColor);\n   //baseColor = minTriColor(offsetCoordinate7, baseColor);\n\n   gl_FragColor = baseColor;\n}\n");
        blurSize = 1.0F;
        blurSize = f;
    }

    public float getHorizontalTexelOffsetRatio()
    {
        return 1.0F;
    }

    public float getVerticalTexelOffsetRatio()
    {
        return blurSize;
    }

    protected void initTexelOffsets()
    {
        GPUImageFilter gpuimagefilter = (GPUImageFilter)mFilters.get(0);
        int i = GLES20.glGetUniformLocation(gpuimagefilter.getProgram(), "texelWidthOffset");
        int j = GLES20.glGetUniformLocation(gpuimagefilter.getProgram(), "texelHeightOffset");
        int k = GLES20.glGetUniformLocation(gpuimagefilter.getProgram(), "radius");
        gpuimagefilter.setFloat(i, 1.0F / (float)mOutputWidth);
        gpuimagefilter.setFloat(j, 0.0F);
        gpuimagefilter.setFloat(k, blurSize);
        gpuimagefilter = (GPUImageFilter)mFilters.get(1);
        i = GLES20.glGetUniformLocation(gpuimagefilter.getProgram(), "texelWidthOffset");
        j = GLES20.glGetUniformLocation(gpuimagefilter.getProgram(), "texelHeightOffset");
        k = GLES20.glGetUniformLocation(gpuimagefilter.getProgram(), "radius");
        gpuimagefilter.setFloat(i, 0.0F);
        gpuimagefilter.setFloat(j, 1.0F / (float)mOutputHeight);
        gpuimagefilter.setFloat(k, blurSize);
    }

    public void setBlurSize(float f)
    {
        blurSize = f;
        runOnDraw(new _cls1());
    }

    private class _cls1
        implements Runnable
    {

        final GPUImageMinBlurFilter this$0;

        public void run()
        {
            initTexelOffsets();
        }

        _cls1()
        {
            this$0 = GPUImageMinBlurFilter.this;
            super();
        }
    }

}
