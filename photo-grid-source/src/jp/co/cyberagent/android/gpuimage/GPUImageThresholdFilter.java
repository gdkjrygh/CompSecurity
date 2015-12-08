// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.gpuimage;

import android.opengl.GLES20;

// Referenced classes of package jp.co.cyberagent.android.gpuimage:
//            GPUImageFilter

public class GPUImageThresholdFilter extends GPUImageFilter
{

    public static final String THRESHOLD_FRAGMENT_SHADER = "precision highp float;\n\nvarying vec2 textureCoordinate;\n\nuniform sampler2D inputImageTexture;\nuniform highp float threshold;\n\nconst highp vec3 W = vec3(0.2125, 0.7154, 0.0721);\n\nvoid main()\n{\n  lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n  float luminance = dot(textureColor.rgb, W);\n\n  float color = luminance > threshold ? 1.0:0.0;\n  gl_FragColor = vec4(vec3(color), textureColor.a);\n}";
    private float mThreshold;
    private int mThresholdLocation;

    public GPUImageThresholdFilter()
    {
        this(0.5F);
    }

    public GPUImageThresholdFilter(float f)
    {
        super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "precision highp float;\n\nvarying vec2 textureCoordinate;\n\nuniform sampler2D inputImageTexture;\nuniform highp float threshold;\n\nconst highp vec3 W = vec3(0.2125, 0.7154, 0.0721);\n\nvoid main()\n{\n  lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n  float luminance = dot(textureColor.rgb, W);\n\n  float color = luminance > threshold ? 1.0:0.0;\n  gl_FragColor = vec4(vec3(color), textureColor.a);\n}");
        mThreshold = f;
    }

    public void onInit()
    {
        super.onInit();
        mThresholdLocation = GLES20.glGetUniformLocation(getProgram(), "threshold");
    }

    public void onInitialized()
    {
        super.onInitialized();
        setThreshold(mThreshold);
    }

    public void setThreshold(float f)
    {
        mThreshold = f;
        setFloat(mThresholdLocation, mThreshold);
    }
}
