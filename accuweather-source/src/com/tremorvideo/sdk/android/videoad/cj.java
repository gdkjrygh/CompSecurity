// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.app.Activity;
import java.io.BufferedInputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.HttpPost;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            Settings, ct, du, cs, 
//            ci, az, fz, ex, 
//            ck, cl, cn

public class cj
{

    private static int a = 1;

    static int a()
    {
        int i = a + 1;
        a = i;
        return i;
    }

    public static JSONObject a(Settings settings)
    {
        JSONArray jsonarray;
        try
        {
            jsonarray = new JSONArray();
            for (Iterator iterator = settings.userInterests.iterator(); iterator.hasNext(); jsonarray.put((String)iterator.next())) { }
        }
        // Misplaced declaration of an exception variable
        catch (Settings settings)
        {
            ct.a("Error creating JSON user data", settings);
            return null;
        }
        JSONObject jsonobject;
        jsonobject = new JSONObject();
        String s;
        for (Iterator iterator1 = settings.misc.keySet().iterator(); iterator1.hasNext(); jsonobject.put(s, settings.misc.get(s)))
        {
            s = (String)iterator1.next();
        }

        JSONObject jsonobject1;
        jsonobject1 = new JSONObject();
        jsonobject1.put("age", settings.userAge);
        jsonobject1.put("gender", settings.userGender.ordinal());
        jsonobject1.put("locale", settings.userCountry);
        jsonobject1.put("lang", settings.userLanguage);
        jsonobject1.put("zip", settings.userZip);
        jsonobject1.put("long", settings.userLongitude);
        jsonobject1.put("lat", settings.userLatitude);
        jsonobject1.put("income", settings.userIncomeRange.ordinal());
        jsonobject1.put("education", settings.userEducation.ordinal());
        jsonobject1.put("race", settings.userRace.ordinal());
        jsonobject1.put("interests", jsonarray);
        jsonobject1.put("misc", jsonobject);
        return jsonobject1;
    }

    public static JSONObject a(du du1)
    {
        JSONArray jsonarray;
        try
        {
            jsonarray = new JSONArray();
            for (Iterator iterator = du1.r.iterator(); iterator.hasNext(); jsonarray.put((String)iterator.next())) { }
        }
        // Misplaced declaration of an exception variable
        catch (du du1)
        {
            ct.a("Error creating JSON device info", du1);
            return null;
        }
        JSONObject jsonobject;
        jsonobject = new JSONObject();
        jsonobject.put("sdk_version", du1.a);
        jsonobject.put("timezone", du1.w);
        jsonobject.put("make", du1.b);
        jsonobject.put("width", du1.h);
        jsonobject.put("height", du1.i);
        jsonobject.put("carrier", du1.j);
        jsonobject.put("color_depth", du1.k);
        jsonobject.put("model", du1.c);
        jsonobject.put("OS", du1.d);
        jsonobject.put("OS_version", du1.e);
        jsonobject.put("udid", du1.f);
        jsonobject.put("connection", du1.g);
        jsonobject.put("disk_space", du1.m);
        jsonobject.put("heap", du1.l);
        jsonobject.put("bandwith", du1.n);
        jsonobject.put("accelerometer", du1.o);
        jsonobject.put("gps", du1.p);
        jsonobject.put("gyroscope", du1.q);
        jsonobject.put("apps", jsonarray);
        jsonobject.put("networkISO", du1.t);
        jsonobject.put("simISO", du1.s);
        jsonobject.put("carrierCountryISO", du1.u);
        return jsonobject;
    }

    public static JSONObject a(du du1, Settings settings, ci ci1, TremorVideo.a a1, String s)
    {
        JSONObject jsonobject;
        int i = 0;
        try
        {
            jsonobject = new JSONObject();
            jsonobject.put("version", "3.4.0.0");
            jsonobject.put("adtype", "video");
            jsonobject.put("mode", 34);
            jsonobject.put("placement", a1.ordinal());
            jsonobject.put("previous_session_id", ct.x());
            jsonobject.put("appId", 0);
            jsonobject.put("device_info", a(du1));
            jsonobject.put("user_info", a(settings));
            jsonobject.put("cookies", ct.f().a());
        }
        // Misplaced declaration of an exception variable
        catch (du du1)
        {
            ct.a("Error creating JSON request", du1);
            return null;
        }
        if (ci1 == null)
        {
            break MISSING_BLOCK_LABEL_211;
        }
        du1 = new JSONArray();
_L1:
        if (i >= ci1.a())
        {
            break MISSING_BLOCK_LABEL_201;
        }
        a1 = new JSONObject();
        a1.put("file", ci1.a(i).a);
        a1.put("views", ci1.a(i).b);
        du1.put(a1);
        i++;
          goto _L1
        jsonobject.put("cache", du1);
        du1 = new JSONObject();
        ci1 = new JSONArray();
        for (a1 = settings.category.iterator(); a1.hasNext(); ci1.put((String)a1.next())) { }
        a1 = new JSONArray();
        for (Iterator iterator = settings.adBlocks.iterator(); iterator.hasNext(); a1.put((String)iterator.next())) { }
        du1.put("cid", 0);
        du1.put("pid", 0);
        du1.put("cch", s);
        du1.put("cp", "");
        du1.put("cat", ci1);
        du1.put("preferred_orientation", settings.preferredOrientation.ordinal());
        du1.put("adBlocks", a1);
        du1.put("policyId", settings.policyID);
        du1.put("maxAdTimeSeconds", settings.maxAdTimeSeconds);
        du1.put("contentID", settings.contentID);
        du1.put("contentDescription", settings.contentDescription);
        du1.put("contentTitle", settings.contentTitle);
        jsonobject.put("contextual_info", du1);
        ct.a(ct.a.c, jsonobject.toString(2));
        return jsonobject;
    }

