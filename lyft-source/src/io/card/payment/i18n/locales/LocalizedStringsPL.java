// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment.i18n.locales;

import io.card.payment.i18n.StringKey;
import io.card.payment.i18n.SupportedLocale;
import java.util.HashMap;
import java.util.Map;

public class LocalizedStringsPL
    implements SupportedLocale
{

    private static Map mAdapted = new HashMap();
    private static Map mDisplay = new HashMap();

    public LocalizedStringsPL()
    {
        mDisplay.put(StringKey.CANCEL, "Anuluj");
        mDisplay.put(StringKey.CARDTYPE_AMERICANEXPRESS, "American Express");
        mDisplay.put(StringKey.CARDTYPE_DISCOVER, "Discover");
        mDisplay.put(StringKey.CARDTYPE_JCB, "JCB");
        mDisplay.put(StringKey.CARDTYPE_MASTERCARD, "MasterCard");
        mDisplay.put(StringKey.CARDTYPE_VISA, "Visa");
        mDisplay.put(StringKey.DONE, "Gotowe");
        mDisplay.put(StringKey.ENTRY_CVV, "Kod CVV2/CVC2");
        mDisplay.put(StringKey.ENTRY_POSTAL_CODE, "Kod pocztowy");
        mDisplay.put(StringKey.ENTRY_EXPIRES, "Wygasa");
        mDisplay.put(StringKey.EXPIRES_PLACEHOLDER, "MM/RR");
        mDisplay.put(StringKey.SCAN_GUIDE, "Przytrzymaj kart\u0119 tutaj.\nZostanie ona zeskanowana automatycznie.");
        mDisplay.put(StringKey.KEYBOARD, "Klawiatura\u2026");
        mDisplay.put(StringKey.ENTRY_CARD_NUMBER, "Numer karty");
        mDisplay.put(StringKey.MANUAL_ENTRY_TITLE, "Dane karty");
        mDisplay.put(StringKey.ERROR_NO_DEVICE_SUPPORT, "Na tym urz\u0105dzeniu nie mo\u017Cna odczyta\u0107 numeru karty za pomoc\u0105 aparatu.");
        mDisplay.put(StringKey.ERROR_CAMERA_CONNECT_FAIL, "Aparat na tym urz\u0105dzeniu jest niedostepny.");
        mDisplay.put(StringKey.ERROR_CAMERA_UNEXPECTED_FAIL, "Przy otwieraniu aparatu na tym urz\u0105dzeniu wyst\u0105pi\u0142 nieoczekiwany b\u0142\u0105d.");
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
        return "pl";
    }

}
