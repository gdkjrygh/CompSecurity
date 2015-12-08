// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.content.res.Resources;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

// Referenced classes of package kik.android.chat.fragment:
//            KikRegistrationFragment

final class ol
    implements TextWatcher
{

    final Resources a;
    final KikRegistrationFragment b;

    ol(KikRegistrationFragment kikregistrationfragment, Resources resources)
    {
        b = kikregistrationfragment;
        a = resources;
        super();
    }

    public final void afterTextChanged(Editable editable)
    {
        if (editable != null && editable.toString().matches(a.getString(0x7f0901ec)))
        {
            editable = KikRegistrationFragment.i(b);
        } else
        if (editable.length() > 0)
        {
            editable = KikRegistrationFragment.g(b);
        } else
        {
            editable = null;
        }
        b._passwordField.setCompoundDrawablesWithIntrinsicBounds(null, null, editable, null);
    }

    public final void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }
}
