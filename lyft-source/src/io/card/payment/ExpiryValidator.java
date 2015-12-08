// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import java.util.Date;

// Referenced classes of package io.card.payment:
//            Validator, CreditCardNumber

class ExpiryValidator
    implements Validator
{

    private final String TAG;
    private boolean fullLength;
    public int month;
    public int year;

    public ExpiryValidator()
    {
        TAG = getClass().getName();
    }

    public ExpiryValidator(int i, int j)
    {
        TAG = getClass().getName();
        month = i;
        year = j;
        boolean flag;
        if (month > 0 && year > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        fullLength = flag;
        if (year < 2000)
        {
            year = year + 2000;
        }
    }

    public void afterTextChanged(Editable editable)
    {
        boolean flag;
        if (editable.length() >= 5)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        fullLength = flag;
        editable = editable.toString();
        if (editable != null)
        {
            if ((editable = CreditCardNumber.getDateForString(editable)) != null)
            {
                month = editable.getMonth() + 1;
                year = editable.getYear();
                if (year < 1900)
                {
                    year = year + 1900;
                    return;
                }
            }
        }
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        month = 0;
        year = 0;
        fullLength = false;
    }

    public CharSequence filter(CharSequence charsequence, int i, int j, Spanned spanned, int k, int l)
    {
        int i1;
label0:
        {
            charsequence = new SpannableStringBuilder(charsequence);
            if (k == 0 && charsequence.length() > 0 && '1' < charsequence.charAt(0) && charsequence.charAt(0) <= '9')
            {
                charsequence.insert(0, "0");
                j++;
            }
            int j1 = l - k;
            i1 = j;
            if (k - j1 > 2)
            {
                break label0;
            }
            i1 = j;
            if ((k + j) - j1 < 2)
            {
                break label0;
            }
            j1 = 2 - k;
            if (j1 != j)
            {
                i1 = j;
                if (j1 < 0)
                {
                    break label0;
                }
                i1 = j;
                if (j1 >= j)
                {
                    break label0;
                }
                i1 = j;
                if (charsequence.charAt(j1) == '/')
                {
                    break label0;
                }
            }
            charsequence.insert(j1, "/");
            i1 = j + 1;
        }
        spanned = (new SpannableStringBuilder(spanned)).replace(k, l, charsequence, i, i1).toString();
        if (spanned.length() >= 1 && (spanned.charAt(0) < '0' || '1' < spanned.charAt(0)))
        {
            charsequence = "";
        } else
        {
            if (spanned.length() >= 2)
            {
                if (spanned.charAt(0) != '0' && spanned.charAt(1) > '2')
                {
                    return "";
                }
                if (spanned.charAt(0) == '0' && spanned.charAt(1) == '0')
                {
                    return "";
                }
            }
            if (spanned.length() > 5)
            {
                return "";
            }
        }
        return charsequence;
    }

    public String getValue()
    {
        return String.format("%02d/%02d", new Object[] {
            Integer.valueOf(month), Integer.valueOf(year % 100)
        });
    }

    public boolean hasFullLength()
    {
        return fullLength;
    }

    public boolean isValid()
    {
        Date date;
        if (month >= 1 && 12 >= month)
        {
            if (year <= (date = new Date()).getYear() + 1900 + 15 && (year > date.getYear() + 1900 || year == date.getYear() + 1900 && month >= date.getMonth() + 1))
            {
                return true;
            }
        }
        return false;
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }
}
