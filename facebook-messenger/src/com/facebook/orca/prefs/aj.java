// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.prefs;

import android.preference.Preference;
import com.facebook.analytics.av;
import com.facebook.analytics.cb;

// Referenced classes of package com.facebook.orca.prefs:
//            OrcaNotificationPreferenceActivity

class aj
    implements android.preference.Preference.OnPreferenceChangeListener
{

    final OrcaNotificationPreferenceActivity a;

    aj(OrcaNotificationPreferenceActivity orcanotificationpreferenceactivity)
    {
        a = orcanotificationpreferenceactivity;
        super();
    }

    public boolean onPreferenceChange(Preference preference, Object obj)
    {
        OrcaNotificationPreferenceActivity.a(a).a((new cb("pref_change")).g(preference.getKey()).b("value", obj.toString()));
        return true;
    }
}
