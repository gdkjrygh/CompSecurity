// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.analytics;

import android.app.Activity;
import android.content.Intent;
import com.pinterest.api.remote.AnalyticsApi;
import com.pinterest.kit.data.Preferences;
import com.pinterest.kit.data.PreferencesManager;
import com.pinterest.network.json.PinterestJsonObject;
import com.pinterest.schemas.event.AppStartType;
import com.pinterest.schemas.event.EventType;
import java.util.HashMap;
import java.util.concurrent.FutureTask;

// Referenced classes of package com.pinterest.analytics:
//            PinterestDeepLinkMetaData, Pinalytics

public class DeepLinkLogging
{

    private HashMap a;
    private PinterestJsonObject b;

    public DeepLinkLogging()
    {
        a = new HashMap();
    }

    static PinterestJsonObject a(DeepLinkLogging deeplinklogging, PinterestJsonObject pinterestjsonobject)
    {
        deeplinklogging.b = pinterestjsonobject;
        return pinterestjsonobject;
    }

    static String a(DeepLinkLogging deeplinklogging, String s, String s1)
    {
label0:
        {
label1:
            {
                String s2 = "";
                if (s == null)
                {
                    break label0;
                }
                if (!"PUSH_NOTIF".equals(s))
                {
                    s1 = s2;
                    if (!"PULL_NOTIF".equals(s))
                    {
                        break label1;
                    }
                }
                deeplinklogging.a.put("app_start_source", AppStartType.NOTIFICATION.toString());
                s1 = "_notif";
            }
            return s1;
        }
        deeplinklogging.a.put("full_url", s1);
        deeplinklogging.a();
        s = new PinterestDeepLinkMetaData();
        s.getClass();
        if ((new PinterestDeepLinkMetaData.MetaDataObject(s, deeplinklogging.b)).a())
        {
            deeplinklogging.a.put("app_start_source", AppStartType.DEEPLINK.toString());
            return "_deeplink";
        } else
        {
            deeplinklogging.a.put("app_start_source", AppStartType.WEB_URL.toString());
            return "_weburl";
        }
    }

    static HashMap a(DeepLinkLogging deeplinklogging)
    {
        return deeplinklogging.a;
    }

    private void a()
    {
        for (int i = 0; i < 3; i++)
        {
            String s = (new String[] {
                "utm_source", "utm_medium", "utm_campaign"
            })[i];
            if (b.f(s))
            {
                a.put(s, b.a(s, null));
            }
        }

        if (b.f("install_id"))
        {
            a.put("mweb_unauth_id", b.a("install_id", null));
        }
    }

    public final FutureTask a(Activity activity, String s)
    {
        activity = new FutureTask(new _cls1(activity, s, activity.getIntent().getData()));
        (new Thread(activity)).start();
        return activity;
    }

    public final void a(EventType eventtype)
    {
        if (!Preferences.persisted().getBoolean("PREF_FIRST_AUTH", true))
        {
            return;
        }
        b = PinterestDeepLinkMetaData.b();
        PinterestDeepLinkMetaData pinterestdeeplinkmetadata = new PinterestDeepLinkMetaData();
        pinterestdeeplinkmetadata.getClass();
        if ((new PinterestDeepLinkMetaData.MetaDataObject(pinterestdeeplinkmetadata, b)).a())
        {
            a();
            if (b.f("$deeplink_path"))
            {
                a.put("full_url", (new StringBuilder("pinterest://")).append(b.a("$deeplink_path", null)).toString());
            }
            Pinalytics.a(eventtype, null, a);
            AnalyticsApi.a(eventtype.name().toLowerCase());
        }
        Preferences.persisted().set("PREF_FIRST_AUTH", false);
    }

    private class _cls1
        implements Callable
    {

        final Activity a;
        final String b;
        final Uri c;
        final DeepLinkLogging d;

        public Object call()
        {
            DeepLinkLogging.a(d, PinterestDeepLinkMetaData.a(a));
            String s = DeepLinkLogging.a(d, b, c.toString());
            Pinalytics.a(EventType.APP_START, null, DeepLinkLogging.a(d));
            AnalyticsApi.b((new StringBuilder("app_start")).append(s).toString());
            return null;
        }

        _cls1(Activity activity, String s, Uri uri)
        {
            d = DeepLinkLogging.this;
            a = activity;
            b = s;
            c = uri;
            super();
        }
    }

}
