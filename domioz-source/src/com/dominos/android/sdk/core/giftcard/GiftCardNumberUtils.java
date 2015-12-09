// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.giftcard;

import android.text.Editable;

public class GiftCardNumberUtils
{

    private static final int NANP_STATE_DIGIT = 1;
    private static final int NANP_STATE_SPACE = 4;

    public GiftCardNumberUtils()
    {
    }

    public static void formatNumber(Editable editable)
    {
        int i;
        i = editable.length();
        break MISSING_BLOCK_LABEL_7;
_L6:
        CharSequence charsequence;
        int ai[];
        int j;
        int j1;
        int k1;
        int i2;
        do
        {
            return;
        } while (i > 23 || i <= 4);
        charsequence = editable.subSequence(0, i);
        removeSpaces(editable);
        i2 = editable.length();
        ai = new int[4];
        j1 = 0;
        j = 0;
        k1 = 1;
        i = 0;
_L2:
        int l;
        if (j1 >= i2)
        {
            break MISSING_BLOCK_LABEL_304;
        }
        switch (editable.charAt(j1))
        {
        case 33: // '!'
        case 34: // '"'
        case 35: // '#'
        case 36: // '$'
        case 37: // '%'
        case 38: // '&'
        case 39: // '\''
        case 40: // '('
        case 41: // ')'
        case 42: // '*'
        case 43: // '+'
        case 44: // ','
        case 45: // '-'
        case 46: // '.'
        case 47: // '/'
        default:
            editable.replace(0, i2, charsequence);
            return;

        case 32: // ' '
            break; /* Loop/switch isn't completed */

        case 48: // '0'
        case 49: // '1'
        case 50: // '2'
        case 51: // '3'
        case 52: // '4'
        case 53: // '5'
        case 54: // '6'
        case 55: // '7'
        case 56: // '8'
        case 57: // '9'
label0:
            {
                l = i;
                if (k1 == 4)
                {
                    break label0;
                }
                if (j != 4 && j != 8 && j != 12)
                {
                    l = i;
                    if (j != 16)
                    {
                        break label0;
                    }
                }
                ai[i] = j1;
                l = i + 1;
            }
            i = j + 1;
            j = 1;
            break;
        }
_L3:
        int l1 = j1 + 1;
        j1 = l;
        l = i;
        i = j1;
        k1 = j;
        j = l;
        j1 = l1;
        if (true) goto _L2; else goto _L1
_L1:
        byte byte0 = 4;
        l = i;
        i = j;
        j = byte0;
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
        for (int k = 0; k < i; k++)
        {
            int i1 = ai[k];
            editable.replace(i1 + k, i1 + k, " ");
        }

        i = editable.length();
        while (i > 0 && editable.charAt(i - 1) == ' ') 
        {
            editable.delete(i - 1, i);
            i--;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private static void removeSpaces(Editable editable)
    {
        for (int i = 0; i < editable.length();)
        {
            if (editable.charAt(i) == ' ')
            {
                editable.delete(i, i + 1);
            } else
            {
                i++;
            }
        }

    }
}
