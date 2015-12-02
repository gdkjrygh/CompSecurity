// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.prefs;

import android.preference.Preference;

// Referenced classes of package com.facebook.orca.prefs:
//            OrcaRootPreferenceActivity

class ar
    implements android.preference.Preference.OnPreferenceClickListener
{

    final OrcaRootPreferenceActivity a;

    ar(OrcaRootPreferenceActivity orcarootpreferenceactivity)
    {
        a = orcarootpreferenceactivity;
        super();
    }

    public boolean onPreferenceClick(Preference preference)
    {
        OrcaRootPreferenceActivity.b(a);
        return true;
    }
}
