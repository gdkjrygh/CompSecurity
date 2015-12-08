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
//            KikModalPreference

final class u
    implements android.preference.Preference.OnPreferenceClickListener
{

    final android.preference.Preference.OnPreferenceClickListener a;
    final KikModalPreference b;

    u(KikModalPreference kikmodalpreference, android.preference.Preference.OnPreferenceClickListener onpreferenceclicklistener)
    {
        b = kikmodalpreference;
        a = onpreferenceclicklistener;
        super();
    }

    public final boolean onPreferenceClick(Preference preference)
    {
        boolean flag;
        if (!b.onPreferenceClick(preference))
        {
            flag = false;
        } else
        {
            boolean flag1 = a.onPreferenceClick(preference);
            flag = flag1;
            if (flag1)
            {
                preference = new HashMap();
                preference.put("s", Long.valueOf(KikModalPreference.a(b).a()));
                b.b.c().a(com.kik.d.b.a.k.M, null, null, preference, j.b());
                return flag1;
            }
        }
        return flag;
    }
}
