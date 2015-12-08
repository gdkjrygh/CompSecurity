// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.opengl;


// Referenced classes of package com.aviary.android.feather.sdk.opengl:
//            AviaryGLSurfaceView

class a
    implements com.aviary.android.feather.common.threading.
{

    final AviaryGLSurfaceView a;

    public volatile Object a(com.aviary.android.feather.common.threading. , Object aobj[])
        throws Exception
    {
        return a(, (Integer[])aobj);
    }

    public transient Void a(com.aviary.android.feather.common.threading. , Integer ainteger[])
        throws Exception
    {
        AviaryGLSurfaceView.a().a("SetRenderbufferSizeJob::run");
        AviaryGLSurfaceView.a(a, ainteger[0].intValue(), ainteger[1].intValue());
        return null;
    }

    public r(AviaryGLSurfaceView aviaryglsurfaceview)
    {
        a = aviaryglsurfaceview;
        super();
    }
}
