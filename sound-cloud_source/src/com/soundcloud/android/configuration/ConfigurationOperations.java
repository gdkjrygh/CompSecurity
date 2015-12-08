// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.configuration;

import com.soundcloud.android.api.ApiClient;
import com.soundcloud.android.api.ApiClientRx;
import com.soundcloud.android.api.ApiEndpoints;
import com.soundcloud.android.api.ApiMapperException;
import com.soundcloud.android.api.ApiRequest;
import com.soundcloud.android.api.ApiRequestException;
import com.soundcloud.android.api.oauth.OAuth;
import com.soundcloud.android.api.oauth.Token;
import com.soundcloud.android.configuration.experiments.ExperimentOperations;
import com.soundcloud.android.properties.FeatureFlags;
import com.soundcloud.android.properties.Flag;
import dagger.Lazy;
import java.io.IOException;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import rx.R;
import rx.b;
import rx.b.f;
import rx.b.g;

// Referenced classes of package com.soundcloud.android.configuration:
//            Configuration, FeatureOperations, UserPlan, DeviceManagement

public class ConfigurationOperations
{

    private static final String PARAM_EXPERIMENT_LAYERS = "experiment_layers";
    private static final int POLLING_INITIAL_DELAY = 1;
    private static final int POLLING_INTERVAL_SECONDS = 2;
    private static final int POLLING_MAX_ATTEMPTS = 3;
    private static final String TAG = "Configuration";
    private final Lazy apiClient;
    private final Lazy apiClientRx;
    private final ExperimentOperations experimentOperations;
    private final FeatureFlags featureFlags;
    private final FeatureOperations featureOperations;
    private final R scheduler;
    private final f toFetchConfiguration = new _cls2();
    private final g toUpdatedConfiguration = new _cls1();

    public ConfigurationOperations(Lazy lazy, Lazy lazy1, ExperimentOperations experimentoperations, FeatureOperations featureoperations, FeatureFlags featureflags, R r)
    {
        apiClientRx = lazy;
        apiClient = lazy1;
        experimentOperations = experimentoperations;
        featureOperations = featureoperations;
        featureFlags = featureflags;
        scheduler = r;
    }

    private com.soundcloud.android.api.ApiRequest.Builder configurationRequestBuilderForGet()
    {
        return ApiRequest.get(ApiEndpoints.CONFIGURATION.path()).addQueryParam("experiment_layers", experimentOperations.getActiveLayers()).forPrivateApi(1);
    }

    public DeviceManagement forceRegisterDevice(Token token, String s)
        throws ApiRequestException, IOException, ApiMapperException
    {
        s = Collections.singletonMap("conflicting_device", Collections.singletonMap("device_id", s));
        token = ApiRequest.post(ApiEndpoints.CONFIGURATION.path()).withHeader("Authorization", OAuth.createOAuthHeaderValue(token)).withContent(s).forPrivateApi(1).build();
        return ((Configuration)((ApiClient)apiClient.a()).fetchMappedResponse(token, com/soundcloud/android/configuration/Configuration)).deviceManagement;
    }

    public DeviceManagement registerDevice(Token token)
        throws ApiRequestException, IOException, ApiMapperException
    {
        token = configurationRequestBuilderForGet().withHeader("Authorization", OAuth.createOAuthHeaderValue(token)).build();
        token = (Configuration)((ApiClient)apiClient.a()).fetchMappedResponse(token, com/soundcloud/android/configuration/Configuration);
        saveConfiguration(token);
        return ((Configuration) (token)).deviceManagement;
    }

    void saveConfiguration(Configuration configuration)
    {
        experimentOperations.update(configuration.assignment);
        if (featureFlags.isEnabled(Flag.OFFLINE_SYNC))
        {
            featureOperations.updateFeatures(configuration.features);
            featureOperations.updatePlan(configuration.plan.id, configuration.plan.upsells);
        }
    }

    b update()
    {
        ApiRequest apirequest = configurationRequestBuilderForGet().build();
        return b.zip(experimentOperations.loadAssignment(), ((ApiClientRx)apiClientRx.a()).mappedResponse(apirequest, com/soundcloud/android/configuration/Configuration).subscribeOn(scheduler), toUpdatedConfiguration);
    }

    b updateUntilPlanChanged()
    {
        final String plan = featureOperations.getPlan();
        return b.interval(1L, 2L, TimeUnit.SECONDS, scheduler).take(3).flatMap(toFetchConfiguration).takeFirst(new _cls3());
    }



    private class _cls1
        implements g
    {

        final ConfigurationOperations this$0;

        public Configuration call(Object obj, Configuration configuration)
        {
            return configuration;
        }

        public volatile Object call(Object obj, Object obj1)
        {
            return call(obj, (Configuration)obj1);
        }

        _cls1()
        {
            this$0 = ConfigurationOperations.this;
            super();
        }
    }


    private class _cls2
        implements f
    {

        final ConfigurationOperations this$0;

        public volatile Object call(Object obj)
        {
            return call((Long)obj);
        }

        public b call(Long long1)
        {
            return ((ApiClientRx)apiClientRx.a()).mappedResponse(configurationRequestBuilderForGet().build(), com/soundcloud/android/configuration/Configuration);
        }

        _cls2()
        {
            this$0 = ConfigurationOperations.this;
            super();
        }
    }


    private class _cls3
        implements f
    {

        final ConfigurationOperations this$0;
        final String val$plan;

        public Boolean call(Configuration configuration)
        {
            boolean flag;
            if (!configuration.plan.id.equals(plan))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            return Boolean.valueOf(flag);
        }

        public volatile Object call(Object obj)
        {
            return call((Configuration)obj);
        }

        _cls3()
        {
            this$0 = ConfigurationOperations.this;
            plan = s;
            super();
        }
    }

}
