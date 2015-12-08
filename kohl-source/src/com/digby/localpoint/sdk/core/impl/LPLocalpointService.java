// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.localpoint.sdk.core.impl;

import android.content.Context;
import com.digby.localpoint.sdk.core.ILPDevice;
import com.digby.localpoint.sdk.core.ILPLocalNotificationListener;
import com.digby.localpoint.sdk.core.ILPLocalpointService;
import com.digby.localpoint.sdk.core.ILPLocationProvider;
import com.digby.localpoint.sdk.core.ILPMessageProvider;
import com.digby.localpoint.sdk.core.ILPUser;
import com.digby.localpoint.sdk.core.ILPVersion;
import com.digby.mm.android.library.controller.IDigbyController;
import com.digby.mm.android.library.controller.impl.DigbyController;
import com.digby.mm.android.library.exception.LPProcessingException;
import com.digby.mm.android.library.utils.ISharedPrefsManager;
import com.digby.mm.android.library.utils.Logger;
import java.io.PrintStream;

// Referenced classes of package com.digby.localpoint.sdk.core.impl:
//            LPConfiguration, LPMessageProvider, LPLocationProvider, LPUser, 
//            LPDevice, LPVersion

public class LPLocalpointService
    implements ILPLocalpointService
{

    private static LPLocalpointService instance;
    private LPConfiguration configuration;
    private Context context;
    private IDigbyController controller;
    private ILPLocalNotificationListener localNotificationListener;
    private LPLocationProvider locationProvider;
    private LPMessageProvider messageProvder;
    private LPUser user;

    private LPLocalpointService()
    {
    }

    public static LPLocalpointService getInstance(Context context1)
    {
        com/digby/localpoint/sdk/core/impl/LPLocalpointService;
        JVM INSTR monitorenter ;
        if (instance == null) goto _L2; else goto _L1
_L1:
        if (context1 == null) goto _L4; else goto _L3
_L3:
        Logger.Debug("Returning singleton instance of LPLocalpointService", context1);
        context1 = instance;
_L5:
        com/digby/localpoint/sdk/core/impl/LPLocalpointService;
        JVM INSTR monitorexit ;
        return context1;
_L4:
        context1 = instance.getContext();
          goto _L3
_L2:
        if (context1 != null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        throw new IllegalArgumentException("Bad argument - context cannot be null");
        context1;
        com/digby/localpoint/sdk/core/impl/LPLocalpointService;
        JVM INSTR monitorexit ;
        throw context1;
        Context context3 = context1.getApplicationContext();
        Context context2;
        context2 = context3;
        if (context3 != null)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        Logger.Debug("WARNING Application Context is null", context1);
        System.out.println("WARNING Application Context is null");
        context2 = context1;
        Logger.Debug("Building new singleton instance of LPLocalpointService", context2);
        instance = new LPLocalpointService();
        instance.context = context2;
        instance.controller = DigbyController.getInstance(context2);
        instance.configuration = LPConfiguration.getInstance(context2);
        instance.messageProvder = new LPMessageProvider(context2);
        instance.locationProvider = new LPLocationProvider(context2);
        instance.user = LPUser.getInstance();
        context1 = instance;
          goto _L5
    }

    public LPConfiguration getConfiguration()
    {
        return configuration;
    }

    public Context getContext()
    {
        return context;
    }

    public ILPDevice getDevice()
    {
        return LPDevice.getInstance(context);
    }

    public ILPLocalNotificationListener getLocalNotificationListener()
    {
        return localNotificationListener;
    }

    public volatile ILPLocationProvider getLocationProvider()
    {
        return getLocationProvider();
    }

    public LPLocationProvider getLocationProvider()
    {
        return locationProvider;
    }

    public volatile ILPMessageProvider getMessageProvider()
    {
        return getMessageProvider();
    }

    public LPMessageProvider getMessageProvider()
    {
        return messageProvder;
    }

    public ILPVersion getSDKVersion()
    {
        return LPVersion.getInstance();
    }

    public ILPUser getUser()
    {
        return user;
    }

    public boolean isBrandEnabled()
    {
        return controller.isDeviceRegistered();
    }

    public void setConfiguration(LPConfiguration lpconfiguration)
    {
        if (configuration != null)
        {
            throw new IllegalStateException();
        } else
        {
            configuration = lpconfiguration;
            return;
        }
    }

    public void setLocalNotificationListener(ILPLocalNotificationListener ilplocalnotificationlistener)
    {
        localNotificationListener = ilplocalnotificationlistener;
    }

    public void start()
    {
        try
        {
            if (controller.getSharedPrefsManager().getUseLocationServices())
            {
                controller.startLocationServices();
            }
            return;
        }
        catch (Exception exception)
        {
            Logger.Error("start failed.", exception);
            throw new LPProcessingException("Failed to start Localpoint services.", exception);
        }
    }

    public void stop()
    {
        controller.stopLocationServices();
    }
}
