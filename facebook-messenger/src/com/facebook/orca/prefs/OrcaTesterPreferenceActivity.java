// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.prefs;

import android.os.Bundle;
import android.preference.PreferenceGroup;
import android.preference.PreferenceManager;
import com.facebook.analytics.d;
import com.facebook.base.activity.p;
import com.facebook.c;
import com.facebook.i;
import com.facebook.k;
import com.facebook.o;
import com.facebook.prefs.shared.ae;
import com.facebook.prefs.shared.aj;
import com.facebook.widget.c.e;
import com.facebook.widget.titlebar.a;

public class OrcaTesterPreferenceActivity extends p
    implements d
{

    private a a;

    public OrcaTesterPreferenceActivity()
    {
    }

    private void a(PreferenceGroup preferencegroup)
    {
        b(preferencegroup);
    }

    private void b(PreferenceGroup preferencegroup)
    {
        e e1 = new e(this);
        e1.setKey(aj.i.a());
        e1.setTitle(o.debug_log_level);
        e1.setDefaultValue("-1");
        e1.setEntries(c.logger_levels);
        e1.setEntryValues(c.logger_levels_values);
        preferencegroup.addPreference(e1);
    }

    protected void b(Bundle bundle)
    {
        super.b(bundle);
        setContentView(k.orca_preferences);
        com.facebook.widget.titlebar.c.a(this);
        a = (a)a(i.titlebar);
        a.setTitle("Tester");
        bundle = getPreferenceManager().createPreferenceScreen(this);
        setPreferenceScreen(bundle);
        a(bundle);
    }

    public com.facebook.analytics.f.a g_()
    {
        return com.facebook.analytics.f.a.ORCA_TESTER_PREFERENCE_ACTIVITY_NAME;
    }
}
