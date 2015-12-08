// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment.i18n.locales;

import io.card.payment.i18n.StringKey;
import io.card.payment.i18n.SupportedLocale;
import java.util.HashMap;
import java.util.Map;

public class LocalizedStringsZH_HANS
    implements SupportedLocale
{

    private static Map mAdapted = new HashMap();
    private static Map mDisplay = new HashMap();

    public LocalizedStringsZH_HANS()
    {
        mDisplay.put(StringKey.CANCEL, "\u53D6\u6D88");
        mDisplay.put(StringKey.CARDTYPE_AMERICANEXPRESS, "American Express");
        mDisplay.put(StringKey.CARDTYPE_DISCOVER, "Discover");
        mDisplay.put(StringKey.CARDTYPE_JCB, "JCB");
        mDisplay.put(StringKey.CARDTYPE_MASTERCARD, "MasterCard");
        mDisplay.put(StringKey.CARDTYPE_VISA, "Visa");
        mDisplay.put(StringKey.DONE, "\u5B8C\u6210");
        mDisplay.put(StringKey.ENTRY_CVV, "CVV");
        mDisplay.put(StringKey.ENTRY_POSTAL_CODE, "\u90AE\u653F\u7F16\u7801");
        mDisplay.put(StringKey.ENTRY_EXPIRES, "\u5931\u6548\u65E5\u671F\uFF1A");
        mDisplay.put(StringKey.EXPIRES_PLACEHOLDER, "MM/YY");
        mDisplay.put(StringKey.SCAN_GUIDE, "\u6301\u5361\u7F6E\u4E8E\u6B64\u5904\u3002\n\u8BBE\u5907\u4F1A\u81EA\u52A8\u626B\u63CF\u5361\u3002");
        mDisplay.put(StringKey.KEYBOARD, "\u952E\u76D8\u2026");
        mDisplay.put(StringKey.ENTRY_CARD_NUMBER, "\u5361\u53F7");
        mDisplay.put(StringKey.MANUAL_ENTRY_TITLE, "\u5361\u8BE6\u7EC6\u4FE1\u606F");
        mDisplay.put(StringKey.ERROR_NO_DEVICE_SUPPORT, "\u6B64\u8BBE\u5907\u65E0\u6CD5\u4F7F\u7528\u6444\u50CF\u5934\u8BFB\u53D6\u5361\u53F7\u3002");
        mDisplay.put(StringKey.ERROR_CAMERA_CONNECT_FAIL, "\u8BBE\u5907\u6444\u50CF\u5934\u4E0D\u53EF\u7528\u3002");
        mDisplay.put(StringKey.ERROR_CAMERA_UNEXPECTED_FAIL, "\u8BBE\u5907\u6253\u5F00\u6444\u50CF\u5934\u65F6\u51FA\u73B0\u610F\u5916\u9519\u8BEF\u3002");
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
        return "zh-Hans";
    }

}
