// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.telemetry;

import a.a.a.h;
import android.app.Application;
import android.os.Build;
import com.skype.android.SkypeApplication;
import com.skype.android.analytics.AnalyticsPersistentStorage;
import com.skype.android.config.ecs.EcsClient;
import com.skype.android.util.NetworkUtil;
import com.skype.data.clienttelemetry.TelemetryClient;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.telemetry:
//            SCTManager, a, TelemetryWriter, RecordBuilder

public class TelemetryHelper
{

    public static final String ATTRIBUTE_CALL_ID = "callId";
    public static final String ATTRIBUTE_ECS_ETAG = "ecs_etag";
    private static final String ATTRIBUTE_NETWORK_PROVIDER = "network_provider";
    private static final String ATTRIBUTE_NETWORK_SUBTYPE = "network_subtype";
    private static final String ATTRIBUTE_NETWORK_TYPE = "network_type";
    private static final String CLIENT_FLAVOR_NAME = "Android";
    private static final String DEVICE_ARCHITECTURE = "OSArchitectureType";
    private static final String DEVICE_ID = "DeviceId";
    private static final String DEVICE_MANUFACTURER = "DeviceManufacturer";
    private static final String DEVICE_MODEL = "DeviceModel";
    private static final String NETWORK_TYPE = "NetworkType";
    private static final String OS_NAME = "OSName";
    private static final String OS_VERSION = "OSVersion";
    private static final String PLATFORM_ID = "PlatformId";
    private static final String TYPE_CLIENT_TELEMETRY = "client_telemetry";
    private static final Logger logger = Logger.getLogger("TelemetryHelper");
    protected final AnalyticsPersistentStorage analyticsPersistentStorage;
    private String componentName;
    private a deviceAttributes;
    private final EcsClient ecsClient;
    final TelemetryWriter networkTypeWriter = new TelemetryWriter() {

        final TelemetryHelper a;

        public final void a(RecordBuilder recordbuilder)
        {
            recordbuilder.a("network_type", Integer.valueOf(a.networkUtil.j()));
            recordbuilder.a("network_subtype", a.networkUtil.k());
            recordbuilder.a("network_provider", a.networkUtil.l());
        }

            
            {
                a = TelemetryHelper.this;
                super();
            }
    };
    private final NetworkUtil networkUtil;
    private final TelemetryClient telemetryClient;
    private final String uiVersion;
    private boolean useComponentNameAsNamespace;
    private boolean useFlavorAsNamespace;

    public TelemetryHelper(Application application, SCTManager sctmanager, EcsClient ecsclient, NetworkUtil networkutil, AnalyticsPersistentStorage analyticspersistentstorage)
    {
        uiVersion = ((SkypeApplication)application).e();
        telemetryClient = sctmanager.b();
        ecsClient = ecsclient;
        networkUtil = networkutil;
        analyticsPersistentStorage = analyticspersistentstorage;
        deviceAttributes = new a(application, networkutil);
    }

    public RecordBuilder addFullNetworkInfo(RecordBuilder recordbuilder)
    {
        networkTypeWriter.a(recordbuilder);
        return recordbuilder;
    }

    protected String createPrefix()
    {
        StringBuilder stringbuilder = new StringBuilder();
        if (useFlavorAsNamespace)
        {
            stringbuilder.append("Android".toLowerCase()).append('_');
        }
        if (useComponentNameAsNamespace && componentName != null)
        {
            stringbuilder.append(componentName.toLowerCase()).append('_');
        }
        return stringbuilder.toString();
    }

    protected String getComponentType()
    {
        return "client_telemetry";
    }

    protected a getDeviceAttributes()
    {
        return deviceAttributes;
    }

    protected long getTimeMs()
    {
        return System.currentTimeMillis();
    }

    public void sendRecord(h h1)
    {
        try
        {
            telemetryClient.a("Android", h1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (h h1)
        {
            logger.log(Level.SEVERE, "telemetry send failed", h1);
        }
    }

    public void sendRecord(RecordBuilder recordbuilder)
    {
        sendRecord(recordbuilder.a());
    }

    public void setComponentName(String s)
    {
        componentName = s;
    }

    public void setUseComponentNameAsNamespace(boolean flag)
    {
        useComponentNameAsNamespace = flag;
    }

    public void setUseFlavorAsNamespace(boolean flag)
    {
        useFlavorAsNamespace = flag;
    }

    public RecordBuilder startBuildingRecord()
    {
        return startBuildingRecord(false);
    }

    public RecordBuilder startBuildingRecord(String s, boolean flag)
    {
        s = (new RecordBuilder(s, getComponentType(), createPrefix())).a(getTimeMs());
        String s1 = ecsClient.getETag();
        if (s1 != null)
        {
            HashMap hashmap = new HashMap();
            hashmap.put("ecs_etag", s1);
            ((RecordBuilder) (s)).d.a(hashmap);
        }
        if (flag)
        {
            getDeviceAttributes();
            RecordBuilder recordbuilder = s.a("PlatformId", SkypeApplication.g()).a("NetworkType", getDeviceAttributes().a());
            getDeviceAttributes();
            recordbuilder = recordbuilder.a("OSName", "android");
            getDeviceAttributes();
            recordbuilder = recordbuilder.a("OSVersion", String.valueOf(android.os.Build.VERSION.SDK_INT));
            getDeviceAttributes();
            recordbuilder = recordbuilder.a("OSArchitectureType", System.getProperty("os.arch"));
            getDeviceAttributes();
            recordbuilder = recordbuilder.a("DeviceManufacturer", Build.MANUFACTURER);
            getDeviceAttributes();
            recordbuilder.a("DeviceModel", Build.MODEL).a("DeviceId", analyticsPersistentStorage.b());
        }
        return s;
    }

    public RecordBuilder startBuildingRecord(boolean flag)
    {
        return startBuildingRecord(uiVersion, flag);
    }


}
