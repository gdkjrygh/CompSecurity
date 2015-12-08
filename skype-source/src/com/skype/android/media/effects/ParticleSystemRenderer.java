// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.media.effects;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import com.skype.android.media.GLES20Program;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Random;

public class ParticleSystemRenderer
    implements com.skype.android.media.GLES20Renderer.Overlay
{
    public static final class AnimationDirection extends Enum
    {

        public static final AnimationDirection a;
        public static final AnimationDirection b;
        private static final AnimationDirection c[];

        public static AnimationDirection valueOf(String s1)
        {
            return (AnimationDirection)Enum.valueOf(com/skype/android/media/effects/ParticleSystemRenderer$AnimationDirection, s1);
        }

        public static AnimationDirection[] values()
        {
            return (AnimationDirection[])c.clone();
        }

        static 
        {
            a = new AnimationDirection("DOWN", 0);
            b = new AnimationDirection("UP", 1);
            c = (new AnimationDirection[] {
                a, b
            });
        }

        private AnimationDirection(String s1, int i1)
        {
            super(s1, i1);
        }
    }

    private final class a extends GLES20Program
    {

        final ParticleSystemRenderer a;
        private int b;
        private int c;
        private int d;
        private int e;
        private int f;
        private int g;
        private int h;
        private int i;
        private int j;
        private int k;
        private int l;
        private int m;
        private int n;

        static int a(a a1)
        {
            return a1.i;
        }

        static int b(a a1)
        {
            return a1.j;
        }

        static int c(a a1)
        {
            return a1.h;
        }

        static int d(a a1)
        {
            return a1.l;
        }

        static int e(a a1)
        {
            return a1.b;
        }

        static int f(a a1)
        {
            return a1.e;
        }

        static int g(a a1)
        {
            return a1.d;
        }

        static int h(a a1)
        {
            return a1.k;
        }

        static int i(a a1)
        {
            return a1.c;
        }

        static int j(a a1)
        {
            return a1.m;
        }

        static int k(a a1)
        {
            return a1.n;
        }

        static int l(a a1)
        {
            return a1.f;
        }

        static int m(a a1)
        {
            return a1.g;
        }

        a()
        {
            a = ParticleSystemRenderer.this;
            super("precision mediump float;                             \nuniform float u_time;                                \nuniform float u_velocity;                            \nuniform float u_density;                             \nuniform mat4 u_MVPMatrix;                            \nuniform vec3 u_centerPosition;                       \nuniform vec2 u_ratio;                                \nuniform float u_alpha;                               \nattribute float a_size;                              \nattribute float a_lifetime;                          \nattribute vec3 a_startPosition;                      \nattribute vec3 a_endPosition;                        \nvarying float v_lifetime;                            \nvarying float v_size;                                \nvarying vec2 v_ratio;                                \nvoid main()                                          \n{                                                    \n  vec4 pos;                                          \n  if ( u_time <= a_lifetime * 5.0 )                  \n  {                                                  \n    pos.xyz = a_startPosition +                      \n      u_velocity * u_time * a_endPosition;           \n    pos.xyz += u_centerPosition;                     \n    pos.w = 1.0;                                     \n  }                                                  \n  else                                               \n     pos = vec4( -1000, -1000, 0, 0 );               \n  gl_Position = u_MVPMatrix * pos;                   \n  v_lifetime = 5.0 - ( u_time / a_lifetime ) / 5.0;  \n  v_lifetime = clamp ( v_lifetime, 0.0, 1.0 );       \n  gl_PointSize = u_density * (20.0 +a_size);\n  v_ratio = u_ratio;                                 \n}", "precision mediump float;                             \nuniform vec4 u_color;                                \nvarying float v_lifetime;                            \nuniform float u_alpha;                               \nvarying vec2 v_ratio;                                \nuniform sampler2D s_texture;                         \nvoid main()                                          \n{                                                    \n  vec4 texColor;                                     \n  texColor = texture2D( s_texture, gl_PointCoord * v_ratio);\n  gl_FragColor = vec4( u_color ) * texColor;         \n  gl_FragColor.a *=  u_alpha;            \n}                                                    \n");
            int i1 = b();
            l = GLES20.glGetAttribLocation(i1, "a_size");
            b = GLES20.glGetAttribLocation(i1, "a_lifetime");
            d = GLES20.glGetAttribLocation(i1, "a_startPosition");
            e = GLES20.glGetAttribLocation(i1, "a_endPosition");
            f = GLES20.glGetUniformLocation(i1, "u_MVPMatrix");
            g = GLES20.glGetUniformLocation(i1, "u_density");
            h = GLES20.glGetUniformLocation(i1, "u_time");
            c = GLES20.glGetUniformLocation(i1, "u_velocity");
            i = GLES20.glGetUniformLocation(i1, "u_centerPosition");
            j = GLES20.glGetUniformLocation(i1, "u_color");
            k = GLES20.glGetUniformLocation(i1, "s_texture");
            n = GLES20.glGetUniformLocation(i1, "u_alpha");
            m = GLES20.glGetUniformLocation(i1, "u_ratio");
        }
    }


    private int a;
    private a b;
    private a c;
    private int d[];
    private Context e;
    private int f;
    private AnimationDirection g;
    private float h;
    private float i;
    private long j;
    private FloatBuffer k;
    private int l;
    private float m[];
    private float n[];
    private boolean o;
    private float p;
    private int q[];
    private float r[];
    private float s[];

    public ParticleSystemRenderer(Context context, float af[], int ai[], boolean flag)
    {
        m = new float[l * 8];
        a = ai.length;
        d = new int[a];
        q = ai;
        e = context;
        n = af;
        o = flag;
        p = context.getResources().getDisplayMetrics().density;
        g = AnimationDirection.a;
        h = 1.0F;
        r = new float[3];
        s = new float[4];
    }

    private void a(a a1, float af[])
    {
        this;
        JVM INSTR monitorenter ;
        if (j == 0L)
        {
            j = SystemClock.uptimeMillis();
        }
        long l1 = SystemClock.uptimeMillis();
        float f1 = (float)(l1 - j) / 1000F;
        j = l1;
        i = i + f1;
        GLES20.glUseProgram(a1.b());
        if (i < 5F)
        {
            break MISSING_BLOCK_LABEL_563;
        }
        i = 0.0F;
        r[0] = 0.0F;
        r[1] = 0.0F;
        r[2] = 0.0F;
        GLES20.glUniform3f(a.a(a1), r[0], r[1], r[2]);
        s[0] = 1.0F;
        s[1] = 1.0F;
        s[2] = 1.0F;
        s[3] = 1.0F;
        GLES20.glUniform4f(a.b(a1), s[0], s[1], s[2], s[3]);
        f = f + 1;
_L3:
        GLES20.glUniform1f(a.c(a1), i);
        if (f >= -1)
        {
            GLES20.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        }
        GLES20.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        GLES20.glUseProgram(a1.b());
        int i1 = 0;
_L2:
        int j1;
        if (i1 >= a)
        {
            break; /* Loop/switch isn't completed */
        }
        j1 = (l / a) * i1 * 8;
        k.position(j1);
        GLES20.glVertexAttribPointer(a.d(a1), 1, 5126, false, 32, k);
        k.position(j1 + 1);
        GLES20.glVertexAttribPointer(a.e(a1), 1, 5126, false, 32, k);
        k.position(j1 + 2);
        GLES20.glVertexAttribPointer(a.f(a1), 3, 5126, false, 32, k);
        k.position(j1 + 5);
        GLES20.glVertexAttribPointer(a.g(a1), 3, 5126, false, 32, k);
        GLES20.glEnableVertexAttribArray(a.d(a1));
        GLES20.glEnableVertexAttribArray(a.e(a1));
        GLES20.glEnableVertexAttribArray(a.f(a1));
        GLES20.glEnableVertexAttribArray(a.g(a1));
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(770, 771);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, d[i1]);
        GLES20.glUniform1i(a.h(a1), 0);
        GLES20.glUniform1f(a.i(a1), 0.5F);
        float f2 = n[4] / n[0];
        float f4 = Math.abs(af[5]);
        float f5 = Math.abs(af[0]);
        GLES20.glUniform2f(a.j(a1), f4, f5 * f2);
        j1 = a.k(a1);
        float f3;
        if (o)
        {
            f3 = 0.5F;
        } else
        {
            f3 = 1.0F;
        }
        GLES20.glUniform1f(j1, f3);
        GLES20.glUniformMatrix4fv(a.l(a1), 1, false, af, 0);
        GLES20.glUniform1f(a.m(a1), p);
        GLES20.glDrawArrays(0, 0, l / a);
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
        break MISSING_BLOCK_LABEL_633;
        GLES20.glUniform3f(a.a(a1), r[0], r[1], r[2]);
        GLES20.glUniform4f(a.b(a1), s[0], s[1], s[2], s[3]);
          goto _L3
        a1;
        throw a1;
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        b = new a();
        c = new a();
        l = 15;
        m = new float[l * 8];
        obj = new Random();
        int i1 = 0;
_L8:
        if (i1 >= l)
        {
            break MISSING_BLOCK_LABEL_280;
        }
        m[i1 * 8 + 0] = ((Random) (obj)).nextFloat() * 40F * 1.0F * h;
        m[i1 * 8 + 1] = 1.0F;
        m[i1 * 8 + 2] = ((Random) (obj)).nextFloat() * 2.0F - 1.0F;
        if (g != AnimationDirection.a) goto _L2; else goto _L1
_L1:
        m[i1 * 8 + 3] = -1F;
_L3:
        m[i1 * 8 + 4] = 0.0F;
        m[i1 * 8 + 5] = ((Random) (obj)).nextFloat() * 2.0F - 1.0F;
        if (g != AnimationDirection.a)
        {
            break MISSING_BLOCK_LABEL_256;
        }
        m[i1 * 8 + 6] = ((Random) (obj)).nextFloat() * 2.0F - 1.0F;
_L4:
        m[i1 * 8 + 7] = 0.0F;
        i1++;
        continue; /* Loop/switch isn't completed */
_L2:
        m[i1 * 8 + 3] = 1.0F;
          goto _L3
        obj;
        throw obj;
        m[i1 * 8 + 6] = ((Random) (obj)).nextFloat() * 1.0F - 2.0F;
          goto _L4
        k = ByteBuffer.allocateDirect(m.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        k.put(m).position(0);
        i = 5F;
        j = 0L;
        GLES20.glGenTextures(d.length, d, 0);
        i1 = 0;
_L6:
        Bitmap bitmap;
        if (i1 >= d.length)
        {
            break; /* Loop/switch isn't completed */
        }
        GLES20.glBindTexture(3553, d[i1]);
        bitmap = BitmapFactory.decodeStream(e.getResources().openRawResource(q[i1]));
        obj = bitmap;
        if (bitmap.getWidth() != bitmap.getHeight())
        {
            int j1 = Math.max(bitmap.getWidth(), bitmap.getHeight());
            Bitmap bitmap1 = Bitmap.createBitmap(j1, j1, android.graphics.Bitmap.Config.ARGB_8888);
            (new Canvas(bitmap1)).drawBitmap(bitmap, (j1 - bitmap.getWidth()) / 2, (j1 - bitmap.getHeight()) / 2, null);
            obj = bitmap1.copy(bitmap1.getConfig(), true);
            bitmap1.recycle();
        }
        GLUtils.texImage2D(3553, 0, ((Bitmap) (obj)), 0);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        ((Bitmap) (obj)).recycle();
        i1++;
        if (true) goto _L6; else goto _L5
_L5:
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final void a(float f1)
    {
        h = f1;
    }

    public final void a(AnimationDirection animationdirection)
    {
        g = animationdirection;
    }

    public final void a(float af[])
    {
        a(b, af);
    }

    public final void b()
    {
        this;
        JVM INSTR monitorenter ;
        if (b != null)
        {
            b.a();
        }
        if (c != null)
        {
            c.a();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void b(float af[])
    {
        a(c, af);
    }
}
