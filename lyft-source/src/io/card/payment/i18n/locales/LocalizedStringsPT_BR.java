// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment.i18n.locales;

import io.card.payment.i18n.StringKey;
import io.card.payment.i18n.SupportedLocale;
import java.util.HashMap;
import java.util.Map;

public class LocalizedStringsPT_BR
    implements SupportedLocale
{

    private static Map mAdapted = new HashMap();
    private static Map mDisplay = new HashMap();

    public LocalizedStringsPT_BR()
    {
        mDisplay.put(StringKey.CANCEL, "Cancelar");
        mDisplay.put(StringKey.CARDTYPE_AMERICANEXPRESS, "American Express");
        mDisplay.put(StringKey.CARDTYPE_DISCOVER, "Discover");
        mDisplay.put(StringKey.CARDTYPE_JCB, "JCB");
        mDisplay.put(StringKey.CARDTYPE_MASTERCARD, "MasterCard");
        mDisplay.put(StringKey.CARDTYPE_VISA, "Visa");
        mDisplay.put(StringKey.DONE, "Conclu\355do");
        mDisplay.put(StringKey.ENTRY_CVV, "CVV");
        mDisplay.put(StringKey.ENTRY_POSTAL_CODE, "CEP");
        mDisplay.put(StringKey.ENTRY_EXPIRES, "Vencimento");
        mDisplay.put(StringKey.EXPIRES_PLACEHOLDER, "MM/AA");
        mDisplay.put(StringKey.SCAN_GUIDE, "Posicionar cart\343o aqui.\nEle ser\341 digitalizado automaticamente.");
        mDisplay.put(StringKey.KEYBOARD, "Teclado\u2026");
        mDisplay.put(StringKey.ENTRY_CARD_NUMBER, "N\372mero do Cart\343o");
        mDisplay.put(StringKey.MANUAL_ENTRY_TITLE, "Dados do cart\343o");
        mDisplay.put(StringKey.ERROR_NO_DEVICE_SUPPORT, "Este dispositivo n\343o pode usar a c\342mera para ler n\372meros de cart\343o.");
        mDisplay.put(StringKey.ERROR_CAMERA_CONNECT_FAIL, "A c\342mera do dispositivo n\343o est\341 dispon\355vel.");
        mDisplay.put(StringKey.ERROR_CAMERA_UNEXPECTED_FAIL, "O dispositivo sofreu um erro inesperado ao abrir a c\342mera.");
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
        return "pt_BR";
    }

}
