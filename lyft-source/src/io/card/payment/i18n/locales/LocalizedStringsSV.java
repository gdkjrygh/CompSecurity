// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment.i18n.locales;

import io.card.payment.i18n.StringKey;
import io.card.payment.i18n.SupportedLocale;
import java.util.HashMap;
import java.util.Map;

public class LocalizedStringsSV
    implements SupportedLocale
{

    private static Map mAdapted = new HashMap();
    private static Map mDisplay = new HashMap();

    public LocalizedStringsSV()
    {
        mDisplay.put(StringKey.CANCEL, "Avbryt");
        mDisplay.put(StringKey.CARDTYPE_AMERICANEXPRESS, "American Express");
        mDisplay.put(StringKey.CARDTYPE_DISCOVER, "Discover");
        mDisplay.put(StringKey.CARDTYPE_JCB, "JCB");
        mDisplay.put(StringKey.CARDTYPE_MASTERCARD, "MasterCard");
        mDisplay.put(StringKey.CARDTYPE_VISA, "Visa");
        mDisplay.put(StringKey.DONE, "Klart");
        mDisplay.put(StringKey.ENTRY_CVV, "CVV");
        mDisplay.put(StringKey.ENTRY_POSTAL_CODE, "Postnummer");
        mDisplay.put(StringKey.ENTRY_EXPIRES, "G\345r ut");
        mDisplay.put(StringKey.EXPIRES_PLACEHOLDER, "MM/\305\305");
        mDisplay.put(StringKey.SCAN_GUIDE, "H\345ll kortet h\344r.\nDet skannas automatiskt.");
        mDisplay.put(StringKey.KEYBOARD, "Tangentbord \u2026");
        mDisplay.put(StringKey.ENTRY_CARD_NUMBER, "Kortnummer");
        mDisplay.put(StringKey.MANUAL_ENTRY_TITLE, "Kortinformation");
        mDisplay.put(StringKey.ERROR_NO_DEVICE_SUPPORT, "Den h\344r enheten kan inte anv\344nda kameran till att l\344sa kortnummer.");
        mDisplay.put(StringKey.ERROR_CAMERA_CONNECT_FAIL, "Enhetens kamera \344r inte tillg\344nglig.");
        mDisplay.put(StringKey.ERROR_CAMERA_UNEXPECTED_FAIL, "Ett ov\344ntat fel uppstod n\344r enheten skulle \366ppna kameran.");
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
        return "sv";
    }

}
