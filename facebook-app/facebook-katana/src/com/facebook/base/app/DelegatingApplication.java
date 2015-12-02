// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.app;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import com.facebook.common.build.BuildConstants;
import com.facebook.common.soloader.SoLoaderShim;
import com.facebook.resources.HasBaseResourcesAccess;
import com.facebook.resources.HasOverridingResources;
import com.facebook.sosource.FBSoLoader;
import com.facebook.tools.dextr.runtime.LogUtils;

// Referenced classes of package com.facebook.base.app:
//            ApplicationLike

public abstract class DelegatingApplication extends Application
{

    private static boolean a = false;
    private ApplicationLike b;

    protected DelegatingApplication()
    {
        a();
    }

    private static void a()
    {
        com/facebook/base/app/DelegatingApplication;
        JVM INSTR monitorenter ;
        if (a)
        {
            throw new IllegalStateException("Multiple instances of the Application object were created.");
        }
        break MISSING_BLOCK_LABEL_25;
        Exception exception;
        exception;
        com/facebook/base/app/DelegatingApplication;
        JVM INSTR monitorexit ;
        throw exception;
        a = true;
        com/facebook/base/app/DelegatingApplication;
        JVM INSTR monitorexit ;
    }

    private void f()
    {
        this;
        JVM INSTR monitorenter ;
        if (b == null)
        {
            b = c();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    protected void attachBaseContext(Context context)
    {
        super.attachBaseContext(context);
        FBSoLoader.a(this, BuildConstants.d());
        SoLoaderShim.a(new SoLoaderShimHandler((byte)0));
        d();
        f();
    }

    public final Resources b()
    {
        return super.getResources();
    }

    protected abstract ApplicationLike c();

    protected void d()
    {
    }

    protected final ApplicationLike e()
    {
        f();
        return b;
    }

    public Resources getResources()
    {
        if (b instanceof HasOverridingResources)
        {
            if (!(this instanceof HasBaseResourcesAccess))
            {
                throw new IllegalStateException((new StringBuilder()).append(getClass().getName()).append(" illegally implements HasOverridingResources without HasBaseResourcesAccess.").toString());
            }
            Resources resources = ((HasOverridingResources)b).A_();
            if (resources != null)
            {
                return resources;
            }
        }
        return super.getResources();
    }

    public void onCreate()
    {
        int i = LogUtils.a(0x439d5d2c);
        super.onCreate();
        f();
        b.c();
        LogUtils.b(0xd3554615, i);
    }

    public void onLowMemory()
    {
        super.onLowMemory();
        if (b != null)
        {
            b.e();
        }
    }

    public void onTrimMemory(int i)
    {
        super.onTrimMemory(i);
        if (b != null)
        {
            b.a(i);
        }
    }


    private class SoLoaderShimHandler
        implements com.facebook.common.soloader.SoLoaderShim.Handler
    {

        public final void a(String s)
        {
            FBSoLoader.a(s);
        }

        private SoLoaderShimHandler()
        {
        }

        SoLoaderShimHandler(byte byte0)
        {
            this();
        }
    }

}
