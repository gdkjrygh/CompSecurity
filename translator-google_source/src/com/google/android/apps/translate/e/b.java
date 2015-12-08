// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.e;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;

public final class b
    implements TextWatcher
{

    private final View a;

    public b(View view)
    {
        a = view;
    }

    public final void afterTextChanged(Editable editable)
    {
    }

    public final void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        View view = a;
        if (TextUtils.isEmpty(charsequence))
        {
            i = 4;
        } else
        {
            i = 0;
        }
        view.setVisibility(i);
    }
}
