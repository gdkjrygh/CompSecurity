// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util.i;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

// Referenced classes of package com.fitbit.util.i:
//            a

public static class 
    implements TextWatcher
{

    private static final String a[] = {
        "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"
    };
    private static final String b[] = {
        "\uF639", "\uF6DC", "\uF63A", "\uF63B", "\uF63C", "\uF63D", "\uF63E", "\uF63F", "\uF640", "\uF641"
    };

    public static CharSequence a(CharSequence charsequence)
    {
        return TextUtils.replace(charsequence, a, b);
    }

    public void afterTextChanged(Editable editable)
    {
        CharSequence charsequence = a(editable);
        if (!TextUtils.equals(editable, charsequence))
        {
            editable.clear();
            editable.append(charsequence);
        }
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }


    public ()
    {
    }
}
