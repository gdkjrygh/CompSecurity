// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.katana.app;

import com.facebook.classpreloader.ClassPreloaderController;
import com.facebook.common.process.ProcessName;
import com.facebook.dalviktelemetry.DalvikTelemetry;
import com.facebook.feed.perf.FeedPerfLogger;
import com.facebook.inject.FbInjector;
import com.facebook.katana.app.module.common.FbandroidProcessName;
import com.facebook.perf.StartupPerfLogger;
import com.facebook.tools.dextr.runtime.detour.TracerDetour;

// Referenced classes of package com.facebook.katana.app:
//            FacebookApplicationImpl

class t> extends com.facebook.common.init.>
{

    final FbInjector a;
    final FacebookApplicationImpl b;

    public final void a()
    {
        TracerDetour.a("FacebookApplicationImpl.AppInitLock.onInitialized", 0xff60a0cf);
        if (FacebookApplicationImpl.a(b).getProcessName().e())
        {
            ((FeedPerfLogger)FeedPerfLogger.a(b.a())).l();
            FacebookApplicationImpl.a(b, (StartupPerfLogger)StartupPerfLogger.a(a));
        }
        DalvikTelemetry.a(a);
        FacebookApplicationImpl.a(b, a);
        ClassPreloaderController.a(com.facebook.classpreloader.adStopTriggers.APP_INIT_DONE);
        TracerDetour.a(0xaf0b68d1);
        return;
        Exception exception;
        exception;
        TracerDetour.a(0x8f49e606);
        throw exception;
    }

    er(FacebookApplicationImpl facebookapplicationimpl, FbInjector fbinjector)
    {
        b = facebookapplicationimpl;
        a = fbinjector;
        super();
    }
}
