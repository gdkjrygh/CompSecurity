// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.gpuimage;

import android.opengl.GLES20;

// Referenced classes of package jp.co.cyberagent.android.gpuimage:
//            GPUImageFilter

public class GPUImagePosterizeFilter extends GPUImageFilter
{

    public static final String POSTERIZE_FRAGMENT_SHADER = "varying highp vec2 textureCoordinate;\n\nuniform sampler2D inputImageTexture;\nuniform highp float colorLevels;\n\nvoid main()\n{\n   highp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n   \n   gl_FragColor = floor((textureColor * colorLevels) + vec4(0.5)) / colorLevels;\n}";
    private int mColorLevels;
    private int mGLUniformColorLevels;

    public GPUImagePosterizeFilter()
    {
        this(10);
    }

    public GPUImagePosterizeFilter(int i)
    {
        super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "varying highp vec2 textureCoordinate;\n\nuniform sampler2D inputImageTexture;\nuniform highp float colorLevels;\n\nvoid main()\n{\n   highp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n   \n   gl_FragColor = floor((textureColor * colorLevels) + vec4(0.5)) / colorLevels;\n}");
        mColorLevels = i;
    }

    public void onInit()
    {
        super.onInit();
        mGLUniformColorLevels = GLES20.glGetUniformLocation(getProgram(), "colorLevels");
        setColorLevels(mColorLevels);
    }

    public void setColorLevels(int i)
    {
        mColorLevels = i;
        setFloat(mGLUniformColorLevels, i);
    }
}
