// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.tools.dextr.bridge;

import com.facebook.inject.AbstractLibraryModule;
import com.facebook.tools.dextr.bridge.upload.BackgroundUploadService;
import com.facebook.tools.dextr.bridge.upload.BackgroundUploadServiceImplProvider;
import java.util.concurrent.Executors;

public class DextrModule extends AbstractLibraryModule
{

    public DextrModule()
    {
    }

    public static BackgroundUploadService a(BackgroundUploadServiceImplProvider backgrounduploadserviceimplprovider)
    {
        return backgrounduploadserviceimplprovider.a(Executors.newSingleThreadExecutor(new _cls1()));
    }

    protected void configure()
    {
        getBinder();
    }

    private class _cls1
        implements ThreadFactory
    {

        public final Thread newThread(Runnable runnable)
        {
            runnable = new Thread(runnable);
            runnable.setName("DexTr-Upload");
            Process.setThreadPriority(10);
            return runnable;
        }

        _cls1()
        {
        }
    }

}
