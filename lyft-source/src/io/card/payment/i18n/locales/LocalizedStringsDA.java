// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment.i18n.locales;

import io.card.payment.i18n.StringKey;
import io.card.payment.i18n.SupportedLocale;
import java.util.HashMap;
import java.util.Map;

public class LocalizedStringsDA
    implements SupportedLocale
{

    private static Map mAdapted = new HashMap();
    private static Map mDisplay = new HashMap();

    public LocalizedStringsDA()
    {
        mDisplay.put(StringKey.CANCEL, "Annuller");
        mDisplay.put(StringKey.CARDTYPE_AMERICANEXPRESS, "American Express");
        mDisplay.put(StringKey.CARDTYPE_DISCOVER, "Discover");
        mDisplay.put(StringKey.CARDTYPE_JCB, "JCB");
        mDisplay.put(StringKey.CARDTYPE_MASTERCARD, "MasterCard");
        mDisplay.put(StringKey.CARDTYPE_VISA, "Visa");
        mDisplay.put(StringKey.DONE, "Udf\370rt");
        mDisplay.put(StringKey.ENTRY_CVV, "CVV");
        mDisplay.put(StringKey.ENTRY_POSTAL_CODE, "Postnummer");
        mDisplay.put(StringKey.ENTRY_EXPIRES, "Udl\370ber");
        mDisplay.put(StringKey.EXPIRES_PLACEHOLDER, "MM/\305\305");
        mDisplay.put(StringKey.SCAN_GUIDE, "Hold kortet her.\nDet scannes automatisk.");
        mDisplay.put(StringKey.KEYBOARD, "Tastatur\u2026");
        mDisplay.put(StringKey.ENTRY_CARD_NUMBER, "Kortnummer");
        mDisplay.put(StringKey.MANUAL_ENTRY_TITLE, "Kortoplysninger");
        mDisplay.put(StringKey.ERROR_NO_DEVICE_SUPPORT, "Denne enhed kan ikke anvende kameraet til at l\346se kortnumre.");
        mDisplay.put(StringKey.ERROR_CAMERA_CONNECT_FAIL, "Enhed kamera ikke er tilg\346ngelig.");
        mDisplay.put(StringKey.ERROR_CAMERA_UNEXPECTED_FAIL, "Enheden havde en uventet fejl under \345bning af kamera.");
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
        return "da";
    }

}
