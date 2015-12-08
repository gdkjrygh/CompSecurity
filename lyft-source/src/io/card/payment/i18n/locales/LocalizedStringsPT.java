// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment.i18n.locales;

import io.card.payment.i18n.StringKey;
import io.card.payment.i18n.SupportedLocale;
import java.util.HashMap;
import java.util.Map;

public class LocalizedStringsPT
    implements SupportedLocale
{

    private static Map mAdapted = new HashMap();
    private static Map mDisplay = new HashMap();

    public LocalizedStringsPT()
    {
        mDisplay.put(StringKey.CANCEL, "Cancelar");
        mDisplay.put(StringKey.CARDTYPE_AMERICANEXPRESS, "American Express");
        mDisplay.put(StringKey.CARDTYPE_DISCOVER, "Discover");
        mDisplay.put(StringKey.CARDTYPE_JCB, "JCB");
        mDisplay.put(StringKey.CARDTYPE_MASTERCARD, "MasterCard");
        mDisplay.put(StringKey.CARDTYPE_VISA, "Visa");
        mDisplay.put(StringKey.DONE, "Conclu\355do");
        mDisplay.put(StringKey.ENTRY_CVV, "CSC");
        mDisplay.put(StringKey.ENTRY_POSTAL_CODE, "C\363digo Postal");
        mDisplay.put(StringKey.ENTRY_EXPIRES, "Validade");
        mDisplay.put(StringKey.EXPIRES_PLACEHOLDER, "MM/AA");
        mDisplay.put(StringKey.SCAN_GUIDE, "Segure o cart\343o aqui.\nSer\341 lido automaticamente.");
        mDisplay.put(StringKey.KEYBOARD, "Teclado\u2026");
        mDisplay.put(StringKey.ENTRY_CARD_NUMBER, "N\372mero do cart\343o");
        mDisplay.put(StringKey.MANUAL_ENTRY_TITLE, "Detalhes do cart\343o");
        mDisplay.put(StringKey.ERROR_NO_DEVICE_SUPPORT, "Este dispositivo n\343o pode utilizar a c\342mara para ler n\372meros de cart\365es.");
        mDisplay.put(StringKey.ERROR_CAMERA_CONNECT_FAIL, "A c\342mara do dispositivo n\343o est\341 dispon\355vel.");
        mDisplay.put(StringKey.ERROR_CAMERA_UNEXPECTED_FAIL, "Ocorreu um erro inesperado no dispositivo ao abrir a c\342mara.");
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
        return "pt";
    }

}
