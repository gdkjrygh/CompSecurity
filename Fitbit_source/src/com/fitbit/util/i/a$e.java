// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util.i;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;

// Referenced classes of package com.fitbit.util.i:
//            a

public static class b
    implements TextWatcher
{

    private final TextView a;
    private boolean b;

    public void afterTextChanged(Editable editable)
    {
        if (!b)
        {
            b = true;
            a.setText(com.fitbit.util.i.a.a(editable));
        }
        b = false;
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public w(TextView textview)
    {
        a = textview;
        b = false;
    }
}
