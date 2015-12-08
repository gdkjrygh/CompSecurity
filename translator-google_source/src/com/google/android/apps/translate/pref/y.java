// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.pref;

import android.app.Activity;
import android.preference.Preference;

// Referenced classes of package com.google.android.apps.translate.pref:
//            v, SubPrefsFragment

final class y extends v
{

    final SubPrefsFragment c;

    y(SubPrefsFragment subprefsfragment, int i, Activity activity)
    {
        c = subprefsfragment;
        super(i, activity);
    }

    final Preference a(String s)
    {
        return c.findPreference(s);
    }

    final void a(int i)
    {
        c.addPreferencesFromResource(i);
    }
}
