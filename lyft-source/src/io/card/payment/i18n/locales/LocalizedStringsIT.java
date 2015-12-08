// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment.i18n.locales;

import io.card.payment.i18n.StringKey;
import io.card.payment.i18n.SupportedLocale;
import java.util.HashMap;
import java.util.Map;

public class LocalizedStringsIT
    implements SupportedLocale
{

    private static Map mAdapted = new HashMap();
    private static Map mDisplay = new HashMap();

    public LocalizedStringsIT()
    {
        mDisplay.put(StringKey.CANCEL, "Annulla");
        mDisplay.put(StringKey.CARDTYPE_AMERICANEXPRESS, "American Express");
        mDisplay.put(StringKey.CARDTYPE_DISCOVER, "Discover");
        mDisplay.put(StringKey.CARDTYPE_JCB, "JCB");
        mDisplay.put(StringKey.CARDTYPE_MASTERCARD, "MasterCard");
        mDisplay.put(StringKey.CARDTYPE_VISA, "Visa");
        mDisplay.put(StringKey.DONE, "Fine");
        mDisplay.put(StringKey.ENTRY_CVV, "CVV");
        mDisplay.put(StringKey.ENTRY_POSTAL_CODE, "Codice postale");
        mDisplay.put(StringKey.ENTRY_EXPIRES, "Scadenza");
        mDisplay.put(StringKey.EXPIRES_PLACEHOLDER, "MM/AA");
        mDisplay.put(StringKey.SCAN_GUIDE, "Inquadra la carta.\nLa scansione \350 automatica.");
        mDisplay.put(StringKey.KEYBOARD, "Tastiera\u2026");
        mDisplay.put(StringKey.ENTRY_CARD_NUMBER, "Numero di carta");
        mDisplay.put(StringKey.MANUAL_ENTRY_TITLE, "Dati carta");
        mDisplay.put(StringKey.ERROR_NO_DEVICE_SUPPORT, "La fotocamera non legge il numero di carta.");
        mDisplay.put(StringKey.ERROR_CAMERA_CONNECT_FAIL, "Fotocamera non disponibile.");
        mDisplay.put(StringKey.ERROR_CAMERA_UNEXPECTED_FAIL, "Errore inatteso nell\u2019apertura della fotocamera.");
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
        return "it";
    }

}
