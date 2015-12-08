// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import io.fabric.sdk.android.services.network.HttpMethod;
import io.fabric.sdk.android.services.network.HttpRequest;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class ame extends gyp
    implements amd
{

    public ame(gyh gyh, String s, String s1, hba hba)
    {
        super(gyh, s, s1, hba, HttpMethod.b);
    }

    public final boolean a(amc amc1)
    {
        HttpRequest httprequest = a(Collections.emptyMap()).a("X-CRASHLYTICS-API-KEY", amc1.a).a("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        alu.f();
        httprequest = httprequest.a("X-CRASHLYTICS-API-CLIENT-VERSION", "2.3.5.79");
        for (Iterator iterator = amc1.b.e().entrySet().iterator(); iterator.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            httprequest = httprequest.a((String)entry.getKey(), (String)entry.getValue());
        }

        amc1 = amc1.b;
        amc1 = httprequest.a("report[file]", amc1.b(), "application/octet-stream", amc1.d()).b("report[identifier]", amc1.c());
        gya.a().a("CrashlyticsCore", (new StringBuilder("Sending report to: ")).append(super.a).toString());
        int i = amc1.b();
        gya.a().a("CrashlyticsCore", (new StringBuilder("Create report request ID: ")).append(amc1.a("X-REQUEST-ID")).toString());
        gya.a().a("CrashlyticsCore", (new StringBuilder("Result was: ")).append(i).toString());
        return gzk.a(i) == 0;
    }
}
