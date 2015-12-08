// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bx;

import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;

// Referenced classes of package com.google.android.m4b.maps.bx:
//            as

public static interface ntext
{

    public abstract EGLContext a(EGL10 egl10, EGLDisplay egldisplay, EGLConfig eglconfig);

    public abstract void a(EGL10 egl10, EGLDisplay egldisplay, EGLContext eglcontext);
}
