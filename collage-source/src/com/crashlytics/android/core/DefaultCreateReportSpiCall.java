// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import io.fabric.sdk.android.i;
import io.fabric.sdk.android.l;
import io.fabric.sdk.android.services.b.c;
import io.fabric.sdk.android.services.b.d;
import io.fabric.sdk.android.services.b.e;
import io.fabric.sdk.android.services.common.a;
import io.fabric.sdk.android.services.common.q;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.crashlytics.android.core:
//            CreateReportSpiCall, CreateReportRequest, CrashlyticsCore, Report

class DefaultCreateReportSpiCall extends a
    implements CreateReportSpiCall
{

    static final String FILE_CONTENT_TYPE = "application/octet-stream";
    static final String FILE_PARAM = "report[file]";
    static final String IDENTIFIER_PARAM = "report[identifier]";

    public DefaultCreateReportSpiCall(i i, String s, String s1, e e)
    {
        super(i, s, s1, e, c.b);
    }

    DefaultCreateReportSpiCall(i i, String s, String s1, e e, c c1)
    {
        super(i, s, s1, e, c1);
    }

    private d applyHeadersTo(d d1, CreateReportRequest createreportrequest)
    {
        d1 = d1.a("X-CRASHLYTICS-API-KEY", createreportrequest.apiKey).a("X-CRASHLYTICS-API-CLIENT-TYPE", "android").a("X-CRASHLYTICS-API-CLIENT-VERSION", CrashlyticsCore.getInstance().getVersion());
        for (createreportrequest = createreportrequest.report.getCustomHeaders().entrySet().iterator(); createreportrequest.hasNext();)
        {
            d1 = d1.a((java.util.Map.Entry)createreportrequest.next());
        }

        return d1;
    }

    private d applyMultipartDataTo(d d1, CreateReportRequest createreportrequest)
    {
        createreportrequest = createreportrequest.report;
        return d1.a("report[file]", createreportrequest.getFileName(), "application/octet-stream", createreportrequest.getFile()).e("report[identifier]", createreportrequest.getIdentifier());
    }

    public boolean invoke(CreateReportRequest createreportrequest)
    {
        createreportrequest = applyMultipartDataTo(applyHeadersTo(getHttpRequest(), createreportrequest), createreportrequest);
        io.fabric.sdk.android.c.h().a("Fabric", (new StringBuilder()).append("Sending report to: ").append(getUrl()).toString());
        int i = createreportrequest.b();
        io.fabric.sdk.android.c.h().a("Fabric", (new StringBuilder()).append("Create report request ID: ").append(createreportrequest.b("X-REQUEST-ID")).toString());
        io.fabric.sdk.android.c.h().a("Fabric", (new StringBuilder()).append("Result was: ").append(i).toString());
        return q.a(i) == 0;
    }
}
