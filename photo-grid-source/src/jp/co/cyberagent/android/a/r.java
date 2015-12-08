// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.a;

import android.opengl.GLES20;
import com.roidapp.videolib.gl.e;
import com.roidapp.videolib.gl.g;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

// Referenced classes of package jp.co.cyberagent.android.a:
//            h

public final class r extends h
{

    private int A;
    private int B;
    private int C;
    private int D;
    private boolean E;
    public int y;
    private FloatBuffer z;

    public r()
    {
        super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\nuniform mat4 uMVPMatrix;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = uMVPMatrix*position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "precision mediump float;\nvarying highp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nuniform lowp float alpha;\n \nvoid main()\n{\n   gl_FragColor =  texture2D(inputImageTexture, textureCoordinate) * alpha;\n}");
        y = -1;
        A = -1;
        B = -1;
        C = -1;
        D = -1;
        E = false;
        z = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    public final void a(int i, FloatBuffer floatbuffer, FloatBuffer floatbuffer1)
    {
        l();
        if (this.i)
        {
            z.position(0);
            if (x)
            {
                z.put(g.a(floatbuffer1));
            }
            if (i != -1)
            {
                FloatBuffer floatbuffer2;
                if (x)
                {
                    floatbuffer2 = z;
                } else
                {
                    floatbuffer2 = floatbuffer1;
                }
                GLES20.glUseProgram(A);
                g.a("glUseProgram");
                floatbuffer.position(0);
                GLES20.glVertexAttribPointer(B, 2, 5126, false, 0, floatbuffer);
                GLES20.glEnableVertexAttribArray(B);
                floatbuffer2.position(0);
                GLES20.glVertexAttribPointer(D, 2, 5126, false, 0, floatbuffer2);
                GLES20.glEnableVertexAttribArray(D);
                if (i != -1)
                {
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, i);
                    GLES20.glUniform1i(C, 0);
                }
                GLES20.glDrawArrays(5, 0, 4);
                g.a("glDrawArrays");
                GLES20.glDisableVertexAttribArray(B);
                g.a("glDisableVertexAttribArray");
                GLES20.glDisableVertexAttribArray(D);
                g.a("glDisableVertexAttribArray");
                GLES20.glBindTexture(3553, 0);
                g.a("glBindTexture");
            }
            GLES20.glUseProgram(a);
            g.a("glUseProgram");
            j();
            if (y != -1)
            {
                g.a("onUpdateInputTexture1");
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, y);
                floatbuffer.position(0);
                GLES20.glVertexAttribPointer(b, 2, 5126, false, 0, floatbuffer);
                GLES20.glEnableVertexAttribArray(b);
                floatbuffer1.position(0);
                GLES20.glVertexAttribPointer(f, 2, 5126, false, 0, floatbuffer1);
                GLES20.glEnableVertexAttribArray(f);
                g.a("glEnableVertexAttribArray");
                GLES20.glUniform1i(c, 0);
                g.a(" glUniform1i");
                GLES20.glUniform1f(e, o);
                GLES20.glUniformMatrix4fv(d, 1, false, k, 0);
                g.a("onDrawArraysPre glVertexAttribPointer");
                GLES20.glDrawArrays(5, 0, 4);
                g.a("glDrawArrays");
                GLES20.glDisableVertexAttribArray(b);
                g.a("glDisableVertexAttribArray");
                GLES20.glDisableVertexAttribArray(f);
                g.a("glDisableVertexAttribArray");
                GLES20.glBindTexture(3553, 0);
                g.a("glBindTexture");
                return;
            }
        }
    }

    public final void c()
    {
        super.c();
        o = 1.0F;
        e = GLES20.glGetUniformLocation(p(), "alpha");
        A = g.a("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "precision mediump float;\nvarying highp vec2 textureCoordinate;\n\nuniform sampler2D inputImageTexture;\n \nuniform float alpha;\n \nvoid main()\n{\n lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n\n   gl_FragColor = textureColor;\n}");
        B = GLES20.glGetAttribLocation(A, "position");
        C = GLES20.glGetUniformLocation(A, "inputImageTexture");
        D = GLES20.glGetAttribLocation(A, "inputTextureCoordinate");
    }

    public final void e()
    {
        if (y != -1)
        {
            y = -1;
        }
        GLES20.glDeleteProgram(A);
        super.e();
    }

    public final void j()
    {
        if (p != null)
        {
            y = p.c();
        }
    }
}
