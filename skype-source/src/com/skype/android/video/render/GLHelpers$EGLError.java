// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.render;

import java.util.Map;

// Referenced classes of package com.skype.android.video.render:
//            GLHelpers

private static final class _cls0 extends Enum
{

    private static final EGL_CONTEXT_LOST $VALUES[];
    public static final EGL_CONTEXT_LOST EGL_BAD_ACCESS;
    public static final EGL_CONTEXT_LOST EGL_BAD_ALLOC;
    public static final EGL_CONTEXT_LOST EGL_BAD_ATTRIBUTE;
    public static final EGL_CONTEXT_LOST EGL_BAD_CONFIG;
    public static final EGL_CONTEXT_LOST EGL_BAD_CONTEXT;
    public static final EGL_CONTEXT_LOST EGL_BAD_CURRENT_SURFACE;
    public static final EGL_CONTEXT_LOST EGL_BAD_DISPLAY;
    public static final EGL_CONTEXT_LOST EGL_BAD_MATCH;
    public static final EGL_CONTEXT_LOST EGL_BAD_NATIVE_PIXMAP;
    public static final EGL_CONTEXT_LOST EGL_BAD_NATIVE_WINDOW;
    public static final EGL_CONTEXT_LOST EGL_BAD_PARAMETER;
    public static final EGL_CONTEXT_LOST EGL_BAD_SURFACE;
    public static final EGL_CONTEXT_LOST EGL_CONTEXT_LOST;
    public static final EGL_CONTEXT_LOST EGL_NOT_INITIALIZED;
    public static final EGL_CONTEXT_LOST EGL_SUCCESS;

    public static _cls0 valueOf(String s)
    {
        return (_cls0)Enum.valueOf(com/skype/android/video/render/GLHelpers$EGLError, s);
    }

    public static _cls0[] values()
    {
        return (_cls0[])$VALUES.clone();
    }

    static 
    {
        EGL_SUCCESS = new <init>("EGL_SUCCESS", 0, 12288);
        EGL_NOT_INITIALIZED = new <init>("EGL_NOT_INITIALIZED", 1, 12289);
        EGL_BAD_ACCESS = new <init>("EGL_BAD_ACCESS", 2, 12290);
        EGL_BAD_ALLOC = new <init>("EGL_BAD_ALLOC", 3, 12291);
        EGL_BAD_ATTRIBUTE = new <init>("EGL_BAD_ATTRIBUTE", 4, 12292);
        EGL_BAD_CONTEXT = new <init>("EGL_BAD_CONTEXT", 5, 12294);
        EGL_BAD_CONFIG = new <init>("EGL_BAD_CONFIG", 6, 12293);
        EGL_BAD_CURRENT_SURFACE = new <init>("EGL_BAD_CURRENT_SURFACE", 7, 12295);
        EGL_BAD_DISPLAY = new <init>("EGL_BAD_DISPLAY", 8, 12296);
        EGL_BAD_SURFACE = new <init>("EGL_BAD_SURFACE", 9, 12301);
        EGL_BAD_MATCH = new <init>("EGL_BAD_MATCH", 10, 12297);
        EGL_BAD_PARAMETER = new <init>("EGL_BAD_PARAMETER", 11, 12300);
        EGL_BAD_NATIVE_PIXMAP = new <init>("EGL_BAD_NATIVE_PIXMAP", 12, 12298);
        EGL_BAD_NATIVE_WINDOW = new <init>("EGL_BAD_NATIVE_WINDOW", 13, 12299);
        EGL_CONTEXT_LOST = new <init>("EGL_CONTEXT_LOST", 14, 12302);
        $VALUES = (new .VALUES[] {
            EGL_SUCCESS, EGL_NOT_INITIALIZED, EGL_BAD_ACCESS, EGL_BAD_ALLOC, EGL_BAD_ATTRIBUTE, EGL_BAD_CONTEXT, EGL_BAD_CONFIG, EGL_BAD_CURRENT_SURFACE, EGL_BAD_DISPLAY, EGL_BAD_SURFACE, 
            EGL_BAD_MATCH, EGL_BAD_PARAMETER, EGL_BAD_NATIVE_PIXMAP, EGL_BAD_NATIVE_WINDOW, EGL_CONTEXT_LOST
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        GLHelpers.access$500().put(Integer.valueOf(j), this);
    }
}
