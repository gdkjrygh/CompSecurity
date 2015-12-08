// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.a;

import android.opengl.GLES20;
import com.roidapp.videolib.gl.e;
import java.nio.FloatBuffer;

// Referenced classes of package jp.co.cyberagent.android.a:
//            u

public final class b extends u
{

    public b()
    {
        super("varying highp vec2 textureCoordinate;\n varying highp vec2 textureCoordinate2;\n\n uniform sampler2D inputImageTexture;\n uniform sampler2D inputImageTexture2;\n \n uniform lowp float mixturePercent;\n\n void main()\n {\n   lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n   lowp vec4 textureColor2 = texture2D(inputImageTexture2, textureCoordinate2);\n\n   gl_FragColor = vec4(mix(textureColor.rgb, textureColor2.rgb, textureColor2.a * mixturePercent), textureColor2.a);\n }");
    }

    public b(byte byte0)
    {
        super("varying highp vec2 textureCoordinate;\n varying highp vec2 textureCoordinate2;\n\n uniform sampler2D inputImageTexture;\n uniform sampler2D inputImageTexture2;\n \n uniform lowp float mixturePercent;\n\n void main()\n {\n   lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n   lowp vec4 textureColor2 = texture2D(inputImageTexture2, textureCoordinate2);\n\n   gl_FragColor = vec4(mix(textureColor.rgb, textureColor2.rgb, textureColor2.a * mixturePercent), textureColor2.a);\n }");
        j = true;
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
