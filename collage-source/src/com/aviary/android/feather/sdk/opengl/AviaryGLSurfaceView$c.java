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
        return a(, (Void[])aobj);
    }

    public transient Void a(com.aviary.android.feather.common.threading. , Void avoid[])
        throws Exception
    {
        AviaryGLSurfaceView.a().a("InitializeOpenGlJob::run");
        AviaryGLSurfaceView.b(a);
        AviaryGLSurfaceView.a().a("end::nativeInitialize");
        return null;
    }

    r(AviaryGLSurfaceView aviaryglsurfaceview)
    {
        a = aviaryglsurfaceview;
        super();
    }
}
