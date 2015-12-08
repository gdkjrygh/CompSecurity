// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.beta;

import android.content.Context;
import android.content.res.AssetManager;
import android.text.TextUtils;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.cache.MemoryValueCache;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.DeviceIdentifierProvider;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.common.SystemCurrentTimeProvider;
import io.fabric.sdk.android.services.network.DefaultHttpRequestFactory;
import io.fabric.sdk.android.services.persistence.PreferenceStoreImpl;
import io.fabric.sdk.android.services.settings.BetaSettingsData;
import io.fabric.sdk.android.services.settings.Settings;
import io.fabric.sdk.android.services.settings.SettingsData;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.crashlytics.android.beta:
//            DeviceTokenLoader, BuildProperties, CheckForUpdatesController

public class Beta extends Kit
    implements DeviceIdentifierProvider
{

    private final MemoryValueCache a = new MemoryValueCache();
    private final DeviceTokenLoader g = new DeviceTokenLoader();

    public Beta()
    {
    }

    private BuildProperties a(Context context)
    {
        Object obj = context.getAssets().open("crashlytics-build.properties");
        if (obj == null) goto _L2; else goto _L1
_L1:
        Object obj1 = obj;
        context = BuildProperties.a(((InputStream) (obj)));
        obj1 = obj;
        Fabric.g().a("Beta", (new StringBuilder()).append(((BuildProperties) (context)).d).append(" build properties: ").append(((BuildProperties) (context)).b).append(" (").append(((BuildProperties) (context)).a).append(")").append(" - ").append(((BuildProperties) (context)).c).toString());
_L9:
        obj1 = context;
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Fabric.g().d("Beta", "Error closing Beta build properties asset", ((Throwable) (obj)));
                return context;
            }
            obj1 = context;
        }
_L4:
        return ((BuildProperties) (obj1));
        Exception exception;
        exception;
        obj = null;
        context = null;
_L7:
        obj1 = obj;
        Fabric.g().d("Beta", "Error reading Beta build properties", exception);
        obj1 = context;
        if (obj == null) goto _L4; else goto _L3
_L3:
        try
        {
            ((InputStream) (obj)).close();
        }
        catch (IOException ioexception)
        {
            Fabric.g().d("Beta", "Error closing Beta build properties asset", ioexception);
            return context;
        }
        return context;
        context;
        obj1 = null;
_L6:
        if (obj1 != null)
        {
            try
            {
                ((InputStream) (obj1)).close();
            }
            catch (IOException ioexception1)
            {
                Fabric.g().d("Beta", "Error closing Beta build properties asset", ioexception1);
            }
        }
        throw context;
        context;
        if (true) goto _L6; else goto _L5
_L5:
        exception;
        context = null;
          goto _L7
        exception;
          goto _L7
_L2:
        context = null;
        if (true) goto _L9; else goto _L8
_L8:
    }

    private String a(Context context, String s)
    {
        if (a(s, android.os.Build.VERSION.SDK_INT))
        {
            Fabric.g().a("Beta", "App was installed by Beta. Getting device token");
            boolean flag;
            try
            {
                context = (String)a.a(context, g);
                flag = "".equals(context);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                Fabric.g().d("Beta", "Failed to load the Beta device token", context);
                return null;
            }
            if (flag)
            {
                context = null;
            }
            return context;
        } else
        {
            Fabric.g().a("Beta", "App was not installed by Beta. Skipping device token");
            return null;
        }
    }

    private void a(Context context, IdManager idmanager, BetaSettingsData betasettingsdata, BuildProperties buildproperties)
    {
        (new CheckForUpdatesController(context, this, idmanager, betasettingsdata, buildproperties, new PreferenceStoreImpl(Fabric.a(com/crashlytics/android/beta/Beta)), new SystemCurrentTimeProvider(), new DefaultHttpRequestFactory(Fabric.g()))).a();
    }

    private BetaSettingsData g()
    {
        SettingsData settingsdata = Settings.a().b();
        if (settingsdata != null)
        {
            return settingsdata.f;
        } else
        {
            return null;
        }
    }

    boolean a(BetaSettingsData betasettingsdata, BuildProperties buildproperties)
    {
        return betasettingsdata != null && !TextUtils.isEmpty(betasettingsdata.a) && buildproperties != null;
    }

    boolean a(String s, int i)
    {
        if (i < 11)
        {
            return s == null;
        } else
        {
            return "io.crash.air".equals(s);
        }
    }

    protected Boolean b()
    {
        Fabric.g().a("Beta", "Beta kit initializing...");
        Context context = C();
        IdManager idmanager = B();
        if (TextUtils.isEmpty(a(context, idmanager.h())))
        {
            Fabric.g().a("Beta", "A Beta device token was not found for this app");
            return Boolean.valueOf(false);
        }
        Fabric.g().a("Beta", "Beta device token is present, checking for app updates.");
        BetaSettingsData betasettingsdata = g();
        BuildProperties buildproperties = a(context);
        if (a(betasettingsdata, buildproperties))
        {
            a(context, idmanager, betasettingsdata, buildproperties);
        }
        return Boolean.valueOf(true);
    }

    public String c()
    {
        return "com.crashlytics.sdk.android:beta";
    }

    public String d()
    {
        return "1.1.2.37";
    }

    public Map e()
    {
        String s = B().h();
        s = a(C(), s);
        HashMap hashmap = new HashMap();
        if (!TextUtils.isEmpty(s))
        {
            hashmap.put(io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType.c, s);
        }
        return hashmap;
    }

    String f()
    {
        return CommonUtils.b(C(), "com.crashlytics.ApiEndpoint");
    }

    protected Object z()
    {
        return b();
    }
}
