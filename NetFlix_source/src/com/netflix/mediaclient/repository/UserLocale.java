// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.repository;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.netflix.mediaclient.Log;
import java.util.Locale;
import java.util.StringTokenizer;

public final class UserLocale
{

    private static final String RAW_DELIMITER = "-";
    private static final String TAG = "nf_user_locale";
    private String language;
    private String languageDescription;
    private Locale locale;
    private String raw;
    private String region;

    public UserLocale(String s)
    {
        validateNonEmpty(s, "raw");
        raw = s.trim();
        parseRaw();
        init();
    }

    public UserLocale(String s, String s1, String s2)
    {
        validateNonEmpty(s, "language");
        validateNonEmpty(s2, "languageDescription");
        language = s.trim().toLowerCase();
        region = s1;
        if (region != null)
        {
            region = region.trim().toUpperCase();
        }
        languageDescription = s2.trim();
        createRaw();
        init();
    }

    private void createRaw()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(language);
        if (region != null)
        {
            stringbuilder.append("-");
            stringbuilder.append(region);
        }
        raw = stringbuilder.toString();
    }

    public static Locale getDeviceLocale(Context context)
    {
        context = context.getApplicationContext().getResources().getConfiguration().locale;
        if (Log.isLoggable("nf_user_locale", 3))
        {
            Log.d("nf_user_locale", (new StringBuilder()).append("Current device locale is ").append(context).toString());
        }
        return context;
    }

    public static String getRawDeviceLocale(Context context)
    {
        return toUserLocale(getDeviceLocale(context));
    }

    private void init()
    {
        if (region == null || "".equals(region))
        {
            locale = new Locale(language);
            return;
        } else
        {
            locale = new Locale(language, region);
            return;
        }
    }

    private void parseRaw()
    {
        StringTokenizer stringtokenizer = new StringTokenizer(raw, "-");
        if (stringtokenizer.countTokens() < 1 || stringtokenizer.countTokens() > 2)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid format of raw: ").append(raw).toString());
        }
        int i = 0;
        while (stringtokenizer.hasMoreTokens()) 
        {
            String s = stringtokenizer.nextToken();
            if (i == 0)
            {
                language = s.toLowerCase();
            } else
            if (i == 1)
            {
                region = s.toUpperCase();
            } else
            {
                Log.w("nf_user_locale", (new StringBuilder()).append("Unexpected token in given prefered language. Token ").append(i).append(": ").append(s).toString());
            }
            i++;
        }
    }

    public static String toUserLocale(Locale locale1)
    {
        if (locale1 == null)
        {
            return null;
        }
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(locale1.getLanguage());
        if (locale1.getCountry() != null && !"".equals(locale1.getCountry().trim()))
        {
            stringbuilder.append("-");
            stringbuilder.append(locale1.getCountry());
        }
        return stringbuilder.toString();
    }

    private void validateNonEmpty(String s, String s1)
    {
        if (s == null || "".equals(s.trim()))
        {
            throw new IllegalArgumentException((new StringBuilder()).append(s1).append(" argument can not be empty!").toString());
        } else
        {
            return;
        }
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null)
        {
            return false;
        }
        if (!(obj instanceof UserLocale))
        {
            return false;
        }
        obj = (UserLocale)obj;
        if (raw != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((UserLocale) (obj)).raw == null) goto _L1; else goto _L3
_L3:
        return false;
        if (raw.equals(((UserLocale) (obj)).raw)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public boolean equalsByLanguage(UserLocale userlocale)
    {
        if (userlocale != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (language != null) goto _L4; else goto _L3
_L3:
        if (userlocale.language != null) goto _L1; else goto _L5
_L5:
        return true;
_L4:
        if (!language.equalsIgnoreCase(userlocale.language))
        {
            return false;
        }
        if (true) goto _L5; else goto _L6
_L6:
    }

    public String getLanguage()
    {
        return language;
    }

    public String getLanguageDescription()
    {
        return languageDescription;
    }

    public Locale getLocale()
    {
        return locale;
    }

    public String getRaw()
    {
        return raw;
    }

    public String getRegion()
    {
        return region;
    }

    public int hashCode()
    {
        int i;
        if (raw == null)
        {
            i = 0;
        } else
        {
            i = raw.hashCode();
        }
        return i + 31;
    }

    public String toString()
    {
        return (new StringBuilder()).append("UserLocale [language=").append(language).append(", languageDescription=").append(languageDescription).append(", locale=").append(locale).append(", raw=").append(raw).append(", region=").append(region).append("]").toString();
    }
}
