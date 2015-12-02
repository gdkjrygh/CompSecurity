// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.reflex;

import android.view.SurfaceHolder;

// Referenced classes of package com.facebook.reflex:
//            m, j

class n
    implements android.view.SurfaceHolder.Callback2
{

    final j a;
    final m b;

    n(m m1, j j1)
    {
        b = m1;
        a = j1;
        super();
    }

    public void surfaceChanged(SurfaceHolder surfaceholder, int i, int k, int l)
    {
        b.a.surfaceChanged(surfaceholder, i, k, l);
    }

    public void surfaceCreated(SurfaceHolder surfaceholder)
    {
        b.a.surfaceCreated(surfaceholder);
    }

    public void surfaceDestroyed(SurfaceHolder surfaceholder)
    {
        b.a.surfaceDestroyed(surfaceholder);
    }

    public void surfaceRedrawNeeded(SurfaceHolder surfaceholder)
    {
        b.a.surfaceRedrawNeeded(surfaceholder);
    }
}
