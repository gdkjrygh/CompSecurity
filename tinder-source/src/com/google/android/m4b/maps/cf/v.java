// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cf;

import android.util.Log;
import com.google.android.m4b.maps.ay.ab;
import java.util.Iterator;
import java.util.List;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

// Referenced classes of package com.google.android.m4b.maps.cf:
//            o, g, e

public class v extends o
    implements android.opengl.GLSurfaceView.Renderer
{

    protected final g g;

    public void onDrawFrame(GL10 gl10)
    {
        g.a();
    }

    public void onSurfaceChanged(GL10 gl10, int i, int j)
    {
        synchronized (super.a)
        {
            super.b = i;
            super.c = j;
            super.d = true;
        }
        gl10 = super.f;
        gl10;
        JVM INSTR monitorenter ;
        if (!super.f.isEmpty())
        {
            break MISSING_BLOCK_LABEL_70;
        }
        if (ab.a("RenderTarget", 5))
        {
            Log.w("RenderTarget", "this.sizeChangeListener is empty");
        }
_L1:
        return;
        exception;
        gl10;
        JVM INSTR monitorexit ;
        throw exception;
        Iterator iterator = super.f.iterator();
        while (iterator.hasNext()) 
        {
            ((e)iterator.next()).a(super.b, super.c);
        }
          goto _L1
        Exception exception1;
        exception1;
        gl10;
        JVM INSTR monitorexit ;
        throw exception1;
    }

    public void onSurfaceCreated(GL10 gl10, EGLConfig eglconfig)
    {
        gl10 = g;
        throw new NullPointerException();
    }
}
