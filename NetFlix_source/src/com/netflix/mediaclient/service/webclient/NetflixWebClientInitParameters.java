// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.webclient;

import com.android.volley.RequestQueue;
import com.netflix.mediaclient.servicemgr.ErrorLogging;

// Referenced classes of package com.netflix.mediaclient.service.webclient:
//            WebClientInitParameters, ApiEndpointRegistry, UserCredentialRegistry

public class NetflixWebClientInitParameters
    implements WebClientInitParameters
{

    private final ApiEndpointRegistry apiEndpointRegistry;
    private final ErrorLogging errorLogger;
    private final RequestQueue requestQueue;
    private final UserCredentialRegistry userCredentialRegistry;

    public NetflixWebClientInitParameters(ApiEndpointRegistry apiendpointregistry, UserCredentialRegistry usercredentialregistry, ErrorLogging errorlogging, RequestQueue requestqueue)
    {
        apiEndpointRegistry = apiendpointregistry;
        userCredentialRegistry = usercredentialregistry;
        errorLogger = errorlogging;
        requestQueue = requestqueue;
    }

    public ApiEndpointRegistry getApiEndpointRegistry()
    {
        return apiEndpointRegistry;
    }

    public ErrorLogging getErrorLogger()
    {
        return errorLogger;
    }

    public RequestQueue getRequestQueue()
    {
        return requestQueue;
    }

    public UserCredentialRegistry getUserCredentialRegistry()
    {
        return userCredentialRegistry;
    }
}
