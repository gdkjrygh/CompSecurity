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
//            KikPreference

final class aa
    implements android.preference.Preference.OnPreferenceClickListener
{

    final android.preference.Preference.OnPreferenceClickListener a;
    final KikPreference b;

    aa(KikPreference kikpreference, android.preference.Preference.OnPreferenceClickListener onpreferenceclicklistener)
    {
        b = kikpreference;
        a = onpreferenceclicklistener;
        super();
    }

    public final boolean onPreferenceClick(Preference preference)
    {
        boolean flag = b.onPreferenceClick(preference);
        boolean flag1 = a.onPreferenceClick(preference);
        if (KikPreference.a(b) != null)
        {
            preference = new HashMap();
            preference.put("s", Long.valueOf(KikPreference.a(b).a()));
            b.a.c().a(com.kik.d.b.a.k.M, null, null, preference, j.b());
        }
        return flag | flag1;
    }
}
