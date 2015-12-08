// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.webclient.volley;

import com.android.volley.RequestQueue;
import com.netflix.mediaclient.service.logging.client.volley.ClientLoggingVolleyWebClientRequest;
import com.netflix.mediaclient.service.logging.presentation.volley.PresentationEventRequest;
import com.netflix.mediaclient.service.webclient.ApiEndpointRegistry;
import com.netflix.mediaclient.service.webclient.NetflixWebClientInitParameters;
import com.netflix.mediaclient.service.webclient.UserCredentialRegistryWrapper;
import com.netflix.mediaclient.service.webclient.WebClientInitParameters;
import com.netflix.mediaclient.util.LogUtils;

// Referenced classes of package com.netflix.mediaclient.service.webclient.volley:
//            VolleyWebClient, FalcorVolleyWebClientRequest

public class FalcorVolleyWebClient extends VolleyWebClient
{

    private ApiEndpointRegistry mApiEndpointRegistry;

    public FalcorVolleyWebClient()
    {
    }

    private void reportDataRequestSessionStarted(FalcorVolleyWebClientRequest falcorvolleywebclientrequest, String s)
    {
        android.content.Context context = falcorvolleywebclientrequest.getContext();
        if (context != null)
        {
            LogUtils.reportDataRequestStarted(context, falcorvolleywebclientrequest.getRequestId(), s);
        }
    }

    private void sendFalcorRequest(FalcorVolleyWebClientRequest falcorvolleywebclientrequest, String s)
    {
        falcorvolleywebclientrequest.setApiEndpointRegistry(mApiEndpointRegistry);
        falcorvolleywebclientrequest.setUserCredentialRegistry(mUserCredentialRegistry);
        falcorvolleywebclientrequest.setRetryPolicy(createRetryPolicy());
        falcorvolleywebclientrequest.initUrl(s);
        reportDataRequestSessionStarted(falcorvolleywebclientrequest, s);
        sRequestQueue.add(falcorvolleywebclientrequest);
    }

    public void init(WebClientInitParameters webclientinitparameters)
    {
        if (webclientinitparameters instanceof NetflixWebClientInitParameters)
        {
            webclientinitparameters = (NetflixWebClientInitParameters)webclientinitparameters;
            mApiEndpointRegistry = webclientinitparameters.getApiEndpointRegistry();
            mUserCredentialRegistry = webclientinitparameters.getUserCredentialRegistry();
            sRequestQueue = webclientinitparameters.getRequestQueue();
            mErrorLogger = webclientinitparameters.getErrorLogger();
            return;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Expecting NetflixWebClientInitParameters and receiving ").append(webclientinitparameters).toString());
        }
    }

    public void sendConfigRequest(FalcorVolleyWebClientRequest falcorvolleywebclientrequest)
    {
        sendFalcorRequest(falcorvolleywebclientrequest, mApiEndpointRegistry.getConfigUrlFull());
    }

    public void sendLoggingRequest(ClientLoggingVolleyWebClientRequest clientloggingvolleywebclientrequest)
    {
        clientloggingvolleywebclientrequest.setUserCredentialRegistry(new UserCredentialRegistryWrapper(mUserCredentialRegistry));
        clientloggingvolleywebclientrequest.setRetryPolicy(createRetryPolicy());
        clientloggingvolleywebclientrequest.initUrl(mApiEndpointRegistry.getClientLoggingUrlFull());
        sRequestQueue.add(clientloggingvolleywebclientrequest);
    }

    public void sendPresentationRequest(PresentationEventRequest presentationeventrequest)
    {
        presentationeventrequest.setUserCredentialRegistry(new UserCredentialRegistryWrapper(mUserCredentialRegistry));
        presentationeventrequest.setRetryPolicy(createRetryPolicy());
        presentationeventrequest.initUrl(mApiEndpointRegistry.getPresentationTrackingUrlFull());
        sRequestQueue.add(presentationeventrequest);
    }

    public void sendRequest(FalcorVolleyWebClientRequest falcorvolleywebclientrequest)
    {
        sendFalcorRequest(falcorvolleywebclientrequest, mApiEndpointRegistry.getApiUrlFull());
    }
}
