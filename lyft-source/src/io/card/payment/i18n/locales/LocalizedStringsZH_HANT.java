// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment.i18n.locales;

import io.card.payment.i18n.StringKey;
import io.card.payment.i18n.SupportedLocale;
import java.util.HashMap;
import java.util.Map;

public class LocalizedStringsZH_HANT
    implements SupportedLocale
{

    private static Map mAdapted = new HashMap();
    private static Map mDisplay = new HashMap();

    public LocalizedStringsZH_HANT()
    {
        mDisplay.put(StringKey.CANCEL, "\u53D6\u6D88");
        mDisplay.put(StringKey.CARDTYPE_AMERICANEXPRESS, "\u7F8E\u570B\u904B\u901A");
        mDisplay.put(StringKey.CARDTYPE_DISCOVER, "Discover");
        mDisplay.put(StringKey.CARDTYPE_JCB, "JCB");
        mDisplay.put(StringKey.CARDTYPE_MASTERCARD, "MasterCard");
        mDisplay.put(StringKey.CARDTYPE_VISA, "Visa");
        mDisplay.put(StringKey.DONE, "\u5B8C\u6210");
        mDisplay.put(StringKey.ENTRY_CVV, "CVV");
        mDisplay.put(StringKey.ENTRY_POSTAL_CODE, "\u90F5\u905E\u5340\u865F");
        mDisplay.put(StringKey.ENTRY_EXPIRES, "\u5230\u671F\u65E5");
        mDisplay.put(StringKey.EXPIRES_PLACEHOLDER, "\u6708\uFF0F\u5E74");
        mDisplay.put(StringKey.SCAN_GUIDE, "\u5C07\u4FE1\u7528\u5361\u7F6E\u65BC\u6B64\u8655\u3002\n\u88DD\u7F6E\u6703\u81EA\u52D5\u6383\u63CF\u3002");
        mDisplay.put(StringKey.KEYBOARD, "\u9375\u76E4\u2026");
        mDisplay.put(StringKey.ENTRY_CARD_NUMBER, "\u5361\u865F");
        mDisplay.put(StringKey.MANUAL_ENTRY_TITLE, "\u4FE1\u7528\u5361\u8A73\u7D30\u8CC7\u6599");
        mDisplay.put(StringKey.ERROR_NO_DEVICE_SUPPORT, "\u6B64\u88DD\u7F6E\u7121\u6CD5\u4F7F\u7528\u76F8\u6A5F\u8B80\u53D6\u4FE1\u7528\u5361\u5361\u865F\u3002");
        mDisplay.put(StringKey.ERROR_CAMERA_CONNECT_FAIL, "\u7121\u6CD5\u4F7F\u7528\u88DD\u7F6E\u7684\u76F8\u6A5F\u3002");
        mDisplay.put(StringKey.ERROR_CAMERA_UNEXPECTED_FAIL, "\u6B64\u88DD\u7F6E\u555F\u52D5\u76F8\u6A5F\u6642\u767C\u751F\u610F\u5916\u932F\u8AA4\u3002");
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
        return "zh-Hant";
    }

}
