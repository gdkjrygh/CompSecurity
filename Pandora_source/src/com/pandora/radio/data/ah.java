// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.data;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.SparseArray;
import com.pandora.radio.util.i;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p.cw.c;
import p.dd.an;
import p.dd.bo;
import p.dd.bq;
import p.df.a;

// Referenced classes of package com.pandora.radio.data:
//            ag, e, aj, ae, 
//            ai, o, n, af

public class ah
    implements ag
{
    private static class a
    {

        private static final SparseArray a = new SparseArray(7);

        static String a(int i1)
        {
            return b(i1);
        }

        static void a()
        {
            b();
        }

        private static String b(int i1)
        {
            com/pandora/radio/data/ah$a;
            JVM INSTR monitorenter ;
            String s2 = (String)a.get(i1);
            String s1;
            s1 = s2;
            if (s2 != null)
            {
                break MISSING_BLOCK_LABEL_45;
            }
            s1 = String.format("number_of_clicks_for_tab_%s", new Object[] {
                Integer.valueOf(i1)
            });
            a.put(i1, s1);
            com/pandora/radio/data/ah$a;
            JVM INSTR monitorexit ;
            return s1;
            Exception exception;
            exception;
            throw exception;
        }

        private static void b()
        {
            a.clear();
        }

    }


    private c a;
    private final SharedPreferences b;
    private af c;

    public ah(c c1)
    {
        a = c1;
        b = c1.s().getSharedPreferences("UserPrefs", 0);
        Y();
        Z();
        c1.b(this);
    }

    private void Y()
    {
        SharedPreferences sharedpreferences = a.s().getSharedPreferences("PandoraPrefs", 0);
        android.content.SharedPreferences.Editor editor = b.edit();
        if (sharedpreferences != null)
        {
            com.pandora.radio.util.i.a(editor, sharedpreferences, "is_update_prompt_enabled", false);
            com.pandora.radio.util.i.a(editor, sharedpreferences, "is_update_prompt_notification_displayed", false);
            com.pandora.radio.util.i.a(editor, sharedpreferences, "update_prompt_version_amazon", null);
            com.pandora.radio.util.i.a(editor, sharedpreferences, "update_prompt_version_google", null);
            com.pandora.radio.util.i.a(editor, sharedpreferences, "last_shared_to_twitter", false);
            com.pandora.radio.util.i.a(editor, sharedpreferences, "last_shared_to_faceboook", false);
            com.pandora.radio.util.i.a(editor, sharedpreferences, "twitter_access_token", null);
            com.pandora.radio.util.i.a(editor, sharedpreferences, "twitter_access_token_secret", null);
            com.pandora.radio.util.i.a(editor, sharedpreferences, "send_report_for_tab_clicks", false);
            com.pandora.radio.util.i.a(editor, sharedpreferences, "video_last_played_time", 0L);
            com.pandora.radio.util.i.a(editor, sharedpreferences, "user_login_response", null);
            com.pandora.radio.util.i.a(editor, sharedpreferences, "partner_login_response", null);
            com.pandora.radio.util.i.a(editor, sharedpreferences, "blueBarEventInfo_blueBarKey", null);
            com.pandora.radio.util.i.a(editor, sharedpreferences, "blueBarEventInfo_blueBarEvent", null);
            com.pandora.radio.util.i.a(editor, sharedpreferences, "blueBarEventInfo_blueBarEventTime", 0L);
            com.pandora.radio.util.i.a(editor, sharedpreferences, "userSettingsData_gender", null);
            com.pandora.radio.util.i.a(editor, sharedpreferences, "userSettingsData_birthYear", 0);
            com.pandora.radio.util.i.a(editor, sharedpreferences, "userSettingsData_zipCode", null);
            com.pandora.radio.util.i.a(editor, sharedpreferences, "userSettingsData_isProfilePrivate", true);
            com.pandora.radio.util.i.a(editor, sharedpreferences, "userSettingsData_enableComments", false);
            com.pandora.radio.util.i.a(editor, sharedpreferences, "userSettingsData_pushNotificationDeviceOptIn", true);
            com.pandora.radio.util.i.a(editor, sharedpreferences, "userSettingsData_emailOptInPandora", false);
            com.pandora.radio.util.i.a(editor, sharedpreferences, "userSettingsData_pushOptInPandora", true);
            com.pandora.radio.util.i.a(editor, sharedpreferences, "userSettingsData_emailOptInListeners", false);
            com.pandora.radio.util.i.a(editor, sharedpreferences, "userSettingsData_pushOptInListeners", true);
            com.pandora.radio.util.i.a(editor, sharedpreferences, "userSettingsData_isExplicitContentFilterEnabled", false);
            com.pandora.radio.util.i.a(editor, sharedpreferences, "userSettingsData_isExplicitContentFilterPINProtected", false);
            com.pandora.radio.util.i.a(editor, sharedpreferences, "userSettingsData_facebookAutoShareEnabled", false);
            com.pandora.radio.util.i.a(editor, sharedpreferences, "userSettingsData_autoShareTrackPlay", false);
            com.pandora.radio.util.i.a(editor, sharedpreferences, "userSettingsData_autoShareLikes", false);
            com.pandora.radio.util.i.a(editor, sharedpreferences, "userSettingsData_autoShareFollows", false);
            com.pandora.radio.util.i.a(editor, sharedpreferences, "userSettingsData_facebookSettingChecksum", null);
            com.pandora.radio.util.i.a(editor, sharedpreferences, "isCapped", false);
            com.pandora.radio.util.i.a(editor, sharedpreferences, "isMonthlyPayer", false);
            com.pandora.radio.util.i.a(editor, sharedpreferences, "accountMonthlyListening", 0);
            com.pandora.radio.util.i.a(editor, sharedpreferences, "deviceMonthlyListening", 0);
            com.pandora.radio.util.i.a(editor, sharedpreferences, "monthlyCapHours", 0);
            com.pandora.radio.util.i.a(editor, sharedpreferences, "monthlyCapWarningPercent", 0);
            com.pandora.radio.util.i.a(editor, sharedpreferences, "monthlyCapWarningRepeatPercent", 0);
            com.pandora.radio.util.i.a(editor, sharedpreferences, "listeningTimestamp", 0L);
        }
        editor.apply();
    }

    private void Z()
    {
        SharedPreferences sharedpreferences = PreferenceManager.getDefaultSharedPreferences(a.s());
        android.content.SharedPreferences.Editor editor = b.edit();
        com.pandora.radio.util.i.a(editor, sharedpreferences, "com.pandora.android.gcm.RegistrationManager.REGISTERED_APP_VERSION", 0x80000000);
        editor.apply();
    }

    private String b(String s1, String s2)
    {
        return (new StringBuilder()).append(s1).append(s2).toString();
    }

    public boolean A()
    {
        return b.getBoolean("pebbleDisableAutoLaunch", false);
    }

    public long B()
    {
        return b.getLong("user_registration_time", -1L);
    }

    public boolean C()
    {
        boolean flag = false;
        if (!D())
        {
            flag = b.getBoolean("willShowCastingCoachMark", false);
        }
        return flag;
    }

    public boolean D()
    {
        long l1 = B();
        if (l1 != -1L)
        {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(l1);
            calendar.add(6, 1);
            if (!Calendar.getInstance().after(calendar))
            {
                return true;
            }
        }
        return false;
    }

    public boolean E()
    {
        return b.getBoolean("enable_artistmessage_survey", false);
    }

    public boolean F()
    {
        return b.getBoolean("artistmessage_survey_shown", false);
    }

    public String G()
    {
        return b.getString("whyAdsBannerText", null);
    }

    public e H()
    {
        return new e(b.getString("chromecastSessionId", null), b.getString("chromecastRouteName", null), b.getString("chromecastRouteId", null), b.getLong("chromecastLastUpdated", 0L), b.getBoolean("chromecastIsRadioWaiting", false));
    }

    public void I()
    {
        android.content.SharedPreferences.Editor editor = b.edit();
        editor.remove("chromecastSessionId");
        editor.remove("chromecastRouteId");
        editor.remove("chromecastRouteName");
        editor.remove("chromecastLastUpdated");
        editor.apply();
    }

    public aj J()
    {
        Object obj;
        obj = b.getString("valueExchangeOffer", null);
        if (com.pandora.radio.util.i.a(((String) (obj))))
        {
            return null;
        }
        obj = new aj(new JSONObject(((String) (obj))), K());
        if (((aj) (obj)).d() > 0L)
        {
            return ((aj) (obj));
        }
        try
        {
            b.edit().remove("valueExchangeOffer").apply();
            b.edit().remove("valueExchangeAdCorrelationId").apply();
        }
        catch (JSONException jsonexception)
        {
            p.df.a.b("UserPrefsImpl", "error parsing ValueExchangeRewardData", jsonexception);
            return null;
        }
        return null;
    }

    public String K()
    {
        return b.getString("valueExchangeAdCorrelationId", "");
    }

    public void L()
    {
        a.c(this);
    }

    public boolean M()
    {
        return b.getBoolean("is_media_store_permission_dialog_displayed", false);
    }

    public boolean N()
    {
        return b.getBoolean("user_allows_media_library_collection", false);
    }

    public boolean O()
    {
        return b.getBoolean("media_library_collected", false);
    }

    public String P()
    {
        return b.getString("testArtistMessage", null);
    }

    public long Q()
    {
        return b.getLong("lastPollTime", 0L);
    }

    public void R()
    {
        b.edit().remove("lastPollTime").apply();
    }

    public long S()
    {
        return b.getLong("lastGoogleNowCheckTime", 0L);
    }

    public String T()
    {
        return b.getString("testFeaturedTrack", null);
    }

    public long U()
    {
        return b.getLong("last_open_backstage_time", -1L);
    }

    public JSONArray V()
    {
        Object obj = b.getString("aLaCarteActiveyBenefits", null);
        if (com.pandora.radio.util.i.a(((String) (obj))))
        {
            return null;
        }
        try
        {
            obj = new JSONArray(((String) (obj)));
        }
        catch (JSONException jsonexception)
        {
            p.df.a.b("UserPrefsImpl", "error parsing A_LA_CARTE_ACTIVE_BENEFITS", jsonexception);
            jsonexception = null;
        }
        return ((JSONArray) (obj));
    }

    public JSONObject W()
    {
        Object obj = b.getString("aLaCarteBenefitCoachmarkPending", null);
        if (com.pandora.radio.util.i.a(((String) (obj))))
        {
            return null;
        }
        try
        {
            obj = new JSONObject(((String) (obj)));
        }
        catch (JSONException jsonexception)
        {
            p.df.a.b("UserPrefsImpl", "error parsing A_LA_CARTE_ACTIVE_BENEFITS", jsonexception);
            jsonexception = null;
        }
        return ((JSONObject) (obj));
    }

    void X()
    {
        p.df.a.c("UserPrefsImpl", "clearUserPreferences");
        b.edit().clear().apply();
        com.pandora.radio.data.a.a();
    }

    public void a(int i1)
    {
        int j1 = b(i1);
        b.edit().putInt(com.pandora.radio.data.a.a(i1), j1 + 1).apply();
    }

    public void a(long l1)
    {
        b.edit().putLong("video_last_played_time", l1).apply();
    }

    public void a(ae ae1)
    {
        android.content.SharedPreferences.Editor editor = b.edit();
        editor.putBoolean("isCapped", ae1.f());
        editor.putBoolean("isMonthlyPayer", ae1.g());
        editor.putInt("accountMonthlyListening", ae1.a());
        editor.putInt("deviceMonthlyListening", ae1.b());
        editor.putInt("monthlyCapHours", ae1.c());
        editor.putInt("monthlyCapWarningPercent", ae1.d());
        editor.putInt("monthlyCapWarningRepeatPercent", ae1.e());
        editor.putLong("listeningTimestamp", ae1.h());
        editor.apply();
    }

    public void a(ai ai1)
    {
        boolean flag1 = true;
        android.content.SharedPreferences.Editor editor = b.edit();
        editor.putString("userSettingsData_gender", ai1.b());
        editor.putInt("userSettingsData_birthYear", ai1.c());
        editor.putString("userSettingsData_zipCode", ai1.d());
        boolean flag;
        if (!ai1.e())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        editor.putBoolean("userSettingsData_isProfilePrivate", flag);
        editor.putBoolean("userSettingsData_enableComments", ai1.f());
        editor.putBoolean("userSettingsData_pushNotificationDeviceOptIn", ai1.g());
        editor.putBoolean("userSettingsData_emailOptInPandora", ai1.h());
        editor.putBoolean("userSettingsData_pushOptInPandora", ai1.i());
        editor.putBoolean("userSettingsData_emailOptInListeners", ai1.j());
        editor.putBoolean("userSettingsData_pushOptInListeners", ai1.k());
        if (!ai1.n())
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        editor.putBoolean("userSettingsData_isExplicitContentFilterEnabled", flag);
        editor.putBoolean("userSettingsData_isExplicitContentFilterPINProtected", ai1.o());
        editor.putBoolean("userSettingsData_facebookAutoShareEnabled", ai1.p());
        editor.putBoolean("userSettingsData_autoShareTrackPlay", ai1.q());
        editor.putBoolean("userSettingsData_autoShareLikes", ai1.r());
        editor.putBoolean("userSettingsData_autoShareFollows", ai1.s());
        editor.putString("userSettingsData_facebookSettingChecksum", ai1.t());
        editor.putString("userSettingsData_artistAudioMessagesEnabled", ai1.v().e);
        editor.putString("userSettingsData_emailOptInArtists", ai1.w().e);
        editor.apply();
        a.j().q();
    }

    public void a(aj aj1)
    {
        if (aj1 == null)
        {
            b.edit().remove("valueExchangeOffer").apply();
        } else
        {
            b.edit().putString("valueExchangeOffer", aj1.h()).apply();
        }
        a.a(new bq(aj1));
    }

    public void a(e e1)
    {
        android.content.SharedPreferences.Editor editor = b.edit();
        editor.putString("chromecastSessionId", e1.c());
        editor.putString("chromecastRouteId", e1.a());
        editor.putString("chromecastRouteName", e1.b());
        editor.putLong("chromecastLastUpdated", e1.d());
        editor.putBoolean("chromecastIsRadioWaiting", e1.e());
        editor.apply();
    }

    public void a(n n1)
    {
        try
        {
            JSONArray jsonarray = new JSONArray(b.getString("notificationTrackingData", "[]"));
            jsonarray.put(n1.d());
            b.edit().putString("notificationTrackingData", jsonarray.toString()).apply();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (n n1)
        {
            p.df.a.c("UserPrefsImpl", "putNotificationTracking: error creating JSONArray", n1);
        }
    }

    public void a(String s1)
    {
        b.edit().putString("update_prompt_version_amazon", s1).apply();
    }

    public void a(String s1, int i1)
    {
        android.content.SharedPreferences.Editor editor = b.edit();
        editor.putInt("com.pandora.android.gcm.RegistrationManager.REGISTERED_APP_VERSION", i1);
        editor.putString("gcmRegistrationId", s1);
        editor.apply();
    }

    public void a(String s1, String s2)
    {
        android.content.SharedPreferences.Editor editor = b.edit();
        editor.putString("twitter_access_token", s1).apply();
        editor.putString("twitter_access_token_secret", s2).apply();
    }

    public void a(JSONArray jsonarray)
    {
        if (jsonarray == null)
        {
            b.edit().remove("aLaCarteActiveyBenefits").apply();
            return;
        } else
        {
            b.edit().putString("aLaCarteActiveyBenefits", jsonarray.toString()).apply();
            return;
        }
    }

    public void a(JSONObject jsonobject)
    {
        if (jsonobject == null)
        {
            b.edit().remove("aLaCarteBenefitCoachmarkPending").apply();
            return;
        } else
        {
            b.edit().putString("aLaCarteBenefitCoachmarkPending", jsonobject.toString()).apply();
            return;
        }
    }

    public void a(boolean flag)
    {
        b.edit().putBoolean("is_update_prompt_enabled", flag).apply();
    }

    public void a(boolean flag, boolean flag1)
    {
        android.content.SharedPreferences.Editor editor = b.edit();
        editor.putBoolean("last_shared_to_faceboook", flag).apply();
        editor.putBoolean("last_shared_to_twitter", flag1).apply();
    }

    public boolean a()
    {
        return b.getBoolean("is_update_prompt_enabled", false);
    }

    public int b(int i1)
    {
        return b.getInt(com.pandora.radio.data.a.a(i1), 0);
    }

    public void b(long l1)
    {
        b.edit().putLong("user_registration_time", l1).apply();
    }

    public void b(String s1)
    {
        b.edit().putString("update_prompt_version_google", s1).apply();
    }

    public void b(boolean flag)
    {
        b.edit().putBoolean("is_update_prompt_notification_displayed", flag).apply();
    }

    public boolean b()
    {
        return b.getBoolean("is_update_prompt_notification_displayed", false);
    }

    public void c(int i1)
    {
        b.edit().remove(com.pandora.radio.data.a.a(i1)).apply();
    }

    public void c(long l1)
    {
        b.edit().putLong("lastPollTime", l1).apply();
    }

    public void c(String s1)
    {
        b.edit().putString("user_login_response", s1).apply();
    }

    public void c(boolean flag)
    {
        android.content.SharedPreferences.Editor editor = b.edit();
        editor.putBoolean("pebbleWatchCheckOccurred", flag);
        editor.apply();
    }

    public boolean c()
    {
        return b.getBoolean("last_shared_to_faceboook", false);
    }

    public void d(long l1)
    {
        b.edit().putLong("lastGoogleNowCheckTime", l1).apply();
    }

    public void d(String s1)
    {
        b.edit().putString("partner_login_response", s1).apply();
    }

    public void d(boolean flag)
    {
        android.content.SharedPreferences.Editor editor = b.edit();
        editor.putBoolean("pebbleDisableAutoLaunch", flag);
        editor.apply();
    }

    public boolean d()
    {
        return b.getBoolean("last_shared_to_twitter", false);
    }

    public void e()
    {
        android.content.SharedPreferences.Editor editor = b.edit();
        editor.remove("twitter_access_token").apply();
        editor.remove("twitter_access_token_secret").apply();
    }

    public void e(long l1)
    {
        b.edit().putLong("last_open_backstage_time", l1).apply();
    }

    public void e(String s1)
    {
        b.edit().putString("user_id", s1).apply();
    }

    public void e(boolean flag)
    {
        b.edit().putBoolean("willShowCastingCoachMark", flag).apply();
    }

    public String f()
    {
        return b.getString("twitter_access_token", null);
    }

    public void f(String s1)
    {
        b.edit().putLong(b("coachmark_shown", s1), System.currentTimeMillis()).apply();
    }

    public void f(boolean flag)
    {
        b.edit().putBoolean("enable_artistmessage_survey", flag).apply();
    }

    public long g(String s1)
    {
        return b.getLong(b("coachmark_shown", s1), 0L);
    }

    public String g()
    {
        return b.getString("twitter_access_token_secret", null);
    }

    public void g(boolean flag)
    {
        b.edit().putBoolean("artistmessage_survey_shown", flag).apply();
    }

    public void h()
    {
        b.edit().putBoolean("send_report_for_tab_clicks", true).apply();
    }

    public void h(String s1)
    {
        android.content.SharedPreferences.Editor editor = b.edit();
        editor.putString("whyAdsBannerText", s1);
        editor.apply();
    }

    public void h(boolean flag)
    {
        b.edit().putBoolean("is_media_store_permission_dialog_displayed", flag).apply();
    }

    public void i(String s1)
    {
        android.content.SharedPreferences.Editor editor = b.edit();
        editor.putString("dismissAdText", s1);
        editor.apply();
    }

    public void i(boolean flag)
    {
        b.edit().putBoolean("user_allows_media_library_collection", flag).apply();
    }

    public boolean i()
    {
        return b.getBoolean("send_report_for_tab_clicks", false);
    }

    public void j()
    {
        b.edit().remove("send_report_for_tab_clicks").apply();
    }

    public void j(String s1)
    {
        b.edit().putString("valueExchangeAdCorrelationId", s1).apply();
    }

    public void j(boolean flag)
    {
        b.edit().putBoolean("media_library_collected", flag).apply();
    }

    public String k()
    {
        return b.getString("gcmRegistrationId", null);
    }

    public void k(String s1)
    {
        b.edit().putString("testArtistMessage", s1).apply();
    }

    public int l()
    {
        return b.getInt("com.pandora.android.gcm.RegistrationManager.REGISTERED_APP_VERSION", 0x80000000);
    }

    public void l(String s1)
    {
        b.edit().putString("testFeaturedTrack", s1).apply();
    }

    public List m()
    {
        ArrayList arraylist;
        JSONArray jsonarray;
        jsonarray = new JSONArray(b.getString("notificationTrackingData", "[]"));
        arraylist = new ArrayList();
        int i1 = 0;
_L2:
        Object obj = arraylist;
        if (i1 >= jsonarray.length())
        {
            break; /* Loop/switch isn't completed */
        }
        arraylist.add(new n(jsonarray.getJSONObject(i1)));
        i1++;
        if (true) goto _L2; else goto _L1
        obj;
        p.df.a.c("UserPrefsImpl", "getNotificationTracking: error creating NotificationTrackingData list", ((Throwable) (obj)));
        obj = null;
_L1:
        return ((List) (obj));
    }

    public void m(String s1)
    {
        b.edit().remove(b("coachmark_shown", s1)).apply();
    }

    public boolean n()
    {
        return b.contains("notificationTrackingData");
    }

    public void o()
    {
        b.edit().remove("notificationTrackingData").apply();
    }

    public void onSignInState(an an1)
    {
        c = an1.a;
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[p.cx.e.a.values().length];
                try
                {
                    a[p.cx.e.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[p.cx.e.a.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[p.cx.e.a.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[p.cx.e.a.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (com.pandora.radio.data._cls1.a[an1.b.ordinal()])
        {
        default:
            throw new InvalidParameterException((new StringBuilder()).append("onSignInState called with unknown signInState: ").append(an1.b).toString());

        case 4: // '\004'
            X();
            // fall through

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            return;
        }
    }

    public void onUserData(bo bo1)
    {
        c = bo1.a;
    }

    public long p()
    {
        return b.getLong("video_last_played_time", 0L);
    }

    public bq produceValueExchangeRewardRadioEvent()
    {
        return new bq(J());
    }

    public String q()
    {
        return b.getString("user_login_response", null);
    }

    public String r()
    {
        return b.getString("partner_login_response", null);
    }

    public String s()
    {
        return b.getString("user_id", null);
    }

    public ai t()
    {
        Object obj = b;
        ai.b b1 = ai.b(((SharedPreferences) (obj)).getString("userSettingsData_gender", ""));
        int i1 = ((SharedPreferences) (obj)).getInt("userSettingsData_birthYear", 0);
        String s1 = ((SharedPreferences) (obj)).getString("userSettingsData_zipCode", "");
        String s2;
        ai.a a1;
        ai.a a2;
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        boolean flag5;
        boolean flag6;
        boolean flag7;
        boolean flag8;
        boolean flag9;
        boolean flag10;
        boolean flag11;
        boolean flag12;
        if (!((SharedPreferences) (obj)).getBoolean("userSettingsData_isProfilePrivate", true))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag2 = ((SharedPreferences) (obj)).getBoolean("userSettingsData_enableComments", false);
        flag3 = ((SharedPreferences) (obj)).getBoolean("userSettingsData_pushNotificationDeviceOptIn", true);
        flag4 = ((SharedPreferences) (obj)).getBoolean("userSettingsData_emailOptInPandora", false);
        flag5 = ((SharedPreferences) (obj)).getBoolean("userSettingsData_pushOptInPandora", true);
        flag6 = ((SharedPreferences) (obj)).getBoolean("userSettingsData_emailOptInListeners", false);
        flag7 = ((SharedPreferences) (obj)).getBoolean("userSettingsData_pushOptInListeners", true);
        if (!((SharedPreferences) (obj)).getBoolean("userSettingsData_isExplicitContentFilterEnabled", false))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        flag8 = ((SharedPreferences) (obj)).getBoolean("userSettingsData_isExplicitContentFilterPINProtected", false);
        flag9 = ((SharedPreferences) (obj)).getBoolean("userSettingsData_facebookAutoShareEnabled", false);
        flag10 = ((SharedPreferences) (obj)).getBoolean("userSettingsData_autoShareTrackPlay", false);
        flag11 = ((SharedPreferences) (obj)).getBoolean("userSettingsData_autoShareLikes", false);
        flag12 = ((SharedPreferences) (obj)).getBoolean("userSettingsData_autoShareFollows", false);
        s2 = ((SharedPreferences) (obj)).getString("userSettingsData_facebookSettingChecksum", null);
        a1 = com.pandora.radio.data.ai.a.a(((SharedPreferences) (obj)).getString("userSettingsData_artistAudioMessagesEnabled", com.pandora.radio.data.ai.a.a.e));
        a2 = com.pandora.radio.data.ai.a.a(((SharedPreferences) (obj)).getString("userSettingsData_emailOptInArtists", com.pandora.radio.data.ai.a.a.e));
        if (c == null)
        {
            obj = null;
        } else
        {
            obj = c.c();
        }
        return new ai(b1, i1, s1, flag, flag2, flag3, flag4, flag5, flag6, flag7, ((String) (obj)), null, flag1, flag8, flag9, flag10, flag11, flag12, s2, false, a1, a2);
    }

    public void u()
    {
        android.content.SharedPreferences.Editor editor = b.edit();
        editor.remove("userSettingsData_facebookAutoShareEnabled");
        editor.remove("userSettingsData_autoShareTrackPlay");
        editor.remove("userSettingsData_autoShareLikes");
        editor.remove("userSettingsData_autoShareFollows");
        editor.remove("userSettingsData_facebookSettingChecksum");
        editor.apply();
    }

    public boolean v()
    {
        return b.getBoolean("userSettingsData_facebookAutoShareEnabled", false);
    }

    public String w()
    {
        return b.getString("userSettingsData_facebookSettingChecksum", null);
    }

    public boolean x()
    {
        return !b.getBoolean("userSettingsData_isProfilePrivate", true);
    }

    public ae y()
    {
        boolean flag = b.getBoolean("isCapped", false);
        boolean flag1 = b.getBoolean("isMonthlyPayer", false);
        return new ae(b.getInt("accountMonthlyListening", 0), b.getInt("deviceMonthlyListening", 0), b.getInt("monthlyCapHours", 0), b.getInt("monthlyCapWarningPercent", 0), b.getInt("monthlyCapWarningRepeatPercent", 10), flag1, flag, b.getLong("listeningTimestamp", 0L));
    }

    public boolean z()
    {
        return b.getBoolean("pebbleWatchCheckOccurred", false);
    }
}
