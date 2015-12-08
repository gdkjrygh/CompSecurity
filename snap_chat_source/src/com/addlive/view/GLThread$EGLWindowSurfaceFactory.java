// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.view;

import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

// Referenced classes of package com.addlive.view:
//            GLThread

public static interface 
{

    public abstract EGLSurface createWindowSurface(EGL10 egl10, EGLDisplay egldisplay, EGLConfig eglconfig, Object obj);

    public abstract void destroySurface(EGL10 egl10, EGLDisplay egldisplay, EGLSurface eglsurface);
}
