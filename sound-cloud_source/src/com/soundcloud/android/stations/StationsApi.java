// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stations;

import com.soundcloud.android.api.ApiClient;
import com.soundcloud.android.api.ApiClientRx;
import com.soundcloud.android.api.ApiEndpoints;
import com.soundcloud.android.api.ApiMapperException;
import com.soundcloud.android.api.ApiRequest;
import com.soundcloud.android.api.ApiRequestException;
import com.soundcloud.android.model.Urn;
import java.io.IOException;
import java.util.List;
import rx.b;

// Referenced classes of package com.soundcloud.android.stations:
//            ApiStation, StationsSyncPostBody, ApiStationsCollections

class StationsApi
{

    private final ApiClient apiClient;
    private final ApiClientRx apiClientRx;

    public StationsApi(ApiClientRx apiclientrx, ApiClient apiclient)
    {
        apiClientRx = apiclientrx;
        apiClient = apiclient;
    }

    b fetchStation(Urn urn)
    {
        urn = ApiRequest.get(ApiEndpoints.STATION.path(new Object[] {
            urn.toString()
        })).forPrivateApi(1).build();
        return apiClientRx.mappedResponse(urn, com/soundcloud/android/stations/ApiStation);
    }

    ApiStationsCollections syncStationsCollections(List list)
        throws ApiRequestException, IOException, ApiMapperException
    {
        list = ApiRequest.post(ApiEndpoints.STATIONS.path()).withContent(new StationsSyncPostBody(list)).forPrivateApi(1).build();
        return (ApiStationsCollections)apiClient.fetchMappedResponse(list, com/soundcloud/android/stations/ApiStationsCollections);
    }
}
