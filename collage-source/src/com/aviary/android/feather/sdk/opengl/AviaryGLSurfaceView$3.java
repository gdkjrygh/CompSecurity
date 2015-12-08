// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.opengl;


// Referenced classes of package com.aviary.android.feather.sdk.opengl:
//            AviaryGLSurfaceView

class c
    implements Runnable
{

    final boolean a;
    final int b;
    final int c;
    final AviaryGLSurfaceView d;

    public void run()
    {
        AviaryGLSurfaceView.d(d).a(a, b, c);
    }

    A(AviaryGLSurfaceView aviaryglsurfaceview, boolean flag, int i, int j)
    {
        d = aviaryglsurfaceview;
        a = flag;
        b = i;
        c = j;
        super();
    }
}
