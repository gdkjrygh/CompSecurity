// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobileapptracker;

import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Date;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.mobileapptracker:
//            MATParameters, MATEvent, MATPreloadData, MATEncryption, 
//            MATUtils

class MATUrlBuilder
{

    private static MATParameters a;

    public static String a(MATEvent matevent)
    {
        com/mobileapptracker/MATUrlBuilder;
        JVM INSTR monitorenter ;
        StringBuilder stringbuilder;
        a = MATParameters.a();
        stringbuilder = new StringBuilder();
        stringbuilder.append((new StringBuilder()).append("connection_type=").append(a.o()).toString());
        a(stringbuilder, "altitude", a.f());
        a(stringbuilder, "android_id", a.g());
        a(stringbuilder, "android_id_md5", a.h());
        a(stringbuilder, "android_id_sha1", a.i());
        a(stringbuilder, "android_id_sha256", a.j());
        a(stringbuilder, "app_ad_tracking", a.k());
        a(stringbuilder, "app_name", a.l());
        a(stringbuilder, "app_version", a.m());
        a(stringbuilder, "app_version_name", a.n());
        a(stringbuilder, "country_code", a.q());
        a(stringbuilder, "device_brand", a.s());
        a(stringbuilder, "device_carrier", a.t());
        a(stringbuilder, "device_cpu_type", a.u());
        a(stringbuilder, "device_cpu_subtype", a.v());
        a(stringbuilder, "device_model", a.x());
        a(stringbuilder, "device_id", a.w());
        a(stringbuilder, "google_aid", a.C());
        a(stringbuilder, "google_ad_tracking_disabled", a.D());
        a(stringbuilder, "insdate", a.F());
        a(stringbuilder, "installer", a.G());
        a(stringbuilder, "install_referrer", a.H());
        a(stringbuilder, "language", a.J());
        a(stringbuilder, "last_open_log_id", a.K());
        a(stringbuilder, "latitude", a.L());
        a(stringbuilder, "longitude", a.M());
        a(stringbuilder, "mac_address", a.N());
        a(stringbuilder, "mat_id", a.O());
        a(stringbuilder, "mobile_country_code", a.P());
        a(stringbuilder, "mobile_network_code", a.Q());
        a(stringbuilder, "open_log_id", a.R());
        a(stringbuilder, "os_version", a.S());
        a(stringbuilder, "sdk_plugin", a.X());
        a(stringbuilder, "android_purchase_status", a.Y());
        a(stringbuilder, "referrer_delay", a.ab());
        a(stringbuilder, "screen_density", a.ac());
        a(stringbuilder, "screen_layout_size", (new StringBuilder()).append(a.ae()).append("x").append(a.ad()).toString());
        a(stringbuilder, "sdk_version", a.af());
        a(stringbuilder, "truste_tpid", a.aj());
        a(stringbuilder, "conversion_user_agent", a.al());
        a(stringbuilder, "attribute_sub1", matevent.q());
        a(stringbuilder, "attribute_sub2", matevent.r());
        a(stringbuilder, "attribute_sub3", matevent.s());
        a(stringbuilder, "attribute_sub4", matevent.t());
        a(stringbuilder, "attribute_sub5", matevent.u());
        a(stringbuilder, "content_id", matevent.j());
        a(stringbuilder, "content_type", matevent.i());
        if (matevent.d() == null)
        {
            break MISSING_BLOCK_LABEL_1037;
        }
        a(stringbuilder, "currency_code", matevent.d());
_L1:
        if (matevent.o() != null)
        {
            a(stringbuilder, "date1", Long.toString(matevent.o().getTime() / 1000L));
        }
        if (matevent.p() != null)
        {
            a(stringbuilder, "date2", Long.toString(matevent.p().getTime() / 1000L));
        }
        if (matevent.k() != 0)
        {
            a(stringbuilder, "level", Integer.toString(matevent.k()));
        }
        if (matevent.l() != 0)
        {
            a(stringbuilder, "quantity", Integer.toString(matevent.l()));
        }
        if (matevent.n() != 0.0D)
        {
            a(stringbuilder, "rating", Double.toString(matevent.n()));
        }
        a(stringbuilder, "search_string", matevent.m());
        a(stringbuilder, "advertiser_ref_id", matevent.e());
        a(stringbuilder, "revenue", Double.toString(matevent.c()));
        if (matevent.v() != null)
        {
            a(stringbuilder, "device_form", matevent.v());
        }
        a(stringbuilder, "age", a.d());
        a(stringbuilder, "existing_user", a.z());
        a(stringbuilder, "facebook_user_id", a.A());
        a(stringbuilder, "gender", a.B());
        a(stringbuilder, "google_user_id", a.E());
        a(stringbuilder, "is_paying_user", a.I());
        a(stringbuilder, "twitter_user_id", a.ak());
        a(stringbuilder, "user_email_md5", a.am());
        a(stringbuilder, "user_email_sha1", a.an());
        a(stringbuilder, "user_email_sha256", a.ao());
        a(stringbuilder, "user_id", a.aq());
        a(stringbuilder, "user_name_md5", a.ar());
        a(stringbuilder, "user_name_sha1", a.as());
        a(stringbuilder, "user_name_sha256", a.at());
        a(stringbuilder, "user_phone_md5", a.U());
        a(stringbuilder, "user_phone_sha1", a.V());
        a(stringbuilder, "user_phone_sha256", a.W());
        matevent = stringbuilder.toString();
        com/mobileapptracker/MATUrlBuilder;
        JVM INSTR monitorexit ;
        return matevent;
        a(stringbuilder, "currency_code", a.r());
          goto _L1
        matevent;
        throw matevent;
    }

