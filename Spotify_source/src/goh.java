// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import com.google.common.base.Optional;
import com.spotify.mobile.android.util.logging.Logger;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public final class goh
{

    private static gip c = gip.a("network_operator_premium_activation_next_earliest_retry_time");
    public final gey a;
    public long b;
    private final gin d;
    private dme e;
    private String f;
    private goi g;
    private final gnx h;
    private dmh i;

    public goh(Context context, goi goi1)
    {
        i = new dmh() {

            private goh a;

            public final void a(int j, Object obj)
            {
                obj = (JSONObject)obj;
                if (j >= 200 && j < 300)
                {
                    goh.a(a, ((JSONObject) (obj)));
                    return;
                }
                if (j == 403)
                {
                    goh.b(a, ((JSONObject) (obj)));
                    return;
                } else
                {
                    goh.a(a).e();
                    return;
                }
            }

            public final void a(Throwable throwable, String s)
            {
                Logger.b(throwable, (new StringBuilder("Eligibility Check Failed ")).append(s).toString(), new Object[0]);
                goh.a(a).e();
            }

            
            {
                a = goh.this;
                super();
            }
        };
        g = goi1;
        d = ((giq)dmz.a(giq)).a(context);
        goi1 = new Runnable() {

            private goh a;

            public final void run()
            {
                goh.b(a);
            }

            
            {
                a = goh.this;
                super();
            }
        };
        long l = Math.max(100L, d.a(c, 0L) - System.currentTimeMillis());
        goi1 = new gez("network-operator-eligibility-checker", goi1);
        goi1.a = new gfd(l, TimeUnit.MILLISECONDS);
        goi1.c = new gfb(400L, TimeUnit.MILLISECONDS);
        goi1.d = 10;
        goi1.e = new gfe(5L, 7L, TimeUnit.HOURS);
        a = goi1.a();
        h = gnx.a(context);
    }

    private static Optional a(JSONObject jsonobject, String s)
    {
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_13;
        }
        return Optional.b(jsonobject.getString(s));
        jsonobject = Optional.e();
        return jsonobject;
        jsonobject;
        return Optional.e();
    }

    static gey a(goh goh1)
    {
        return goh1.a;
    }

    static void a(goh goh1, JSONObject jsonobject)
    {
        Optional optional = a(jsonobject, "status");
        Optional optional1 = a(jsonobject, "spotify_order_token");
        boolean flag;
        if (optional.b() && optional1.b())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag && "success".equals(optional.c()) && !TextUtils.isEmpty((CharSequence)optional1.c()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            goh1.h.a(jsonobject);
            goh1.g.a(jsonobject.toString());
            return;
        } else
        {
            goh1.a(jsonobject);
            return;
        }
    }

    private void a(JSONObject jsonobject)
    {
        String s = (String)a(jsonobject, "status").d();
        jsonobject = (String)a(jsonobject, "message").d();
        if ("error".equals(s) && "customer not eligible".equals(jsonobject))
        {
            a();
            jsonobject = d.b();
            gip gip1 = c;
            Calendar calendar = Calendar.getInstance();
            calendar.set(11, 23);
            calendar.set(12, 59);
            calendar.set(13, 59);
            jsonobject.a(gip1, calendar.getTimeInMillis()).b();
            return;
        } else
        {
            a.e();
            return;
        }
    }

    static void b(goh goh1)
    {
        String s;
        if (goh1.b != 0L)
        {
            s = (new StringBuilder("https://api.gws.ph/v1/spotify/subscriptions/")).append(goh1.b).toString();
        } else
        {
            s = "http://api.gws.ph/v1/spotify/subscriptions";
        }
        if (!s.equals(goh1.f))
        {
            goh1.f = s;
            goh1.e = ((dmj)dmz.a(dmj)).a(s);
            goh1.e.a("AppKey", "aZXCIfH5jM5QA4JdAntHFAVkGW9Wc12R");
        }
        goh1.e.a("", null, goh1.i);
    }

    static void b(goh goh1, JSONObject jsonobject)
    {
        goh1.a(jsonobject);
    }

    public final void a()
    {
        if (a.c)
        {
            a.c();
        }
        if (e != null)
        {
            e.a();
        }
    }

    static 
    {
        gip.a("growth_debug_telco_uri");
    }
}
