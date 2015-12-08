// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.a;

import android.opengl.GLES20;
import com.roidapp.videolib.gl.e;
import com.roidapp.videolib.gl.g;
import java.nio.FloatBuffer;

// Referenced classes of package jp.co.cyberagent.android.a:
//            h

public final class c extends h
{

    private int y;
    private int z;

    public c()
    {
        super("uniform mat4 uMVPMatrix;\nattribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = uMVPMatrix*position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "varying highp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}");
        y = -1;
        z = -1;
    }

    private void a(int i, int j, FloatBuffer floatbuffer, FloatBuffer floatbuffer1)
    {
        GLES20.glUseProgram(i);
        g.a("glUseProgram");
        floatbuffer.position(0);
        GLES20.glVertexAttribPointer(b, 2, 5126, false, 0, floatbuffer);
        GLES20.glEnableVertexAttribArray(b);
        GLES20.glEnableVertexAttribArray(f);
        floatbuffer1.position(0);
        GLES20.glVertexAttribPointer(f, 2, 5126, false, 0, floatbuffer1);
        if (j != -1)
        {
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, j);
            GLES20.glUniform1i(c, 0);
        }
        GLES20.glUniformMatrix4fv(d, 1, false, k, 0);
        GLES20.glDrawArrays(5, 0, 4);
        g.a("glDrawArrays");
        GLES20.glDisableVertexAttribArray(b);
        g.a("glDisableVertexAttribArray");
        GLES20.glDisableVertexAttribArray(f);
        g.a("glDisableVertexAttribArray");
        GLES20.glBindTexture(3553, 0);
        g.a("glBindTexture");
    }

    public final void a(int i, FloatBuffer floatbuffer, FloatBuffer floatbuffer1)
    {
        l();
        if (this.i)
        {
            if (p != null)
            {
                z = p.c();
            }
            int j;
            if (z != -1)
            {
                j = a;
            } else
            {
                j = y;
            }
            a(j, z, floatbuffer, floatbuffer1);
            if (i != -1)
            {
                a(a, i, floatbuffer, floatbuffer1);
                return;
            }
        }
    }

    public final void c()
    {
        super.c();
        o = 1.0F;
        y = g.a("uniform mat4 uMVPMatrix;\nattribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = uMVPMatrix*position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "varying highp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nuniform lowp float alpha;\n \nvoid main()\n{\n    gl_FragColor = vec4(1.0,1.0,1.0,1.0);\n}");
    }

    public final void d()
    {
        super.d();
    }

    public final void e()
    {
        super.e();
        if (z != -1)
        {
            z = -1;
        }
        GLES20.glDeleteProgram(y);
        super.e();
    }
}
