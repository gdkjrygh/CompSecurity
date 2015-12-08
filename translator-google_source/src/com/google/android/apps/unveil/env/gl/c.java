// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.env.gl;

import com.google.android.apps.unveil.env.Size;
import com.google.android.apps.unveil.nonstop.m;

// Referenced classes of package com.google.android.apps.unveil.env.gl:
//            GLCameraPreview, f

final class c extends com.google.android.apps.unveil.nonstop.c
{

    final GLCameraPreview a;

    c(GLCameraPreview glcamerapreview)
    {
        a = glcamerapreview;
        super();
    }

    protected final void a(m m1)
    {
        if (a.getVisibility() == 0 && GLCameraPreview.a(a) != null)
        {
            GLCameraPreview.a(a).a(m1.e(), new Size(m1.c, m1.d));
            a.requestRender();
        }
    }
}
