// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.configuration.volley;

import android.content.Context;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.configuration.ConfigurationAgentWebCallback;
import com.netflix.mediaclient.service.webclient.model.leafs.AccountConfigData;
import com.netflix.mediaclient.service.webclient.model.leafs.ConfigData;
import com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData;
import com.netflix.mediaclient.service.webclient.volley.FalcorParseException;
import com.netflix.mediaclient.service.webclient.volley.FalcorParseUtils;
import com.netflix.mediaclient.service.webclient.volley.FalcorServerException;
import com.netflix.mediaclient.service.webclient.volley.FalcorVolleyWebClientRequest;
import java.util.Arrays;
import java.util.List;

public class FetchConfigDataRequest extends FalcorVolleyWebClientRequest
{

    private static final String ACCOUNT_CONFIG = "accountConfig";
    private static final String DEVICE_CONFIG = "deviceConfig";
    private static final String STREAMING_CONFIG = "streamingqoe";
    private static final String TAG = "nf_config_data";
    private static final String accountConfigPql = String.format("['%s']", new Object[] {
        "accountConfig"
    });
    public static final String deviceConfigPql = String.format("['%s']", new Object[] {
        "deviceConfig"
    });
    private static final String streamingQoePql = String.format("['%s']", new Object[] {
        "streamingqoe"
    });
    private final ConfigurationAgentWebCallback responseCallback;

    public FetchConfigDataRequest(Context context, com.netflix.mediaclient.service.ServiceAgent.ConfigurationAgentInterface configurationagentinterface, ConfigurationAgentWebCallback configurationagentwebcallback)
    {
        super(context, configurationagentinterface);
        responseCallback = configurationagentwebcallback;
        if (Log.isLoggable("nf_config_data", 2))
        {
            Log.v("nf_config_data", (new StringBuilder()).append("deviceConfigPql = ").append(deviceConfigPql).toString());
            Log.v("nf_config_data", (new StringBuilder()).append("accountConfigPql = ").append(accountConfigPql).toString());
            Log.v("nf_config_data", (new StringBuilder()).append("steamingqoePql = ").append(streamingQoePql).toString());
        }
    }

    public static ConfigData parseConfigString(String s)
        throws FalcorParseException, FalcorServerException
    {
        ConfigData configdata = new ConfigData();
        if (Log.isLoggable("nf_config_data", 2))
        {
            Log.v("nf_config_data", (new StringBuilder()).append("String response to parse = ").append(s).toString());
        }
        s = FalcorParseUtils.getDataObj("nf_config_data", s);
        if (FalcorParseUtils.isEmpty(s))
        {
            Log.d("nf_config_data", "No config overrides for device");
            configdata.deviceConfig = new DeviceConfigData();
        } else
        {
            if (s.has("deviceConfig"))
            {
                configdata.deviceConfig = (DeviceConfigData)FalcorParseUtils.getPropertyObject(s, "deviceConfig", com/netflix/mediaclient/service/webclient/model/leafs/DeviceConfigData);
            }
            if (s.has("accountConfig"))
            {
                configdata.accountConfig = (AccountConfigData)FalcorParseUtils.getPropertyObject(s, "accountConfig", com/netflix/mediaclient/service/webclient/model/leafs/AccountConfigData);
            }
            if (s.has("streamingqoe"))
            {
                s = s.get("streamingqoe");
                if (s != null)
                {
                    configdata.streamingqoeJson = s.toString();
                    return configdata;
                }
            }
        }
        return configdata;
    }

    protected List getPQLQueries()
    {
        return Arrays.asList(new String[] {
            deviceConfigPql, accountConfigPql, streamingQoePql
        });
    }

    protected void onFailure(int i)
    {
        if (responseCallback != null)
        {
            responseCallback.onConfigDataFetched(null, i);
        }
    }

    protected void onSuccess(ConfigData configdata)
    {
        if (responseCallback != null)
        {
            responseCallback.onConfigDataFetched(configdata, 0);
        }
    }

    protected volatile void onSuccess(Object obj)
    {
        onSuccess((ConfigData)obj);
    }

    protected ConfigData parseFalcorResponse(String s)
        throws FalcorParseException, FalcorServerException
    {
        return parseConfigString(s);
    }

    protected volatile Object parseFalcorResponse(String s)
        throws FalcorParseException, FalcorServerException
    {
        return parseFalcorResponse(s);
    }

    protected boolean shouldSkipProcessingOnInvalidUser()
    {
        return false;
    }

}
