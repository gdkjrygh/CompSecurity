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
//            KikCheckBoxPreference

final class h
    implements android.preference.Preference.OnPreferenceChangeListener
{

    final android.preference.Preference.OnPreferenceChangeListener a;
    final KikCheckBoxPreference b;

    h(KikCheckBoxPreference kikcheckboxpreference, android.preference.Preference.OnPreferenceChangeListener onpreferencechangelistener)
    {
        b = kikcheckboxpreference;
        a = onpreferencechangelistener;
        super();
    }

    public final boolean onPreferenceChange(Preference preference, Object obj)
    {
        boolean flag = b.onPreferenceChange(preference, obj);
        boolean flag1;
        if (!flag)
        {
            flag1 = false;
        } else
        {
            if (a != null)
            {
                flag = a.onPreferenceChange(preference, obj);
            }
            flag1 = flag;
            if (flag)
            {
                b.c();
                preference = new HashMap();
                preference.put("s", Long.valueOf(KikCheckBoxPreference.a(b).a()));
                b.a.c().a(com.kik.d.b.a.k.M, null, null, preference, j.b());
                return flag;
            }
        }
        return flag1;
    }
}
