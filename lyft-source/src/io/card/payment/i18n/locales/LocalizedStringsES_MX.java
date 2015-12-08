// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment.i18n.locales;

import io.card.payment.i18n.StringKey;
import io.card.payment.i18n.SupportedLocale;
import java.util.HashMap;
import java.util.Map;

public class LocalizedStringsES_MX
    implements SupportedLocale
{

    private static Map mAdapted = new HashMap();
    private static Map mDisplay = new HashMap();

    public LocalizedStringsES_MX()
    {
        mDisplay.put(StringKey.CANCEL, "Cancelar");
        mDisplay.put(StringKey.CARDTYPE_AMERICANEXPRESS, "American Express");
        mDisplay.put(StringKey.CARDTYPE_DISCOVER, "Discover");
        mDisplay.put(StringKey.CARDTYPE_JCB, "JCB");
        mDisplay.put(StringKey.CARDTYPE_MASTERCARD, "MasterCard");
        mDisplay.put(StringKey.CARDTYPE_VISA, "Visa");
        mDisplay.put(StringKey.DONE, "Listo");
        mDisplay.put(StringKey.ENTRY_CVV, "CVV");
        mDisplay.put(StringKey.ENTRY_POSTAL_CODE, "C\363digo postal");
        mDisplay.put(StringKey.ENTRY_EXPIRES, "Caduca");
        mDisplay.put(StringKey.EXPIRES_PLACEHOLDER, "MM/AA");
        mDisplay.put(StringKey.SCAN_GUIDE, "Sostenga la tarjeta aqu\355.\nSe escanear\341 autom\341ticamente.");
        mDisplay.put(StringKey.KEYBOARD, "Teclado\u2026");
        mDisplay.put(StringKey.ENTRY_CARD_NUMBER, "N\372mero de tarjeta");
        mDisplay.put(StringKey.MANUAL_ENTRY_TITLE, "Detalles de la tarjeta");
        mDisplay.put(StringKey.ERROR_NO_DEVICE_SUPPORT, "Este dispositivo no puede usar la c\341mara para leer n\372meros de tarjeta.");
        mDisplay.put(StringKey.ERROR_CAMERA_CONNECT_FAIL, "La c\341mara del dispositivo no est\341 disponible.");
        mDisplay.put(StringKey.ERROR_CAMERA_UNEXPECTED_FAIL, "El dispositivo tuvo un error inesperado al abrir la c\341mara.");
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
        return "es_MX";
    }

}
