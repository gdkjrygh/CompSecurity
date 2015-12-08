// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;

import io.fabric.sdk.android.i;
import io.fabric.sdk.android.services.b.c;
import io.fabric.sdk.android.services.b.d;
import io.fabric.sdk.android.services.b.e;
import io.fabric.sdk.android.services.common.a;
import io.fabric.sdk.android.services.common.h;
import io.fabric.sdk.android.services.common.q;
import io.fabric.sdk.android.services.events.k;
import java.io.File;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.crashlytics.android.answers:
//            Answers

class SessionAnalyticsFilesSender extends a
    implements k
{

    static final String FILE_CONTENT_TYPE = "application/vnd.crashlytics.android.events";
    static final String FILE_PARAM_NAME = "session_analytics_file_";
    private final String apiKey;

    public SessionAnalyticsFilesSender(i i, String s, String s1, e e, String s2)
    {
        super(i, s, s1, e, c.b);
        apiKey = s2;
    }

    private d applyHeadersTo(d d1, String s)
    {
        return d1.a("X-CRASHLYTICS-API-CLIENT-TYPE", "android").a("X-CRASHLYTICS-API-CLIENT-VERSION", Answers.getInstance().getVersion()).a("X-CRASHLYTICS-API-KEY", s);
    }

    private d applyMultipartDataTo(d d1, List list)
    {
        list = list.iterator();
        for (int i = 0; list.hasNext(); i++)
        {
            File file = (File)list.next();
            h.a(Answers.getInstance().getContext(), (new StringBuilder()).append("Adding analytics session file ").append(file.getName()).append(" to multipart POST").toString());
            d1.a((new StringBuilder()).append("session_analytics_file_").append(i).toString(), file.getName(), "application/vnd.crashlytics.android.events", file);
        }

        return d1;
    }

    public boolean send(List list)
    {
        d d1 = applyMultipartDataTo(applyHeadersTo(getHttpRequest(), apiKey), list);
        h.a(Answers.getInstance().getContext(), (new StringBuilder()).append("Sending ").append(list.size()).append(" analytics files to ").append(getUrl()).toString());
        int i = d1.b();
        h.a(Answers.getInstance().getContext(), (new StringBuilder()).append("Response code for analytics file send is ").append(i).toString());
        return q.a(i) == 0;
    }
}
