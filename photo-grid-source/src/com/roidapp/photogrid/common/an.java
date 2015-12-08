// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Process;
import android.preference.PreferenceManager;
import java.util.Locale;

public final class an
{

    private static SharedPreferences a;

    public static int a(Context context)
    {
        b(context);
        return a.getInt("language", -1);
    }

    public static Locale a(Context context, int i)
    {
        switch (i)
        {
        default:
            return context.getResources().getConfiguration().locale;

        case 0: // '\0'
            return Locale.ENGLISH;

        case 1: // '\001'
            return Locale.GERMANY;

        case 2: // '\002'
            return Locale.FRENCH;

        case 3: // '\003'
            return Locale.JAPANESE;

        case 4: // '\004'
            return Locale.KOREAN;

        case 5: // '\005'
            return new Locale("th", "TH");

        case 6: // '\006'
            return Locale.SIMPLIFIED_CHINESE;

        case 7: // '\007'
            return Locale.TAIWAN;

        case 8: // '\b'
            return new Locale("es");

        case 9: // '\t'
            return new Locale("ar");

        case 10: // '\n'
            return new Locale("tr");

        case 11: // '\013'
            return new Locale("ru");

        case 12: // '\f'
            return new Locale("hi");

        case 13: // '\r'
            return new Locale("in");

        case 14: // '\016'
            return new Locale("it");

        case 15: // '\017'
            return new Locale("ms");

        case 16: // '\020'
            return new Locale("pt");

        case 17: // '\021'
            return new Locale("uk");

        case 18: // '\022'
            return new Locale("vi");

        case 19: // '\023'
            return new Locale("fa");

        case 20: // '\024'
            return new Locale("pl");

        case 21: // '\025'
            return new Locale("az");

        case 22: // '\026'
            return new Locale("da");

        case 23: // '\027'
            return new Locale("no");

        case 24: // '\030'
            return new Locale("iw");

        case 25: // '\031'
            return new Locale("nl");

        case 26: // '\032'
            return new Locale("ro");

        case 27: // '\033'
            return new Locale("el");

        case 28: // '\034'
            return new Locale("cs");

        case 29: // '\035'
            return new Locale("hu");

        case 30: // '\036'
            return new Locale("bg");

        case 31: // '\037'
            return new Locale("sv");

        case 32: // ' '
            return new Locale("sr");
        }
    }

    public static void a(Bundle bundle)
    {
        bundle.putInt("photogrid_current_process_id", Process.myPid());
    }

    private static void b(Context context)
    {
        if (a == null)
        {
            a = PreferenceManager.getDefaultSharedPreferences(context);
        }
    }

    public static void b(Context context, int i)
    {
        Object obj = a(context, i);
        Configuration configuration = context.getResources().getConfiguration();
        configuration.locale = ((Locale) (obj));
        b(context);
        obj = a.edit();
        ((android.content.SharedPreferences.Editor) (obj)).putInt("language", i);
        ((android.content.SharedPreferences.Editor) (obj)).apply();
        context.getResources().updateConfiguration(configuration, null);
    }

    public static boolean b(Bundle bundle)
    {
        return bundle != null && bundle.getInt("photogrid_current_process_id") != Process.myPid();
    }
}
