// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.bugreporter;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.ap;
import com.facebook.bugreporter.activity.BugReportActivity;
import com.facebook.common.e.h;
import com.facebook.common.w.m;
import com.facebook.debug.log.b;
import com.facebook.http.protocol.aq;
import com.facebook.o;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.common.a.es;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;

// Referenced classes of package com.facebook.bugreporter:
//            BugReport, e, m, ConstBugReporterConfig, 
//            d, l

public class f
{

    private static final Class a = com/facebook/bugreporter/f;
    private final Context b;
    private final aq c;
    private final d d;
    private final h e;
    private final NotificationManager f;
    private final com.facebook.bugreporter.m g;

    public f(Context context, aq aq1, d d1, h h1, NotificationManager notificationmanager, com.facebook.bugreporter.m m1)
    {
        b = context;
        c = aq1;
        d = d1;
        e = h1;
        f = notificationmanager;
        g = m1;
    }

    private String a(Uri uri)
    {
        if (uri == null)
        {
            return "";
        }
        try
        {
            uri = com.google.common.b.f.b(new File(new URI(uri.toString())), Charset.defaultCharset());
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            com.facebook.debug.log.b.a("Invalid file", uri);
            return "";
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            com.facebook.debug.log.b.a("Failed to laod file", uri);
            return "";
        }
        return uri;
    }

    private void a(String s)
    {
        com.facebook.debug.log.b.e(a, s);
        e.a(a.getSimpleName(), s);
    }

    public void a(BugReport bugreport, l l)
    {
        ObjectNode objectnode = new ObjectNode(JsonNodeFactory.instance);
        objectnode.put("log", a(bugreport.c()));
        Object obj = es.d();
        if (bugreport.d() != null)
        {
            obj = es.a(bugreport.d());
        }
        obj = new e(bugreport.b(), ((es) (obj)), bugreport.e(), bugreport.f(), objectnode.toString(), bugreport.h(), bugreport.i(), bugreport.j(), bugreport.k(), bugreport.l(), bugreport.m(), bugreport.n());
        boolean flag;
        try
        {
            flag = ((Boolean)c.a(d, obj)).booleanValue();
        }
        catch (Exception exception)
        {
            a(m.b("Error running SingleMethodRunner: %s", new Object[] {
                exception
            }));
            flag = false;
        }
        if (flag)
        {
            g.b(bugreport.a());
            return;
        }
        a("Failed to upload bug report.");
        exception = new Intent(b, com/facebook/bugreporter/activity/BugReportActivity);
        exception.putExtra("report", bugreport);
        exception.putExtra("reporter_config", ConstBugReporterConfig.a(l));
        exception.putExtra("retry", true);
        l = b.getString(o.bug_report_fail_title, new Object[] {
            bugreport.b()
        });
        bugreport = l;
        if (com.facebook.base.b.a())
        {
            bugreport = m.a("%s - beta", new Object[] {
                l
            });
        }
        bugreport = (new ap(b)).a(bugreport).b(b.getString(o.bug_report_fail_text)).a(0x108008a).b(true).c(b.getString(o.bug_report_fail_ticker)).a(System.currentTimeMillis()).a(PendingIntent.getActivity(b, (int)System.currentTimeMillis(), exception, 0x10000000)).b();
        f.notify(50000, bugreport);
    }

}
