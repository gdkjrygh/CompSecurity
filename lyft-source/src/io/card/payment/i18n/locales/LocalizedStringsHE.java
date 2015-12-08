// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment.i18n.locales;

import io.card.payment.i18n.StringKey;
import io.card.payment.i18n.SupportedLocale;
import java.util.HashMap;
import java.util.Map;

public class LocalizedStringsHE
    implements SupportedLocale
{

    private static Map mAdapted = new HashMap();
    private static Map mDisplay = new HashMap();

    public LocalizedStringsHE()
    {
        mDisplay.put(StringKey.CANCEL, "\u05D1\u05D9\u05D8\u05D5\u05DC");
        mDisplay.put(StringKey.CARDTYPE_AMERICANEXPRESS, "\u05D0\u05DE\u05E8\u05D9\u05E7\u05DF \u05D0\u05E7\u05E1\u05E4\u05E8\u05E1");
        mDisplay.put(StringKey.CARDTYPE_DISCOVER, "Discover\u200F");
        mDisplay.put(StringKey.CARDTYPE_JCB, "JCB\u200F");
        mDisplay.put(StringKey.CARDTYPE_MASTERCARD, "\u05DE\u05D0\u05E1\u05D8\u05E8\u05E7\u05D0\u05E8\u05D3");
        mDisplay.put(StringKey.CARDTYPE_VISA, "\u05D5\u05D9\u05D6\u05D4");
        mDisplay.put(StringKey.DONE, "\u05D1\u05D5\u05E6\u05E2");
        mDisplay.put(StringKey.ENTRY_CVV, "\u05E7\u05D5\u05D3 \u05D0\u05D9\u05DE\u05D5\u05EA \u05DB\u05E8\u05D8\u05D9\u05E1");
        mDisplay.put(StringKey.ENTRY_POSTAL_CODE, "\u05DE\u05D9\u05E7\u05D5\u05D3");
        mDisplay.put(StringKey.ENTRY_EXPIRES, "\u05EA\u05D0\u05E8\u05D9\u05DA \u05EA\u05E4\u05D5\u05D2\u05D4");
        mDisplay.put(StringKey.EXPIRES_PLACEHOLDER, "MM/YY\u200F");
        mDisplay.put(StringKey.SCAN_GUIDE, "\u05D4\u05D7\u05D6\u05E7 \u05D0\u05EA \u05D4\u05DB\u05E8\u05D8\u05D9\u05E1 \u05DB\u05D0\u05DF.\n\u05D4\u05E1\u05E8\u05D9\u05E7\u05D4 \u05EA\u05EA\u05D1\u05E6\u05E2 \u05D1\u05D0\u05D5\u05E4\u05DF \u05D0\u05D5\u05D8\u05D5\u05DE\u05D8\u05D9.");
        mDisplay.put(StringKey.KEYBOARD, "\u05DE\u05E7\u05DC\u05D3\u05EA\u2026");
        mDisplay.put(StringKey.ENTRY_CARD_NUMBER, "\u05DE\u05E1\u05E4\u05E8 \u05DB\u05E8\u05D8\u05D9\u05E1");
        mDisplay.put(StringKey.MANUAL_ENTRY_TITLE, "\u05E4\u05E8\u05D8\u05D9 \u05DB\u05E8\u05D8\u05D9\u05E1");
        mDisplay.put(StringKey.ERROR_NO_DEVICE_SUPPORT, "\u05D4\u05DE\u05DB\u05E9\u05D9\u05E8 \u05D0\u05D9\u05E0\u05D5 \u05DE\u05E1\u05D5\u05D2\u05DC \u05DC\u05D4\u05E9\u05EA\u05DE\u05E9 \u05D1\u05DE\u05E6\u05DC\u05DE\u05D4 \u05DC\u05E7\u05E8\u05D9\u05D0\u05EA \u05DE\u05E1\u05E4\u05E8\u05D9 \u05DB\u05E8\u05D8\u05D9\u05E1.");
        mDisplay.put(StringKey.ERROR_CAMERA_CONNECT_FAIL, "\u05DE\u05E6\u05DC\u05DE\u05EA \u05D4\u05DE\u05DB\u05E9\u05D9\u05E8 \u05D0\u05D9\u05E0\u05D4 \u05D6\u05DE\u05D9\u05E0\u05D4.");
        mDisplay.put(StringKey.ERROR_CAMERA_UNEXPECTED_FAIL, "\u05D4\u05DE\u05DB\u05E9\u05D9\u05E8 \u05E0\u05EA\u05E7\u05DC \u05D1\u05E9\u05D2\u05D9\u05D0\u05D4 \u05D1\u05DC\u05EA\u05D9 \u05E6\u05E4\u05D5\u05D9\u05D4 \u05D1\u05D6\u05DE\u05DF \u05D4\u05E4\u05E2\u05DC\u05EA \u05D4\u05DE\u05E6\u05DC\u05DE\u05D4.");
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
        return "he";
    }

}
