// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.media.effects;

import android.opengl.GLES20;
import com.skype.android.media.GLES20Program;

// Referenced classes of package com.skype.android.media.effects:
//            ParticleSystemRenderer

private final class m extends GLES20Program
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

    static int a(m m1)
    {
        return m1.i;
    }

    static int b(i i1)
    {
        return i1.j;
    }

    static int c(j j1)
    {
        return j1.h;
    }

    static int d(h h1)
    {
        return h1.l;
    }

    static int e(l l1)
    {
        return l1.b;
    }

    static int f(b b1)
    {
        return b1.e;
    }

    static int g(e e1)
    {
        return e1.d;
    }

    static int h(d d1)
    {
        return d1.k;
    }

    static int i(k k1)
    {
        return k1.c;
    }

    static int j(c c1)
    {
        return c1.m;
    }

    static int k(m m1)
    {
        return m1.n;
    }

    static int l(n n1)
    {
        return n1.f;
    }

    static int m(f f1)
    {
        return f1.g;
    }

    (ParticleSystemRenderer particlesystemrenderer)
    {
        a = particlesystemrenderer;
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
