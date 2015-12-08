// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment.i18n.locales;

import io.card.payment.i18n.StringKey;
import io.card.payment.i18n.SupportedLocale;
import java.util.HashMap;
import java.util.Map;

public class LocalizedStringsTH
    implements SupportedLocale
{

    private static Map mAdapted = new HashMap();
    private static Map mDisplay = new HashMap();

    public LocalizedStringsTH()
    {
        mDisplay.put(StringKey.CANCEL, "\u0E22\u0E01\u0E40\u0E25\u0E34\u0E01");
        mDisplay.put(StringKey.CARDTYPE_AMERICANEXPRESS, "American Express");
        mDisplay.put(StringKey.CARDTYPE_DISCOVER, "Discover");
        mDisplay.put(StringKey.CARDTYPE_JCB, "JCB");
        mDisplay.put(StringKey.CARDTYPE_MASTERCARD, "MasterCard");
        mDisplay.put(StringKey.CARDTYPE_VISA, "Visa");
        mDisplay.put(StringKey.DONE, "\u0E40\u0E2A\u0E23\u0E47\u0E08\u0E41\u0E25\u0E49\u0E27");
        mDisplay.put(StringKey.ENTRY_CVV, "CVV");
        mDisplay.put(StringKey.ENTRY_POSTAL_CODE, "\u0E23\u0E2B\u0E31\u0E2A\u0E44\u0E1B\u0E23\u0E29\u0E13\u0E35\u0E22\u0E4C");
        mDisplay.put(StringKey.ENTRY_EXPIRES, "\u0E2B\u0E21\u0E14\u0E2D\u0E32\u0E22\u0E38");
        mDisplay.put(StringKey.EXPIRES_PLACEHOLDER, "\u0E14\u0E14/\u0E1B\u0E1B");
        mDisplay.put(StringKey.SCAN_GUIDE, "\u0E16\u0E37\u0E2D\u0E1A\u0E31\u0E15\u0E23\u0E44\u0E27\u0E49\u0E15\u0E23\u0E07\u0E19\u0E35\u0E49\n\u0E40\u0E04\u0E23\u0E37\u0E48\u0E2D\u0E07\u0E08\u0E30\u0E2A\u0E41\u0E01\u0E19\u0E42\u0E14\u0E22\u0E2D\u0E31\u0E15\u0E42\u0E19\u0E21\u0E31\u0E15\u0E34");
        mDisplay.put(StringKey.KEYBOARD, "\u0E04\u0E35\u0E22\u0E4C\u0E1A\u0E2D\u0E23\u0E4C\u0E14\u2026");
        mDisplay.put(StringKey.ENTRY_CARD_NUMBER, "\u0E2B\u0E21\u0E32\u0E22\u0E40\u0E25\u0E02\u0E1A\u0E31\u0E15\u0E23");
        mDisplay.put(StringKey.MANUAL_ENTRY_TITLE, "\u0E23\u0E32\u0E22\u0E25\u0E30\u0E40\u0E2D\u0E35\u0E22\u0E14\u0E1A\u0E31\u0E15\u0E23");
        mDisplay.put(StringKey.ERROR_NO_DEVICE_SUPPORT, "\u0E2D\u0E38\u0E1B\u0E01\u0E23\u0E13\u0E4C\u0E44\u0E21\u0E48\u0E2A\u0E32\u0E21\u0E32\u0E23\u0E16\u0E43\u0E0A\u0E49\u0E01\u0E25\u0E49\u0E2D\u0E07\u0E40\u0E1E\u0E37\u0E48\u0E2D\u0E2D\u0E48\u0E32\u0E19\u0E2B\u0E21\u0E32\u0E22\u0E40\u0E25\u0E02\u0E1A\u0E31\u0E15\u0E23\u0E44\u0E14\u0E49");
        mDisplay.put(StringKey.ERROR_CAMERA_CONNECT_FAIL, "\u0E01\u0E25\u0E49\u0E2D\u0E07\u0E02\u0E2D\u0E07\u0E2D\u0E38\u0E1B\u0E01\u0E23\u0E13\u0E4C\u0E44\u0E21\u0E48\u0E1E\u0E23\u0E49\u0E2D\u0E21\u0E43\u0E0A\u0E49\u0E07\u0E32\u0E19");
        mDisplay.put(StringKey.ERROR_CAMERA_UNEXPECTED_FAIL, "\u0E2D\u0E38\u0E1B\u0E01\u0E23\u0E13\u0E4C\u0E1E\u0E1A\u0E02\u0E49\u0E2D\u0E1C\u0E34\u0E14\u0E1E\u0E25\u0E32\u0E14\u0E02\u0E13\u0E30\u0E40\u0E1B\u0E34\u0E14\u0E01\u0E25\u0E49\u0E2D\u0E07");
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
        return "th";
    }

}
