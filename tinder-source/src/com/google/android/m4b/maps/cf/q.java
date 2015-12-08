// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cf;

import android.opengl.GLES20;
import android.util.Log;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.y.j;

// Referenced classes of package com.google.android.m4b.maps.cf:
//            g

public final class q
{

    private String a;
    private String b;
    private int c;
    private int d;
    private boolean e;

    private static int a(int i, String s)
    {
        int k = GLES20.glCreateShader(i);
        if (k != 0)
        {
            GLES20.glShaderSource(k, s);
            GLES20.glCompileShader(k);
            s = new int[1];
            GLES20.glGetShaderiv(k, 35713, s, 0);
            if (s[0] == 0)
            {
                if (ab.a("ShaderProgram", 6))
                {
                    Log.e("ShaderProgram", (new StringBuilder(37)).append("Could not compile shader ").append(i).append(":").toString());
                }
                if (ab.a("ShaderProgram", 6))
                {
                    Log.e("ShaderProgram", GLES20.glGetShaderInfoLog(k));
                }
                GLES20.glDeleteShader(k);
                return 0;
            }
        }
        return k;
    }

    public final boolean a(f.a a1)
    {
        while (a1.d == e && !a1.e || !a1.d && !a1.e) 
        {
            return false;
        }
        e = a1.d;
        if (!e) goto _L2; else goto _L1
_L1:
        String s;
        int i;
        int l;
        if (a1.e)
        {
            c = 0;
        }
        boolean flag;
        if (c == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j.b(flag, "Attempt to overwrite existing shader program: %s", new Object[] {
            Integer.valueOf(c)
        });
        a1 = a;
        s = b;
        l = a(35633, ((String) (a1)));
        if (l != 0) goto _L4; else goto _L3
_L3:
        i = 0;
_L6:
        c = i;
        GLES20.glUseProgram(c);
        i = GLES20.glGetUniformLocation(c, "uMVPMatrix");
        if (i == -1)
        {
            throw new IllegalStateException((new StringBuilder(String.valueOf("uMVPMatrix").length() + 21)).append("Unable to get ").append("uMVPMatrix").append(" handle").toString());
        }
        break; /* Loop/switch isn't completed */
_L4:
        int i1 = a(35632, s);
        if (i1 == 0)
        {
            i = 0;
        } else
        {
            int k = GLES20.glCreateProgram();
            i = k;
            if (k != 0)
            {
                GLES20.glAttachShader(k, l);
                g.a("ShaderState", "glAttachShader");
                GLES20.glAttachShader(k, i1);
                g.a("ShaderState", "glAttachShader");
                GLES20.glBindAttribLocation(k, 0, "aPosition");
                g.a("ShaderProgram", "bindAttribute aPosition");
                GLES20.glBindAttribLocation(k, 1, "aNormal");
                g.a("ShaderProgram", "bindAttribute aTextureCoord");
                GLES20.glBindAttribLocation(k, 2, "aColor");
                g.a("ShaderProgram", "bindAttribute aColor");
                GLES20.glBindAttribLocation(k, 4, "aTextureCoord");
                g.a("ShaderProgram", "bindAttribute aTextureCoord");
                GLES20.glLinkProgram(k);
                a1 = new int[1];
                GLES20.glGetProgramiv(k, 35714, a1, 0);
                i = k;
                if (a1[0] != 1)
                {
                    if (ab.a("ShaderProgram", 6))
                    {
                        Log.e("ShaderProgram", "Could not link program: ");
                    }
                    if (ab.a("ShaderProgram", 6))
                    {
                        Log.e("ShaderProgram", GLES20.glGetProgramInfoLog(k));
                    }
                    GLES20.glDeleteProgram(k);
                    i = 0;
                }
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
        g.a("ShaderProgram", "glGetUniformLocation");
        d = i;
        GLES20.glUseProgram(0);
_L8:
        return true;
_L2:
        if (!a1.e)
        {
            GLES20.glDeleteProgram(c);
        }
        c = 0;
        if (true) goto _L8; else goto _L7
_L7:
    }
}
