// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.PointF;
import android.graphics.RectF;
import android.opengl.GLES20;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public final class ajl
{

    public boolean a;
    public float b[] = {
        0.0F, 0.0F, 0.0F, 0.0F
    };
    public boolean c;
    public int d;
    public int e;
    public int f;
    public int g;
    private int h;
    private int i;
    private int j;
    private float k[] = {
        0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F
    };
    private float l[] = {
        -1F, -1F, 1.0F, -1F, -1F, 1.0F, 1.0F, 1.0F
    };
    private HashMap m;
    private HashMap n;

    public ajl(String s)
    {
        h = 0;
        a = false;
        c = false;
        d = 770;
        e = 771;
        f = 5;
        g = 4;
        i = 33984;
        j = 16384;
        n = new HashMap();
        h = a("attribute vec4 a_position;\nattribute vec2 a_texcoord;\nvarying vec2 v_texcoord;\nvoid main() {\n  gl_Position = a_position;\n  v_texcoord = a_texcoord;\n}\n", s);
        d();
    }

    public ajl(String s, String s1)
    {
        h = 0;
        a = false;
        c = false;
        d = 770;
        e = 771;
        f = 5;
        g = 4;
        i = 33984;
        j = 16384;
        n = new HashMap();
        h = a(s, s1);
        d();
    }

    private static int a(int i1, String s)
    {
        int j1 = GLES20.glCreateShader(i1);
        if (j1 != 0)
        {
            GLES20.glShaderSource(j1, s);
            GLES20.glCompileShader(j1);
            s = new int[1];
            GLES20.glGetShaderiv(j1, 35713, s, 0);
            if (s[0] == 0)
            {
                s = GLES20.glGetShaderInfoLog(j1);
                GLES20.glDeleteShader(j1);
                throw new RuntimeException((new StringBuilder(String.valueOf(s).length() + 37)).append("Could not compile shader ").append(i1).append(":").append(s).toString());
            }
        }
        return j1;
    }

    private static int a(String s, String s1)
    {
        int i1 = a(35633, s);
        if (i1 == 0)
        {
            throw new RuntimeException("Could not create shader-program as vertex shader could not be compiled!");
        }
        int j1 = a(35632, s1);
        if (j1 == 0)
        {
            throw new RuntimeException("Could not create shader-program as fragment shader could not be compiled!");
        }
        int k1 = GLES20.glCreateProgram();
        if (k1 != 0)
        {
            GLES20.glAttachShader(k1, i1);
            b.b("glAttachShader");
            GLES20.glAttachShader(k1, j1);
            b.b("glAttachShader");
            GLES20.glLinkProgram(k1);
            s = new int[1];
            GLES20.glGetProgramiv(k1, 35714, s, 0);
            if (s[0] != 1)
            {
                s = GLES20.glGetProgramInfoLog(k1);
                GLES20.glDeleteProgram(k1);
                s = String.valueOf(s);
                if (s.length() != 0)
                {
                    s = "Could not link program: ".concat(s);
                } else
                {
                    s = new String("Could not link program: ");
                }
                throw new RuntimeException(s);
            }
        }
        GLES20.glDeleteShader(i1);
        GLES20.glDeleteShader(j1);
        return k1;
    }

    static int a(byte abyte0[])
    {
        for (int i1 = 0; i1 < abyte0.length; i1++)
        {
            if (abyte0[i1] == 0)
            {
                return i1;
            }
        }

        return abyte0.length;
    }

    public static ajl a()
    {
        return new ajl("precision lowp float;\nuniform sampler2D tex_sampler_0;\nvarying vec2 v_texcoord;\nvoid main() {\n  gl_FragColor = texture2D(tex_sampler_0, v_texcoord);\n}\n");
    }

    private ajm a(String s, boolean flag)
    {
        ajm ajm1 = (ajm)m.get(s);
        if (ajm1 == null)
        {
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(s).length() + 19)).append("Unknown uniform '").append(s).append("'!").toString());
        } else
        {
            return ajm1;
        }
    }

    private static String a(int i1)
    {
        return (new StringBuilder(23)).append("tex_sampler_").append(i1).toString();
    }

    private static void a(ajm ajm1, int i1, int j1)
    {
        if (i1 % j1 != 0)
        {
            ajm1 = ajm1.a;
            throw new RuntimeException((new StringBuilder(String.valueOf(ajm1).length() + 111)).append("Size mismatch: Attempting to assign values of size ").append(i1).append(" to uniform '").append(ajm1).append("' (must be multiple of ").append(j1).append(")!").toString());
        }
        if (ajm1.d != i1 / j1)
        {
            ajm1 = ajm1.a;
            throw new RuntimeException((new StringBuilder(String.valueOf(ajm1).length() + 62)).append("Size mismatch: Cannot assign ").append(i1).append(" values to uniform '").append(ajm1).append("'!").toString());
        } else
        {
            return;
        }
    }

    private void a(ajz aajz[])
    {
        for (int i1 = 0; i1 < aajz.length;)
        {
            GLES20.glActiveTexture(i + i1);
            ajz ajz1 = aajz[i1];
            GLES20.glBindTexture(ajz1.b, ajz1.a);
            b.b("glBindTexture");
            int j1 = GLES20.glGetUniformLocation(h, a(i1));
            if (j1 >= 0)
            {
                GLES20.glUniform1i(j1, i1);
                b.b((new StringBuilder(33)).append("Binding input texture ").append(i1).toString());
                i1++;
            } else
            {
                int k1 = aajz.length;
                aajz = a(i1);
                throw new RuntimeException((new StringBuilder(String.valueOf(aajz).length() + 87)).append("Shader does not seem to support ").append(k1).append(" number of input textures! Missing uniform ").append(aajz).append("!").toString());
            }
        }

    }

    private void a(ajz aajz[], ajv ajv1, int i1, int j1)
    {
        b.b("Unknown Operation");
        if (h == 0)
        {
            throw new RuntimeException("Attempting to execute invalid shader-program!");
        }
        int k1 = aajz.length;
        if (k1 > 35661)
        {
            throw new RuntimeException((new StringBuilder(106)).append("Number of textures passed (").append(k1).append(") exceeds the maximum number of allowed texture units (").append(35661).append(")!").toString());
        }
        ajv1.b();
        GLES20.glViewport(0, 0, i1, j1);
        b.b("glViewport");
        c();
        ajv1 = b("a_texcoord", false);
        if (k != null && ajv1 != null)
        {
            ajv1.a(false, 8, 2, 5126, k);
        }
        k = null;
        ajv1 = b("a_position", false);
        if (l != null && ajv1 != null)
        {
            ajv1.a(false, 8, 2, 5126, l);
        }
        l = null;
        b();
        if (a)
        {
            GLES20.glClearColor(b[0], b[1], b[2], b[3]);
            GLES20.glClear(j);
        }
        if (c)
        {
            GLES20.glEnable(3042);
            GLES20.glBlendFunc(d, e);
        } else
        {
            GLES20.glDisable(3042);
        }
        b.b("Set render variables");
        a(aajz);
        aln.a("glDrawArrays");
        GLES20.glDrawArrays(f, 0, g);
        b.b("glDrawArrays");
        aln.a();
    }

    private ajn b(String s, boolean flag)
    {
        ajn ajn2 = (ajn)n.get(s);
        ajn ajn1 = ajn2;
        if (ajn2 == null)
        {
            int i1 = GLES20.glGetAttribLocation(h, s);
            if (i1 >= 0)
            {
                ajn1 = new ajn(s, i1);
                n.put(s, ajn1);
            } else
            {
                ajn1 = ajn2;
                if (flag)
                {
                    throw new IllegalArgumentException((new StringBuilder(String.valueOf(s).length() + 21)).append("Unknown attribute '").append(s).append("'!").toString());
                }
            }
        }
        return ajn1;
    }

    private void b()
    {
        Iterator iterator = n.values().iterator();
        while (iterator.hasNext()) 
        {
            ajn ajn1 = (ajn)iterator.next();
            if (ajn1.f != null)
            {
                GLES20.glBindBuffer(34962, 0);
                GLES20.glVertexAttribPointer(ajn1.a, ajn1.d, ajn1.e, ajn1.b, ajn1.c, ajn1.f);
            } else
            {
                GLES20.glBindBuffer(34962, 0);
                GLES20.glVertexAttribPointer(ajn1.a, ajn1.d, ajn1.e, ajn1.b, ajn1.c, 0);
            }
            GLES20.glEnableVertexAttribArray(ajn1.a);
            b.b("Set vertex-attribute values");
        }
        b.b("Push Attributes");
    }

    private void c()
    {
        GLES20.glUseProgram(h);
        b.b("glUseProgram");
    }

    private void d()
    {
        int ai[] = new int[1];
        GLES20.glGetProgramiv(h, 35718, ai, 0);
        if (ai[0] > 0)
        {
            m = new HashMap(ai[0]);
            for (int i1 = 0; i1 < ai[0]; i1++)
            {
                ajm ajm1 = new ajm(h, i1);
                m.put(ajm1.a, ajm1);
            }

        }
    }

    public final void a(float f1, float f2, float f3, float f4)
    {
        a(new float[] {
            f1, f2, f1 + f3, f2, f1, f2 + f4, f1 + f3, f2 + f4
        });
    }

    public final void a(ahv ahv1)
    {
        ajv ajv1 = ahv1.p();
        int i1 = ahv1.m();
        int j1 = ahv1.n();
        a(new ajz[0], ajv1, i1, j1);
        ahv1.k();
    }

    public final void a(ahv ahv1, ahv ahv2)
    {
        ajz ajz1 = ahv1.o();
        ajv ajv1 = ahv2.p();
        int i1 = ahv2.m();
        int j1 = ahv2.n();
        a(new ajz[] {
            ajz1
        }, ajv1, i1, j1);
        ahv1.k();
        ahv2.k();
    }

    public final void a(ajz ajz1, ajv ajv1, int i1, int j1)
    {
        a(new ajz[] {
            ajz1
        }, ajv1, i1, j1);
    }

    public final void a(ako ako1)
    {
        a(new float[] {
            ako1.a.x, ako1.a.y, ako1.b.x, ako1.b.y, ako1.c.x, ako1.c.y, ako1.d.x, ako1.d.y
        });
    }

    public final void a(RectF rectf)
    {
        c(new float[] {
            rectf.left, rectf.top, rectf.right, rectf.top, rectf.left, rectf.bottom, rectf.right, rectf.bottom
        });
    }

    public final void a(String s, float f1)
    {
        c();
        GLES20.glUniform1f(a(s, true).b, f1);
        b.b((new StringBuilder(String.valueOf(s).length() + 20)).append("Set uniform value (").append(s).append(")").toString());
    }

    public final void a(String s, float af[])
    {
        ajm ajm1;
        int i1;
        ajm1 = a(s, true);
        c();
        i1 = af.length;
        ajm1.c;
        JVM INSTR lookupswitch 7: default 84
    //                   5126: 139
    //                   35664: 197
    //                   35665: 220
    //                   35666: 243
    //                   35674: 266
    //                   35675: 290
    //                   35676: 316;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        af = String.valueOf("Cannot assign float-array to incompatible uniform type for uniform '");
        throw new RuntimeException((new StringBuilder(String.valueOf(af).length() + 2 + String.valueOf(s).length())).append(af).append(s).append("'!").toString());
_L2:
        a(ajm1, i1, 1);
        GLES20.glUniform1fv(ajm1.b, i1, af, 0);
_L10:
        b.b((new StringBuilder(String.valueOf(s).length() + 20)).append("Set uniform value (").append(s).append(")").toString());
        return;
_L3:
        a(ajm1, i1, 2);
        GLES20.glUniform2fv(ajm1.b, i1 / 2, af, 0);
        continue; /* Loop/switch isn't completed */
_L4:
        a(ajm1, i1, 3);
        GLES20.glUniform3fv(ajm1.b, i1 / 3, af, 0);
        continue; /* Loop/switch isn't completed */
_L5:
        a(ajm1, i1, 4);
        GLES20.glUniform4fv(ajm1.b, i1 / 4, af, 0);
        continue; /* Loop/switch isn't completed */
_L6:
        a(ajm1, i1, 4);
        GLES20.glUniformMatrix2fv(ajm1.b, i1 / 4, false, af, 0);
        continue; /* Loop/switch isn't completed */
_L7:
        a(ajm1, i1, 9);
        GLES20.glUniformMatrix3fv(ajm1.b, i1 / 9, false, af, 0);
        continue; /* Loop/switch isn't completed */
_L8:
        a(ajm1, i1, 16);
        GLES20.glUniformMatrix4fv(ajm1.b, i1 / 16, false, af, 0);
        if (true) goto _L10; else goto _L9
_L9:
    }

    public final void a(String s, float af[], int i1)
    {
        b(s, true).a(false, 8, 2, 5126, af);
    }

    public final void a(float af[])
    {
        k = Arrays.copyOf(af, 8);
    }

    public final void a(ahv aahv[], ahv ahv1)
    {
        boolean flag = false;
        ajz aajz[] = new ajz[aahv.length];
        for (int i1 = 0; i1 < aahv.length; i1++)
        {
            aajz[i1] = aahv[i1].o();
        }

        a(aajz, ahv1.p(), ahv1.m(), ahv1.n());
        int k1 = aahv.length;
        for (int j1 = ((flag) ? 1 : 0); j1 < k1; j1++)
        {
            aahv[j1].k();
        }

        ahv1.k();
    }

    public final void b(float f1, float f2, float f3, float f4)
    {
        c(new float[] {
            f1, f2, f1 + f3, f2, f1, f2 + f4, f1 + f3, f2 + f4
        });
    }

    public final void b(ako ako1)
    {
        c(new float[] {
            ako1.a.x, ako1.a.y, ako1.b.x, ako1.b.y, ako1.c.x, ako1.c.y, ako1.d.x, ako1.d.y
        });
    }

    public final void b(float af[])
    {
        if (af.length != 16)
        {
            throw new IllegalArgumentException("Expected 4x4 matrix for source transform!");
        } else
        {
            a(new float[] {
                af[12], af[13], af[0] + af[12], af[1] + af[13], af[4] + af[12], af[5] + af[13], af[0] + af[4] + af[12], af[1] + af[5] + af[13]
            });
            return;
        }
    }

    public final void c(float af[])
    {
        if (af.length != 8)
        {
            String s = String.valueOf("Expected 8 coordinates as target coordinates but got ");
            int i1 = af.length;
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(s).length() + 24)).append(s).append(i1).append(" coordinates!").toString());
        }
        l = new float[8];
        for (int j1 = 0; j1 < 8; j1++)
        {
            l[j1] = af[j1] * 2.0F - 1.0F;
        }

    }

    protected final void finalize()
    {
        GLES20.glDeleteProgram(h);
    }
}
