// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.ui;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.opengl.GLU;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import java.util.ArrayList;
import java.util.Iterator;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

// Referenced classes of package com.google.android.apps.unveil.ui:
//            c

public class GlOverlay extends GLSurfaceView
    implements android.opengl.GLSurfaceView.Renderer
{

    private final ArrayList a = new ArrayList();

    public GlOverlay(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        setEGLConfigChooser(8, 8, 8, 8, 0, 0);
        setRenderer(this);
        getHolder().setFormat(-2);
        setRenderMode(0);
    }

    private static void a(GL10 gl10, int i, int j)
    {
        gl10.glViewport(0, 0, i, j);
        gl10.glMatrixMode(5889);
        GLU.gluOrtho2D(gl10, 0.0F, 1.0F, 0.0F, 1.0F);
        gl10.glLoadIdentity();
        gl10.glMatrixMode(5888);
        gl10.glLoadIdentity();
    }

    public final void a(c c1)
    {
        this;
        JVM INSTR monitorenter ;
        a.add(c1);
        this;
        JVM INSTR monitorexit ;
        return;
        c1;
        throw c1;
    }

    public void onDrawFrame(GL10 gl10)
    {
        this;
        JVM INSTR monitorenter ;
        gl10.glClear(16640);
        c c1;
        for (Iterator iterator = a.iterator(); iterator.hasNext(); c1.i())
        {
            c1 = (c)iterator.next();
            a(gl10, getWidth(), getHeight());
        }

        break MISSING_BLOCK_LABEL_64;
        gl10;
        throw gl10;
        this;
        JVM INSTR monitorexit ;
    }

    public void onSurfaceChanged(GL10 gl10, int i, int j)
    {
        this;
        JVM INSTR monitorenter ;
        int k;
        k = j;
        if (j == 0)
        {
            k = 1;
        }
        a(gl10, i, k);
        this;
        JVM INSTR monitorexit ;
        return;
        gl10;
        throw gl10;
    }

    public void onSurfaceCreated(GL10 gl10, EGLConfig eglconfig)
    {
        this;
        JVM INSTR monitorenter ;
        gl10.glHint(3152, 4353);
        gl10.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        gl10.glEnable(2884);
        gl10.glShadeModel(7425);
        gl10.glEnable(2929);
        this;
        JVM INSTR monitorexit ;
        return;
        gl10;
        throw gl10;
    }
}
