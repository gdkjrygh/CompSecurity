// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.a;

import android.opengl.GLES20;
import com.roidapp.videolib.gl.e;
import java.nio.FloatBuffer;

// Referenced classes of package jp.co.cyberagent.android.a:
//            aj

public final class f extends aj
{

    public f()
    {
        this((byte)0);
    }

    public f(byte byte0)
    {
        super("precision mediump float;\n \n varying highp vec2 textureCoordinate;\n varying highp vec2 textureCoordinate2;\n \n uniform sampler2D inputImageTexture;\n uniform sampler2D inputImageTexture2;\n \n void main()\n {\n\t  const highp vec3 W = vec3(0.2125, 0.7154, 0.0721);\n     vec4 base = texture2D(inputImageTexture2, textureCoordinate2);\n     vec4 overlay = texture2D(inputImageTexture, textureCoordinate);\n  \t  float luminance = dot(base.rgb, W);\n\t  base = vec4(luminance);\t\n\t  vec4 result = base + base*overlay / (vec4(1.0)-overlay);\n\t  result.r = clamp(result.r, 0.0,1.0);\n\t  result.g = clamp(result.g, 0.0,1.0);\n\t  result.b = clamp(result.b, 0.0,1.0);\n     gl_FragColor = vec4(result.rgb, 1.0);\n }");
    }

    protected final void a()
    {
        GLES20.glEnableVertexAttribArray(z);
        GLES20.glActiveTexture(33987);
        GLES20.glBindTexture(3553, B);
        GLES20.glUniform1i(A, 3);
        u.position(0);
        GLES20.glVertexAttribPointer(z, 2, 5126, false, 0, u);
    }

    public final void b()
    {
        this;
        JVM INSTR monitorenter ;
        if (p != null)
        {
            B = p.c();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
