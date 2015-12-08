// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment.i18n.locales;

import io.card.payment.i18n.StringKey;
import io.card.payment.i18n.SupportedLocale;
import java.util.HashMap;
import java.util.Map;

public class LocalizedStringsKO
    implements SupportedLocale
{

    private static Map mAdapted = new HashMap();
    private static Map mDisplay = new HashMap();

    public LocalizedStringsKO()
    {
        mDisplay.put(StringKey.CANCEL, "\uCDE8\uC18C");
        mDisplay.put(StringKey.CARDTYPE_AMERICANEXPRESS, "American Express");
        mDisplay.put(StringKey.CARDTYPE_DISCOVER, "Discover");
        mDisplay.put(StringKey.CARDTYPE_JCB, "JCB");
        mDisplay.put(StringKey.CARDTYPE_MASTERCARD, "MasterCard");
        mDisplay.put(StringKey.CARDTYPE_VISA, "Visa");
        mDisplay.put(StringKey.DONE, "\uC644\uB8CC");
        mDisplay.put(StringKey.ENTRY_CVV, "CVV");
        mDisplay.put(StringKey.ENTRY_POSTAL_CODE, "\uC6B0\uD3B8\uBC88\uD638");
        mDisplay.put(StringKey.ENTRY_EXPIRES, "\uC720\uD6A8\uAE30\uAC04");
        mDisplay.put(StringKey.EXPIRES_PLACEHOLDER, "MM / YY");
        mDisplay.put(StringKey.SCAN_GUIDE, "\uCE74\uB4DC\uB97C \uC5EC\uAE30\uC5D0 \uAC16\uB2E4 \uB300\uC138\uC694.\n\uC790\uB3D9\uC73C\uB85C \uC2A4\uCE94\uB429\uB2C8\uB2E4.");
        mDisplay.put(StringKey.KEYBOARD, "\uD0A4\uBCF4\uB4DC\u2026");
        mDisplay.put(StringKey.ENTRY_CARD_NUMBER, "\uCE74\uB4DC \uBC88\uD638");
        mDisplay.put(StringKey.MANUAL_ENTRY_TITLE, "\uCE74\uB4DC \uC138\uBD80\uC815\uBCF4");
        mDisplay.put(StringKey.ERROR_NO_DEVICE_SUPPORT, "\uAE30\uAE30\uAC00 \uCE74\uBA54\uB77C\uB97C \uC774\uC6A9\uD55C \uCE74\uB4DC \uC22B\uC790 \uD310\uB3C5\uC744 \uC9C0\uC6D0\uD558\uC9C0 \uC54A\uC2B5\uB2C8\uB2E4.");
        mDisplay.put(StringKey.ERROR_CAMERA_CONNECT_FAIL, "\uAE30\uAE30\uC5D0\uC11C \uCE74\uBA54\uB77C\uB97C \uC0AC\uC6A9\uD560 \uC218 \uC5C6\uC2B5\uB2C8\uB2E4.");
        mDisplay.put(StringKey.ERROR_CAMERA_UNEXPECTED_FAIL, "\uAE30\uAE30\uC5D0\uC11C \uCE74\uBA54\uB77C\uB97C \uC5EC\uB294 \uB3D9\uC548 \uC608\uC0C1\uCE58 \uBABB\uD55C \uC624\uB958\uAC00 \uBC1C\uC0DD\uD588\uC2B5\uB2C8\uB2E4.");
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
        return "ko";
    }

}
