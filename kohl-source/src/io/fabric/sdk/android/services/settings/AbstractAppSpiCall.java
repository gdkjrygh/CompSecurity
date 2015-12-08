// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.settings;

import android.content.Context;
import android.content.res.Resources;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.AbstractSpiCall;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.ResponseParser;
import io.fabric.sdk.android.services.network.HttpMethod;
import io.fabric.sdk.android.services.network.HttpRequest;
import io.fabric.sdk.android.services.network.HttpRequestFactory;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package io.fabric.sdk.android.services.settings:
//            AppSpiCall, AppRequestData, IconRequest

abstract class AbstractAppSpiCall extends AbstractSpiCall
    implements AppSpiCall
{

    public static final String APP_BUILD_VERSION_PARAM = "app[build_version]";
    public static final String APP_BUILT_SDK_VERSION_PARAM = "app[built_sdk_version]";
    public static final String APP_DISPLAY_VERSION_PARAM = "app[display_version]";
    public static final String APP_ICON_DATA_PARAM = "app[icon][data]";
    public static final String APP_ICON_HASH_PARAM = "app[icon][hash]";
    public static final String APP_ICON_HEIGHT_PARAM = "app[icon][height]";
    public static final String APP_ICON_PRERENDERED_PARAM = "app[icon][prerendered]";
    public static final String APP_ICON_WIDTH_PARAM = "app[icon][width]";
    public static final String APP_IDENTIFIER_PARAM = "app[identifier]";
    public static final String APP_INSTANCE_IDENTIFIER_PARAM = "app[instance_identifier]";
    public static final String APP_MIN_SDK_VERSION_PARAM = "app[minimum_sdk_version]";
    public static final String APP_NAME_PARAM = "app[name]";
    public static final String APP_SDK_MODULES_PARAM_PREFIX = "app[build][libraries]";
    public static final String APP_SOURCE_PARAM = "app[source]";
    static final String ICON_CONTENT_TYPE = "application/octet-stream";
    static final String ICON_FILE_NAME = "icon.png";

    public AbstractAppSpiCall(Kit kit, String s, String s1, HttpRequestFactory httprequestfactory, HttpMethod httpmethod)
    {
        super(kit, s, s1, httprequestfactory, httpmethod);
    }

    private HttpRequest applyHeadersTo(HttpRequest httprequest, AppRequestData apprequestdata)
    {
        return httprequest.header("X-CRASHLYTICS-API-KEY", apprequestdata.apiKey).header("X-CRASHLYTICS-API-CLIENT-TYPE", "android").header("X-CRASHLYTICS-API-CLIENT-VERSION", kit.getVersion());
    }

    private HttpRequest applyMultipartDataTo(HttpRequest httprequest, AppRequestData apprequestdata)
    {
        Object obj;
        HttpRequest httprequest1;
        httprequest1 = httprequest.part("app[identifier]", apprequestdata.appId).part("app[name]", apprequestdata.name).part("app[display_version]", apprequestdata.displayVersion).part("app[build_version]", apprequestdata.buildVersion).part("app[source]", Integer.valueOf(apprequestdata.source)).part("app[minimum_sdk_version]", apprequestdata.minSdkVersion).part("app[built_sdk_version]", apprequestdata.builtSdkVersion);
        if (!CommonUtils.isNullOrEmpty(apprequestdata.instanceIdentifier))
        {
            httprequest1.part("app[instance_identifier]", apprequestdata.instanceIdentifier);
        }
        if (apprequestdata.icon == null)
        {
            break MISSING_BLOCK_LABEL_193;
        }
        obj = null;
        httprequest = null;
        java.io.InputStream inputstream = kit.getContext().getResources().openRawResource(apprequestdata.icon.iconResourceId);
        httprequest = inputstream;
        obj = inputstream;
        httprequest1.part("app[icon][hash]", apprequestdata.icon.hash).part("app[icon][data]", "icon.png", "application/octet-stream", inputstream).part("app[icon][width]", Integer.valueOf(apprequestdata.icon.width)).part("app[icon][height]", Integer.valueOf(apprequestdata.icon.height));
        CommonUtils.closeOrLog(inputstream, "Failed to close app icon InputStream.");
_L1:
        if (apprequestdata.sdkKits != null)
        {
            apprequestdata = apprequestdata.sdkKits.iterator();
            while (apprequestdata.hasNext()) 
            {
                obj = (Kit)apprequestdata.next();
                android.content.res.Resources.NotFoundException notfoundexception;
                if (((Kit) (obj)).getVersion() == null)
                {
                    httprequest = "";
                } else
                {
                    httprequest = ((Kit) (obj)).getVersion();
                }
                httprequest1.part(sdkKitParamName(((Kit) (obj))), httprequest);
            }
        }
        break MISSING_BLOCK_LABEL_321;
        notfoundexception;
        obj = httprequest;
        Fabric.getLogger().e("Fabric", (new StringBuilder()).append("Failed to find app icon with resource ID: ").append(apprequestdata.icon.iconResourceId).toString(), notfoundexception);
        CommonUtils.closeOrLog(httprequest, "Failed to close app icon InputStream.");
          goto _L1
        httprequest;
        CommonUtils.closeOrLog(((java.io.Closeable) (obj)), "Failed to close app icon InputStream.");
        throw httprequest;
        return httprequest1;
    }

    public boolean invoke(AppRequestData apprequestdata)
    {
        HttpRequest httprequest = applyMultipartDataTo(applyHeadersTo(getHttpRequest(), apprequestdata), apprequestdata);
        Fabric.getLogger().d("Fabric", (new StringBuilder()).append("Sending app info to ").append(getUrl()).toString());
        if (apprequestdata.icon != null)
        {
            Fabric.getLogger().d("Fabric", (new StringBuilder()).append("App icon hash is ").append(apprequestdata.icon.hash).toString());
            Fabric.getLogger().d("Fabric", (new StringBuilder()).append("App icon size is ").append(apprequestdata.icon.width).append("x").append(apprequestdata.icon.height).toString());
        }
        int i = httprequest.code();
        if ("POST".equals(httprequest.method()))
        {
            apprequestdata = "Create";
        } else
        {
            apprequestdata = "Update";
        }
        Fabric.getLogger().d("Fabric", (new StringBuilder()).append(apprequestdata).append(" app request ID: ").append(httprequest.header("X-REQUEST-ID")).toString());
        Fabric.getLogger().d("Fabric", (new StringBuilder()).append("Result was ").append(i).toString());
        return ResponseParser.parse(i) == 0;
    }

    String sdkKitParamName(Kit kit)
    {
        if (kit.getIdentifier() == null)
        {
            kit = "";
        } else
        {
            kit = kit.getIdentifier();
        }
        return (new StringBuilder()).append("app[build][libraries][").append(kit).append("]").toString();
    }
}
