// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.gpuimage;

import android.opengl.GLES20;

// Referenced classes of package jp.co.cyberagent.android.gpuimage:
//            GPUImageFilter

public class GPUImageBrightnessFilter extends GPUImageFilter
{

    public static final String BRIGHTNESS_FRAGMENT_SHADER = "varying highp vec2 textureCoordinate;\n \n uniform sampler2D inputImageTexture;\n uniform lowp float brightness;\n \n void main()\n {\n     lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n     \n     gl_FragColor = vec4((textureColor.rgb + vec3(brightness)), textureColor.w);\n }";
    private float mBrightness;
    private int mBrightnessLocation;

    public GPUImageBrightnessFilter()
    {
        this(0.0F);
    }

    public GPUImageBrightnessFilter(float f)
    {
        super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "varying highp vec2 textureCoordinate;\n \n uniform sampler2D inputImageTexture;\n uniform lowp float brightness;\n \n void main()\n {\n     lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n     \n     gl_FragColor = vec4((textureColor.rgb + vec3(brightness)), textureColor.w);\n }");
        mBrightness = f;
    }

    public void onInit()
    {
        super.onInit();
        mBrightnessLocation = GLES20.glGetUniformLocation(getProgram(), "brightness");
    }

    public void onInitialized()
    {
        super.onInitialized();
        setBrightness(mBrightness);
    }

    public void setBrightness(float f)
    {
        mBrightness = f;
        setFloat(mBrightnessLocation, mBrightness);
    }
}
