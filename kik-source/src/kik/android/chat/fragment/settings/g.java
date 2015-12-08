// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment.settings;

import android.preference.Preference;
import kik.android.chat.activity.k;
import kik.android.widget.preferences.KikPreferenceScreen;

// Referenced classes of package kik.android.chat.fragment.settings:
//            PreferenceFragment

final class g
    implements android.preference.Preference.OnPreferenceClickListener
{

    final KikPreferenceScreen a;
    final PreferenceFragment b;

    g(PreferenceFragment preferencefragment, KikPreferenceScreen kikpreferencescreen)
    {
        b = preferencefragment;
        a = kikpreferencescreen;
        super();
    }

    public final boolean onPreferenceClick(Preference preference)
    {
        preference = new KikPreferenceFragment.a();
        preference.a(a.d()).a().b(a.e());
        k.a(preference, b.getActivity()).f();
        return true;
    }
}
