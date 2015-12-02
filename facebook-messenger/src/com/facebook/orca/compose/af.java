// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.compose;

import android.text.Editable;
import android.text.TextWatcher;

// Referenced classes of package com.facebook.orca.compose:
//            ComposeFragment

class af
    implements TextWatcher
{

    final ComposeFragment a;

    af(ComposeFragment composefragment)
    {
        a = composefragment;
        super();
    }

    public void afterTextChanged(Editable editable)
    {
        ComposeFragment.a(a, 500L);
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        ComposeFragment.s(a);
        if (k > 0)
        {
            ComposeFragment.a(a, i, k);
        }
    }
}
