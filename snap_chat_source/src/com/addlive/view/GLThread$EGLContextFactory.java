// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.view;

import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;

// Referenced classes of package com.addlive.view:
//            GLThread

public static interface 
{

    public abstract EGLContext createContext(EGL10 egl10, EGLDisplay egldisplay, EGLConfig eglconfig);

    public abstract void destroyContext(EGL10 egl10, EGLDisplay egldisplay, EGLContext eglcontext);
}
