// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;

import io.fabric.sdk.android.c;
import io.fabric.sdk.android.h;
import io.fabric.sdk.android.k;
import io.fabric.sdk.android.services.b.j;
import io.fabric.sdk.android.services.common.a;
import io.fabric.sdk.android.services.common.o;
import io.fabric.sdk.android.services.network.HttpMethod;
import io.fabric.sdk.android.services.network.HttpRequest;
import java.io.File;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class SessionAnalyticsFilesSender extends a
    implements j
{

    private final String c;

    public SessionAnalyticsFilesSender(h h1, String s, String s1, io.fabric.sdk.android.services.network.c c1, String s2)
    {
        super(h1, s, s1, c1, HttpMethod.b);
        c = s2;
    }

    public final boolean a(List list)
    {
        boolean flag = false;
        HttpRequest httprequest = a(Collections.emptyMap()).a("X-CRASHLYTICS-API-CLIENT-TYPE", "android").a("X-CRASHLYTICS-API-CLIENT-VERSION", b.a()).a("X-CRASHLYTICS-API-KEY", c);
        Iterator iterator = list.iterator();
        for (int i = 0; iterator.hasNext(); i++)
        {
            File file = (File)iterator.next();
            httprequest.a((new StringBuilder("session_analytics_file_")).append(i).toString(), file.getName(), "application/vnd.crashlytics.android.events", file);
        }

        io.fabric.sdk.android.c.a().a("Answers", (new StringBuilder("Sending ")).append(list.size()).append(" analytics files to ").append(super.a).toString());
        int l = httprequest.b();
        io.fabric.sdk.android.c.a().a("Answers", (new StringBuilder("Response code for analytics file send is ")).append(l).toString());
        if (o.a(l) == 0)
        {
            flag = true;
        }
        return flag;
    }
}