    public static void a(Activity activity, az az1, ex.a a1)
    {
        Object obj = ct.s();
        try
        {
            JSONObject jsonobject = new JSONObject();
            jsonobject.put("tap_response_timestamp", az1.f().c());
            jsonobject.put("appId", 0);
            jsonobject.put("policyId", ((Settings) (obj)).policyID);
            jsonobject.put("protocol_version", "3.4.0.0");
            jsonobject.put("init_tapResponse_delta", a1.a.b());
            jsonobject.put("pid", 0);
            jsonobject.put("session_id", az1.f().e());
            jsonobject.put("cch", az1.f().a());
            jsonobject.put("cookies", ct.f().a());
            obj = new JSONObject();
            JSONArray jsonarray = new JSONArray();
            JSONObject jsonobject1 = new JSONObject();
            jsonobject1.put("id", az1.g());
            jsonobject1.put("view", 0);
            jsonobject1.put("from_cache", az1.a());
            jsonobject1.put("end_time", a1.a.c());
            jsonobject1.put("placement", "");
            jsonobject1.put("billable", true);
            JSONArray jsonarray1 = new JSONArray();
            jsonarray1.put(a1.a());
            jsonobject1.put("events", jsonarray1);
            jsonarray.put(jsonobject1);
            ((JSONObject) (obj)).put("ad", jsonarray);
            jsonobject.put("ad_info", obj);
            ct.a(ct.a.c, jsonobject.toString(2));
            a(activity, jsonobject.toString(), az1.f().b());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            ct.a("Error creating JSON response", activity);
        }
    }

    public static void a(Activity activity, az az1, ex ex1, int i)
    {
        Object obj = ct.s();
        try
        {
            JSONObject jsonobject = new JSONObject();
            jsonobject.put("tap_response_timestamp", az1.f().c());
            jsonobject.put("appId", 0);
            jsonobject.put("policyId", ((Settings) (obj)).policyID);
            jsonobject.put("protocol_version", "3.4.0.0");
            jsonobject.put("init_tapResponse_delta", ex1.b());
            jsonobject.put("pid", 0);
            jsonobject.put("session_id", az1.f().e());
            jsonobject.put("cch", az1.f().a());
            jsonobject.put("cookies", ct.f().a());
            obj = new JSONObject();
            JSONArray jsonarray = new JSONArray();
            JSONObject jsonobject1 = new JSONObject();
            jsonobject1.put("id", az1.g());
            jsonobject1.put("view", i);
            jsonobject1.put("from_cache", az1.a());
            jsonobject1.put("end_time", ex1.c());
            jsonobject1.put("placement", "");
            jsonobject1.put("billable", false);
            jsonobject1.put("events", ex1.g());
            jsonobject1.put("touches", ex1.f());
            jsonarray.put(jsonobject1);
            ((JSONObject) (obj)).put("ad", jsonarray);
            jsonobject.put("ad_info", obj);
            ct.a(ct.a.c, jsonobject.toString(2));
            a(activity, jsonobject.toString(), az1.f().b());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            ct.a("Error creating JSON response", activity);
        }
    }

