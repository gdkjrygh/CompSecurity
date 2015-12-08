// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.a;

import android.opengl.GLES20;
import android.util.Log;
import com.roidapp.videolib.gl.e;
import com.roidapp.videolib.gl.g;
import java.nio.FloatBuffer;

// Referenced classes of package jp.co.cyberagent.android.a:
//            h

public class ae extends h
{

    public int A;
    public int B;
    public int C;
    public int D;
    public int y;
    public int z;

    public ae(String s)
    {
        super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\nattribute vec4 inputTextureCoordinate2;\nattribute vec4 inputTextureCoordinate3;\nuniform mat4 uMVPMatrix;\n \nvarying vec2 textureCoordinate;\nvarying vec2 textureCoordinate2;\nvarying vec2 textureCoordinate3;\n \nvoid main()\n{\n    gl_Position = uMVPMatrix*position;\n    textureCoordinate = inputTextureCoordinate.xy;\n    textureCoordinate2 = inputTextureCoordinate2.xy;\n\t textureCoordinate3 = inputTextureCoordinate3.xy;\n}", s);
        A = -1;
        D = -1;
    }

    protected void a()
    {
        GLES20.glEnableVertexAttribArray(y);
        GLES20.glActiveTexture(33986);
        GLES20.glBindTexture(3553, A);
        GLES20.glUniform1i(z, 2);
        u.position(0);
        GLES20.glVertexAttribPointer(y, 2, 5126, false, 0, u);
        GLES20.glEnableVertexAttribArray(B);
        GLES20.glActiveTexture(33987);
        GLES20.glBindTexture(3553, D);
        GLES20.glUniform1i(C, 3);
        u.position(0);
        GLES20.glVertexAttribPointer(B, 2, 5126, false, 0, u);
    }

    public final void b()
    {
        this;
        JVM INSTR monitorenter ;
        if (p == null) goto _L2; else goto _L1
_L1:
        java.nio.ByteBuffer abytebuffer[];
        int ai[];
        GLES20.glActiveTexture(33986);
        abytebuffer = p.a();
        ai = p.b();
        if (abytebuffer == null) goto _L4; else goto _L3
_L3:
        if (abytebuffer.length <= 1 || ai == null) goto _L4; else goto _L5
_L5:
        if (ai.length >= 2) goto _L6; else goto _L4
_L4:
        Log.e("Buffer", "Data Provider can't provide data");
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L6:
        A = g.a(abytebuffer[0], ai[0], ai[1], A);
        GLES20.glActiveTexture(33987);
        D = g.a(abytebuffer[1], ai[0], ai[1], D);
        if (true) goto _L2; else goto _L7
_L7:
        Exception exception;
        exception;
        throw exception;
    }

    public void c()
    {
        super.c();
        d = GLES20.glGetUniformLocation(p(), "uMVPMatrix");
        y = GLES20.glGetAttribLocation(p(), "inputTextureCoordinate2");
        z = GLES20.glGetUniformLocation(p(), "inputImageTexture2");
        B = GLES20.glGetAttribLocation(p(), "inputTextureCoordinate3");
        C = GLES20.glGetUniformLocation(p(), "inputImageTexture3");
        GLES20.glEnableVertexAttribArray(y);
        GLES20.glEnableVertexAttribArray(B);
    }

    public final void e()
    {
        super.e();
        GLES20.glDeleteTextures(1, new int[] {
            A
        }, 0);
        A = -1;
        GLES20.glDeleteTextures(1, new int[] {
            D
        }, 0);
        D = -1;
    }

    public final void k()
    {
        this;
        JVM INSTR monitorenter ;
    }
}
