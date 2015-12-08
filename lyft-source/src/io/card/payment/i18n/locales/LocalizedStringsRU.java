// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment.i18n.locales;

import io.card.payment.i18n.StringKey;
import io.card.payment.i18n.SupportedLocale;
import java.util.HashMap;
import java.util.Map;

public class LocalizedStringsRU
    implements SupportedLocale
{

    private static Map mAdapted = new HashMap();
    private static Map mDisplay = new HashMap();

    public LocalizedStringsRU()
    {
        mDisplay.put(StringKey.CANCEL, "\u041E\u0442\u043C\u0435\u043D\u0430");
        mDisplay.put(StringKey.CARDTYPE_AMERICANEXPRESS, "American Express");
        mDisplay.put(StringKey.CARDTYPE_DISCOVER, "Discover");
        mDisplay.put(StringKey.CARDTYPE_JCB, "JCB");
        mDisplay.put(StringKey.CARDTYPE_MASTERCARD, "MasterCard");
        mDisplay.put(StringKey.CARDTYPE_VISA, "Visa");
        mDisplay.put(StringKey.DONE, "\u0413\u043E\u0442\u043E\u0432\u043E");
        mDisplay.put(StringKey.ENTRY_CVV, "\u041A\u043E\u0434 \u0431\u0435\u0437\u043E\u043F\u0430\u0441\u043D\u043E\u0441\u0442\u0438");
        mDisplay.put(StringKey.ENTRY_POSTAL_CODE, "\u0418\u043D\u0434\u0435\u043A\u0441");
        mDisplay.put(StringKey.ENTRY_EXPIRES, "\u0414\u0435\u0439\u0441\u0442\u0432\u0438\u0442\u0435\u043B\u044C\u043D\u0430 \u0434\u043E");
        mDisplay.put(StringKey.EXPIRES_PLACEHOLDER, "\u041C\u041C/\u0413\u0413");
        mDisplay.put(StringKey.SCAN_GUIDE, "\u0414\u0435\u0440\u0436\u0438\u0442\u0435 \u043A\u0430\u0440\u0442\u0443 \u0432\u043D\u0443\u0442\u0440\u0438 \u0440\u0430\u043C\u043A\u0438.\n\u041E\u043D\u0430 \u0431\u0443\u0434\u0435\u0442 \u0441\u0447\u0438\u0442\u0430\u043D\u0430\n\u0430\u0432\u0442\u043E\u043C\u0430\u0442\u0438\u0447\u0435\u0441\u043A\u0438.");
        mDisplay.put(StringKey.KEYBOARD, "\u041A\u043B\u0430\u0432\u0438\u0430\u0442\u0443\u0440\u0430\u2026");
        mDisplay.put(StringKey.ENTRY_CARD_NUMBER, "\u041D\u043E\u043C\u0435\u0440 \u043A\u0430\u0440\u0442\u044B");
        mDisplay.put(StringKey.MANUAL_ENTRY_TITLE, "\u0418\u043D\u0444\u043E\u0440\u043C\u0430\u0446\u0438\u044F \u043E \u043A\u0430\u0440\u0442\u0435");
        mDisplay.put(StringKey.ERROR_NO_DEVICE_SUPPORT, "\u0412 \u0434\u0430\u043D\u043D\u043E\u043C \u0443\u0441\u0442\u0440\u043E\u0439\u0441\u0442\u0432\u0435 \u043D\u0435\u0442 \u043E\u043F\u0446\u0438\u0438 \u0441\u0447\u0438\u0442\u044B\u0432\u0430\u043D\u0438\u044F \u043D\u043E\u043C\u0435\u0440\u0430 \u043A\u0430\u0440\u0442\u044B \u0441 \u043F\u043E\u043C\u043E\u0449\u044C\u044E \u0444\u043E\u0442\u043E\u043A\u0430\u043C\u0435\u0440\u044B.");
        mDisplay.put(StringKey.ERROR_CAMERA_CONNECT_FAIL, "\u0424\u043E\u0442\u043E\u043A\u0430\u043C\u0435\u0440\u0430 \u0443\u0441\u0442\u0440\u043E\u0439\u0441\u0442\u0432\u0430 \u043D\u0435\u0434\u043E\u0441\u0442\u0443\u043F\u043D\u0430.");
        mDisplay.put(StringKey.ERROR_CAMERA_UNEXPECTED_FAIL, "\u0412\u043E\u0437\u043D\u0438\u043A\u043B\u0430 \u043D\u0435\u0437\u0430\u043F\u043B\u0430\u043D\u0438\u0440\u043E\u0432\u0430\u043D\u043D\u0430\u044F \u043E\u0448\u0438\u0431\u043A\u0430 \u043F\u0440\u0438 \u043E\u0442\u043A\u0440\u044B\u0442\u0438\u0438 \u0444\u043E\u0442\u043E\u043A\u0430\u043C\u0435\u0440\u044B \u0443\u0441\u0442\u0440\u043E\u0439\u0441\u0442\u0432\u0430.");
    }

    public String getAdaptedDisplay(StringKey stringkey, String s)
    {
        s = (new StringBuilder()).append(stringkey.toString()).append("|").append(s).toString();
        if (mAdapted.containsKey(s))
        {
            return (String)mAdapted.get(s);
        } else
        {
            return (String)mDisplay.get(stringkey);
        }
    }

    public volatile String getAdaptedDisplay(Enum enum, String s)
    {
        return getAdaptedDisplay((StringKey)enum, s);
    }

    public String getName()
    {
        return "ru";
    }

}
