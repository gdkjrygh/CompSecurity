// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.Locale;

public final class ghq
{

    public static String a(Locale locale)
    {
        Locale locale1;
label0:
        {
            if (locale != null)
            {
                locale1 = locale;
                if (!TextUtils.isEmpty(locale.getLanguage()))
                {
                    break label0;
                }
            }
            locale1 = Locale.ENGLISH;
        }
        String s = locale1.getLanguage();
        locale = s;
        if (s.length() > 0)
        {
            locale = s;
            if (locale1.getCountry().length() > 0)
            {
                locale = (new StringBuilder()).append(s).append("_").append(locale1.getCountry()).toString();
            }
        }
        return locale;
    }
}
