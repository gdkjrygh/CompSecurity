// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget.preferences;

import android.preference.Preference;

// Referenced classes of package kik.android.widget.preferences:
//            KikEditTextPreference

final class j
    implements android.preference.Preference.OnPreferenceChangeListener
{

    final KikEditTextPreference a;

    j(KikEditTextPreference kikedittextpreference)
    {
        a = kikedittextpreference;
        super();
    }

    public final boolean onPreferenceChange(Preference preference, Object obj)
    {
        return false;
    }
}
