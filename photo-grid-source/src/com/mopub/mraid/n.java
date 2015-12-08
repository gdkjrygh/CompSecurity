// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mraid;


// Referenced classes of package com.mopub.mraid:
//            MraidController, MraidNativeCommandHandler, MraidBridge

final class n
    implements Runnable
{

    final MraidController a;

    n(MraidController mraidcontroller)
    {
        a = mraidcontroller;
        super();
    }

    public final void run()
    {
        MraidController.b(a).a(MraidNativeCommandHandler.b(MraidController.d(a)), MraidNativeCommandHandler.a(MraidController.d(a)), MraidNativeCommandHandler.c(MraidController.d(a)), MraidNativeCommandHandler.isStorePictureSupported(MraidController.d(a)), MraidController.e(a));
        MraidController.b(a).a(MraidController.g(a));
        MraidController.b(a).a(MraidController.f(a));
        MraidController.b(a).a(MraidController.b(a).c());
        MraidController.b(a).b();
    }
}
