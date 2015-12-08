// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;

// Referenced classes of package io.card.payment:
//            Validator, StringHelper, CardType, CreditCardNumber

class CardNumberValidator
    implements Validator
{

    static final int AMEX_SPACER[] = {
        4, 11
    };
    static final int NORMAL_SPACER[] = {
        4, 9, 14
    };
    private String numberString;
    private int spacerToDelete;

    public CardNumberValidator()
    {
        spacerToDelete = 0;
    }

    public CardNumberValidator(String s)
    {
        spacerToDelete = 0;
        numberString = s;
    }

    public void afterTextChanged(Editable editable)
    {
        boolean flag = false;
        numberString = StringHelper.getDigitsOnlyString(editable.toString());
        CardType cardtype = CardType.fromCardNumber(numberString);
        int i = ((flag) ? 1 : 0);
        if (spacerToDelete > 1)
        {
            int k = spacerToDelete;
            int l = spacerToDelete - 1;
            spacerToDelete = 0;
            i = ((flag) ? 1 : 0);
            if (k > l)
            {
                editable.delete(l, k);
                i = ((flag) ? 1 : 0);
            }
        }
        while (i < editable.length()) 
        {
            char c = editable.charAt(i);
            int j;
            if (cardtype.numberLength() == 15 && (i == 4 || i == 11) || (cardtype.numberLength() == 16 || cardtype.numberLength() == 14) && (i == 4 || i == 9 || i == 14))
            {
                j = i;
                if (c != ' ')
                {
                    editable.insert(i, " ");
                    j = i;
                }
            } else
            {
                j = i;
                if (c == ' ')
                {
                    editable.delete(i, i + 1);
                    j = i - 1;
                }
            }
            i = j + 1;
        }
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public CharSequence filter(CharSequence charsequence, int i, int j, Spanned spanned, int k, int l)
    {
        String s = StringHelper.getDigitsOnlyString((new SpannableStringBuilder(spanned)).replace(k, l, charsequence, i, j).toString());
        i = CardType.fromCardNumber(s).numberLength();
        if (s.length() > i)
        {
            return "";
        }
        SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder(charsequence);
        int ai[];
        int i1;
        if (i == 15)
        {
            ai = AMEX_SPACER;
        } else
        {
            ai = NORMAL_SPACER;
        }
        i1 = l - k;
        for (i = 0; i < ai.length;)
        {
label0:
            {
                if (charsequence.length() == 0 && k == ai[i] && spanned.charAt(k) == ' ')
                {
                    spacerToDelete = ai[i];
                }
                l = j;
                if (k - i1 > ai[i])
                {
                    break label0;
                }
                l = j;
                if ((k + j) - i1 < ai[i])
                {
                    break label0;
                }
                int j1 = ai[i] - k;
                if (j1 != j)
                {
                    l = j;
                    if (j1 < 0)
                    {
                        break label0;
                    }
                    l = j;
                    if (j1 >= j)
                    {
                        break label0;
                    }
                    l = j;
                    if (spannablestringbuilder.charAt(j1) == ' ')
                    {
                        break label0;
                    }
                }
                spannablestringbuilder.insert(j1, " ");
                l = j + 1;
            }
            i++;
            j = l;
        }

        return spannablestringbuilder;
    }

    public String getValue()
    {
        return numberString;
    }

    public boolean hasFullLength()
    {
        CardType cardtype;
        if (!TextUtils.isEmpty(numberString))
        {
            if (numberString.length() == (cardtype = CardType.fromCardNumber(numberString)).numberLength())
            {
                return true;
            }
        }
        return false;
    }

    public boolean isValid()
    {
        while (!hasFullLength() || !CreditCardNumber.passesLuhnChecksum(numberString)) 
        {
            return false;
        }
        return true;
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

}
