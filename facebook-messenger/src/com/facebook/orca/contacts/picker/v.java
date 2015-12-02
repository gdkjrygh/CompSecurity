// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.picker;

import android.text.Editable;
import android.text.TextWatcher;

// Referenced classes of package com.facebook.orca.contacts.picker:
//            ContactPickerFragment, ContactAutoCompleteTextView, p, z

class v
    implements TextWatcher
{

    final ContactPickerFragment a;
    private boolean b;

    v(ContactPickerFragment contactpickerfragment)
    {
        a = contactpickerfragment;
        super();
    }

    public void afterTextChanged(Editable editable)
    {
        if (b)
        {
            ContactPickerFragment.a(a).removeTextChangedListener(this);
            ContactPickerFragment.b(a).a(editable);
            ContactPickerFragment.a(a).addTextChangedListener(this);
        }
        a.O();
        if (ContactPickerFragment.c(a) != null)
        {
            ContactPickerFragment.c(a).a(ContactPickerFragment.a(a).enoughToFilter());
        }
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        b = false;
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        if (j > k)
        {
            b = true;
            return;
        } else
        {
            b = false;
            return;
        }
    }
}
