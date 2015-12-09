// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.preference.EditTextPreference;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceManager;
import android.preference.PreferenceScreen;
import android.preference.SwitchPreference;
import android.provider.SearchRecentSuggestions;
import android.view.MenuItem;
import com.cardinalblue.android.b.i;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.auth.PicAuth;
import com.cardinalblue.android.piccollage.auth.a.a;
import com.cardinalblue.android.piccollage.auth.a.c;
import com.cardinalblue.android.piccollage.auth.a.d;
import com.cardinalblue.android.piccollage.auth.a.e;
import com.cardinalblue.android.piccollage.auth.a.f;
import com.cardinalblue.android.piccollage.controller.RatingNotifierManager;
import com.cardinalblue.android.piccollage.controller.o;
import com.cardinalblue.android.piccollage.lib.b;
import com.cardinalblue.android.piccollage.model.gson.PICDeviceConfig;
import com.cardinalblue.android.piccollage.model.gson.PicUser;
import com.facebook.AccessToken;
import com.flurry.android.FlurryAgent;
import java.util.HashSet;
import java.util.Locale;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            HomeActivity

public class ConfigDebugActivity extends PreferenceActivity
    implements android.preference.Preference.OnPreferenceChangeListener
{

    public ConfigDebugActivity()
    {
    }

    private StringBuilder a(StringBuilder stringbuilder, String s, Object obj)
    {
        return stringbuilder.append(s).append(" = ").append(obj).append(";\n\n");
    }

    private void a()
    {
        o.a().m();
        k.a(this, 0x7f070316, 0);
    }

    private void a(String s)
    {
        Object obj = (EditTextPreference)findPreference("pref_key_target_authority");
        if (obj != null)
        {
            ((EditTextPreference) (obj)).setText(s);
            ((EditTextPreference) (obj)).setSummary(s);
        }
        obj = (ListPreference)findPreference("pref_key_cb_authority_list");
        if (obj != null)
        {
            ((ListPreference) (obj)).setValue(s);
        }
    }

    private void a(String s, boolean flag)
    {
        s = findPreference(s);
        if (s != null)
        {
            s.setDefaultValue(Boolean.valueOf(flag));
            s.setOnPreferenceChangeListener(this);
        }
    }

    private void a(boolean flag)
    {
        (new d()).a();
        (new a()).a();
        (new f()).a();
        (new e()).a();
        (new c()).a();
        (new SearchRecentSuggestions(this, "com.cardinalblue.piccollage.google.suggestionprovider", 1)).clearHistory();
        o.a().l();
        com.cardinalblue.android.piccollage.controller.a.a().g();
        com.cardinalblue.android.piccollage.controller.network.f.d();
        RatingNotifierManager.a().b();
        ((b)com.cardinalblue.android.a.a.a(com/cardinalblue/android/piccollage/lib/b)).b();
        if (flag)
        {
            com.cardinalblue.android.b.d.a(false);
        }
        k.j().edit().clear().apply();
        com.cardinalblue.android.piccollage.activities.HomeActivity.a(this);
        Object obj = (EditTextPreference)findPreference("pref_key_target_authority");
        ((EditTextPreference) (obj)).setText(com.cardinalblue.android.piccollage.controller.network.f.c());
        ((EditTextPreference) (obj)).setSummary(com.cardinalblue.android.piccollage.controller.network.f.c());
        obj = (SwitchPreference)findPreference("pref_key_ads_test_mode");
        if (obj != null)
        {
            ((SwitchPreference) (obj)).setDefaultValue(Boolean.valueOf(com.cardinalblue.android.b.d.e()));
        }
        k.a(this, 0x7f070317, 0);
    }

    private void b()
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
        String s = c();
        builder.setTitle("App Settings");
        builder.setMessage(s);
        builder.setNegativeButton("Send", new android.content.DialogInterface.OnClickListener(s) {

            final String a;
            final ConfigDebugActivity b;

            public void onClick(DialogInterface dialoginterface, int j)
            {
                dialoginterface = new Intent();
                dialoginterface.setAction("android.intent.action.SEND");
                dialoginterface.putExtra("android.intent.extra.TEXT", a);
                dialoginterface.setType("text/plain");
                b.startActivity(dialoginterface);
            }

            
            {
                b = ConfigDebugActivity.this;
                a = s;
                super();
            }
        });
        builder.setPositiveButton(0x104000a, null);
        k.b(this, builder.create());
    }

    private String c()
    {
        SharedPreferences sharedpreferences = k.j();
        StringBuilder stringbuilder = new StringBuilder();
        a(stringbuilder, "Target base url", com.cardinalblue.android.piccollage.controller.network.f.b());
        a(stringbuilder, "Target api url", com.cardinalblue.android.piccollage.controller.network.f.a());
        Object obj1 = PicAuth.h();
        Object obj;
        if (((PicAuth) (obj1)).b())
        {
            obj = ((PicAuth) (obj1)).d();
        } else
        {
            obj = "";
        }
        a(stringbuilder, "PC token", obj);
        if (((PicAuth) (obj1)).b())
        {
            obj = ((PicAuth) (obj1)).i().toJSONString();
        } else
        {
            obj = "";
        }
        a(stringbuilder, "PC user", obj);
        a(stringbuilder, "OS", com.cardinalblue.android.b.c.a());
        a(stringbuilder, "OS version", com.cardinalblue.android.b.c.b());
        a(stringbuilder, "Device model", com.cardinalblue.android.b.c.c());
        a(stringbuilder, "Full identifier", (new StringBuilder()).append("{").append(com.cardinalblue.android.b.c.c(this)).append("}").toString());
        a(stringbuilder, "Density", Float.valueOf(com.cardinalblue.android.b.c.d(this)));
        a(stringbuilder, "Screen size", (new StringBuilder()).append(k.c()).append("x").append(k.d()).toString());
        a(stringbuilder, "Internet connection", Boolean.valueOf(k.b(this)));
        a(stringbuilder, "Flurry API key", k.q());
        a(stringbuilder, "Flurry Version", Integer.valueOf(FlurryAgent.getAgentVersion()));
        a(stringbuilder, "Max photos per collage", Integer.valueOf(30));
        a(stringbuilder, "GCM sender ID", "773876082784");
        a(stringbuilder, "Contact email", "support@pic-collage.com");
        a(stringbuilder, "uuid", k.c(this));
        a(stringbuilder, "Available internal memory", Float.valueOf(k.e()));
        a(stringbuilder, "In low internal memory", Boolean.valueOf(k.f()));
        obj = "";
        obj1 = AccessToken.getCurrentAccessToken();
        if (obj1 != null)
        {
            obj = ((AccessToken) (obj1)).getToken();
        }
        a(stringbuilder, "Facebook session", obj);
        a(stringbuilder, "Facebook username", sharedpreferences.getString("facebook_user_name", "null"));
        a(stringbuilder, "Twitter token", sharedpreferences.getString("twitter_token", "null"));
        a(stringbuilder, "Twitter username", sharedpreferences.getString("twitter_user_name", "null"));
        a(stringbuilder, "Current language", Locale.getDefault().getDisplayLanguage());
        a(stringbuilder, "Configuration", getResources().getConfiguration().toString());
        a(stringbuilder, "Video Ad expired duration", Long.valueOf(com.cardinalblue.android.b.d.i()));
        a(stringbuilder, "Unfinished collage notification delay time(ms)", Long.valueOf(PICDeviceConfig.getUnfinishedNotificationDelayMs()));
        a(stringbuilder, "Uncreated collage notification delay time(ms)", Long.valueOf(PICDeviceConfig.getUncreatedNotificationDelayMs()));
        obj = PreferenceManager.getDefaultSharedPreferences(this);
        try
        {
            a(stringbuilder, "History", i.a(((SharedPreferences) (obj)).getStringSet("version_code_history", new HashSet()), ","));
        }
        catch (ClassCastException classcastexception) { }
        a(stringbuilder, "Device Configuration", com.cardinalblue.android.a.a.a(com/cardinalblue/android/piccollage/lib/d).toString());
        a(stringbuilder, "Device Uuid", sharedpreferences.getString("pref_device_uuid", "null"));
        return stringbuilder.toString();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        addPreferencesFromResource(0x7f050001);
        a(com.cardinalblue.android.piccollage.controller.network.f.c());
        bundle = findPreference("pref_key_target_authority");
        if (bundle != null)
        {
            bundle.setOnPreferenceChangeListener(this);
        }
        bundle = findPreference("pref_key_cb_authority_list");
        if (bundle != null)
        {
            bundle.setOnPreferenceChangeListener(this);
        }
        a("pref_key_ads_test_mode", com.cardinalblue.android.b.d.e());
        a("pref_key_webview_debug_enabled", com.cardinalblue.android.b.d.f());
        a("pref_force_load_gallery_banner", com.cardinalblue.android.b.d.g());
        a("pref_key_debug_collage_panel", com.cardinalblue.android.b.d.c());
        a("pref_key_nslogger", com.cardinalblue.android.b.d.b());
        a("pref_key_notification_log", com.cardinalblue.android.b.d.d());
        a("pref_key_print_sandbox_mode", com.cardinalblue.android.b.d.h());
        bundle = findPreference("pref_key_test_paid_sticker_expire_time");
        if (bundle != null)
        {
            bundle.setDefaultValue(Long.valueOf(com.cardinalblue.android.b.d.i()));
            bundle.setOnPreferenceChangeListener(this);
        }
        bundle = findPreference("pref_key_test_unfinished_notification_delay_milliseconds");
        if (bundle != null)
        {
            bundle.setDefaultValue(Long.valueOf(PICDeviceConfig.getUnfinishedNotificationDelayMs()));
            bundle.setOnPreferenceChangeListener(this);
        }
        bundle = findPreference("pref_key_test_uncreated_notification_delay_milliseconds");
        if (bundle != null)
        {
            bundle.setDefaultValue(Long.valueOf(PICDeviceConfig.getUncreatedNotificationDelayMs()));
            bundle.setOnPreferenceChangeListener(this);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onOptionsItemSelected(menuitem);

        case 16908332: 
            onBackPressed();
            break;
        }
        return true;
    }

    public boolean onPreferenceChange(Preference preference, Object obj)
    {
        preference = preference.getKey();
        if ("pref_key_target_authority".equals(preference) || "pref_key_cb_authority_list".equals(preference))
        {
            a(false);
            preference = obj.toString();
            com.cardinalblue.android.piccollage.controller.network.f.a(preference);
            a(preference);
            return true;
        }
        if ("pref_key_ads_test_mode".equals(preference))
        {
            k.j().edit().putBoolean("pref_key_ads_test_mode", ((Boolean)obj).booleanValue()).apply();
            return true;
        }
        if ("pref_key_webview_debug_enabled".equals(preference))
        {
            k.j().edit().putBoolean("pref_key_webview_debug_enabled", ((Boolean)obj).booleanValue()).apply();
            return true;
        }
        if ("pref_force_load_gallery_banner".equals(preference))
        {
            k.j().edit().putBoolean("pref_force_load_gallery_banner", ((Boolean)obj).booleanValue()).apply();
            return true;
        }
        if ("pref_key_notification_log".equals(preference))
        {
            k.j().edit().putBoolean("pref_key_notification_log", ((Boolean)obj).booleanValue()).apply();
            return true;
        }
        if ("pref_key_nslogger".equals(preference))
        {
            k.j().edit().putBoolean("pref_key_nslogger", ((Boolean)obj).booleanValue()).apply();
            return true;
        }
        if ("pref_key_debug_collage_panel".equals(preference))
        {
            k.j().edit().putBoolean("pref_key_debug_collage_panel", ((Boolean)obj).booleanValue()).apply();
            return true;
        }
        if ("pref_key_print_sandbox_mode".equals(preference))
        {
            k.j().edit().putBoolean("pref_key_print_sandbox_mode", ((Boolean)obj).booleanValue()).apply();
            return true;
        }
        if ("pref_key_test_paid_sticker_expire_time".equals(preference))
        {
            try
            {
                long l = Long.valueOf(obj.toString()).longValue();
                k.j().edit().putLong("pref_key_test_paid_sticker_expire_time", l * 1000L).apply();
                k.a(this, getString(0x7f07034c, new Object[] {
                    Long.valueOf(l)
                }), 0);
            }
            // Misplaced declaration of an exception variable
            catch (Preference preference)
            {
                return true;
            }
            return true;
        }
        if ("pref_key_test_unfinished_notification_delay_milliseconds".equals(preference))
        {
            try
            {
                long l1 = Long.valueOf(obj.toString()).longValue();
                k.j().edit().putLong("pref_key_test_unfinished_notification_delay_milliseconds", 1000L * l1).apply();
                k.a(this, getString(0x7f07034d, new Object[] {
                    Long.valueOf(l1)
                }), 0);
            }
            // Misplaced declaration of an exception variable
            catch (Preference preference)
            {
                return true;
            }
            return true;
        }
        if ("pref_key_test_uncreated_notification_delay_milliseconds".equals(preference))
        {
            try
            {
                long l2 = Long.valueOf(obj.toString()).longValue();
                k.j().edit().putLong("pref_key_test_uncreated_notification_delay_milliseconds", 1000L * l2).apply();
                k.a(this, getString(0x7f07034d, new Object[] {
                    Long.valueOf(l2)
                }), 0);
            }
            // Misplaced declaration of an exception variable
            catch (Preference preference)
            {
                return true;
            }
            return true;
        } else
        {
            return false;
        }
    }

    public boolean onPreferenceTreeClick(PreferenceScreen preferencescreen, Preference preference)
    {
        String s = preference.getKey();
        if ("pref_key_reset_app".equals(s))
        {
            a(true);
            return true;
        }
        if ("pref_key_show_settings".equals(s))
        {
            b();
            return true;
        }
        if ("pref_key_reset_iab".equals(s))
        {
            a();
            return true;
        } else
        {
            return super.onPreferenceTreeClick(preferencescreen, preference);
        }
    }

    protected void onResume()
    {
        super.onResume();
        com.cardinalblue.android.piccollage.a.f.c(this);
    }

    protected void onStart()
    {
        super.onStart();
        com.cardinalblue.android.piccollage.a.f.a(this, k.a(this));
        com.cardinalblue.android.piccollage.a.f.a(getIntent());
        com.cardinalblue.android.piccollage.a.f.b(getIntent());
    }

    protected void onStop()
    {
        super.onStop();
        com.cardinalblue.android.piccollage.a.f.b(this, k.a(this));
    }

    public void startManagingCursor(Cursor cursor)
    {
        if (cursor == null)
        {
            try
            {
                throw new NullPointerException("Managing null cursor");
            }
            catch (NullPointerException nullpointerexception)
            {
                com.cardinalblue.android.piccollage.a.f.a(nullpointerexception);
            }
        }
        super.startManagingCursor(cursor);
    }
}
