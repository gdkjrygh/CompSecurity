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

class DefaultSessionAnalyticsFilesSender extends AbstractSpiCall
    implements FilesSender
{

    static final String FILE_CONTENT_TYPE = "application/vnd.crashlytics.android.events";
    static final String FILE_PARAM_NAME = "session_analytics_file_";
    private final String apiKey;

    public DefaultSessionAnalyticsFilesSender(Kit kit, String s, String s1, HttpRequestFactory httprequestfactory, String s2)
    {
        this(kit, s, s1, httprequestfactory, s2, HttpMethod.POST);
    }

    DefaultSessionAnalyticsFilesSender(Kit kit, String s, String s1, HttpRequestFactory httprequestfactory, String s2, HttpMethod httpmethod)
    {
        super(kit, s, s1, httprequestfactory, httpmethod);
        apiKey = s2;
    }

    private HttpRequest applyHeadersTo(HttpRequest httprequest, String s)
    {
        return httprequest.header("X-CRASHLYTICS-API-CLIENT-TYPE", "android").header("X-CRASHLYTICS-API-CLIENT-VERSION", Answers.getInstance().getVersion()).header("X-CRASHLYTICS-API-KEY", s);
    }

    private HttpRequest applyMultipartDataTo(HttpRequest httprequest, List list)
    {
        int i = 0;
        for (list = list.iterator(); list.hasNext();)
        {
            File file = (File)list.next();
            CommonUtils.logControlled(Answers.getInstance().getContext(), (new StringBuilder()).append("Adding analytics session file ").append(file.getName()).append(" to multipart POST").toString());
            httprequest.part((new StringBuilder()).append("session_analytics_file_").append(i).toString(), file.getName(), "application/vnd.crashlytics.android.events", file);
            i++;
        }

        return httprequest;
    }

    public boolean send(List list)
    {
        HttpRequest httprequest = applyMultipartDataTo(applyHeadersTo(getHttpRequest(), apiKey), list);
        CommonUtils.logControlled(Answers.getInstance().getContext(), (new StringBuilder()).append("Sending ").append(list.size()).append(" analytics files to ").append(getUrl()).toString());
        int i = httprequest.code();
        CommonUtils.logControlled(Answers.getInstance().getContext(), (new StringBuilder()).append("Response code for analytics file send is ").append(i).toString());
        return ResponseParser.parse(i) == 0;
    }
}
