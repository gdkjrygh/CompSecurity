// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.text.Editable;
import android.text.TextWatcher;
import com.jcp.views.TypefaceEditText;

// Referenced classes of package com.jcp.fragments:
//            gt

class gu
    implements TextWatcher
{

    final gt a;

    gu(gt gt1)
    {
        a = gt1;
        super();
    }

    public void afterTextChanged(Editable editable)
    {
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        if (charsequence.length() == 5 || charsequence.length() == 10 || charsequence.length() == 15 || charsequence.length() == 20)
        {
            if (j != 1 && k != 0)
            {
                String s2 = charsequence.toString();
                String s = s2.substring(0, s2.length() - 1);
                s2 = s2.substring(s2.length() - 1);
                s = s + "-" + s2;
                gt.a(a).setText(s);
                gt.a(a).setSelection(gt.a(a).length());
            } else
            {
                String s1 = gt.a(a).getText().toString();
                gt.a(a).setText(s1.substring(0, charsequence.length() - 1));
                gt.a(a).setSelection(gt.a(a).length());
            }
        }
        if (j == 1 || k == 0) goto _L2; else goto _L1
_L1:
        if (charsequence.length() != 0)
        {
            gt.a(a, gt.a(a));
        }
_L4:
        gt.c(a);
        return;
_L2:
        if (!gt.b(a) && charsequence.length() == 0)
        {
            gt.b(a, gt.a(a));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
