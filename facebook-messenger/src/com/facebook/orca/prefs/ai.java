// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.prefs;

import android.preference.Preference;
import com.facebook.widget.c.e;

// Referenced classes of package com.facebook.orca.prefs:
//            OrcaInternalPreferenceActivity

class ai
    implements android.preference.Preference.OnPreferenceClickListener
{

    final OrcaInternalPreferenceActivity a;

    ai(OrcaInternalPreferenceActivity orcainternalpreferenceactivity)
    {
        a = orcainternalpreferenceactivity;
        super();
    }

    public boolean onPreferenceClick(Preference preference)
    {
        return OrcaInternalPreferenceActivity.a(a, (e)preference, true);
    }
}
