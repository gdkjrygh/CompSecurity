// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.wordlens;

import android.content.Context;
import android.content.res.TypedArray;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import javax.microedition.khronos.egl.EGL10;

// Referenced classes of package com.google.android.libraries.wordlens:
//            j, b, a

public class GL2SurfaceView extends GLSurfaceView
{

    private static String a = "QV";

    public GL2SurfaceView(Context context)
    {
        this(context, false);
    }

    public GL2SurfaceView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = context.obtainStyledAttributes(attributeset, j.GL2SurfaceView);
        a(Boolean.valueOf(context.getBoolean(j.GL2SurfaceView_translucent, false)).booleanValue(), 0, 8);
        context.recycle();
    }

    public GL2SurfaceView(Context context, boolean flag)
    {
        this(context, flag, 0, 8);
    }

    public GL2SurfaceView(Context context, boolean flag, int i, int k)
    {
        super(context);
        a(flag, i, k);
    }

    static void a(String s, EGL10 egl10)
    {
        do
        {
            int i = egl10.eglGetError();
            if (i != 12288)
            {
                String.format("%s: EGL error: 0x%x", new Object[] {
                    s, Integer.valueOf(i)
                });
            } else
            {
                return;
            }
        } while (true);
    }

    private void a(boolean flag, int i, int k)
    {
        setEGLContextClientVersion(2);
        if (flag)
        {
            getHolder().setFormat(-3);
        }
        setEGLContextFactory(new b(this));
        if (flag)
        {
            setEGLConfigChooser(8, 8, 8, 8, 16, 8);
            return;
        } else
        {
            setEGLConfigChooser(new a(i, k));
            return;
        }
    }

}
