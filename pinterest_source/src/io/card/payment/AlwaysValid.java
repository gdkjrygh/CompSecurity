// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import android.text.Editable;
import android.text.Spanned;

// Referenced classes of package io.card.payment:
//            Validator

class AlwaysValid
    implements Validator
{

    private String placeholder;

    public AlwaysValid()
    {
    }

    public void afterTextChanged(Editable editable)
    {
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public CharSequence filter(CharSequence charsequence, int i, int j, Spanned spanned, int k, int l)
    {
        return null;
    }

    public String getValue()
    {
        return placeholder;
    }

    public boolean hasFullLength()
    {
        return true;
    }

    public boolean isValid()
    {
        return true;
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }
}