    public static String a(MATEvent matevent, MATPreloadData matpreloaddata, boolean flag)
    {
        a = MATParameters.a();
        StringBuilder stringbuilder = (new StringBuilder("https://")).append(a.c()).append(".");
        if (flag)
        {
            stringbuilder.append("debug.engine.mobileapptracking.com");
        } else
        {
            stringbuilder.append("engine.mobileapptracking.com");
        }
        stringbuilder.append("/serve?ver=").append(a.af());
        stringbuilder.append("&transaction_id=").append(UUID.randomUUID().toString());
        a(stringbuilder, "sdk", "android");
        a(stringbuilder, "action", a.b());
        a(stringbuilder, "advertiser_id", a.c());
        a(stringbuilder, "package_name", a.T());
        a(stringbuilder, "referral_source", a.Z());
        a(stringbuilder, "referral_url", a.aa());
        a(stringbuilder, "site_id", a.ag());
        a(stringbuilder, "tracking_id", a.ai());
        if (matevent.b() != 0)
        {
            a(stringbuilder, "site_event_id", Integer.toString(matevent.b()));
        }
        if (!a.b().equals("session"))
        {
            a(stringbuilder, "site_event_name", matevent.a());
        }
        if (matpreloaddata != null)
        {
            stringbuilder.append("&attr_set=1");
            a(stringbuilder, "publisher_id", matpreloaddata.a);
            a(stringbuilder, "offer_id", matpreloaddata.b);
            a(stringbuilder, "agency_id", matpreloaddata.c);
            a(stringbuilder, "publisher_ref_id", matpreloaddata.d);
            a(stringbuilder, "publisher_sub_publisher", matpreloaddata.n);
            a(stringbuilder, "publisher_sub_site", matpreloaddata.o);
            a(stringbuilder, "publisher_sub_campaign", matpreloaddata.l);
            a(stringbuilder, "publisher_sub_adgroup", matpreloaddata.k);
            a(stringbuilder, "publisher_sub_ad", matpreloaddata.j);
            a(stringbuilder, "publisher_sub_keyword", matpreloaddata.m);
            a(stringbuilder, "advertiser_sub_publisher", matpreloaddata.t);
            a(stringbuilder, "advertiser_sub_site", matpreloaddata.u);
            a(stringbuilder, "advertiser_sub_campaign", matpreloaddata.r);
            a(stringbuilder, "advertiser_sub_adgroup", matpreloaddata.q);
            a(stringbuilder, "advertiser_sub_ad", matpreloaddata.p);
            a(stringbuilder, "advertiser_sub_keyword", matpreloaddata.s);
            a(stringbuilder, "publisher_sub1", matpreloaddata.e);
            a(stringbuilder, "publisher_sub2", matpreloaddata.f);
            a(stringbuilder, "publisher_sub3", matpreloaddata.g);
            a(stringbuilder, "publisher_sub4", matpreloaddata.h);
            a(stringbuilder, "publisher_sub5", matpreloaddata.i);
        }
        matevent = a.e();
        if (matevent != null && Integer.parseInt(matevent) == 1)
        {
            stringbuilder.append("&skip_dup=1");
        }
        if (flag)
        {
            stringbuilder.append("&debug=1");
        }
        return stringbuilder.toString();
    }

