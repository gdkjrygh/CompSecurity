// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.prefs;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceCategory;
import android.preference.PreferenceGroup;
import android.preference.PreferenceManager;
import android.text.format.DateFormat;
import com.facebook.analytics.av;
import com.facebook.analytics.cb;
import com.facebook.analytics.d;
import com.facebook.base.activity.p;
import com.facebook.c.s;
import com.facebook.config.a.b;
import com.facebook.config.b.a;
import com.facebook.i;
import com.facebook.inject.t;
import com.facebook.k;
import com.facebook.messages.model.threads.ParticipantInfo;
import com.facebook.o;
import com.facebook.orca.annotations.IsContactsUploadPermitted;
import com.facebook.orca.annotations.IsPartialAccount;
import com.facebook.orca.annotations.IsPartialUpgradeEnabled;
import com.facebook.orca.annotations.IsSmsReadPermitted;
import com.facebook.orca.annotations.IsTesterPrefsEnabled;
import com.facebook.orca.chatheads.annotations.IsChatHeadsPermitted;
import com.facebook.orca.notify.NotificationSetting;
import com.facebook.orca.notify.as;
import com.facebook.orca.sms.bk;
import com.facebook.prefs.shared.IsInternalPrefsEnabled;
import com.facebook.widget.titlebar.c;
import com.google.common.a.hq;
import java.util.Date;
import java.util.List;
import java.util.UUID;

// Referenced classes of package com.facebook.orca.prefs:
//            OrcaNotificationPreferenceActivity, l, OrcaContactsPreferenceActivity, OrcaSmsMmsPreferenceActivity, 
//            OrcaPartialUserUpgradeActivity, ao, ap, aq, 
//            ar, OrcaTesterPreferenceActivity, OrcaInternalPreferenceActivity, n, 
//            at, as

