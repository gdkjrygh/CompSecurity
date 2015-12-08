// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.AbstractSpiCall;
import io.fabric.sdk.android.services.common.ResponseParser;
import io.fabric.sdk.android.services.network.HttpMethod;
import io.fabric.sdk.android.services.network.HttpRequest;
import io.fabric.sdk.android.services.network.HttpRequestFactory;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.crashlytics.android:
//            CreateReportSpiCall, CreateReportRequest, Crashlytics, Report

class DefaultCreateReportSpiCall extends AbstractSpiCall
    implements CreateReportSpiCall
{

    public DefaultCreateReportSpiCall(Kit kit, String s, String s1, HttpRequestFactory httprequestfactory)
    {
        super(kit, s, s1, httprequestfactory, HttpMethod.b);
    }

    private HttpRequest a(HttpRequest httprequest, CreateReportRequest createreportrequest)
    {
        httprequest = httprequest.a("X-CRASHLYTICS-API-KEY", createreportrequest.a).a("X-CRASHLYTICS-API-CLIENT-TYPE", "android").a("X-CRASHLYTICS-API-CLIENT-VERSION", Crashlytics.f().d());
        for (createreportrequest = createreportrequest.b.e().entrySet().iterator(); createreportrequest.hasNext();)
        {
            httprequest = httprequest.a((java.util.Map.Entry)createreportrequest.next());
        }

        return httprequest;
    }

    private HttpRequest b(HttpRequest httprequest, CreateReportRequest createreportrequest)
    {
        createreportrequest = createreportrequest.b;
        return httprequest.a("report[file]", createreportrequest.b(), "application/octet-stream", createreportrequest.d()).e("report[identifier]", createreportrequest.c());
    }

    public boolean a(CreateReportRequest createreportrequest)
    {
        createreportrequest = b(a(b(), createreportrequest), createreportrequest);
        Fabric.g().a("Fabric", (new StringBuilder()).append("Sending report to: ").append(a()).toString());
        int i = createreportrequest.b();
        Fabric.g().a("Fabric", (new StringBuilder()).append("Create report request ID: ").append(createreportrequest.b("X-REQUEST-ID")).toString());
        Fabric.g().a("Fabric", (new StringBuilder()).append("Result was: ").append(i).toString());
        return ResponseParser.a(i) == 0;
    }
}
