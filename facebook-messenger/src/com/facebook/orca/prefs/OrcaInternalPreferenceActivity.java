// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.prefs;

import android.media.AudioManager;
import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.Preference;
import android.preference.PreferenceCategory;
import android.preference.PreferenceGroup;
import android.preference.PreferenceManager;
import android.widget.EditText;
import com.facebook.analytics.d;
import com.facebook.base.activity.p;
import com.facebook.common.annotations.IsDebugLogsEnabled;
import com.facebook.common.c.j;
import com.facebook.debug.c.a;
import com.facebook.debug.f.k;
import com.facebook.debug.fps.h;
import com.facebook.http.f.b;
import com.facebook.i;
import com.facebook.inject.t;
import com.facebook.o;
import com.facebook.orca.annotations.IsMobileOnlineAvailabilityPermitted;
import com.facebook.orca.app.dt;
import com.facebook.orca.chatheads.annotations.IsChatHeadsPermitted;
import com.facebook.orca.fbwebrtc.ag;
import com.facebook.orca.fbwebrtc.ay;
import com.facebook.prefs.shared.ae;
import com.facebook.prefs.shared.aj;
import com.facebook.zero.c.c;
import com.facebook.zero.c.e;

// Referenced classes of package com.facebook.orca.prefs:
//            p, an, o, z, 
//            ab, ad, af, ag, 
//            f, ah, ai, n