public class OrcaRootPreferenceActivity extends p
    implements d
{

    private com.facebook.widget.titlebar.a a;
    private a b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;
    private com.facebook.config.a.a i;
    private av j;
    private s k;
    private bk l;
    private com.facebook.prefs.shared.d m;
    private as n;
    private javax.inject.a o;
    private Preference p;
    private Preference q;

    public OrcaRootPreferenceActivity()
    {
    }

    static s a(OrcaRootPreferenceActivity orcarootpreferenceactivity)
    {
        return orcarootpreferenceactivity.k;
    }

    private void a(PreferenceGroup preferencegroup)
    {
        PreferenceCategory preferencecategory = new PreferenceCategory(this);
        preferencecategory.setTitle(o.preference_group_title_general_settings);
        preferencegroup.addPreference(preferencecategory);
        p = new Preference(this);
        p.setTitle(o.preference_notifications_group_title);
        p.setIntent(new Intent(this, com/facebook/orca/prefs/OrcaNotificationPreferenceActivity));
        preferencecategory.addPreference(p);
        l l1 = new l(this);
        l1.setTitle(o.preference_location_services_title);
        l1.setDefaultValue(Boolean.valueOf(true));
        preferencecategory.addPreference(l1);
        if (f)
        {
            Preference preference = new Preference(this);
            preference.setTitle(o.preference_contacts_title);
            preference.setIntent(new Intent(this, com/facebook/orca/prefs/OrcaContactsPreferenceActivity));
            preferencecategory.addPreference(preference);
        }
        if (c)
        {
            q = new Preference(this);
            q.setTitle(o.preference_sms_mms_group_title);
            q.setIntent(new Intent(this, com/facebook/orca/prefs/OrcaSmsMmsPreferenceActivity));
            preferencecategory.addPreference(q);
        }
        if (g && h)
        {
            Preference preference1 = new Preference(this);
            preference1.setTitle(o.preference_partial_user_upgrade_title);
            preference1.setIntent(new Intent(this, com/facebook/orca/prefs/OrcaPartialUserUpgradeActivity));
            preferencecategory.addPreference(preference1);
        }
        preferencecategory = new PreferenceCategory(this);
        preferencecategory.setTitle(o.preference_group_title_info_and_account);
        preferencegroup.addPreference(preferencecategory);
        preferencegroup = new Preference(this);
        preferencegroup.setTitle(o.menu_about);
        preferencegroup.setSummary(getString(o.preference_version_description, new Object[] {
            b.a(), Integer.valueOf(b.b())
        }));
        preferencegroup.setOnPreferenceClickListener(new ao(this));
        preferencecategory.addPreference(preferencegroup);
        preferencegroup = new Preference(this);
        preferencegroup.setTitle(o.preference_privacy_and_terms);
        preferencegroup.setOnPreferenceClickListener(new ap(this, this));
        preferencecategory.addPreference(preferencegroup);
        if (!g || i.h() != b.PUBLIC)
        {
            preferencegroup = new Preference(this);
            preferencegroup.setTitle(o.menu_switch_accounts);
            String s1 = l.a().d();
            preferencegroup.setSummary(getString(o.preference_switch_account_summary, new Object[] {
                s1
            }));
            preferencegroup.setOnPreferenceClickListener(new aq(this));
            preferencecategory.addPreference(preferencegroup);
        }
        if (g)
        {
            preferencegroup = new Preference(this);
            preferencegroup.setTitle(getString(o.preference_delete_account_title));
            preferencegroup.setOnPreferenceClickListener(new ar(this));
            preferencecategory.addPreference(preferencegroup);
        }
        if (d)
        {
            preferencegroup = new Preference(this);
            preferencegroup.setTitle("Tester");
            preferencegroup.setIntent(new Intent(this, com/facebook/orca/prefs/OrcaTesterPreferenceActivity));
            preferencecategory.addPreference(preferencegroup);
        }
        if (e)
        {
            preferencegroup = new Preference(this);
            preferencegroup.setTitle("Internal");
            preferencegroup.setIntent(new Intent(this, com/facebook/orca/prefs/OrcaInternalPreferenceActivity));
            preferencecategory.addPreference(preferencegroup);
        }
    }

    static void b(OrcaRootPreferenceActivity orcarootpreferenceactivity)
    {
        orcarootpreferenceactivity.d();
    }

    static av c(OrcaRootPreferenceActivity orcarootpreferenceactivity)
    {
        return orcarootpreferenceactivity.j;
    }

    private void c()
    {
        Object obj = n.a();
        if (!n.b(((NotificationSetting) (obj)))) goto _L2; else goto _L1
_L1:
        obj = new Date(((NotificationSetting) (obj)).b() * 1000L);
        obj = DateFormat.getTimeFormat(this).format(((Date) (obj)));
        obj = getString(o.preference_notifications_muted_until, new Object[] {
            obj
        });
_L4:
        p.setSummary(((CharSequence) (obj)));
        return;
_L2:
        if (((NotificationSetting) (obj)).a())
        {
            boolean flag1 = m.a(com.facebook.orca.prefs.n.p, true);
            boolean flag2 = m.a(n.q, true);
            boolean flag3 = m.a(n.r, true);
            boolean flag;
            if (((Boolean)o.b()).booleanValue() && m.a(com.facebook.orca.prefs.n.s, false))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj = hq.a();
            if (flag1)
            {
                ((List) (obj)).add(getString(o.preference_notifications_sound_enabled_title));
            }
            if (flag2)
            {
                ((List) (obj)).add(getString(o.preference_notifications_vibrate_enabled_title));
            }
            if (flag3)
            {
                ((List) (obj)).add(getString(o.preference_notifications_led_enabled_title));
            }
            if (flag)
            {
                ((List) (obj)).add(getString(o.preference_notifications_chat_heads_title));
            }
            switch (((List) (obj)).size())
            {
            default:
                obj = null;
                break;

            case 0: // '\0'
                obj = getString(o.preference_notifications_summary_on);
                break;

            case 1: // '\001'
                obj = getString(o.preference_notifications_summary_one_on, ((List) (obj)).toArray());
                break;

            case 2: // '\002'
                obj = getString(o.preference_notifications_summary_two_on, ((List) (obj)).toArray());
                break;

            case 3: // '\003'
                obj = getString(o.preference_notifications_summary_three_on, ((List) (obj)).toArray());
                break;

            case 4: // '\004'
                obj = getString(o.preference_notifications_summary_four_on, ((List) (obj)).toArray());
                break;
            }
        } else
        {
            obj = getString(o.preference_notifications_disabled);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void d()
    {
        String s1 = com.facebook.common.h.a.a().toString();
        j.a((new cb("click")).a(g_()).f("button").h(s1).g("orca_preferences_delete_account_preference"));
        (new android.app.AlertDialog.Builder(this)).setTitle(getString(o.preference_delete_account_title)).setMessage(getString(o.preference_delete_account_dialog_message)).setPositiveButton(o.dialog_delete, new at(this, s1)).setNegativeButton(o.dialog_cancel, new com.facebook.orca.prefs.as(this, s1)).create().show();
    }

    protected void b(Bundle bundle)
    {
        super.b(bundle);
        setContentView(k.orca_preferences);
        bundle = b();
        b = (a)bundle.a(com/facebook/config/b/a);
        c = ((Boolean)bundle.a(java/lang/Boolean, com/facebook/orca/annotations/IsSmsReadPermitted)).booleanValue();
        d = ((Boolean)bundle.a(java/lang/Boolean, com/facebook/orca/annotations/IsTesterPrefsEnabled)).booleanValue();
        e = ((Boolean)bundle.a(java/lang/Boolean, com/facebook/prefs/shared/IsInternalPrefsEnabled)).booleanValue();
        f = ((Boolean)bundle.a(java/lang/Boolean, com/facebook/orca/annotations/IsContactsUploadPermitted)).booleanValue();
        g = ((Boolean)bundle.a(java/lang/Boolean, com/facebook/orca/annotations/IsPartialAccount)).booleanValue();
        h = ((Boolean)bundle.a(java/lang/Boolean, com/facebook/orca/annotations/IsPartialUpgradeEnabled)).booleanValue();
        i = (com.facebook.config.a.a)bundle.a(com/facebook/config/a/a);
        j = (av)bundle.a(com/facebook/analytics/av);
        k = (s)bundle.a(com/facebook/c/s);
        l = (bk)bundle.a(com/facebook/orca/sms/bk);
        m = (com.facebook.prefs.shared.d)bundle.a(com/facebook/prefs/shared/d);
        n = (as)bundle.a(com/facebook/orca/notify/as);
        o = bundle.b(java/lang/Boolean, com/facebook/orca/chatheads/annotations/IsChatHeadsPermitted);
        com.facebook.widget.titlebar.c.a(this);
        a = (com.facebook.widget.titlebar.a)a(i.titlebar);
        a.setTitle(getString(o.preference_title));
        bundle = getPreferenceManager().createPreferenceScreen(this);
        setPreferenceScreen(bundle);
        a(bundle);
    }

    public com.facebook.analytics.f.a g_()
    {
        return com.facebook.analytics.f.a.ORCA_ROOT_PREFERENCE_ACTIVITY_NAME;
    }

    public void onResume()
    {
        super.onResume();
        c();
    }
}
