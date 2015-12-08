// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.media.effects;

import android.opengl.GLES20;
import com.skype.android.media.GLES20Program;
import java.nio.FloatBuffer;

public class DoodleRenderer
    implements com.skype.android.media.GLES20Renderer.Overlay
{
    private final class a extends GLES20Program
    {

        final DoodleRenderer a;
        private int b;
        private int c;
        private int d;

        static int a(a a1)
        {
            return a1.c;
        }

        static int b(a a1)
        {
            return a1.d;
        }

        static int c(a a1)
        {
            return a1.b;
        }

        a()
        {
            a = DoodleRenderer.this;
            super("precision mediump float;                                     \nuniform mat4 uMVPMatrix;                                     \nattribute vec3 a_position;                                   \nattribute vec3 a_color;                                      \nvarying vec3 vertex_color;                                   \nvoid main()                                                  \n{                                                    \n   vec4 pos = vec4(a_position, 1.0);                 \n   gl_Position = uMVPMatrix*pos;                     \n   vertex_color = a_color;                           \n   gl_PointSize = 8.0;                               \n}", "precision mediump float;                                     \nvarying vec3 vertex_color;                                   \nvoid main()                                                  \n{                                                            \n  gl_FragColor = vec4(vertex_color, 1.0f);                   \n}                                                            \n");
            int i1 = b();
            c = GLES20.glGetAttribLocation(i1, "a_position");
            d = GLES20.glGetAttribLocation(i1, "a_color");
            b = GLES20.glGetUniformLocation(i1, "uMVPMatrix");
        }
    }


    private a a;
    private a b;
    private boolean c;
    private float d;
    private float e;
    private float f;
    private float g;
    private float h;
    private float i;
    private float j;
    private float k;
    private int l;
    private float m[];
    private int n;
    private final int o = 12;

    public DoodleRenderer()
    {
        n = 0x186a0;
        c = false;
        m = new float[n * 12];
        f = 1.0F;
        g = 0.0F;
        h = 0.0F;
    }

    private void a(a a1, float af[])
    {
        this;
        JVM INSTR monitorenter ;
        GLES20.glUseProgram(a1.b());
        FloatBuffer floatbuffer = GLES20Program.a(m);
        floatbuffer.put(m).position(0);
        floatbuffer.position(0);
        GLES20.glVertexAttribPointer(a.a(a1), 3, 5126, false, 48, floatbuffer);
        GLES20.glEnableVertexAttribArray(a.a(a1));
        floatbuffer.position(3);
        GLES20.glVertexAttribPointer(a.b(a1), 3, 5126, false, 48, floatbuffer);
        GLES20.glEnableVertexAttribArray(a.b(a1));
        GLES20.glBlendFunc(1, 771);
        GLES20.glEnable(3042);
        GLES20.glUniformMatrix4fv(a.c(a1), 1, false, af, 0);
        GLES20.glDrawArrays(0, 0, l);
        GLES20.glFlush();
        GLES20.glFinish();
        GLES20.glBindTexture(3553, 0);
        GLES20.glUseProgram(0);
        this;
        JVM INSTR monitorexit ;
        return;
        a1;
        throw a1;
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        a = new a();
        b = new a();
        d = 0.0F;
        e = 0.0F;
        f = 1.0F;
        g = 0.0F;
        h = 0.0F;
        l = 0;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(float f1, float f2)
    {
        i = f1;
        j = f2;
    }

    public final void a(float f1, float f2, float f3)
    {
        f = f1;
        g = f2;
        h = f3;
    }

    public final void a(float af[])
    {
        a(a, af);
    }

    public final void b()
    {
        this;
        JVM INSTR monitorenter ;
        if (a != null)
        {
            a.a();
            a = null;
        }
        if (b != null)
        {
            b.a();
            b = null;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void b(float f1, float f2)
    {
        if (l < n) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!c || Math.abs(d - f1) <= 1.0F && Math.abs(e - f2) <= 1.0F)
        {
            m[l * 6] = (2.0F * f1) / i - 1.0F;
            m[l * 6 + 1] = ((-f2 * 2.0F) / j + 1.0F) * k;
            m[l * 6 + 2] = 0.0F;
            m[l * 6 + 3] = f;
            m[l * 6 + 4] = g;
            m[l * 6 + 5] = h;
            l = l + 1;
            d = f1;
            e = f2;
            c = true;
            return;
        }
        float f5 = f1;
        float f6 = f2;
        float f3;
        float f4;
        float f7;
        float f8;
        int i1;
        int j1;
        if (f5 > d)
        {
            f3 = -1F;
        } else
        {
            f3 = 1.0F;
        }
        if (f6 > e)
        {
            f4 = 1.0F;
        } else
        {
            f4 = -1F;
        }
        f7 = Math.abs(f5 - d);
        f8 = Math.abs(f6 - e);
        if (f7 > f8)
        {
            i1 = Math.round(f7 / 1.0F);
            f4 = (Math.abs(f6 - e) * f4) / (float)i1;
        } else
        {
            i1 = Math.round(f8 / 1.0F);
            f3 = (Math.abs(f5 - d) * f3) / (float)i1;
        }
        j1 = 0;
label0:
        do
        {
label1:
            {
                if (j1 >= i1)
                {
                    break label1;
                }
                if (l >= n)
                {
                    break label0;
                }
                m[l * 6] = (2.0F * f5) / i - 1.0F;
                m[l * 6 + 1] = ((-f6 * 2.0F) / j + 1.0F) * k;
                m[l * 6 + 2] = 0.0F;
                m[l * 6 + 3] = f;
                m[l * 6 + 4] = g;
                m[l * 6 + 5] = h;
                l = l + 1;
                f5 += 1.0F * f3;
                f6 += -1F * f4;
                j1++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        d = f1;
        e = f2;
        c = true;
        return;
    }

    public final void b(float af[])
    {
        this;
        JVM INSTR monitorenter ;
        a(b, af);
        this;
        JVM INSTR monitorexit ;
        return;
        af;
        throw af;
    }

    public final void c()
    {
        k = 1.0F;
    }

    public final void d()
    {
        c = false;
    }
}
