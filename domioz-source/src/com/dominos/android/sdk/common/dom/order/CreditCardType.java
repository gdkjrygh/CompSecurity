// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common.dom.order;

import com.google.a.a.t;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class CreditCardType extends Enum
{

    private static final CreditCardType $VALUES[];
    public static final CreditCardType AMERICAN_EXPRESS;
    public static final CreditCardType CART_BLANCHE;
    public static final CreditCardType DINERS_CLUB;
    public static final CreditCardType DISCOVER;
    public static final CreditCardType ENROUTE;
    public static final CreditCardType JCB;
    public static final CreditCardType MASTERCARD;
    public static final CreditCardType OPTIMA;
    public static final CreditCardType UNKNOWN;
    public static final CreditCardType VISA;
    public static final t fromStringFn = new _cls1();
    private final int digitCount;
    private final String names[];
    private final Pattern pattern;

    private transient CreditCardType(String s, int i, int j, String s1, String as[])
    {
        super(s, i);
        names = as;
        digitCount = j;
        pattern = Pattern.compile(s1);
    }

    public static CreditCardType fromCardNumber(String s)
    {
        if (s != null)
        {
            CreditCardType acreditcardtype[] = values();
            int j = acreditcardtype.length;
            for (int i = 0; i < j; i++)
            {
                CreditCardType creditcardtype = acreditcardtype[i];
                if (creditcardtype.getPattern().matcher(s).matches())
                {
                    return creditcardtype;
                }
            }

        }
        return UNKNOWN;
    }

    public static CreditCardType fromString(String s)
    {
        CreditCardType acreditcardtype[] = values();
        int k = acreditcardtype.length;
        for (int i = 0; i < k; i++)
        {
            CreditCardType creditcardtype = acreditcardtype[i];
            String as[] = creditcardtype.names;
            int l = as.length;
            for (int j = 0; j < l; j++)
            {
                if (as[j].equalsIgnoreCase(s))
                {
                    return creditcardtype;
                }
            }

        }

        return UNKNOWN;
    }

    public static CreditCardType valueOf(String s)
    {
        return (CreditCardType)Enum.valueOf(com/dominos/android/sdk/common/dom/order/CreditCardType, s);
    }

    public static CreditCardType[] values()
    {
        return (CreditCardType[])$VALUES.clone();
    }

    public final int getDigitCount()
    {
        return digitCount;
    }

    public final String getName()
    {
        return names[0];
    }

    public final Pattern getPattern()
    {
        return pattern;
    }

    static 
    {
        AMERICAN_EXPRESS = new CreditCardType("AMERICAN_EXPRESS", 0, 15, "^3[47]\\d{13}", new String[] {
            "AMEX", "American Express"
        });
        CART_BLANCHE = new CreditCardType("CART_BLANCHE", 1, 14, "^(?:9[45]\\d|389)\\d{11}", new String[] {
            "Carte Blanche"
        });
        DINERS_CLUB = new CreditCardType("DINERS_CLUB", 2, 16, "^3(?:0[0-5]|[68][0-9])[0-9]{11}", new String[] {
            "DINERS", "Diner's Club"
        });
        DISCOVER = new CreditCardType("DISCOVER", 3, 16, "^6(?:011\\d{2}|2212[6-9]|221[3-9]\\d|22[2-8]\\d{2}|229[0-1]\\d|2292[0-5]|2[4-6]\\d{3}|28[2-8]\\d{2}|4[4-9]\\d{3}|5\\d{4})\\d{10}", new String[] {
            "DISCOVER", "Discover Card"
        });
        ENROUTE = new CreditCardType("ENROUTE", 4, 15, "^2(?:014|149)\\d{11}", new String[] {
            "ENROUTE"
        });
        JCB = new CreditCardType("JCB", 5, 16, "^35(?:2[89]|[3-8]\\d)\\d{12}", new String[] {
            "JCB"
        });
        MASTERCARD = new CreditCardType("MASTERCARD", 6, 16, "^5[1-5]\\d{14}", new String[] {
            "MASTERCARD"
        });
        OPTIMA = new CreditCardType("OPTIMA", 7, 15, "^\\d{15}", new String[] {
            "OPTIMA"
        });
        UNKNOWN = new CreditCardType("UNKNOWN", 8, 0, "^", new String[] {
            ""
        });
        VISA = new CreditCardType("VISA", 9, 16, "^4\\d{15}", new String[] {
            "VISA"
        });
        $VALUES = (new CreditCardType[] {
            AMERICAN_EXPRESS, CART_BLANCHE, DINERS_CLUB, DISCOVER, ENROUTE, JCB, MASTERCARD, OPTIMA, UNKNOWN, VISA
        });
    }

    private class _cls1
        implements t
    {

        public final CreditCardType apply(String s)
        {
            return CreditCardType.fromString(s);
        }

        public final volatile Object apply(Object obj)
        {
            return apply((String)obj);
        }

        _cls1()
        {
        }
    }

}
