// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.afollestad.materialdialogs;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

// Referenced classes of package com.afollestad.materialdialogs:
//            f, b

class a
    implements TextWatcher
{

    final f a;

    public void afterTextChanged(Editable editable)
    {
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        boolean flag1 = true;
        i = charsequence.toString().length();
        boolean flag;
        if (!a.b.ah)
        {
            com.afollestad.materialdialogs.internal.MDButton mdbutton;
            if (i == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            mdbutton = a.a(b.a);
            if (flag)
            {
                flag1 = false;
            }
            mdbutton.setEnabled(flag1);
        } else
        {
            flag = false;
        }
        a.a(i, flag);
        if (a.b.aj)
        {
            a.b.ag.a(a, charsequence);
        }
    }

    (f f1)
    {
        a = f1;
        super();
    }
}
