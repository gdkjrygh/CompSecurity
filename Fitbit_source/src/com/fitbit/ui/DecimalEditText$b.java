// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui;

import android.text.Editable;
import android.text.TextWatcher;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;

// Referenced classes of package com.fitbit.ui:
//            DecimalEditText

public class d
    implements TextWatcher
{

    final DecimalEditText a;
    private boolean b;
    private int c;
    private int d;

    public void afterTextChanged(Editable editable)
    {
        if (b || a.g || a.h)
        {
            return;
        }
        b = true;
        char c1;
        Object obj;
        int i;
        char c3;
        c3 = a.d.getDecimalFormatSymbols().getGroupingSeparator();
        c1 = a.d.getDecimalFormatSymbols().getDecimalSeparator();
        obj = new StringBuilder(editable.length());
        i = editable.length() - 1;
        int k = -1;
_L15:
        if (i < 0) goto _L2; else goto _L1
_L1:
        char c2 = editable.charAt(i);
        if (i != d && c2 != c3) goto _L4; else goto _L3
_L3:
        if (c > i)
        {
            c = c - 1;
        }
          goto _L5
_L4:
        ((StringBuilder) (obj)).append(c2);
        int j;
        j = k;
        if (c2 == c1)
        {
            j = i;
        }
          goto _L6
_L2:
        String s = ((StringBuilder) (obj)).reverse().toString();
        if (k != -1) goto _L8; else goto _L7
_L7:
        editable = s;
          goto _L9
_L20:
        if (i + 1 >= editable.length() || editable.charAt(i) != '0') goto _L11; else goto _L10
_L10:
        if (c > i)
        {
            c = c - 1;
        }
          goto _L12
_L8:
        editable = s.substring(0, k);
          goto _L9
_L17:
        obj = String.valueOf(c1);
          goto _L13
_L19:
        s = s.substring(k + 1);
          goto _L14
_L11:
        String s1;
        editable = editable.substring(i);
        s1 = a.d.format(a.d.parse(editable));
        i = s1.length() - 1;
        j = editable.length() - 1;
_L21:
        if (i < 0 || j < 0)
        {
            break MISSING_BLOCK_LABEL_390;
        }
        if (s1.charAt(i) == editable.charAt(j))
        {
            k = j - 1;
            break MISSING_BLOCK_LABEL_565;
        }
        k = j;
        if (c <= j + 1)
        {
            break MISSING_BLOCK_LABEL_565;
        }
        c = c + 1;
        k = j;
        break MISSING_BLOCK_LABEL_565;
        editable;
        editable.printStackTrace();
        b = false;
        return;
        editable = (new StringBuilder()).append(s1).append(((String) (obj))).append(s).toString();
        a.setText(editable);
        if (c != -1 && editable.length() > 0)
        {
            a.setSelection(Math.min(c, editable.length()));
        }
        b = false;
        return;
        editable;
        a.setSelection(0);
        editable.printStackTrace();
        b = false;
        return;
        editable;
        b = false;
        throw editable;
_L5:
        j = k;
        if (k != -1)
        {
            j = k;
            if (k > i)
            {
                j = k - 1;
            }
        }
_L6:
        i--;
        k = j;
          goto _L15
_L9:
        if (k != -1) goto _L17; else goto _L16
_L16:
        obj = "";
_L13:
        if (k != -1) goto _L19; else goto _L18
_L18:
        s = "";
_L14:
        i = 0;
          goto _L20
_L12:
        i++;
          goto _L20
        i--;
        j = k;
          goto _L21
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        if (b || a.g || a.h)
        {
            return;
        }
        c = i + k;
        if (j == 1 && k == 0 && charsequence.charAt(i) == a.d.getDecimalFormatSymbols().getGroupingSeparator() && a.getSelectionStart() == i + 1)
        {
            d = i - 1;
            return;
        } else
        {
            d = -1;
            return;
        }
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public ion(DecimalEditText decimaledittext)
    {
        a = decimaledittext;
        super();
        d = -1;
    }
}
