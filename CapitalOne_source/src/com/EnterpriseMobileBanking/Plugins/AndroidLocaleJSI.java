// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking.Plugins;

import android.content.Context;
import android.content.res.Resources;
import com.EnterpriseMobileBanking.AppHelper;
import com.EnterpriseMobileBanking.Utils.Log;
import com.capitalone.mobile.banking.app.Application;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public final class AndroidLocaleJSI
{

    private static final String TAG = "AndroidLocaleJSI";
    private static final AndroidLocaleJSI instance = new AndroidLocaleJSI();
    private static final String isoCountry;
    private static final String languageCountry = buildLanguageCountry();
    private static final boolean skipLanding = setSkipLanding();

    private AndroidLocaleJSI()
    {
    }

    private static String buildLanguageCountry()
    {
        Context context = Application.getCurrentContext();
        String s = context.getResources().getString(0x7f09008b);
        HashSet hashset = new HashSet();
        HashMap hashmap = new HashMap();
        String as[] = context.getResources().getStringArray(0x7f0c0001);
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            String as1[] = as[i].split("\\|");
            if (as1.length == 2)
            {
                hashmap.put(as1[0], as1[1]);
            }
        }

        hashset.addAll(hashmap.values());
        hashset.addAll(Arrays.asList(context.getResources().getStringArray(0x7f0c0002)));
        Log.d("AndroidLocaleJSI", (new StringBuilder()).append("Locale Country: ").append(isoCountry).toString());
        if (hashmap.containsKey(isoCountry.toLowerCase()))
        {
            String s1 = (new StringBuilder()).append(Locale.getDefault().getLanguage().toLowerCase()).append("-").append(isoCountry.toLowerCase()).toString();
            Log.d("AndroidLocaleJSI", (new StringBuilder()).append("Langauge Country as defined by OS: ").append(s1).toString());
            s = s1;
            if (!hashset.contains(s1))
            {
                s = (String)hashmap.get(isoCountry.toLowerCase());
            }
        }
        Log.d("AndroidLocaleJSI", (new StringBuilder()).append("Language Country set to: ").append(s).toString());
        return s;
    }

    public static String getCountryCode()
    {
        return isoCountry;
    }

    public static AndroidLocaleJSI getInstance()
    {
        return instance;
    }

    private static boolean setSkipLanding()
    {
        return Arrays.asList(Application.getCurrentContext().getResources().getStringArray(0x7f0c0000)).contains(isoCountry.toLowerCase());
    }

    public String getCountryName()
    {
        if (AppHelper.isCanadianApp())
        {
            return "canada";
        } else
        {
            return "united states";
        }
    }

    public String getLanguageCountry()
    {
        return languageCountry;
    }

    public boolean skipLanding()
    {
        return skipLanding;
    }

    static 
    {
        String s;
        if (AppHelper.isCanadianApp())
        {
            s = "CA";
        } else
        {
            s = "US";
        }
        isoCountry = s;
    }
}
