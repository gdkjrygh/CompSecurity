// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget.preferences;

import android.preference.ListPreference;
import android.preference.Preference;
import com.kik.android.a;

// Referenced classes of package kik.android.widget.preferences:
//            KikVideoPrefetchPreference

final class ai
    implements android.preference.Preference.OnPreferenceChangeListener
{

    final KikVideoPrefetchPreference a;

    ai(KikVideoPrefetchPreference kikvideoprefetchpreference)
    {
        a = kikvideoprefetchpreference;
        super();
    }

    public final boolean onPreferenceChange(Preference preference, Object obj)
    {
        if (obj != null)
        {
            int i = ((ListPreference)preference).findIndexOfValue(obj.toString());
            if (i >= 0 && i < a.a.length)
            {
                a.a.b("Auto Download Videos Set").a("Auto Download Videos Setting", a.a[i]).b();
            }
        }
        return true;
    }
}
