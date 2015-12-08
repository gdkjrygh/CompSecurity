// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment.i18n;

import android.content.Intent;
import io.card.payment.i18n.locales.LocalizedStringsList;

// Referenced classes of package io.card.payment.i18n:
//            I18nManager, StringKey

public final class LocalizedStrings
{

    private static final I18nManager i18nManager;

    public static String getString(StringKey stringkey)
    {
        return i18nManager.getString(stringkey);
    }

    public static String getString(StringKey stringkey, String s)
    {
        return i18nManager.getString(stringkey, i18nManager.getLocaleFromSpecifier(s));
    }

    public static void setLanguage(Intent intent)
    {
        i18nManager.setLanguage(intent.getStringExtra("io.card.payment.languageOrLocale"));
    }

    static 
    {
        i18nManager = new I18nManager(io/card/payment/i18n/StringKey, LocalizedStringsList.ALL_LOCALES);
    }
}
