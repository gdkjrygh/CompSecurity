// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.env.gl;

import android.opengl.GLES20;
import com.google.android.apps.unveil.env.af;
import java.nio.IntBuffer;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.apps.unveil.env.gl:
//            i

public final class ShaderProgram
{

    final int a = GLES20.glCreateProgram();
    private final af b = new af();
    private final Map c = new HashMap();
    private final Map d = new HashMap();
    private final String e;
    private boolean f;

    public ShaderProgram(String s)
    {
        e = s;
        f = true;
    }

    public final int a(ATTRIBUTE_SLOT attribute_slot)
    {
        int j = GLES20.glGetAttribLocation(a, attribute_slot.toString());
        if (j != -1)
        {
            c.put(attribute_slot, Integer.valueOf(j));
        } else
        {
            b.e("Unable to find attribute %s in shader %s", new Object[] {
                attribute_slot, e
            });
        }
        return ((Integer)c.get(attribute_slot)).intValue();
    }

    public final int a(UNIFORM_SLOT uniform_slot)
    {
        int j = GLES20.glGetUniformLocation(a, uniform_slot.toString());
        if (j != -1)
        {
            d.put(uniform_slot, Integer.valueOf(j));
        } else
        {
            b.e("Unable to find attribute %s in shader %s", new Object[] {
                uniform_slot, e
            });
        }
        return ((Integer)d.get(uniform_slot)).intValue();
    }

    public final void a()
    {
        GLES20.glLinkProgram(a);
        int ai[] = new int[1];
        GLES20.glGetProgramiv(a, 35714, IntBuffer.wrap(ai));
        if (ai[0] == 1)
        {
            b.b("Program %s linked successfully.", new Object[] {
                e
            });
            return;
        } else
        {
            String s = GLES20.glGetProgramInfoLog(a);
            b.e("Program %s did not link:\n%s", new Object[] {
                e, s
            });
            s = e;
            throw new RuntimeException((new StringBuilder(String.valueOf(s).length() + 23)).append("Program ").append(s).append(" failed to link").toString());
        }
    }

    public final void a(i j)
    {
        GLES20.glAttachShader(a, j.a);
    }

    public final int b(ATTRIBUTE_SLOT attribute_slot)
    {
        return ((Integer)c.get(attribute_slot)).intValue();
    }

    public final int b(UNIFORM_SLOT uniform_slot)
    {
        return ((Integer)d.get(uniform_slot)).intValue();
    }

    protected final void finalize()
    {
        if (f)
        {
            f = false;
            GLES20.glDeleteProgram(a);
        }
        super.finalize();
        return;
        Exception exception;
        exception;
        super.finalize();
        throw exception;
    }

    private class ATTRIBUTE_SLOT extends Enum
    {

        public static final ATTRIBUTE_SLOT COLOR;
        public static final ATTRIBUTE_SLOT TEXUV;
        public static final ATTRIBUTE_SLOT VERTEX;
        private static final ATTRIBUTE_SLOT a[];

        public static ATTRIBUTE_SLOT valueOf(String s)
        {
            return (ATTRIBUTE_SLOT)Enum.valueOf(com/google/android/apps/unveil/env/gl/ShaderProgram$ATTRIBUTE_SLOT, s);
        }

        public static ATTRIBUTE_SLOT[] values()
        {
            return (ATTRIBUTE_SLOT[])a.clone();
        }

        static 
        {
            VERTEX = new ATTRIBUTE_SLOT("VERTEX", 0);
            COLOR = new ATTRIBUTE_SLOT("COLOR", 1);
            TEXUV = new ATTRIBUTE_SLOT("TEXUV", 2);
            a = (new ATTRIBUTE_SLOT[] {
                VERTEX, COLOR, TEXUV
            });
        }

        private ATTRIBUTE_SLOT(String s, int j)
        {
            super(s, j);
        }
    }


    private class UNIFORM_SLOT extends Enum
    {

        public static final UNIFORM_SLOT COLOR;
        public static final UNIFORM_SLOT DISTORTION;
        public static final UNIFORM_SLOT PVMATRIX;
        public static final UNIFORM_SLOT TEX_MATRIX;
        public static final UNIFORM_SLOT TEX_OES;
        public static final UNIFORM_SLOT TEX_UV;
        public static final UNIFORM_SLOT TEX_Y;
        private static final UNIFORM_SLOT a[];

        public static UNIFORM_SLOT valueOf(String s)
        {
            return (UNIFORM_SLOT)Enum.valueOf(com/google/android/apps/unveil/env/gl/ShaderProgram$UNIFORM_SLOT, s);
        }

        public static UNIFORM_SLOT[] values()
        {
            return (UNIFORM_SLOT[])a.clone();
        }

        static 
        {
            PVMATRIX = new UNIFORM_SLOT("PVMATRIX", 0);
            TEX_MATRIX = new UNIFORM_SLOT("TEX_MATRIX", 1);
            TEX_OES = new UNIFORM_SLOT("TEX_OES", 2);
            DISTORTION = new UNIFORM_SLOT("DISTORTION", 3);
            TEX_Y = new UNIFORM_SLOT("TEX_Y", 4);
            TEX_UV = new UNIFORM_SLOT("TEX_UV", 5);
            COLOR = new UNIFORM_SLOT("COLOR", 6);
            a = (new UNIFORM_SLOT[] {
                PVMATRIX, TEX_MATRIX, TEX_OES, DISTORTION, TEX_Y, TEX_UV, COLOR
            });
        }

        private UNIFORM_SLOT(String s, int j)
        {
            super(s, j);
        }
    }

}