    public static void a(Activity activity, fz fz1)
    {
        JSONObject jsonobject;
        JSONObject jsonobject1;
        try
        {
            Settings settings = ct.s();
            jsonobject = new JSONObject();
            jsonobject1 = new JSONObject();
            jsonobject1.put("protocol_version", "3.4.0.0");
            jsonobject1.put("pid", 0);
            jsonobject1.put("cch", ct.n());
            jsonobject1.put("appId", 0);
            jsonobject1.put("policyId", settings.policyID);
            jsonobject1.put("init_tapResponse_delta", ct.B());
            jsonobject1.put("cookies", ct.f().a());
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            ct.a("Error Sending Avail: ", activity);
            return;
        }
        if (fz1 != null)
        {
            break MISSING_BLOCK_LABEL_164;
        }
        jsonobject1.put("session_id", 0);
        jsonobject1.put("tap_response_timestamp", "");
_L2:
        jsonobject.put("avail", jsonobject1);
        ct.a(ct.a.c, jsonobject.toString(2));
        a(activity, jsonobject.toString(), ct.e());
        return;
        jsonobject1.put("session_id", fz1.e());
        jsonobject1.put("tap_response_timestamp", fz1.c());
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static void a(Activity activity, String s)
    {
        try
        {
            JSONObject jsonobject = new JSONObject();
            jsonobject.put("protocol_version", "3.4.0.0");
            jsonobject.put("cch", ct.n());
            jsonobject.put("state", s);
            jsonobject.put("timestamp", ct.a(new GregorianCalendar()));
            jsonobject.put("app", ct.m());
            jsonobject.put("app_version", ct.i());
            jsonobject.put("device_info", a(new du(activity)));
            jsonobject.put("cookies", ct.f().a());
            s = new JSONObject();
            s.put("appAnalyticsStateChange", jsonobject);
            ct.a(ct.a.c, s.toString(2));
            a(activity, s.toString(), ct.h());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            ct.a("Error Sending Custom Event: ", activity);
        }
    }

    private static void a(Activity activity, String s, String s1)
    {
        while (s1 == null || s1.equalsIgnoreCase("")) 
        {
            return;
        }
        activity.runOnUiThread(new ck(s, s1));
    }

    public static void a(Activity activity, String s, Map map)
    {
        JSONObject jsonobject;
        try
        {
            jsonobject = new JSONObject();
            String s1;
            for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); jsonobject.put(s1, map.get(s1)))
            {
                s1 = (String)iterator.next();
            }

        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            ct.a("Error Sending Custom Event: ", activity);
            return;
        }
        map = new JSONObject();
        map.put("protocol_version", "3.4.0.0");
        map.put("cch", ct.n());
        map.put("event", s);
        map.put("timestamp", ct.a(new GregorianCalendar()));
        map.put("app", ct.m());
        map.put("app_version", ct.i());
        map.put("parameters", jsonobject);
        map.put("device_info", a(new du(activity)));
        map.put("cookies", ct.f().a());
        s = new JSONObject();
        s.put("appAnalyticsCustomEvent", map);
        ct.a(ct.a.c, s.toString(2));
        a(activity, s.toString(), ct.h());
        return;
    }

    public static void a(String s)
    {
        ct.d((new StringBuilder()).append("Firing Tracking Pixel: ").append(s).toString());
        (new cl(s)).execute(new String[0]);
    }

    public static void a(String s, long l)
    {
        try
        {
            JSONObject jsonobject = new JSONObject();
            jsonobject.put("protocol_version", "3.4.0.0");
            jsonobject.put("cch", ct.n());
            jsonobject.put("timeDeltaMS", String.valueOf(l));
            jsonobject.put("startTime", s);
            jsonobject.put("app", ct.m());
            jsonobject.put("app_version", ct.i());
            jsonobject.put("device_info", a(new du(ct.u())));
            jsonobject.put("cookies", ct.f().a());
            s = new JSONObject();
            s.put("appSessionEnd", jsonobject);
            ct.a(ct.a.c, s.toString(2));
            a(s.toString(), ct.h());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            ct.a(s);
        }
    }

    private static void a(String s, String s1)
    {
        try
        {
            (new cn(s1, s)).execute(new String[0]);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            ct.a("Error sending response: ", s);
        }
    }

    static void a(HttpEntity httpentity)
    {
        b(httpentity);
    }

    public static void a(HttpPost httppost, String s)
    {
        Object obj = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
        obj = (new StringBuilder()).append("").append(((GregorianCalendar) (obj)).getTimeInMillis() / 1000L).toString();
        httppost.addHeader("mac", b((new StringBuilder()).append("a5e8fa6812cd60cfff77db9728ccfa70").append(s).append(((String) (obj))).toString()));
        httppost.addHeader("rts", ((String) (obj)));
    }

    private static String b(String s)
    {
        StringBuffer stringbuffer;
        int i;
        int j;
        try
        {
            s = MessageDigest.getInstance("MD5").digest(s.getBytes());
            stringbuffer = new StringBuffer(s.length * 2);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            ct.a(ct.a.b, "Error encoding mac.", s);
            return "";
        }
        i = 0;
        if (i >= s.length)
        {
            break; /* Loop/switch isn't completed */
        }
        j = s[i] & 0xff;
        if (j >= 16)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        stringbuffer.append('0');
        stringbuffer.append(Integer.toHexString(j));
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_28;
_L1:
        s = stringbuffer.toString().toLowerCase();
        return s;
    }

    private static void b(HttpEntity httpentity)
    {
        if (httpentity == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        BufferedInputStream bufferedinputstream;
        byte abyte0[];
        bufferedinputstream = new BufferedInputStream(httpentity.getContent());
        httpentity = new StringBuilder(Math.max(0, (int)httpentity.getContentLength()));
        abyte0 = new byte[1024];
_L1:
        int i = bufferedinputstream.read(abyte0);
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        httpentity.append(new String(abyte0, 0, i));
          goto _L1
        httpentity;
        ct.a("Error reading cookies", httpentity);
_L2:
        return;
        httpentity = httpentity.toString();
        if (httpentity.length() > 0)
        {
            ct.d(httpentity);
            httpentity = new JSONObject(httpentity);
            long l = ct.c(httpentity.getString("current-time")).getTimeInMillis();
            ct.f().a(httpentity.getJSONArray("cookies"), l);
            return;
        }
          goto _L2
    }

}
