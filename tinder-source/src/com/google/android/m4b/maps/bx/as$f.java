// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bx;

import android.util.Log;
import com.google.android.m4b.maps.ay.ab;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

// Referenced classes of package com.google.android.m4b.maps.bx:
//            as

public static final class <init>
{

    public static EGLSurface a(EGL10 egl10, EGLDisplay egldisplay, EGLConfig eglconfig, Object obj)
    {
        Object obj1 = null;
        try
        {
            egl10 = egl10.eglCreateWindowSurface(egldisplay, eglconfig, obj, null);
        }
        // Misplaced declaration of an exception variable
        catch (EGLDisplay egldisplay)
        {
            egl10 = obj1;
            if (ab.a("GLSurfaceView", 6))
            {
                Log.e("GLSurfaceView", "eglCreateWindowSurface", egldisplay);
                return null;
            }
        }
        return egl10;
    }

    private rface()
    {
    }

    rface(byte byte0)
    {
        this();
    }
}
