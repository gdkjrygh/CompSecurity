// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.settings;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.ApiKey;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.DeliveryMechanism;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.common.SystemCurrentTimeProvider;
import io.fabric.sdk.android.services.network.HttpRequestFactory;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package io.fabric.sdk.android.services.settings:
//            DefaultSettingsJsonTransform, DefaultCachedSettingsIo, DefaultSettingsSpiCall, DefaultSettingsController, 
//            SettingsRequest, SettingsData, SettingsController, SettingsCacheBehavior

public class Settings
{

    private final AtomicReference a;
    private final CountDownLatch b;
    private SettingsController c;
    private boolean d;

    private Settings()
    {
        a = new AtomicReference();
        b = new CountDownLatch(1);
        d = false;
    }


    public static Settings a()
    {
        return LazyHolder.a();
    }

    private void a(SettingsData settingsdata)
    {
        a.set(settingsdata);
        b.countDown();
    }

    public Settings a(Kit kit, IdManager idmanager, HttpRequestFactory httprequestfactory, String s, String s1, String s2)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = d;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return this;
_L2:
        if (c == null)
        {
            android.content.Context context = kit.C();
            String s3 = idmanager.c();
            String s4 = (new ApiKey()).a(context);
            String s5 = idmanager.h();
            SystemCurrentTimeProvider systemcurrenttimeprovider = new SystemCurrentTimeProvider();
            DefaultSettingsJsonTransform defaultsettingsjsontransform = new DefaultSettingsJsonTransform();
            DefaultCachedSettingsIo defaultcachedsettingsio = new DefaultCachedSettingsIo(kit);
            String s6 = CommonUtils.k(context);
            httprequestfactory = new DefaultSettingsSpiCall(kit, s2, String.format(Locale.US, "https://settings.crashlytics.com/spi/v2/platforms/android/apps/%s/settings", new Object[] {
                s3
            }), httprequestfactory);
            c = new DefaultSettingsController(kit, new SettingsRequest(s4, idmanager.a(s4, s3), CommonUtils.a(new String[] {
                CommonUtils.m(context)
            }), s1, s, DeliveryMechanism.a(s5).a(), s6), systemcurrenttimeprovider, defaultsettingsjsontransform, defaultcachedsettingsio, httprequestfactory);
        }
        d = true;
        if (true) goto _L1; else goto _L3
_L3:
        kit;
        throw kit;
    }

    public Object a(SettingsAccess settingsaccess, Object obj)
    {
        SettingsData settingsdata = (SettingsData)a.get();
        if (settingsdata == null)
        {
            return obj;
        } else
        {
            return settingsaccess.b(settingsdata);
        }
    }

    public SettingsData b()
    {
        SettingsData settingsdata;
        try
        {
            b.await();
            settingsdata = (SettingsData)a.get();
        }
        catch (InterruptedException interruptedexception)
        {
            Fabric.g().d("Fabric", "Interrupted while waiting for settings data.");
            return null;
        }
        return settingsdata;
    }

    public boolean c()
    {
        this;
        JVM INSTR monitorenter ;
        SettingsData settingsdata;
        settingsdata = c.a();
        a(settingsdata);
        boolean flag;
        if (settingsdata != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean d()
    {
        this;
        JVM INSTR monitorenter ;
        SettingsData settingsdata;
        settingsdata = c.a(SettingsCacheBehavior.b);
        a(settingsdata);
        if (settingsdata != null)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        Fabric.g().d("Fabric", "Failed to force reload of settings from Crashlytics.", null);
        boolean flag;
        if (settingsdata != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    private class LazyHolder
    {

        private static final Settings a = new Settings();

        static Settings a()
        {
            return a;
        }

    }


    private class SettingsAccess
    {

        public abstract Object b(SettingsData settingsdata);
    }

}
