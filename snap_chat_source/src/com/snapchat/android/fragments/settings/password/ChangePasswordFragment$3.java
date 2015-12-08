// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.settings.password;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

// Referenced classes of package com.snapchat.android.fragments.settings.password:
//            ChangePasswordFragment, PasswordStrength

final class a
    implements TextWatcher
{

    private ChangePasswordFragment a;

    public final void afterTextChanged(Editable editable)
    {
        a.g = PasswordStrength.UNKNOWN;
        a.d.setText("");
        ChangePasswordFragment.b(a);
        ChangePasswordFragment.c(a);
    }

    public final void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    (ChangePasswordFragment changepasswordfragment)
    {
        a = changepasswordfragment;
        super();
    }
}
