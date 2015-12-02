// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.prefs;

import android.preference.Preference;
import com.facebook.analytics.av;
import com.facebook.analytics.cb;
import com.facebook.contacts.upload.ContactsUploadProgressMode;
import com.facebook.contacts.upload.c;

// Referenced classes of package com.facebook.orca.prefs:
//            OrcaContactsPreferenceActivity

class v
    implements android.preference.Preference.OnPreferenceClickListener
{

    final OrcaContactsPreferenceActivity a;

    v(OrcaContactsPreferenceActivity orcacontactspreferenceactivity)
    {
        a = orcacontactspreferenceactivity;
        super();
    }

    public boolean onPreferenceClick(Preference preference)
    {
        com.facebook.orca.prefs.OrcaContactsPreferenceActivity.c(a).a((new cb("click")).a(a.g_()).f("button").g("orca_preferences_manual_contacts_sync_preference"));
        OrcaContactsPreferenceActivity.e(a);
        OrcaContactsPreferenceActivity.a(a, OrcaContactsPreferenceActivity.f(a).b());
        OrcaContactsPreferenceActivity.f(a).a(ContactsUploadProgressMode.SHOW_IN_THREAD_LIST_AND_DIVE_BAR);
        return true;
    }
}
