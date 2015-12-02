// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.prefs;

import android.preference.Preference;
import com.facebook.orca.chatheads.b.k;
import com.facebook.orca.nux.h;

// Referenced classes of package com.facebook.orca.prefs:
//            OrcaInternalPreferenceActivity

class af
    implements android.preference.Preference.OnPreferenceClickListener
{

    final OrcaInternalPreferenceActivity a;

    af(OrcaInternalPreferenceActivity orcainternalpreferenceactivity)
    {
        a = orcainternalpreferenceactivity;
        super();
    }

    public boolean onPreferenceClick(Preference preference)
    {
        OrcaInternalPreferenceActivity.g(a).a();
        com.facebook.orca.prefs.OrcaInternalPreferenceActivity.h(a).i();
        return true;
    }
}
