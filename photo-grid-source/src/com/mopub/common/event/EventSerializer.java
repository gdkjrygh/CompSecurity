// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.common.event;

import com.mopub.common.Preconditions;
import com.mopub.common.logging.MoPubLog;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.mopub.common.event:
//            BaseEvent, ErrorEvent

public class EventSerializer
{

    public EventSerializer()
    {
    }

    public JSONArray serializeAsJson(List list)
    {
        Preconditions.checkNotNull(list);
        JSONArray jsonarray = new JSONArray();
        for (list = list.iterator(); list.hasNext();)
        {
            BaseEvent baseevent = (BaseEvent)list.next();
            try
            {
                jsonarray.put(serializeAsJson(baseevent));
            }
            catch (JSONException jsonexception)
            {
                MoPubLog.d((new StringBuilder("Failed to serialize event \"")).append(baseevent.getName()).append("\" to JSON: ").toString(), jsonexception);
            }
        }

        return jsonarray;
    }

    public JSONObject serializeAsJson(BaseEvent baseevent)
    {
        Object obj1 = null;
        Preconditions.checkNotNull(baseevent);
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("_category_", baseevent.getScribeCategory().getCategory());
        jsonobject.put("ts", baseevent.getTimestampUtcMs());
        jsonobject.put("name", baseevent.getName().getName());
        jsonobject.put("name_category", baseevent.getCategory().getCategory());
        Object obj = baseevent.getSdkProduct();
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(((BaseEvent.SdkProduct) (obj)).getType());
        }
        jsonobject.put("sdk_product", obj);
        jsonobject.put("sdk_version", baseevent.getSdkVersion());
        jsonobject.put("ad_unit_id", baseevent.getAdUnitId());
        jsonobject.put("ad_creative_id", baseevent.getAdCreativeId());
        jsonobject.put("ad_type", baseevent.getAdType());
        jsonobject.put("ad_network_type", baseevent.getAdNetworkType());
        jsonobject.put("ad_width_px", baseevent.getAdWidthPx());
        jsonobject.put("ad_height_px", baseevent.getAdHeightPx());
        obj = baseevent.getAppPlatform();
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(((BaseEvent.AppPlatform) (obj)).getType());
        }
        jsonobject.put("app_platform", obj);
        jsonobject.put("app_name", baseevent.getAppName());
        jsonobject.put("app_package_name", baseevent.getAppPackageName());
        jsonobject.put("app_version", baseevent.getAppVersion());
        jsonobject.put("client_advertising_id", baseevent.getObfuscatedClientAdvertisingId());
        jsonobject.put("client_do_not_track", baseevent.getClientDoNotTrack());
        jsonobject.put("device_manufacturer", baseevent.getDeviceManufacturer());
        jsonobject.put("device_model", baseevent.getDeviceModel());
        jsonobject.put("device_product", baseevent.getDeviceProduct());
        jsonobject.put("device_os_version", baseevent.getDeviceOsVersion());
        jsonobject.put("device_screen_width_px", baseevent.getDeviceScreenWidthDip());
        jsonobject.put("device_screen_height_px", baseevent.getDeviceScreenHeightDip());
        jsonobject.put("geo_lat", baseevent.getGeoLat());
        jsonobject.put("geo_lon", baseevent.getGeoLon());
        jsonobject.put("geo_accuracy_radius_meters", baseevent.getGeoAccuracy());
        jsonobject.put("perf_duration_ms", baseevent.getPerformanceDurationMs());
        obj = baseevent.getNetworkType();
        if (obj == null)
        {
            obj = obj1;
        } else
        {
            obj = Integer.valueOf(((com.mopub.common.ClientMetadata.MoPubNetworkType) (obj)).getId());
        }
        jsonobject.put("network_type", obj);
        jsonobject.put("network_operator_code", baseevent.getNetworkOperatorCode());
        jsonobject.put("network_operator_name", baseevent.getNetworkOperatorName());
        jsonobject.put("network_iso_country_code", baseevent.getNetworkIsoCountryCode());
        jsonobject.put("network_sim_code", baseevent.getNetworkSimCode());
        jsonobject.put("network_sim_operator_name", baseevent.getNetworkSimOperatorName());
        jsonobject.put("network_sim_iso_country_code", baseevent.getNetworkSimIsoCountryCode());
        jsonobject.put("req_id", baseevent.getRequestId());
        jsonobject.put("req_status_code", baseevent.getRequestStatusCode());
        jsonobject.put("req_uri", baseevent.getRequestUri());
        jsonobject.put("req_retries", baseevent.getRequestRetries());
        jsonobject.put("timestamp_client", baseevent.getTimestampUtcMs());
        if (baseevent instanceof ErrorEvent)
        {
            baseevent = (ErrorEvent)baseevent;
            jsonobject.put("error_exception_class_name", baseevent.getErrorExceptionClassName());
            jsonobject.put("error_message", baseevent.getErrorMessage());
            jsonobject.put("error_stack_trace", baseevent.getErrorStackTrace());
            jsonobject.put("error_file_name", baseevent.getErrorFileName());
            jsonobject.put("error_class_name", baseevent.getErrorClassName());
            jsonobject.put("error_method_name", baseevent.getErrorMethodName());
            jsonobject.put("error_line_number", baseevent.getErrorLineNumber());
        }
        return jsonobject;
    }
}
