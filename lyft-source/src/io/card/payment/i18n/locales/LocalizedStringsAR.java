// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment.i18n.locales;

import io.card.payment.i18n.StringKey;
import io.card.payment.i18n.SupportedLocale;
import java.util.HashMap;
import java.util.Map;

public class LocalizedStringsAR
    implements SupportedLocale
{

    private static Map mAdapted = new HashMap();
    private static Map mDisplay = new HashMap();

    public LocalizedStringsAR()
    {
        mDisplay.put(StringKey.CANCEL, "\u0625\u0644\u063A\u0627\u0621");
        mDisplay.put(StringKey.CARDTYPE_AMERICANEXPRESS, "American Express\u200F");
        mDisplay.put(StringKey.CARDTYPE_DISCOVER, "Discover\u200F");
        mDisplay.put(StringKey.CARDTYPE_JCB, "JCB\u200F");
        mDisplay.put(StringKey.CARDTYPE_MASTERCARD, "MasterCard\u200F");
        mDisplay.put(StringKey.CARDTYPE_VISA, "Visa\u200F");
        mDisplay.put(StringKey.DONE, "\u062A\u0645");
        mDisplay.put(StringKey.ENTRY_CVV, "CVV\u200F");
        mDisplay.put(StringKey.ENTRY_POSTAL_CODE, "\u0627\u0644\u0631\u0645\u0632 \u0627\u0644\u0628\u0631\u064A\u062F\u064A");
        mDisplay.put(StringKey.ENTRY_EXPIRES, "\u062A\u0627\u0631\u064A\u062E \u0627\u0646\u062A\u0647\u0627\u0621 \u0627\u0644\u0635\u0644\u0627\u062D\u064A\u0629");
        mDisplay.put(StringKey.EXPIRES_PLACEHOLDER, "MM/YY\u200F");
        mDisplay.put(StringKey.SCAN_GUIDE, "\u0627\u0645\u0633\u0643 \u0627\u0644\u0628\u0637\u0627\u0642\u0629 \u0647\u0646\u0627.\n \u0633\u062A\u0645\u0633\u062D \u062A\u0644\u0642\u0627\u0626\u064A\u0627.");
        mDisplay.put(StringKey.KEYBOARD, "\u0644\u0648\u062D\u0629 \u0627\u0644\u0645\u0641\u0627\u062A\u064A\u062D\u2026");
        mDisplay.put(StringKey.ENTRY_CARD_NUMBER, "\u0631\u0642\u0645 \u0627\u0644\u0628\u0637\u0627\u0642\u0629");
        mDisplay.put(StringKey.MANUAL_ENTRY_TITLE, "\u062A\u0641\u0627\u0635\u064A\u0644 \u0627\u0644\u0628\u0637\u0627\u0642\u0629");
        mDisplay.put(StringKey.ERROR_NO_DEVICE_SUPPORT, "\u0647\u0630\u0627 \u0627\u0644\u062C\u0647\u0627\u0632 \u0644\u0627 \u064A\u0645\u0643\u0646\u0647 \u0627\u0633\u062A\u0639\u0645\u0627\u0644 \u0627\u0644\u0643\u0627\u0645\u064A\u0631\u0627 \u0644\u0642\u0631\u0627\u0621\u0629 \u0623\u0631\u0642\u0627\u0645 \u0627\u0644\u0628\u0637\u0627\u0642\u0629.");
        mDisplay.put(StringKey.ERROR_CAMERA_CONNECT_FAIL, "\u0643\u0627\u0645\u064A\u0631\u0627 \u0627\u0644\u062C\u0647\u0627\u0632 \u063A\u064A\u0631 \u0645\u062A\u0627\u062D\u0629.");
        mDisplay.put(StringKey.ERROR_CAMERA_UNEXPECTED_FAIL, "\u0627\u0644\u062C\u0647\u0627\u0632 \u062D\u062F\u062B \u0628\u0647 \u062E\u0637\u0627 \u063A\u064A\u0631 \u0645\u062A\u0648\u0642\u0639 \u0639\u0646\u062F \u0641\u062A\u062D \u0627\u0644\u0643\u0627\u0645\u064A\u0631\u0627.");
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
        return "ar";
    }

}
