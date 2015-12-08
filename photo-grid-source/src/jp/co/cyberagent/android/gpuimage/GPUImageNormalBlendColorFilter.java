// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.gpuimage;

import android.opengl.GLES20;

// Referenced classes of package jp.co.cyberagent.android.gpuimage:
//            GPUImageFilter

public class GPUImageNormalBlendColorFilter extends GPUImageFilter
{

    public static final String NORMAL_COLOR_FRAGMENT_SHADER = "varying highp vec2 textureCoordinate;\n varying highp vec2 textureCoordinate2;\n\n uniform sampler2D inputImageTexture;\n uniform highp vec4 screenColor;\n uniform highp float alpha;\n \n void main()\n {\n     lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n     \n     gl_FragColor = vec4(mix(textureColor.rgb, screenColor.rgb, alpha), textureColor.a);\n }";
    private float mAlpha;
    private int mAlphaLocation;
    private int mColorLocation;
    private String mColorString;

    public GPUImageNormalBlendColorFilter()
    {
        this("#000000", 0.0F);
    }

    public GPUImageNormalBlendColorFilter(String s, float f)
    {
        super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "varying highp vec2 textureCoordinate;\n varying highp vec2 textureCoordinate2;\n\n uniform sampler2D inputImageTexture;\n uniform highp vec4 screenColor;\n uniform highp float alpha;\n \n void main()\n {\n     lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n     \n     gl_FragColor = vec4(mix(textureColor.rgb, screenColor.rgb, alpha), textureColor.a);\n }");
        mColorString = s;
        mAlpha = f;
    }

    public void onInit()
    {
        super.onInit();
        mColorLocation = GLES20.glGetUniformLocation(getProgram(), "screenColor");
        mAlphaLocation = GLES20.glGetUniformLocation(getProgram(), "alpha");
    }

    public void onInitialized()
    {
        super.onInitialized();
        setColor(mColorString, mAlpha);
    }

    public void setColor(String s, float f)
    {
        mColorString = s;
        mAlpha = f;
        int i = Integer.parseInt(s.replaceFirst("#", ""), 16);
        float f1 = (float)((0xff0000 & i) >> 16) / 255F;
        float f2 = (float)((0xff00 & i) >> 8) / 255F;
        float f3 = (float)(i & 0xff) / 255F;
        setFloatVec4(mColorLocation, new float[] {
            f1, f2, f3, 1.0F
        });
        setFloat(mAlphaLocation, f);
    }
}
