// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

// Referenced classes of package kik.android.chat.fragment:
//            KikRegistrationFragment

final class oz
    implements TextWatcher
{

    final KikRegistrationFragment a;

    oz(KikRegistrationFragment kikregistrationfragment)
    {
        a = kikregistrationfragment;
        super();
    }

    public final void afterTextChanged(Editable editable)
    {
        if (a._firstnameField.getText().toString().contains(" "))
        {
            a._firstnameField.setText(a._firstnameField.getText().toString().replace(" ", ""));
            a._lastnameField.requestFocus();
        }
    }

    public final void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }
}
