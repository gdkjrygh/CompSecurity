// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget.preferences;

import android.preference.ListPreference;
import android.preference.Preference;

// Referenced classes of package kik.android.widget.preferences:
//            AutoplayVideoPreference

final class a
    implements android.preference.Preference.OnPreferenceChangeListener
{

    final AutoplayVideoPreference a;

    a(AutoplayVideoPreference autoplayvideopreference)
    {
        a = autoplayvideopreference;
        super();
    }

    public final boolean onPreferenceChange(Preference preference, Object obj)
    {
        if (obj != null)
        {
            int i = ((ListPreference)preference).findIndexOfValue(obj.toString());
            if (i >= 0 && i < com.kik.android.a.b.length)
            {
                a.a.b("AutoPlay Videos Set").a("AutoPlay Videos Setting", com.kik.android.a.b[i]).b();
            }
        }
        return true;
    }
}
