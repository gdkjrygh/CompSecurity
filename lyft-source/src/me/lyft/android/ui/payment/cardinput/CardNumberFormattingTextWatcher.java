// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment.cardinput;

import android.text.Editable;
import android.text.TextWatcher;
import me.lyft.android.common.Strings;
import me.lyft.android.domain.payment.ICard;

public class CardNumberFormattingTextWatcher
    implements TextWatcher
{

    boolean deleting;
    boolean formatting;

    public CardNumberFormattingTextWatcher()
    {
        formatting = false;
        deleting = false;
    }

    public void afterTextChanged(Editable editable)
    {
        if (formatting) goto _L2; else goto _L1
_L1:
        String s;
        Object obj;
        s = editable.toString().replaceAll("[^0-9]", "");
        obj = new StringBuilder(s);
        if (!Strings.hasAnyPrefix(s, ICard.PREFIXES_AMERICAN_EXPRESS)) goto _L4; else goto _L3
_L3:
        byte byte0;
        byte0 = 15;
        if (s.length() > 15)
        {
            ((StringBuilder) (obj)).delete(15, s.length());
        }
        if (!deleting) goto _L6; else goto _L5
_L5:
        byte byte2;
        if (s.length() > 4)
        {
            ((StringBuilder) (obj)).insert(4, ' ');
        }
        byte2 = byte0;
        if (s.length() > 10)
        {
            ((StringBuilder) (obj)).insert(11, ' ');
            byte2 = byte0;
        }
_L8:
        obj = ((StringBuilder) (obj)).toString();
        if (!editable.toString().equals(obj))
        {
            formatting = true;
            editable.replace(0, editable.length(), ((CharSequence) (obj)));
            formatting = false;
        }
        onCardNumberChanged(editable.toString());
        if (s.length() >= byte2)
        {
            onMaxLengthReached();
        }
_L2:
        return;
_L6:
        if (s.length() > 3)
        {
            ((StringBuilder) (obj)).insert(4, ' ');
        }
        byte2 = byte0;
        if (s.length() > 9)
        {
            ((StringBuilder) (obj)).insert(11, ' ');
            byte2 = byte0;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        byte byte1;
        if (Strings.hasAnyPrefix(s, ICard.PREFIXES_DINERS_CLUB))
        {
            byte1 = 14;
        } else
        {
            byte1 = 16;
        }
        if (s.length() > byte1)
        {
            ((StringBuilder) (obj)).delete(byte1, s.length());
        }
        if (deleting)
        {
            if (s.length() > 4)
            {
                ((StringBuilder) (obj)).insert(4, ' ');
            }
            if (s.length() > 8)
            {
                ((StringBuilder) (obj)).insert(9, ' ');
            }
            byte2 = byte1;
            if (s.length() > 12)
            {
                ((StringBuilder) (obj)).insert(14, ' ');
                byte2 = byte1;
            }
        } else
        {
            if (s.length() > 3)
            {
                ((StringBuilder) (obj)).insert(4, ' ');
            }
            if (s.length() > 7)
            {
                ((StringBuilder) (obj)).insert(9, ' ');
            }
            byte2 = byte1;
            if (s.length() > 11)
            {
                ((StringBuilder) (obj)).insert(14, ' ');
                byte2 = byte1;
            }
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public boolean isDeleting()
    {
        return deleting;
    }

    public void onCardNumberChanged(String s)
    {
    }

    public void onMaxLengthReached()
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
