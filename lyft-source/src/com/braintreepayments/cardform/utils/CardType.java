// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.cardform.utils;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.braintreepayments.cardform.utils:
//            CardUtils

public final class CardType extends Enum
{

    private static final CardType $VALUES[];
    public static final CardType AMEX;
    private static final int AMEX_SPACE_INDICES[] = {
        4, 10
    };
    private static final int DEFAULT_SPACE_INDICES[] = {
        4, 8, 12
    };
    public static final CardType DINERS_CLUB;
    public static final CardType DISCOVER;
    public static final CardType JCB;
    public static final CardType MAESTRO;
    public static final CardType MASTERCARD;
    public static final CardType UNION_PAY;
    public static final CardType UNKNOWN;
    public static final CardType VISA;
    private final int mFrontResource;
    private final int mMaxCardLength;
    private final int mMinCardLength;
    private final Pattern mPattern;
    private final int mSecurityCodeLength;

    private CardType(String s, int i, String s1, int j, int k, int l, int i1)
    {
        super(s, i);
        mPattern = Pattern.compile(s1);
        mFrontResource = j;
        mMinCardLength = k;
        mMaxCardLength = l;
        mSecurityCodeLength = i1;
    }

    public static CardType forCardNumber(String s)
    {
        CardType acardtype[] = values();
        int j = acardtype.length;
        for (int i = 0; i < j; i++)
        {
            CardType cardtype = acardtype[i];
            if (cardtype.getPattern().matcher(s).matches())
            {
                return cardtype;
            }
        }

        return UNKNOWN;
    }

    public static CardType valueOf(String s)
    {
        return (CardType)Enum.valueOf(com/braintreepayments/cardform/utils/CardType, s);
    }

    public static CardType[] values()
    {
        return (CardType[])$VALUES.clone();
    }

    public int getFrontResource()
    {
        return mFrontResource;
    }

    public int getMaxCardLength()
    {
        return mMaxCardLength;
    }

    public int getMinCardLength()
    {
        return mMinCardLength;
    }

    public Pattern getPattern()
    {
        return mPattern;
    }

    public int getSecurityCodeLength()
    {
        return mSecurityCodeLength;
    }

    public int getSecurityCodeResource()
    {
        if (this == AMEX)
        {
            return com.braintreepayments.cardform.R.drawable.bt_cid_highlighted;
        } else
        {
            return com.braintreepayments.cardform.R.drawable.bt_cvv_highlighted;
        }
    }

    public int[] getSpaceIndices()
    {
        if (this == AMEX)
        {
            return AMEX_SPACE_INDICES;
        } else
        {
            return DEFAULT_SPACE_INDICES;
        }
    }

    public boolean isLegalCardLength(String s)
    {
        int i = s.length();
        return i >= mMinCardLength && i <= mMaxCardLength;
    }

    public boolean validate(String s)
    {
        int i;
        if (!TextUtils.isEmpty(s))
        {
            if ((i = s.length()) >= mMinCardLength && i <= mMaxCardLength && mPattern.matcher(s).matches())
            {
                return CardUtils.isLuhnValid(s);
            }
        }
        return false;
    }

    static 
    {
        VISA = new CardType("VISA", 0, "^4\\d*", com.braintreepayments.cardform.R.drawable.bt_visa, 16, 16, 3);
        MASTERCARD = new CardType("MASTERCARD", 1, "^5[1-5]\\d*", com.braintreepayments.cardform.R.drawable.bt_mastercard, 16, 16, 3);
        DISCOVER = new CardType("DISCOVER", 2, "^(6011|65|64[4-9]|622)\\d*", com.braintreepayments.cardform.R.drawable.bt_discover, 16, 16, 3);
        AMEX = new CardType("AMEX", 3, "^3[47]\\d*", com.braintreepayments.cardform.R.drawable.bt_amex, 15, 15, 4);
        DINERS_CLUB = new CardType("DINERS_CLUB", 4, "^(36|38|30[0-5])\\d*", com.braintreepayments.cardform.R.drawable.bt_diners, 14, 14, 3);
        JCB = new CardType("JCB", 5, "^35\\d*", com.braintreepayments.cardform.R.drawable.bt_jcb, 16, 16, 3);
        MAESTRO = new CardType("MAESTRO", 6, "^(5018|5020|5038|6304|6759|676[1-3])\\d*", com.braintreepayments.cardform.R.drawable.bt_maestro, 12, 19, 3);
        UNION_PAY = new CardType("UNION_PAY", 7, "^62\\d*", com.braintreepayments.cardform.R.drawable.bt_card_highlighted, 16, 19, 3);
        UNKNOWN = new CardType("UNKNOWN", 8, "", com.braintreepayments.cardform.R.drawable.bt_card_highlighted, 12, 19, 3);
        $VALUES = (new CardType[] {
            VISA, MASTERCARD, DISCOVER, AMEX, DINERS_CLUB, JCB, MAESTRO, UNION_PAY, UNKNOWN
        });
    }
}
