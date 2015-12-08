// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.mnv;


public class ProfileServicesConstants
{

    static final String CONNECTION_FAILED = "{ \"Errors\": [ { \"Code\": \"ConnectionFailed\", \"HttpResult\": 400 } ], \"Views\": [], \"TraceGraph\": null }";
    static final String HEADER_APPLICATION_ID = "PS-ApplicationId";
    static final String HEADER_CALLER_ENVIROMENT_ID = "X-CallerEnvironmentId";
    static final String HEADER_SCENARIO = "PS-Scenario";
    static final String JSON_EXCEPTION = "{ \"Errors\": [ { \"Code\": \"JsonException\", \"HttpResult\": 400 } ], \"Views\": [], \"TraceGraph\": null }";
    public static final String RESOURCE_PATH = "/profile/mine/System.ShortCircuitProfile.json";
    static final String TIMEOUT_EXCEPTION = "{ \"Errors\": [ { \"Code\": \"TimeoutException\", \"HttpResult\": 400 } ], \"Views\": [], \"TraceGraph\": null }";

    public ProfileServicesConstants()
    {
    }
}
