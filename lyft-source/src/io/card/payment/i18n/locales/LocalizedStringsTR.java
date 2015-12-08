// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment.i18n.locales;

import io.card.payment.i18n.StringKey;
import io.card.payment.i18n.SupportedLocale;
import java.util.HashMap;
import java.util.Map;

public class LocalizedStringsTR
    implements SupportedLocale
{

    private static Map mAdapted = new HashMap();
    private static Map mDisplay = new HashMap();

    public LocalizedStringsTR()
    {
        mDisplay.put(StringKey.CANCEL, "\u0130ptal");
        mDisplay.put(StringKey.CARDTYPE_AMERICANEXPRESS, "American Express");
        mDisplay.put(StringKey.CARDTYPE_DISCOVER, "Discover");
        mDisplay.put(StringKey.CARDTYPE_JCB, "JCB");
        mDisplay.put(StringKey.CARDTYPE_MASTERCARD, "MasterCard");
        mDisplay.put(StringKey.CARDTYPE_VISA, "Visa");
        mDisplay.put(StringKey.DONE, "Bitti");
        mDisplay.put(StringKey.ENTRY_CVV, "CVV");
        mDisplay.put(StringKey.ENTRY_POSTAL_CODE, "Posta Kodu");
        mDisplay.put(StringKey.ENTRY_EXPIRES, "Son kullanma tarihi");
        mDisplay.put(StringKey.EXPIRES_PLACEHOLDER, "AA/YY");
        mDisplay.put(StringKey.SCAN_GUIDE, "Kart\u0131n\u0131z\u0131 buraya tutun.\nOtomatik olarak taranacakt\u0131r.");
        mDisplay.put(StringKey.KEYBOARD, "Klavye\u2026");
        mDisplay.put(StringKey.ENTRY_CARD_NUMBER, "Kart Numaras\u0131");
        mDisplay.put(StringKey.MANUAL_ENTRY_TITLE, "Kart Ayr\u0131nt\u0131lar\u0131");
        mDisplay.put(StringKey.ERROR_NO_DEVICE_SUPPORT, "Bu cihaz\u0131n kameras\u0131 kart rakamlar\u0131n\u0131 okuyamaz.");
        mDisplay.put(StringKey.ERROR_CAMERA_CONNECT_FAIL, "Cihaz kameras\u0131 kullan\u0131lam\u0131yor.");
        mDisplay.put(StringKey.ERROR_CAMERA_UNEXPECTED_FAIL, "Cihaz kameray\u0131 a\347arken beklenmedik bir hata verdi.");
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
        return "tr";
    }

}
