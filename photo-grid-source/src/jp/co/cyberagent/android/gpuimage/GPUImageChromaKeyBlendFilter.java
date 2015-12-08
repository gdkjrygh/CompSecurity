// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.gpuimage;

import android.opengl.GLES20;

// Referenced classes of package jp.co.cyberagent.android.gpuimage:
//            GPUImageTwoInputFilter

public class GPUImageChromaKeyBlendFilter extends GPUImageTwoInputFilter
{

    public static final String CHROMA_KEY_BLEND_FRAGMENT_SHADER = "varying highp vec2 textureCoordinate;\n varying highp vec2 textureCoordinate2;\n \n uniform sampler2D inputImageTexture;\n uniform sampler2D inputImageTexture2;\n \n highp float lum(lowp vec3 c) {\n     return dot(c, vec3(0.3, 0.59, 0.11));\n }\n \n lowp vec3 clipcolor(lowp vec3 c) {\n     highp float l = lum(c);\n     lowp float n = min(min(c.r, c.g), c.b);\n     lowp float x = max(max(c.r, c.g), c.b);\n     \n     if (n < 0.0) {\n         c.r = l + ((c.r - l) * l) / (l - n);\n         c.g = l + ((c.g - l) * l) / (l - n);\n         c.b = l + ((c.b - l) * l) / (l - n);\n     }\n     if (x > 1.0) {\n         c.r = l + ((c.r - l) * (1.0 - l)) / (x - l);\n         c.g = l + ((c.g - l) * (1.0 - l)) / (x - l);\n         c.b = l + ((c.b - l) * (1.0 - l)) / (x - l);\n     }\n     \n     return c;\n }\n\n lowp vec3 setlum(lowp vec3 c, highp float l) {\n     highp float d = l - lum(c);\n     c = c + vec3(d);\n     return clipcolor(c);\n }\n \n void main()\n {\n   highp vec4 baseColor = texture2D(inputImageTexture, textureCoordinate);\n   highp vec4 overlayColor = texture2D(inputImageTexture2, textureCoordinate2);\n\n     gl_FragColor = vec4(baseColor.rgb * (1.0 - overlayColor.a) + setlum(overlayColor.rgb, lum(baseColor.rgb)) * overlayColor.a, baseColor.a);\n }";
    private float mColorToReplace[] = {
        0.0F, 1.0F, 0.0F
    };
    private int mColorToReplaceLocation;
    private float mSmoothing;
    private int mSmoothingLocation;
    private float mThresholdSensitivity;
    private int mThresholdSensitivityLocation;

    public GPUImageChromaKeyBlendFilter()
    {
        super("varying highp vec2 textureCoordinate;\n varying highp vec2 textureCoordinate2;\n \n uniform sampler2D inputImageTexture;\n uniform sampler2D inputImageTexture2;\n \n highp float lum(lowp vec3 c) {\n     return dot(c, vec3(0.3, 0.59, 0.11));\n }\n \n lowp vec3 clipcolor(lowp vec3 c) {\n     highp float l = lum(c);\n     lowp float n = min(min(c.r, c.g), c.b);\n     lowp float x = max(max(c.r, c.g), c.b);\n     \n     if (n < 0.0) {\n         c.r = l + ((c.r - l) * l) / (l - n);\n         c.g = l + ((c.g - l) * l) / (l - n);\n         c.b = l + ((c.b - l) * l) / (l - n);\n     }\n     if (x > 1.0) {\n         c.r = l + ((c.r - l) * (1.0 - l)) / (x - l);\n         c.g = l + ((c.g - l) * (1.0 - l)) / (x - l);\n         c.b = l + ((c.b - l) * (1.0 - l)) / (x - l);\n     }\n     \n     return c;\n }\n\n lowp vec3 setlum(lowp vec3 c, highp float l) {\n     highp float d = l - lum(c);\n     c = c + vec3(d);\n     return clipcolor(c);\n }\n \n void main()\n {\n   highp vec4 baseColor = texture2D(inputImageTexture, textureCoordinate);\n   highp vec4 overlayColor = texture2D(inputImageTexture2, textureCoordinate2);\n\n     gl_FragColor = vec4(baseColor.rgb * (1.0 - overlayColor.a) + setlum(overlayColor.rgb, lum(baseColor.rgb)) * overlayColor.a, baseColor.a);\n }");
        mSmoothing = 0.1F;
        mThresholdSensitivity = 0.3F;
    }

    public void onInit()
    {
        super.onInit();
        mThresholdSensitivityLocation = GLES20.glGetUniformLocation(getProgram(), "thresholdSensitivity");
        mSmoothingLocation = GLES20.glGetUniformLocation(getProgram(), "smoothing");
        mColorToReplaceLocation = GLES20.glGetUniformLocation(getProgram(), "colorToReplace");
    }

    public void onInitialized()
    {
        super.onInitialized();
        setSmoothing(mSmoothing);
        setThresholdSensitivity(mThresholdSensitivity);
        setColorToReplace(mColorToReplace[0], mColorToReplace[1], mColorToReplace[2]);
    }

    public void setColorToReplace(float f, float f1, float f2)
    {
        mColorToReplace = (new float[] {
            f, f1, f2
        });
        setFloatVec3(mColorToReplaceLocation, mColorToReplace);
    }

    public void setSmoothing(float f)
    {
        mSmoothing = f;
        setFloat(mSmoothingLocation, mSmoothing);
    }

    public void setThresholdSensitivity(float f)
    {
        mThresholdSensitivity = f;
        setFloat(mThresholdSensitivityLocation, mThresholdSensitivity);
    }
}
