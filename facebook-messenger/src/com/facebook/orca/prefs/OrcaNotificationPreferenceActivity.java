// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.prefs;

import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.Preference;
import android.preference.PreferenceGroup;
import android.preference.PreferenceManager;
import android.preference.RingtonePreference;
import com.facebook.analytics.av;
import com.facebook.analytics.d;
import com.facebook.base.activity.p;
import com.facebook.i;
import com.facebook.inject.t;
import com.facebook.k;
import com.facebook.o;
import com.facebook.orca.chatheads.annotations.IsChatHeadsPermitted;
import com.facebook.prefs.shared.ae;
import com.facebook.widget.titlebar.c;
import javax.inject.a;

// Referenced classes of package com.facebook.orca.prefs:
//            aj, q, n

public class OrcaNotificationPreferenceActivity extends p
    implements d
{

    private com.facebook.widget.titlebar.a a;
    private a b;
    private av c;

    public OrcaNotificationPreferenceActivity()
    {
    }

    static av a(OrcaNotificationPreferenceActivity orcanotificationpreferenceactivity)
    {
        return orcanotificationpreferenceactivity.c;
    }

    private void a(Preference preference)
    {
        preference.setOnPreferenceChangeListener(new aj(this));
    }

    private void a(PreferenceGroup preferencegroup)
    {
        b(preferencegroup);
        c(preferencegroup);
        d(preferencegroup);
        e(preferencegroup);
        f(preferencegroup);
        if (((Boolean)b.b()).booleanValue())
        {
            g(preferencegroup);
        }
        for (int j = 0; j < preferencegroup.getPreferenceCount(); j++)
        {
            a(preferencegroup.getPreference(j));
        }

    }

    private void b(PreferenceGroup preferencegroup)
    {
        q q1 = new q(this);
        q1.setTitle(o.preference_notifications_enabled_title);
        preferencegroup.addPreference(q1);
    }

    private void c(PreferenceGroup preferencegroup)
    {
        CheckBoxPreference checkboxpreference = new CheckBoxPreference(this);
        checkboxpreference.setKey(com.facebook.orca.prefs.n.p.a());
        checkboxpreference.setTitle(o.preference_notifications_sound_enabled_title);
        checkboxpreference.setDefaultValue(Boolean.valueOf(true));
        preferencegroup.addPreference(checkboxpreference);
        checkboxpreference.setDependency(n.n.a());
    }

    private void d(PreferenceGroup preferencegroup)
    {
        RingtonePreference ringtonepreference = new RingtonePreference(this);
        ringtonepreference.setKey(com.facebook.orca.prefs.n.t.a());
        ringtonepreference.setTitle(o.preference_notifications_ringtone_title);
        ringtonepreference.setRingtoneType(2);
        ringtonepreference.setDefaultValue("content://settings/system/notification_sound");
        ringtonepreference.setShowDefault(true);
        preferencegroup.addPreference(ringtonepreference);
        ringtonepreference.setDependency(n.n.a());
    }

    private void e(PreferenceGroup preferencegroup)
    {
        CheckBoxPreference checkboxpreference = new CheckBoxPreference(this);
        checkboxpreference.setKey(n.q.a());
        checkboxpreference.setTitle(o.preference_notifications_vibrate_enabled_title);
        checkboxpreference.setDefaultValue(Boolean.valueOf(true));
        preferencegroup.addPreference(checkboxpreference);
        checkboxpreference.setDependency(n.n.a());
    }

    private void f(PreferenceGroup preferencegroup)
    {
        CheckBoxPreference checkboxpreference = new CheckBoxPreference(this);
        checkboxpreference.setKey(n.r.a());
        checkboxpreference.setTitle(o.preference_notifications_led_enabled_title);
        checkboxpreference.setDefaultValue(Boolean.valueOf(true));
        preferencegroup.addPreference(checkboxpreference);
        checkboxpreference.setDependency(n.n.a());
    }

    private void g(PreferenceGroup preferencegroup)
    {
        CheckBoxPreference checkboxpreference = new CheckBoxPreference(this);
        checkboxpreference.setKey(n.s.a());
        checkboxpreference.setTitle(o.preference_notifications_chat_heads_title);
        checkboxpreference.setDefaultValue(Boolean.valueOf(true));
        checkboxpreference.setSummaryOn(o.preference_notifications_chat_heads_enabled);
        checkboxpreference.setSummaryOff(o.preference_notifications_chat_heads_disabled);
        preferencegroup.addPreference(checkboxpreference);
        checkboxpreference.setDependency(n.n.a());
    }

    protected void b(Bundle bundle)
    {
        super.b(bundle);
        setContentView(k.orca_preferences);
        com.facebook.widget.titlebar.c.a(this);
        a = (com.facebook.widget.titlebar.a)a(i.titlebar);
        a.setTitle(getString(o.preference_notifications_title));
        bundle = b();
        b = bundle.b(java/lang/Boolean, com/facebook/orca/chatheads/annotations/IsChatHeadsPermitted);
        c = (av)bundle.a(com/facebook/analytics/av);
        bundle = getPreferenceManager().createPreferenceScreen(this);
        setPreferenceScreen(bundle);
        a(bundle);
    }

    public com.facebook.analytics.f.a g_()
    {
        return com.facebook.analytics.f.a.ORCA_ROOT_PREFERENCE_ACTIVITY_NAME;
    }
}
