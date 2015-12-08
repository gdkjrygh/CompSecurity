// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment.i18n.locales;

import io.card.payment.i18n.StringKey;
import io.card.payment.i18n.SupportedLocale;
import java.util.HashMap;
import java.util.Map;

public class LocalizedStringsJA
    implements SupportedLocale
{

    private static Map mAdapted = new HashMap();
    private static Map mDisplay = new HashMap();

    public LocalizedStringsJA()
    {
        mDisplay.put(StringKey.CANCEL, "\u30AD\u30E3\u30F3\u30BB\u30EB");
        mDisplay.put(StringKey.CARDTYPE_AMERICANEXPRESS, "American Express");
        mDisplay.put(StringKey.CARDTYPE_DISCOVER, "Discover");
        mDisplay.put(StringKey.CARDTYPE_JCB, "JCB");
        mDisplay.put(StringKey.CARDTYPE_MASTERCARD, "MasterCard");
        mDisplay.put(StringKey.CARDTYPE_VISA, "Visa");
        mDisplay.put(StringKey.DONE, "\u5B8C\u4E86");
        mDisplay.put(StringKey.ENTRY_CVV, "\u30AB\u30FC\u30C9\u78BA\u8A8D\u30B3\u30FC\u30C9");
        mDisplay.put(StringKey.ENTRY_POSTAL_CODE, "\u90F5\u4FBF\u756A\u53F7");
        mDisplay.put(StringKey.ENTRY_EXPIRES, "\u6709\u52B9\u671F\u9650");
        mDisplay.put(StringKey.EXPIRES_PLACEHOLDER, "MM/YY");
        mDisplay.put(StringKey.SCAN_GUIDE, "\u3053\u3053\u3067\u30AB\u30FC\u30C9\u3092\u304A\u6301\u3061\u304F\u3060\u3055\u3044\u3002\n\u81EA\u52D5\u7684\u306B\u30B9\u30AD\u30E3\u30F3\u3055\u308C\u307E\u3059\u3002");
        mDisplay.put(StringKey.KEYBOARD, "\u30AD\u30FC\u30DC\u30FC\u30C9\u2026");
        mDisplay.put(StringKey.ENTRY_CARD_NUMBER, "\u30AB\u30FC\u30C9\u756A\u53F7");
        mDisplay.put(StringKey.MANUAL_ENTRY_TITLE, "\u30AB\u30FC\u30C9\u306E\u8A73\u7D30");
        mDisplay.put(StringKey.ERROR_NO_DEVICE_SUPPORT, "\u3053\u306E\u7AEF\u672B\u3067\u306F\u30AB\u30FC\u30C9\u756A\u53F7\u306E\u8AAD\u8FBC\u306B\u30AB\u30E1\u30E9\u3092\u4F7F\u3048\u307E\u305B\u3093\u3002");
        mDisplay.put(StringKey.ERROR_CAMERA_CONNECT_FAIL, "\u7AEF\u672B\u306E\u30AB\u30E1\u30E9\u3092\u4F7F\u7528\u3067\u304D\u307E\u305B\u3093\u3002");
        mDisplay.put(StringKey.ERROR_CAMERA_UNEXPECTED_FAIL, "\u30AB\u30E1\u30E9\u3092\u8D77\u52D5\u4E2D\u306B\u4E88\u671F\u3057\u306A\u3044\u30A8\u30E9\u30FC\u304C\u767A\u751F\u3057\u307E\u3057\u305F\u3002");
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
        return "ja";
    }

}
