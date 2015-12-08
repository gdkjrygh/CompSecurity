// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.cash;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

// Referenced classes of package com.snapchat.android.fragments.cash:
//            SecurityCodeFragment

final class a
    implements TextWatcher
{

    private boolean a;
    private View b;

    public final void afterTextChanged(Editable editable)
    {
        if (!a)
        {
            SecurityCodeFragment.a(b);
            a = true;
        }
    }

    public final void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    (View view)
    {
        b = view;
        super();
        a = false;
    }
}
