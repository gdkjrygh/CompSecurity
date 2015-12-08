// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.remote;

import com.pinterest.api.ApiResponseHandler;
import com.pinterest.api.model.Batch;
import com.pinterest.api.model.BatchRequest;
import com.pinterest.kit.data.PreferencesManager;

// Referenced classes of package com.pinterest.api.remote:
//            BaseApi

public class ConfigurationApi
{

    private final PreferencesManager a;

    public ConfigurationApi(PreferencesManager preferencesmanager)
    {
        a = preferencesmanager;
    }

    private BatchRequest a(String s, String s1, String s2)
    {
        s = new BatchRequest("GET", String.format("/v3/users/config/%s/%s/", new Object[] {
            s, s1
        }));
        s.setParams("snapshot_key", new String[] {
            a.getString(s2, "0")
        });
        return s;
    }

    public final void a(ApiResponseHandler apiresponsehandler, String s)
    {
        int i = 0;
        BatchRequest batchrequest = a("invitability", "feature_weights", "PREF_INVITABILITY_FEATURE_WEIGHT_SNAPSHOT_KEY");
        BatchRequest batchrequest1 = a("invitability", "name_heuristics", "PREF_INVITABILITY_NAME_HEURISTICS_SNAPSHOT_KEY");
        BatchRequest batchrequest2 = a("invitability", "settings", "PREF_INVITABILITY_SETTINGS_SNAPSHOT_KEY");
        Batch batch = new Batch();
        for (; i < 3; i++)
        {
            batch.add((new BatchRequest[] {
                batchrequest, batchrequest1, batchrequest2
            })[i].toRequest());
        }

        BaseApi.c("batch/", batch.toRequestParam(), apiresponsehandler, s);
    }
}
