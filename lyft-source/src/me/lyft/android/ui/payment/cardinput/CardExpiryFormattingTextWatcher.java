// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment.cardinput;

import android.text.Editable;
import android.text.TextWatcher;
import me.lyft.android.common.DateUtils;

public class CardExpiryFormattingTextWatcher
    implements TextWatcher
{

    boolean deleting;
    boolean formatting;

    public CardExpiryFormattingTextWatcher()
    {
        formatting = false;
        deleting = false;
    }

    public void afterTextChanged(Editable editable)
    {
        if (formatting) goto _L2; else goto _L1
_L1:
        Object obj;
        StringBuilder stringbuilder1;
        obj = editable.toString().replaceAll("[^0-9]", "");
        stringbuilder1 = new StringBuilder(((String) (obj)));
        if (((String) (obj)).length() > 4)
        {
            stringbuilder1.delete(4, ((String) (obj)).length());
        }
        if (!deleting) goto _L4; else goto _L3
_L3:
        String s2;
        StringBuilder stringbuilder2;
        stringbuilder2 = stringbuilder1;
        s2 = ((String) (obj));
        if (((String) (obj)).length() > 2)
        {
            stringbuilder1.insert(2, '/');
            s2 = ((String) (obj));
            stringbuilder2 = stringbuilder1;
        }
_L6:
        String s = stringbuilder2.toString();
        if (!editable.toString().equals(s))
        {
            formatting = true;
            editable.replace(0, editable.length(), s);
            formatting = false;
        }
        onCardExpiryChanged(editable.toString());
        if (s2.length() >= 4)
        {
            onMaxLengthReached();
        }
_L2:
        return;
_L4:
        StringBuilder stringbuilder = stringbuilder1;
        String s1 = ((String) (obj));
        if (((String) (obj)).length() == 1)
        {
            stringbuilder = stringbuilder1;
            s1 = ((String) (obj));
            if (Integer.parseInt(((String) (obj))) > 1)
            {
                s1 = (new StringBuilder()).append("0").append(((String) (obj))).toString();
                stringbuilder = new StringBuilder(s1);
            }
        }
        obj = stringbuilder;
        s2 = s1;
        if (s1.length() == 2)
        {
            obj = stringbuilder;
            s2 = s1;
            if (Integer.parseInt(s1) > 12)
            {
                s2 = s1.substring(0, s1.length() - 1);
                obj = new StringBuilder(s2);
            }
        }
        stringbuilder = ((StringBuilder) (obj));
        s1 = s2;
        if (s2.length() > 3)
        {
            int i = Integer.parseInt(s2.substring(0, 2));
            stringbuilder = ((StringBuilder) (obj));
            s1 = s2;
            if (DateUtils.hasMonthPassed(Integer.parseInt(s2.substring(2, s2.length())), i))
            {
                s1 = s2.substring(0, s2.length() - 1);
                stringbuilder = new StringBuilder(s1);
            }
        }
        stringbuilder2 = stringbuilder;
        s2 = s1;
        if (s1.length() > 1)
        {
            stringbuilder.insert(2, '/');
            stringbuilder2 = stringbuilder;
            s2 = s1;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public boolean isDeleting()
    {
        return deleting;
    }

    public void onCardExpiryChanged(String s)
    {
    }

    protected void onMaxLengthReached()
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        boolean flag;
        if (k < j)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        deleting = flag;
    }
}
