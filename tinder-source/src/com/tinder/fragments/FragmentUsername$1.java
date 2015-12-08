// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.text.Editable;
import android.text.TextWatcher;

// Referenced classes of package com.tinder.fragments:
//            FragmentUsername

final class a
    implements TextWatcher
{

    final FragmentUsername a;

    public final void afterTextChanged(Editable editable)
    {
        FragmentUsername.a(a);
    }

    public final void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    (FragmentUsername fragmentusername)
    {
        a = fragmentusername;
        super();
    }
}