public class OrcaInternalPreferenceActivity extends p
    implements d
{

    private com.facebook.ui.images.cache.a a;
    private dt b;
    private com.facebook.orca.nux.h c;
    private com.facebook.orca.chatheads.b.k d;
    private com.facebook.contacts.upload.c e;
    private com.facebook.common.executors.d f;
    private boolean g;
    private javax.inject.a h;
    private AudioManager i;
    private ag j;
    private com.facebook.orca.stickers.c k;
    private com.facebook.orca.stickers.e l;
    private com.facebook.prefs.shared.d m;
    private javax.inject.a n;
    private c o;

    public OrcaInternalPreferenceActivity()
    {
    }

    static com.facebook.ui.images.cache.a a(OrcaInternalPreferenceActivity orcainternalpreferenceactivity)
    {
        return orcainternalpreferenceactivity.a;
    }

    private void a(PreferenceGroup preferencegroup)
    {
        b(preferencegroup);
        c(preferencegroup);
        PreferenceCategory preferencecategory = new PreferenceCategory(this);
        preferencecategory.setTitle(o.internal_pref_category_logging);
        preferencegroup.addPreference(preferencecategory);
        preferencecategory.addPreference(new a(this));
        d(preferencecategory);
        e(preferencecategory);
        preferencecategory = new PreferenceCategory(this);
        preferencecategory.setTitle(o.internal_pref_category_performance);
        preferencegroup.addPreference(preferencecategory);
        preferencecategory.addPreference(new h(this, false));
        preferencecategory.addPreference(new k(this));
        preferencecategory = new PreferenceCategory(this);
        preferencecategory.setTitle(o.internal_pref_category_profiling);
        preferencegroup.addPreference(preferencecategory);
        f(preferencecategory);
        h(preferencecategory);
        g(preferencecategory);
        preferencecategory = new PreferenceCategory(this);
        preferencecategory.setTitle(o.internal_pref_category_sandbox);
        preferencegroup.addPreference(preferencecategory);
        k(preferencecategory);
        l(preferencecategory);
        m(preferencecategory);
        n(preferencecategory);
        preferencecategory.addPreference(new com.facebook.http.f.a(this));
        preferencecategory.addPreference(new b(this));
        preferencecategory = new PreferenceCategory(this);
        preferencecategory.setTitle(o.internal_pref_category_caches);
        preferencegroup.addPreference(preferencecategory);
        o(preferencecategory);
        p(preferencecategory);
        q(preferencecategory);
        r(preferencecategory);
        preferencecategory = new PreferenceCategory(this);
        preferencecategory.setTitle(o.internal_pref_category_rolodex);
        preferencegroup.addPreference(preferencecategory);
        s(preferencecategory);
        t(preferencecategory);
        preferencecategory = new PreferenceCategory(this);
        preferencecategory.setTitle(o.internal_pref_category_voip);
        preferencegroup.addPreference(preferencecategory);
        u(preferencecategory);
        v(preferencecategory);
        w(preferencecategory);
        x(preferencecategory);
        preferencecategory = new PreferenceCategory(this);
        preferencecategory.setTitle(o.internal_pref_category_zero_rating);
        preferencegroup.addPreference(preferencecategory);
        preferencecategory.addPreference(new e(this));
        o = new c(this);
        preferencecategory.addPreference(o);
        preferencecategory.addPreference(new com.facebook.zero.c.a(this));
        if (((Boolean)h.b()).booleanValue())
        {
            preferencecategory = new PreferenceCategory(this);
            preferencecategory.setTitle(o.internal_pref_category_chat_heads);
            preferencegroup.addPreference(preferencecategory);
            y(preferencecategory);
        }
        preferencecategory = new PreferenceCategory(this);
        preferencecategory.setTitle(o.internal_pref_category_wildfire);
        preferencegroup.addPreference(preferencecategory);
        j(preferencecategory);
        preferencecategory = new PreferenceCategory(this);
        preferencecategory.setTitle(o.internal_pref_category_misc);
        preferencegroup.addPreference(preferencecategory);
        i(preferencecategory);
    }

    static boolean a(OrcaInternalPreferenceActivity orcainternalpreferenceactivity, com.facebook.widget.c.e e1, boolean flag)
    {
        return orcainternalpreferenceactivity.a(e1, flag);
    }

    private boolean a(com.facebook.widget.c.e e1, boolean flag)
    {
        while (j.b() == 0 || flag != i.isSpeakerphoneOn()) 
        {
            return false;
        }
        int i1 = Integer.valueOf(e1.getValue()).intValue();
        if (i1 > 0)
        {
            i.setMode(i1);
        }
        return true;
    }

    static com.facebook.common.executors.d b(OrcaInternalPreferenceActivity orcainternalpreferenceactivity)
    {
        return orcainternalpreferenceactivity.f;
    }

    private void b(PreferenceGroup preferencegroup)
    {
        if (g)
        {
            preferencegroup.addPreference(new com.facebook.orca.prefs.p(this));
        }
    }

    static com.facebook.orca.stickers.e c(OrcaInternalPreferenceActivity orcainternalpreferenceactivity)
    {
        return orcainternalpreferenceactivity.l;
    }

    private void c(PreferenceGroup preferencegroup)
    {
        preferencegroup.addPreference(new an(this));
    }

    static com.facebook.orca.stickers.c d(OrcaInternalPreferenceActivity orcainternalpreferenceactivity)
    {
        return orcainternalpreferenceactivity.k;
    }

    private void d(PreferenceGroup preferencegroup)
    {
        CheckBoxPreference checkboxpreference = new CheckBoxPreference(this);
        checkboxpreference.setKey(aj.j.a());
        checkboxpreference.setTitle(o.debug_log_enable);
        checkboxpreference.setSummary(o.debug_log_description);
        checkboxpreference.setDefaultValue(n.b());
        preferencegroup.addPreference(checkboxpreference);
    }

    static com.facebook.prefs.shared.d e(OrcaInternalPreferenceActivity orcainternalpreferenceactivity)
    {
        return orcainternalpreferenceactivity.m;
    }

    private void e(PreferenceGroup preferencegroup)
    {
        CheckBoxPreference checkboxpreference = new CheckBoxPreference(this);
        checkboxpreference.setKey(j.a.a());
        checkboxpreference.setTitle(o.debug_net_log_access);
        checkboxpreference.setDefaultValue(Boolean.valueOf(false));
        preferencegroup.addPreference(checkboxpreference);
    }

    static dt f(OrcaInternalPreferenceActivity orcainternalpreferenceactivity)
    {
        return orcainternalpreferenceactivity.b;
    }

    private void f(PreferenceGroup preferencegroup)
    {
        CheckBoxPreference checkboxpreference = new CheckBoxPreference(this);
        checkboxpreference.setKey(com.facebook.http.f.c.b.a());
        checkboxpreference.setTitle(o.debug_php_profiling);
        checkboxpreference.setSummary(o.debug_php_profiling_description);
        checkboxpreference.setDefaultValue(Boolean.valueOf(false));
        preferencegroup.addPreference(checkboxpreference);
    }

    static com.facebook.orca.nux.h g(OrcaInternalPreferenceActivity orcainternalpreferenceactivity)
    {
        return orcainternalpreferenceactivity.c;
    }

    private void g(PreferenceGroup preferencegroup)
    {
        CheckBoxPreference checkboxpreference = new CheckBoxPreference(this);
        checkboxpreference.setKey(com.facebook.http.f.c.c.a());
        checkboxpreference.setTitle(o.debug_wirehog_profiling);
        checkboxpreference.setSummary(o.debug_wirehog_profiling_description);
        checkboxpreference.setDefaultValue(Boolean.valueOf(false));
        preferencegroup.addPreference(checkboxpreference);
    }

    static com.facebook.orca.chatheads.b.k h(OrcaInternalPreferenceActivity orcainternalpreferenceactivity)
    {
        return orcainternalpreferenceactivity.d;
    }

    private void h(PreferenceGroup preferencegroup)
    {
        CheckBoxPreference checkboxpreference = new CheckBoxPreference(this);
        checkboxpreference.setKey(com.facebook.http.f.c.d.a());
        checkboxpreference.setTitle(o.debug_teak_profiling);
        checkboxpreference.setSummary(o.debug_teak_profiling_description);
        checkboxpreference.setDefaultValue(Boolean.valueOf(false));
        preferencegroup.addPreference(checkboxpreference);
    }

    static com.facebook.contacts.upload.c i(OrcaInternalPreferenceActivity orcainternalpreferenceactivity)
    {
        return orcainternalpreferenceactivity.e;
    }

    private void i(PreferenceGroup preferencegroup)
    {
        CheckBoxPreference checkboxpreference = new CheckBoxPreference(this);
        checkboxpreference.setKey(o.x.a());
        checkboxpreference.setTitle(o.debug_force_fb4a_look_and_feel);
        checkboxpreference.setSummary(o.debug_force_fb4a_look_and_feel_description);
        checkboxpreference.setDefaultValue(Boolean.valueOf(false));
        preferencegroup.addPreference(checkboxpreference);
    }

    private void j(PreferenceGroup preferencegroup)
    {
        CheckBoxPreference checkboxpreference = new CheckBoxPreference(this);
        checkboxpreference.setKey(o.y.a());
        checkboxpreference.setTitle(o.debug_force_wildfire_alternative_start);
        checkboxpreference.setSummary(o.debug_force_wildfire_alternative_start_description);
        checkboxpreference.setDefaultValue(Boolean.valueOf(false));
        preferencegroup.addPreference(checkboxpreference);
        checkboxpreference = new CheckBoxPreference(this);
        checkboxpreference.setKey(o.z.a());
        checkboxpreference.setTitle(o.debug_force_wildfire_skip_start);
        checkboxpreference.setSummary(o.debug_force_wildfire_skip_start_description);
        checkboxpreference.setDefaultValue(Boolean.valueOf(false));
        preferencegroup.addPreference(checkboxpreference);
    }

    private void k(PreferenceGroup preferencegroup)
    {
        com.facebook.widget.c.e e1 = new com.facebook.widget.c.e(this);
        e1.setKey(com.facebook.http.f.c.j.a());
        e1.setTitle(o.debug_web_server_tier_title);
        e1.setSummary(o.debug_web_server_tier_description);
        e1.setDefaultValue("default");
        e1.setEntries(com.facebook.c.web_server_tiers);
        e1.setEntryValues(com.facebook.c.web_server_tiers_values);
        preferencegroup.addPreference(e1);
    }

    private void l(PreferenceGroup preferencegroup)
    {
        com.facebook.widget.c.a a1 = new com.facebook.widget.c.a(this);
        a1.setKey(com.facebook.http.f.c.k.a());
        a1.setTitle(o.debug_web_sandbox_title);
        a1.a(getString(o.debug_web_sandbox_description));
        a1.setDialogTitle(o.debug_web_sandbox_title);
        a1.getEditText().setHint(o.debug_web_sandbox_hint);
        a1.getEditText().setSingleLine(true);
        a1.getEditText().setInputType(1);
        preferencegroup.addPreference(a1);
    }

    private void m(PreferenceGroup preferencegroup)
    {
        com.facebook.widget.c.e e1 = new com.facebook.widget.c.e(this);
        e1.setKey(com.facebook.http.f.c.m.a());
        e1.setTitle(o.debug_mqtt_server_tier_title);
        e1.setSummary(o.debug_mqtt_server_tier_description);
        e1.setDefaultValue("default");
        e1.setEntries(com.facebook.c.mqtt_server_tiers);
        e1.setEntryValues(com.facebook.c.mqtt_server_tiers_values);
        preferencegroup.addPreference(e1);
    }

    private void n(PreferenceGroup preferencegroup)
    {
        com.facebook.widget.c.a a1 = new com.facebook.widget.c.a(this);
        a1.setKey(com.facebook.http.f.c.n.a());
        a1.setTitle(o.debug_mqtt_sandbox_title);
        a1.a(getString(o.debug_mqtt_sandbox_description));
        a1.setDialogTitle(o.debug_mqtt_sandbox_title);
        a1.getEditText().setHint(o.debug_mqtt_sandbox_hint);
        a1.getEditText().setSingleLine(true);
        a1.getEditText().setInputType(1);
        preferencegroup.addPreference(a1);
    }

    private void o(PreferenceGroup preferencegroup)
    {
        Preference preference = new Preference(this);
        preference.setTitle(o.preference_clear_image_cache_title);
        preference.setSummary(o.preference_clear_image_cache_description);
        preference.setOnPreferenceClickListener(new z(this));
        preferencegroup.addPreference(preference);
    }

    private void p(PreferenceGroup preferencegroup)
    {
        Preference preference = new Preference(this);
        preference.setTitle(o.preference_clear_stickers_cache_title);
        preference.setSummary(o.preference_clear_stickers_cache_description);
        preference.setOnPreferenceClickListener(new ab(this));
        preferencegroup.addPreference(preference);
    }

    private void q(PreferenceGroup preferencegroup)
    {
        Preference preference = new Preference(this);
        preference.setTitle(o.preference_clear_thread_cache_title);
        preference.setSummary(o.preference_clear_thread_cache_description);
        preference.setOnPreferenceClickListener(new ad(this));
        preferencegroup.addPreference(preference);
    }

    private void r(PreferenceGroup preferencegroup)
    {
        Preference preference = new Preference(this);
        preference.setTitle(o.preference_reset_nux_title);
        preference.setOnPreferenceClickListener(new af(this));
        preferencegroup.addPreference(preference);
    }

    private void s(PreferenceGroup preferencegroup)
    {
        com.facebook.widget.c.e e1 = new com.facebook.widget.c.e(this);
        e1.setKey(com.facebook.contacts.upload.a.g.a());
        e1.setTitle(o.debug_upload_contacts_batch_size_title);
        e1.setSummary(o.debug_upload_contacts_batch_size_description);
        e1.setDefaultValue("-1");
        e1.setEntries(com.facebook.c.upload_contacts_batch_sizes);
        e1.setEntryValues(com.facebook.c.upload_contacts_batch_size_values);
        preferencegroup.addPreference(e1);
    }

    private void t(PreferenceGroup preferencegroup)
    {
        Preference preference = new Preference(this);
        preference.setTitle(o.debug_upload_contacts_title);
        preference.setSummary(o.debug_upload_contacts_description);
        preference.setOnPreferenceClickListener(new com.facebook.orca.prefs.ag(this));
        preferencegroup.addPreference(preference);
    }

    private void u(PreferenceGroup preferencegroup)
    {
        com.facebook.widget.c.e e1 = new com.facebook.widget.c.e(this);
        e1.setKey(com.facebook.orca.prefs.f.b.a());
        e1.setTitle(o.debug_voip_audio_mode_title);
        e1.setSummary(o.debug_voip_audio_mode_description);
        e1.setDefaultValue("-1");
        e1.setEntries(com.facebook.c.voip_audio_modes);
        e1.setEntryValues(com.facebook.c.voip_audio_modes_values);
        e1.setOnPreferenceClickListener(new ah(this));
        preferencegroup.addPreference(e1);
    }

    private void v(PreferenceGroup preferencegroup)
    {
        com.facebook.widget.c.e e1 = new com.facebook.widget.c.e(this);
        e1.setKey(com.facebook.orca.prefs.f.c.a());
        e1.setTitle(o.debug_voip_speaker_audio_mode_title);
        e1.setSummary(o.debug_voip_speaker_audio_mode_description);
        e1.setDefaultValue("-1");
        e1.setEntries(com.facebook.c.voip_audio_modes);
        e1.setEntryValues(com.facebook.c.voip_audio_modes_values);
        e1.setOnPreferenceClickListener(new ai(this));
        preferencegroup.addPreference(e1);
    }

    private void w(PreferenceGroup preferencegroup)
    {
        com.facebook.widget.c.e e1 = new com.facebook.widget.c.e(this);
        e1.setKey(com.facebook.orca.prefs.f.d.a());
        e1.setTitle(o.debug_voip_volume_stream_type_title);
        e1.setSummary(o.debug_voip_volume_stream_type_description);
        e1.setDefaultValue("-1");
        e1.setEntries(com.facebook.c.voip_stream_types);
        e1.setEntryValues(com.facebook.c.voip_stream_types_values);
        preferencegroup.addPreference(e1);
    }

    private void x(PreferenceGroup preferencegroup)
    {
        CheckBoxPreference checkboxpreference = new CheckBoxPreference(this);
        checkboxpreference.setKey(ay.c.a());
        checkboxpreference.setTitle(o.debug_voip_user_acceptance_title);
        checkboxpreference.setDefaultValue(Boolean.valueOf(false));
        preferencegroup.addPreference(checkboxpreference);
    }

    private void y(PreferenceGroup preferencegroup)
    {
        CheckBoxPreference checkboxpreference = new CheckBoxPreference(this);
        checkboxpreference.setKey(n.F.a());
        checkboxpreference.setTitle(o.chat_heads_translucent_when_inactive);
        checkboxpreference.setDefaultValue(Boolean.valueOf(false));
        preferencegroup.addPreference(checkboxpreference);
    }

    protected void b(Bundle bundle)
    {
        super.b(bundle);
        setContentView(com.facebook.k.orca_preferences);
        bundle = b();
        a = (com.facebook.ui.images.cache.a)bundle.a(com/facebook/ui/images/cache/a);
        b = (dt)bundle.a(com/facebook/orca/app/dt);
        c = (com.facebook.orca.nux.h)bundle.a(com/facebook/orca/nux/h);
        e = (com.facebook.contacts.upload.c)bundle.a(com/facebook/contacts/upload/c);
        f = (com.facebook.common.executors.d)bundle.a(com/facebook/common/executors/d);
        g = ((Boolean)bundle.a(java/lang/Boolean, com/facebook/orca/annotations/IsMobileOnlineAvailabilityPermitted)).booleanValue();
        h = bundle.b(java/lang/Boolean, com/facebook/orca/chatheads/annotations/IsChatHeadsPermitted);
        i = (AudioManager)bundle.a(android/media/AudioManager);
        j = (ag)bundle.a(com/facebook/orca/fbwebrtc/ag);
        d = (com.facebook.orca.chatheads.b.k)bundle.a(com/facebook/orca/chatheads/b/k);
        k = (com.facebook.orca.stickers.c)bundle.a(com/facebook/orca/stickers/c);
        l = (com.facebook.orca.stickers.e)bundle.a(com/facebook/orca/stickers/e);
        m = (com.facebook.prefs.shared.d)bundle.a(com/facebook/prefs/shared/d);
        n = bundle.b(java/lang/Boolean, com/facebook/common/annotations/IsDebugLogsEnabled);
        com.facebook.widget.titlebar.c.a(this);
        ((com.facebook.widget.titlebar.a)a(i.titlebar)).setTitle(o.internal_pref_category_title);
        bundle = getPreferenceManager().createPreferenceScreen(this);
        setPreferenceScreen(bundle);
        a(bundle);
    }

    public com.facebook.analytics.f.a g_()
    {
        return com.facebook.analytics.f.a.ORCA_INTERNAL_PREFERENCE_ACTIVITY_NAME;
    }

    public void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        o.a();
    }

    public void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        o.b();
    }
}
