// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.beta;

import android.app.Application;
import android.content.Context;
import android.content.res.AssetManager;
import android.text.TextUtils;
import io.fabric.sdk.android.c;
import io.fabric.sdk.android.i;
import io.fabric.sdk.android.services.a.b;
import io.fabric.sdk.android.services.common.h;
import io.fabric.sdk.android.services.common.l;
import io.fabric.sdk.android.services.common.n;
import io.fabric.sdk.android.services.common.s;
import io.fabric.sdk.android.services.d.f;
import io.fabric.sdk.android.services.d.q;
import io.fabric.sdk.android.services.d.t;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.crashlytics.android.beta:
//            DeviceTokenLoader, BuildProperties, ActivityLifecycleCheckForUpdatesController, ImmediateCheckForUpdatesController, 
//            UpdatesController

public class Beta extends i
    implements l
{

    private static final String CRASHLYTICS_API_ENDPOINT = "com.crashlytics.ApiEndpoint";
    private static final String CRASHLYTICS_BUILD_PROPERTIES = "crashlytics-build.properties";
    static final String NO_DEVICE_TOKEN = "";
    public static final String TAG = "Beta";
    private final b deviceTokenCache = new b();
    private final DeviceTokenLoader deviceTokenLoader = new DeviceTokenLoader();
    private UpdatesController updatesController;

    public Beta()
    {
    }

    private String getBetaDeviceToken(Context context, String s1)
    {
        if (isAppPossiblyInstalledByBeta(s1, android.os.Build.VERSION.SDK_INT))
        {
            c.h().a("Beta", "App was possibly installed by Beta. Getting device token");
            boolean flag;
            try
            {
                context = (String)deviceTokenCache.a(context, deviceTokenLoader);
                flag = "".equals(context);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                c.h().e("Beta", "Failed to load the Beta device token", context);
                return null;
            }
            if (flag)
            {
                context = null;
            }
            return context;
        } else
        {
            c.h().a("Beta", "App was not installed by Beta. Skipping device token");
            return null;
        }
    }

    private f getBetaSettingsData()
    {
        t t1 = q.a().b();
        if (t1 != null)
        {
            return t1.f;
        } else
        {
            return null;
        }
    }

    public static Beta getInstance()
    {
        return (Beta)c.a(com/crashlytics/android/beta/Beta);
    }

    private BuildProperties loadBuildProperties(Context context)
    {
        Object obj = context.getAssets().open("crashlytics-build.properties");
        if (obj == null) goto _L2; else goto _L1
_L1:
        Object obj1 = obj;
        context = BuildProperties.fromPropertiesStream(((InputStream) (obj)));
        obj1 = obj;
        c.h().a("Beta", (new StringBuilder()).append(((BuildProperties) (context)).packageName).append(" build properties: ").append(((BuildProperties) (context)).versionName).append(" (").append(((BuildProperties) (context)).versionCode).append(")").append(" - ").append(((BuildProperties) (context)).buildId).toString());
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
                c.h().e("Beta", "Error closing Beta build properties asset", ((Throwable) (obj)));
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
        c.h().e("Beta", "Error reading Beta build properties", exception);
        obj1 = context;
        if (obj == null) goto _L4; else goto _L3
_L3:
        try
        {
            ((InputStream) (obj)).close();
        }
        catch (IOException ioexception)
        {
            c.h().e("Beta", "Error closing Beta build properties asset", ioexception);
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
                c.h().e("Beta", "Error closing Beta build properties asset", ioexception1);
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

    boolean canCheckForUpdates(f f1, BuildProperties buildproperties)
    {
        return f1 != null && !TextUtils.isEmpty(f1.a) && buildproperties != null;
    }

    UpdatesController createUpdatesController(int j, Application application)
    {
        if (j >= 14)
        {
            return new ActivityLifecycleCheckForUpdatesController(getFabric().e(), getFabric().f());
        } else
        {
            return new ImmediateCheckForUpdatesController();
        }
    }

    protected Boolean doInBackground()
    {
        c.h().a("Beta", "Beta kit initializing...");
        Context context = getContext();
        n n1 = getIdManager();
        if (TextUtils.isEmpty(getBetaDeviceToken(context, n1.h())))
        {
            c.h().a("Beta", "A Beta device token was not found for this app");
            return Boolean.valueOf(false);
        }
        c.h().a("Beta", "Beta device token is present, checking for app updates.");
        f f1 = getBetaSettingsData();
        BuildProperties buildproperties = loadBuildProperties(context);
        if (canCheckForUpdates(f1, buildproperties))
        {
            updatesController.initialize(context, this, n1, f1, buildproperties, new io.fabric.sdk.android.services.c.c(this), new s(), new io.fabric.sdk.android.services.b.b(c.h()));
        }
        return Boolean.valueOf(true);
    }

    protected volatile Object doInBackground()
    {
        return doInBackground();
    }

    public Map getDeviceIdentifiers()
    {
        String s1 = getIdManager().h();
        s1 = getBetaDeviceToken(getContext(), s1);
        HashMap hashmap = new HashMap();
        if (!TextUtils.isEmpty(s1))
        {
            hashmap.put(io.fabric.sdk.android.services.common.n.a.c, s1);
        }
        return hashmap;
    }

    public String getIdentifier()
    {
        return "com.crashlytics.sdk.android:beta";
    }

    String getOverridenSpiEndpoint()
    {
        return h.b(getContext(), "com.crashlytics.ApiEndpoint");
    }

    public String getVersion()
    {
        return "1.1.3.61";
    }

    boolean isAppPossiblyInstalledByBeta(String s1, int j)
    {
        if (j < 11)
        {
            return s1 == null;
        } else
        {
            return "io.crash.air".equals(s1);
        }
    }

    protected boolean onPreExecute()
    {
        Application application = (Application)getContext().getApplicationContext();
        updatesController = createUpdatesController(android.os.Build.VERSION.SDK_INT, application);
        return true;
    }
}
