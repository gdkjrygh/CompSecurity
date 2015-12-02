// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.locale;

import android.content.Context;
import android.text.TextUtils;
import com.qihoo.security.locale.language.a;
import com.qihoo360.mobilesafe.b.i;
import com.qihoo360.mobilesafe.share.SharedPref;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.qihoo.security.locale:
//            d, LocaleInfo

public class c
{

    private static d a = com.qihoo.security.locale.d.a();

    public static int a(Context context)
    {
        return i.e(context, "com.qihoo.security.lite");
    }

    public static String a(String s)
    {
        if ("zh_CN".equals(s))
        {
            return a.a(0x7f0c01d7);
        }
        if ("zh_TW".equals(s))
        {
            return a.a(0x7f0c01d8);
        }
        if ("zh_HK".equals(s))
        {
            return a.a(0x7f0c01d9);
        }
        if ("tl".equals(s))
        {
            return "Filipino";
        }
        Object obj = com.qihoo.security.locale.d.d(s);
        s = ((Locale) (obj)).getDisplayName(((Locale) (obj)));
        try
        {
            obj = (new StringBuilder()).append(s.substring(0, 1).toUpperCase(((Locale) (obj)))).append(s.substring(1)).toString();
        }
        catch (Exception exception)
        {
            return s;
        }
        return ((String) (obj));
    }

    public static String a(Locale locale)
    {
        String s = locale.getLanguage();
        locale = locale.getCountry();
        if (TextUtils.isEmpty(locale))
        {
            return s;
        } else
        {
            return (new StringBuilder()).append(s).append("_").append(locale).toString();
        }
    }

    public static boolean a(Context context, String s)
    {
        return SharedPref.b(context, s, 1) != a(context);
    }

    public static boolean a(Context context, String s, String s1)
    {
        while (TextUtils.isEmpty(s1) || TextUtils.isEmpty(s) || !s.equals(s1) && !s.startsWith(s1) && !s1.startsWith(s)) 
        {
            return false;
        }
        return true;
    }

    public static String b(Context context)
    {
        String s = a(Locale.ENGLISH);
        String s1 = a(Locale.getDefault());
        Object obj = a.f();
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            return ((String) (obj));
        }
        obj = a.g();
        if (obj == null || ((List) (obj)).isEmpty())
        {
            return s;
        }
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
        {
            LocaleInfo localeinfo = (LocaleInfo)((Iterator) (obj)).next();
            if (a(context, localeinfo.locale, s1))
            {
                return localeinfo.locale;
            }
        }

        return s;
    }

    public static void b(Context context, String s)
    {
        SharedPref.a(context, s, i.e(context, "com.qihoo.security.lite"));
    }

    public static boolean c(Context context)
    {
        String s;
        for (s = a(Locale.getDefault()); a(context, s, b(context)) || d(context);)
        {
            return false;
        }

        return com.qihoo.security.locale.language.a.a(s).b();
    }

    public static boolean c(Context context, String s)
    {
        return "1.0.8".equals(SharedPref.b(context, (new StringBuilder()).append(s).append("_").append("1.0.8").toString(), ""));
    }

    private static boolean d(Context context)
    {
        boolean flag = false;
        String s = a(Locale.getDefault());
        if (TextUtils.isEmpty(s) || s.length() < 2)
        {
            flag = true;
        } else
        {
            String s1 = s.substring(0, 2);
            if (c(context, (new StringBuilder()).append("key_language_asyn_check_").append(s).toString()) || c(context, (new StringBuilder()).append("key_language_asyn_check_").append(s1).toString()))
            {
                return true;
            }
        }
        return flag;
    }

}
