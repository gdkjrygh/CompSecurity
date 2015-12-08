// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.gpuimage;

import android.graphics.PointF;
import android.opengl.GLES20;

// Referenced classes of package jp.co.cyberagent.android.gpuimage:
//            GPUImageFilter

public class GPUImageVignetteFilter extends GPUImageFilter
{

    public static final String VIGNETTING_FRAGMENT_SHADER = " uniform sampler2D inputImageTexture;\n varying highp vec2 textureCoordinate;\n \n uniform lowp vec2 vignetteCenter;\n uniform lowp vec3 vignetteColor;\n uniform highp float vignetteStart;\n uniform highp float vignetteEnd;\n \n void main()\n {\n     /*\n     lowp vec3 rgb = texture2D(inputImageTexture, textureCoordinate).rgb;\n     lowp float d = distance(textureCoordinate, vec2(0.5,0.5));\n     rgb *= (1.0 - smoothstep(vignetteStart, vignetteEnd, d));\n     gl_FragColor = vec4(vec3(rgb),1.0);\n      */\n     \n     lowp vec3 rgb = texture2D(inputImageTexture, textureCoordinate).rgb;\n     lowp float d = distance(textureCoordinate, vec2(vignetteCenter.x, vignetteCenter.y));\n     lowp float percent = smoothstep(vignetteStart, vignetteEnd, d);\n     gl_FragColor = vec4(mix(rgb.x, vignetteColor.x, percent), mix(rgb.y, vignetteColor.y, percent), mix(rgb.z, vignetteColor.z, percent), 1.0);\n }";
    private PointF mVignetteCenter;
    private int mVignetteCenterLocation;
    private float mVignetteColor[];
    private int mVignetteColorLocation;
    private float mVignetteEnd;
    private int mVignetteEndLocation;
    private float mVignetteStart;
    private int mVignetteStartLocation;

    public GPUImageVignetteFilter()
    {
        this(new PointF(), new float[] {
            0.0F, 0.0F, 0.0F
        }, 0.3F, 0.75F);
    }

    public GPUImageVignetteFilter(PointF pointf, float af[], float f, float f1)
    {
        super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", " uniform sampler2D inputImageTexture;\n varying highp vec2 textureCoordinate;\n \n uniform lowp vec2 vignetteCenter;\n uniform lowp vec3 vignetteColor;\n uniform highp float vignetteStart;\n uniform highp float vignetteEnd;\n \n void main()\n {\n     /*\n     lowp vec3 rgb = texture2D(inputImageTexture, textureCoordinate).rgb;\n     lowp float d = distance(textureCoordinate, vec2(0.5,0.5));\n     rgb *= (1.0 - smoothstep(vignetteStart, vignetteEnd, d));\n     gl_FragColor = vec4(vec3(rgb),1.0);\n      */\n     \n     lowp vec3 rgb = texture2D(inputImageTexture, textureCoordinate).rgb;\n     lowp float d = distance(textureCoordinate, vec2(vignetteCenter.x, vignetteCenter.y));\n     lowp float percent = smoothstep(vignetteStart, vignetteEnd, d);\n     gl_FragColor = vec4(mix(rgb.x, vignetteColor.x, percent), mix(rgb.y, vignetteColor.y, percent), mix(rgb.z, vignetteColor.z, percent), 1.0);\n }");
        mVignetteCenter = pointf;
        mVignetteColor = af;
        mVignetteStart = f;
        mVignetteEnd = f1;
    }

    public void onInit()
    {
        super.onInit();
        mVignetteCenterLocation = GLES20.glGetUniformLocation(getProgram(), "vignetteCenter");
        mVignetteColorLocation = GLES20.glGetUniformLocation(getProgram(), "vignetteColor");
        mVignetteStartLocation = GLES20.glGetUniformLocation(getProgram(), "vignetteStart");
        mVignetteEndLocation = GLES20.glGetUniformLocation(getProgram(), "vignetteEnd");
        setVignetteCenter(mVignetteCenter);
        setVignetteColor(mVignetteColor);
        setVignetteStart(mVignetteStart);
        setVignetteEnd(mVignetteEnd);
    }

    public void setVignetteCenter(PointF pointf)
    {
        mVignetteCenter = pointf;
        setPoint(mVignetteCenterLocation, mVignetteCenter);
    }

    public void setVignetteColor(float af[])
    {
        mVignetteColor = af;
        setFloatVec3(mVignetteColorLocation, mVignetteColor);
    }

    public void setVignetteEnd(float f)
    {
        mVignetteEnd = f;
        setFloat(mVignetteEndLocation, mVignetteEnd);
    }

    public void setVignetteStart(float f)
    {
        mVignetteStart = f;
        setFloat(mVignetteStartLocation, mVignetteStart);
    }
}
