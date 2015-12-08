// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.pref;

import android.content.Context;
import android.content.res.Resources;
import android.preference.Preference;
import android.preference.PreferenceGroup;
import android.text.TextUtils;
import com.google.android.apps.translate.h;
import com.google.android.apps.translate.r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.translate.pref:
//            f, c, d, e, 
//            g

public final class b
    implements android.preference.Preference.OnPreferenceClickListener
{

    private final Context a;

    public b(Preference preference, Preference preference1)
    {
        a = preference.getContext();
        Object obj = new Preference(a);
        ((Preference) (obj)).setTitle("TWS host");
        ((Preference) (obj)).setKey("tws_host");
        ((Preference) (obj)).setOnPreferenceClickListener(this);
        ((Preference) (obj)).setSummary("Translate server host to be used by this app");
        ((PreferenceGroup)preference).addPreference(((Preference) (obj)));
        Preference preference2 = new Preference(a);
        preference2.setTitle("Speech server (single-language)");
        preference2.setKey("single_speech_server");
        preference2.setOnPreferenceClickListener(this);
        obj = com.google.android.libraries.translate.core.b.f(a, null);
        preference = ((Preference) (obj));
        if (obj == null)
        {
            preference = "Translate server host to be used by this app for single language recognition";
        }
        preference2.setSummary(preference);
        ((PreferenceGroup)preference1).addPreference(preference2);
        preference2 = new Preference(a);
        preference2.setTitle("Speech server (multi-language)");
        preference2.setKey("multi_speech_server");
        preference2.setOnPreferenceClickListener(this);
        obj = com.google.android.libraries.translate.core.b.g(a, null);
        preference = ((Preference) (obj));
        if (obj == null)
        {
            preference = "Translate server host to be used by this app for multi language recognition";
        }
        preference2.setSummary(preference);
        ((PreferenceGroup)preference1).addPreference(preference2);
    }

    static Context a(b b1)
    {
        return b1.a;
    }

    private boolean a(Preference preference, String s, String s1, int i, g g)
    {
        Object obj = Arrays.asList(a.getResources().getStringArray(i));
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            String as1[] = TextUtils.split((String)((Iterator) (obj)).next(), "\\|");
            if (as1.length == 2)
            {
                arraylist.add(as1[0]);
                arraylist1.add(as1[1]);
            }
        } while (true);
        String as[] = new String[arraylist.size()];
        String as2[] = new String[arraylist.size()];
        i = 0;
        int j = 0;
        for (; i < as.length; i++)
        {
            String s2 = (String)arraylist.get(i);
            String s3 = (String)arraylist1.get(i);
            as[i] = (new StringBuilder(String.valueOf(s2).length() + 2 + String.valueOf(s3).length())).append(s2).append(": ").append(s3).toString();
            as2[i] = s2;
            if (j == 0 && TextUtils.equals(s2, s1))
            {
                j = i;
            }
        }

        (new android.app.AlertDialog.Builder(a)).setTitle(s).setNegativeButton(0x1040000, null).setSingleChoiceItems(as, j, new f(preference, as2, g)).show();
        return true;
    }

    public final boolean onPreferenceClick(Preference preference)
    {
        if (TextUtils.equals(preference.getKey(), "tws_host"))
        {
            return a(preference, "TWS host", com.google.android.libraries.translate.core.b.e(a), h.tws_hosts, new c(this));
        }
        if (TextUtils.equals(preference.getKey(), "single_speech_server"))
        {
            return a(preference, "Speech service (single language)", com.google.android.libraries.translate.core.b.f(a, a.getString(r.default_single_speech_service)), h.speech_services, new d(this));
        }
        if (TextUtils.equals(preference.getKey(), "multi_speech_server"))
        {
            return a(preference, "Speech service (multi-language)", com.google.android.libraries.translate.core.b.g(a, a.getString(r.default_multi_speech_service)), h.speech_services, new e(this));
        } else
        {
            return false;
        }
    }
}
