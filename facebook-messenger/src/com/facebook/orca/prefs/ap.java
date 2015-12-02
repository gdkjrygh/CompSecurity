// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.prefs;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.preference.Preference;
import com.facebook.c.s;

// Referenced classes of package com.facebook.orca.prefs:
//            OrcaRootPreferenceActivity

class ap
    implements android.preference.Preference.OnPreferenceClickListener
{

    final Context a;
    final OrcaRootPreferenceActivity b;

    ap(OrcaRootPreferenceActivity orcarootpreferenceactivity, Context context)
    {
        b = orcarootpreferenceactivity;
        a = context;
        super();
    }

    public boolean onPreferenceClick(Preference preference)
    {
        preference = new Intent("android.intent.action.VIEW", Uri.parse("https://m.facebook.com/privacy/"));
        OrcaRootPreferenceActivity.a(b).b(preference, a);
        return true;
    }
}
