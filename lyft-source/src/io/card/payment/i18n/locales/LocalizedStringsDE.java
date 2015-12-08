// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment.i18n.locales;

import io.card.payment.i18n.StringKey;
import io.card.payment.i18n.SupportedLocale;
import java.util.HashMap;
import java.util.Map;

public class LocalizedStringsDE
    implements SupportedLocale
{

    private static Map mAdapted = new HashMap();
    private static Map mDisplay = new HashMap();

    public LocalizedStringsDE()
    {
        mDisplay.put(StringKey.CANCEL, "Abbrechen");
        mDisplay.put(StringKey.CARDTYPE_AMERICANEXPRESS, "American Express");
        mDisplay.put(StringKey.CARDTYPE_DISCOVER, "Discover");
        mDisplay.put(StringKey.CARDTYPE_JCB, "JCB");
        mDisplay.put(StringKey.CARDTYPE_MASTERCARD, "MasterCard");
        mDisplay.put(StringKey.CARDTYPE_VISA, "Visa");
        mDisplay.put(StringKey.DONE, "Fertig");
        mDisplay.put(StringKey.ENTRY_CVV, "Kartenpr\374fnr.");
        mDisplay.put(StringKey.ENTRY_POSTAL_CODE, "PLZ");
        mDisplay.put(StringKey.ENTRY_EXPIRES, "G\374ltig bis");
        mDisplay.put(StringKey.EXPIRES_PLACEHOLDER, "MM/JJ");
        mDisplay.put(StringKey.SCAN_GUIDE, "Kreditkarte hierhin halten.\nSie wird automatisch gelesen.");
        mDisplay.put(StringKey.KEYBOARD, "Tastatur\u2026");
        mDisplay.put(StringKey.ENTRY_CARD_NUMBER, "Kartennummer");
        mDisplay.put(StringKey.MANUAL_ENTRY_TITLE, "Kreditkartendetails");
        mDisplay.put(StringKey.ERROR_NO_DEVICE_SUPPORT, "Dieses Ger\344t kann mit der Kamera keine Kreditkartennummern lesen.");
        mDisplay.put(StringKey.ERROR_CAMERA_CONNECT_FAIL, "Die Kamera ist nicht verf\374gbar.");
        mDisplay.put(StringKey.ERROR_CAMERA_UNEXPECTED_FAIL, "Beim \326ffnen der Kamera ist ein unerwarteter Fehler aufgetreten.");
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
        return "de";
    }

}
