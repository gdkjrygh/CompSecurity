// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import io.fabric.sdk.android.c;
import io.fabric.sdk.android.h;
import io.fabric.sdk.android.k;
import io.fabric.sdk.android.services.common.a;
import io.fabric.sdk.android.services.common.o;
import io.fabric.sdk.android.services.network.HttpMethod;
import io.fabric.sdk.android.services.network.HttpRequest;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.crashlytics.android.core:
//            CreateReportSpiCall, CreateReportRequest, CrashlyticsCore, Report

class DefaultCreateReportSpiCall extends a
    implements CreateReportSpiCall
{

    public DefaultCreateReportSpiCall(h h, String s, String s1, io.fabric.sdk.android.services.network.c c1)
    {
        super(h, s, s1, c1, HttpMethod.b);
    }

    public final boolean a(CreateReportRequest createreportrequest)
    {
        HttpRequest httprequest = a(Collections.emptyMap()).a("X-CRASHLYTICS-API-KEY", createreportrequest.a).a("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        CrashlyticsCore.f();
        httprequest = httprequest.a("X-CRASHLYTICS-API-CLIENT-VERSION", "2.3.5.79");
        for (Iterator iterator = createreportrequest.b.e().entrySet().iterator(); iterator.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            httprequest = httprequest.a((String)entry.getKey(), (String)entry.getValue());
        }

        createreportrequest = createreportrequest.b;
        createreportrequest = httprequest.a("report[file]", createreportrequest.b(), "application/octet-stream", createreportrequest.d()).b("report[identifier]", createreportrequest.c());
        c.a().a("CrashlyticsCore", (new StringBuilder("Sending report to: ")).append(super.a).toString());
        int i = createreportrequest.b();
        c.a().a("CrashlyticsCore", (new StringBuilder("Create report request ID: ")).append(createreportrequest.a("X-REQUEST-ID")).toString());
        c.a().a("CrashlyticsCore", (new StringBuilder("Result was: ")).append(i).toString());
        return o.a(i) == 0;
    }
}
