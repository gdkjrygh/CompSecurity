// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.c;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

// Referenced classes of package com.android.slyce.report.c:
//            aq

class ar
    implements TextWatcher
{

    final aq a;
    private final View b;

    public ar(aq aq1, View view)
    {
        a = aq1;
        super();
        b = view;
    }

    public void afterTextChanged(Editable editable)
    {
        a.c(b);
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }
}
