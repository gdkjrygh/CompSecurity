// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.prefs;

import android.preference.Preference;
import com.facebook.inject.t;

// Referenced classes of package com.facebook.orca.prefs:
//            OrcaRootPreferenceActivity, a

class ao
    implements android.preference.Preference.OnPreferenceClickListener
{

    final OrcaRootPreferenceActivity a;

    ao(OrcaRootPreferenceActivity orcarootpreferenceactivity)
    {
        a = orcarootpreferenceactivity;
        super();
    }

    public boolean onPreferenceClick(Preference preference)
    {
        ((a)a.b().a(com/facebook/orca/prefs/a)).a();
        return true;
    }
}
