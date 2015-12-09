// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import android.text.Editable;
import android.text.Spanned;

// Referenced classes of package io.card.payment:
//            v

class q
    implements v
{

    private String a;

    q()
    {
    }

    public boolean a()
    {
        return a != null && a.length() > 0;
    }

    public void afterTextChanged(Editable editable)
    {
        a = editable.toString().trim();
    }

    public final String b()
    {
        return a;
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public final boolean c()
    {
        return a();
    }

    public CharSequence filter(CharSequence charsequence, int i, int j, Spanned spanned, int k, int l)
    {
        return null;
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }
}
