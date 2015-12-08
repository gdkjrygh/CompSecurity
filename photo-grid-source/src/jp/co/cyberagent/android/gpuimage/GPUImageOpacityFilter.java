// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.gpuimage;

import android.opengl.GLES20;

// Referenced classes of package jp.co.cyberagent.android.gpuimage:
//            GPUImageFilter

public class GPUImageOpacityFilter extends GPUImageFilter
{

    public static final String OPACITY_FRAGMENT_SHADER = "  varying highp vec2 textureCoordinate;\n  \n  uniform sampler2D inputImageTexture;\n  uniform lowp float opacity;\n  \n  void main()\n  {\n      lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n      \n      gl_FragColor = vec4(textureColor.rgb, textureColor.a * opacity);\n  }\n";
    private float mOpacity;
    private int mOpacityLocation;

    public GPUImageOpacityFilter()
    {
        this(1.0F);
    }

    public GPUImageOpacityFilter(float f)
    {
        super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "  varying highp vec2 textureCoordinate;\n  \n  uniform sampler2D inputImageTexture;\n  uniform lowp float opacity;\n  \n  void main()\n  {\n      lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n      \n      gl_FragColor = vec4(textureColor.rgb, textureColor.a * opacity);\n  }\n");
        mOpacity = f;
    }

    public void onInit()
    {
        super.onInit();
        mOpacityLocation = GLES20.glGetUniformLocation(getProgram(), "opacity");
    }

    public void onInitialized()
    {
        super.onInitialized();
        setOpacity(mOpacity);
    }

    public void setOpacity(float f)
    {
        mOpacity = f;
        setFloat(mOpacityLocation, mOpacity);
    }
}
