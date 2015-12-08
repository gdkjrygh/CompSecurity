// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment.i18n.locales;

import io.card.payment.i18n.StringKey;
import io.card.payment.i18n.SupportedLocale;
import java.util.HashMap;
import java.util.Map;

public class LocalizedStringsIS
    implements SupportedLocale
{

    private static Map mAdapted = new HashMap();
    private static Map mDisplay = new HashMap();

    public LocalizedStringsIS()
    {
        mDisplay.put(StringKey.CANCEL, "H\346tta vi\360");
        mDisplay.put(StringKey.CARDTYPE_AMERICANEXPRESS, "American Express");
        mDisplay.put(StringKey.CARDTYPE_DISCOVER, "Discover");
        mDisplay.put(StringKey.CARDTYPE_JCB, "JCB");
        mDisplay.put(StringKey.CARDTYPE_MASTERCARD, "MasterCard");
        mDisplay.put(StringKey.CARDTYPE_VISA, "Visa");
        mDisplay.put(StringKey.DONE, "Loki\360");
        mDisplay.put(StringKey.ENTRY_CVV, "CVV");
        mDisplay.put(StringKey.ENTRY_POSTAL_CODE, "P\363stn\372mer");
        mDisplay.put(StringKey.ENTRY_EXPIRES, "Rennur \372t");
        mDisplay.put(StringKey.EXPIRES_PLACEHOLDER, "MM/\301\301");
        mDisplay.put(StringKey.SCAN_GUIDE, "Haltu kortinu kyrru h\351r.\n\336a\360 ver\360ur sj\341lvirkt skanna\360.");
        mDisplay.put(StringKey.KEYBOARD, "Lyklabor\360\u2026");
        mDisplay.put(StringKey.ENTRY_CARD_NUMBER, "Kortan\372mar");
        mDisplay.put(StringKey.MANUAL_ENTRY_TITLE, "Kortauppl\375singar");
        mDisplay.put(StringKey.ERROR_NO_DEVICE_SUPPORT, "\336etta t\346ki getur ekki nota\360 myndav\351lina til a\360 lesa af n\372mer af kortinu.");
        mDisplay.put(StringKey.ERROR_CAMERA_CONNECT_FAIL, "Ekki n\346st samband vi\360 myndav\351lina.");
        mDisplay.put(StringKey.ERROR_CAMERA_UNEXPECTED_FAIL, "Upp kom villa vi\360 a\360 opna myndav\351lina..");
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
        return "is";
    }

}
