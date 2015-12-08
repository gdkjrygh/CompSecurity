// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment.i18n.locales;

import io.card.payment.i18n.StringKey;
import io.card.payment.i18n.SupportedLocale;
import java.util.HashMap;
import java.util.Map;

public class LocalizedStringsFR
    implements SupportedLocale
{

    private static Map mAdapted = new HashMap();
    private static Map mDisplay = new HashMap();

    public LocalizedStringsFR()
    {
        mDisplay.put(StringKey.CANCEL, "Annuler");
        mDisplay.put(StringKey.CARDTYPE_AMERICANEXPRESS, "American Express");
        mDisplay.put(StringKey.CARDTYPE_DISCOVER, "Discover");
        mDisplay.put(StringKey.CARDTYPE_JCB, "JCB");
        mDisplay.put(StringKey.CARDTYPE_MASTERCARD, "MasterCard");
        mDisplay.put(StringKey.CARDTYPE_VISA, "Visa");
        mDisplay.put(StringKey.DONE, "OK");
        mDisplay.put(StringKey.ENTRY_CVV, "Crypto.");
        mDisplay.put(StringKey.ENTRY_POSTAL_CODE, "Code postal");
        mDisplay.put(StringKey.ENTRY_EXPIRES, "Date d\u2019expiration");
        mDisplay.put(StringKey.EXPIRES_PLACEHOLDER, "MM/AA");
        mDisplay.put(StringKey.SCAN_GUIDE, "Maintenez la carte \340 cet endroit.\nElle va \352tre automatiquement scann\351e.");
        mDisplay.put(StringKey.KEYBOARD, "Clavier\u2026");
        mDisplay.put(StringKey.ENTRY_CARD_NUMBER, "N\272 de carte");
        mDisplay.put(StringKey.MANUAL_ENTRY_TITLE, "Carte");
        mDisplay.put(StringKey.ERROR_NO_DEVICE_SUPPORT, "Cet appareil ne peut pas utiliser l\u2019appareil photo pour lire les num\351ros de carte.");
        mDisplay.put(StringKey.ERROR_CAMERA_CONNECT_FAIL, "L\u2019appareil photo n\u2019est pas disponible.");
        mDisplay.put(StringKey.ERROR_CAMERA_UNEXPECTED_FAIL, "Une erreur s\u2019est produite en ouvrant l\u2019appareil photo.");
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
        return "fr";
    }

}
