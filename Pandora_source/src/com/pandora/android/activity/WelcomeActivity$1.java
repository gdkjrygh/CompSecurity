// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;

// Referenced classes of package com.pandora.android.activity:
//            WelcomeActivity

class a
    implements TextWatcher
{

    final WelcomeActivity a;

    public void afterTextChanged(Editable editable)
    {
        WelcomeActivity.a(a).setEnabled(a.n());
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    (WelcomeActivity welcomeactivity)
    {
        a = welcomeactivity;
        super();
    }
}
