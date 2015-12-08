// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.a;

import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Log;
import com.roidapp.videolib.gl.e;
import com.roidapp.videolib.gl.g;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.LinkedList;

// Referenced classes of package jp.co.cyberagent.android.a:
//            i, j

public class h
{

    private final String A;
    protected int a;
    protected int b;
    protected int c;
    protected int d;
    protected int e;
    protected int f;
    protected int g;
    protected int h;
    protected boolean i;
    protected boolean j;
    protected float k[];
    public float l[];
    public float m[];
    public float n[];
    protected float o;
    protected e p;
    protected int q;
    protected int r;
    protected int s;
    protected FloatBuffer t;
    protected FloatBuffer u;
    protected float v;
    public int w;
    protected boolean x;
    private final LinkedList y;
    private final String z;

    public h()
    {
        this("uniform mat4 uMVPMatrix;\nattribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = uMVPMatrix*position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "varying highp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}");
    }

    public h(String s1, String s2)
    {
        e = -1;
        k = new float[16];
        l = new float[16];
        m = new float[16];
        n = new float[16];
        q = -1;
        r = -1;
        s = 0;
        v = 1.0F;
        x = false;
        y = new LinkedList();
        z = s1;
        A = s2;
        t = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        u = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    protected void a()
    {
    }

    public final void a(int i1, float f1)
    {
        a(((Runnable) (new i(this, i1, f1))));
    }

    public void a(int i1, int j1)
    {
        g = i1;
        h = j1;
    }

    public void a(int i1, FloatBuffer floatbuffer, FloatBuffer floatbuffer1)
    {
        GLES20.glUseProgram(a);
        com.roidapp.videolib.gl.g.a((new StringBuilder("glUseProgram:")).append(a).toString());
        l();
        com.roidapp.videolib.gl.g.a("runPendingOnDrawTasks");
        if (!i)
        {
            return;
        }
        floatbuffer1.position(0);
        u.position(0);
        u.put(floatbuffer1);
        floatbuffer1.position(0);
        t.position(0);
        if (x)
        {
            t.put(com.roidapp.videolib.gl.g.a(floatbuffer1));
        } else
        {
            t.put(floatbuffer1);
        }
        com.roidapp.videolib.gl.g.a("textureBuffer");
        floatbuffer.position(0);
        GLES20.glVertexAttribPointer(b, 2, 5126, false, 0, floatbuffer);
        GLES20.glEnableVertexAttribArray(b);
        t.position(0);
        GLES20.glVertexAttribPointer(f, 2, 5126, false, 0, t);
        GLES20.glEnableVertexAttribArray(f);
        if (i1 != -1)
        {
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, i1);
            GLES20.glUniform1i(c, 0);
        }
        GLES20.glUniformMatrix4fv(d, 1, false, k, 0);
        if (e != -1)
        {
            GLES20.glUniform1f(e, o);
            com.roidapp.videolib.gl.g.a("glUniform1f");
        }
        j();
        com.roidapp.videolib.gl.g.a("onUpdateInputTexture1");
        b();
        com.roidapp.videolib.gl.g.a("onUpdateInputTexture2");
        k();
        com.roidapp.videolib.gl.g.a("onUpdateInputTexture3");
        a();
        com.roidapp.videolib.gl.g.a("onDrawArraysPre");
        GLES20.glDrawArrays(5, 0, 4);
        com.roidapp.videolib.gl.g.a("glDrawArrays");
        GLES20.glDisableVertexAttribArray(b);
        com.roidapp.videolib.gl.g.a("glDisableVertexAttribArray");
        GLES20.glDisableVertexAttribArray(f);
        com.roidapp.videolib.gl.g.a("glDisableVertexAttribArray");
        if (w >= 0)
        {
            GLES20.glDisableVertexAttribArray(w);
        }
        GLES20.glBindTexture(3553, 0);
        com.roidapp.videolib.gl.g.a("glBindTexture");
    }

    public final void a(int i1, FloatBuffer floatbuffer, FloatBuffer floatbuffer1, boolean flag)
    {
        x = flag;
        a(i1, floatbuffer, floatbuffer1);
        x = false;
    }

    public void a(int i1, FloatBuffer floatbuffer, FloatBuffer floatbuffer1, float af[])
    {
        a(i1, floatbuffer, floatbuffer1);
    }

    public final void a(int i1, float af[])
    {
        a(((Runnable) (new j(this, i1, af))));
    }

    public final void a(e e1)
    {
        p = e1;
    }

    public final void a(Runnable runnable)
    {
        synchronized (y)
        {
            y.addLast(runnable);
        }
        return;
        runnable;
        linkedlist;
        JVM INSTR monitorexit ;
        throw runnable;
    }

    protected void b()
    {
    }

    public void c()
    {
        a = com.roidapp.videolib.gl.g.a(z, A);
        Log.e("GPUImagefilter", (new StringBuilder("onInit  mGLProgId ")).append(a).toString());
        b = GLES20.glGetAttribLocation(a, "position");
        c = GLES20.glGetUniformLocation(a, "inputImageTexture");
        d = GLES20.glGetUniformLocation(a, "uMVPMatrix");
        f = GLES20.glGetAttribLocation(a, "inputTextureCoordinate");
    }

    public void d()
    {
        i = true;
    }

    public void e()
    {
    }

    public void e(float f1)
    {
        o = f1;
    }

    public final void f(float f1)
    {
        v = f1;
    }

    public final void h()
    {
        c();
        i = true;
        Matrix.setIdentityM(k, 0);
        Matrix.setIdentityM(m, 0);
        Matrix.setIdentityM(n, 0);
        Matrix.setIdentityM(l, 0);
        o = 1.0F;
        d();
    }

    public final void i()
    {
        i = false;
        GLES20.glDeleteProgram(a);
        e();
    }

    protected void j()
    {
    }

    protected void k()
    {
    }

    protected final void l()
    {
        LinkedList linkedlist = y;
        linkedlist;
        JVM INSTR monitorenter ;
        for (; !y.isEmpty(); com.roidapp.videolib.gl.g.a("runPendingOnDrawTasks"))
        {
            ((Runnable)y.removeFirst()).run();
        }

        break MISSING_BLOCK_LABEL_45;
        Exception exception;
        exception;
        linkedlist;
        JVM INSTR monitorexit ;
        throw exception;
        linkedlist;
        JVM INSTR monitorexit ;
    }

    public final boolean m()
    {
        return i;
    }

    public final float[] n()
    {
        return k;
    }

    public final float o()
    {
        return v;
    }

    public final int p()
    {
        return a;
    }
}
