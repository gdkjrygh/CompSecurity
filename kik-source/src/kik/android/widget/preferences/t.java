// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget.preferences;

import android.preference.Preference;

// Referenced classes of package kik.android.widget.preferences:
//            KikModalPreference

final class t
    implements android.preference.Preference.OnPreferenceClickListener
{

    final KikModalPreference a;

    t(KikModalPreference kikmodalpreference)
    {
        a = kikmodalpreference;
        super();
    }

    public final boolean onPreferenceClick(Preference preference)
    {
        return false;
    }
}
