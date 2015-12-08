// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.app;

import android.os.Looper;
import android.os.MessageQueue;
import org.chromium.base.BaseChromiumApplication;
import org.chromium.base.library_loader.LibraryLoader;
import org.chromium.content.browser.TracingControllerAndroid;

public class ContentApplication extends BaseChromiumApplication
{

    private TracingControllerAndroid mTracingController;

    public ContentApplication()
    {
    }

    TracingControllerAndroid getTracingController()
    {
        if (mTracingController == null)
        {
            mTracingController = new TracingControllerAndroid(this);
        }
        return mTracingController;
    }

    public void onCreate()
    {
        super.onCreate();
        Looper.myQueue().addIdleHandler(new android.os.MessageQueue.IdleHandler() {

            final ContentApplication this$0;

            public boolean queueIdle()
            {
                if (!LibraryLoader.isInitialized())
                {
                    return true;
                }
                try
                {
                    getTracingController().registerReceiver(ContentApplication.this);
                }
                catch (SecurityException securityexception) { }
                return false;
            }

            
            {
                this$0 = ContentApplication.this;
                super();
            }
        });
    }

    public void onTerminate()
    {
        try
        {
            getTracingController().unregisterReceiver(this);
            getTracingController().destroy();
        }
        catch (SecurityException securityexception) { }
        super.onTerminate();
    }
}
