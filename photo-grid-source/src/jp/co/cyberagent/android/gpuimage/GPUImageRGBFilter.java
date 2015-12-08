// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.gpuimage;

import android.opengl.GLES20;

// Referenced classes of package jp.co.cyberagent.android.gpuimage:
//            GPUImageFilter

public class GPUImageRGBFilter extends GPUImageFilter
{

    public static final String RGB_FRAGMENT_SHADER = "  varying highp vec2 textureCoordinate;\n  \n  uniform sampler2D inputImageTexture;\n  uniform highp float red;\n  uniform highp float green;\n  uniform highp float blue;\n  \n  void main()\n  {\n      highp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n      \n      gl_FragColor = vec4(textureColor.r * red, textureColor.g * green, textureColor.b * blue, 1.0);\n  }\n";
    private float mBlue;
    private int mBlueLocation;
    private float mGreen;
    private int mGreenLocation;
    private boolean mIsInitialized;
    private float mRed;
    private int mRedLocation;

    public GPUImageRGBFilter()
    {
        this(1.0F, 1.0F, 1.0F);
    }

    public GPUImageRGBFilter(float f, float f1, float f2)
    {
        super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "  varying highp vec2 textureCoordinate;\n  \n  uniform sampler2D inputImageTexture;\n  uniform highp float red;\n  uniform highp float green;\n  uniform highp float blue;\n  \n  void main()\n  {\n      highp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n      \n      gl_FragColor = vec4(textureColor.r * red, textureColor.g * green, textureColor.b * blue, 1.0);\n  }\n");
        mIsInitialized = false;
        mRed = f;
        mGreen = f1;
        mBlue = f2;
    }

    public void onInit()
    {
        super.onInit();
        mRedLocation = GLES20.glGetUniformLocation(getProgram(), "red");
        mGreenLocation = GLES20.glGetUniformLocation(getProgram(), "green");
        mBlueLocation = GLES20.glGetUniformLocation(getProgram(), "blue");
        mIsInitialized = true;
        setRed(mRed);
        setGreen(mGreen);
        setBlue(mBlue);
    }

    public void setBlue(float f)
    {
        mBlue = f;
        if (mIsInitialized)
        {
            setFloat(mBlueLocation, mBlue);
        }
    }

    public void setGreen(float f)
    {
        mGreen = f;
        if (mIsInitialized)
        {
            setFloat(mGreenLocation, mGreen);
        }
    }

    public void setRed(float f)
    {
        mRed = f;
        if (mIsInitialized)
        {
            setFloat(mRedLocation, mRed);
        }
    }
}
