// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.core;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.preference.PreferenceManager;
import com.google.android.libraries.translate.e.f;
import com.google.android.libraries.translate.languages.Language;
import com.google.android.libraries.translate.languages.c;
import com.google.android.libraries.translate.languages.d;
import com.google.android.libraries.translate.tts.MyTts;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public final class b
{

    private static final String a[] = {
        "ALL", "SPEECH", "CAMERA", "PHOTO", "HANDWRITING", "OFFLINE"
    };

    public static String a(Context context)
    {
        return a(context, Locale.getDefault());
    }

    public static String a(Context context, Locale locale)
    {
        String s = String.valueOf("key_language_list_with_locale_");
        locale = String.valueOf(com.google.android.libraries.translate.e.f.a(locale));
        if (locale.length() != 0)
        {
            locale = s.concat(locale);
        } else
        {
            locale = new String(s);
        }
        return PreferenceManager.getDefaultSharedPreferences(context).getString(locale, "");
    }

    public static String a(String s)
    {
        return com.google.android.libraries.translate.languages.c.b(s);
    }

    private static final String a(String s, String s1)
    {
        String s2 = String.valueOf("key_prompt_wl_download");
        String s3 = String.valueOf("\t");
        return (new StringBuilder(String.valueOf(s2).length() + 0 + String.valueOf(s).length() + String.valueOf(s3).length() + String.valueOf(s1).length())).append(s2).append(s).append(s3).append(s1).toString();
    }

    private static List a(Context context, String s, d d1)
    {
        context = PreferenceManager.getDefaultSharedPreferences(context).getString(s, "");
        ArrayList arraylist = new ArrayList();
        String as[] = context.split("\t");
        int j1 = as.length;
        int i1 = 0;
        while (i1 < j1) 
        {
            String s1 = as[i1];
            context = null;
            if ("key_recent_language_from".equals(s))
            {
                context = d1.a(s1);
            } else
            if ("key_recent_language_to".equals(s))
            {
                context = d1.c(s1);
            }
            if (context != null)
            {
                arraylist.add(context);
            }
            i1++;
        }
        return arraylist;
    }

    public static void a(Context context, Language language, Language language1)
    {
        a(context, language, language1, "");
    }

    private static void a(Context context, Language language, Language language1, String s)
    {
        if (language == null || language1 == null)
        {
            return;
        }
        android.content.SharedPreferences.Editor editor = PreferenceManager.getDefaultSharedPreferences(context).edit();
        String s1 = String.valueOf("key_language_from");
        String s2 = String.valueOf(s);
        if (s2.length() != 0)
        {
            s1 = s1.concat(s2);
        } else
        {
            s1 = new String(s1);
        }
        editor.putString(s1, language.getShortName());
        s1 = String.valueOf("key_language_to");
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            s = s1.concat(s);
        } else
        {
            s = new String(s1);
        }
        editor.putString(s, language1.getShortName());
        editor.commit();
        a(context, language, "key_recent_language_from");
        a(context, language1, "key_recent_language_to");
    }

    private static void a(Context context, Language language, String s)
    {
        if (language == null || com.google.android.libraries.translate.e.f.a(language))
        {
            return;
        }
        String as[] = PreferenceManager.getDefaultSharedPreferences(context).getString(s, "").split("\t");
        context = PreferenceManager.getDefaultSharedPreferences(context).edit();
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(language.getShortName());
        int l1 = as.length;
        int j1 = 1;
        for (int i1 = 0; i1 < l1;)
        {
            String s1 = as[i1];
            if (j1 >= 5)
            {
                break;
            }
            int k1 = j1;
            if (!language.getShortName().equals(s1))
            {
                stringbuilder.append("\t").append(s1);
                k1 = j1 + 1;
            }
            i1++;
            j1 = k1;
        }

        context.putString(s, stringbuilder.toString());
        context.commit();
    }

    public static void a(Context context, String s)
    {
        SharedPreferences sharedpreferences = PreferenceManager.getDefaultSharedPreferences(context);
        context = String.valueOf("key_tooltip_shown_count");
        s = String.valueOf(s);
        int i1;
        if (s.length() != 0)
        {
            context = context.concat(s);
        } else
        {
            context = new String(context);
        }
        i1 = sharedpreferences.getInt(context, 0);
        sharedpreferences.edit().putInt(context, i1 + 1).commit();
    }

    public static void a(Context context, String s, String s1)
    {
        context = PreferenceManager.getDefaultSharedPreferences(context);
        int i1 = context.getInt(a(s, s1), 0);
        context.edit().putInt(a(s, s1), i1 + 1).commit();
    }

    public static void a(Context context, String s, Locale locale)
    {
        String s1 = String.valueOf("key_language_list_with_locale_");
        locale = String.valueOf(com.google.android.libraries.translate.e.f.a(locale));
        if (locale.length() != 0)
        {
            locale = s1.concat(locale);
        } else
        {
            locale = new String(s1);
        }
        PreferenceManager.getDefaultSharedPreferences(context).edit().putString(locale, s).commit();
    }

    public static void a(Context context, boolean flag)
    {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("key_enable_camera_logging", flag).commit();
    }

    public static boolean a(Context context, int i1)
    {
        String s = String.valueOf("key_tour_seen_");
        String s1 = String.valueOf(a[i1]);
        if (s1.length() != 0)
        {
            s = s.concat(s1);
        } else
        {
            s = new String(s);
        }
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean(s, false);
    }

    public static boolean a(Context context, Language language)
    {
        if (language == null)
        {
            return false;
        } else
        {
            language = com.google.android.libraries.translate.languages.c.b(language.getShortName());
            return Arrays.asList(context.getResources().getStringArray(com.google.android.libraries.translate.b.handwritingLanguages)).contains(language);
        }
    }

    public static Language[] a(Context context, d d1)
    {
        return a(context, d1, "");
    }

    private static Language[] a(Context context, d d1, String s)
    {
        SharedPreferences sharedpreferences = PreferenceManager.getDefaultSharedPreferences(context);
        context = String.valueOf("key_language_from");
        String s1 = String.valueOf(s);
        if (s1.length() != 0)
        {
            context = context.concat(s1);
        } else
        {
            context = new String(context);
        }
        s1 = sharedpreferences.getString(context, d1.a().getShortName());
        context = String.valueOf("key_language_to");
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            context = context.concat(s);
        } else
        {
            context = new String(context);
        }
        context = sharedpreferences.getString(context, d1.b().getShortName());
        return (new Language[] {
            d1.b(s1), d1.c(context)
        });
    }

    public static int b(Context context, String s)
    {
        SharedPreferences sharedpreferences = PreferenceManager.getDefaultSharedPreferences(context);
        context = String.valueOf("key_tooltip_shown_count");
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            context = context.concat(s);
        } else
        {
            context = new String(context);
        }
        return sharedpreferences.getInt(context, 0);
    }

    public static int b(Context context, String s, String s1)
    {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt(a(s, s1), 0);
    }

    public static void b(Context context, int i1)
    {
        SharedPreferences sharedpreferences = PreferenceManager.getDefaultSharedPreferences(context);
        context = String.valueOf("key_tour_seen_");
        String s = String.valueOf(a[i1]);
        if (s.length() != 0)
        {
            context = context.concat(s);
        } else
        {
            context = new String(context);
        }
        sharedpreferences.edit().putBoolean(context, true).commit();
    }

    public static void b(Context context, Language language, Language language1)
    {
        a(context, language, language1, "_quick");
    }

    public static void b(Context context, boolean flag)
    {
        if (!PreferenceManager.getDefaultSharedPreferences(context).contains("key_disable_tts_cache"))
        {
            PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("key_disable_tts_cache", flag).commit();
        }
    }

    public static boolean b(Context context)
    {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("key_enable_camera_logging", false);
    }

    public static Language[] b(Context context, d d1)
    {
        return a(context, d1, "_quick");
    }

    public static List c(Context context, d d1)
    {
        return a(context, "key_recent_language_from", d1);
    }

    public static void c(Context context, int i1)
    {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putInt("key_favorite_order", i1).commit();
    }

    public static void c(Context context, String s)
    {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putString("key_tws_host", s).commit();
    }

    public static void c(Context context, String s, String s1)
    {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putString(s, s1).commit();
    }

    public static void c(Context context, boolean flag)
    {
        if (!PreferenceManager.getDefaultSharedPreferences(context).contains("key_disable_translation_cache"))
        {
            PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("key_disable_translation_cache", flag).commit();
        }
    }

    public static boolean c(Context context)
    {
        return !PreferenceManager.getDefaultSharedPreferences(context).contains("key_enable_camera_logging");
    }

    public static List d(Context context, d d1)
    {
        return a(context, "key_recent_language_to", d1);
    }

    public static void d(Context context, String s)
    {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putString("key_s3_single_speech_service", s).commit();
    }

    public static void d(Context context, boolean flag)
    {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("key_camera_instant_on", flag).commit();
    }

    public static boolean d(Context context)
    {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("key_prefer_network_tts", true);
    }

    public static String e(Context context)
    {
        return PreferenceManager.getDefaultSharedPreferences(context).getString("key_tws_host", "translate.google.com");
    }

    public static void e(Context context, String s)
    {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putString("key_s3_multi_speech_service", s).commit();
    }

    public static int f(Context context)
    {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt("key_favorite_order", 1);
    }

    public static String f(Context context, String s)
    {
        return PreferenceManager.getDefaultSharedPreferences(context).getString("key_s3_single_speech_service", s);
    }

    public static String g(Context context, String s)
    {
        return PreferenceManager.getDefaultSharedPreferences(context).getString("key_s3_multi_speech_service", s);
    }

    public static boolean g(Context context)
    {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("key_auto_speak", true);
    }

    public static String h(Context context, String s)
    {
        return PreferenceManager.getDefaultSharedPreferences(context).getString(s, "");
    }

    public static boolean h(Context context)
    {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("key_profanity_filter", true);
    }

    public static com.google.android.libraries.translate.tts.c i(Context context, String s)
    {
        SharedPreferences sharedpreferences = PreferenceManager.getDefaultSharedPreferences(context);
        context = String.valueOf("key_tts_dialect_");
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            context = context.concat(s);
        } else
        {
            context = new String(context);
        }
        return MyTts.a(sharedpreferences.getString(context, ""));
    }

    public static boolean i(Context context)
    {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("key_multilang_speech_input", true);
    }

    public static boolean j(Context context)
    {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("key_camera_instant_on", true);
    }

    public static boolean j(Context context, String s)
    {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("key_use_translate_s2s_single", Boolean.valueOf(s).booleanValue());
    }

    public static boolean k(Context context)
    {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("key_allow_offline_handwriting", false);
    }

    public static boolean k(Context context, String s)
    {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("key_use_translate_s2s_multi", Boolean.valueOf(s).booleanValue());
    }

    public static boolean l(Context context)
    {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("key_copydrop_enable", false);
    }

}
