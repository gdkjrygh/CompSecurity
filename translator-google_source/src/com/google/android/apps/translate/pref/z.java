// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.pref;

import android.content.Context;
import android.content.res.Resources;
import android.preference.Preference;
import android.preference.PreferenceGroup;
import android.text.TextUtils;
import com.google.android.apps.translate.r;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.core.b;
import com.google.android.libraries.translate.core.k;
import com.google.android.libraries.translate.e.f;
import com.google.android.libraries.translate.languages.Language;
import com.google.android.libraries.translate.languages.d;
import com.google.android.libraries.translate.speech.c;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.apps.translate.pref:
//            aa

public final class z
    implements android.preference.Preference.OnPreferenceClickListener
{

    private final PreferenceGroup a;
    private final Context b;
    private final c c;
    private final d d;
    private final Map e = Maps.b();

    public z(Preference preference)
    {
        a = (PreferenceGroup)preference;
        b = a.getContext();
        c = (c)Singleton.e.b();
        d = f.a(b);
        java.util.HashMap hashmap = Maps.b();
        preference = c;
        Object obj = new ArrayList(((c) (preference)).a);
        ((List) (obj)).addAll(((c) (preference)).d);
        Iterator iterator = ((List) (obj)).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s1 = (String)iterator.next();
            String s2 = f.b(s1);
            if (!TextUtils.isEmpty(s2))
            {
                obj = (List)hashmap.get(s2);
                preference = ((Preference) (obj));
                if (obj == null)
                {
                    preference = new ArrayList();
                    hashmap.put(s2, preference);
                }
                if (!preference.contains(s1))
                {
                    preference.add(s1);
                }
            }
        } while (true);
        preference = new ArrayList();
        obj = hashmap.entrySet().iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
            if (((List)entry.getValue()).size() >= 2)
            {
                Language language1 = d.c((String)entry.getKey());
                if (language1 != null)
                {
                    preference.add(language1);
                    e.put(entry.getKey(), entry.getValue());
                }
            }
        } while (true);
        Collections.sort(preference);
        preference = preference.iterator();
        while (preference.hasNext()) 
        {
            Language language = (Language)preference.next();
            Preference preference1 = new Preference(b);
            preference1.setTitle(language.getLongName());
            preference1.setKey(language.getShortName());
            preference1.setOnPreferenceClickListener(this);
            String s = com.google.android.libraries.translate.core.b.h(b, language.getShortName());
            if (!s.equals(""))
            {
                preference1.setSummary(a(language, s));
            } else
            {
                preference1.setSummary(r.label_default_dialect);
            }
            a.addPreference(preference1);
        }
    }

    private String a(Language language, String s)
    {
        String s1 = String.valueOf("lang_");
        String s2 = String.valueOf(s.toLowerCase(Locale.ENGLISH).replace('-', '_'));
        int i;
        if (s2.length() != 0)
        {
            s1 = s1.concat(s2);
        } else
        {
            s1 = new String(s1);
        }
        i = b.getResources().getIdentifier(s1, "string", b.getPackageName());
        if (i != 0)
        {
            return b.getString(i);
        } else
        {
            return b.getString(r.voice_dialect_display_format, new Object[] {
                language, s
            });
        }
    }

    public final boolean onPreferenceClick(Preference preference)
    {
        String s = preference.getKey();
        Language language = d.c(s);
        Object obj = (List)e.get(s);
        if (obj == null || language == null)
        {
            return false;
        }
        s = com.google.android.libraries.translate.core.b.h(b, s);
        ArrayList arraylist = new ArrayList();
        String s1;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); arraylist.add(new Language(s1, a(language, s1))))
        {
            s1 = (String)((Iterator) (obj)).next();
        }

        Collections.sort(arraylist);
        String as[] = new String[arraylist.size() + 1];
        String as1[] = new String[arraylist.size() + 1];
        as[0] = b.getString(r.label_default_dialect);
        as1[0] = "";
        int j = 0;
        for (int i = 1; i < as.length; i++)
        {
            Language language1 = (Language)arraylist.get(i - 1);
            as[i] = language1.toString();
            as1[i] = language1.getShortName();
            if (as1[i].equals(s))
            {
                j = i;
            }
        }

        (new android.app.AlertDialog.Builder(b)).setTitle(r.title_voice_input_dialects).setNegativeButton(0x1040000, null).setSingleChoiceItems(as, j, new aa(preference, as, as1)).show();
        return true;
    }
}