    public static String a(String s, MATEncryption matencryption)
    {
        com/mobileapptracker/MATUrlBuilder;
        JVM INSTR monitorenter ;
        StringBuilder stringbuilder;
        String s1;
        stringbuilder = new StringBuilder(s);
        a = MATParameters.a();
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_177;
        }
        s1 = a.C();
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        if (!s.contains("&google_aid="))
        {
            a(stringbuilder, "google_aid", s1);
            a(stringbuilder, "google_ad_tracking_disabled", a.D());
        }
        s1 = a.g();
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        if (!s.contains("&android_id="))
        {
            a(stringbuilder, "android_id", s1);
        }
        s1 = a.H();
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        if (!s.contains("&install_referrer="))
        {
            a(stringbuilder, "install_referrer", s1);
        }
        s1 = a.al();
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_148;
        }
        if (!s.contains("&conversion_user_agent="))
        {
            a(stringbuilder, "conversion_user_agent", s1);
        }
        s1 = a.A();
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_177;
        }
        if (!s.contains("&facebook_user_id="))
        {
            a(stringbuilder, "facebook_user_id", s1);
        }
        if (!s.contains("&system_date="))
        {
            a(stringbuilder, "system_date", Long.toString((new Date()).getTime() / 1000L));
        }
        s = stringbuilder.toString();
        matencryption = MATUtils.a(matencryption.a(s));
        s = matencryption;
_L2:
        com/mobileapptracker/MATUrlBuilder;
        JVM INSTR monitorexit ;
        return s;
        matencryption;
        matencryption.printStackTrace();
        if (true) goto _L2; else goto _L1
_L1:
        s;
        throw s;
    }

    public static JSONObject a(JSONArray jsonarray, String s, String s1, JSONArray jsonarray1)
    {
        com/mobileapptracker/MATUrlBuilder;
        JVM INSTR monitorenter ;
        JSONObject jsonobject = new JSONObject();
        if (jsonarray == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        jsonobject.put("data", jsonarray);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        jsonobject.put("store_iap_data", s);
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        jsonobject.put("store_iap_signature", s1);
        if (jsonarray1 == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        jsonobject.put("user_emails", jsonarray1);
_L2:
        com/mobileapptracker/MATUrlBuilder;
        JVM INSTR monitorexit ;
        return jsonobject;
        jsonarray;
        Log.d("MobileAppTracker", "Could not build JSON body of request");
        jsonarray.printStackTrace();
        if (true) goto _L2; else goto _L1
_L1:
        jsonarray;
        throw jsonarray;
    }

    private static void a(StringBuilder stringbuilder, String s, String s1)
    {
        com/mobileapptracker/MATUrlBuilder;
        JVM INSTR monitorenter ;
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        boolean flag = s1.equals("");
        if (flag)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        stringbuilder.append((new StringBuilder()).append("&").append(s).append("=").append(URLEncoder.encode(s1, "UTF-8")).toString());
_L2:
        com/mobileapptracker/MATUrlBuilder;
        JVM INSTR monitorexit ;
        return;
        stringbuilder;
        Log.w("MobileAppTracker", (new StringBuilder()).append("failed encoding value ").append(s1).append(" for key ").append(s).toString());
        stringbuilder.printStackTrace();
        if (true) goto _L2; else goto _L1
_L1:
        stringbuilder;
        throw stringbuilder;
    }
}
