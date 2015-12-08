// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import java.util.Date;

// Referenced classes of package io.card.payment:
//            v, k

final class n
    implements v
{

    public int a;
    public int b;
    private boolean c;

    public n()
    {
        getClass().getName();
    }

    public n(int i, int j)
    {
        getClass().getName();
        a = i;
        b = j;
        boolean flag;
        if (a > 0 && b > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c = flag;
        if (b < 2000)
        {
            b = b + 2000;
        }
    }

    public final boolean a()
    {
        Date date;
        if (a > 0 && 12 >= a)
        {
            if (b <= (date = new Date()).getYear() + 1900 + 15 && (b > date.getYear() + 1900 || b == date.getYear() + 1900 && a >= date.getMonth() + 1))
            {
                return true;
            }
        }
        return false;
    }

    public final void afterTextChanged(Editable editable)
    {
        boolean flag;
        if (editable.length() >= 5)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c = flag;
        editable = editable.toString();
        if (editable != null)
        {
            if ((editable = k.a(editable)) != null)
            {
                a = editable.getMonth() + 1;
                b = editable.getYear();
                if (b < 1900)
                {
                    b = b + 1900;
                    return;
                }
            }
        }
    }

    public final String b()
    {
        return String.format("%02d/%02d", new Object[] {
            Integer.valueOf(a), Integer.valueOf(b % 100)
        });
    }

    public final void beforeTextChanged(CharSequence charsequence, int i, int j, int l)
    {
        a = 0;
        b = 0;
        c = false;
    }

    public final boolean c()
    {
        return c;
    }

    public final CharSequence filter(CharSequence charsequence, int i, int j, Spanned spanned, int l, int i1)
    {
        int j1;
label0:
        {
            charsequence = new SpannableStringBuilder(charsequence);
            if (l == 0 && charsequence.length() > 0 && '1' < charsequence.charAt(0) && charsequence.charAt(0) <= '9')
            {
                charsequence.insert(0, "0");
                j++;
            }
            int k1 = i1 - l;
            j1 = j;
            if (l - k1 > 2)
            {
                break label0;
            }
            j1 = j;
            if ((l + j) - k1 < 2)
            {
                break label0;
            }
            k1 = 2 - l;
            if (k1 != j)
            {
                j1 = j;
                if (k1 < 0)
                {
                    break label0;
                }
                j1 = j;
                if (k1 >= j)
                {
                    break label0;
                }
                j1 = j;
                if (charsequence.charAt(k1) == '/')
                {
                    break label0;
                }
            }
            charsequence.insert(k1, "/");
            j1 = j + 1;
        }
        spanned = (new SpannableStringBuilder(spanned)).replace(l, i1, charsequence, i, j1).toString();
        if (spanned.length() > 0 && (spanned.charAt(0) < '0' || '1' < spanned.charAt(0)))
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

    public final void onTextChanged(CharSequence charsequence, int i, int j, int l)
    {
    }
}
