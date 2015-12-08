// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget.preferences;

import android.preference.Preference;
import com.kik.d.f;
import java.util.HashMap;
import java.util.Map;
import kik.a.e.e;
import kik.a.h.j;

// Referenced classes of package kik.android.widget.preferences:
//            KikEditTextPreference

final class k
    implements android.preference.Preference.OnPreferenceChangeListener
{

    final android.preference.Preference.OnPreferenceChangeListener a;
    final KikEditTextPreference b;

    k(KikEditTextPreference kikedittextpreference, android.preference.Preference.OnPreferenceChangeListener onpreferencechangelistener)
    {
        b = kikedittextpreference;
        a = onpreferencechangelistener;
        super();
    }

    public final boolean onPreferenceChange(Preference preference, Object obj)
    {
        boolean flag = b.onPreferenceChange(preference, obj) | a.onPreferenceChange(preference, obj);
        if (flag)
        {
            preference = new HashMap();
            preference.put("s", Long.valueOf(KikEditTextPreference.a(b).a()));
            b.a.c().a(com.kik.d.b.a.k.M, null, null, preference, j.b());
        }
        return flag;
    }
}
