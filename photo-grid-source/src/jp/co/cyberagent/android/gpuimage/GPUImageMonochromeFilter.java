// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.gpuimage;

import android.opengl.GLES20;

// Referenced classes of package jp.co.cyberagent.android.gpuimage:
//            GPUImageFilter

public class GPUImageMonochromeFilter extends GPUImageFilter
{

    public static final String MONOCHROME_FRAGMENT_SHADER = " precision lowp float;\n  \n  varying highp vec2 textureCoordinate;\n  \n  uniform sampler2D inputImageTexture;\n  uniform float intensity;\n  uniform vec3 filterColor;\n  \n  const mediump vec3 luminanceWeighting = vec3(0.2125, 0.7154, 0.0721);\n  \n  void main()\n  {\n \t//desat, then apply overlay blend\n \tlowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n \tfloat luminance = dot(textureColor.rgb, luminanceWeighting);\n \t\n \tlowp vec4 desat = vec4(vec3(luminance), 1.0);\n \t\n \t//overlay\n \tlowp vec4 outputColor = vec4(\n                                  (desat.r < 0.5 ? (2.0 * desat.r * filterColor.r) : (1.0 - 2.0 * (1.0 - desat.r) * (1.0 - filterColor.r))),\n                                  (desat.g < 0.5 ? (2.0 * desat.g * filterColor.g) : (1.0 - 2.0 * (1.0 - desat.g) * (1.0 - filterColor.g))),\n                                  (desat.b < 0.5 ? (2.0 * desat.b * filterColor.b) : (1.0 - 2.0 * (1.0 - desat.b) * (1.0 - filterColor.b))),\n                                  1.0\n                                  );\n \t\n \t//which is better, or are they equal?\n \tgl_FragColor = vec4( mix(textureColor.rgb, outputColor.rgb, intensity), textureColor.a);\n  }";
    private float mColor[];
    private int mFilterColorLocation;
    private float mIntensity;
    private int mIntensityLocation;

    public GPUImageMonochromeFilter()
    {
        this(1.0F, new float[] {
            0.6F, 0.45F, 0.3F, 1.0F
        });
    }

    public GPUImageMonochromeFilter(float f, float af[])
    {
        super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", " precision lowp float;\n  \n  varying highp vec2 textureCoordinate;\n  \n  uniform sampler2D inputImageTexture;\n  uniform float intensity;\n  uniform vec3 filterColor;\n  \n  const mediump vec3 luminanceWeighting = vec3(0.2125, 0.7154, 0.0721);\n  \n  void main()\n  {\n \t//desat, then apply overlay blend\n \tlowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n \tfloat luminance = dot(textureColor.rgb, luminanceWeighting);\n \t\n \tlowp vec4 desat = vec4(vec3(luminance), 1.0);\n \t\n \t//overlay\n \tlowp vec4 outputColor = vec4(\n                                  (desat.r < 0.5 ? (2.0 * desat.r * filterColor.r) : (1.0 - 2.0 * (1.0 - desat.r) * (1.0 - filterColor.r))),\n                                  (desat.g < 0.5 ? (2.0 * desat.g * filterColor.g) : (1.0 - 2.0 * (1.0 - desat.g) * (1.0 - filterColor.g))),\n                                  (desat.b < 0.5 ? (2.0 * desat.b * filterColor.b) : (1.0 - 2.0 * (1.0 - desat.b) * (1.0 - filterColor.b))),\n                                  1.0\n                                  );\n \t\n \t//which is better, or are they equal?\n \tgl_FragColor = vec4( mix(textureColor.rgb, outputColor.rgb, intensity), textureColor.a);\n  }");
        mIntensity = f;
        mColor = af;
    }

    public void onInit()
    {
        super.onInit();
        mIntensityLocation = GLES20.glGetUniformLocation(getProgram(), "intensity");
        mFilterColorLocation = GLES20.glGetUniformLocation(getProgram(), "filterColor");
    }

    public void onInitialized()
    {
        super.onInitialized();
        setIntensity(1.0F);
        setColor(new float[] {
            0.6F, 0.45F, 0.3F, 1.0F
        });
    }

    public void setColor(float af[])
    {
        mColor = af;
        setColorRed(mColor[0], mColor[1], mColor[2]);
    }

    public void setColorRed(float f, float f1, float f2)
    {
        setFloatVec3(mFilterColorLocation, new float[] {
            f, f1, f2
        });
    }

    public void setIntensity(float f)
    {
        mIntensity = f;
        setFloat(mIntensityLocation, mIntensity);
    }
}
