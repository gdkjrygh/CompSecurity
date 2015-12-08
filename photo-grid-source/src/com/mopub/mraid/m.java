// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mraid;


// Referenced classes of package com.mopub.mraid:
//            MraidController, MraidNativeCommandHandler, MraidBridge

final class m
    implements Runnable
{

    final MraidController a;

    m(MraidController mraidcontroller)
    {
        a = mraidcontroller;
        super();
    }

    public final void run()
    {
        MraidController.c(a).a(MraidNativeCommandHandler.b(MraidController.d(a)), MraidNativeCommandHandler.a(MraidController.d(a)), MraidNativeCommandHandler.c(MraidController.d(a)), MraidNativeCommandHandler.isStorePictureSupported(MraidController.d(a)), MraidController.e(a));
        MraidController.c(a).a(MraidController.f(a));
        MraidController.c(a).a(MraidController.c(a).c());
        MraidController.c(a).b();
    }
}
