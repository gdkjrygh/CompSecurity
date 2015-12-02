// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.prefs;

import android.preference.Preference;

// Referenced classes of package com.facebook.orca.prefs:
//            OrcaContactsPreferenceActivity

class s
    implements android.preference.Preference.OnPreferenceClickListener
{

    final OrcaContactsPreferenceActivity a;

    s(OrcaContactsPreferenceActivity orcacontactspreferenceactivity)
    {
        a = orcacontactspreferenceactivity;
        super();
    }

    public boolean onPreferenceClick(Preference preference)
    {
        OrcaContactsPreferenceActivity.b(a);
        return true;
    }
}
