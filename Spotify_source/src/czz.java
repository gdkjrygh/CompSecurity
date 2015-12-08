// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

final class czz
    implements TextWatcher
{

    private final View a;
    private czy b;

    public czz(czy czy1, View view)
    {
        b = czy1;
        super();
        a = view;
    }

    public final void afterTextChanged(Editable editable)
    {
        b.c(a);
    }

    public final void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }
}
