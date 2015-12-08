// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.utilities;

import android.content.Context;
import android.text.Html;

// Referenced classes of package com.accuweather.android.utilities:
//            PartnerCoding

public class TermsAndConditionsUtilities
{

    public static final String EULA_URL = "http://m.accuweather.com/en/legal";
    public static final String PCODE_PREFIX = "?p=";
    public static final String PRIVACY_URL = "http://m.accuweather.com/en/privacy";

    public TermsAndConditionsUtilities()
    {
    }

    public static CharSequence buildAgreementText(Context context)
    {
        String s = context.getString(com.accuweather.android.R.string.PhraseAgreement_Part1);
        String s1 = context.getString(com.accuweather.android.R.string.PhraseAgreement_Part2);
        String s2 = buildUrlWithPartnerCode("http://m.accuweather.com/en/legal", context);
        context = buildUrlWithPartnerCode("http://m.accuweather.com/en/privacy", context);
        return Html.fromHtml((new StringBuilder()).append(s).append("<br/><a href='").append(s2).append("'>").append("http://m.accuweather.com/en/legal").append("</a> <br/>").append(s1).append("<br/><a href='").append(context).append("'>").append("http://m.accuweather.com/en/privacy").append("</a>").toString());
    }

    public static String buildUrlWithPartnerCode(String s, Context context)
    {
        return (new StringBuilder()).append(s).append("?p=").append(PartnerCoding.getPartnerCodeFromSharedPreferences(context)).toString();
    }
}
