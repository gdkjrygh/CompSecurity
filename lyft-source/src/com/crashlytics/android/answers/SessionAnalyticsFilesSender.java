// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;

import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.services.common.AbstractSpiCall;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.ResponseParser;
import io.fabric.sdk.android.services.events.FilesSender;
import io.fabric.sdk.android.services.network.HttpMethod;
import io.fabric.sdk.android.services.network.HttpRequest;
import io.fabric.sdk.android.services.network.HttpRequestFactory;
import java.io.File;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.crashlytics.android.answers:
//            Answers

class SessionAnalyticsFilesSender extends AbstractSpiCall
    implements FilesSender
{

    private final String b;

    public SessionAnalyticsFilesSender(Kit kit, String s, String s1, HttpRequestFactory httprequestfactory, String s2)
    {
        super(kit, s, s1, httprequestfactory, HttpMethod.b);
        b = s2;
    }

    private HttpRequest a(HttpRequest httprequest, String s)
    {
        return httprequest.a("X-CRASHLYTICS-API-CLIENT-TYPE", "android").a("X-CRASHLYTICS-API-CLIENT-VERSION", Answers.b().d()).a("X-CRASHLYTICS-API-KEY", s);
    }

    private HttpRequest a(HttpRequest httprequest, List list)
    {
        list = list.iterator();
        for (int i = 0; list.hasNext(); i++)
        {
            File file = (File)list.next();
            CommonUtils.a(Answers.b().C(), (new StringBuilder()).append("Adding analytics session file ").append(file.getName()).append(" to multipart POST").toString());
            httprequest.a((new StringBuilder()).append("session_analytics_file_").append(i).toString(), file.getName(), "application/vnd.crashlytics.android.events", file);
        }

        return httprequest;
    }

    public boolean a(List list)
    {
        HttpRequest httprequest = a(a(b(), b), list);
        CommonUtils.a(Answers.b().C(), (new StringBuilder()).append("Sending ").append(list.size()).append(" analytics files to ").append(a()).toString());
        int i = httprequest.b();
        CommonUtils.a(Answers.b().C(), (new StringBuilder()).append("Response code for analytics file send is ").append(i).toString());
        return ResponseParser.a(i) == 0;
    }
}
