// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import io.fabric.sdk.android.services.network.HttpMethod;
import io.fabric.sdk.android.services.network.HttpRequest;
import java.io.File;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

final class akz extends gyp
    implements har
{

    private final String c;

    public akz(gyh gyh1, String s, String s1, hba hba, String s2)
    {
        super(gyh1, s, s1, hba, HttpMethod.b);
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

        gya.a().a("Answers", (new StringBuilder("Sending ")).append(list.size()).append(" analytics files to ").append(super.a).toString());
        int j = httprequest.b();
        gya.a().a("Answers", (new StringBuilder("Response code for analytics file send is ")).append(j).toString());
        if (gzk.a(j) == 0)
        {
            flag = true;
        }
        return flag;
    }
}
