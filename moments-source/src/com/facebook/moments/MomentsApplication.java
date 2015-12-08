// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.moments;

import android.content.Context;
import com.facebook.base.app.AbstractApplicationLike;
import com.facebook.base.app.ApplicationLike;
import com.facebook.base.app.DelegatingApplication;
import com.facebook.breakpad.BreakpadManager;
import com.facebook.common.build.BuildConstants;
import com.facebook.common.dextricks.DexLibLoader;
import com.facebook.common.process.ProcessName;
import com.facebook.config.application.FbAppType;
import com.facebook.config.application.FbAppTypeSelector;
import com.facebook.dalvik.DalvikLinearAllocType;
import com.facebook.dalvik.DalvikReplaceBuffer;
import com.facebook.inject.FbInjector;
import com.facebook.inject.FbInjectorProvider;
import com.facebook.moments.api.CrashReporter;
import com.facebook.moments.application.MomentsAppTypes;

// Referenced classes of package com.facebook.moments:
//            MomentsApplicationImpl

public class MomentsApplication extends DelegatingApplication
    implements FbInjectorProvider
{

    private boolean a;

    public MomentsApplication()
    {
    }

    private MomentsApplicationImpl f()
    {
        return new MomentsApplicationImpl(this, h());
    }

    private void g()
    {
        CrashReporter.a(this);
        BreakpadManager.a(this, BuildConstants.c());
    }

    private static FbAppType h()
    {
        return FbAppTypeSelector.a(MomentsAppTypes.g, MomentsAppTypes.h, MomentsAppTypes.i);
    }

    public final FbInjector a()
    {
        if (c() instanceof AbstractApplicationLike)
        {
            return ((AbstractApplicationLike)c()).d();
        } else
        {
            return null;
        }
    }

    protected void attachBaseContext(Context context)
    {
        super.attachBaseContext(context);
        g();
    }

    protected final ApplicationLike b()
    {
        if ("nodex".equalsIgnoreCase(ProcessName.g().c()))
        {
            return new ApplicationLike();
        } else
        {
            DexLibLoader.a(this, BuildConstants.c());
            DalvikReplaceBuffer.a(DalvikLinearAllocType.SAMPLE_APP);
            return f();
        }
    }

    public final boolean d()
    {
        return a;
    }

    public final void e()
    {
        a = true;
    }
}
