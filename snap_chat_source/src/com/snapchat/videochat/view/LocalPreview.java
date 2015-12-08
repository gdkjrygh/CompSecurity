// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.videochat.view;

import VA;
import VB;
import android.content.Context;
import android.content.res.Resources;
import android.opengl.GLES20;

// Referenced classes of package com.snapchat.videochat.view:
//            StreamView, GlTextureView

public class LocalPreview
{
    final class a extends GlTextureView
    {

        private LocalPreview b;

        public final void a()
        {
            LocalPreview.a(b);
        }

        public final void b()
        {
            LocalPreview.a(b, b.b);
        }

        protected a(Context context)
        {
            b = LocalPreview.this;
            super(context);
        }
    }

    public final class b extends Exception
    {

        private b(String s)
        {
            super(s);
        }

        b(String s, byte byte0)
        {
            this(s);
        }
    }


    private static boolean c;
    public a a;
    protected byte b[];
    private Context d;

    public LocalPreview(Context context)
    {
        if (!c)
        {
            throw new b("Native library failed to load.", (byte)0);
        } else
        {
            d = context;
            context.getResources().getDisplayMetrics();
            a = new a(context);
            return;
        }
    }

    public static void a(float f1)
    {
        nativeSetCircleRadius(f1);
    }

    public static void a(int i, int j, int k, int l)
    {
        nativeSetPreviewSize(i, j, k, l);
    }

    static void a(LocalPreview localpreview)
    {
        int i;
        boolean flag;
        int j;
        int k;
        flag = false;
        i = VB.a(35633, VA.a(localpreview.d, Vl.g.instasnap_vert_shader));
        k = VB.a(35632, VA.a(localpreview.d, Vl.g.instasnap_frag_shader));
        j = GLES20.glCreateProgram();
        if (j == 0) goto _L2; else goto _L1
_L1:
        GLES20.glAttachShader(j, i);
        GLES20.glAttachShader(j, k);
        for (i = 0; i < 3; i++)
        {
            GLES20.glBindAttribLocation(j, i, (new String[] {
                "a_Position", "a_TexCoordinate", "a_CircleCoordinate"
            })[i]);
        }

        GLES20.glLinkProgram(j);
        localpreview = new int[1];
        GLES20.glGetProgramiv(j, 35714, localpreview, 0);
        if (localpreview[0] != 0) goto _L2; else goto _L3
_L3:
        (new StringBuilder("Error compiling program: ")).append(GLES20.glGetProgramInfoLog(j));
        GLES20.glDeleteProgram(j);
        i = ((flag) ? 1 : 0);
_L5:
        if (i == 0)
        {
            throw new RuntimeException("Error creating program.");
        }
        try
        {
            nativeInitialize(i);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (LocalPreview localpreview)
        {
            StreamView.i = true;
        }
        return;
_L2:
        i = j;
        if (true) goto _L5; else goto _L4
_L4:
    }

    static void a(LocalPreview localpreview, byte abyte0[])
    {
        localpreview.nativeRenderFrame(abyte0);
    }

    public static boolean a()
    {
        return c;
    }

    public static void b()
    {
        c = false;
    }

    public static boolean c()
    {
        return nativeIsPreviewSizeSet();
    }

    public static void d()
    {
        nativeResetPreviewSize();
    }

    public static void e()
    {
        nativeReflectX();
    }

    public static void f()
    {
        nativeReflectY();
    }

    private static native void nativeInitialize(int i);

    private static native boolean nativeIsPreviewSizeSet();

    private static native void nativeReflectX();

    private static native void nativeReflectY();

    private native void nativeRenderFrame(byte abyte0[]);

    private static native void nativeResetPreviewSize();

    private static native void nativeSetCircleRadius(float f1);

    private static native void nativeSetPreviewSize(int i, int j, int k, int l);

    public final void a(byte abyte0[])
    {
        b = abyte0;
        abyte0 = a;
        if (((GlTextureView) (abyte0)).a != null)
        {
            synchronized (((GlTextureView) (abyte0)).a)
            {
                abyte0.b = true;
                abyte0.notify();
            }
            return;
        } else
        {
            return;
        }
        exception;
        abyte0;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static 
    {
        try
        {
            System.loadLibrary("LocalPreview");
            c = true;
        }
        catch (UnsatisfiedLinkError unsatisfiedlinkerror)
        {
            String.format("System.loadLibrary(\"LocalPreview\") failed: %s.", new Object[] {
                unsatisfiedlinkerror.getMessage()
            });
        }
    }
}
