// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget.preferences;

import android.preference.Preference;

// Referenced classes of package kik.android.widget.preferences:
//            KikListPreference

final class s
    implements android.preference.Preference.OnPreferenceClickListener
{

    final android.preference.Preference.OnPreferenceClickListener a;
    final KikListPreference b;

    s(KikListPreference kiklistpreference, android.preference.Preference.OnPreferenceClickListener onpreferenceclicklistener)
    {
        b = kiklistpreference;
        a = onpreferenceclicklistener;
        super();
    }

    public final boolean onPreferenceClick(Preference preference)
    {
        if (a != null)
        {
            a.onPreferenceClick(preference);
        }
        return true;
    }
}
