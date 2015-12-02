// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.prefs;

import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.PreferenceGroup;
import android.preference.PreferenceManager;
import com.facebook.analytics.d;
import com.facebook.base.activity.p;
import com.facebook.i;
import com.facebook.k;
import com.facebook.o;
import com.facebook.prefs.shared.ae;
import com.facebook.widget.titlebar.a;
import com.facebook.widget.titlebar.c;

// Referenced classes of package com.facebook.orca.prefs:
//            n

public class OrcaSmsMmsPreferenceActivity extends p
    implements d
{

    private a a;

    public OrcaSmsMmsPreferenceActivity()
    {
    }

    private void a(PreferenceGroup preferencegroup)
    {
        b(preferencegroup);
        c(preferencegroup);
    }

    private void b(PreferenceGroup preferencegroup)
    {
        CheckBoxPreference checkboxpreference = new CheckBoxPreference(this);
        checkboxpreference.setKey(n.g.a());
        checkboxpreference.setTitle(o.preference_sms_show_conversations_title);
        checkboxpreference.setSummary(o.preference_sms_show_conversations_summary);
        checkboxpreference.setDefaultValue(Boolean.valueOf(false));
        preferencegroup.addPreference(checkboxpreference);
    }

    private void c(PreferenceGroup preferencegroup)
    {
        CheckBoxPreference checkboxpreference = new CheckBoxPreference(this);
        checkboxpreference.setKey(com.facebook.orca.prefs.n.i.a());
        checkboxpreference.setTitle(o.preference_use_as_main_app_title);
        checkboxpreference.setDefaultValue(Boolean.valueOf(true));
        checkboxpreference.setSummary(o.preference_use_as_main_app_description);
        preferencegroup.addPreference(checkboxpreference);
        checkboxpreference.setDependency(n.g.a());
    }

    protected void b(Bundle bundle)
    {
        super.b(bundle);
        setContentView(k.orca_preferences);
        com.facebook.widget.titlebar.c.a(this);
        a = (a)a(i.titlebar);
        a.setTitle(getString(o.preference_sms_mms_title));
        bundle = getPreferenceManager().createPreferenceScreen(this);
        setPreferenceScreen(bundle);
        a(bundle);
    }

    public com.facebook.analytics.f.a g_()
    {
        return com.facebook.analytics.f.a.ORCA_ROOT_PREFERENCE_ACTIVITY_NAME;
    }
}
